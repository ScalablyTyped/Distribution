package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of (label, value) pairs which were dropped during aggregation,
  * attached to google.api.Distribution.Exemplars in google.api.Distribution
  * values during aggregation.These values are used in combination with the
  * label values that remain on the aggregated Distribution timeseries to
  * construct the full label set for the exemplar values. The resulting full
  * label set may be used to identify the specific task/job/instance (for
  * example) which may be contributing to a long-tail, while allowing the
  * storage savings of only storing aggregated distribution values for a large
  * group.Note that there are no guarantees on ordering of the labels from
  * exemplar-to-exemplar and from distribution-to-distribution in the same
  * stream, and there may be duplicates. It is up to clients to resolve any
  * ambiguities.
  */
@js.native
trait SchemaDroppedLabels extends StObject {
  
  /**
    * Map from label to its value, for all labels dropped in any aggregation.
    */
  var label: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaDroppedLabels {
  
  @scala.inline
  def apply(): SchemaDroppedLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDroppedLabels]
  }
  
  @scala.inline
  implicit class SchemaDroppedLabelsMutableBuilder[Self <: SchemaDroppedLabels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: StringDictionary[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}

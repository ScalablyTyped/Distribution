package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A selector that chooses target cluster for jobs based on metadata.
  */
trait SchemaClusterSelector extends StObject {
  
  /**
    * Required. The cluster labels. Cluster must have all labels to match.
    */
  var clusterLabels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Optional. The zone where workflow process executes. This parameter does
    * not affect the selection of the cluster.If unspecified, the zone of the
    * first cluster matching the selector is used.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaClusterSelector {
  
  @scala.inline
  def apply(): SchemaClusterSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterSelector]
  }
  
  @scala.inline
  implicit class SchemaClusterSelectorMutableBuilder[Self <: SchemaClusterSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterLabels(value: StringDictionary[String]): Self = StObject.set(x, "clusterLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterLabelsUndefined: Self = StObject.set(x, "clusterLabels", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}

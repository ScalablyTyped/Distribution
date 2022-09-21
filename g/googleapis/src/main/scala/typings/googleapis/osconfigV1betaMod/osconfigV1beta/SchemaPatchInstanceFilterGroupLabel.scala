package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPatchInstanceFilterGroupLabel extends StObject {
  
  /**
    * Compute Engine instance labels that must be present for a VM instance to be targeted by this filter.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaPatchInstanceFilterGroupLabel {
  
  inline def apply(): SchemaPatchInstanceFilterGroupLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPatchInstanceFilterGroupLabel]
  }
  
  extension [Self <: SchemaPatchInstanceFilterGroupLabel](x: Self) {
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}

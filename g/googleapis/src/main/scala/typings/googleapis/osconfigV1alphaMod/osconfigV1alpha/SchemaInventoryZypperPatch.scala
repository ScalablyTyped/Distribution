package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventoryZypperPatch extends StObject {
  
  /**
    * The category of the patch.
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the patch.
    */
  var patchName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The severity specified for this patch
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Any summary information provided about this patch.
    */
  var summary: js.UndefOr[String | Null] = js.undefined
}
object SchemaInventoryZypperPatch {
  
  inline def apply(): SchemaInventoryZypperPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventoryZypperPatch]
  }
  
  extension [Self <: SchemaInventoryZypperPatch](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setPatchName(value: String): Self = StObject.set(x, "patchName", value.asInstanceOf[js.Any])
    
    inline def setPatchNameNull: Self = StObject.set(x, "patchName", null)
    
    inline def setPatchNameUndefined: Self = StObject.set(x, "patchName", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}

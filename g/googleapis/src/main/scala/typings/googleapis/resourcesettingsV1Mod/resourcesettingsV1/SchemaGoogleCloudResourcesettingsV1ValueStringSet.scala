package typings.googleapis.resourcesettingsV1Mod.resourcesettingsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudResourcesettingsV1ValueStringSet extends StObject {
  
  /**
    * The strings in the set
    */
  var values: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudResourcesettingsV1ValueStringSet {
  
  inline def apply(): SchemaGoogleCloudResourcesettingsV1ValueStringSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudResourcesettingsV1ValueStringSet]
  }
  
  extension [Self <: SchemaGoogleCloudResourcesettingsV1ValueStringSet](x: Self) {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}

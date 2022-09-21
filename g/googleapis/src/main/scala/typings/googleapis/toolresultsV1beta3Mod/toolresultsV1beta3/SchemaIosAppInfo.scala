package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIosAppInfo extends StObject {
  
  /**
    * The name of the app. Required
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaIosAppInfo {
  
  inline def apply(): SchemaIosAppInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosAppInfo]
  }
  
  extension [Self <: SchemaIosAppInfo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

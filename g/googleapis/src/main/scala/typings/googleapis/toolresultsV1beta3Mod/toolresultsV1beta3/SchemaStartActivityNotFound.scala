package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStartActivityNotFound extends StObject {
  
  var action: js.UndefOr[String | Null] = js.undefined
  
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaStartActivityNotFound {
  
  inline def apply(): SchemaStartActivityNotFound = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartActivityNotFound]
  }
  
  extension [Self <: SchemaStartActivityNotFound](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}

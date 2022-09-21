package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaThirdPartyAuthenticationToken extends StObject {
  
  /**
    * Name of the third-party authentication token.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value of the third-party authentication token. This is a read-only, auto-generated field.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaThirdPartyAuthenticationToken {
  
  inline def apply(): SchemaThirdPartyAuthenticationToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThirdPartyAuthenticationToken]
  }
  
  extension [Self <: SchemaThirdPartyAuthenticationToken](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

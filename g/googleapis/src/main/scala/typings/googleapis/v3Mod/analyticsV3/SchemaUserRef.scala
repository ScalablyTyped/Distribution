package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a user reference.
  */
trait SchemaUserRef extends StObject {
  
  /**
    * Email ID of this user.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * User ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaUserRef {
  
  inline def apply(): SchemaUserRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserRef]
  }
  
  extension [Self <: SchemaUserRef](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}

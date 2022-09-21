package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaActor extends StObject {
  
  /**
    * The name to display for the actor. If not provided, it is inferred from credentials supplied during case creation. When an email is provided, a display name must also be provided. This will be obfuscated if the user is a Google Support agent.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email address of the actor. If not provided, it is inferred from credentials supplied during case creation. If the authenticated principal does not have an email address, one must be provided. When a name is provided, an email must also be provided. This will be obfuscated if the user is a Google Support agent.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether the actor is a Google support actor.
    */
  var googleSupport: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaActor {
  
  inline def apply(): SchemaActor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActor]
  }
  
  extension [Self <: SchemaActor](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setGoogleSupport(value: Boolean): Self = StObject.set(x, "googleSupport", value.asInstanceOf[js.Any])
    
    inline def setGoogleSupportNull: Self = StObject.set(x, "googleSupport", null)
    
    inline def setGoogleSupportUndefined: Self = StObject.set(x, "googleSupport", js.undefined)
  }
}

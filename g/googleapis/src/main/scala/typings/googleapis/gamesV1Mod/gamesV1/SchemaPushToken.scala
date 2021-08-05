package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a push token resource.
  */
trait SchemaPushToken extends StObject {
  
  /**
    * The revision of the client SDK used by your application, in the same
    * format that&#39;s used by revisions.check. Used to send backward
    * compatible messages. Format: [PLATFORM_TYPE]:[VERSION_NUMBER]. Possible
    * values of PLATFORM_TYPE are:   - IOS - Push token is for iOS
    */
  var clientRevision: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier for this push token.
    */
  var id: js.UndefOr[SchemaPushTokenId] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#pushToken.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The preferred language for notifications that are sent using this token.
    */
  var language: js.UndefOr[String] = js.undefined
}
object SchemaPushToken {
  
  inline def apply(): SchemaPushToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPushToken]
  }
  
  extension [Self <: SchemaPushToken](x: Self) {
    
    inline def setClientRevision(value: String): Self = StObject.set(x, "clientRevision", value.asInstanceOf[js.Any])
    
    inline def setClientRevisionUndefined: Self = StObject.set(x, "clientRevision", js.undefined)
    
    inline def setId(value: SchemaPushTokenId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}

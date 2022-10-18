package typings.hmscoreReactNativeHmsPush

import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`private`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.public
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.secret
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLocalNotificationVisibilityMod {
  
  trait Visibility extends StObject {
    
    var `private`: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`private`
    
    var public: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.public
    
    var secret: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.secret
  }
  object Visibility {
    
    inline def apply(): Visibility = {
      val __obj = js.Dynamic.literal(public = "public", secret = "secret")
      __obj.updateDynamic("private")("private")
      __obj.asInstanceOf[Visibility]
    }
    
    extension [Self <: Visibility](x: Self) {
      
      inline def setPrivate(value: `private`): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: public): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: secret): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
}

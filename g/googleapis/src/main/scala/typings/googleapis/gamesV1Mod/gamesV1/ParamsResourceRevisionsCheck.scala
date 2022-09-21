package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRevisionsCheck
  extends StObject
     with StandardParameters {
  
  /**
    * The revision of the client SDK used by your application. Format: `[PLATFORM_TYPE]:[VERSION_NUMBER]`. Possible values of `PLATFORM_TYPE` are: * `ANDROID` - Client is running the Android SDK. * `IOS` - Client is running the iOS SDK. * `WEB_APP` - Client is running as a Web App.
    */
  var clientRevision: js.UndefOr[String] = js.undefined
}
object ParamsResourceRevisionsCheck {
  
  inline def apply(): ParamsResourceRevisionsCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRevisionsCheck]
  }
  
  extension [Self <: ParamsResourceRevisionsCheck](x: Self) {
    
    inline def setClientRevision(value: String): Self = StObject.set(x, "clientRevision", value.asInstanceOf[js.Any])
    
    inline def setClientRevisionUndefined: Self = StObject.set(x, "clientRevision", js.undefined)
  }
}

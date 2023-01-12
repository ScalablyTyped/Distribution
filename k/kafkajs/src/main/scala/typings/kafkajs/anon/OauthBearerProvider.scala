package typings.kafkajs.anon

import typings.kafkajs.mod.OauthbearerProviderResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OauthBearerProvider extends StObject {
  
  def oauthBearerProvider(): js.Promise[OauthbearerProviderResponse]
}
object OauthBearerProvider {
  
  inline def apply(oauthBearerProvider: () => js.Promise[OauthbearerProviderResponse]): OauthBearerProvider = {
    val __obj = js.Dynamic.literal(oauthBearerProvider = js.Any.fromFunction0(oauthBearerProvider))
    __obj.asInstanceOf[OauthBearerProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OauthBearerProvider] (val x: Self) extends AnyVal {
    
    inline def setOauthBearerProvider(value: () => js.Promise[OauthbearerProviderResponse]): Self = StObject.set(x, "oauthBearerProvider", js.Any.fromFunction0(value))
  }
}

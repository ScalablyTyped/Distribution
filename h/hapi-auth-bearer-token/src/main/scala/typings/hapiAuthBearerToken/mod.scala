package typings.hapiAuthBearerToken

import org.scalablytyped.runtime.Shortcut
import typings.hapiAuthBearerToken.hapiAuthBearerTokenStrings.`bearer-access-token`
import typings.hapiHapi.mod.AuthCredentials
import typings.hapiHapi.mod.Plugin
import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hapi-auth-bearer-token", JSImport.Namespace)
  @js.native
  val ^ : Plugin[js.Object] = js.native
  
  @js.native
  trait SchemaOptions extends StObject {
    
    var accessTokenName: js.UndefOr[String] = js.native
    
    var allowChaining: js.UndefOr[Boolean] = js.native
    
    var allowCookieToken: js.UndefOr[Boolean] = js.native
    
    var allowMultipleHeaders: js.UndefOr[Boolean] = js.native
    
    var allowQueryToken: js.UndefOr[Boolean] = js.native
    
    var tokenType: js.UndefOr[String] = js.native
    
    var unauthorized: js.UndefOr[js.Function2[/* message */ String | Null, /* scheme */ String, _]] = js.native
    
    def validate(request: Request, token: String, h: ResponseToolkit): js.Promise[ValidateReturn] | ValidateReturn = js.native
    @JSName("validate")
    var validate_Original: Validate = js.native
  }
  
  type Validate = js.Function3[
    /* request */ Request, 
    /* token */ String, 
    /* h */ ResponseToolkit, 
    js.Promise[ValidateReturn] | ValidateReturn
  ]
  
  /* Inlined @hapi/hapi.@hapi/hapi.AuthenticationData & {  isValid :boolean} */
  @js.native
  trait ValidateReturn extends StObject {
    
    var artifacts: js.UndefOr[js.Object] = js.native
    
    var credentials: AuthCredentials = js.native
    
    var isValid: Boolean = js.native
  }
  object ValidateReturn {
    
    @scala.inline
    def apply(credentials: AuthCredentials, isValid: Boolean): ValidateReturn = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateReturn]
    }
    
    @scala.inline
    implicit class ValidateReturnMutableBuilder[Self <: ValidateReturn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtifacts(value: js.Object): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
      
      @scala.inline
      def setCredentials(value: AuthCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Plugin[js.Object]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[js.Object] = ^
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    @js.native
    trait ServerAuth extends StObject {
      
      @JSName("strategy")
      def strategy_beareraccesstoken(name: String, scheme: `bearer-access-token`, options: SchemaOptions): Unit = js.native
    }
    object ServerAuth {
      
      @scala.inline
      def apply(strategy: (String, `bearer-access-token`, SchemaOptions) => Unit): ServerAuth = {
        val __obj = js.Dynamic.literal(strategy = js.Any.fromFunction3(strategy))
        __obj.asInstanceOf[ServerAuth]
      }
      
      @scala.inline
      implicit class ServerAuthMutableBuilder[Self <: ServerAuth] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStrategy(value: (String, `bearer-access-token`, SchemaOptions) => Unit): Self = StObject.set(x, "strategy", js.Any.fromFunction3(value))
      }
    }
  }
}

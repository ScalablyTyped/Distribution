package typings.hapiAuthBearerToken

import org.scalablytyped.runtime.Shortcut
import typings.hapiAuthBearerToken.hapiAuthBearerTokenStrings.`bearer-access-token`
import typings.hapiHapi.mod.AppCredentials
import typings.hapiHapi.mod.AuthArtifacts
import typings.hapiHapi.mod.AuthCredentials
import typings.hapiHapi.mod.AuthenticationData
import typings.hapiHapi.mod.MergeType
import typings.hapiHapi.mod.Plugin
import typings.hapiHapi.mod.ReqRefDefaults
import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseToolkit
import typings.hapiHapi.mod.UserCredentials
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hapi-auth-bearer-token", JSImport.Namespace)
  @js.native
  val ^ : Plugin[js.Object] = js.native
  
  trait SchemaOptions extends StObject {
    
    var accessTokenName: js.UndefOr[String] = js.undefined
    
    var allowChaining: js.UndefOr[Boolean] = js.undefined
    
    var allowCookieToken: js.UndefOr[Boolean] = js.undefined
    
    var allowMultipleHeaders: js.UndefOr[Boolean] = js.undefined
    
    var allowQueryToken: js.UndefOr[Boolean] = js.undefined
    
    var tokenType: js.UndefOr[String] = js.undefined
    
    var unauthorized: js.UndefOr[js.Function2[/* message */ String | Null, /* scheme */ String, Any]] = js.undefined
    
    def validate(request: Request[ReqRefDefaults], token: String, h: ResponseToolkit[ReqRefDefaults]): js.Promise[ValidateReturn] | ValidateReturn
    @JSName("validate")
    var validate_Original: Validate
  }
  object SchemaOptions {
    
    inline def apply(
      validate: (/* request */ Request[ReqRefDefaults], /* token */ String, /* h */ ResponseToolkit[ReqRefDefaults]) => js.Promise[ValidateReturn] | ValidateReturn
    ): SchemaOptions = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction3(validate))
      __obj.asInstanceOf[SchemaOptions]
    }
    
    extension [Self <: SchemaOptions](x: Self) {
      
      inline def setAccessTokenName(value: String): Self = StObject.set(x, "accessTokenName", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenNameUndefined: Self = StObject.set(x, "accessTokenName", js.undefined)
      
      inline def setAllowChaining(value: Boolean): Self = StObject.set(x, "allowChaining", value.asInstanceOf[js.Any])
      
      inline def setAllowChainingUndefined: Self = StObject.set(x, "allowChaining", js.undefined)
      
      inline def setAllowCookieToken(value: Boolean): Self = StObject.set(x, "allowCookieToken", value.asInstanceOf[js.Any])
      
      inline def setAllowCookieTokenUndefined: Self = StObject.set(x, "allowCookieToken", js.undefined)
      
      inline def setAllowMultipleHeaders(value: Boolean): Self = StObject.set(x, "allowMultipleHeaders", value.asInstanceOf[js.Any])
      
      inline def setAllowMultipleHeadersUndefined: Self = StObject.set(x, "allowMultipleHeaders", js.undefined)
      
      inline def setAllowQueryToken(value: Boolean): Self = StObject.set(x, "allowQueryToken", value.asInstanceOf[js.Any])
      
      inline def setAllowQueryTokenUndefined: Self = StObject.set(x, "allowQueryToken", js.undefined)
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
      
      inline def setUnauthorized(value: (/* message */ String | Null, /* scheme */ String) => Any): Self = StObject.set(x, "unauthorized", js.Any.fromFunction2(value))
      
      inline def setUnauthorizedUndefined: Self = StObject.set(x, "unauthorized", js.undefined)
      
      inline def setValidate(
        value: (/* request */ Request[ReqRefDefaults], /* token */ String, /* h */ ResponseToolkit[ReqRefDefaults]) => js.Promise[ValidateReturn] | ValidateReturn
      ): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
    }
  }
  
  type Validate = js.Function3[
    /* request */ Request[ReqRefDefaults], 
    /* token */ String, 
    /* h */ ResponseToolkit[ReqRefDefaults], 
    js.Promise[ValidateReturn] | ValidateReturn
  ]
  
  trait ValidateReturn
    extends StObject
       with AuthenticationData[UserCredentials, AppCredentials, Record[String, Any], AuthArtifacts] {
    
    var isValid: Boolean
  }
  object ValidateReturn {
    
    inline def apply(
      credentials: MergeType[Record[String, Any], AuthCredentials[UserCredentials, AppCredentials]],
      isValid: Boolean
    ): ValidateReturn = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateReturn]
    }
    
    extension [Self <: ValidateReturn](x: Self) {
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Plugin[js.Object]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[js.Object] = ^
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    trait ServerAuth extends StObject {
      
      @JSName("strategy")
      def strategy_beareraccesstoken(name: String, scheme: `bearer-access-token`, options: SchemaOptions): Unit
    }
    object ServerAuth {
      
      inline def apply(strategy: (String, `bearer-access-token`, SchemaOptions) => Unit): ServerAuth = {
        val __obj = js.Dynamic.literal(strategy = js.Any.fromFunction3(strategy))
        __obj.asInstanceOf[ServerAuth]
      }
      
      extension [Self <: ServerAuth](x: Self) {
        
        inline def setStrategy(value: (String, `bearer-access-token`, SchemaOptions) => Unit): Self = StObject.set(x, "strategy", js.Any.fromFunction3(value))
      }
    }
  }
}

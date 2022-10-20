package typings.hapiAuthJwt2

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.hapiAuthJwt2.anon.Credentials
import typings.hapiAuthJwt2.hapiAuthJwt2Strings.jwt
import typings.hapiHapi.mod.Plugin
import typings.hapiHapi.mod.ReqRefDefaults
import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import typings.jsonwebtoken.mod.VerifyOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hapi-auth-jwt2", JSImport.Namespace)
  @js.native
  val ^ : Plugin[RegisterOptions] = js.native
  
  trait ErrorContext extends StObject {
    
    /**
      * attributes passed into the Boom method call
      */
    var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Boom method to call (eg. unauthorized)
      */
    var errorType: String
    
    /**
      * message passed into the Boom method call
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * schema passed into the Boom method call
      */
    var schema: String
  }
  object ErrorContext {
    
    inline def apply(errorType: String, schema: String): ErrorContext = {
      val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorContext]
    }
    
    extension [Self <: ErrorContext](x: Self) {
      
      inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtraInfo extends StObject
  
  /**
    * Options passed to `hapi.auth.strategy` when this plugin is used
    */
  trait Options extends StObject {
    
    /**
      * Set to `true` to allow the `payloadFunc` to attempt to extract the token from
      * POST bodies
      * @default false
      */
    var attemptToExtractTokenInPayload: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` to receive the complete token (`decoded.header`,
      * `decoded.payload` and `decoded.signature`) as decoded argument to key
      * lookup and `verifyFunc` callbacks (*not `validateFunc`*)
      * @default false
      */
    var complete: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you prefer to set your own cookie key or your project has a cookie
      * called 'token' for another purpose, you can set a custom key for your
      * cookie by setting `options.cookieKey='yourkeyhere'`. To disable cookies
      * set cookieKey to `false` or ''.
      * @default 'token'
      */
    var cookieKey: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * Custom token extraction function used to allow consumers to pull tokens from
      * sources not foreseen by the module, for example... YAR
      * @default false
      */
    var customExtractionFunc: js.UndefOr[js.Function1[/* request */ Request[ReqRefDefaults], String]] = js.undefined
    
    /**
      *
      * @param ctx called when an error has been raised.
      * @param request the Request object.
      * @param h the ResponseToolkit object.
      * It provides an extension point to allow the host the ability to customise the error messages returned.
      */
    var errorFunc: js.UndefOr[
        js.Function3[
          /* ctx */ ErrorContext, 
          /* request */ Request[ReqRefDefaults], 
          /* h */ ResponseToolkit[ReqRefDefaults], 
          ErrorContext
        ]
      ] = js.undefined
    
    /**
      * If you want to set a custom key for your header token use the
      * `headerKey` option. To disable header token set headerKey to `false` or
      * ''.
      * @default 'authorization'
      */
    var headerKey: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * The secret key used to check the signature of the token *or* a *key lookup function*
      */
    var key: js.UndefOr[
        String | js.Array[String] | Buffer | (js.Function1[/* decodedToken */ Any, js.Promise[typings.hapiAuthJwt2.anon.ExtraInfo]])
      ] = js.undefined
    
    /**
      * If you want to set a custom key for your payload token use the
      * `payloadKey` option. To disable payload token set payloadKey to `false` or
      * ''.
      * @default 'token'
      */
    var payloadKey: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * function called to decorate the response with authentication headers
      * before the response headers or payload is written
      *
      * @param request the Request object
      * @param reply is called if an error occurred
      */
    var responseFunc: js.UndefOr[
        js.Function2[
          /* request */ Request[ReqRefDefaults], 
          /* reply */ js.Function2[/* err */ Any, /* response */ ResponseObject, Unit], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Allow custom token type, e.g. `Authorization: <tokenType> 12345678`
      */
    var tokenType: js.UndefOr[String] = js.undefined
    
    /**
      * If you prefer to pass your token via url, simply add a token url
      * parameter to your request or use a custom parameter by setting `urlKey.
      * To disable the url parameter set urlKey to `false` or ''.
      * @default 'token'
      */
    var urlKey: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * The function which is run once the Token has been decoded
      *
      * @param decoded the *decoded* and *verified* JWT received from the client in *request.headers.authorization*
      * @param request the original *request* received from the client
      */
    def validate(decoded: js.Object, request: Request[ReqRefDefaults], tk: ResponseToolkit[ReqRefDefaults]): ValidationResult | js.Promise[ValidationResult]
    
    /**
      * Settings to define how tokens are verified by the jsonwebtoken library
      */
    var verifyOptions: js.UndefOr[VerifyOptions] = js.undefined
  }
  object Options {
    
    inline def apply(
      validate: (js.Object, Request[ReqRefDefaults], ResponseToolkit[ReqRefDefaults]) => ValidationResult | js.Promise[ValidationResult]
    ): Options = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction3(validate))
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttemptToExtractTokenInPayload(value: Boolean): Self = StObject.set(x, "attemptToExtractTokenInPayload", value.asInstanceOf[js.Any])
      
      inline def setAttemptToExtractTokenInPayloadUndefined: Self = StObject.set(x, "attemptToExtractTokenInPayload", js.undefined)
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setCookieKey(value: String | Boolean): Self = StObject.set(x, "cookieKey", value.asInstanceOf[js.Any])
      
      inline def setCookieKeyUndefined: Self = StObject.set(x, "cookieKey", js.undefined)
      
      inline def setCustomExtractionFunc(value: /* request */ Request[ReqRefDefaults] => String): Self = StObject.set(x, "customExtractionFunc", js.Any.fromFunction1(value))
      
      inline def setCustomExtractionFuncUndefined: Self = StObject.set(x, "customExtractionFunc", js.undefined)
      
      inline def setErrorFunc(
        value: (/* ctx */ ErrorContext, /* request */ Request[ReqRefDefaults], /* h */ ResponseToolkit[ReqRefDefaults]) => ErrorContext
      ): Self = StObject.set(x, "errorFunc", js.Any.fromFunction3(value))
      
      inline def setErrorFuncUndefined: Self = StObject.set(x, "errorFunc", js.undefined)
      
      inline def setHeaderKey(value: String | Boolean): Self = StObject.set(x, "headerKey", value.asInstanceOf[js.Any])
      
      inline def setHeaderKeyUndefined: Self = StObject.set(x, "headerKey", js.undefined)
      
      inline def setKey(
        value: String | js.Array[String] | Buffer | (js.Function1[/* decodedToken */ Any, js.Promise[typings.hapiAuthJwt2.anon.ExtraInfo]])
      ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyFunction1(value: /* decodedToken */ Any => js.Promise[typings.hapiAuthJwt2.anon.ExtraInfo]): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: String*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setPayloadKey(value: String | Boolean): Self = StObject.set(x, "payloadKey", value.asInstanceOf[js.Any])
      
      inline def setPayloadKeyUndefined: Self = StObject.set(x, "payloadKey", js.undefined)
      
      inline def setResponseFunc(
        value: (/* request */ Request[ReqRefDefaults], /* reply */ js.Function2[/* err */ Any, /* response */ ResponseObject, Unit]) => Unit
      ): Self = StObject.set(x, "responseFunc", js.Any.fromFunction2(value))
      
      inline def setResponseFuncUndefined: Self = StObject.set(x, "responseFunc", js.undefined)
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
      
      inline def setUrlKey(value: String | Boolean): Self = StObject.set(x, "urlKey", value.asInstanceOf[js.Any])
      
      inline def setUrlKeyUndefined: Self = StObject.set(x, "urlKey", js.undefined)
      
      inline def setValidate(
        value: (js.Object, Request[ReqRefDefaults], ResponseToolkit[ReqRefDefaults]) => ValidationResult | js.Promise[ValidationResult]
      ): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
      
      inline def setVerifyOptions(value: VerifyOptions): Self = StObject.set(x, "verifyOptions", value.asInstanceOf[js.Any])
      
      inline def setVerifyOptionsUndefined: Self = StObject.set(x, "verifyOptions", js.undefined)
    }
  }
  
  trait RegisterOptions extends StObject {
    
    /**
      * function which is run once the Token has been decoded (instead of a validate) with signature async function(decoded, request) where:
      */
    var verify: js.UndefOr[
        js.Function2[/* decoded */ Any, /* request */ Request[ReqRefDefaults], js.Promise[Credentials]]
      ] = js.undefined
  }
  object RegisterOptions {
    
    inline def apply(): RegisterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterOptions]
    }
    
    extension [Self <: RegisterOptions](x: Self) {
      
      inline def setVerify(value: (/* decoded */ Any, /* request */ Request[ReqRefDefaults]) => js.Promise[Credentials]): Self = StObject.set(x, "verify", js.Any.fromFunction2(value))
      
      inline def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
    }
  }
  
  trait ValidationResult extends StObject {
    
    var credentials: js.UndefOr[Any] = js.undefined
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var isValid: Boolean
    
    var response: js.UndefOr[ResponseObject] = js.undefined
  }
  object ValidationResult {
    
    inline def apply(isValid: Boolean): ValidationResult = {
      val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationResult]
    }
    
    extension [Self <: ValidationResult](x: Self) {
      
      inline def setCredentials(value: Any): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: ResponseObject): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  type _To = Plugin[RegisterOptions]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[RegisterOptions] = ^
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    @js.native
    trait ServerAuth extends StObject {
      
      @JSName("strategy")
      def strategy_jwt(name: String, scheme: jwt): Unit = js.native
      @JSName("strategy")
      def strategy_jwt(name: String, scheme: jwt, options: Options): Unit = js.native
    }
  }
}

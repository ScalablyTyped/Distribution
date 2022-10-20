package typings.hapiJwt.mod.hapiJwt

import typings.hapiHapi.mod.ReqRefDefaults
import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseToolkit
import typings.hapiJwt.hapiJwtBooleans.`false`
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * String the represents the Authentication Scheme. Default is 'Bearer'.
    */
  var httpAuthScheme: js.UndefOr[String] = js.undefined
  
  /**
    * The key method to be used for jwt verification.
    */
  var keys: String | (js.Array[Key | NoAlgorithm | String]) | Buffer | Key | (js.Function1[/* param */ Any, String])
  
  /**
    * String passed directly to Boom.unauthorized if no custom err is thrown. Defaults to undefined.
    */
  var unauthorizedAttributes: js.UndefOr[String] = js.undefined
  
  /**
    * Function that allows additional validation based on the decoded payload and to put specific credentials in the request object. Can be set to false if no additional validation is needed.
    *
    * @param artifacts an object that contains information from the token.
    * @param request the hapi request object of the request which is being authenticated.
    * @param h the response toolkit.
    */
  var validate: (js.Function3[
    /* artifacts */ Artifacts, 
    /* request */ Request[ReqRefDefaults], 
    /* h */ ResponseToolkit[ReqRefDefaults], 
    js.Promise[ValidationResult] | scala.Nothing
  ]) | `false`
  
  /**
    * Object to determine how key contents are verified beyond key signature. Set to false to do no verification.
    */
  var verify: VerifyKeyOptions | `false`
}
object Options {
  
  inline def apply(
    keys: String | (js.Array[Key | NoAlgorithm | String]) | Buffer | Key | (js.Function1[/* param */ Any, String]),
    validate: (js.Function3[
      /* artifacts */ Artifacts, 
      /* request */ Request[ReqRefDefaults], 
      /* h */ ResponseToolkit[ReqRefDefaults], 
      js.Promise[ValidationResult] | scala.Nothing
    ]) | `false`,
    verify: VerifyKeyOptions | `false`
  ): Options = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any], verify = verify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setHttpAuthScheme(value: String): Self = StObject.set(x, "httpAuthScheme", value.asInstanceOf[js.Any])
    
    inline def setHttpAuthSchemeUndefined: Self = StObject.set(x, "httpAuthScheme", js.undefined)
    
    inline def setKeys(
      value: String | (js.Array[Key | NoAlgorithm | String]) | Buffer | Key | (js.Function1[/* param */ Any, String])
    ): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysFunction1(value: /* param */ Any => String): Self = StObject.set(x, "keys", js.Any.fromFunction1(value))
    
    inline def setKeysVarargs(value: (Key | NoAlgorithm | String)*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setUnauthorizedAttributes(value: String): Self = StObject.set(x, "unauthorizedAttributes", value.asInstanceOf[js.Any])
    
    inline def setUnauthorizedAttributesUndefined: Self = StObject.set(x, "unauthorizedAttributes", js.undefined)
    
    inline def setValidate(
      value: (js.Function3[
          /* artifacts */ Artifacts, 
          /* request */ Request[ReqRefDefaults], 
          /* h */ ResponseToolkit[ReqRefDefaults], 
          js.Promise[ValidationResult] | scala.Nothing
        ]) | `false`
    ): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateFunction3(
      value: (/* artifacts */ Artifacts, /* request */ Request[ReqRefDefaults], /* h */ ResponseToolkit[ReqRefDefaults]) => js.Promise[ValidationResult] | scala.Nothing
    ): Self = StObject.set(x, "validate", js.Any.fromFunction3(value))
    
    inline def setVerify(value: VerifyKeyOptions | `false`): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
  }
}

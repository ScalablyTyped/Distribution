package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthAuthenticatorsAuthenticatorInterfaceMod.AuthenticateOptions
import typings.ibmCloudSdkCore.esAuthAuthenticatorsAuthenticatorInterfaceMod.AuthenticatorInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthAuthenticatorsAuthenticatorMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/authenticator", "Authenticator")
  @js.native
  /**
    * Create a new Authenticator instance.
    *
    * @throws {Error} The `new` keyword was not used to create construct the
    *   authenticator.
    */
  open class Authenticator ()
    extends StObject
       with AuthenticatorInterface {
    
    /**
      * Add authentication information to the specified request.
      *
      * @param {object} requestOptions The request to augment with authentication information.
      * @param {object.<string, string>} requestOptions.headers The headers the
      *   authentication information will be added to.
      */
    /* CompleteClass */
    override def authenticate(requestOptions: AuthenticateOptions): js.Promise[Unit] = js.native
    
    /**
      * Returns a string that indicates the authentication type.
      */
    /* CompleteClass */
    override def authenticationType(): String = js.native
  }
  /* static members */
  object Authenticator {
    
    @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/authenticator", "Authenticator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constants that define the various authenticator types.
      */
    @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/authenticator", "Authenticator.AUTHTYPE_BASIC")
    @js.native
    def AUTHTYPE_BASIC: String = js.native
    inline def AUTHTYPE_BASIC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_BASIC")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/authenticator", "Authenticator.AUTHTYPE_BEARERTOKEN")
    @js.native
    def AUTHTYPE_BEARERTOKEN: String = js.native
    inline def AUTHTYPE_BEARERTOKEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_BEARERTOKEN")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/authenticator", "Authenticator.AUTHTYPE_CONTAINER")
    @js.native
    def AUTHTYPE_CONTAINER: String = js.native
    inline def AUTHTYPE_CONTAINER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_CONTAINER")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/authenticator", "Authenticator.AUTHTYPE_CP4D")
    @js.native
    def AUTHTYPE_CP4D: String = js.native
    inline def AUTHTYPE_CP4D_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_CP4D")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/authenticator", "Authenticator.AUTHTYPE_IAM")
    @js.native
    def AUTHTYPE_IAM: String = js.native
    inline def AUTHTYPE_IAM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_IAM")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/authenticator", "Authenticator.AUTHTYPE_NOAUTH")
    @js.native
    def AUTHTYPE_NOAUTH: String = js.native
    inline def AUTHTYPE_NOAUTH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_NOAUTH")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/authenticator", "Authenticator.AUTHTYPE_UNKNOWN")
    @js.native
    def AUTHTYPE_UNKNOWN: String = js.native
    inline def AUTHTYPE_UNKNOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/authenticator", "Authenticator.AUTHTYPE_VPC")
    @js.native
    def AUTHTYPE_VPC: String = js.native
    inline def AUTHTYPE_VPC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_VPC")(x.asInstanceOf[js.Any])
  }
}

package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthAuthenticatorsIamRequestBasedAuthenticatorMod.IamRequestBasedAuthenticator
import typings.ibmCloudSdkCore.esAuthAuthenticatorsIamRequestBasedAuthenticatorMod.IamRequestOptions
import typings.ibmCloudSdkCore.esAuthTokenManagersMod.ContainerTokenManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthAuthenticatorsContainerAuthenticatorMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/authenticators/container-authenticator", "ContainerAuthenticator")
  @js.native
  open class ContainerAuthenticator protected () extends IamRequestBasedAuthenticator {
    /**
      *
      * Create a new [[ContainerAuthenticator]] instance.
      *
      * @param {object} options Configuration options for IAM authentication.
      * @param {string} [options.crTokenFilename] The file containing the compute resource token.
      * @param {string} [options.iamProfileName] The IAM profile name associated with the compute resource token.
      * @param {string} [options.iamProfileId] The IAM profile ID associated with the compute resource token.
      * @param {boolean} [options.disableSslVerification] A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not
      * @param {string} [options.url] for HTTP token requests.
      * @param {object<string, string>} options.headers to be sent with every
      * @param {string} [options.clientId] The `clientId` and `clientSecret` fields are used to form a "basic"
      *   authorization header for IAM token requests.
      * @param {string} [options.clientSecret] The `clientId` and `clientSecret` fields are used to form a "basic"
      *   authorization header for IAM token requests.
      * @param {string} [options.scope] The "scope" parameter to use when fetching the bearer token from the
      *   IAM token server.
      * @throws {Error} When the configuration options are not valid.
      */
    def this(options: Options) = this()
    
    /* private */ var crTokenFilename: Any = js.native
    
    /* private */ var iamProfileId: Any = js.native
    
    /* private */ var iamProfileName: Any = js.native
    
    /**
      * Setter for the filename of the compute resource token.
      * @param {string} A string containing a path to the CR token file
      */
    def setCrTokenFilename(crTokenFilename: String): Unit = js.native
    
    /**
      * Setter for the "profile_id" parameter to use when fetching the bearer token from the IAM token server.
      * @param {string} A string that makes up the iamProfileId parameter
      */
    def setIamProfileId(iamProfileId: String): Unit = js.native
    
    /**
      * Setter for the "profile_name" parameter to use when fetching the bearer token from the IAM token server.
      * @param {string} A string that makes up the iamProfileName parameter
      */
    def setIamProfileName(iamProfileName: String): Unit = js.native
    
    /* protected */ @JSName("tokenManager")
    var tokenManager_ContainerAuthenticator: ContainerTokenManager = js.native
  }
  
  trait Options
    extends StObject
       with IamRequestOptions {
    
    /** The file containing the compute resource token. */
    var crTokenFilename: js.UndefOr[String] = js.undefined
    
    /** The IAM profile ID associated with the compute resource token. */
    var iamProfileId: js.UndefOr[String] = js.undefined
    
    /** The IAM profile name associated with the compute resource token. */
    var iamProfileName: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCrTokenFilename(value: String): Self = StObject.set(x, "crTokenFilename", value.asInstanceOf[js.Any])
      
      inline def setCrTokenFilenameUndefined: Self = StObject.set(x, "crTokenFilename", js.undefined)
      
      inline def setIamProfileId(value: String): Self = StObject.set(x, "iamProfileId", value.asInstanceOf[js.Any])
      
      inline def setIamProfileIdUndefined: Self = StObject.set(x, "iamProfileId", js.undefined)
      
      inline def setIamProfileName(value: String): Self = StObject.set(x, "iamProfileName", value.asInstanceOf[js.Any])
      
      inline def setIamProfileNameUndefined: Self = StObject.set(x, "iamProfileName", js.undefined)
    }
  }
}

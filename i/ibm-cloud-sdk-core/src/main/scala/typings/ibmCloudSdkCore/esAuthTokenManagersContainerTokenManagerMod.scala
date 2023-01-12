package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthTokenManagersIamRequestBasedTokenManagerMod.IamRequestBasedTokenManager
import typings.ibmCloudSdkCore.esAuthTokenManagersIamRequestBasedTokenManagerMod.IamRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthTokenManagersContainerTokenManagerMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/token-managers/container-token-manager", "ContainerTokenManager")
  @js.native
  open class ContainerTokenManager protected () extends IamRequestBasedTokenManager {
    /**
      *
      * Create a new [[ContainerTokenManager]] instance.
      *
      * @param {object} options Configuration options.
      * @param {string} [crTokenFilename='/var/run/secrets/tokens/vault-token'] The file containing the compute resource token.
      * @param {string} [iamProfileName] The IAM profile name associated with the compute resource token.
      * @param {string} [iamProfileId] The IAM profile ID associated with the compute resource token.
      * @param {string} [options.clientId] The `clientId` and `clientSecret` fields are used to form a "basic"
      *   authorization header for IAM token requests.
      * @param {string} [options.clientSecret] The `clientId` and `clientSecret` fields are used to form a "basic"
      *   authorization header for IAM token requests.
      * @param {string} [url='https://iam.cloud.ibm.com'] The IAM endpoint for token requests.
      * @param {boolean} [options.disableSslVerification] A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not.
      * @param {object<string, string>} [options.headers] Headers to be sent with every
      *   outbound HTTP requests to token services.
      * @constructor
      */
    def this(options: Options) = this()
    
    /* private */ var crTokenFilename: Any = js.native
    
    /* private */ var iamProfileId: Any = js.native
    
    /* private */ var iamProfileName: Any = js.native
    
    /**
      * Setter for the filename of the compute resource token.
      * @param {string} crTokenFilename A string containing a path to the CR token file
      */
    def setCrTokenFilename(crTokenFilename: String): Unit = js.native
    
    /**
      * Setter for the "profile_id" parameter to use when fetching the bearer token from the IAM token server.
      * @param {string} iamProfileId A string that makes up the iamProfileId parameter
      */
    def setIamProfileId(iamProfileId: String): Unit = js.native
    
    /**
      * Setter for the "profile_name" parameter to use when fetching the bearer token from the IAM token server.
      * @param {string} iamProfileName A string that makes up the iamProfileName parameter
      */
    def setIamProfileName(iamProfileName: String): Unit = js.native
  }
  
  /** Configuration options for IAM token retrieval. */
  trait Options
    extends StObject
       with IamRequestOptions {
    
    var crTokenFilename: js.UndefOr[String] = js.undefined
    
    var iamProfileId: js.UndefOr[String] = js.undefined
    
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

package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthTokenManagersContainerTokenManagerMod.Options
import typings.ibmCloudSdkCore.esAuthTokenManagersIamRequestBasedTokenManagerMod.IamRequestOptions
import typings.ibmCloudSdkCore.esAuthTokenManagersJwtTokenManagerMod.JwtTokenManagerOptions
import typings.ibmCloudSdkCore.esAuthTokenManagersTokenManagerMod.TokenManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthTokenManagersMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth/token-managers", "ContainerTokenManager")
  @js.native
  open class ContainerTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthTokenManagersContainerTokenManagerMod.ContainerTokenManager {
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
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth/token-managers", "Cp4dTokenManager")
  @js.native
  open class Cp4dTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthTokenManagersCp4dTokenManagerMod.Cp4dTokenManager {
    /**
      * Create a new [[Cp4dTokenManager]] instance.
      *
      * @param {object} options Configuration options.
      * @param {string} options.username The username used to obtain a bearer token.
      * @param {string} options.password The password used to obtain a bearer token [required if apikey not specified].
      * @param {string} options.apikey The API key used to obtain a bearer token [required if password not specified].
      * @param {string} options.url The endpoint for CP4D token requests.
      * @param {boolean} [options.disableSslVerification] A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not.
      * @param {object<string, string>} [options.headers] Headers to be sent with every
      *   outbound HTTP requests to token services.
      * @constructor
      */
    def this(options: typings.ibmCloudSdkCore.esAuthTokenManagersCp4dTokenManagerMod.Options) = this()
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth/token-managers", "IamRequestBasedTokenManager")
  @js.native
  open class IamRequestBasedTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthTokenManagersIamRequestBasedTokenManagerMod.IamRequestBasedTokenManager {
    /**
      *
      * Create a new [[IamRequestBasedTokenManager]] instance.
      *
      * @param {object} options Configuration options.
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
    def this(options: IamRequestOptions) = this()
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth/token-managers", "IamTokenManager")
  @js.native
  open class IamTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthTokenManagersIamTokenManagerMod.IamTokenManager {
    /**
      *
      * Create a new [[IamTokenManager]] instance.
      *
      * @param {object} options Configuration options.
      * @param {string} options.apikey The IAM api key.
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
    def this(options: typings.ibmCloudSdkCore.esAuthTokenManagersIamTokenManagerMod.Options) = this()
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth/token-managers", "JwtTokenManager")
  @js.native
  open class JwtTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthTokenManagersJwtTokenManagerMod.JwtTokenManager {
    /**
      * Create a new [[JwtTokenManager]] instance.
      * @constructor
      * @param {object} options Configuration options.
      * @param {string} options.url for HTTP token requests.
      * @param {boolean} [options.disableSslVerification] A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not.
      * @param {object<string, string>} [options.headers] Headers to be sent with every
      *   outbound HTTP requests to token services.
      */
    def this(options: JwtTokenManagerOptions) = this()
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth/token-managers", "TokenManager")
  @js.native
  open class TokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthTokenManagersTokenManagerMod.TokenManager {
    /**
      * Create a new [[TokenManager]] instance.
      * @constructor
      * @param {object} options Configuration options.
      * @param {string} options.url for HTTP token requests.
      * @param {boolean} [options.disableSslVerification] A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not.
      * @param {object<string, string>} [options.headers] Headers to be sent with every
      *   outbound HTTP requests to token services.
      */
    def this(options: TokenManagerOptions) = this()
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth/token-managers", "VpcInstanceTokenManager")
  @js.native
  open class VpcInstanceTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthTokenManagersVpcInstanceTokenManagerMod.VpcInstanceTokenManager {
    /**
      * Create a new [[VpcInstanceTokenManager]] instance.
      *
      * @param {object} [options] Configuration options.
      * @param {string} [options.iamProfileCrn] The CRN of the linked trusted IAM profile to be used as the identity of the compute resource.
      *    At most one of iamProfileCrn or iamProfileId may be specified.
      *    If neither one is specified, then the default IAM profile defined for the compute resource will be used.
      * @param {string} [options.iamProfileId] The ID of the linked trusted IAM profile to be used when obtaining the IAM access token.
      *    At most one of iamProfileCrn or iamProfileId may be specified.
      *    If neither one is specified, then the default IAM profile defined for the compute resource will be used.
      * @param {string} [options.url] The VPC Instance Metadata Service's base endpoint URL. Default value: "http://169.254.169.254"
      * @constructor
      */
    def this(options: typings.ibmCloudSdkCore.esAuthTokenManagersVpcInstanceTokenManagerMod.Options) = this()
  }
}

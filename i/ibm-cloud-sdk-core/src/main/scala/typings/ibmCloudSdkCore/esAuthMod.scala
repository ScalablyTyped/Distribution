package typings.ibmCloudSdkCore

import typings.ibmCloudSdkCore.esAuthAuthenticatorsBasicAuthenticatorMod.Options
import typings.ibmCloudSdkCore.esAuthAuthenticatorsIamRequestBasedAuthenticatorMod.IamRequestOptions
import typings.ibmCloudSdkCore.esAuthAuthenticatorsTokenRequestBasedAuthenticatorMod.BaseOptions
import typings.ibmCloudSdkCore.esAuthTokenManagersJwtTokenManagerMod.JwtTokenManagerOptions
import typings.ibmCloudSdkCore.esAuthTokenManagersTokenManagerMod.TokenManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthMod {
  
  @JSImport("ibm-cloud-sdk-core/es/auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "Authenticator")
  @js.native
  /**
    * Create a new Authenticator instance.
    *
    * @throws {Error} The `new` keyword was not used to create construct the
    *   authenticator.
    */
  open class Authenticator ()
    extends typings.ibmCloudSdkCore.esAuthAuthenticatorsMod.Authenticator
  /* static members */
  object Authenticator {
    
    @JSImport("ibm-cloud-sdk-core/es/auth", "Authenticator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constants that define the various authenticator types.
      */
    @JSImport("ibm-cloud-sdk-core/es/auth", "Authenticator.AUTHTYPE_BASIC")
    @js.native
    def AUTHTYPE_BASIC: String = js.native
    inline def AUTHTYPE_BASIC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_BASIC")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/auth", "Authenticator.AUTHTYPE_BEARERTOKEN")
    @js.native
    def AUTHTYPE_BEARERTOKEN: String = js.native
    inline def AUTHTYPE_BEARERTOKEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_BEARERTOKEN")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/auth", "Authenticator.AUTHTYPE_CONTAINER")
    @js.native
    def AUTHTYPE_CONTAINER: String = js.native
    inline def AUTHTYPE_CONTAINER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_CONTAINER")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/auth", "Authenticator.AUTHTYPE_CP4D")
    @js.native
    def AUTHTYPE_CP4D: String = js.native
    inline def AUTHTYPE_CP4D_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_CP4D")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/auth", "Authenticator.AUTHTYPE_IAM")
    @js.native
    def AUTHTYPE_IAM: String = js.native
    inline def AUTHTYPE_IAM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_IAM")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/auth", "Authenticator.AUTHTYPE_NOAUTH")
    @js.native
    def AUTHTYPE_NOAUTH: String = js.native
    inline def AUTHTYPE_NOAUTH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_NOAUTH")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/auth", "Authenticator.AUTHTYPE_UNKNOWN")
    @js.native
    def AUTHTYPE_UNKNOWN: String = js.native
    inline def AUTHTYPE_UNKNOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/auth", "Authenticator.AUTHTYPE_VPC")
    @js.native
    def AUTHTYPE_VPC: String = js.native
    inline def AUTHTYPE_VPC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_VPC")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "BasicAuthenticator")
  @js.native
  open class BasicAuthenticator protected ()
    extends typings.ibmCloudSdkCore.esAuthAuthenticatorsMod.BasicAuthenticator {
    /**
      * Create a new BasicAuthenticator instance.
      *
      * @param {object} options Configuration options for basic authentication.
      * @param {string} options.username The username portion of basic authentication.
      * @param {string} options.password The password portion of basic authentication.
      * @throws {Error} The configuration options are not valid.
      */
    def this(options: Options) = this()
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "BearerTokenAuthenticator")
  @js.native
  open class BearerTokenAuthenticator protected ()
    extends typings.ibmCloudSdkCore.esAuthAuthenticatorsMod.BearerTokenAuthenticator {
    /**
      * Create a new BearerTokenAuthenticator instance.
      *
      * @param {object} options Configuration options for bearer authentication.
      * @param {string} options.bearerToken The bearer token to be added
      *   to requests.
      * @throws {Error} The configuration bearerToken is not valid, or unspecified.
      */
    def this(options: typings.ibmCloudSdkCore.esAuthAuthenticatorsBearerTokenAuthenticatorMod.Options) = this()
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "CloudPakForDataAuthenticator")
  @js.native
  open class CloudPakForDataAuthenticator protected ()
    extends typings.ibmCloudSdkCore.esAuthAuthenticatorsMod.CloudPakForDataAuthenticator {
    /**
      * Create a new [[CloudPakForDataAuthenticator]] instance.
      *
      * @param {object} options Configuration options for CloudPakForData authentication.
      * @param {string} options.url For HTTP token requests.
      * @param {string} options.username The username used to obtain a bearer token.
      * @param {string} [options.password] The password used to obtain a bearer token [required if apikey not specified].
      * @param {string} [options.apikey] The API key used to obtain a bearer token [required if password not specified].
      * @param {boolean} [options.disableSslVerification] A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not
      * @param {object<string, string>} [options.headers] to be sent with every.
      * @throws `Error` The username, password, and/or url are not valid, or unspecified, for Cloud Pak For Data token
      *   requests.
      */
    def this(options: typings.ibmCloudSdkCore.esAuthAuthenticatorsCloudPakForDataAuthenticatorMod.Options) = this()
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "ContainerAuthenticator")
  @js.native
  open class ContainerAuthenticator protected ()
    extends typings.ibmCloudSdkCore.esAuthAuthenticatorsMod.ContainerAuthenticator {
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
    def this(options: typings.ibmCloudSdkCore.esAuthAuthenticatorsContainerAuthenticatorMod.Options) = this()
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "ContainerTokenManager")
  @js.native
  open class ContainerTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthTokenManagersMod.ContainerTokenManager {
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
    def this(options: typings.ibmCloudSdkCore.esAuthTokenManagersContainerTokenManagerMod.Options) = this()
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "Cp4dTokenManager")
  @js.native
  open class Cp4dTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthTokenManagersMod.Cp4dTokenManager {
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
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "IamAuthenticator")
  @js.native
  open class IamAuthenticator protected ()
    extends typings.ibmCloudSdkCore.esAuthAuthenticatorsMod.IamAuthenticator {
    /**
      *
      * Create a new [[IamAuthenticator]] instance.
      *
      * @param {object} options Configuration options for IAM authentication.
      * @param {boolean} options.disableSslVerification A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not
      * @param {string} options.url for HTTP token requests.
      * @param {object<string, string>} options.headers to be sent with every
      * @param {string} options.apikey The IAM api key.
      * @param {string} [options.clientId] The `clientId` and `clientSecret` fields are used to form a "basic"
      *   authorization header for IAM token requests.
      * @param {string} [options.clientSecret] The `clientId` and `clientSecret` fields are used to form a "basic"
      *   authorization header for IAM token requests.
      * @param {string} [options.scope] The "scope" parameter to use when fetching the bearer token from the
      *   IAM token server.
      * @throws {Error} When the configuration options are not valid.
      */
    def this(options: typings.ibmCloudSdkCore.esAuthAuthenticatorsIamAuthenticatorMod.Options) = this()
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "IamRequestBasedAuthenticator")
  @js.native
  open class IamRequestBasedAuthenticator protected ()
    extends typings.ibmCloudSdkCore.esAuthAuthenticatorsMod.IamRequestBasedAuthenticator {
    /**
      *
      * Create a new [[IamRequestBasedAuthenticator]] instance.
      *
      * @param {object} options Configuration options for IAM authentication.
      * @param {boolean} options.disableSslVerification A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not
      * @param {string} options.url for HTTP token requests.
      * @param {object<string, string>} options.headers to be sent with every IAM token request
      * @param {string} [options.clientId] The `clientId` and `clientSecret` fields are used to form a "basic"
      *   authorization header for IAM token requests.
      * @param {string} [options.clientSecret] The `clientId` and `clientSecret` fields are used to form a "basic"
      *   authorization header for IAM token requests.
      * @param {string} [options.scope] The "scope" parameter to use when fetching the bearer token from the
      *   IAM token server.
      * @throws {Error} When the configuration options are not valid.
      */
    def this(options: IamRequestOptions) = this()
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "IamRequestBasedTokenManager")
  @js.native
  open class IamRequestBasedTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthTokenManagersMod.IamRequestBasedTokenManager {
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
    def this(options: typings.ibmCloudSdkCore.esAuthTokenManagersIamRequestBasedTokenManagerMod.IamRequestOptions) = this()
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "IamTokenManager")
  @js.native
  open class IamTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthTokenManagersMod.IamTokenManager {
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
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "JwtTokenManager")
  @js.native
  open class JwtTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthTokenManagersMod.JwtTokenManager {
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
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "NoAuthAuthenticator")
  @js.native
  /**
    * Create a new Authenticator instance.
    *
    * @throws {Error} The `new` keyword was not used to create construct the
    *   authenticator.
    */
  open class NoAuthAuthenticator ()
    extends typings.ibmCloudSdkCore.esAuthAuthenticatorsMod.NoAuthAuthenticator
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "TokenManager")
  @js.native
  open class TokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthTokenManagersMod.TokenManager {
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
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "TokenRequestBasedAuthenticator")
  @js.native
  open class TokenRequestBasedAuthenticator protected ()
    extends typings.ibmCloudSdkCore.esAuthAuthenticatorsMod.TokenRequestBasedAuthenticator {
    /**
      * Create a new [[TokenRequestBasedAuthenticator]] instance with an internal [[JwtTokenManager]].
      *
      * @param {object} options Configuration options.
      * @param {string} options.url for HTTP token requests.
      * @param {boolean} [options.disableSslVerification] A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not.
      * @param {object<string, string>} [options.headers] to be sent with every
      *   outbound HTTP requests to token services.
      */
    def this(options: BaseOptions) = this()
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "VpcInstanceAuthenticator")
  @js.native
  open class VpcInstanceAuthenticator protected ()
    extends typings.ibmCloudSdkCore.esAuthAuthenticatorsMod.VpcInstanceAuthenticator {
    /**
      * Create a new [[VpcInstanceAuthenticator]] instance.
      *
      * @param {object} [options] Configuration options for VpcInstance authentication.
      * @param {string} [options.iamProfileCrn] The CRN of the linked trusted IAM profile to be used as the identity of the compute resource.
      *    At most one of iamProfileCrn or iamProfileId may be specified.
      *    If neither one is specified, then the default IAM profile defined for the compute resource will be used.
      * @param {string} [options.iamProfileId] The ID of the linked trusted IAM profile to be used when obtaining the IAM access token.
      *    At most one of iamProfileCrn or iamProfileId may be specified.
      *    If neither one is specified, then the default IAM profile defined for the compute resource will be used.
      * @param {string} [options.url] The VPC Instance Metadata Service's base endpoint URL. Default value: "http://169.254.169.254"
      */
    def this(options: typings.ibmCloudSdkCore.esAuthAuthenticatorsVpcInstanceAuthenticatorMod.Options) = this()
  }
  
  @JSImport("ibm-cloud-sdk-core/es/auth", "VpcInstanceTokenManager")
  @js.native
  open class VpcInstanceTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthTokenManagersMod.VpcInstanceTokenManager {
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
  
  inline def atLeastOne(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("atLeastOne")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def atMostOne(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("atMostOne")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def checkCredentials(obj: Any, credsToCheck: js.Array[String]): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("checkCredentials")(obj.asInstanceOf[js.Any], credsToCheck.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
  
  inline def computeBasicAuthHeader(username: String, password: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeBasicAuthHeader")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def constructFilepath(filepath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("constructFilepath")(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fileExistsAtPath(filepath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExistsAtPath")(filepath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getAuthenticatorFromEnvironment(serviceName: String): typings.ibmCloudSdkCore.esAuthAuthenticatorsMod.Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthenticatorFromEnvironment")(serviceName.asInstanceOf[js.Any]).asInstanceOf[typings.ibmCloudSdkCore.esAuthAuthenticatorsMod.Authenticator]
  
  inline def getCurrentTime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentTime")().asInstanceOf[Double]
  
  inline def onlyOne(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("onlyOne")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def readCrTokenFile(filepath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readCrTokenFile")(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def readCredentialsFile(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readCredentialsFile")().asInstanceOf[Any]
  
  inline def readExternalSources(serviceName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readExternalSources")(serviceName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def removeSuffix(str: String, suffix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeSuffix")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def validateInput(options: Any, requiredOptions: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateInput")(options.asInstanceOf[js.Any], requiredOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StringDictionary
import typings.ibmCloudSdkCore.esAuthAuthenticatorsBasicAuthenticatorMod.Options
import typings.ibmCloudSdkCore.esAuthAuthenticatorsIamRequestBasedAuthenticatorMod.IamRequestOptions
import typings.ibmCloudSdkCore.esAuthAuthenticatorsTokenRequestBasedAuthenticatorMod.BaseOptions
import typings.ibmCloudSdkCore.esAuthTokenManagersJwtTokenManagerMod.JwtTokenManagerOptions
import typings.ibmCloudSdkCore.esAuthTokenManagersTokenManagerMod.TokenManagerOptions
import typings.ibmCloudSdkCore.esLibBaseServiceMod.UserOptions
import typings.ibmCloudSdkCore.esLibHelperMod.FileObject
import typings.ibmCloudSdkCore.esLibHelperMod.FileWithMetadata
import typings.node.NodeJS.ReadableStream
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Stream
import typings.std.File
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ibm-cloud-sdk-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ibm-cloud-sdk-core", "Authenticator")
  @js.native
  /**
    * Create a new Authenticator instance.
    *
    * @throws {Error} The `new` keyword was not used to create construct the
    *   authenticator.
    */
  open class Authenticator ()
    extends typings.ibmCloudSdkCore.esAuthMod.Authenticator
  /* static members */
  object Authenticator {
    
    @JSImport("ibm-cloud-sdk-core", "Authenticator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constants that define the various authenticator types.
      */
    @JSImport("ibm-cloud-sdk-core", "Authenticator.AUTHTYPE_BASIC")
    @js.native
    def AUTHTYPE_BASIC: String = js.native
    inline def AUTHTYPE_BASIC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_BASIC")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core", "Authenticator.AUTHTYPE_BEARERTOKEN")
    @js.native
    def AUTHTYPE_BEARERTOKEN: String = js.native
    inline def AUTHTYPE_BEARERTOKEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_BEARERTOKEN")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core", "Authenticator.AUTHTYPE_CONTAINER")
    @js.native
    def AUTHTYPE_CONTAINER: String = js.native
    inline def AUTHTYPE_CONTAINER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_CONTAINER")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core", "Authenticator.AUTHTYPE_CP4D")
    @js.native
    def AUTHTYPE_CP4D: String = js.native
    inline def AUTHTYPE_CP4D_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_CP4D")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core", "Authenticator.AUTHTYPE_IAM")
    @js.native
    def AUTHTYPE_IAM: String = js.native
    inline def AUTHTYPE_IAM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_IAM")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core", "Authenticator.AUTHTYPE_NOAUTH")
    @js.native
    def AUTHTYPE_NOAUTH: String = js.native
    inline def AUTHTYPE_NOAUTH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_NOAUTH")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core", "Authenticator.AUTHTYPE_UNKNOWN")
    @js.native
    def AUTHTYPE_UNKNOWN: String = js.native
    inline def AUTHTYPE_UNKNOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core", "Authenticator.AUTHTYPE_VPC")
    @js.native
    def AUTHTYPE_VPC: String = js.native
    inline def AUTHTYPE_VPC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHTYPE_VPC")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ibm-cloud-sdk-core", "BaseService")
  @js.native
  open class BaseService protected ()
    extends typings.ibmCloudSdkCore.esLibBaseServiceMod.BaseService {
    /**
      * Configuration values for a service.
      * @param {Authenticator} userOptions.authenticator Object used to authenticate requests to the service.
      * @param {string} [userOptions.serviceUrl] The base url to use when contacting the service.
      *   The base url may differ between IBM Cloud regions.
      * @param {object<string, string>} [userOptions.headers] Default headers that shall be
      *   included with every request to the service.
      * @param {string} [userOptions.version] The API version date to use with the service,
      *   in "YYYY-MM-DD" format.
      * @param {boolean} [userOptions.disableSslVerification] A flag that indicates
      *   whether verification of the token server's SSL certificate should be
      *   disabled or not.
      */
    def this(userOptions: UserOptions) = this()
  }
  /* static members */
  object BaseService {
    
    @JSImport("ibm-cloud-sdk-core", "BaseService")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ibm-cloud-sdk-core", "BaseService.DEFAULT_SERVICE_NAME")
    @js.native
    def DEFAULT_SERVICE_NAME: String = js.native
    inline def DEFAULT_SERVICE_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SERVICE_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core", "BaseService.DEFAULT_SERVICE_URL")
    @js.native
    def DEFAULT_SERVICE_URL: String = js.native
    inline def DEFAULT_SERVICE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SERVICE_URL")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ibm-cloud-sdk-core", "BasicAuthenticator")
  @js.native
  open class BasicAuthenticator protected ()
    extends typings.ibmCloudSdkCore.esAuthMod.BasicAuthenticator {
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
  
  @JSImport("ibm-cloud-sdk-core", "BearerTokenAuthenticator")
  @js.native
  open class BearerTokenAuthenticator protected ()
    extends typings.ibmCloudSdkCore.esAuthMod.BearerTokenAuthenticator {
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
  
  @JSImport("ibm-cloud-sdk-core", "CloudPakForDataAuthenticator")
  @js.native
  open class CloudPakForDataAuthenticator protected ()
    extends typings.ibmCloudSdkCore.esAuthMod.CloudPakForDataAuthenticator {
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
  
  @JSImport("ibm-cloud-sdk-core", "ContainerAuthenticator")
  @js.native
  open class ContainerAuthenticator protected ()
    extends typings.ibmCloudSdkCore.esAuthMod.ContainerAuthenticator {
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
  
  @JSImport("ibm-cloud-sdk-core", "ContainerTokenManager")
  @js.native
  open class ContainerTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthMod.ContainerTokenManager {
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
  
  @JSImport("ibm-cloud-sdk-core", "Cp4dTokenManager")
  @js.native
  open class Cp4dTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthMod.Cp4dTokenManager {
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
  
  @JSImport("ibm-cloud-sdk-core", "IamAuthenticator")
  @js.native
  open class IamAuthenticator protected ()
    extends typings.ibmCloudSdkCore.esAuthMod.IamAuthenticator {
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
  
  @JSImport("ibm-cloud-sdk-core", "IamRequestBasedAuthenticator")
  @js.native
  open class IamRequestBasedAuthenticator protected ()
    extends typings.ibmCloudSdkCore.esAuthMod.IamRequestBasedAuthenticator {
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
  
  @JSImport("ibm-cloud-sdk-core", "IamRequestBasedTokenManager")
  @js.native
  open class IamRequestBasedTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthMod.IamRequestBasedTokenManager {
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
  
  @JSImport("ibm-cloud-sdk-core", "IamTokenManager")
  @js.native
  open class IamTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthMod.IamTokenManager {
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
  
  @JSImport("ibm-cloud-sdk-core", "JwtTokenManager")
  @js.native
  open class JwtTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthMod.JwtTokenManager {
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
  
  @JSImport("ibm-cloud-sdk-core", "NoAuthAuthenticator")
  @js.native
  /**
    * Create a new Authenticator instance.
    *
    * @throws {Error} The `new` keyword was not used to create construct the
    *   authenticator.
    */
  open class NoAuthAuthenticator ()
    extends typings.ibmCloudSdkCore.esAuthMod.NoAuthAuthenticator
  
  @JSImport("ibm-cloud-sdk-core", "TokenManager")
  @js.native
  open class TokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthMod.TokenManager {
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
  
  @JSImport("ibm-cloud-sdk-core", "TokenRequestBasedAuthenticator")
  @js.native
  open class TokenRequestBasedAuthenticator protected ()
    extends typings.ibmCloudSdkCore.esAuthMod.TokenRequestBasedAuthenticator {
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
  
  @JSImport("ibm-cloud-sdk-core", "VpcInstanceAuthenticator")
  @js.native
  open class VpcInstanceAuthenticator protected ()
    extends typings.ibmCloudSdkCore.esAuthMod.VpcInstanceAuthenticator {
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
  
  @JSImport("ibm-cloud-sdk-core", "VpcInstanceTokenManager")
  @js.native
  open class VpcInstanceTokenManager protected ()
    extends typings.ibmCloudSdkCore.esAuthMod.VpcInstanceTokenManager {
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
  
  inline def buildRequestFileObject(fileParam: FileWithMetadata): js.Promise[FileObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildRequestFileObject")(fileParam.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileObject]]
  
  inline def checkCredentials(obj: Any, credsToCheck: js.Array[String]): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("checkCredentials")(obj.asInstanceOf[js.Any], credsToCheck.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
  
  inline def computeBasicAuthHeader(username: String, password: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeBasicAuthHeader")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def constructFilepath(filepath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("constructFilepath")(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def constructServiceUrl(parameterizedUrl: String, defaultUrlVariables: Map[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("constructServiceUrl")(parameterizedUrl.asInstanceOf[js.Any], defaultUrlVariables.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def constructServiceUrl(
    parameterizedUrl: String,
    defaultUrlVariables: Map[String, String],
    providedUrlVariables: Map[String, String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("constructServiceUrl")(parameterizedUrl.asInstanceOf[js.Any], defaultUrlVariables.asInstanceOf[js.Any], providedUrlVariables.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object contentType {
    
    @JSImport("ibm-cloud-sdk-core", "contentType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromFilename(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fromFilename(file: FileObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fromFilename(file: ReadableStream): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fromFilename(file: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fromFilename(file: File): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFilename")(file.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def fromHeader(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHeader")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def fileExistsAtPath(filepath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExistsAtPath")(filepath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getAuthenticatorFromEnvironment(serviceName: String): typings.ibmCloudSdkCore.esAuthAuthenticatorsMod.Authenticator = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthenticatorFromEnvironment")(serviceName.asInstanceOf[js.Any]).asInstanceOf[typings.ibmCloudSdkCore.esAuthAuthenticatorsMod.Authenticator]
  
  inline def getContentType(inputData: ReadableStream): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentType")(inputData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getContentType(inputData: Buffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentType")(inputData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getCurrentTime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentTime")().asInstanceOf[Double]
  
  inline def getFormat(params: StringDictionary[Any], formats: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFormat")(params.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getMissingParams(params: StringDictionary[Any], requires: js.Array[String]): Null | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getMissingParams")(params.asInstanceOf[js.Any], requires.asInstanceOf[js.Any])).asInstanceOf[Null | js.Error]
  
  inline def getQueryParam(urlStr: String, param: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getQueryParam")(urlStr.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isEmptyObject(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFileData(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileData")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFileWithMetadata(obj: Any): /* is ibm-cloud-sdk-core.ibm-cloud-sdk-core/es/lib/helper.FileWithMetadata */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileWithMetadata")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is ibm-cloud-sdk-core.ibm-cloud-sdk-core/es/lib/helper.FileWithMetadata */ Boolean]
  
  inline def isHTML(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTML")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def onlyOne(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("onlyOne")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  object qs {
    
    @JSImport("ibm-cloud-sdk-core", "qs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def stringify(queryParams: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(queryParams.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def readCrTokenFile(filepath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readCrTokenFile")(filepath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def readCredentialsFile(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readCredentialsFile")().asInstanceOf[Any]
  
  inline def readExternalSources(serviceName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readExternalSources")(serviceName.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def removeSuffix(str: String, suffix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeSuffix")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def streamToPromise(stream: Stream): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("streamToPromise")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def stripTrailingSlash(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTrailingSlash")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toLowerKeys(obj: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("toLowerKeys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  object unitTestUtils {
    
    @JSImport("ibm-cloud-sdk-core", "unitTestUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkForSuccessfulExecution(createRequestMock: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkForSuccessfulExecution")(createRequestMock.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def checkMediaHeaders(createRequestMock: Any, accept: String, contentType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkMediaHeaders")(createRequestMock.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkUrlAndMethod(options: Any, url: String, method: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUrlAndMethod")(options.asInstanceOf[js.Any], url.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkUserHeader(createRequestMock: Any, userHeaderName: String, userHeaderValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUserHeader")(createRequestMock.asInstanceOf[js.Any], userHeaderName.asInstanceOf[js.Any], userHeaderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def expectToBePromise(sdkPromise: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("expectToBePromise")(sdkPromise.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getOptions(createRequestMock: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")(createRequestMock.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  inline def validateInput(options: Any, requiredOptions: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateInput")(options.asInstanceOf[js.Any], requiredOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateParams(params: StringDictionary[Any], requiredParams: js.Array[String], allParams: js.Array[String]): Null | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("validateParams")(params.asInstanceOf[js.Any], requiredParams.asInstanceOf[js.Any], allParams.asInstanceOf[js.Any])).asInstanceOf[Null | js.Error]
}

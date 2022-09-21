package typings.googleapis.mod

import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.anon.TypeofDefaultTransporter
import typings.googleAuthLibrary.awsclientMod.AwsClientOptions
import typings.googleAuthLibrary.baseexternalclientMod.BaseExternalAccountClientOptions
import typings.googleAuthLibrary.computeclientMod.ComputeOptions
import typings.googleAuthLibrary.downscopedclientMod.CredentialAccessBoundary
import typings.googleAuthLibrary.externalclientMod.ExternalAccountClientOptions
import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleAuthLibrary.identitypoolclientMod.IdentityPoolClientOptions
import typings.googleAuthLibrary.idtokenclientMod.IdTokenOptions
import typings.googleAuthLibrary.impersonatedMod.ImpersonatedOptions
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.loginticketMod.TokenPayload
import typings.googleAuthLibrary.oauth2clientMod.OAuth2ClientOptions
import typings.googleAuthLibrary.oauth2clientMod.RefreshOptions
import typings.googleAuthLibrary.pluggableAuthClientMod.PluggableAuthClientOptions
import typings.googleAuthLibrary.refreshclientMod.UserRefreshClientOptions
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Auth {
  
  @JSImport("googleapis", "Auth.AuthClient")
  @js.native
  abstract class AuthClient ()
    extends typings.googleAuthLibrary.authclientMod.AuthClient {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("googleapis", "Auth.AwsClient")
  @js.native
  open class AwsClient protected ()
    extends typings.googleAuthLibrary.mod.AwsClient {
    /**
      * Instantiates an AwsClient instance using the provided JSON
      * object loaded from an external account credentials file.
      * An error is thrown if the credential is not a valid AWS credential.
      * @param options The external account options object typically loaded
      *   from the external account JSON credential file.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      */
    def this(options: AwsClientOptions) = this()
    def this(options: AwsClientOptions, additionalOptions: RefreshOptions) = this()
  }
  
  @JSImport("googleapis", "Auth.BaseExternalAccountClient")
  @js.native
  abstract class BaseExternalAccountClient protected ()
    extends typings.googleAuthLibrary.mod.BaseExternalAccountClient {
    /**
      * Instantiate a BaseExternalAccountClient instance using the provided JSON
      * object loaded from an external account credentials file.
      * @param options The external account options object typically loaded
      *   from the external account JSON credential file.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      */
    def this(options: BaseExternalAccountClientOptions) = this()
    def this(options: BaseExternalAccountClientOptions, additionalOptions: RefreshOptions) = this()
  }
  
  @JSImport("googleapis", "Auth.CodeChallengeMethod")
  @js.native
  object CodeChallengeMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googleAuthLibrary.oauth2clientMod.CodeChallengeMethod & String] = js.native
    
    /* "plain" */ val Plain: typings.googleAuthLibrary.oauth2clientMod.CodeChallengeMethod.Plain & String = js.native
    
    /* "S256" */ val S256: typings.googleAuthLibrary.oauth2clientMod.CodeChallengeMethod.S256 & String = js.native
  }
  
  @JSImport("googleapis", "Auth.Compute")
  @js.native
  /**
    * Google Compute Engine service account credentials.
    *
    * Retrieve access token from the metadata server.
    * See: https://developers.google.com/compute/docs/authentication
    */
  open class Compute ()
    extends typings.googleAuthLibrary.mod.Compute {
    def this(options: ComputeOptions) = this()
  }
  
  @JSImport("googleapis", "Auth.DefaultTransporter")
  @js.native
  open class DefaultTransporter ()
    extends typings.googleAuthLibrary.mod.DefaultTransporter
  /* static members */
  object DefaultTransporter {
    
    /**
      * Default user agent.
      */
    @JSImport("googleapis", "Auth.DefaultTransporter.USER_AGENT")
    @js.native
    val USER_AGENT: String = js.native
  }
  
  @JSImport("googleapis", "Auth.DownscopedClient")
  @js.native
  open class DownscopedClient protected ()
    extends typings.googleAuthLibrary.mod.DownscopedClient {
    /**
      * Instantiates a downscoped client object using the provided source
      * AuthClient and credential access boundary rules.
      * To downscope permissions of a source AuthClient, a Credential Access
      * Boundary that specifies which resources the new credential can access, as
      * well as an upper bound on the permissions that are available on each
      * resource, has to be defined. A downscoped client can then be instantiated
      * using the source AuthClient and the Credential Access Boundary.
      * @param authClient The source AuthClient to be downscoped based on the
      *   provided Credential Access Boundary rules.
      * @param credentialAccessBoundary The Credential Access Boundary which
      *   contains a list of access boundary rules. Each rule contains information
      *   on the resource that the rule applies to, the upper bound of the
      *   permissions that are available on that resource and an optional
      *   condition to further restrict permissions.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      * @param quotaProjectId Optional quota project id for setting up in the
      *   x-goog-user-project header.
      */
    def this(
      authClient: typings.googleAuthLibrary.authclientMod.AuthClient,
      credentialAccessBoundary: CredentialAccessBoundary
    ) = this()
    def this(
      authClient: typings.googleAuthLibrary.authclientMod.AuthClient,
      credentialAccessBoundary: CredentialAccessBoundary,
      additionalOptions: RefreshOptions
    ) = this()
    def this(
      authClient: typings.googleAuthLibrary.authclientMod.AuthClient,
      credentialAccessBoundary: CredentialAccessBoundary,
      additionalOptions: Unit,
      quotaProjectId: String
    ) = this()
    def this(
      authClient: typings.googleAuthLibrary.authclientMod.AuthClient,
      credentialAccessBoundary: CredentialAccessBoundary,
      additionalOptions: RefreshOptions,
      quotaProjectId: String
    ) = this()
  }
  
  @JSImport("googleapis", "Auth.ExternalAccountClient")
  @js.native
  open class ExternalAccountClient ()
    extends typings.googleAuthLibrary.mod.ExternalAccountClient
  /* static members */
  object ExternalAccountClient {
    
    @JSImport("googleapis", "Auth.ExternalAccountClient")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This static method will instantiate the
      * corresponding type of external account credential depending on the
      * underlying credential source.
      * @param options The external account options object typically loaded
      *   from the external account JSON credential file.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      * @return A BaseExternalAccountClient instance or null if the options
      *   provided do not correspond to an external account credential.
      */
    inline def fromJSON(options: ExternalAccountClientOptions): typings.googleAuthLibrary.baseexternalclientMod.BaseExternalAccountClient | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleAuthLibrary.baseexternalclientMod.BaseExternalAccountClient | Null]
    inline def fromJSON(options: ExternalAccountClientOptions, additionalOptions: RefreshOptions): typings.googleAuthLibrary.baseexternalclientMod.BaseExternalAccountClient | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(options.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any])).asInstanceOf[typings.googleAuthLibrary.baseexternalclientMod.BaseExternalAccountClient | Null]
  }
  
  @JSImport("googleapis", "Auth.GCPEnv")
  @js.native
  object GCPEnv extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googleAuthLibrary.envDetectMod.GCPEnv & String] = js.native
    
    /* "APP_ENGINE" */ val APP_ENGINE: typings.googleAuthLibrary.envDetectMod.GCPEnv.APP_ENGINE & String = js.native
    
    /* "CLOUD_FUNCTIONS" */ val CLOUD_FUNCTIONS: typings.googleAuthLibrary.envDetectMod.GCPEnv.CLOUD_FUNCTIONS & String = js.native
    
    /* "CLOUD_RUN" */ val CLOUD_RUN: typings.googleAuthLibrary.envDetectMod.GCPEnv.CLOUD_RUN & String = js.native
    
    /* "COMPUTE_ENGINE" */ val COMPUTE_ENGINE: typings.googleAuthLibrary.envDetectMod.GCPEnv.COMPUTE_ENGINE & String = js.native
    
    /* "KUBERNETES_ENGINE" */ val KUBERNETES_ENGINE: typings.googleAuthLibrary.envDetectMod.GCPEnv.KUBERNETES_ENGINE & String = js.native
    
    /* "NONE" */ val NONE: typings.googleAuthLibrary.envDetectMod.GCPEnv.NONE & String = js.native
  }
  
  @JSImport("googleapis", "Auth.GoogleAuth")
  @js.native
  open class GoogleAuth[T /* <: typings.googleAuthLibrary.authclientMod.AuthClient */] ()
    extends typings.googleAuthLibrary.mod.GoogleAuth[T] {
    def this(opts: GoogleAuthOptions[T]) = this()
  }
  /* static members */
  object GoogleAuth {
    
    @JSImport("googleapis", "Auth.GoogleAuth")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    @JSImport("googleapis", "Auth.GoogleAuth.DefaultTransporter")
    @js.native
    def DefaultTransporter: TypeofDefaultTransporter = js.native
    inline def DefaultTransporter_=(x: TypeofDefaultTransporter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTransporter")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("googleapis", "Auth.IAMAuth")
  @js.native
  open class IAMAuth protected ()
    extends typings.googleAuthLibrary.mod.IAMAuth {
    /**
      * IAM credentials.
      *
      * @param selector the iam authority selector
      * @param token the token
      * @constructor
      */
    def this(selector: String, token: String) = this()
  }
  
  @JSImport("googleapis", "Auth.IdTokenClient")
  @js.native
  open class IdTokenClient protected ()
    extends typings.googleAuthLibrary.mod.IdTokenClient {
    /**
      * Google ID Token client
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    def this(options: IdTokenOptions) = this()
  }
  
  @JSImport("googleapis", "Auth.IdentityPoolClient")
  @js.native
  open class IdentityPoolClient protected ()
    extends typings.googleAuthLibrary.mod.IdentityPoolClient {
    /**
      * Instantiate an IdentityPoolClient instance using the provided JSON
      * object loaded from an external account credentials file.
      * An error is thrown if the credential is not a valid file-sourced or
      * url-sourced credential or a workforce pool user project is provided
      * with a non workforce audience.
      * @param options The external account options object typically loaded
      *   from the external account JSON credential file.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      */
    def this(options: IdentityPoolClientOptions) = this()
    def this(options: IdentityPoolClientOptions, additionalOptions: RefreshOptions) = this()
  }
  
  @JSImport("googleapis", "Auth.Impersonated")
  @js.native
  /**
    * Impersonated service account credentials.
    *
    * Create a new access token by impersonating another service account.
    *
    * Impersonated Credentials allowing credentials issued to a user or
    * service account to impersonate another. The source project using
    * Impersonated Credentials must enable the "IAMCredentials" API.
    * Also, the target service account must grant the orginating principal
    * the "Service Account Token Creator" IAM role.
    *
    * @param {object} options - The configuration object.
    * @param {object} [options.sourceClient] the source credential used as to
    * acquire the impersonated credentials.
    * @param {string} [options.targetPrincipal] the service account to
    * impersonate.
    * @param {string[]} [options.delegates] the chained list of delegates
    * required to grant the final access_token. If set, the sequence of
    * identities must have "Service Account Token Creator" capability granted to
    * the preceding identity. For example, if set to [serviceAccountB,
    * serviceAccountC], the sourceCredential must have the Token Creator role on
    * serviceAccountB. serviceAccountB must have the Token Creator on
    * serviceAccountC. Finally, C must have Token Creator on target_principal.
    * If left unset, sourceCredential must have that role on targetPrincipal.
    * @param {string[]} [options.targetScopes] scopes to request during the
    * authorization grant.
    * @param {number} [options.lifetime] number of seconds the delegated
    * credential should be valid for up to 3600 seconds by default, or 43,200
    * seconds by extending the token's lifetime, see:
    * https://cloud.google.com/iam/docs/creating-short-lived-service-account-credentials#sa-credentials-oauth
    * @param {string} [options.endpoint] api endpoint override.
    */
  open class Impersonated ()
    extends typings.googleAuthLibrary.mod.Impersonated {
    def this(options: ImpersonatedOptions) = this()
  }
  
  @JSImport("googleapis", "Auth.JWT")
  @js.native
  open class JWT protected ()
    extends typings.googleAuthLibrary.mod.JWT {
    /**
      * JWT service account credentials.
      *
      * Retrieve access token using gtoken.
      *
      * @param email service account email address.
      * @param keyFile path to private key file.
      * @param key value of key
      * @param scopes list of requested scopes or a single scope.
      * @param subject impersonated account's email address.
      * @param key_id the ID of the key
      */
    def this(options: JWTOptions) = this()
    def this(
      email: js.UndefOr[String],
      keyFile: js.UndefOr[String],
      key: js.UndefOr[String],
      scopes: js.UndefOr[String | js.Array[String]],
      subject: js.UndefOr[String],
      keyId: js.UndefOr[String]
    ) = this()
  }
  
  @JSImport("googleapis", "Auth.JWTAccess")
  @js.native
  open class JWTAccess protected ()
    extends typings.googleAuthLibrary.mod.JWTAccess {
    /**
      * JWTAccess service account credentials.
      *
      * Create a new access token by using the credential to create a new JWT token
      * that's recognized as the access token.
      *
      * @param email the service account email address.
      * @param key the private key that will be used to sign the token.
      * @param keyId the ID of the private key used to sign the token.
      */
    def this(
      email: js.UndefOr[String | Null],
      key: js.UndefOr[String | Null],
      keyId: js.UndefOr[String | Null],
      eagerRefreshThresholdMillis: js.UndefOr[Double]
    ) = this()
  }
  /* static members */
  object JWTAccess {
    
    @JSImport("googleapis", "Auth.JWTAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an expiration time for the JWT token.
      *
      * @param iat The issued at time for the JWT.
      * @returns An expiration time for the JWT.
      */
    @JSImport("googleapis", "Auth.JWTAccess.getExpirationTime")
    @js.native
    def getExpirationTime: Any = js.native
    inline def getExpirationTime_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getExpirationTime")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("googleapis", "Auth.LoginTicket")
  @js.native
  /**
    * Create a simple class to extract user ID from an ID Token
    *
    * @param {string} env Envelope of the jwt
    * @param {TokenPayload} pay Payload of the jwt
    * @constructor
    */
  open class LoginTicket ()
    extends typings.googleAuthLibrary.mod.LoginTicket {
    def this(env: String) = this()
    def this(env: String, pay: TokenPayload) = this()
    def this(env: Unit, pay: TokenPayload) = this()
  }
  
  @JSImport("googleapis", "Auth.OAuth2Client")
  @js.native
  /**
    * Handles OAuth2 flow for Google APIs.
    *
    * @param clientId The authentication client ID.
    * @param clientSecret The authentication client secret.
    * @param redirectUri The URI to redirect to after completing the auth
    * request.
    * @param opts optional options for overriding the given parameters.
    * @constructor
    */
  open class OAuth2Client ()
    extends typings.googleAuthLibrary.mod.OAuth2Client {
    def this(clientId: String) = this()
    def this(options: OAuth2ClientOptions) = this()
    def this(clientId: String, clientSecret: String) = this()
    def this(clientId: Unit, clientSecret: String) = this()
    def this(clientId: String, clientSecret: String, redirectUri: String) = this()
    def this(clientId: String, clientSecret: Unit, redirectUri: String) = this()
    def this(clientId: Unit, clientSecret: String, redirectUri: String) = this()
    def this(clientId: Unit, clientSecret: Unit, redirectUri: String) = this()
  }
  /* static members */
  object OAuth2Client {
    
    @JSImport("googleapis", "Auth.OAuth2Client")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Clock skew - five minutes in seconds
      */
    @JSImport("googleapis", "Auth.OAuth2Client.CLOCK_SKEW_SECS_")
    @js.native
    val CLOCK_SKEW_SECS_ : Any = js.native
    
    /**
      * The base URL for auth endpoints.
      */
    @JSImport("googleapis", "Auth.OAuth2Client.GOOGLE_OAUTH2_AUTH_BASE_URL_")
    @js.native
    val GOOGLE_OAUTH2_AUTH_BASE_URL_ : Any = js.native
    
    /**
      * Google Sign on certificates in JWK format.
      */
    @JSImport("googleapis", "Auth.OAuth2Client.GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_")
    @js.native
    val GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_ : Any = js.native
    
    /**
      * Google Sign on certificates in PEM format.
      */
    @JSImport("googleapis", "Auth.OAuth2Client.GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_")
    @js.native
    val GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_ : Any = js.native
    
    /**
      * Google Sign on certificates in JWK format.
      */
    @JSImport("googleapis", "Auth.OAuth2Client.GOOGLE_OAUTH2_IAP_PUBLIC_KEY_URL_")
    @js.native
    val GOOGLE_OAUTH2_IAP_PUBLIC_KEY_URL_ : Any = js.native
    
    /**
      * The base endpoint to revoke tokens.
      */
    @JSImport("googleapis", "Auth.OAuth2Client.GOOGLE_OAUTH2_REVOKE_URL_")
    @js.native
    val GOOGLE_OAUTH2_REVOKE_URL_ : Any = js.native
    
    /**
      * The base endpoint for token retrieval.
      */
    @JSImport("googleapis", "Auth.OAuth2Client.GOOGLE_OAUTH2_TOKEN_URL_")
    @js.native
    val GOOGLE_OAUTH2_TOKEN_URL_ : Any = js.native
    
    @JSImport("googleapis", "Auth.OAuth2Client.GOOGLE_TOKEN_INFO_URL")
    @js.native
    val GOOGLE_TOKEN_INFO_URL: /* "https://oauth2.googleapis.com/tokeninfo" */ String = js.native
    
    /**
      * The allowed oauth token issuers.
      */
    @JSImport("googleapis", "Auth.OAuth2Client.ISSUERS_")
    @js.native
    val ISSUERS_ : Any = js.native
    
    /**
      * Max Token Lifetime is one day in seconds
      */
    @JSImport("googleapis", "Auth.OAuth2Client.MAX_TOKEN_LIFETIME_SECS_")
    @js.native
    val MAX_TOKEN_LIFETIME_SECS_ : Any = js.native
    
    /**
      * Generates an URL to revoke the given token.
      * @param token The existing token to be revoked.
      */
    inline def getRevokeTokenUrl(token: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRevokeTokenUrl")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("googleapis", "Auth.PluggableAuthClient")
  @js.native
  open class PluggableAuthClient protected ()
    extends typings.googleAuthLibrary.mod.PluggableAuthClient {
    /**
      * Instantiates a PluggableAuthClient instance using the provided JSON
      * object loaded from an external account credentials file.
      * An error is thrown if the credential is not a valid pluggable auth credential.
      * @param options The external account options object typically loaded from
      *   the external account JSON credential file.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      */
    def this(options: PluggableAuthClientOptions) = this()
    def this(options: PluggableAuthClientOptions, additionalOptions: RefreshOptions) = this()
  }
  
  @JSImport("googleapis", "Auth.UserRefreshClient")
  @js.native
  /**
    * User Refresh Token credentials.
    *
    * @param clientId The authentication client ID.
    * @param clientSecret The authentication client secret.
    * @param refreshToken The authentication refresh token.
    */
  open class UserRefreshClient ()
    extends typings.googleAuthLibrary.mod.UserRefreshClient {
    def this(clientId: String) = this()
    def this(options: UserRefreshClientOptions) = this()
    def this(clientId: String, clientSecret: String) = this()
    def this(clientId: Unit, clientSecret: String) = this()
    def this(clientId: String, clientSecret: String, refreshToken: String) = this()
    def this(clientId: String, clientSecret: Unit, refreshToken: String) = this()
    def this(clientId: Unit, clientSecret: String, refreshToken: String) = this()
    def this(clientId: Unit, clientSecret: Unit, refreshToken: String) = this()
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis", "Auth.auth")
    @js.native
    val ^ : typings.googleAuthLibrary.googleauthMod.GoogleAuth[JSONClient] = js.native
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis", "Auth.auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis", "Auth.auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("googleapis", "Auth.auth.DefaultTransporterCls")
    @js.native
    open class DefaultTransporterCls ()
      extends typings.googleAuthLibrary.mod.auth.DefaultTransporterCls
    /* static members */
    object DefaultTransporterCls {
      
      @JSImport("googleapis", "Auth.auth.DefaultTransporterCls")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    type _To = typings.googleAuthLibrary.googleauthMod.GoogleAuth[JSONClient]
    
    /* This means you don't have to write `^`, but can instead just say `auth.foo` */
    override def _to: typings.googleAuthLibrary.googleauthMod.GoogleAuth[JSONClient] = ^
  }
}

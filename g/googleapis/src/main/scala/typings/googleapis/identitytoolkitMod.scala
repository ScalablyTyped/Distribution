package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.authclientMod.AuthClient
import typings.googleAuthLibrary.awsclientMod.AwsClientOptions
import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleAuthLibrary.identitypoolclientMod.IdentityPoolClientOptions
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v3
import typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2.Identitytoolkit
import typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2.Options
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identitytoolkitMod {
  
  @JSImport("googleapis/build/src/apis/identitytoolkit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/identitytoolkit", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/identitytoolkit", "VERSIONS.v2")
    @js.native
    open class v2 protected () extends Identitytoolkit {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/identitytoolkit", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Identitytoolkit
      ] = js.native
    inline def v2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Identitytoolkit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/identitytoolkit", "VERSIONS.v3")
    @js.native
    open class v3 protected ()
      extends typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3.Identitytoolkit {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/identitytoolkit", "VERSIONS.v3")
    @js.native
    def v3: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3.Identitytoolkit
      ] = js.native
    inline def v3_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3.Identitytoolkit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/identitytoolkit", "auth.AwsClient")
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
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/identitytoolkit", "auth.Compute")
    @js.native
    /**
      * Google Compute Engine service account credentials.
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    open class Compute ()
      extends typings.googleAuthLibrary.mod.Compute
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/identitytoolkit", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/identitytoolkit", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/identitytoolkit", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/identitytoolkit", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/identitytoolkit", "auth.IdentityPoolClient")
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
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/identitytoolkit", "auth.JWT")
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
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/identitytoolkit", "auth.OAuth2")
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
    open class OAuth2 () extends OAuth2Client
    
    type _To = typings.googleapisCommon.mod.AuthPlus
    
    /* This means you don't have to write `^`, but can instead just say `auth.foo` */
    override def _to: typings.googleapisCommon.mod.AuthPlus = ^
  }
  
  inline def identitytoolkit(options: Options): Identitytoolkit = ^.asInstanceOf[js.Dynamic].applyDynamic("identitytoolkit")(options.asInstanceOf[js.Any]).asInstanceOf[Identitytoolkit]
  inline def identitytoolkit(options: typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3.Options): typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3.Identitytoolkit = ^.asInstanceOf[js.Dynamic].applyDynamic("identitytoolkit")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3.Identitytoolkit]
  
  object identitytoolkitV2 {
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "identitytoolkit_v2.Identitytoolkit")
    @js.native
    open class Identitytoolkit protected ()
      extends typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2.Identitytoolkit {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "identitytoolkit_v2.Resource$Accounts")
    @js.native
    open class ResourceAccounts protected ()
      extends typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2.ResourceAccounts {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "identitytoolkit_v2.Resource$Accounts$Mfaenrollment")
    @js.native
    open class ResourceAccountsMfaenrollment protected ()
      extends typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2.ResourceAccountsMfaenrollment {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "identitytoolkit_v2.Resource$Accounts$Mfasignin")
    @js.native
    open class ResourceAccountsMfasignin protected ()
      extends typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2.ResourceAccountsMfasignin {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "identitytoolkit_v2.Resource$Defaultsupportedidps")
    @js.native
    open class ResourceDefaultsupportedidps protected ()
      extends typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2.ResourceDefaultsupportedidps {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "identitytoolkit_v2.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "identitytoolkit_v2.Resource$Projects$Defaultsupportedidpconfigs")
    @js.native
    open class ResourceProjectsDefaultsupportedidpconfigs protected ()
      extends typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2.ResourceProjectsDefaultsupportedidpconfigs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "identitytoolkit_v2.Resource$Projects$Inboundsamlconfigs")
    @js.native
    open class ResourceProjectsInboundsamlconfigs protected ()
      extends typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2.ResourceProjectsInboundsamlconfigs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "identitytoolkit_v2.Resource$Projects$Oauthidpconfigs")
    @js.native
    open class ResourceProjectsOauthidpconfigs protected ()
      extends typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2.ResourceProjectsOauthidpconfigs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "identitytoolkit_v2.Resource$Projects$Tenants")
    @js.native
    open class ResourceProjectsTenants protected ()
      extends typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2.ResourceProjectsTenants {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "identitytoolkit_v2.Resource$Projects$Tenants$Defaultsupportedidpconfigs")
    @js.native
    open class ResourceProjectsTenantsDefaultsupportedidpconfigs protected ()
      extends typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2.ResourceProjectsTenantsDefaultsupportedidpconfigs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "identitytoolkit_v2.Resource$Projects$Tenants$Inboundsamlconfigs")
    @js.native
    open class ResourceProjectsTenantsInboundsamlconfigs protected ()
      extends typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2.ResourceProjectsTenantsInboundsamlconfigs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "identitytoolkit_v2.Resource$Projects$Tenants$Oauthidpconfigs")
    @js.native
    open class ResourceProjectsTenantsOauthidpconfigs protected ()
      extends typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2.ResourceProjectsTenantsOauthidpconfigs {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object identitytoolkitV3 {
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "identitytoolkit_v3.Identitytoolkit")
    @js.native
    open class Identitytoolkit protected ()
      extends typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3.Identitytoolkit {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/identitytoolkit", "identitytoolkit_v3.Resource$Relyingparty")
    @js.native
    open class ResourceRelyingparty protected ()
      extends typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3.ResourceRelyingparty {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def identitytoolkit_v2(version: v2): Identitytoolkit = ^.asInstanceOf[js.Dynamic].applyDynamic("identitytoolkit")(version.asInstanceOf[js.Any]).asInstanceOf[Identitytoolkit]
  
  inline def identitytoolkit_v3(version: v3): typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3.Identitytoolkit = ^.asInstanceOf[js.Dynamic].applyDynamic("identitytoolkit")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3.Identitytoolkit]
}

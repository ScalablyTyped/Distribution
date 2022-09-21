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
import typings.googleapis.cloudshellV1Mod.cloudshellV1.Cloudshell
import typings.googleapis.cloudshellV1Mod.cloudshellV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1alpha1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudshellMod {
  
  @JSImport("googleapis/build/src/apis/cloudshell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/cloudshell", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/cloudshell", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudshell", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Cloudshell {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/cloudshell", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Cloudshell] = js.native
    inline def v1_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Cloudshell]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudshell", "VERSIONS.v1alpha1")
    @js.native
    open class v1alpha1 protected ()
      extends typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/cloudshell", "VERSIONS.v1alpha1")
    @js.native
    def v1alpha1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell
      ] = js.native
    inline def v1alpha1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/cloudshell", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudshell", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/cloudshell", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/cloudshell", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/cloudshell", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudshell", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudshell", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudshell", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/cloudshell", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/cloudshell", "auth.OAuth2")
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
  
  inline def cloudshell(options: Options): Cloudshell = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudshell")(options.asInstanceOf[js.Any]).asInstanceOf[Cloudshell]
  inline def cloudshell(options: typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Options): typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudshell")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell]
  
  object cloudshellV1 {
    
    @JSImport("googleapis/build/src/apis/cloudshell", "cloudshell_v1.Cloudshell")
    @js.native
    open class Cloudshell protected ()
      extends typings.googleapis.cloudshellV1Mod.cloudshellV1.Cloudshell {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudshell", "cloudshell_v1.Resource$Operations")
    @js.native
    open class ResourceOperations protected ()
      extends typings.googleapis.cloudshellV1Mod.cloudshellV1.ResourceOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudshell", "cloudshell_v1.Resource$Users")
    @js.native
    open class ResourceUsers protected ()
      extends typings.googleapis.cloudshellV1Mod.cloudshellV1.ResourceUsers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudshell", "cloudshell_v1.Resource$Users$Environments")
    @js.native
    open class ResourceUsersEnvironments protected ()
      extends typings.googleapis.cloudshellV1Mod.cloudshellV1.ResourceUsersEnvironments {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object cloudshellV1alpha1 {
    
    @JSImport("googleapis/build/src/apis/cloudshell", "cloudshell_v1alpha1.Cloudshell")
    @js.native
    open class Cloudshell protected ()
      extends typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudshell", "cloudshell_v1alpha1.Resource$Users")
    @js.native
    open class ResourceUsers protected ()
      extends typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.ResourceUsers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudshell", "cloudshell_v1alpha1.Resource$Users$Environments")
    @js.native
    open class ResourceUsersEnvironments protected ()
      extends typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.ResourceUsersEnvironments {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudshell", "cloudshell_v1alpha1.Resource$Users$Environments$Publickeys")
    @js.native
    open class ResourceUsersEnvironmentsPublickeys protected ()
      extends typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.ResourceUsersEnvironmentsPublickeys {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def cloudshell_v1(version: v1): Cloudshell = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudshell")(version.asInstanceOf[js.Any]).asInstanceOf[Cloudshell]
  
  inline def cloudshell_v1alpha1(version: v1alpha1): typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudshell")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell]
}

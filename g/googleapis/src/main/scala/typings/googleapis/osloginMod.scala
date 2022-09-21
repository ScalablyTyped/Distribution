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
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1alpha
import typings.googleapis.googleapisStrings.v1beta
import typings.googleapis.osloginV1Mod.osloginV1.Options
import typings.googleapis.osloginV1Mod.osloginV1.Oslogin
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object osloginMod {
  
  @JSImport("googleapis/build/src/apis/oslogin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/oslogin", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/oslogin", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/oslogin", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Oslogin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/oslogin", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Oslogin] = js.native
    inline def v1_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Oslogin]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/oslogin", "VERSIONS.v1alpha")
    @js.native
    open class v1alpha protected ()
      extends typings.googleapis.osloginV1alphaMod.osloginV1alpha.Oslogin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/oslogin", "VERSIONS.v1alpha")
    @js.native
    def v1alpha: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.osloginV1alphaMod.osloginV1alpha.Oslogin
      ] = js.native
    inline def v1alpha_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.osloginV1alphaMod.osloginV1alpha.Oslogin
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/oslogin", "VERSIONS.v1beta")
    @js.native
    open class v1beta protected ()
      extends typings.googleapis.osloginV1betaMod.osloginV1beta.Oslogin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/oslogin", "VERSIONS.v1beta")
    @js.native
    def v1beta: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.osloginV1betaMod.osloginV1beta.Oslogin
      ] = js.native
    inline def v1beta_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.osloginV1betaMod.osloginV1beta.Oslogin
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/oslogin", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/oslogin", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/oslogin", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/oslogin", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/oslogin", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/oslogin", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/oslogin", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/oslogin", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/oslogin", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/oslogin", "auth.OAuth2")
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
  
  inline def oslogin(options: Options): Oslogin = ^.asInstanceOf[js.Dynamic].applyDynamic("oslogin")(options.asInstanceOf[js.Any]).asInstanceOf[Oslogin]
  inline def oslogin(options: typings.googleapis.osloginV1alphaMod.osloginV1alpha.Options): typings.googleapis.osloginV1alphaMod.osloginV1alpha.Oslogin = ^.asInstanceOf[js.Dynamic].applyDynamic("oslogin")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.osloginV1alphaMod.osloginV1alpha.Oslogin]
  inline def oslogin(options: typings.googleapis.osloginV1betaMod.osloginV1beta.Options): typings.googleapis.osloginV1betaMod.osloginV1beta.Oslogin = ^.asInstanceOf[js.Dynamic].applyDynamic("oslogin")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.osloginV1betaMod.osloginV1beta.Oslogin]
  
  object osloginV1 {
    
    @JSImport("googleapis/build/src/apis/oslogin", "oslogin_v1.Oslogin")
    @js.native
    open class Oslogin protected ()
      extends typings.googleapis.osloginV1Mod.osloginV1.Oslogin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/oslogin", "oslogin_v1.Resource$Users")
    @js.native
    open class ResourceUsers protected ()
      extends typings.googleapis.osloginV1Mod.osloginV1.ResourceUsers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/oslogin", "oslogin_v1.Resource$Users$Projects")
    @js.native
    open class ResourceUsersProjects protected ()
      extends typings.googleapis.osloginV1Mod.osloginV1.ResourceUsersProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/oslogin", "oslogin_v1.Resource$Users$Sshpublickeys")
    @js.native
    open class ResourceUsersSshpublickeys protected ()
      extends typings.googleapis.osloginV1Mod.osloginV1.ResourceUsersSshpublickeys {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object osloginV1alpha {
    
    @JSImport("googleapis/build/src/apis/oslogin", "oslogin_v1alpha.Oslogin")
    @js.native
    open class Oslogin protected ()
      extends typings.googleapis.osloginV1alphaMod.osloginV1alpha.Oslogin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/oslogin", "oslogin_v1alpha.Resource$Users")
    @js.native
    open class ResourceUsers protected ()
      extends typings.googleapis.osloginV1alphaMod.osloginV1alpha.ResourceUsers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/oslogin", "oslogin_v1alpha.Resource$Users$Projects")
    @js.native
    open class ResourceUsersProjects protected ()
      extends typings.googleapis.osloginV1alphaMod.osloginV1alpha.ResourceUsersProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/oslogin", "oslogin_v1alpha.Resource$Users$Sshpublickeys")
    @js.native
    open class ResourceUsersSshpublickeys protected ()
      extends typings.googleapis.osloginV1alphaMod.osloginV1alpha.ResourceUsersSshpublickeys {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object osloginV1beta {
    
    @JSImport("googleapis/build/src/apis/oslogin", "oslogin_v1beta.Oslogin")
    @js.native
    open class Oslogin protected ()
      extends typings.googleapis.osloginV1betaMod.osloginV1beta.Oslogin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/oslogin", "oslogin_v1beta.Resource$Users")
    @js.native
    open class ResourceUsers protected ()
      extends typings.googleapis.osloginV1betaMod.osloginV1beta.ResourceUsers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/oslogin", "oslogin_v1beta.Resource$Users$Projects")
    @js.native
    open class ResourceUsersProjects protected ()
      extends typings.googleapis.osloginV1betaMod.osloginV1beta.ResourceUsersProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/oslogin", "oslogin_v1beta.Resource$Users$Sshpublickeys")
    @js.native
    open class ResourceUsersSshpublickeys protected ()
      extends typings.googleapis.osloginV1betaMod.osloginV1beta.ResourceUsersSshpublickeys {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def oslogin_v1(version: v1): Oslogin = ^.asInstanceOf[js.Dynamic].applyDynamic("oslogin")(version.asInstanceOf[js.Any]).asInstanceOf[Oslogin]
  
  inline def oslogin_v1alpha(version: v1alpha): typings.googleapis.osloginV1alphaMod.osloginV1alpha.Oslogin = ^.asInstanceOf[js.Dynamic].applyDynamic("oslogin")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.osloginV1alphaMod.osloginV1alpha.Oslogin]
  
  inline def oslogin_v1beta(version: v1beta): typings.googleapis.osloginV1betaMod.osloginV1beta.Oslogin = ^.asInstanceOf[js.Dynamic].applyDynamic("oslogin")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.osloginV1betaMod.osloginV1beta.Oslogin]
}

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
import typings.googleapis.websecurityscannerV1Mod.websecurityscannerV1.Options
import typings.googleapis.websecurityscannerV1Mod.websecurityscannerV1.Websecurityscanner
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object websecurityscannerMod {
  
  @JSImport("googleapis/build/src/apis/websecurityscanner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/websecurityscanner", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/websecurityscanner", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Websecurityscanner {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/websecurityscanner", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Websecurityscanner
      ] = js.native
    inline def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Websecurityscanner
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/websecurityscanner", "VERSIONS.v1alpha")
    @js.native
    open class v1alpha protected ()
      extends typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.Websecurityscanner {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/websecurityscanner", "VERSIONS.v1alpha")
    @js.native
    def v1alpha: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.Websecurityscanner
      ] = js.native
    inline def v1alpha_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.Websecurityscanner
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/websecurityscanner", "VERSIONS.v1beta")
    @js.native
    open class v1beta protected ()
      extends typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.Websecurityscanner {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/websecurityscanner", "VERSIONS.v1beta")
    @js.native
    def v1beta: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.Websecurityscanner
      ] = js.native
    inline def v1beta_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.Websecurityscanner
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/websecurityscanner", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/websecurityscanner", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/websecurityscanner", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/websecurityscanner", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/websecurityscanner", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/websecurityscanner", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/websecurityscanner", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/websecurityscanner", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/websecurityscanner", "auth.OAuth2")
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
  
  inline def websecurityscanner(options: Options): Websecurityscanner = ^.asInstanceOf[js.Dynamic].applyDynamic("websecurityscanner")(options.asInstanceOf[js.Any]).asInstanceOf[Websecurityscanner]
  inline def websecurityscanner(options: typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.Options): typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.Websecurityscanner = ^.asInstanceOf[js.Dynamic].applyDynamic("websecurityscanner")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.Websecurityscanner]
  inline def websecurityscanner(options: typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.Options): typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.Websecurityscanner = ^.asInstanceOf[js.Dynamic].applyDynamic("websecurityscanner")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.Websecurityscanner]
  
  object websecurityscannerV1 {
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.websecurityscannerV1Mod.websecurityscannerV1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1.Resource$Projects$Scanconfigs")
    @js.native
    open class ResourceProjectsScanconfigs protected ()
      extends typings.googleapis.websecurityscannerV1Mod.websecurityscannerV1.ResourceProjectsScanconfigs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1.Resource$Projects$Scanconfigs$Scanruns")
    @js.native
    open class ResourceProjectsScanconfigsScanruns protected ()
      extends typings.googleapis.websecurityscannerV1Mod.websecurityscannerV1.ResourceProjectsScanconfigsScanruns {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1.Resource$Projects$Scanconfigs$Scanruns$Crawledurls")
    @js.native
    open class ResourceProjectsScanconfigsScanrunsCrawledurls protected ()
      extends typings.googleapis.websecurityscannerV1Mod.websecurityscannerV1.ResourceProjectsScanconfigsScanrunsCrawledurls {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1.Resource$Projects$Scanconfigs$Scanruns$Findings")
    @js.native
    open class ResourceProjectsScanconfigsScanrunsFindings protected ()
      extends typings.googleapis.websecurityscannerV1Mod.websecurityscannerV1.ResourceProjectsScanconfigsScanrunsFindings {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1.Resource$Projects$Scanconfigs$Scanruns$Findingtypestats")
    @js.native
    open class ResourceProjectsScanconfigsScanrunsFindingtypestats protected ()
      extends typings.googleapis.websecurityscannerV1Mod.websecurityscannerV1.ResourceProjectsScanconfigsScanrunsFindingtypestats {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1.Websecurityscanner")
    @js.native
    open class Websecurityscanner protected ()
      extends typings.googleapis.websecurityscannerV1Mod.websecurityscannerV1.Websecurityscanner {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
  }
  
  object websecurityscannerV1alpha {
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1alpha.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1alpha.Resource$Projects$Scanconfigs")
    @js.native
    open class ResourceProjectsScanconfigs protected ()
      extends typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.ResourceProjectsScanconfigs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1alpha.Resource$Projects$Scanconfigs$Scanruns")
    @js.native
    open class ResourceProjectsScanconfigsScanruns protected ()
      extends typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.ResourceProjectsScanconfigsScanruns {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1alpha.Resource$Projects$Scanconfigs$Scanruns$Crawledurls")
    @js.native
    open class ResourceProjectsScanconfigsScanrunsCrawledurls protected ()
      extends typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.ResourceProjectsScanconfigsScanrunsCrawledurls {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1alpha.Resource$Projects$Scanconfigs$Scanruns$Findings")
    @js.native
    open class ResourceProjectsScanconfigsScanrunsFindings protected ()
      extends typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.ResourceProjectsScanconfigsScanrunsFindings {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1alpha.Resource$Projects$Scanconfigs$Scanruns$Findingtypestats")
    @js.native
    open class ResourceProjectsScanconfigsScanrunsFindingtypestats protected ()
      extends typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.ResourceProjectsScanconfigsScanrunsFindingtypestats {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1alpha.Websecurityscanner")
    @js.native
    open class Websecurityscanner protected ()
      extends typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.Websecurityscanner {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
  }
  
  object websecurityscannerV1beta {
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1beta.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs")
    @js.native
    open class ResourceProjectsScanconfigs protected ()
      extends typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.ResourceProjectsScanconfigs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs$Scanruns")
    @js.native
    open class ResourceProjectsScanconfigsScanruns protected ()
      extends typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.ResourceProjectsScanconfigsScanruns {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs$Scanruns$Crawledurls")
    @js.native
    open class ResourceProjectsScanconfigsScanrunsCrawledurls protected ()
      extends typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.ResourceProjectsScanconfigsScanrunsCrawledurls {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs$Scanruns$Findings")
    @js.native
    open class ResourceProjectsScanconfigsScanrunsFindings protected ()
      extends typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.ResourceProjectsScanconfigsScanrunsFindings {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs$Scanruns$Findingtypestats")
    @js.native
    open class ResourceProjectsScanconfigsScanrunsFindingtypestats protected ()
      extends typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.ResourceProjectsScanconfigsScanrunsFindingtypestats {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/websecurityscanner", "websecurityscanner_v1beta.Websecurityscanner")
    @js.native
    open class Websecurityscanner protected ()
      extends typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.Websecurityscanner {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
  }
  
  inline def websecurityscanner_v1(version: v1): Websecurityscanner = ^.asInstanceOf[js.Dynamic].applyDynamic("websecurityscanner")(version.asInstanceOf[js.Any]).asInstanceOf[Websecurityscanner]
  
  inline def websecurityscanner_v1alpha(version: v1alpha): typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.Websecurityscanner = ^.asInstanceOf[js.Dynamic].applyDynamic("websecurityscanner")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha.Websecurityscanner]
  
  inline def websecurityscanner_v1beta(version: v1beta): typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.Websecurityscanner = ^.asInstanceOf[js.Dynamic].applyDynamic("websecurityscanner")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta.Websecurityscanner]
}

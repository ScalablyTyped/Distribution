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
import typings.googleapis.containeranalysisV1Mod.containeranalysisV1.Containeranalysis
import typings.googleapis.containeranalysisV1Mod.containeranalysisV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1alpha1
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containeranalysisMod {
  
  @JSImport("googleapis/build/src/apis/containeranalysis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/containeranalysis", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/containeranalysis", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Containeranalysis {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/containeranalysis", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Containeranalysis
      ] = js.native
    inline def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Containeranalysis
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/containeranalysis", "VERSIONS.v1alpha1")
    @js.native
    open class v1alpha1 protected ()
      extends typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.Containeranalysis {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/containeranalysis", "VERSIONS.v1alpha1")
    @js.native
    def v1alpha1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.Containeranalysis
      ] = js.native
    inline def v1alpha1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.Containeranalysis
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/containeranalysis", "VERSIONS.v1beta1")
    @js.native
    open class v1beta1 protected ()
      extends typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.Containeranalysis {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/containeranalysis", "VERSIONS.v1beta1")
    @js.native
    def v1beta1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.Containeranalysis
      ] = js.native
    inline def v1beta1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.Containeranalysis
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/containeranalysis", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/containeranalysis", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/containeranalysis", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/containeranalysis", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/containeranalysis", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/containeranalysis", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/containeranalysis", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/containeranalysis", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/containeranalysis", "auth.OAuth2")
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
  
  inline def containeranalysis(options: Options): Containeranalysis = ^.asInstanceOf[js.Dynamic].applyDynamic("containeranalysis")(options.asInstanceOf[js.Any]).asInstanceOf[Containeranalysis]
  inline def containeranalysis(options: typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.Options): typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.Containeranalysis = ^.asInstanceOf[js.Dynamic].applyDynamic("containeranalysis")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.Containeranalysis]
  inline def containeranalysis(options: typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.Options): typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.Containeranalysis = ^.asInstanceOf[js.Dynamic].applyDynamic("containeranalysis")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.Containeranalysis]
  
  object containeranalysisV1 {
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1.Containeranalysis")
    @js.native
    open class Containeranalysis protected ()
      extends typings.googleapis.containeranalysisV1Mod.containeranalysisV1.Containeranalysis {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.containeranalysisV1Mod.containeranalysisV1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1.Resource$Projects$Notes")
    @js.native
    open class ResourceProjectsNotes protected ()
      extends typings.googleapis.containeranalysisV1Mod.containeranalysisV1.ResourceProjectsNotes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1.Resource$Projects$Notes$Occurrences")
    @js.native
    open class ResourceProjectsNotesOccurrences protected ()
      extends typings.googleapis.containeranalysisV1Mod.containeranalysisV1.ResourceProjectsNotesOccurrences {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1.Resource$Projects$Occurrences")
    @js.native
    open class ResourceProjectsOccurrences protected ()
      extends typings.googleapis.containeranalysisV1Mod.containeranalysisV1.ResourceProjectsOccurrences {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object containeranalysisV1alpha1 {
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1alpha1.Containeranalysis")
    @js.native
    open class Containeranalysis protected ()
      extends typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.Containeranalysis {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1alpha1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1alpha1.Resource$Projects$Notes")
    @js.native
    open class ResourceProjectsNotes protected ()
      extends typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProjectsNotes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1alpha1.Resource$Projects$Notes$Occurrences")
    @js.native
    open class ResourceProjectsNotesOccurrences protected ()
      extends typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProjectsNotesOccurrences {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1alpha1.Resource$Projects$Occurrences")
    @js.native
    open class ResourceProjectsOccurrences protected ()
      extends typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProjectsOccurrences {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1alpha1.Resource$Projects$Operations")
    @js.native
    open class ResourceProjectsOperations protected ()
      extends typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProjectsOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1alpha1.Resource$Projects$Scanconfigs")
    @js.native
    open class ResourceProjectsScanconfigs protected ()
      extends typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProjectsScanconfigs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1alpha1.Resource$Providers")
    @js.native
    open class ResourceProviders protected ()
      extends typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProviders {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1alpha1.Resource$Providers$Notes")
    @js.native
    open class ResourceProvidersNotes protected ()
      extends typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProvidersNotes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1alpha1.Resource$Providers$Notes$Occurrences")
    @js.native
    open class ResourceProvidersNotesOccurrences protected ()
      extends typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.ResourceProvidersNotesOccurrences {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object containeranalysisV1beta1 {
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1beta1.Containeranalysis")
    @js.native
    open class Containeranalysis protected ()
      extends typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.Containeranalysis {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1beta1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1beta1.Resource$Projects$Notes")
    @js.native
    open class ResourceProjectsNotes protected ()
      extends typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.ResourceProjectsNotes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1beta1.Resource$Projects$Notes$Occurrences")
    @js.native
    open class ResourceProjectsNotesOccurrences protected ()
      extends typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.ResourceProjectsNotesOccurrences {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1beta1.Resource$Projects$Occurrences")
    @js.native
    open class ResourceProjectsOccurrences protected ()
      extends typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.ResourceProjectsOccurrences {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/containeranalysis", "containeranalysis_v1beta1.Resource$Projects$Scanconfigs")
    @js.native
    open class ResourceProjectsScanconfigs protected ()
      extends typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.ResourceProjectsScanconfigs {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def containeranalysis_v1(version: v1): Containeranalysis = ^.asInstanceOf[js.Dynamic].applyDynamic("containeranalysis")(version.asInstanceOf[js.Any]).asInstanceOf[Containeranalysis]
  
  inline def containeranalysis_v1alpha1(version: v1alpha1): typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.Containeranalysis = ^.asInstanceOf[js.Dynamic].applyDynamic("containeranalysis")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.Containeranalysis]
  
  inline def containeranalysis_v1beta1(version: v1beta1): typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.Containeranalysis = ^.asInstanceOf[js.Dynamic].applyDynamic("containeranalysis")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.Containeranalysis]
}

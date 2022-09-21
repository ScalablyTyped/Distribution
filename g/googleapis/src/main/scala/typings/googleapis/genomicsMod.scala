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
import typings.googleapis.genomicsV1Mod.genomicsV1.Genomics
import typings.googleapis.genomicsV1Mod.genomicsV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1alpha2
import typings.googleapis.googleapisStrings.v2alpha1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genomicsMod {
  
  @JSImport("googleapis/build/src/apis/genomics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/genomics", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/genomics", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/genomics", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Genomics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/genomics", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Genomics] = js.native
    inline def v1_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Genomics]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/genomics", "VERSIONS.v1alpha2")
    @js.native
    open class v1alpha2 protected ()
      extends typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2.Genomics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/genomics", "VERSIONS.v1alpha2")
    @js.native
    def v1alpha2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2.Genomics
      ] = js.native
    inline def v1alpha2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2.Genomics
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/genomics", "VERSIONS.v2alpha1")
    @js.native
    open class v2alpha1 protected ()
      extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/genomics", "VERSIONS.v2alpha1")
    @js.native
    def v2alpha1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics
      ] = js.native
    inline def v2alpha1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2alpha1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/genomics", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/genomics", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/genomics", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/genomics", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/genomics", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/genomics", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/genomics", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/genomics", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/genomics", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/genomics", "auth.OAuth2")
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
  
  inline def genomics(options: Options): Genomics = ^.asInstanceOf[js.Dynamic].applyDynamic("genomics")(options.asInstanceOf[js.Any]).asInstanceOf[Genomics]
  inline def genomics(options: typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2.Options): typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2.Genomics = ^.asInstanceOf[js.Dynamic].applyDynamic("genomics")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2.Genomics]
  inline def genomics(options: typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Options): typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics = ^.asInstanceOf[js.Dynamic].applyDynamic("genomics")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics]
  
  object genomicsV1 {
    
    /**
      * Genomics API
      *
      * Uploads, processes, queries, and searches Genomics data in the cloud.
      *
      * @example
      * ```js
      * const {google} = require('googleapis');
      * const genomics = google.genomics('v1');
      * ```
      */
    @JSImport("googleapis/build/src/apis/genomics", "genomics_v1.Genomics")
    @js.native
    open class Genomics protected ()
      extends typings.googleapis.genomicsV1Mod.genomicsV1.Genomics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
  }
  
  object genomicsV1alpha2 {
    
    @JSImport("googleapis/build/src/apis/genomics", "genomics_v1alpha2.Genomics")
    @js.native
    open class Genomics protected ()
      extends typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2.Genomics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/genomics", "genomics_v1alpha2.Resource$Operations")
    @js.native
    open class ResourceOperations protected ()
      extends typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2.ResourceOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/genomics", "genomics_v1alpha2.Resource$Pipelines")
    @js.native
    open class ResourcePipelines protected ()
      extends typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2.ResourcePipelines {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object genomicsV2alpha1 {
    
    @JSImport("googleapis/build/src/apis/genomics", "genomics_v2alpha1.Genomics")
    @js.native
    open class Genomics protected ()
      extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/genomics", "genomics_v2alpha1.Resource$Pipelines")
    @js.native
    open class ResourcePipelines protected ()
      extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.ResourcePipelines {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/genomics", "genomics_v2alpha1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/genomics", "genomics_v2alpha1.Resource$Projects$Operations")
    @js.native
    open class ResourceProjectsOperations protected ()
      extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.ResourceProjectsOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/genomics", "genomics_v2alpha1.Resource$Projects$Workers")
    @js.native
    open class ResourceProjectsWorkers protected ()
      extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.ResourceProjectsWorkers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/genomics", "genomics_v2alpha1.Resource$Workers")
    @js.native
    open class ResourceWorkers protected ()
      extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.ResourceWorkers {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def genomics_v1(version: v1): Genomics = ^.asInstanceOf[js.Dynamic].applyDynamic("genomics")(version.asInstanceOf[js.Any]).asInstanceOf[Genomics]
  
  inline def genomics_v1alpha2(version: v1alpha2): typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2.Genomics = ^.asInstanceOf[js.Dynamic].applyDynamic("genomics")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2.Genomics]
  
  inline def genomics_v2alpha1(version: v2alpha1): typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics = ^.asInstanceOf[js.Dynamic].applyDynamic("genomics")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics]
}

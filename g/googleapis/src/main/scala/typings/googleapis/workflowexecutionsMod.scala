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
import typings.googleapis.googleapisStrings.v1beta
import typings.googleapis.workflowexecutionsV1Mod.workflowexecutionsV1.Options
import typings.googleapis.workflowexecutionsV1Mod.workflowexecutionsV1.Workflowexecutions
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workflowexecutionsMod {
  
  @JSImport("googleapis/build/src/apis/workflowexecutions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/workflowexecutions", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/workflowexecutions", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/workflowexecutions", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Workflowexecutions {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/workflowexecutions", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Workflowexecutions
      ] = js.native
    inline def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Workflowexecutions
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/workflowexecutions", "VERSIONS.v1beta")
    @js.native
    open class v1beta protected ()
      extends typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta.Workflowexecutions {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/workflowexecutions", "VERSIONS.v1beta")
    @js.native
    def v1beta: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta.Workflowexecutions
      ] = js.native
    inline def v1beta_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta.Workflowexecutions
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/workflowexecutions", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/workflowexecutions", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/workflowexecutions", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/workflowexecutions", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/workflowexecutions", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/workflowexecutions", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/workflowexecutions", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/workflowexecutions", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/workflowexecutions", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/workflowexecutions", "auth.OAuth2")
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
  
  inline def workflowexecutions(options: Options): Workflowexecutions = ^.asInstanceOf[js.Dynamic].applyDynamic("workflowexecutions")(options.asInstanceOf[js.Any]).asInstanceOf[Workflowexecutions]
  inline def workflowexecutions(options: typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta.Options): typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta.Workflowexecutions = ^.asInstanceOf[js.Dynamic].applyDynamic("workflowexecutions")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta.Workflowexecutions]
  
  object workflowexecutionsV1 {
    
    @JSImport("googleapis/build/src/apis/workflowexecutions", "workflowexecutions_v1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.workflowexecutionsV1Mod.workflowexecutionsV1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/workflowexecutions", "workflowexecutions_v1.Resource$Projects$Locations")
    @js.native
    open class ResourceProjectsLocations protected ()
      extends typings.googleapis.workflowexecutionsV1Mod.workflowexecutionsV1.ResourceProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/workflowexecutions", "workflowexecutions_v1.Resource$Projects$Locations$Workflows")
    @js.native
    open class ResourceProjectsLocationsWorkflows protected ()
      extends typings.googleapis.workflowexecutionsV1Mod.workflowexecutionsV1.ResourceProjectsLocationsWorkflows {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/workflowexecutions", "workflowexecutions_v1.Resource$Projects$Locations$Workflows$Executions")
    @js.native
    open class ResourceProjectsLocationsWorkflowsExecutions protected ()
      extends typings.googleapis.workflowexecutionsV1Mod.workflowexecutionsV1.ResourceProjectsLocationsWorkflowsExecutions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/workflowexecutions", "workflowexecutions_v1.Workflowexecutions")
    @js.native
    open class Workflowexecutions protected ()
      extends typings.googleapis.workflowexecutionsV1Mod.workflowexecutionsV1.Workflowexecutions {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
  }
  
  object workflowexecutionsV1beta {
    
    @JSImport("googleapis/build/src/apis/workflowexecutions", "workflowexecutions_v1beta.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/workflowexecutions", "workflowexecutions_v1beta.Resource$Projects$Locations")
    @js.native
    open class ResourceProjectsLocations protected ()
      extends typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta.ResourceProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/workflowexecutions", "workflowexecutions_v1beta.Resource$Projects$Locations$Workflows")
    @js.native
    open class ResourceProjectsLocationsWorkflows protected ()
      extends typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta.ResourceProjectsLocationsWorkflows {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/workflowexecutions", "workflowexecutions_v1beta.Resource$Projects$Locations$Workflows$Executions")
    @js.native
    open class ResourceProjectsLocationsWorkflowsExecutions protected ()
      extends typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta.ResourceProjectsLocationsWorkflowsExecutions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/workflowexecutions", "workflowexecutions_v1beta.Workflowexecutions")
    @js.native
    open class Workflowexecutions protected ()
      extends typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta.Workflowexecutions {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
  }
  
  inline def workflowexecutions_v1(version: v1): Workflowexecutions = ^.asInstanceOf[js.Dynamic].applyDynamic("workflowexecutions")(version.asInstanceOf[js.Any]).asInstanceOf[Workflowexecutions]
  
  inline def workflowexecutions_v1beta(version: v1beta): typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta.Workflowexecutions = ^.asInstanceOf[js.Dynamic].applyDynamic("workflowexecutions")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta.Workflowexecutions]
}

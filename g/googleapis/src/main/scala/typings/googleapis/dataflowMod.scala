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
import typings.googleapis.googleapisStrings.v1b3
import typings.googleapis.v1b3Mod.dataflowV1b3.Dataflow
import typings.googleapis.v1b3Mod.dataflowV1b3.Options
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataflowMod {
  
  @JSImport("googleapis/build/src/apis/dataflow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/dataflow", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/dataflow", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dataflow", "VERSIONS.v1b3")
    @js.native
    open class v1b3 protected () extends Dataflow {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/dataflow", "VERSIONS.v1b3")
    @js.native
    def v1b3: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Dataflow] = js.native
    inline def v1b3_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Dataflow]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1b3")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/dataflow", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dataflow", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/dataflow", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/dataflow", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/dataflow", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dataflow", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dataflow", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dataflow", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/dataflow", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/dataflow", "auth.OAuth2")
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
  
  inline def dataflow(options: Options): Dataflow = ^.asInstanceOf[js.Dynamic].applyDynamic("dataflow")(options.asInstanceOf[js.Any]).asInstanceOf[Dataflow]
  
  object dataflowV1b3 {
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Dataflow")
    @js.native
    open class Dataflow protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.Dataflow {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Jobs")
    @js.native
    open class ResourceProjectsJobs protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsJobs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Jobs$Debug")
    @js.native
    open class ResourceProjectsJobsDebug protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsJobsDebug {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Jobs$Messages")
    @js.native
    open class ResourceProjectsJobsMessages protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsJobsMessages {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Jobs$Workitems")
    @js.native
    open class ResourceProjectsJobsWorkitems protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsJobsWorkitems {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Locations")
    @js.native
    open class ResourceProjectsLocations protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Locations$Flextemplates")
    @js.native
    open class ResourceProjectsLocationsFlextemplates protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocationsFlextemplates {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Locations$Jobs")
    @js.native
    open class ResourceProjectsLocationsJobs protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocationsJobs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Debug")
    @js.native
    open class ResourceProjectsLocationsJobsDebug protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocationsJobsDebug {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Messages")
    @js.native
    open class ResourceProjectsLocationsJobsMessages protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocationsJobsMessages {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Snapshots")
    @js.native
    open class ResourceProjectsLocationsJobsSnapshots protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocationsJobsSnapshots {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Stages")
    @js.native
    open class ResourceProjectsLocationsJobsStages protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocationsJobsStages {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Workitems")
    @js.native
    open class ResourceProjectsLocationsJobsWorkitems protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocationsJobsWorkitems {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Locations$Snapshots")
    @js.native
    open class ResourceProjectsLocationsSnapshots protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocationsSnapshots {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Locations$Sql")
    @js.native
    open class ResourceProjectsLocationsSql protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocationsSql {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Locations$Templates")
    @js.native
    open class ResourceProjectsLocationsTemplates protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsLocationsTemplates {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Snapshots")
    @js.native
    open class ResourceProjectsSnapshots protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsSnapshots {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataflow", "dataflow_v1b3.Resource$Projects$Templates")
    @js.native
    open class ResourceProjectsTemplates protected ()
      extends typings.googleapis.v1b3Mod.dataflowV1b3.ResourceProjectsTemplates {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def dataflow_v1b3(version: v1b3): Dataflow = ^.asInstanceOf[js.Dynamic].applyDynamic("dataflow")(version.asInstanceOf[js.Any]).asInstanceOf[Dataflow]
}

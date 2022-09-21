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
import typings.googleapis.googleapisStrings.v1beta3
import typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3.Options
import typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3.Toolresults
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolresultsMod {
  
  @JSImport("googleapis/build/src/apis/toolresults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/toolresults", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/toolresults", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/toolresults", "VERSIONS.v1beta3")
    @js.native
    open class v1beta3 protected () extends Toolresults {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/toolresults", "VERSIONS.v1beta3")
    @js.native
    def v1beta3: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Toolresults
      ] = js.native
    inline def v1beta3_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Toolresults
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta3")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/toolresults", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/toolresults", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/toolresults", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/toolresults", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/toolresults", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/toolresults", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/toolresults", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/toolresults", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/toolresults", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/toolresults", "auth.OAuth2")
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
  
  inline def toolresults(options: Options): Toolresults = ^.asInstanceOf[js.Dynamic].applyDynamic("toolresults")(options.asInstanceOf[js.Any]).asInstanceOf[Toolresults]
  
  object toolresultsV1beta3 {
    
    @JSImport("googleapis/build/src/apis/toolresults", "toolresults_v1beta3.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/toolresults", "toolresults_v1beta3.Resource$Projects$Histories")
    @js.native
    open class ResourceProjectsHistories protected ()
      extends typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3.ResourceProjectsHistories {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/toolresults", "toolresults_v1beta3.Resource$Projects$Histories$Executions")
    @js.native
    open class ResourceProjectsHistoriesExecutions protected ()
      extends typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3.ResourceProjectsHistoriesExecutions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/toolresults", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Clusters")
    @js.native
    open class ResourceProjectsHistoriesExecutionsClusters protected ()
      extends typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3.ResourceProjectsHistoriesExecutionsClusters {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/toolresults", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Environments")
    @js.native
    open class ResourceProjectsHistoriesExecutionsEnvironments protected ()
      extends typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3.ResourceProjectsHistoriesExecutionsEnvironments {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/toolresults", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps")
    @js.native
    open class ResourceProjectsHistoriesExecutionsSteps protected ()
      extends typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3.ResourceProjectsHistoriesExecutionsSteps {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/toolresults", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps$Perfmetricssummary")
    @js.native
    open class ResourceProjectsHistoriesExecutionsStepsPerfmetricssummary protected ()
      extends typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3.ResourceProjectsHistoriesExecutionsStepsPerfmetricssummary {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/toolresults", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps$Perfsampleseries")
    @js.native
    open class ResourceProjectsHistoriesExecutionsStepsPerfsampleseries protected ()
      extends typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3.ResourceProjectsHistoriesExecutionsStepsPerfsampleseries {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/toolresults", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps$Perfsampleseries$Samples")
    @js.native
    open class ResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamples protected ()
      extends typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3.ResourceProjectsHistoriesExecutionsStepsPerfsampleseriesSamples {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/toolresults", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps$Testcases")
    @js.native
    open class ResourceProjectsHistoriesExecutionsStepsTestcases protected ()
      extends typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3.ResourceProjectsHistoriesExecutionsStepsTestcases {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/toolresults", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps$Thumbnails")
    @js.native
    open class ResourceProjectsHistoriesExecutionsStepsThumbnails protected ()
      extends typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3.ResourceProjectsHistoriesExecutionsStepsThumbnails {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/toolresults", "toolresults_v1beta3.Toolresults")
    @js.native
    open class Toolresults protected ()
      extends typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3.Toolresults {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
  }
  
  inline def toolresults_v1beta3(version: v1beta3): Toolresults = ^.asInstanceOf[js.Dynamic].applyDynamic("toolresults")(version.asInstanceOf[js.Any]).asInstanceOf[Toolresults]
}

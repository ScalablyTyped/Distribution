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
import typings.googleapis.cloudtasksV2Mod.cloudtasksV2.Cloudtasks
import typings.googleapis.cloudtasksV2Mod.cloudtasksV2.Options
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v2beta2
import typings.googleapis.googleapisStrings.v2beta3
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudtasksMod {
  
  @JSImport("googleapis/build/src/apis/cloudtasks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/cloudtasks", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudtasks", "VERSIONS.v2")
    @js.native
    open class v2 protected () extends Cloudtasks {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/cloudtasks", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Cloudtasks] = js.native
    inline def v2_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Cloudtasks]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudtasks", "VERSIONS.v2beta2")
    @js.native
    open class v2beta2 protected ()
      extends typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/cloudtasks", "VERSIONS.v2beta2")
    @js.native
    def v2beta2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks
      ] = js.native
    inline def v2beta2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2beta2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudtasks", "VERSIONS.v2beta3")
    @js.native
    open class v2beta3 protected ()
      extends typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/cloudtasks", "VERSIONS.v2beta3")
    @js.native
    def v2beta3: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks
      ] = js.native
    inline def v2beta3_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2beta3")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudtasks", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/cloudtasks", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/cloudtasks", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/cloudtasks", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudtasks", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudtasks", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudtasks", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/cloudtasks", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/cloudtasks", "auth.OAuth2")
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
  
  inline def cloudtasks(options: Options): Cloudtasks = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudtasks")(options.asInstanceOf[js.Any]).asInstanceOf[Cloudtasks]
  inline def cloudtasks(options: typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Options): typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudtasks")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks]
  inline def cloudtasks(options: typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Options): typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudtasks")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks]
  
  object cloudtasksV2 {
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks_v2.Cloudtasks")
    @js.native
    open class Cloudtasks protected ()
      extends typings.googleapis.cloudtasksV2Mod.cloudtasksV2.Cloudtasks {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks_v2.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.cloudtasksV2Mod.cloudtasksV2.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks_v2.Resource$Projects$Locations")
    @js.native
    open class ResourceProjectsLocations protected ()
      extends typings.googleapis.cloudtasksV2Mod.cloudtasksV2.ResourceProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks_v2.Resource$Projects$Locations$Queues")
    @js.native
    open class ResourceProjectsLocationsQueues protected ()
      extends typings.googleapis.cloudtasksV2Mod.cloudtasksV2.ResourceProjectsLocationsQueues {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks_v2.Resource$Projects$Locations$Queues$Tasks")
    @js.native
    open class ResourceProjectsLocationsQueuesTasks protected ()
      extends typings.googleapis.cloudtasksV2Mod.cloudtasksV2.ResourceProjectsLocationsQueuesTasks {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object cloudtasksV2beta2 {
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks_v2beta2.Cloudtasks")
    @js.native
    open class Cloudtasks protected ()
      extends typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks_v2beta2.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.v2beta2Mod.cloudtasksV2beta2.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks_v2beta2.Resource$Projects$Locations")
    @js.native
    open class ResourceProjectsLocations protected ()
      extends typings.googleapis.v2beta2Mod.cloudtasksV2beta2.ResourceProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks_v2beta2.Resource$Projects$Locations$Queues")
    @js.native
    open class ResourceProjectsLocationsQueues protected ()
      extends typings.googleapis.v2beta2Mod.cloudtasksV2beta2.ResourceProjectsLocationsQueues {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks_v2beta2.Resource$Projects$Locations$Queues$Tasks")
    @js.native
    open class ResourceProjectsLocationsQueuesTasks protected ()
      extends typings.googleapis.v2beta2Mod.cloudtasksV2beta2.ResourceProjectsLocationsQueuesTasks {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object cloudtasksV2beta3 {
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks_v2beta3.Cloudtasks")
    @js.native
    open class Cloudtasks protected ()
      extends typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks_v2beta3.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.v2beta3Mod.cloudtasksV2beta3.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks_v2beta3.Resource$Projects$Locations")
    @js.native
    open class ResourceProjectsLocations protected ()
      extends typings.googleapis.v2beta3Mod.cloudtasksV2beta3.ResourceProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks_v2beta3.Resource$Projects$Locations$Queues")
    @js.native
    open class ResourceProjectsLocationsQueues protected ()
      extends typings.googleapis.v2beta3Mod.cloudtasksV2beta3.ResourceProjectsLocationsQueues {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks_v2beta3.Resource$Projects$Locations$Queues$Tasks")
    @js.native
    open class ResourceProjectsLocationsQueuesTasks protected ()
      extends typings.googleapis.v2beta3Mod.cloudtasksV2beta3.ResourceProjectsLocationsQueuesTasks {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def cloudtasks_v2(version: v2): Cloudtasks = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudtasks")(version.asInstanceOf[js.Any]).asInstanceOf[Cloudtasks]
  
  inline def cloudtasks_v2beta2(version: v2beta2): typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudtasks")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks]
  
  inline def cloudtasks_v2beta3(version: v2beta3): typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudtasks")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks]
}

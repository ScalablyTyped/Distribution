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
import typings.googleapis.pubsubliteV1Mod.pubsubliteV1.Options
import typings.googleapis.pubsubliteV1Mod.pubsubliteV1.Pubsublite
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pubsubliteMod {
  
  @JSImport("googleapis/build/src/apis/pubsublite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/pubsublite", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/pubsublite", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsublite", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Pubsublite {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/pubsublite", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Pubsublite] = js.native
    inline def v1_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Pubsublite]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/pubsublite", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsublite", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/pubsublite", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/pubsublite", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/pubsublite", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsublite", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsublite", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsublite", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/pubsublite", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/pubsublite", "auth.OAuth2")
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
  
  inline def pubsublite(options: Options): Pubsublite = ^.asInstanceOf[js.Dynamic].applyDynamic("pubsublite")(options.asInstanceOf[js.Any]).asInstanceOf[Pubsublite]
  
  object pubsubliteV1 {
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Pubsublite")
    @js.native
    open class Pubsublite protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.Pubsublite {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Admin")
    @js.native
    open class ResourceAdmin protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceAdmin {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Admin$Projects")
    @js.native
    open class ResourceAdminProjects protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceAdminProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Admin$Projects$Locations")
    @js.native
    open class ResourceAdminProjectsLocations protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceAdminProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Admin$Projects$Locations$Operations")
    @js.native
    open class ResourceAdminProjectsLocationsOperations protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceAdminProjectsLocationsOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Admin$Projects$Locations$Reservations")
    @js.native
    open class ResourceAdminProjectsLocationsReservations protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceAdminProjectsLocationsReservations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Admin$Projects$Locations$Reservations$Topics")
    @js.native
    open class ResourceAdminProjectsLocationsReservationsTopics protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceAdminProjectsLocationsReservationsTopics {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Admin$Projects$Locations$Subscriptions")
    @js.native
    open class ResourceAdminProjectsLocationsSubscriptions protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceAdminProjectsLocationsSubscriptions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Admin$Projects$Locations$Topics")
    @js.native
    open class ResourceAdminProjectsLocationsTopics protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceAdminProjectsLocationsTopics {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Admin$Projects$Locations$Topics$Subscriptions")
    @js.native
    open class ResourceAdminProjectsLocationsTopicsSubscriptions protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceAdminProjectsLocationsTopicsSubscriptions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Cursor")
    @js.native
    open class ResourceCursor protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceCursor {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Cursor$Projects")
    @js.native
    open class ResourceCursorProjects protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceCursorProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Cursor$Projects$Locations")
    @js.native
    open class ResourceCursorProjectsLocations protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceCursorProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Cursor$Projects$Locations$Subscriptions")
    @js.native
    open class ResourceCursorProjectsLocationsSubscriptions protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceCursorProjectsLocationsSubscriptions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Cursor$Projects$Locations$Subscriptions$Cursors")
    @js.native
    open class ResourceCursorProjectsLocationsSubscriptionsCursors protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceCursorProjectsLocationsSubscriptionsCursors {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Topicstats")
    @js.native
    open class ResourceTopicstats protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceTopicstats {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Topicstats$Projects")
    @js.native
    open class ResourceTopicstatsProjects protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceTopicstatsProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Topicstats$Projects$Locations")
    @js.native
    open class ResourceTopicstatsProjectsLocations protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceTopicstatsProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsublite", "pubsublite_v1.Resource$Topicstats$Projects$Locations$Topics")
    @js.native
    open class ResourceTopicstatsProjectsLocationsTopics protected ()
      extends typings.googleapis.pubsubliteV1Mod.pubsubliteV1.ResourceTopicstatsProjectsLocationsTopics {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def pubsublite_v1(version: v1): Pubsublite = ^.asInstanceOf[js.Dynamic].applyDynamic("pubsublite")(version.asInstanceOf[js.Any]).asInstanceOf[Pubsublite]
}

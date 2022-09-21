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
import typings.googleapis.dataplexV1Mod.dataplexV1.Dataplex
import typings.googleapis.dataplexV1Mod.dataplexV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataplexMod {
  
  @JSImport("googleapis/build/src/apis/dataplex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/dataplex", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/dataplex", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dataplex", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Dataplex {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/dataplex", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Dataplex] = js.native
    inline def v1_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Dataplex]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/dataplex", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dataplex", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/dataplex", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/dataplex", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/dataplex", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dataplex", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dataplex", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dataplex", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/dataplex", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/dataplex", "auth.OAuth2")
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
  
  inline def dataplex(options: Options): Dataplex = ^.asInstanceOf[js.Dynamic].applyDynamic("dataplex")(options.asInstanceOf[js.Any]).asInstanceOf[Dataplex]
  
  object dataplexV1 {
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Dataplex")
    @js.native
    open class Dataplex protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.Dataplex {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects$Locations")
    @js.native
    open class ResourceProjectsLocations protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects$Locations$Lakes")
    @js.native
    open class ResourceProjectsLocationsLakes protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjectsLocationsLakes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects$Locations$Lakes$Actions")
    @js.native
    open class ResourceProjectsLocationsLakesActions protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjectsLocationsLakesActions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects$Locations$Lakes$Content")
    @js.native
    open class ResourceProjectsLocationsLakesContent protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjectsLocationsLakesContent {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects$Locations$Lakes$Contentitems")
    @js.native
    open class ResourceProjectsLocationsLakesContentitems protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjectsLocationsLakesContentitems {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects$Locations$Lakes$Environments")
    @js.native
    open class ResourceProjectsLocationsLakesEnvironments protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjectsLocationsLakesEnvironments {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects$Locations$Lakes$Environments$Sessions")
    @js.native
    open class ResourceProjectsLocationsLakesEnvironmentsSessions protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjectsLocationsLakesEnvironmentsSessions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects$Locations$Lakes$Tasks")
    @js.native
    open class ResourceProjectsLocationsLakesTasks protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjectsLocationsLakesTasks {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects$Locations$Lakes$Tasks$Jobs")
    @js.native
    open class ResourceProjectsLocationsLakesTasksJobs protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjectsLocationsLakesTasksJobs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects$Locations$Lakes$Zones")
    @js.native
    open class ResourceProjectsLocationsLakesZones protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjectsLocationsLakesZones {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects$Locations$Lakes$Zones$Actions")
    @js.native
    open class ResourceProjectsLocationsLakesZonesActions protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjectsLocationsLakesZonesActions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects$Locations$Lakes$Zones$Assets")
    @js.native
    open class ResourceProjectsLocationsLakesZonesAssets protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjectsLocationsLakesZonesAssets {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects$Locations$Lakes$Zones$Assets$Actions")
    @js.native
    open class ResourceProjectsLocationsLakesZonesAssetsActions protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjectsLocationsLakesZonesAssetsActions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects$Locations$Lakes$Zones$Entities")
    @js.native
    open class ResourceProjectsLocationsLakesZonesEntities protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjectsLocationsLakesZonesEntities {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects$Locations$Lakes$Zones$Entities$Partitions")
    @js.native
    open class ResourceProjectsLocationsLakesZonesEntitiesPartitions protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjectsLocationsLakesZonesEntitiesPartitions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dataplex", "dataplex_v1.Resource$Projects$Locations$Operations")
    @js.native
    open class ResourceProjectsLocationsOperations protected ()
      extends typings.googleapis.dataplexV1Mod.dataplexV1.ResourceProjectsLocationsOperations {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def dataplex_v1(version: v1): Dataplex = ^.asInstanceOf[js.Dynamic].applyDynamic("dataplex")(version.asInstanceOf[js.Any]).asInstanceOf[Dataplex]
}

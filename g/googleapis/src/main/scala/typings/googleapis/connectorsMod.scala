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
import typings.googleapis.connectorsV1Mod.connectorsV1.Connectors
import typings.googleapis.connectorsV1Mod.connectorsV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v2
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectorsMod {
  
  @JSImport("googleapis/build/src/apis/connectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/connectors", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/connectors", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/connectors", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Connectors {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/connectors", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Connectors] = js.native
    inline def v1_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Connectors]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/connectors", "VERSIONS.v2")
    @js.native
    open class v2 protected ()
      extends typings.googleapis.connectorsV2Mod.connectorsV2.Connectors {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/connectors", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.connectorsV2Mod.connectorsV2.Connectors
      ] = js.native
    inline def v2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.connectorsV2Mod.connectorsV2.Connectors
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/connectors", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/connectors", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/connectors", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/connectors", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/connectors", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/connectors", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/connectors", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/connectors", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/connectors", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/connectors", "auth.OAuth2")
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
  
  inline def connectors(options: Options): Connectors = ^.asInstanceOf[js.Dynamic].applyDynamic("connectors")(options.asInstanceOf[js.Any]).asInstanceOf[Connectors]
  inline def connectors(options: typings.googleapis.connectorsV2Mod.connectorsV2.Options): typings.googleapis.connectorsV2Mod.connectorsV2.Connectors = ^.asInstanceOf[js.Dynamic].applyDynamic("connectors")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.connectorsV2Mod.connectorsV2.Connectors]
  
  object connectorsV1 {
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v1.Connectors")
    @js.native
    open class Connectors protected ()
      extends typings.googleapis.connectorsV1Mod.connectorsV1.Connectors {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.connectorsV1Mod.connectorsV1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v1.Resource$Projects$Locations")
    @js.native
    open class ResourceProjectsLocations protected ()
      extends typings.googleapis.connectorsV1Mod.connectorsV1.ResourceProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v1.Resource$Projects$Locations$Connections")
    @js.native
    open class ResourceProjectsLocationsConnections protected ()
      extends typings.googleapis.connectorsV1Mod.connectorsV1.ResourceProjectsLocationsConnections {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v1.Resource$Projects$Locations$Connections$Runtimeactionschemas")
    @js.native
    open class ResourceProjectsLocationsConnectionsRuntimeactionschemas protected ()
      extends typings.googleapis.connectorsV1Mod.connectorsV1.ResourceProjectsLocationsConnectionsRuntimeactionschemas {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v1.Resource$Projects$Locations$Connections$Runtimeentityschemas")
    @js.native
    open class ResourceProjectsLocationsConnectionsRuntimeentityschemas protected ()
      extends typings.googleapis.connectorsV1Mod.connectorsV1.ResourceProjectsLocationsConnectionsRuntimeentityschemas {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v1.Resource$Projects$Locations$Operations")
    @js.native
    open class ResourceProjectsLocationsOperations protected ()
      extends typings.googleapis.connectorsV1Mod.connectorsV1.ResourceProjectsLocationsOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v1.Resource$Projects$Locations$Providers")
    @js.native
    open class ResourceProjectsLocationsProviders protected ()
      extends typings.googleapis.connectorsV1Mod.connectorsV1.ResourceProjectsLocationsProviders {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v1.Resource$Projects$Locations$Providers$Connectors")
    @js.native
    open class ResourceProjectsLocationsProvidersConnectors protected ()
      extends typings.googleapis.connectorsV1Mod.connectorsV1.ResourceProjectsLocationsProvidersConnectors {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v1.Resource$Projects$Locations$Providers$Connectors$Versions")
    @js.native
    open class ResourceProjectsLocationsProvidersConnectorsVersions protected ()
      extends typings.googleapis.connectorsV1Mod.connectorsV1.ResourceProjectsLocationsProvidersConnectorsVersions {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object connectorsV2 {
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v2.Connectors")
    @js.native
    open class Connectors protected ()
      extends typings.googleapis.connectorsV2Mod.connectorsV2.Connectors {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v2.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.connectorsV2Mod.connectorsV2.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v2.Resource$Projects$Locations")
    @js.native
    open class ResourceProjectsLocations protected ()
      extends typings.googleapis.connectorsV2Mod.connectorsV2.ResourceProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v2.Resource$Projects$Locations$Connections")
    @js.native
    open class ResourceProjectsLocationsConnections protected ()
      extends typings.googleapis.connectorsV2Mod.connectorsV2.ResourceProjectsLocationsConnections {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v2.Resource$Projects$Locations$Connections$Actions")
    @js.native
    open class ResourceProjectsLocationsConnectionsActions protected ()
      extends typings.googleapis.connectorsV2Mod.connectorsV2.ResourceProjectsLocationsConnectionsActions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v2.Resource$Projects$Locations$Connections$Entitytypes")
    @js.native
    open class ResourceProjectsLocationsConnectionsEntitytypes protected ()
      extends typings.googleapis.connectorsV2Mod.connectorsV2.ResourceProjectsLocationsConnectionsEntitytypes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/connectors", "connectors_v2.Resource$Projects$Locations$Connections$Entitytypes$Entities")
    @js.native
    open class ResourceProjectsLocationsConnectionsEntitytypesEntities protected ()
      extends typings.googleapis.connectorsV2Mod.connectorsV2.ResourceProjectsLocationsConnectionsEntitytypesEntities {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def connectors_v1(version: v1): Connectors = ^.asInstanceOf[js.Dynamic].applyDynamic("connectors")(version.asInstanceOf[js.Any]).asInstanceOf[Connectors]
  
  inline def connectors_v2(version: v2): typings.googleapis.connectorsV2Mod.connectorsV2.Connectors = ^.asInstanceOf[js.Dynamic].applyDynamic("connectors")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.connectorsV2Mod.connectorsV2.Connectors]
}

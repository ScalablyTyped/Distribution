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
import typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1.Options
import typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1.Servicenetworking
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicenetworkingMod {
  
  @JSImport("googleapis/build/src/apis/servicenetworking", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/servicenetworking", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/servicenetworking", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Servicenetworking {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/servicenetworking", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Servicenetworking
      ] = js.native
    inline def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Servicenetworking
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/servicenetworking", "VERSIONS.v1beta")
    @js.native
    open class v1beta protected ()
      extends typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/servicenetworking", "VERSIONS.v1beta")
    @js.native
    def v1beta: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking
      ] = js.native
    inline def v1beta_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/servicenetworking", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/servicenetworking", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/servicenetworking", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/servicenetworking", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/servicenetworking", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/servicenetworking", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/servicenetworking", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/servicenetworking", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/servicenetworking", "auth.OAuth2")
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
  
  inline def servicenetworking(options: Options): Servicenetworking = ^.asInstanceOf[js.Dynamic].applyDynamic("servicenetworking")(options.asInstanceOf[js.Any]).asInstanceOf[Servicenetworking]
  inline def servicenetworking(options: typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Options): typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking = ^.asInstanceOf[js.Dynamic].applyDynamic("servicenetworking")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking]
  
  object servicenetworkingV1 {
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "servicenetworking_v1.Resource$Operations")
    @js.native
    open class ResourceOperations protected ()
      extends typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1.ResourceOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "servicenetworking_v1.Resource$Services")
    @js.native
    open class ResourceServices protected ()
      extends typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1.ResourceServices {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "servicenetworking_v1.Resource$Services$Connections")
    @js.native
    open class ResourceServicesConnections protected ()
      extends typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1.ResourceServicesConnections {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "servicenetworking_v1.Resource$Services$Dnsrecordsets")
    @js.native
    open class ResourceServicesDnsrecordsets protected ()
      extends typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1.ResourceServicesDnsrecordsets {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "servicenetworking_v1.Resource$Services$Dnszones")
    @js.native
    open class ResourceServicesDnszones protected ()
      extends typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1.ResourceServicesDnszones {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "servicenetworking_v1.Resource$Services$Projects")
    @js.native
    open class ResourceServicesProjects protected ()
      extends typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1.ResourceServicesProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "servicenetworking_v1.Resource$Services$Projects$Global")
    @js.native
    open class ResourceServicesProjectsGlobal protected ()
      extends typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1.ResourceServicesProjectsGlobal {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "servicenetworking_v1.Resource$Services$Projects$Global$Networks")
    @js.native
    open class ResourceServicesProjectsGlobalNetworks protected ()
      extends typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1.ResourceServicesProjectsGlobalNetworks {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "servicenetworking_v1.Resource$Services$Projects$Global$Networks$Peereddnsdomains")
    @js.native
    open class ResourceServicesProjectsGlobalNetworksPeereddnsdomains protected ()
      extends typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1.ResourceServicesProjectsGlobalNetworksPeereddnsdomains {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "servicenetworking_v1.Resource$Services$Roles")
    @js.native
    open class ResourceServicesRoles protected ()
      extends typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1.ResourceServicesRoles {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "servicenetworking_v1.Servicenetworking")
    @js.native
    open class Servicenetworking protected ()
      extends typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1.Servicenetworking {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
  }
  
  object servicenetworkingV1beta {
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "servicenetworking_v1beta.Resource$Operations")
    @js.native
    open class ResourceOperations protected ()
      extends typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.ResourceOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "servicenetworking_v1beta.Resource$Services")
    @js.native
    open class ResourceServices protected ()
      extends typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.ResourceServices {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "servicenetworking_v1beta.Resource$Services$Connections")
    @js.native
    open class ResourceServicesConnections protected ()
      extends typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.ResourceServicesConnections {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/servicenetworking", "servicenetworking_v1beta.Servicenetworking")
    @js.native
    open class Servicenetworking protected ()
      extends typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
  }
  
  inline def servicenetworking_v1(version: v1): Servicenetworking = ^.asInstanceOf[js.Dynamic].applyDynamic("servicenetworking")(version.asInstanceOf[js.Any]).asInstanceOf[Servicenetworking]
  
  inline def servicenetworking_v1beta(version: v1beta): typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking = ^.asInstanceOf[js.Dynamic].applyDynamic("servicenetworking")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking]
}

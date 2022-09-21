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
import typings.googleapis.googleapisStrings.v1beta2
import typings.googleapis.memcacheV1Mod.memcacheV1.Memcache
import typings.googleapis.memcacheV1Mod.memcacheV1.Options
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memcacheMod {
  
  @JSImport("googleapis/build/src/apis/memcache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/memcache", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/memcache", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/memcache", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Memcache {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/memcache", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Memcache] = js.native
    inline def v1_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Memcache]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/memcache", "VERSIONS.v1beta2")
    @js.native
    open class v1beta2 protected ()
      extends typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2.Memcache {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/memcache", "VERSIONS.v1beta2")
    @js.native
    def v1beta2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2.Memcache
      ] = js.native
    inline def v1beta2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2.Memcache
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta2")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/memcache", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/memcache", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/memcache", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/memcache", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/memcache", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/memcache", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/memcache", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/memcache", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/memcache", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/memcache", "auth.OAuth2")
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
  
  inline def memcache(options: Options): Memcache = ^.asInstanceOf[js.Dynamic].applyDynamic("memcache")(options.asInstanceOf[js.Any]).asInstanceOf[Memcache]
  inline def memcache(options: typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2.Options): typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2.Memcache = ^.asInstanceOf[js.Dynamic].applyDynamic("memcache")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2.Memcache]
  
  object memcacheV1 {
    
    @JSImport("googleapis/build/src/apis/memcache", "memcache_v1.Memcache")
    @js.native
    open class Memcache protected ()
      extends typings.googleapis.memcacheV1Mod.memcacheV1.Memcache {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/memcache", "memcache_v1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.memcacheV1Mod.memcacheV1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/memcache", "memcache_v1.Resource$Projects$Locations")
    @js.native
    open class ResourceProjectsLocations protected ()
      extends typings.googleapis.memcacheV1Mod.memcacheV1.ResourceProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/memcache", "memcache_v1.Resource$Projects$Locations$Instances")
    @js.native
    open class ResourceProjectsLocationsInstances protected ()
      extends typings.googleapis.memcacheV1Mod.memcacheV1.ResourceProjectsLocationsInstances {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/memcache", "memcache_v1.Resource$Projects$Locations$Operations")
    @js.native
    open class ResourceProjectsLocationsOperations protected ()
      extends typings.googleapis.memcacheV1Mod.memcacheV1.ResourceProjectsLocationsOperations {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object memcacheV1beta2 {
    
    @JSImport("googleapis/build/src/apis/memcache", "memcache_v1beta2.Memcache")
    @js.native
    open class Memcache protected ()
      extends typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2.Memcache {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/memcache", "memcache_v1beta2.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/memcache", "memcache_v1beta2.Resource$Projects$Locations")
    @js.native
    open class ResourceProjectsLocations protected ()
      extends typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2.ResourceProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/memcache", "memcache_v1beta2.Resource$Projects$Locations$Instances")
    @js.native
    open class ResourceProjectsLocationsInstances protected ()
      extends typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2.ResourceProjectsLocationsInstances {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/memcache", "memcache_v1beta2.Resource$Projects$Locations$Operations")
    @js.native
    open class ResourceProjectsLocationsOperations protected ()
      extends typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2.ResourceProjectsLocationsOperations {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def memcache_v1(version: v1): Memcache = ^.asInstanceOf[js.Dynamic].applyDynamic("memcache")(version.asInstanceOf[js.Any]).asInstanceOf[Memcache]
  
  inline def memcache_v1beta2(version: v1beta2): typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2.Memcache = ^.asInstanceOf[js.Dynamic].applyDynamic("memcache")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2.Memcache]
}

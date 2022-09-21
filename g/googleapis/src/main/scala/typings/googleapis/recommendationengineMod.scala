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
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1.Options
import typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1.Recommendationengine
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recommendationengineMod {
  
  @JSImport("googleapis/build/src/apis/recommendationengine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/recommendationengine", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/recommendationengine", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/recommendationengine", "VERSIONS.v1beta1")
    @js.native
    open class v1beta1 protected () extends Recommendationengine {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/recommendationengine", "VERSIONS.v1beta1")
    @js.native
    def v1beta1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Recommendationengine
      ] = js.native
    inline def v1beta1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Recommendationengine
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/recommendationengine", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/recommendationengine", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/recommendationengine", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/recommendationengine", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/recommendationengine", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/recommendationengine", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/recommendationengine", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/recommendationengine", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/recommendationengine", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/recommendationengine", "auth.OAuth2")
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
  
  inline def recommendationengine(options: Options): Recommendationengine = ^.asInstanceOf[js.Dynamic].applyDynamic("recommendationengine")(options.asInstanceOf[js.Any]).asInstanceOf[Recommendationengine]
  
  object recommendationengineV1beta1 {
    
    @JSImport("googleapis/build/src/apis/recommendationengine", "recommendationengine_v1beta1.Recommendationengine")
    @js.native
    open class Recommendationengine protected ()
      extends typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1.Recommendationengine {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/recommendationengine", "recommendationengine_v1beta1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/recommendationengine", "recommendationengine_v1beta1.Resource$Projects$Locations")
    @js.native
    open class ResourceProjectsLocations protected ()
      extends typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1.ResourceProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/recommendationengine", "recommendationengine_v1beta1.Resource$Projects$Locations$Catalogs")
    @js.native
    open class ResourceProjectsLocationsCatalogs protected ()
      extends typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1.ResourceProjectsLocationsCatalogs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/recommendationengine", "recommendationengine_v1beta1.Resource$Projects$Locations$Catalogs$Catalogitems")
    @js.native
    open class ResourceProjectsLocationsCatalogsCatalogitems protected ()
      extends typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1.ResourceProjectsLocationsCatalogsCatalogitems {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/recommendationengine", "recommendationengine_v1beta1.Resource$Projects$Locations$Catalogs$Eventstores")
    @js.native
    open class ResourceProjectsLocationsCatalogsEventstores protected ()
      extends typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1.ResourceProjectsLocationsCatalogsEventstores {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/recommendationengine", "recommendationengine_v1beta1.Resource$Projects$Locations$Catalogs$Eventstores$Operations")
    @js.native
    open class ResourceProjectsLocationsCatalogsEventstoresOperations protected ()
      extends typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1.ResourceProjectsLocationsCatalogsEventstoresOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/recommendationengine", "recommendationengine_v1beta1.Resource$Projects$Locations$Catalogs$Eventstores$Placements")
    @js.native
    open class ResourceProjectsLocationsCatalogsEventstoresPlacements protected ()
      extends typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1.ResourceProjectsLocationsCatalogsEventstoresPlacements {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/recommendationengine", "recommendationengine_v1beta1.Resource$Projects$Locations$Catalogs$Eventstores$Predictionapikeyregistrations")
    @js.native
    open class ResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrations protected ()
      extends typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1.ResourceProjectsLocationsCatalogsEventstoresPredictionapikeyregistrations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/recommendationengine", "recommendationengine_v1beta1.Resource$Projects$Locations$Catalogs$Eventstores$Userevents")
    @js.native
    open class ResourceProjectsLocationsCatalogsEventstoresUserevents protected ()
      extends typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1.ResourceProjectsLocationsCatalogsEventstoresUserevents {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/recommendationengine", "recommendationengine_v1beta1.Resource$Projects$Locations$Catalogs$Operations")
    @js.native
    open class ResourceProjectsLocationsCatalogsOperations protected ()
      extends typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1.ResourceProjectsLocationsCatalogsOperations {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def recommendationengine_v1beta1(version: v1beta1): Recommendationengine = ^.asInstanceOf[js.Dynamic].applyDynamic("recommendationengine")(version.asInstanceOf[js.Any]).asInstanceOf[Recommendationengine]
}

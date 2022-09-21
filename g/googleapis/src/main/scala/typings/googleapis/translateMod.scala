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
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v3
import typings.googleapis.googleapisStrings.v3beta1
import typings.googleapis.translateV2Mod.translateV2.Options
import typings.googleapis.translateV2Mod.translateV2.Translate
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object translateMod {
  
  @JSImport("googleapis/build/src/apis/translate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/translate", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/translate", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/translate", "VERSIONS.v2")
    @js.native
    open class v2 protected () extends Translate {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/translate", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Translate] = js.native
    inline def v2_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Translate]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/translate", "VERSIONS.v3")
    @js.native
    open class v3 protected ()
      extends typings.googleapis.translateV3Mod.translateV3.Translate {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/translate", "VERSIONS.v3")
    @js.native
    def v3: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.translateV3Mod.translateV3.Translate
      ] = js.native
    inline def v3_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.translateV3Mod.translateV3.Translate
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/translate", "VERSIONS.v3beta1")
    @js.native
    open class v3beta1 protected ()
      extends typings.googleapis.translateV3beta1Mod.translateV3beta1.Translate {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/translate", "VERSIONS.v3beta1")
    @js.native
    def v3beta1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.translateV3beta1Mod.translateV3beta1.Translate
      ] = js.native
    inline def v3beta1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.translateV3beta1Mod.translateV3beta1.Translate
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3beta1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/translate", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/translate", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/translate", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/translate", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/translate", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/translate", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/translate", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/translate", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/translate", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/translate", "auth.OAuth2")
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
  
  inline def translate(options: Options): Translate = ^.asInstanceOf[js.Dynamic].applyDynamic("translate")(options.asInstanceOf[js.Any]).asInstanceOf[Translate]
  inline def translate(options: typings.googleapis.translateV3Mod.translateV3.Options): typings.googleapis.translateV3Mod.translateV3.Translate = ^.asInstanceOf[js.Dynamic].applyDynamic("translate")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.translateV3Mod.translateV3.Translate]
  inline def translate(options: typings.googleapis.translateV3beta1Mod.translateV3beta1.Options): typings.googleapis.translateV3beta1Mod.translateV3beta1.Translate = ^.asInstanceOf[js.Dynamic].applyDynamic("translate")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.translateV3beta1Mod.translateV3beta1.Translate]
  
  object translateV2 {
    
    @JSImport("googleapis/build/src/apis/translate", "translate_v2.Resource$Detections")
    @js.native
    open class ResourceDetections protected ()
      extends typings.googleapis.translateV2Mod.translateV2.ResourceDetections {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/translate", "translate_v2.Resource$Languages")
    @js.native
    open class ResourceLanguages protected ()
      extends typings.googleapis.translateV2Mod.translateV2.ResourceLanguages {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/translate", "translate_v2.Resource$Translations")
    @js.native
    open class ResourceTranslations protected ()
      extends typings.googleapis.translateV2Mod.translateV2.ResourceTranslations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/translate", "translate_v2.Translate")
    @js.native
    open class Translate protected ()
      extends typings.googleapis.translateV2Mod.translateV2.Translate {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
  }
  
  object translateV3 {
    
    @JSImport("googleapis/build/src/apis/translate", "translate_v3.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.translateV3Mod.translateV3.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/translate", "translate_v3.Resource$Projects$Locations")
    @js.native
    open class ResourceProjectsLocations protected ()
      extends typings.googleapis.translateV3Mod.translateV3.ResourceProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/translate", "translate_v3.Resource$Projects$Locations$Glossaries")
    @js.native
    open class ResourceProjectsLocationsGlossaries protected ()
      extends typings.googleapis.translateV3Mod.translateV3.ResourceProjectsLocationsGlossaries {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/translate", "translate_v3.Resource$Projects$Locations$Glossaries$Glossaryentries")
    @js.native
    open class ResourceProjectsLocationsGlossariesGlossaryentries protected ()
      extends typings.googleapis.translateV3Mod.translateV3.ResourceProjectsLocationsGlossariesGlossaryentries {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/translate", "translate_v3.Resource$Projects$Locations$Operations")
    @js.native
    open class ResourceProjectsLocationsOperations protected ()
      extends typings.googleapis.translateV3Mod.translateV3.ResourceProjectsLocationsOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/translate", "translate_v3.Translate")
    @js.native
    open class Translate protected ()
      extends typings.googleapis.translateV3Mod.translateV3.Translate {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
  }
  
  object translateV3beta1 {
    
    @JSImport("googleapis/build/src/apis/translate", "translate_v3beta1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.translateV3beta1Mod.translateV3beta1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/translate", "translate_v3beta1.Resource$Projects$Locations")
    @js.native
    open class ResourceProjectsLocations protected ()
      extends typings.googleapis.translateV3beta1Mod.translateV3beta1.ResourceProjectsLocations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/translate", "translate_v3beta1.Resource$Projects$Locations$Glossaries")
    @js.native
    open class ResourceProjectsLocationsGlossaries protected ()
      extends typings.googleapis.translateV3beta1Mod.translateV3beta1.ResourceProjectsLocationsGlossaries {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/translate", "translate_v3beta1.Resource$Projects$Locations$Operations")
    @js.native
    open class ResourceProjectsLocationsOperations protected ()
      extends typings.googleapis.translateV3beta1Mod.translateV3beta1.ResourceProjectsLocationsOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/translate", "translate_v3beta1.Translate")
    @js.native
    open class Translate protected ()
      extends typings.googleapis.translateV3beta1Mod.translateV3beta1.Translate {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
  }
  
  inline def translate_v2(version: v2): Translate = ^.asInstanceOf[js.Dynamic].applyDynamic("translate")(version.asInstanceOf[js.Any]).asInstanceOf[Translate]
  
  inline def translate_v3(version: v3): typings.googleapis.translateV3Mod.translateV3.Translate = ^.asInstanceOf[js.Dynamic].applyDynamic("translate")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.translateV3Mod.translateV3.Translate]
  
  inline def translate_v3beta1(version: v3beta1): typings.googleapis.translateV3beta1Mod.translateV3beta1.Translate = ^.asInstanceOf[js.Dynamic].applyDynamic("translate")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.translateV3beta1Mod.translateV3beta1.Translate]
}

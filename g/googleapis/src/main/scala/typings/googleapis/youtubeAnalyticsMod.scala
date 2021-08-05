package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.youtubeAnalyticsV1Mod.youtubeAnalyticsV1.Options
import typings.googleapis.youtubeAnalyticsV1Mod.youtubeAnalyticsV1.Youtubeanalytics
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object youtubeAnalyticsMod {
  
  @JSImport("googleapis/build/src/apis/youtubeAnalytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/youtubeAnalytics", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/youtubeAnalytics", "VERSIONS.v1")
    @js.native
    class v1 protected () extends Youtubeanalytics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/youtubeAnalytics", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Youtubeanalytics
      ] = js.native
    inline def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Youtubeanalytics
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/youtubeAnalytics", "VERSIONS.v1beta1")
    @js.native
    class v1beta1 protected ()
      extends typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.Youtubeanalytics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/youtubeAnalytics", "VERSIONS.v1beta1")
    @js.native
    def v1beta1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.Youtubeanalytics
      ] = js.native
    inline def v1beta1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.Youtubeanalytics
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/youtubeAnalytics", "VERSIONS.v2")
    @js.native
    class v2 protected ()
      extends typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2.Youtubeanalytics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/youtubeAnalytics", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2.Youtubeanalytics
      ] = js.native
    inline def v2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2.Youtubeanalytics
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/youtubeAnalytics", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/youtubeAnalytics", "auth.Compute")
    @js.native
    /**
      * Google Compute Engine service account credentials.
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    class Compute ()
      extends typings.googleAuthLibrary.mod.Compute
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/youtubeAnalytics", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/youtubeAnalytics", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[js.Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/youtubeAnalytics", "auth.JWT")
    @js.native
    class JWT protected ()
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
    @JSImport("googleapis/build/src/apis/youtubeAnalytics", "auth.OAuth2")
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
    class OAuth2 () extends OAuth2Client
    
    type _To = AuthPlus
    
    /* This means you don't have to write `^`, but can instead just say `auth.foo` */
    override def _to: AuthPlus = ^
  }
  
  inline def youtubeAnalytics(options: Options): Youtubeanalytics = ^.asInstanceOf[js.Dynamic].applyDynamic("youtubeAnalytics")(options.asInstanceOf[js.Any]).asInstanceOf[Youtubeanalytics]
  inline def youtubeAnalytics(options: typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.Options): typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.Youtubeanalytics = ^.asInstanceOf[js.Dynamic].applyDynamic("youtubeAnalytics")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.Youtubeanalytics]
  inline def youtubeAnalytics(options: typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2.Options): typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2.Youtubeanalytics = ^.asInstanceOf[js.Dynamic].applyDynamic("youtubeAnalytics")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2.Youtubeanalytics]
  
  inline def youtubeAnalytics_v1(version: v1): Youtubeanalytics = ^.asInstanceOf[js.Dynamic].applyDynamic("youtubeAnalytics")(version.asInstanceOf[js.Any]).asInstanceOf[Youtubeanalytics]
  
  inline def youtubeAnalytics_v1beta1(version: v1beta1): typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.Youtubeanalytics = ^.asInstanceOf[js.Dynamic].applyDynamic("youtubeAnalytics")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1.Youtubeanalytics]
  
  inline def youtubeAnalytics_v2(version: v2): typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2.Youtubeanalytics = ^.asInstanceOf[js.Dynamic].applyDynamic("youtubeAnalytics")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2.Youtubeanalytics]
}

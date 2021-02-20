package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v4
import typings.googleapis.googleapisStrings.v5
import typings.googleapis.pagespeedonlineV1Mod.pagespeedonlineV1.Options
import typings.googleapis.pagespeedonlineV1Mod.pagespeedonlineV1.Pagespeedonline
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagespeedonlineMod {
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/pagespeedonline", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pagespeedonline", "VERSIONS.v1")
    @js.native
    class v1 protected () extends Pagespeedonline {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/pagespeedonline", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Pagespeedonline
      ] = js.native
    @scala.inline
    def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Pagespeedonline
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pagespeedonline", "VERSIONS.v2")
    @js.native
    class v2 protected ()
      extends typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.Pagespeedonline {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/pagespeedonline", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.Pagespeedonline
      ] = js.native
    @scala.inline
    def v2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.Pagespeedonline
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pagespeedonline", "VERSIONS.v4")
    @js.native
    class v4 protected ()
      extends typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Pagespeedonline {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/pagespeedonline", "VERSIONS.v4")
    @js.native
    def v4: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Pagespeedonline
      ] = js.native
    @scala.inline
    def v4_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Pagespeedonline
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v4")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pagespeedonline", "VERSIONS.v5")
    @js.native
    class v5 protected ()
      extends typings.googleapis.v5Mod.pagespeedonlineV5.Pagespeedonline {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/pagespeedonline", "VERSIONS.v5")
    @js.native
    def v5: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v5Mod.pagespeedonlineV5.Pagespeedonline
      ] = js.native
    @scala.inline
    def v5_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v5Mod.pagespeedonlineV5.Pagespeedonline
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v5")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/pagespeedonline", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pagespeedonline", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/pagespeedonline", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/pagespeedonline", "auth.DefaultTransporter.constructor")
      @js.native
      def constructor(): js.Any = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pagespeedonline", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/pagespeedonline", "auth.OAuth2")
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
  
  @JSImport("googleapis/build/src/apis/pagespeedonline", "pagespeedonline")
  @js.native
  def pagespeedonline(options: Options): Pagespeedonline = js.native
  @JSImport("googleapis/build/src/apis/pagespeedonline", "pagespeedonline")
  @js.native
  def pagespeedonline(options: typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.Options): typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.Pagespeedonline = js.native
  @JSImport("googleapis/build/src/apis/pagespeedonline", "pagespeedonline")
  @js.native
  def pagespeedonline(options: typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Options): typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Pagespeedonline = js.native
  @JSImport("googleapis/build/src/apis/pagespeedonline", "pagespeedonline")
  @js.native
  def pagespeedonline(options: typings.googleapis.v5Mod.pagespeedonlineV5.Options): typings.googleapis.v5Mod.pagespeedonlineV5.Pagespeedonline = js.native
  @JSImport("googleapis/build/src/apis/pagespeedonline", "pagespeedonline")
  @js.native
  def pagespeedonline_v1(version: v1): Pagespeedonline = js.native
  @JSImport("googleapis/build/src/apis/pagespeedonline", "pagespeedonline")
  @js.native
  def pagespeedonline_v2(version: v2): typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.Pagespeedonline = js.native
  @JSImport("googleapis/build/src/apis/pagespeedonline", "pagespeedonline")
  @js.native
  def pagespeedonline_v4(version: v4): typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Pagespeedonline = js.native
  @JSImport("googleapis/build/src/apis/pagespeedonline", "pagespeedonline")
  @js.native
  def pagespeedonline_v5(version: v5): typings.googleapis.v5Mod.pagespeedonlineV5.Pagespeedonline = js.native
}

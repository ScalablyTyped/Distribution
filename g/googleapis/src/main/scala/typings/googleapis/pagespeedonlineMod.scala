package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v4
import typings.googleapis.googleapisStrings.v5
import typings.googleapis.pagespeedonlineV1Mod.pagespeedonlineV1.Options
import typings.googleapis.pagespeedonlineV1Mod.pagespeedonlineV1.Pagespeedonline
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/pagespeedonline", JSImport.Namespace)
@js.native
object pagespeedonlineMod extends js.Object {
  
  def pagespeedonline(options: Options): Pagespeedonline = js.native
  def pagespeedonline(options: typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.Options): typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.Pagespeedonline = js.native
  def pagespeedonline(options: typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Options): typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Pagespeedonline = js.native
  def pagespeedonline(options: typings.googleapis.v5Mod.pagespeedonlineV5.Options): typings.googleapis.v5Mod.pagespeedonlineV5.Pagespeedonline = js.native
  @JSName("pagespeedonline")
  def pagespeedonline_v1(version: v1): Pagespeedonline = js.native
  @JSName("pagespeedonline")
  def pagespeedonline_v2(version: v2): typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.Pagespeedonline = js.native
  @JSName("pagespeedonline")
  def pagespeedonline_v4(version: v4): typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Pagespeedonline = js.native
  @JSName("pagespeedonline")
  def pagespeedonline_v5(version: v5): typings.googleapis.v5Mod.pagespeedonlineV5.Pagespeedonline = js.native
  
  @js.native
  object VERSIONS extends js.Object {
    
    @js.native
    class v1 protected () extends Pagespeedonline {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                Pagespeedonline
              ]
            ]
    
    @js.native
    class v2 protected ()
      extends typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.Pagespeedonline {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.Pagespeedonline
              ]
            ]
    
    @js.native
    class v4 protected ()
      extends typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Pagespeedonline {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v4
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.Pagespeedonline
              ]
            ]
    
    @js.native
    class v5 protected ()
      extends typings.googleapis.v5Mod.pagespeedonlineV5.Pagespeedonline {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v5
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.v5Mod.pagespeedonlineV5.Pagespeedonline
              ]
            ]
  }
  
  @js.native
  object auth extends TopLevel[AuthPlus] {
    
    @js.native
    /**
      * Google Compute Engine service account credentials.
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    class Compute ()
      extends typings.googleAuthLibrary.mod.Compute
    
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
  }
}

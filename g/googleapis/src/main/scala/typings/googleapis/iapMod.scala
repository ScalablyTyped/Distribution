package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapis.iapV1Mod.iapV1.Iap
import typings.googleapis.iapV1Mod.iapV1.Options
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/iap", JSImport.Namespace)
@js.native
object iapMod extends js.Object {
  def iap(options: Options): Iap = js.native
  def iap(options: typings.googleapis.iapV1beta1Mod.iapV1beta1.Options): typings.googleapis.iapV1beta1Mod.iapV1beta1.Iap = js.native
  @JSName("iap")
  def iap_v1(version: v1): Iap = js.native
  @JSName("iap")
  def iap_v1beta1(version: v1beta1): typings.googleapis.iapV1beta1Mod.iapV1beta1.Iap = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Iap {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta1 protected ()
      extends typings.googleapis.iapV1beta1Mod.iapV1beta1.Iap {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Iap]
            ]
    
    @js.native
    object v1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.iapV1beta1Mod.iapV1beta1.Iap
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


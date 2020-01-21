package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapis.runtimeconfigV1Mod.runtimeconfigV1.Options
import typings.googleapis.runtimeconfigV1Mod.runtimeconfigV1.Runtimeconfig
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/runtimeconfig", JSImport.Namespace)
@js.native
object runtimeconfigMod extends js.Object {
  def runtimeconfig(options: Options): Runtimeconfig = js.native
  def runtimeconfig(options: typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1.Options): typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1.Runtimeconfig = js.native
  @JSName("runtimeconfig")
  def runtimeconfig_v1(version: v1): Runtimeconfig = js.native
  @JSName("runtimeconfig")
  def runtimeconfig_v1beta1(version: v1beta1): typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1.Runtimeconfig = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Runtimeconfig {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta1 protected ()
      extends typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1.Runtimeconfig {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Runtimeconfig
              ]
            ]
    
    @js.native
    object v1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1.Runtimeconfig
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


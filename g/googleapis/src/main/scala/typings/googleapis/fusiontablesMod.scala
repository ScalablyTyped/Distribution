package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleapis.fusiontablesV1Mod.fusiontablesV1.Fusiontables
import typings.googleapis.fusiontablesV1Mod.fusiontablesV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v2
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/fusiontables", JSImport.Namespace)
@js.native
object fusiontablesMod extends js.Object {
  def fusiontables(options: Options): Fusiontables = js.native
  def fusiontables(options: typings.googleapis.fusiontablesV2Mod.fusiontablesV2.Options): typings.googleapis.fusiontablesV2Mod.fusiontablesV2.Fusiontables = js.native
  @JSName("fusiontables")
  def fusiontables_v1(version: v1): Fusiontables = js.native
  @JSName("fusiontables")
  def fusiontables_v2(version: v2): typings.googleapis.fusiontablesV2Mod.fusiontablesV2.Fusiontables = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Fusiontables {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2 protected ()
      extends typings.googleapis.fusiontablesV2Mod.fusiontablesV2.Fusiontables {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                Fusiontables
              ]
            ]
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.fusiontablesV2Mod.fusiontablesV2.Fusiontables
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


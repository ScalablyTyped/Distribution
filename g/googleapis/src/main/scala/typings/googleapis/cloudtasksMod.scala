package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleapis.cloudtasksV2Mod.cloudtasksV2.Cloudtasks
import typings.googleapis.cloudtasksV2Mod.cloudtasksV2.Options
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v2beta2
import typings.googleapis.googleapisStrings.v2beta3
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudtasks", JSImport.Namespace)
@js.native
object cloudtasksMod extends js.Object {
  
  def cloudtasks(options: Options): Cloudtasks = js.native
  def cloudtasks(options: typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Options): typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks = js.native
  def cloudtasks(options: typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Options): typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks = js.native
  @JSName("cloudtasks")
  def cloudtasks_v2(version: v2): Cloudtasks = js.native
  @JSName("cloudtasks")
  def cloudtasks_v2beta2(version: v2beta2): typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks = js.native
  @JSName("cloudtasks")
  def cloudtasks_v2beta3(version: v2beta3): typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks = js.native
  
  @js.native
  object VERSIONS extends js.Object {
    
    @js.native
    class v2 protected () extends Cloudtasks {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Cloudtasks]
            ]
    
    @js.native
    class v2beta2 protected ()
      extends typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v2beta2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks
              ]
            ]
    
    @js.native
    class v2beta3 protected ()
      extends typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v2beta3
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks
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

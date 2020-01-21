package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleapis.dialogflowV2Mod.dialogflowV2.Dialogflow
import typings.googleapis.dialogflowV2Mod.dialogflowV2.Options
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v2beta1
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow", JSImport.Namespace)
@js.native
object dialogflowMod extends js.Object {
  def dialogflow(options: Options): Dialogflow = js.native
  def dialogflow(options: typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1.Options): typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1.Dialogflow = js.native
  @JSName("dialogflow")
  def dialogflow_v2(version: v2): Dialogflow = js.native
  @JSName("dialogflow")
  def dialogflow_v2beta1(version: v2beta1): typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1.Dialogflow = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v2 protected () extends Dialogflow {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2beta1 protected ()
      extends typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1.Dialogflow {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Dialogflow]
            ]
    
    @js.native
    object v2beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1.Dialogflow
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


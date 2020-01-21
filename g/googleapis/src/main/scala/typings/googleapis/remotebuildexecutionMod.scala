package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1alpha
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.Options
import typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.Remotebuildexecution
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/remotebuildexecution", JSImport.Namespace)
@js.native
object remotebuildexecutionMod extends js.Object {
  def remotebuildexecution(options: Options): Remotebuildexecution = js.native
  def remotebuildexecution(options: typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Options): typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution = js.native
  def remotebuildexecution(options: typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Options): typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution = js.native
  @JSName("remotebuildexecution")
  def remotebuildexecution_v1(version: v1): Remotebuildexecution = js.native
  @JSName("remotebuildexecution")
  def remotebuildexecution_v1alpha(version: v1alpha): typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution = js.native
  @JSName("remotebuildexecution")
  def remotebuildexecution_v2(version: v2): typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1alpha protected ()
      extends typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v2 protected ()
      extends typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                Remotebuildexecution
              ]
            ]
    
    @js.native
    object v1alpha
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution
              ]
            ]
    
    @js.native
    object v2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution
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


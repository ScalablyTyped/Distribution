package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.Containeranalysis
import typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1.Options
import typings.googleapis.googleapisStrings.v1alpha1
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/containeranalysis", JSImport.Namespace)
@js.native
object containeranalysisMod extends js.Object {
  def containeranalysis(options: Options): Containeranalysis = js.native
  def containeranalysis(options: typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.Options): typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.Containeranalysis = js.native
  @JSName("containeranalysis")
  def containeranalysis_v1alpha1(version: v1alpha1): Containeranalysis = js.native
  @JSName("containeranalysis")
  def containeranalysis_v1beta1(version: v1beta1): typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.Containeranalysis = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1alpha1 protected () extends Containeranalysis {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta1 protected ()
      extends typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.Containeranalysis {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1alpha1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                Containeranalysis
              ]
            ]
    
    @js.native
    object v1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1.Containeranalysis
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


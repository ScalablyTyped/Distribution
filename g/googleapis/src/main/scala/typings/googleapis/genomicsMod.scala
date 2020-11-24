package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleapis.genomicsV1Mod.genomicsV1.Genomics
import typings.googleapis.genomicsV1Mod.genomicsV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1alpha2
import typings.googleapis.googleapisStrings.v2alpha1
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/genomics", JSImport.Namespace)
@js.native
object genomicsMod extends js.Object {
  
  def genomics(options: Options): Genomics = js.native
  def genomics(options: typings.googleapis.v1alpha2Mod.genomicsV1alpha2.Options): typings.googleapis.v1alpha2Mod.genomicsV1alpha2.Genomics = js.native
  def genomics(options: typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Options): typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics = js.native
  @JSName("genomics")
  def genomics_v1(version: v1): Genomics = js.native
  @JSName("genomics")
  def genomics_v1alpha2(version: v1alpha2): typings.googleapis.v1alpha2Mod.genomicsV1alpha2.Genomics = js.native
  @JSName("genomics")
  def genomics_v2alpha1(version: v2alpha1): typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics = js.native
  
  @js.native
  object VERSIONS extends js.Object {
    
    @js.native
    class v1 protected () extends Genomics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Genomics]
            ]
    
    @js.native
    class v1alpha2 protected ()
      extends typings.googleapis.v1alpha2Mod.genomicsV1alpha2.Genomics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v1alpha2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.v1alpha2Mod.genomicsV1alpha2.Genomics
              ]
            ]
    
    @js.native
    class v2alpha1 protected ()
      extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @js.native
    object v2alpha1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics
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

package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1beta2
import typings.googleapis.googleapisStrings.v1p1beta1
import typings.googleapis.googleapisStrings.v1p2beta1
import typings.googleapis.googleapisStrings.v1p3beta1
import typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1.Options
import typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1.Videointelligence
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/videointelligence", JSImport.Namespace)
@js.native
object videointelligenceMod extends js.Object {
  def videointelligence(options: Options): Videointelligence = js.native
  def videointelligence(options: typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1.Options): typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1.Videointelligence = js.native
  def videointelligence(options: typings.googleapis.videointelligenceV1Mod.videointelligenceV1.Options): typings.googleapis.videointelligenceV1Mod.videointelligenceV1.Videointelligence = js.native
  def videointelligence(options: typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2.Options): typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2.Videointelligence = js.native
  def videointelligence(options: typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1.Options): typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1.Videointelligence = js.native
  @JSName("videointelligence")
  def videointelligence_v1(version: v1): typings.googleapis.videointelligenceV1Mod.videointelligenceV1.Videointelligence = js.native
  @JSName("videointelligence")
  def videointelligence_v1beta2(version: v1beta2): typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2.Videointelligence = js.native
  @JSName("videointelligence")
  def videointelligence_v1p1beta1(version: v1p1beta1): typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1.Videointelligence = js.native
  @JSName("videointelligence")
  def videointelligence_v1p2beta1(version: v1p2beta1): Videointelligence = js.native
  @JSName("videointelligence")
  def videointelligence_v1p3beta1(version: v1p3beta1): typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1.Videointelligence = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected ()
      extends typings.googleapis.videointelligenceV1Mod.videointelligenceV1.Videointelligence {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta2 protected ()
      extends typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2.Videointelligence {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1p1beta1 protected ()
      extends typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1.Videointelligence {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1p2beta1 protected () extends Videointelligence {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1p3beta1 protected ()
      extends typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1.Videointelligence {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.videointelligenceV1Mod.videointelligenceV1.Videointelligence
              ]
            ]
    
    @js.native
    object v1beta2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2.Videointelligence
              ]
            ]
    
    @js.native
    object v1p1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1.Videointelligence
              ]
            ]
    
    @js.native
    object v1p2beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                Videointelligence
              ]
            ]
    
    @js.native
    object v1p3beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1.Videointelligence
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


package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapis.googleapisStrings.v1beta2
import typings.googleapis.languageV1Mod.languageV1.Language
import typings.googleapis.languageV1Mod.languageV1.Options
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/language", JSImport.Namespace)
@js.native
object languageMod extends js.Object {
  def language(options: Options): Language = js.native
  def language(options: typings.googleapis.languageV1beta1Mod.languageV1beta1.Options): typings.googleapis.languageV1beta1Mod.languageV1beta1.Language = js.native
  def language(options: typings.googleapis.languageV1beta2Mod.languageV1beta2.Options): typings.googleapis.languageV1beta2Mod.languageV1beta2.Language = js.native
  @JSName("language")
  def language_v1(version: v1): Language = js.native
  @JSName("language")
  def language_v1beta1(version: v1beta1): typings.googleapis.languageV1beta1Mod.languageV1beta1.Language = js.native
  @JSName("language")
  def language_v1beta2(version: v1beta2): typings.googleapis.languageV1beta2Mod.languageV1beta2.Language = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Language {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta1 protected ()
      extends typings.googleapis.languageV1beta1Mod.languageV1beta1.Language {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta2 protected ()
      extends typings.googleapis.languageV1beta2Mod.languageV1beta2.Language {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Language]
            ]
    
    @js.native
    object v1beta1
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.languageV1beta1Mod.languageV1beta1.Language
              ]
            ]
    
    @js.native
    object v1beta2
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                /* google */ js.UndefOr[GoogleConfigurable], 
                typings.googleapis.languageV1beta2Mod.languageV1beta2.Language
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


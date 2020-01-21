package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1alpha
import typings.googleapis.googleapisStrings.v1beta
import typings.googleapis.osloginV1Mod.osloginV1.Options
import typings.googleapis.osloginV1Mod.osloginV1.Oslogin
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/oslogin", JSImport.Namespace)
@js.native
object osloginMod extends js.Object {
  def oslogin(options: Options): Oslogin = js.native
  def oslogin(options: typings.googleapis.osloginV1alphaMod.osloginV1alpha.Options): typings.googleapis.osloginV1alphaMod.osloginV1alpha.Oslogin = js.native
  def oslogin(options: typings.googleapis.osloginV1betaMod.osloginV1beta.Options): typings.googleapis.osloginV1betaMod.osloginV1beta.Oslogin = js.native
  @JSName("oslogin")
  def oslogin_v1(version: v1): Oslogin = js.native
  @JSName("oslogin")
  def oslogin_v1alpha(version: v1alpha): typings.googleapis.osloginV1alphaMod.osloginV1alpha.Oslogin = js.native
  @JSName("oslogin")
  def oslogin_v1beta(version: v1beta): typings.googleapis.osloginV1betaMod.osloginV1beta.Oslogin = js.native
  @js.native
  object VERSIONS extends js.Object {
    @js.native
    class v1 protected () extends Oslogin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1alpha protected ()
      extends typings.googleapis.osloginV1alphaMod.osloginV1alpha.Oslogin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    class v1beta protected ()
      extends typings.googleapis.osloginV1betaMod.osloginV1beta.Oslogin {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @js.native
    object v1
      extends TopLevel[
              Instantiable2[/* options */ GlobalOptions, js.UndefOr[/* google */ GoogleConfigurable], Oslogin]
            ]
    
    @js.native
    object v1alpha
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.osloginV1alphaMod.osloginV1alpha.Oslogin
              ]
            ]
    
    @js.native
    object v1beta
      extends TopLevel[
              Instantiable2[
                /* options */ GlobalOptions, 
                js.UndefOr[/* google */ GoogleConfigurable], 
                typings.googleapis.osloginV1betaMod.osloginV1beta.Oslogin
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


package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1p1beta1
import typings.googleapis.speechV1Mod.speechV1.Options
import typings.googleapis.speechV1Mod.speechV1.Speech
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speechMod {
  
  @JSImport("googleapis/build/src/apis/speech", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/speech", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/speech", "VERSIONS.v1")
    @js.native
    class v1 protected () extends Speech {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/speech", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Speech] = js.native
    @scala.inline
    def v1_=(x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Speech]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/speech", "VERSIONS.v1p1beta1")
    @js.native
    class v1p1beta1 protected ()
      extends typings.googleapis.v1p1beta1Mod.speechV1p1beta1.Speech {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/speech", "VERSIONS.v1p1beta1")
    @js.native
    def v1p1beta1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v1p1beta1Mod.speechV1p1beta1.Speech
      ] = js.native
    @scala.inline
    def v1p1beta1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v1p1beta1Mod.speechV1p1beta1.Speech
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1p1beta1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/speech", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/speech", "auth.Compute")
    @js.native
    /**
      * Google Compute Engine service account credentials.
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    class Compute ()
      extends typings.googleAuthLibrary.mod.Compute
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/speech", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/speech", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def constructor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[js.Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/speech", "auth.JWT")
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
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/speech", "auth.OAuth2")
    @js.native
    /**
      * Handles OAuth2 flow for Google APIs.
      *
      * @param clientId The authentication client ID.
      * @param clientSecret The authentication client secret.
      * @param redirectUri The URI to redirect to after completing the auth
      * request.
      * @param opts optional options for overriding the given parameters.
      * @constructor
      */
    class OAuth2 () extends OAuth2Client
    
    type _To = AuthPlus
    
    /* This means you don't have to write `^`, but can instead just say `auth.foo` */
    override def _to: AuthPlus = ^
  }
  
  @scala.inline
  def speech(options: Options): Speech = ^.asInstanceOf[js.Dynamic].applyDynamic("speech")(options.asInstanceOf[js.Any]).asInstanceOf[Speech]
  @scala.inline
  def speech(options: typings.googleapis.v1p1beta1Mod.speechV1p1beta1.Options): typings.googleapis.v1p1beta1Mod.speechV1p1beta1.Speech = ^.asInstanceOf[js.Dynamic].applyDynamic("speech")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v1p1beta1Mod.speechV1p1beta1.Speech]
  
  @scala.inline
  def speech_v1(version: v1): Speech = ^.asInstanceOf[js.Dynamic].applyDynamic("speech")(version.asInstanceOf[js.Any]).asInstanceOf[Speech]
  
  @scala.inline
  def speech_v1p1beta1(version: v1p1beta1): typings.googleapis.v1p1beta1Mod.speechV1p1beta1.Speech = ^.asInstanceOf[js.Dynamic].applyDynamic("speech")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v1p1beta1Mod.speechV1p1beta1.Speech]
}

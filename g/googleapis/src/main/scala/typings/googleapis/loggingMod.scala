package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v2beta1
import typings.googleapis.loggingV2Mod.loggingV2.Logging
import typings.googleapis.loggingV2Mod.loggingV2.Options
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggingMod {
  
  @JSImport("googleapis/build/src/apis/logging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/logging", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/logging", "VERSIONS.v2")
    @js.native
    class v2 protected () extends Logging {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/logging", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Logging] = js.native
    @scala.inline
    def v2_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Logging]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/logging", "VERSIONS.v2beta1")
    @js.native
    class v2beta1 protected ()
      extends typings.googleapis.loggingV2beta1Mod.loggingV2beta1.Logging {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/logging", "VERSIONS.v2beta1")
    @js.native
    def v2beta1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.loggingV2beta1Mod.loggingV2beta1.Logging
      ] = js.native
    @scala.inline
    def v2beta1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.loggingV2beta1Mod.loggingV2beta1.Logging
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2beta1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/logging", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/logging", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/logging", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/logging", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def constructor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[js.Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/logging", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/logging", "auth.OAuth2")
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
  def logging(options: Options): Logging = ^.asInstanceOf[js.Dynamic].applyDynamic("logging")(options.asInstanceOf[js.Any]).asInstanceOf[Logging]
  @scala.inline
  def logging(options: typings.googleapis.loggingV2beta1Mod.loggingV2beta1.Options): typings.googleapis.loggingV2beta1Mod.loggingV2beta1.Logging = ^.asInstanceOf[js.Dynamic].applyDynamic("logging")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.loggingV2beta1Mod.loggingV2beta1.Logging]
  
  @scala.inline
  def logging_v2(version: v2): Logging = ^.asInstanceOf[js.Dynamic].applyDynamic("logging")(version.asInstanceOf[js.Any]).asInstanceOf[Logging]
  
  @scala.inline
  def logging_v2beta1(version: v2beta1): typings.googleapis.loggingV2beta1Mod.loggingV2beta1.Logging = ^.asInstanceOf[js.Dynamic].applyDynamic("logging")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.loggingV2beta1Mod.loggingV2beta1.Logging]
}

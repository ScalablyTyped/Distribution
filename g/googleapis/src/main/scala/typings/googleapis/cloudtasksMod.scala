package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.cloudtasksV2Mod.cloudtasksV2.Cloudtasks
import typings.googleapis.cloudtasksV2Mod.cloudtasksV2.Options
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v2beta2
import typings.googleapis.googleapisStrings.v2beta3
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudtasksMod {
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudtasks", "VERSIONS.v2")
    @js.native
    class v2 protected () extends Cloudtasks {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/cloudtasks", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Cloudtasks] = js.native
    @scala.inline
    def v2_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Cloudtasks]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudtasks", "VERSIONS.v2beta2")
    @js.native
    class v2beta2 protected ()
      extends typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/cloudtasks", "VERSIONS.v2beta2")
    @js.native
    def v2beta2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks
      ] = js.native
    @scala.inline
    def v2beta2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2beta2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudtasks", "VERSIONS.v2beta3")
    @js.native
    class v2beta3 protected ()
      extends typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/cloudtasks", "VERSIONS.v2beta3")
    @js.native
    def v2beta3: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks
      ] = js.native
    @scala.inline
    def v2beta3_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2beta3")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/cloudtasks", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudtasks", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/cloudtasks", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/cloudtasks", "auth.DefaultTransporter.constructor")
      @js.native
      def constructor(): js.Any = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudtasks", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/cloudtasks", "auth.OAuth2")
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
  
  @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks")
  @js.native
  def cloudtasks(options: Options): Cloudtasks = js.native
  @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks")
  @js.native
  def cloudtasks(options: typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Options): typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks = js.native
  @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks")
  @js.native
  def cloudtasks(options: typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Options): typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks = js.native
  @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks")
  @js.native
  def cloudtasks_v2(version: v2): Cloudtasks = js.native
  @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks")
  @js.native
  def cloudtasks_v2beta2(version: v2beta2): typings.googleapis.v2beta2Mod.cloudtasksV2beta2.Cloudtasks = js.native
  @JSImport("googleapis/build/src/apis/cloudtasks", "cloudtasks")
  @js.native
  def cloudtasks_v2beta3(version: v2beta3): typings.googleapis.v2beta3Mod.cloudtasksV2beta3.Cloudtasks = js.native
}

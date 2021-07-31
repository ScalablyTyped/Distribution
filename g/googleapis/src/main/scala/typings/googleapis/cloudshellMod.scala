package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.cloudshellV1Mod.cloudshellV1.Cloudshell
import typings.googleapis.cloudshellV1Mod.cloudshellV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1alpha1
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudshellMod {
  
  @JSImport("googleapis/build/src/apis/cloudshell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/cloudshell", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudshell", "VERSIONS.v1")
    @js.native
    class v1 protected () extends Cloudshell {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/cloudshell", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Cloudshell] = js.native
    @scala.inline
    def v1_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Cloudshell]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudshell", "VERSIONS.v1alpha1")
    @js.native
    class v1alpha1 protected ()
      extends typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/cloudshell", "VERSIONS.v1alpha1")
    @js.native
    def v1alpha1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell
      ] = js.native
    @scala.inline
    def v1alpha1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/cloudshell", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudshell", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/cloudshell", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/cloudshell", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def constructor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[js.Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/cloudshell", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/cloudshell", "auth.OAuth2")
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
  def cloudshell(options: Options): Cloudshell = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudshell")(options.asInstanceOf[js.Any]).asInstanceOf[Cloudshell]
  @scala.inline
  def cloudshell(options: typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Options): typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudshell")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell]
  
  @scala.inline
  def cloudshell_v1(version: v1): Cloudshell = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudshell")(version.asInstanceOf[js.Any]).asInstanceOf[Cloudshell]
  
  @scala.inline
  def cloudshell_v1alpha1(version: v1alpha1): typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell = ^.asInstanceOf[js.Dynamic].applyDynamic("cloudshell")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1.Cloudshell]
}

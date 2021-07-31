package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.googleapisStrings.v3Dot1
import typings.googleapis.googleapisStrings.v3Dot2
import typings.googleapis.googleapisStrings.v3Dot3
import typings.googleapis.v31Mod.dfareportingV31.Dfareporting
import typings.googleapis.v31Mod.dfareportingV31.Options
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dfareportingMod {
  
  @JSImport("googleapis/build/src/apis/dfareporting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/dfareporting", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dfareporting", "VERSIONS.v3.1")
    @js.native
    class v31 protected () extends Dfareporting {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dfareporting", "VERSIONS.v3.1")
    @js.native
    def v31: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Dfareporting
      ] = js.native
    
    @scala.inline
    def v31_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Dfareporting
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3.1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dfareporting", "VERSIONS.v3.2")
    @js.native
    class v32 protected ()
      extends typings.googleapis.v32Mod.dfareportingV32.Dfareporting {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dfareporting", "VERSIONS.v3.2")
    @js.native
    def v32: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v32Mod.dfareportingV32.Dfareporting
      ] = js.native
    
    @scala.inline
    def v32_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v32Mod.dfareportingV32.Dfareporting
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3.2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dfareporting", "VERSIONS.v3.3")
    @js.native
    class v33 protected ()
      extends typings.googleapis.v33Mod.dfareportingV33.Dfareporting {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/dfareporting", "VERSIONS.v3.3")
    @js.native
    def v33: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v33Mod.dfareportingV33.Dfareporting
      ] = js.native
    
    @scala.inline
    def v33_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v33Mod.dfareportingV33.Dfareporting
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3.3")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/dfareporting", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dfareporting", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/dfareporting", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/dfareporting", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def constructor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[js.Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/dfareporting", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/dfareporting", "auth.OAuth2")
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
  def dfareporting(options: Options): Dfareporting = ^.asInstanceOf[js.Dynamic].applyDynamic("dfareporting")(options.asInstanceOf[js.Any]).asInstanceOf[Dfareporting]
  @scala.inline
  def dfareporting(options: typings.googleapis.v32Mod.dfareportingV32.Options): typings.googleapis.v32Mod.dfareportingV32.Dfareporting = ^.asInstanceOf[js.Dynamic].applyDynamic("dfareporting")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v32Mod.dfareportingV32.Dfareporting]
  @scala.inline
  def dfareporting(options: typings.googleapis.v33Mod.dfareportingV33.Options): typings.googleapis.v33Mod.dfareportingV33.Dfareporting = ^.asInstanceOf[js.Dynamic].applyDynamic("dfareporting")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v33Mod.dfareportingV33.Dfareporting]
  
  @scala.inline
  def dfareporting_v31(version: v3Dot1): Dfareporting = ^.asInstanceOf[js.Dynamic].applyDynamic("dfareporting")(version.asInstanceOf[js.Any]).asInstanceOf[Dfareporting]
  
  @scala.inline
  def dfareporting_v32(version: v3Dot2): typings.googleapis.v32Mod.dfareportingV32.Dfareporting = ^.asInstanceOf[js.Dynamic].applyDynamic("dfareporting")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v32Mod.dfareportingV32.Dfareporting]
  
  @scala.inline
  def dfareporting_v33(version: v3Dot3): typings.googleapis.v33Mod.dfareportingV33.Dfareporting = ^.asInstanceOf[js.Dynamic].applyDynamic("dfareporting")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v33Mod.dfareportingV33.Dfareporting]
}

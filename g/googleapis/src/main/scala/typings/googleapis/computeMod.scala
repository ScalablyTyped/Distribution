package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.alphaMod.computeAlpha.Compute
import typings.googleapis.alphaMod.computeAlpha.Options
import typings.googleapis.googleapisStrings.alpha
import typings.googleapis.googleapisStrings.beta
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeMod {
  
  @JSImport("googleapis/build/src/apis/compute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/compute", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/compute", "VERSIONS.alpha")
    @js.native
    class alpha protected () extends Compute {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/compute", "VERSIONS.alpha")
    @js.native
    def alpha: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Compute] = js.native
    inline def alpha_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Compute]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alpha")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/compute", "VERSIONS.beta")
    @js.native
    class beta protected ()
      extends typings.googleapis.betaMod.computeBeta.Compute {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/compute", "VERSIONS.beta")
    @js.native
    def beta: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.betaMod.computeBeta.Compute
      ] = js.native
    inline def beta_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.betaMod.computeBeta.Compute
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beta")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/compute", "VERSIONS.v1")
    @js.native
    class v1 protected ()
      extends typings.googleapis.computeV1Mod.computeV1.Compute {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/compute", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.computeV1Mod.computeV1.Compute
      ] = js.native
    inline def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.computeV1Mod.computeV1.Compute
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/compute", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/compute", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/compute", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/compute", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[js.Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/compute", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/compute", "auth.OAuth2")
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
  
  inline def compute(options: Options): Compute = ^.asInstanceOf[js.Dynamic].applyDynamic("compute")(options.asInstanceOf[js.Any]).asInstanceOf[Compute]
  inline def compute(options: typings.googleapis.betaMod.computeBeta.Options): typings.googleapis.betaMod.computeBeta.Compute = ^.asInstanceOf[js.Dynamic].applyDynamic("compute")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.betaMod.computeBeta.Compute]
  inline def compute(options: typings.googleapis.computeV1Mod.computeV1.Options): typings.googleapis.computeV1Mod.computeV1.Compute = ^.asInstanceOf[js.Dynamic].applyDynamic("compute")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.computeV1Mod.computeV1.Compute]
  
  inline def compute_alpha(version: alpha): Compute = ^.asInstanceOf[js.Dynamic].applyDynamic("compute")(version.asInstanceOf[js.Any]).asInstanceOf[Compute]
  
  inline def compute_beta(version: beta): typings.googleapis.betaMod.computeBeta.Compute = ^.asInstanceOf[js.Dynamic].applyDynamic("compute")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.betaMod.computeBeta.Compute]
  
  inline def compute_v1(version: v1): typings.googleapis.computeV1Mod.computeV1.Compute = ^.asInstanceOf[js.Dynamic].applyDynamic("compute")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.computeV1Mod.computeV1.Compute]
}

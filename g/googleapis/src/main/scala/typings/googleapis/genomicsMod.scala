package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.genomicsV1Mod.genomicsV1.Genomics
import typings.googleapis.genomicsV1Mod.genomicsV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1alpha2
import typings.googleapis.googleapisStrings.v2alpha1
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genomicsMod {
  
  @JSImport("googleapis/build/src/apis/genomics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/genomics", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/genomics", "VERSIONS.v1")
    @js.native
    class v1 protected () extends Genomics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/genomics", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Genomics] = js.native
    @scala.inline
    def v1_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Genomics]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/genomics", "VERSIONS.v1alpha2")
    @js.native
    class v1alpha2 protected ()
      extends typings.googleapis.v1alpha2Mod.genomicsV1alpha2.Genomics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/genomics", "VERSIONS.v1alpha2")
    @js.native
    def v1alpha2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v1alpha2Mod.genomicsV1alpha2.Genomics
      ] = js.native
    @scala.inline
    def v1alpha2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v1alpha2Mod.genomicsV1alpha2.Genomics
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/genomics", "VERSIONS.v2alpha1")
    @js.native
    class v2alpha1 protected ()
      extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/genomics", "VERSIONS.v2alpha1")
    @js.native
    def v2alpha1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics
      ] = js.native
    @scala.inline
    def v2alpha1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2alpha1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/genomics", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/genomics", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/genomics", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/genomics", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def constructor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[js.Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/genomics", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/genomics", "auth.OAuth2")
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
  def genomics(options: Options): Genomics = ^.asInstanceOf[js.Dynamic].applyDynamic("genomics")(options.asInstanceOf[js.Any]).asInstanceOf[Genomics]
  @scala.inline
  def genomics(options: typings.googleapis.v1alpha2Mod.genomicsV1alpha2.Options): typings.googleapis.v1alpha2Mod.genomicsV1alpha2.Genomics = ^.asInstanceOf[js.Dynamic].applyDynamic("genomics")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v1alpha2Mod.genomicsV1alpha2.Genomics]
  @scala.inline
  def genomics(options: typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Options): typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics = ^.asInstanceOf[js.Dynamic].applyDynamic("genomics")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics]
  
  @scala.inline
  def genomics_v1(version: v1): Genomics = ^.asInstanceOf[js.Dynamic].applyDynamic("genomics")(version.asInstanceOf[js.Any]).asInstanceOf[Genomics]
  
  @scala.inline
  def genomics_v1alpha2(version: v1alpha2): typings.googleapis.v1alpha2Mod.genomicsV1alpha2.Genomics = ^.asInstanceOf[js.Dynamic].applyDynamic("genomics")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v1alpha2Mod.genomicsV1alpha2.Genomics]
  
  @scala.inline
  def genomics_v2alpha1(version: v2alpha1): typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics = ^.asInstanceOf[js.Dynamic].applyDynamic("genomics")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics]
}

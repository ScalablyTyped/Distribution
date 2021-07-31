package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v3
import typings.googleapis.googleapisStrings.v3p1beta1
import typings.googleapis.jobsV2Mod.jobsV2.Jobs
import typings.googleapis.jobsV2Mod.jobsV2.Options
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobsMod {
  
  @JSImport("googleapis/build/src/apis/jobs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/jobs", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/jobs", "VERSIONS.v2")
    @js.native
    class v2 protected () extends Jobs {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/jobs", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Jobs] = js.native
    @scala.inline
    def v2_=(x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Jobs]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/jobs", "VERSIONS.v3")
    @js.native
    class v3 protected ()
      extends typings.googleapis.jobsV3Mod.jobsV3.Jobs {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/jobs", "VERSIONS.v3")
    @js.native
    def v3: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.jobsV3Mod.jobsV3.Jobs
      ] = js.native
    @scala.inline
    def v3_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.jobsV3Mod.jobsV3.Jobs
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/jobs", "VERSIONS.v3p1beta1")
    @js.native
    class v3p1beta1 protected ()
      extends typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/jobs", "VERSIONS.v3p1beta1")
    @js.native
    def v3p1beta1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs
      ] = js.native
    @scala.inline
    def v3p1beta1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v3p1beta1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/jobs", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/jobs", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/jobs", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/jobs", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def constructor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[js.Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/jobs", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/jobs", "auth.OAuth2")
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
  def jobs(options: Options): Jobs = ^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(options.asInstanceOf[js.Any]).asInstanceOf[Jobs]
  @scala.inline
  def jobs(options: typings.googleapis.jobsV3Mod.jobsV3.Options): typings.googleapis.jobsV3Mod.jobsV3.Jobs = ^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.jobsV3Mod.jobsV3.Jobs]
  @scala.inline
  def jobs(options: typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.Options): typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs = ^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs]
  
  @scala.inline
  def jobs_v2(version: v2): Jobs = ^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(version.asInstanceOf[js.Any]).asInstanceOf[Jobs]
  
  @scala.inline
  def jobs_v3(version: v3): typings.googleapis.jobsV3Mod.jobsV3.Jobs = ^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.jobsV3Mod.jobsV3.Jobs]
  
  @scala.inline
  def jobs_v3p1beta1(version: v3p1beta1): typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs = ^.asInstanceOf[js.Dynamic].applyDynamic("jobs")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v3p1beta1Mod.jobsV3p1beta1.Jobs]
}

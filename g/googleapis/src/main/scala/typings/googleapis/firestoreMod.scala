package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.firestoreV1Mod.firestoreV1.Firestore
import typings.googleapis.firestoreV1Mod.firestoreV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapis.googleapisStrings.v1beta2
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.mod.AuthPlus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreMod {
  
  @JSImport("googleapis/build/src/apis/firestore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/firestore", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/firestore", "VERSIONS.v1")
    @js.native
    class v1 protected () extends Firestore {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/firestore", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Firestore] = js.native
    inline def v1_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Firestore]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/firestore", "VERSIONS.v1beta1")
    @js.native
    class v1beta1 protected ()
      extends typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1.Firestore {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/firestore", "VERSIONS.v1beta1")
    @js.native
    def v1beta1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1.Firestore
      ] = js.native
    inline def v1beta1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1.Firestore
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/firestore", "VERSIONS.v1beta2")
    @js.native
    class v1beta2 protected ()
      extends typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2.Firestore {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/firestore", "VERSIONS.v1beta2")
    @js.native
    def v1beta2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2.Firestore
      ] = js.native
    inline def v1beta2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2.Firestore
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta2")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/firestore", "auth")
    @js.native
    val ^ : AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/firestore", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/firestore", "auth.DefaultTransporter")
    @js.native
    class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/firestore", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[js.Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/firestore", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/firestore", "auth.OAuth2")
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
  
  inline def firestore(options: Options): Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("firestore")(options.asInstanceOf[js.Any]).asInstanceOf[Firestore]
  inline def firestore(options: typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1.Options): typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("firestore")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1.Firestore]
  inline def firestore(options: typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2.Options): typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("firestore")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2.Firestore]
  
  inline def firestore_v1(version: v1): Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("firestore")(version.asInstanceOf[js.Any]).asInstanceOf[Firestore]
  
  inline def firestore_v1beta1(version: v1beta1): typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("firestore")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1.Firestore]
  
  inline def firestore_v1beta2(version: v1beta2): typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2.Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("firestore")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2.Firestore]
}

package typings.googleapis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.googleAuthLibrary.authclientMod.AuthClient
import typings.googleAuthLibrary.awsclientMod.AwsClientOptions
import typings.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleAuthLibrary.identitypoolclientMod.IdentityPoolClientOptions
import typings.googleAuthLibrary.jwtclientMod.JWTOptions
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleapis.datastoreV1Mod.datastoreV1.Datastore
import typings.googleapis.datastoreV1Mod.datastoreV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapis.googleapisStrings.v1beta3
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datastoreMod {
  
  @JSImport("googleapis/build/src/apis/datastore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/datastore", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/datastore", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/datastore", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Datastore {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/datastore", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Datastore] = js.native
    inline def v1_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Datastore]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/datastore", "VERSIONS.v1beta1")
    @js.native
    open class v1beta1 protected ()
      extends typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1.Datastore {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/datastore", "VERSIONS.v1beta1")
    @js.native
    def v1beta1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1.Datastore
      ] = js.native
    inline def v1beta1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1.Datastore
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/datastore", "VERSIONS.v1beta3")
    @js.native
    open class v1beta3 protected ()
      extends typings.googleapis.v1beta3Mod.datastoreV1beta3.Datastore {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/datastore", "VERSIONS.v1beta3")
    @js.native
    def v1beta3: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v1beta3Mod.datastoreV1beta3.Datastore
      ] = js.native
    inline def v1beta3_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v1beta3Mod.datastoreV1beta3.Datastore
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta3")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/datastore", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/datastore", "auth.AwsClient")
    @js.native
    open class AwsClient protected ()
      extends typings.googleAuthLibrary.mod.AwsClient {
      /**
        * Instantiates an AwsClient instance using the provided JSON
        * object loaded from an external account credentials file.
        * An error is thrown if the credential is not a valid AWS credential.
        * @param options The external account options object typically loaded
        *   from the external account JSON credential file.
        * @param additionalOptions Optional additional behavior customization
        *   options. These currently customize expiration threshold time and
        *   whether to retry on 401/403 API request errors.
        */
      def this(options: AwsClientOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/datastore", "auth.Compute")
    @js.native
    /**
      * Google Compute Engine service account credentials.
      *
      * Retrieve access token from the metadata server.
      * See: https://developers.google.com/compute/docs/authentication
      */
    open class Compute ()
      extends typings.googleAuthLibrary.mod.Compute
    
    /**
      * Export DefaultTransporter as a static property of the class.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/datastore", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/datastore", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/datastore", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/datastore", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/datastore", "auth.IdentityPoolClient")
    @js.native
    open class IdentityPoolClient protected ()
      extends typings.googleAuthLibrary.mod.IdentityPoolClient {
      /**
        * Instantiate an IdentityPoolClient instance using the provided JSON
        * object loaded from an external account credentials file.
        * An error is thrown if the credential is not a valid file-sourced or
        * url-sourced credential or a workforce pool user project is provided
        * with a non workforce audience.
        * @param options The external account options object typically loaded
        *   from the external account JSON credential file.
        * @param additionalOptions Optional additional behavior customization
        *   options. These currently customize expiration threshold time and
        *   whether to retry on 401/403 API request errors.
        */
      def this(options: IdentityPoolClientOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/datastore", "auth.JWT")
    @js.native
    open class JWT protected ()
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
    @JSImport("googleapis/build/src/apis/datastore", "auth.OAuth2")
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
    open class OAuth2 () extends OAuth2Client
    
    type _To = typings.googleapisCommon.mod.AuthPlus
    
    /* This means you don't have to write `^`, but can instead just say `auth.foo` */
    override def _to: typings.googleapisCommon.mod.AuthPlus = ^
  }
  
  inline def datastore(options: Options): Datastore = ^.asInstanceOf[js.Dynamic].applyDynamic("datastore")(options.asInstanceOf[js.Any]).asInstanceOf[Datastore]
  inline def datastore(options: typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1.Options): typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1.Datastore = ^.asInstanceOf[js.Dynamic].applyDynamic("datastore")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1.Datastore]
  inline def datastore(options: typings.googleapis.v1beta3Mod.datastoreV1beta3.Options): typings.googleapis.v1beta3Mod.datastoreV1beta3.Datastore = ^.asInstanceOf[js.Dynamic].applyDynamic("datastore")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v1beta3Mod.datastoreV1beta3.Datastore]
  
  object datastoreV1 {
    
    @JSImport("googleapis/build/src/apis/datastore", "datastore_v1.Datastore")
    @js.native
    open class Datastore protected ()
      extends typings.googleapis.datastoreV1Mod.datastoreV1.Datastore {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datastore", "datastore_v1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.datastoreV1Mod.datastoreV1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datastore", "datastore_v1.Resource$Projects$Indexes")
    @js.native
    open class ResourceProjectsIndexes protected ()
      extends typings.googleapis.datastoreV1Mod.datastoreV1.ResourceProjectsIndexes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datastore", "datastore_v1.Resource$Projects$Operations")
    @js.native
    open class ResourceProjectsOperations protected ()
      extends typings.googleapis.datastoreV1Mod.datastoreV1.ResourceProjectsOperations {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object datastoreV1beta1 {
    
    @JSImport("googleapis/build/src/apis/datastore", "datastore_v1beta1.Datastore")
    @js.native
    open class Datastore protected ()
      extends typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1.Datastore {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datastore", "datastore_v1beta1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object datastoreV1beta3 {
    
    @JSImport("googleapis/build/src/apis/datastore", "datastore_v1beta3.Datastore")
    @js.native
    open class Datastore protected ()
      extends typings.googleapis.v1beta3Mod.datastoreV1beta3.Datastore {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/datastore", "datastore_v1beta3.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.v1beta3Mod.datastoreV1beta3.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def datastore_v1(version: v1): Datastore = ^.asInstanceOf[js.Dynamic].applyDynamic("datastore")(version.asInstanceOf[js.Any]).asInstanceOf[Datastore]
  
  inline def datastore_v1beta1(version: v1beta1): typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1.Datastore = ^.asInstanceOf[js.Dynamic].applyDynamic("datastore")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1.Datastore]
  
  inline def datastore_v1beta3(version: v1beta3): typings.googleapis.v1beta3Mod.datastoreV1beta3.Datastore = ^.asInstanceOf[js.Dynamic].applyDynamic("datastore")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v1beta3Mod.datastoreV1beta3.Datastore]
}

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
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1beta1a
import typings.googleapis.googleapisStrings.v1beta2
import typings.googleapis.pubsubV1Mod.pubsubV1.Options
import typings.googleapis.pubsubV1Mod.pubsubV1.Pubsub
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pubsubMod {
  
  @JSImport("googleapis/build/src/apis/pubsub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/pubsub", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/pubsub", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsub", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Pubsub {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/pubsub", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Pubsub] = js.native
    inline def v1_=(x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Pubsub]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsub", "VERSIONS.v1beta1a")
    @js.native
    open class v1beta1a protected ()
      extends typings.googleapis.v1beta1aMod.pubsubV1beta1a.Pubsub {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/pubsub", "VERSIONS.v1beta1a")
    @js.native
    def v1beta1a: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v1beta1aMod.pubsubV1beta1a.Pubsub
      ] = js.native
    inline def v1beta1a_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v1beta1aMod.pubsubV1beta1a.Pubsub
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta1a")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsub", "VERSIONS.v1beta2")
    @js.native
    open class v1beta2 protected ()
      extends typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Pubsub {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/pubsub", "VERSIONS.v1beta2")
    @js.native
    def v1beta2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Pubsub
      ] = js.native
    inline def v1beta2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Pubsub
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta2")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/pubsub", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsub", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/pubsub", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/pubsub", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/pubsub", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsub", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsub", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/pubsub", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/pubsub", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/pubsub", "auth.OAuth2")
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
  
  inline def pubsub(options: Options): Pubsub = ^.asInstanceOf[js.Dynamic].applyDynamic("pubsub")(options.asInstanceOf[js.Any]).asInstanceOf[Pubsub]
  inline def pubsub(options: typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Options): typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Pubsub = ^.asInstanceOf[js.Dynamic].applyDynamic("pubsub")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Pubsub]
  inline def pubsub(options: typings.googleapis.v1beta1aMod.pubsubV1beta1a.Options): typings.googleapis.v1beta1aMod.pubsubV1beta1a.Pubsub = ^.asInstanceOf[js.Dynamic].applyDynamic("pubsub")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v1beta1aMod.pubsubV1beta1a.Pubsub]
  
  object pubsubV1 {
    
    @JSImport("googleapis/build/src/apis/pubsub", "pubsub_v1.Pubsub")
    @js.native
    open class Pubsub protected ()
      extends typings.googleapis.pubsubV1Mod.pubsubV1.Pubsub {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsub", "pubsub_v1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.pubsubV1Mod.pubsubV1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsub", "pubsub_v1.Resource$Projects$Schemas")
    @js.native
    open class ResourceProjectsSchemas protected ()
      extends typings.googleapis.pubsubV1Mod.pubsubV1.ResourceProjectsSchemas {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsub", "pubsub_v1.Resource$Projects$Snapshots")
    @js.native
    open class ResourceProjectsSnapshots protected ()
      extends typings.googleapis.pubsubV1Mod.pubsubV1.ResourceProjectsSnapshots {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsub", "pubsub_v1.Resource$Projects$Subscriptions")
    @js.native
    open class ResourceProjectsSubscriptions protected ()
      extends typings.googleapis.pubsubV1Mod.pubsubV1.ResourceProjectsSubscriptions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsub", "pubsub_v1.Resource$Projects$Topics")
    @js.native
    open class ResourceProjectsTopics protected ()
      extends typings.googleapis.pubsubV1Mod.pubsubV1.ResourceProjectsTopics {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsub", "pubsub_v1.Resource$Projects$Topics$Snapshots")
    @js.native
    open class ResourceProjectsTopicsSnapshots protected ()
      extends typings.googleapis.pubsubV1Mod.pubsubV1.ResourceProjectsTopicsSnapshots {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsub", "pubsub_v1.Resource$Projects$Topics$Subscriptions")
    @js.native
    open class ResourceProjectsTopicsSubscriptions protected ()
      extends typings.googleapis.pubsubV1Mod.pubsubV1.ResourceProjectsTopicsSubscriptions {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object pubsubV1beta1a {
    
    @JSImport("googleapis/build/src/apis/pubsub", "pubsub_v1beta1a.Pubsub")
    @js.native
    open class Pubsub protected ()
      extends typings.googleapis.v1beta1aMod.pubsubV1beta1a.Pubsub {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsub", "pubsub_v1beta1a.Resource$Subscriptions")
    @js.native
    open class ResourceSubscriptions protected ()
      extends typings.googleapis.v1beta1aMod.pubsubV1beta1a.ResourceSubscriptions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsub", "pubsub_v1beta1a.Resource$Topics")
    @js.native
    open class ResourceTopics protected ()
      extends typings.googleapis.v1beta1aMod.pubsubV1beta1a.ResourceTopics {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object pubsubV1beta2 {
    
    @JSImport("googleapis/build/src/apis/pubsub", "pubsub_v1beta2.Pubsub")
    @js.native
    open class Pubsub protected ()
      extends typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Pubsub {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsub", "pubsub_v1beta2.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsub", "pubsub_v1beta2.Resource$Projects$Subscriptions")
    @js.native
    open class ResourceProjectsSubscriptions protected ()
      extends typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.ResourceProjectsSubscriptions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsub", "pubsub_v1beta2.Resource$Projects$Topics")
    @js.native
    open class ResourceProjectsTopics protected ()
      extends typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.ResourceProjectsTopics {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/pubsub", "pubsub_v1beta2.Resource$Projects$Topics$Subscriptions")
    @js.native
    open class ResourceProjectsTopicsSubscriptions protected ()
      extends typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.ResourceProjectsTopicsSubscriptions {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def pubsub_v1(version: v1): Pubsub = ^.asInstanceOf[js.Dynamic].applyDynamic("pubsub")(version.asInstanceOf[js.Any]).asInstanceOf[Pubsub]
  
  inline def pubsub_v1beta1a(version: v1beta1a): typings.googleapis.v1beta1aMod.pubsubV1beta1a.Pubsub = ^.asInstanceOf[js.Dynamic].applyDynamic("pubsub")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v1beta1aMod.pubsubV1beta1a.Pubsub]
  
  inline def pubsub_v1beta2(version: v1beta2): typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Pubsub = ^.asInstanceOf[js.Dynamic].applyDynamic("pubsub")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2.Pubsub]
}

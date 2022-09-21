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
import typings.googleapis.googleapisStrings.v1alpha
import typings.googleapis.googleapisStrings.v1beta
import typings.googleapis.ideahubV1alphaMod.ideahubV1alpha.Ideahub
import typings.googleapis.ideahubV1alphaMod.ideahubV1alpha.Options
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ideahubMod {
  
  @JSImport("googleapis/build/src/apis/ideahub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/ideahub", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/ideahub", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/ideahub", "VERSIONS.v1alpha")
    @js.native
    open class v1alpha protected () extends Ideahub {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/ideahub", "VERSIONS.v1alpha")
    @js.native
    def v1alpha: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Ideahub] = js.native
    inline def v1alpha_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Ideahub]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/ideahub", "VERSIONS.v1beta")
    @js.native
    open class v1beta protected ()
      extends typings.googleapis.ideahubV1betaMod.ideahubV1beta.Ideahub {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/ideahub", "VERSIONS.v1beta")
    @js.native
    def v1beta: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.ideahubV1betaMod.ideahubV1beta.Ideahub
      ] = js.native
    inline def v1beta_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.ideahubV1betaMod.ideahubV1beta.Ideahub
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/ideahub", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/ideahub", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/ideahub", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/ideahub", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/ideahub", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/ideahub", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/ideahub", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/ideahub", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/ideahub", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/ideahub", "auth.OAuth2")
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
  
  inline def ideahub(options: Options): Ideahub = ^.asInstanceOf[js.Dynamic].applyDynamic("ideahub")(options.asInstanceOf[js.Any]).asInstanceOf[Ideahub]
  inline def ideahub(options: typings.googleapis.ideahubV1betaMod.ideahubV1beta.Options): typings.googleapis.ideahubV1betaMod.ideahubV1beta.Ideahub = ^.asInstanceOf[js.Dynamic].applyDynamic("ideahub")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.ideahubV1betaMod.ideahubV1beta.Ideahub]
  
  object ideahubV1alpha {
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1alpha.Ideahub")
    @js.native
    open class Ideahub protected ()
      extends typings.googleapis.ideahubV1alphaMod.ideahubV1alpha.Ideahub {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1alpha.Resource$Ideas")
    @js.native
    open class ResourceIdeas protected ()
      extends typings.googleapis.ideahubV1alphaMod.ideahubV1alpha.ResourceIdeas {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1alpha.Resource$Platforms")
    @js.native
    open class ResourcePlatforms protected ()
      extends typings.googleapis.ideahubV1alphaMod.ideahubV1alpha.ResourcePlatforms {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1alpha.Resource$Platforms$Properties")
    @js.native
    open class ResourcePlatformsProperties protected ()
      extends typings.googleapis.ideahubV1alphaMod.ideahubV1alpha.ResourcePlatformsProperties {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1alpha.Resource$Platforms$Properties$Ideaactivities")
    @js.native
    open class ResourcePlatformsPropertiesIdeaactivities protected ()
      extends typings.googleapis.ideahubV1alphaMod.ideahubV1alpha.ResourcePlatformsPropertiesIdeaactivities {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1alpha.Resource$Platforms$Properties$Ideas")
    @js.native
    open class ResourcePlatformsPropertiesIdeas protected ()
      extends typings.googleapis.ideahubV1alphaMod.ideahubV1alpha.ResourcePlatformsPropertiesIdeas {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1alpha.Resource$Platforms$Properties$Ideastates")
    @js.native
    open class ResourcePlatformsPropertiesIdeastates protected ()
      extends typings.googleapis.ideahubV1alphaMod.ideahubV1alpha.ResourcePlatformsPropertiesIdeastates {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1alpha.Resource$Platforms$Properties$Locales")
    @js.native
    open class ResourcePlatformsPropertiesLocales protected ()
      extends typings.googleapis.ideahubV1alphaMod.ideahubV1alpha.ResourcePlatformsPropertiesLocales {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1alpha.Resource$Platforms$Properties$Topicstates")
    @js.native
    open class ResourcePlatformsPropertiesTopicstates protected ()
      extends typings.googleapis.ideahubV1alphaMod.ideahubV1alpha.ResourcePlatformsPropertiesTopicstates {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object ideahubV1beta {
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1beta.Ideahub")
    @js.native
    open class Ideahub protected ()
      extends typings.googleapis.ideahubV1betaMod.ideahubV1beta.Ideahub {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1beta.Resource$Platforms")
    @js.native
    open class ResourcePlatforms protected ()
      extends typings.googleapis.ideahubV1betaMod.ideahubV1beta.ResourcePlatforms {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1beta.Resource$Platforms$Properties")
    @js.native
    open class ResourcePlatformsProperties protected ()
      extends typings.googleapis.ideahubV1betaMod.ideahubV1beta.ResourcePlatformsProperties {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1beta.Resource$Platforms$Properties$Ideaactivities")
    @js.native
    open class ResourcePlatformsPropertiesIdeaactivities protected ()
      extends typings.googleapis.ideahubV1betaMod.ideahubV1beta.ResourcePlatformsPropertiesIdeaactivities {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1beta.Resource$Platforms$Properties$Ideas")
    @js.native
    open class ResourcePlatformsPropertiesIdeas protected ()
      extends typings.googleapis.ideahubV1betaMod.ideahubV1beta.ResourcePlatformsPropertiesIdeas {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1beta.Resource$Platforms$Properties$Ideastates")
    @js.native
    open class ResourcePlatformsPropertiesIdeastates protected ()
      extends typings.googleapis.ideahubV1betaMod.ideahubV1beta.ResourcePlatformsPropertiesIdeastates {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1beta.Resource$Platforms$Properties$Locales")
    @js.native
    open class ResourcePlatformsPropertiesLocales protected ()
      extends typings.googleapis.ideahubV1betaMod.ideahubV1beta.ResourcePlatformsPropertiesLocales {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/ideahub", "ideahub_v1beta.Resource$Platforms$Properties$Topicstates")
    @js.native
    open class ResourcePlatformsPropertiesTopicstates protected ()
      extends typings.googleapis.ideahubV1betaMod.ideahubV1beta.ResourcePlatformsPropertiesTopicstates {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def ideahub_v1alpha(version: v1alpha): Ideahub = ^.asInstanceOf[js.Dynamic].applyDynamic("ideahub")(version.asInstanceOf[js.Any]).asInstanceOf[Ideahub]
  
  inline def ideahub_v1beta(version: v1beta): typings.googleapis.ideahubV1betaMod.ideahubV1beta.Ideahub = ^.asInstanceOf[js.Dynamic].applyDynamic("ideahub")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.ideahubV1betaMod.ideahubV1beta.Ideahub]
}

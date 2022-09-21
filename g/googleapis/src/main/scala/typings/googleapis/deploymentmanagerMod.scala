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
import typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.Deploymentmanager
import typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.Options
import typings.googleapis.googleapisStrings.alpha
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v2beta
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deploymentmanagerMod {
  
  @JSImport("googleapis/build/src/apis/deploymentmanager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/deploymentmanager", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/deploymentmanager", "VERSIONS.alpha")
    @js.native
    open class alpha protected () extends Deploymentmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/deploymentmanager", "VERSIONS.alpha")
    @js.native
    def alpha: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Deploymentmanager
      ] = js.native
    inline def alpha_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Deploymentmanager
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alpha")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/deploymentmanager", "VERSIONS.v2")
    @js.native
    open class v2 protected ()
      extends typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Deploymentmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/deploymentmanager", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Deploymentmanager
      ] = js.native
    inline def v2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Deploymentmanager
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/deploymentmanager", "VERSIONS.v2beta")
    @js.native
    open class v2beta protected ()
      extends typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta.Deploymentmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/deploymentmanager", "VERSIONS.v2beta")
    @js.native
    def v2beta: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta.Deploymentmanager
      ] = js.native
    inline def v2beta_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta.Deploymentmanager
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2beta")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/deploymentmanager", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/deploymentmanager", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/deploymentmanager", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/deploymentmanager", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/deploymentmanager", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/deploymentmanager", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/deploymentmanager", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/deploymentmanager", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/deploymentmanager", "auth.OAuth2")
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
  
  inline def deploymentmanager(options: Options): Deploymentmanager = ^.asInstanceOf[js.Dynamic].applyDynamic("deploymentmanager")(options.asInstanceOf[js.Any]).asInstanceOf[Deploymentmanager]
  inline def deploymentmanager(options: typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Options): typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Deploymentmanager = ^.asInstanceOf[js.Dynamic].applyDynamic("deploymentmanager")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Deploymentmanager]
  inline def deploymentmanager(options: typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta.Options): typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta.Deploymentmanager = ^.asInstanceOf[js.Dynamic].applyDynamic("deploymentmanager")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta.Deploymentmanager]
  
  object deploymentmanagerAlpha {
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_alpha.Deploymentmanager")
    @js.native
    open class Deploymentmanager protected ()
      extends typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.Deploymentmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_alpha.Resource$Compositetypes")
    @js.native
    open class ResourceCompositetypes protected ()
      extends typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.ResourceCompositetypes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_alpha.Resource$Deployments")
    @js.native
    open class ResourceDeployments protected ()
      extends typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.ResourceDeployments {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_alpha.Resource$Manifests")
    @js.native
    open class ResourceManifests protected ()
      extends typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.ResourceManifests {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_alpha.Resource$Operations")
    @js.native
    open class ResourceOperations protected ()
      extends typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.ResourceOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_alpha.Resource$Resources")
    @js.native
    open class ResourceResources protected ()
      extends typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.ResourceResources {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_alpha.Resource$Typeproviders")
    @js.native
    open class ResourceTypeproviders protected ()
      extends typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.ResourceTypeproviders {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_alpha.Resource$Types")
    @js.native
    open class ResourceTypes protected ()
      extends typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha.ResourceTypes {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object deploymentmanagerV2 {
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_v2.Deploymentmanager")
    @js.native
    open class Deploymentmanager protected ()
      extends typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Deploymentmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_v2.Resource$Deployments")
    @js.native
    open class ResourceDeployments protected ()
      extends typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.ResourceDeployments {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_v2.Resource$Manifests")
    @js.native
    open class ResourceManifests protected ()
      extends typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.ResourceManifests {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_v2.Resource$Operations")
    @js.native
    open class ResourceOperations protected ()
      extends typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.ResourceOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_v2.Resource$Resources")
    @js.native
    open class ResourceResources protected ()
      extends typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.ResourceResources {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_v2.Resource$Types")
    @js.native
    open class ResourceTypes protected ()
      extends typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.ResourceTypes {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object deploymentmanagerV2beta {
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_v2beta.Deploymentmanager")
    @js.native
    open class Deploymentmanager protected ()
      extends typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta.Deploymentmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_v2beta.Resource$Compositetypes")
    @js.native
    open class ResourceCompositetypes protected ()
      extends typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta.ResourceCompositetypes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_v2beta.Resource$Deployments")
    @js.native
    open class ResourceDeployments protected ()
      extends typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta.ResourceDeployments {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_v2beta.Resource$Manifests")
    @js.native
    open class ResourceManifests protected ()
      extends typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta.ResourceManifests {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_v2beta.Resource$Operations")
    @js.native
    open class ResourceOperations protected ()
      extends typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta.ResourceOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_v2beta.Resource$Resources")
    @js.native
    open class ResourceResources protected ()
      extends typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta.ResourceResources {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_v2beta.Resource$Typeproviders")
    @js.native
    open class ResourceTypeproviders protected ()
      extends typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta.ResourceTypeproviders {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/deploymentmanager", "deploymentmanager_v2beta.Resource$Types")
    @js.native
    open class ResourceTypes protected ()
      extends typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta.ResourceTypes {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def deploymentmanager_alpha(version: alpha): Deploymentmanager = ^.asInstanceOf[js.Dynamic].applyDynamic("deploymentmanager")(version.asInstanceOf[js.Any]).asInstanceOf[Deploymentmanager]
  
  inline def deploymentmanager_v2(version: v2): typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Deploymentmanager = ^.asInstanceOf[js.Dynamic].applyDynamic("deploymentmanager")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Deploymentmanager]
  
  inline def deploymentmanager_v2beta(version: v2beta): typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta.Deploymentmanager = ^.asInstanceOf[js.Dynamic].applyDynamic("deploymentmanager")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta.Deploymentmanager]
}

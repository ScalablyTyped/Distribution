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
import typings.googleapis.googleapisStrings.v1alpha1
import typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.Options
import typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ProdTtSasportal
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prodTtSasportalMod {
  
  @JSImport("googleapis/build/src/apis/prod_tt_sasportal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "VERSIONS.v1alpha1")
    @js.native
    open class v1alpha1 protected () extends ProdTtSasportal {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "VERSIONS.v1alpha1")
    @js.native
    def v1alpha1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        ProdTtSasportal
      ] = js.native
    inline def v1alpha1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          ProdTtSasportal
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "auth.OAuth2")
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
  
  inline def prodTtSasportal(options: Options): ProdTtSasportal = ^.asInstanceOf[js.Dynamic].applyDynamic("prod_tt_sasportal")(options.asInstanceOf[js.Any]).asInstanceOf[ProdTtSasportal]
  
  object prodTtSasportalV1alpha1 {
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Prod_tt_sasportal")
    @js.native
    open class ProdTtSasportal protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ProdTtSasportal {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Customers")
    @js.native
    open class ResourceCustomers protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceCustomers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Customers$Deployments")
    @js.native
    open class ResourceCustomersDeployments protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceCustomersDeployments {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Customers$Deployments$Devices")
    @js.native
    open class ResourceCustomersDeploymentsDevices protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceCustomersDeploymentsDevices {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Customers$Devices")
    @js.native
    open class ResourceCustomersDevices protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceCustomersDevices {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Customers$Nodes")
    @js.native
    open class ResourceCustomersNodes protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceCustomersNodes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Customers$Nodes$Deployments")
    @js.native
    open class ResourceCustomersNodesDeployments protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceCustomersNodesDeployments {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Customers$Nodes$Devices")
    @js.native
    open class ResourceCustomersNodesDevices protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceCustomersNodesDevices {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Customers$Nodes$Nodes")
    @js.native
    open class ResourceCustomersNodesNodes protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceCustomersNodesNodes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Deployments")
    @js.native
    open class ResourceDeployments protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceDeployments {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Deployments$Devices")
    @js.native
    open class ResourceDeploymentsDevices protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceDeploymentsDevices {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Installer")
    @js.native
    open class ResourceInstaller protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceInstaller {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Nodes")
    @js.native
    open class ResourceNodes protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceNodes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Nodes$Deployments")
    @js.native
    open class ResourceNodesDeployments protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceNodesDeployments {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Nodes$Deployments$Devices")
    @js.native
    open class ResourceNodesDeploymentsDevices protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceNodesDeploymentsDevices {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Nodes$Devices")
    @js.native
    open class ResourceNodesDevices protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceNodesDevices {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Nodes$Nodes")
    @js.native
    open class ResourceNodesNodes protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceNodesNodes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Nodes$Nodes$Deployments")
    @js.native
    open class ResourceNodesNodesDeployments protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceNodesNodesDeployments {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Nodes$Nodes$Devices")
    @js.native
    open class ResourceNodesNodesDevices protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceNodesNodesDevices {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Nodes$Nodes$Nodes")
    @js.native
    open class ResourceNodesNodesNodes protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourceNodesNodesNodes {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/prod_tt_sasportal", "prod_tt_sasportal_v1alpha1.Resource$Policies")
    @js.native
    open class ResourcePolicies protected ()
      extends typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1.ResourcePolicies {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def prodTtSasportal_v1alpha1(version: v1alpha1): ProdTtSasportal = ^.asInstanceOf[js.Dynamic].applyDynamic("prod_tt_sasportal")(version.asInstanceOf[js.Any]).asInstanceOf[ProdTtSasportal]
}

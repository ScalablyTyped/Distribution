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
import typings.googleapis.googleapisStrings.v1alpha
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.Options
import typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.Remotebuildexecution
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remotebuildexecutionMod {
  
  @JSImport("googleapis/build/src/apis/remotebuildexecution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/remotebuildexecution", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Remotebuildexecution
      ] = js.native
    inline def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Remotebuildexecution
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "VERSIONS.v1alpha")
    @js.native
    open class v1alpha protected ()
      extends typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "VERSIONS.v1alpha")
    @js.native
    def v1alpha: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution
      ] = js.native
    inline def v1alpha_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1alpha")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "VERSIONS.v2")
    @js.native
    open class v2 protected ()
      extends typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution
      ] = js.native
    inline def v2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/remotebuildexecution", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "auth.OAuth2")
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
  
  inline def remotebuildexecution(options: Options): Remotebuildexecution = ^.asInstanceOf[js.Dynamic].applyDynamic("remotebuildexecution")(options.asInstanceOf[js.Any]).asInstanceOf[Remotebuildexecution]
  inline def remotebuildexecution(options: typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Options): typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution = ^.asInstanceOf[js.Dynamic].applyDynamic("remotebuildexecution")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution]
  inline def remotebuildexecution(options: typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Options): typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution = ^.asInstanceOf[js.Dynamic].applyDynamic("remotebuildexecution")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution]
  
  object remotebuildexecutionV1 {
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution_v1.Remotebuildexecution")
    @js.native
    open class Remotebuildexecution protected ()
      extends typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution_v1.Resource$Media")
    @js.native
    open class ResourceMedia protected ()
      extends typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.ResourceMedia {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution_v1.Resource$Operations")
    @js.native
    open class ResourceOperations protected ()
      extends typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.ResourceOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution_v1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution_v1.Resource$Projects$Operations")
    @js.native
    open class ResourceProjectsOperations protected ()
      extends typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1.ResourceProjectsOperations {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object remotebuildexecutionV1alpha {
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution_v1alpha.Remotebuildexecution")
    @js.native
    open class Remotebuildexecution protected ()
      extends typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution_v1alpha.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution_v1alpha.Resource$Projects$Instances")
    @js.native
    open class ResourceProjectsInstances protected ()
      extends typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.ResourceProjectsInstances {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution_v1alpha.Resource$Projects$Instances$Workerpools")
    @js.native
    open class ResourceProjectsInstancesWorkerpools protected ()
      extends typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.ResourceProjectsInstancesWorkerpools {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution_v1alpha.Resource$Projects$Operations")
    @js.native
    open class ResourceProjectsOperations protected ()
      extends typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.ResourceProjectsOperations {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object remotebuildexecutionV2 {
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution_v2.Remotebuildexecution")
    @js.native
    open class Remotebuildexecution protected ()
      extends typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution_v2.Resource$Actionresults")
    @js.native
    open class ResourceActionresults protected ()
      extends typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.ResourceActionresults {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution_v2.Resource$Actions")
    @js.native
    open class ResourceActions protected ()
      extends typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.ResourceActions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution_v2.Resource$Blobs")
    @js.native
    open class ResourceBlobs protected ()
      extends typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.ResourceBlobs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution_v2.Resource$Operations")
    @js.native
    open class ResourceOperations protected ()
      extends typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.ResourceOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/remotebuildexecution", "remotebuildexecution_v2.Resource$V2")
    @js.native
    open class ResourceV2 protected ()
      extends typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.ResourceV2 {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def remotebuildexecution_v1(version: v1): Remotebuildexecution = ^.asInstanceOf[js.Dynamic].applyDynamic("remotebuildexecution")(version.asInstanceOf[js.Any]).asInstanceOf[Remotebuildexecution]
  
  inline def remotebuildexecution_v1alpha(version: v1alpha): typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution = ^.asInstanceOf[js.Dynamic].applyDynamic("remotebuildexecution")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha.Remotebuildexecution]
  
  inline def remotebuildexecution_v2(version: v2): typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution = ^.asInstanceOf[js.Dynamic].applyDynamic("remotebuildexecution")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2.Remotebuildexecution]
}

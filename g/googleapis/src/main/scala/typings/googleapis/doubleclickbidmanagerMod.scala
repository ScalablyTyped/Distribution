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
import typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1.Doubleclickbidmanager
import typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1Dot1
import typings.googleapis.googleapisStrings.v2
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doubleclickbidmanagerMod {
  
  @JSImport("googleapis/build/src/apis/doubleclickbidmanager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Doubleclickbidmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Doubleclickbidmanager
      ] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "VERSIONS.v1.1")
    @js.native
    open class v11 protected ()
      extends typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11.Doubleclickbidmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "VERSIONS.v1.1")
    @js.native
    def v11: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11.Doubleclickbidmanager
      ] = js.native
    
    inline def v11_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11.Doubleclickbidmanager
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1.1")(x.asInstanceOf[js.Any])
    
    inline def v1_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Doubleclickbidmanager
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "VERSIONS.v2")
    @js.native
    open class v2 protected ()
      extends typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2.Doubleclickbidmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2.Doubleclickbidmanager
      ] = js.native
    inline def v2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2.Doubleclickbidmanager
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "auth.OAuth2")
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
  
  inline def doubleclickbidmanager(options: Options): Doubleclickbidmanager = ^.asInstanceOf[js.Dynamic].applyDynamic("doubleclickbidmanager")(options.asInstanceOf[js.Any]).asInstanceOf[Doubleclickbidmanager]
  inline def doubleclickbidmanager(options: typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2.Options): typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2.Doubleclickbidmanager = ^.asInstanceOf[js.Dynamic].applyDynamic("doubleclickbidmanager")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2.Doubleclickbidmanager]
  inline def doubleclickbidmanager(options: typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11.Options): typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11.Doubleclickbidmanager = ^.asInstanceOf[js.Dynamic].applyDynamic("doubleclickbidmanager")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11.Doubleclickbidmanager]
  
  object doubleclickbidmanagerV1 {
    
    /**
      * DoubleClick Bid Manager API
      *
      * DoubleClick Bid Manager API allows users to manage and create campaigns and reports.
      *
      * @example
      * ```js
      * const {google} = require('googleapis');
      * const doubleclickbidmanager = google.doubleclickbidmanager('v1');
      * ```
      */
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "doubleclickbidmanager_v1.Doubleclickbidmanager")
    @js.native
    open class Doubleclickbidmanager protected ()
      extends typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1.Doubleclickbidmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
  }
  
  object doubleclickbidmanagerV11 {
    
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "doubleclickbidmanager_v1_1.Doubleclickbidmanager")
    @js.native
    open class Doubleclickbidmanager protected ()
      extends typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11.Doubleclickbidmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "doubleclickbidmanager_v1_1.Resource$Queries")
    @js.native
    open class ResourceQueries protected ()
      extends typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11.ResourceQueries {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "doubleclickbidmanager_v1_1.Resource$Reports")
    @js.native
    open class ResourceReports protected ()
      extends typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11.ResourceReports {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object doubleclickbidmanagerV2 {
    
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "doubleclickbidmanager_v2.Doubleclickbidmanager")
    @js.native
    open class Doubleclickbidmanager protected ()
      extends typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2.Doubleclickbidmanager {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "doubleclickbidmanager_v2.Resource$Queries")
    @js.native
    open class ResourceQueries protected ()
      extends typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2.ResourceQueries {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/doubleclickbidmanager", "doubleclickbidmanager_v2.Resource$Queries$Reports")
    @js.native
    open class ResourceQueriesReports protected ()
      extends typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2.ResourceQueriesReports {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def doubleclickbidmanager_v1(version: v1): Doubleclickbidmanager = ^.asInstanceOf[js.Dynamic].applyDynamic("doubleclickbidmanager")(version.asInstanceOf[js.Any]).asInstanceOf[Doubleclickbidmanager]
  
  inline def doubleclickbidmanager_v11(version: v1Dot1): typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11.Doubleclickbidmanager = ^.asInstanceOf[js.Dynamic].applyDynamic("doubleclickbidmanager")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11.Doubleclickbidmanager]
  
  inline def doubleclickbidmanager_v2(version: v2): typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2.Doubleclickbidmanager = ^.asInstanceOf[js.Dynamic].applyDynamic("doubleclickbidmanager")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2.Doubleclickbidmanager]
}

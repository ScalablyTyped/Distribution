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
import typings.googleapis.gmailV1Mod.gmailV1.Gmail
import typings.googleapis.gmailV1Mod.gmailV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gmailMod {
  
  @JSImport("googleapis/build/src/apis/gmail", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/gmail", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/gmail", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/gmail", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Gmail {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/gmail", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Gmail] = js.native
    inline def v1_=(x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Gmail]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/gmail", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/gmail", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/gmail", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/gmail", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/gmail", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/gmail", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/gmail", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/gmail", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/gmail", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/gmail", "auth.OAuth2")
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
  
  inline def gmail(options: Options): Gmail = ^.asInstanceOf[js.Dynamic].applyDynamic("gmail")(options.asInstanceOf[js.Any]).asInstanceOf[Gmail]
  
  object gmailV1 {
    
    @JSImport("googleapis/build/src/apis/gmail", "gmail_v1.Gmail")
    @js.native
    open class Gmail protected ()
      extends typings.googleapis.gmailV1Mod.gmailV1.Gmail {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/gmail", "gmail_v1.Resource$Users")
    @js.native
    open class ResourceUsers protected ()
      extends typings.googleapis.gmailV1Mod.gmailV1.ResourceUsers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/gmail", "gmail_v1.Resource$Users$Drafts")
    @js.native
    open class ResourceUsersDrafts protected ()
      extends typings.googleapis.gmailV1Mod.gmailV1.ResourceUsersDrafts {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/gmail", "gmail_v1.Resource$Users$History")
    @js.native
    open class ResourceUsersHistory protected ()
      extends typings.googleapis.gmailV1Mod.gmailV1.ResourceUsersHistory {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/gmail", "gmail_v1.Resource$Users$Labels")
    @js.native
    open class ResourceUsersLabels protected ()
      extends typings.googleapis.gmailV1Mod.gmailV1.ResourceUsersLabels {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/gmail", "gmail_v1.Resource$Users$Messages")
    @js.native
    open class ResourceUsersMessages protected ()
      extends typings.googleapis.gmailV1Mod.gmailV1.ResourceUsersMessages {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/gmail", "gmail_v1.Resource$Users$Messages$Attachments")
    @js.native
    open class ResourceUsersMessagesAttachments protected ()
      extends typings.googleapis.gmailV1Mod.gmailV1.ResourceUsersMessagesAttachments {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/gmail", "gmail_v1.Resource$Users$Settings")
    @js.native
    open class ResourceUsersSettings protected ()
      extends typings.googleapis.gmailV1Mod.gmailV1.ResourceUsersSettings {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/gmail", "gmail_v1.Resource$Users$Settings$Delegates")
    @js.native
    open class ResourceUsersSettingsDelegates protected ()
      extends typings.googleapis.gmailV1Mod.gmailV1.ResourceUsersSettingsDelegates {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/gmail", "gmail_v1.Resource$Users$Settings$Filters")
    @js.native
    open class ResourceUsersSettingsFilters protected ()
      extends typings.googleapis.gmailV1Mod.gmailV1.ResourceUsersSettingsFilters {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/gmail", "gmail_v1.Resource$Users$Settings$Forwardingaddresses")
    @js.native
    open class ResourceUsersSettingsForwardingaddresses protected ()
      extends typings.googleapis.gmailV1Mod.gmailV1.ResourceUsersSettingsForwardingaddresses {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/gmail", "gmail_v1.Resource$Users$Settings$Sendas")
    @js.native
    open class ResourceUsersSettingsSendas protected ()
      extends typings.googleapis.gmailV1Mod.gmailV1.ResourceUsersSettingsSendas {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/gmail", "gmail_v1.Resource$Users$Settings$Sendas$Smimeinfo")
    @js.native
    open class ResourceUsersSettingsSendasSmimeinfo protected ()
      extends typings.googleapis.gmailV1Mod.gmailV1.ResourceUsersSettingsSendasSmimeinfo {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/gmail", "gmail_v1.Resource$Users$Threads")
    @js.native
    open class ResourceUsersThreads protected ()
      extends typings.googleapis.gmailV1Mod.gmailV1.ResourceUsersThreads {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def gmail_v1(version: v1): Gmail = ^.asInstanceOf[js.Dynamic].applyDynamic("gmail")(version.asInstanceOf[js.Any]).asInstanceOf[Gmail]
}

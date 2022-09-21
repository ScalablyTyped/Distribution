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
import typings.googleapis.drivelabelsV2Mod.drivelabelsV2.Drivelabels
import typings.googleapis.drivelabelsV2Mod.drivelabelsV2.Options
import typings.googleapis.googleapisStrings.v2
import typings.googleapis.googleapisStrings.v2beta
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drivelabelsMod {
  
  @JSImport("googleapis/build/src/apis/drivelabels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/drivelabels", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/drivelabels", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/drivelabels", "VERSIONS.v2")
    @js.native
    open class v2 protected () extends Drivelabels {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/drivelabels", "VERSIONS.v2")
    @js.native
    def v2: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        Drivelabels
      ] = js.native
    inline def v2_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          Drivelabels
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/drivelabels", "VERSIONS.v2beta")
    @js.native
    open class v2beta protected ()
      extends typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.Drivelabels {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/drivelabels", "VERSIONS.v2beta")
    @js.native
    def v2beta: Instantiable2[
        /* options */ GlobalOptions, 
        /* google */ js.UndefOr[GoogleConfigurable], 
        typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.Drivelabels
      ] = js.native
    inline def v2beta_=(
      x: Instantiable2[
          /* options */ GlobalOptions, 
          /* google */ js.UndefOr[GoogleConfigurable], 
          typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.Drivelabels
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v2beta")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/drivelabels", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/drivelabels", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/drivelabels", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/drivelabels", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/drivelabels", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/drivelabels", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/drivelabels", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/drivelabels", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/drivelabels", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/drivelabels", "auth.OAuth2")
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
  
  inline def drivelabels(options: Options): Drivelabels = ^.asInstanceOf[js.Dynamic].applyDynamic("drivelabels")(options.asInstanceOf[js.Any]).asInstanceOf[Drivelabels]
  inline def drivelabels(options: typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.Options): typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.Drivelabels = ^.asInstanceOf[js.Dynamic].applyDynamic("drivelabels")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.Drivelabels]
  
  object drivelabelsV2 {
    
    @JSImport("googleapis/build/src/apis/drivelabels", "drivelabels_v2.Drivelabels")
    @js.native
    open class Drivelabels protected ()
      extends typings.googleapis.drivelabelsV2Mod.drivelabelsV2.Drivelabels {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/drivelabels", "drivelabels_v2.Resource$Labels")
    @js.native
    open class ResourceLabels protected ()
      extends typings.googleapis.drivelabelsV2Mod.drivelabelsV2.ResourceLabels {
      def this(context: APIRequestContext) = this()
    }
  }
  
  object drivelabelsV2beta {
    
    @JSImport("googleapis/build/src/apis/drivelabels", "drivelabels_v2beta.Drivelabels")
    @js.native
    open class Drivelabels protected ()
      extends typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.Drivelabels {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/drivelabels", "drivelabels_v2beta.Resource$Labels")
    @js.native
    open class ResourceLabels protected ()
      extends typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.ResourceLabels {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/drivelabels", "drivelabels_v2beta.Resource$Labels$Locks")
    @js.native
    open class ResourceLabelsLocks protected ()
      extends typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.ResourceLabelsLocks {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/drivelabels", "drivelabels_v2beta.Resource$Labels$Permissions")
    @js.native
    open class ResourceLabelsPermissions protected ()
      extends typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.ResourceLabelsPermissions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/drivelabels", "drivelabels_v2beta.Resource$Labels$Revisions")
    @js.native
    open class ResourceLabelsRevisions protected ()
      extends typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.ResourceLabelsRevisions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/drivelabels", "drivelabels_v2beta.Resource$Labels$Revisions$Locks")
    @js.native
    open class ResourceLabelsRevisionsLocks protected ()
      extends typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.ResourceLabelsRevisionsLocks {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/drivelabels", "drivelabels_v2beta.Resource$Labels$Revisions$Permissions")
    @js.native
    open class ResourceLabelsRevisionsPermissions protected ()
      extends typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.ResourceLabelsRevisionsPermissions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/drivelabels", "drivelabels_v2beta.Resource$Limits")
    @js.native
    open class ResourceLimits protected ()
      extends typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.ResourceLimits {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/drivelabels", "drivelabels_v2beta.Resource$Users")
    @js.native
    open class ResourceUsers protected ()
      extends typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.ResourceUsers {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def drivelabels_v2(version: v2): Drivelabels = ^.asInstanceOf[js.Dynamic].applyDynamic("drivelabels")(version.asInstanceOf[js.Any]).asInstanceOf[Drivelabels]
  
  inline def drivelabels_v2beta(version: v2beta): typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.Drivelabels = ^.asInstanceOf[js.Dynamic].applyDynamic("drivelabels")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta.Drivelabels]
}

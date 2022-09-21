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
import typings.googleapis.spannerV1Mod.spannerV1.Options
import typings.googleapis.spannerV1Mod.spannerV1.Spanner
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spannerMod {
  
  @JSImport("googleapis/build/src/apis/spanner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/spanner", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/spanner", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/spanner", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Spanner {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/spanner", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Spanner] = js.native
    inline def v1_=(
      x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Spanner]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/spanner", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/spanner", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/spanner", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/spanner", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/spanner", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/spanner", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/spanner", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/spanner", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/spanner", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/spanner", "auth.OAuth2")
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
  
  inline def spanner(options: Options): Spanner = ^.asInstanceOf[js.Dynamic].applyDynamic("spanner")(options.asInstanceOf[js.Any]).asInstanceOf[Spanner]
  
  object spannerV1 {
    
    @JSImport("googleapis/build/src/apis/spanner", "spanner_v1.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.spannerV1Mod.spannerV1.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/spanner", "spanner_v1.Resource$Projects$Instanceconfigs")
    @js.native
    open class ResourceProjectsInstanceconfigs protected ()
      extends typings.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstanceconfigs {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/spanner", "spanner_v1.Resource$Projects$Instanceconfigs$Operations")
    @js.native
    open class ResourceProjectsInstanceconfigsOperations protected ()
      extends typings.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstanceconfigsOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/spanner", "spanner_v1.Resource$Projects$Instances")
    @js.native
    open class ResourceProjectsInstances protected ()
      extends typings.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstances {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/spanner", "spanner_v1.Resource$Projects$Instances$Backupoperations")
    @js.native
    open class ResourceProjectsInstancesBackupoperations protected ()
      extends typings.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstancesBackupoperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/spanner", "spanner_v1.Resource$Projects$Instances$Backups")
    @js.native
    open class ResourceProjectsInstancesBackups protected ()
      extends typings.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstancesBackups {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/spanner", "spanner_v1.Resource$Projects$Instances$Backups$Operations")
    @js.native
    open class ResourceProjectsInstancesBackupsOperations protected ()
      extends typings.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstancesBackupsOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/spanner", "spanner_v1.Resource$Projects$Instances$Databaseoperations")
    @js.native
    open class ResourceProjectsInstancesDatabaseoperations protected ()
      extends typings.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstancesDatabaseoperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/spanner", "spanner_v1.Resource$Projects$Instances$Databases")
    @js.native
    open class ResourceProjectsInstancesDatabases protected ()
      extends typings.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstancesDatabases {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/spanner", "spanner_v1.Resource$Projects$Instances$Databases$Databaseroles")
    @js.native
    open class ResourceProjectsInstancesDatabasesDatabaseroles protected ()
      extends typings.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstancesDatabasesDatabaseroles {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/spanner", "spanner_v1.Resource$Projects$Instances$Databases$Operations")
    @js.native
    open class ResourceProjectsInstancesDatabasesOperations protected ()
      extends typings.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstancesDatabasesOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/spanner", "spanner_v1.Resource$Projects$Instances$Databases$Sessions")
    @js.native
    open class ResourceProjectsInstancesDatabasesSessions protected ()
      extends typings.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstancesDatabasesSessions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/spanner", "spanner_v1.Resource$Projects$Instances$Operations")
    @js.native
    open class ResourceProjectsInstancesOperations protected ()
      extends typings.googleapis.spannerV1Mod.spannerV1.ResourceProjectsInstancesOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/spanner", "spanner_v1.Resource$Scans")
    @js.native
    open class ResourceScans protected ()
      extends typings.googleapis.spannerV1Mod.spannerV1.ResourceScans {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/spanner", "spanner_v1.Spanner")
    @js.native
    open class Spanner protected ()
      extends typings.googleapis.spannerV1Mod.spannerV1.Spanner {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
  }
  
  inline def spanner_v1(version: v1): Spanner = ^.asInstanceOf[js.Dynamic].applyDynamic("spanner")(version.asInstanceOf[js.Any]).asInstanceOf[Spanner]
}

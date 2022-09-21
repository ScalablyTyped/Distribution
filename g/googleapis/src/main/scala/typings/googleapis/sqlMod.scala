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
import typings.googleapis.googleapisStrings.v1beta4
import typings.googleapis.sqlV1beta4Mod.sqlV1beta4.Options
import typings.googleapis.sqlV1beta4Mod.sqlV1beta4.Sql
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlMod {
  
  @JSImport("googleapis/build/src/apis/sql", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/sql", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/sql", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/sql", "VERSIONS.v1beta4")
    @js.native
    open class v1beta4 protected () extends Sql {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/sql", "VERSIONS.v1beta4")
    @js.native
    def v1beta4: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Sql] = js.native
    inline def v1beta4_=(x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Sql]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1beta4")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/sql", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/sql", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/sql", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/sql", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/sql", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/sql", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/sql", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/sql", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/sql", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/sql", "auth.OAuth2")
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
  
  inline def sql(options: Options): Sql = ^.asInstanceOf[js.Dynamic].applyDynamic("sql")(options.asInstanceOf[js.Any]).asInstanceOf[Sql]
  
  object sqlV1beta4 {
    
    @JSImport("googleapis/build/src/apis/sql", "sql_v1beta4.Resource$Backupruns")
    @js.native
    open class ResourceBackupruns protected ()
      extends typings.googleapis.sqlV1beta4Mod.sqlV1beta4.ResourceBackupruns {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/sql", "sql_v1beta4.Resource$Databases")
    @js.native
    open class ResourceDatabases protected ()
      extends typings.googleapis.sqlV1beta4Mod.sqlV1beta4.ResourceDatabases {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/sql", "sql_v1beta4.Resource$Flags")
    @js.native
    open class ResourceFlags protected ()
      extends typings.googleapis.sqlV1beta4Mod.sqlV1beta4.ResourceFlags {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/sql", "sql_v1beta4.Resource$Instances")
    @js.native
    open class ResourceInstances protected ()
      extends typings.googleapis.sqlV1beta4Mod.sqlV1beta4.ResourceInstances {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/sql", "sql_v1beta4.Resource$Operations")
    @js.native
    open class ResourceOperations protected ()
      extends typings.googleapis.sqlV1beta4Mod.sqlV1beta4.ResourceOperations {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/sql", "sql_v1beta4.Resource$Projects")
    @js.native
    open class ResourceProjects protected ()
      extends typings.googleapis.sqlV1beta4Mod.sqlV1beta4.ResourceProjects {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/sql", "sql_v1beta4.Resource$Projects$Instances")
    @js.native
    open class ResourceProjectsInstances protected ()
      extends typings.googleapis.sqlV1beta4Mod.sqlV1beta4.ResourceProjectsInstances {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/sql", "sql_v1beta4.Resource$Sslcerts")
    @js.native
    open class ResourceSslcerts protected ()
      extends typings.googleapis.sqlV1beta4Mod.sqlV1beta4.ResourceSslcerts {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/sql", "sql_v1beta4.Resource$Tiers")
    @js.native
    open class ResourceTiers protected ()
      extends typings.googleapis.sqlV1beta4Mod.sqlV1beta4.ResourceTiers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/sql", "sql_v1beta4.Resource$Users")
    @js.native
    open class ResourceUsers protected ()
      extends typings.googleapis.sqlV1beta4Mod.sqlV1beta4.ResourceUsers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/sql", "sql_v1beta4.Sql")
    @js.native
    open class Sql protected ()
      extends typings.googleapis.sqlV1beta4Mod.sqlV1beta4.Sql {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
  }
  
  inline def sql_v1beta4(version: v1beta4): Sql = ^.asInstanceOf[js.Dynamic].applyDynamic("sql")(version.asInstanceOf[js.Any]).asInstanceOf[Sql]
}

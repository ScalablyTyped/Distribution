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
import typings.googleapis.gamesV1Mod.gamesV1.Games
import typings.googleapis.gamesV1Mod.gamesV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamesMod {
  
  @JSImport("googleapis/build/src/apis/games", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("googleapis/build/src/apis/games", "AuthPlus")
  @js.native
  open class AuthPlus ()
    extends typings.googleapisCommon.mod.AuthPlus {
    def this(opts: GoogleAuthOptions[JSONClient]) = this()
  }
  
  object VERSIONS {
    
    @JSImport("googleapis/build/src/apis/games", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/games", "VERSIONS.v1")
    @js.native
    open class v1 protected () extends Games {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    @JSImport("googleapis/build/src/apis/games", "VERSIONS.v1")
    @js.native
    def v1: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Games] = js.native
    inline def v1_=(x: Instantiable2[/* options */ GlobalOptions, /* google */ js.UndefOr[GoogleConfigurable], Games]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v1")(x.asInstanceOf[js.Any])
  }
  
  object auth extends Shortcut {
    
    @JSImport("googleapis/build/src/apis/games", "auth")
    @js.native
    val ^ : typings.googleapisCommon.mod.AuthPlus = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/games", "auth.AwsClient")
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
    @JSImport("googleapis/build/src/apis/games", "auth.Compute")
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
    @JSImport("googleapis/build/src/apis/games", "auth.DefaultTransporter")
    @js.native
    open class DefaultTransporter ()
      extends typings.googleAuthLibrary.transportersMod.DefaultTransporter
    /* static members */
    object DefaultTransporter {
      
      @JSImport("googleapis/build/src/apis/games", "auth.DefaultTransporter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def constructor(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("constructor")().asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/games", "auth.ExternalAccountClient")
    @js.native
    open class ExternalAccountClient ()
      extends typings.googleAuthLibrary.mod.ExternalAccountClient
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/games", "auth.GoogleAuth")
    @js.native
    open class GoogleAuth[T /* <: AuthClient */] ()
      extends typings.googleAuthLibrary.mod.GoogleAuth[T]
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("googleapis/build/src/apis/games", "auth.IdentityPoolClient")
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
    @JSImport("googleapis/build/src/apis/games", "auth.JWT")
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
    @JSImport("googleapis/build/src/apis/games", "auth.OAuth2")
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
  
  inline def games(options: Options): Games = ^.asInstanceOf[js.Dynamic].applyDynamic("games")(options.asInstanceOf[js.Any]).asInstanceOf[Games]
  
  object gamesV1 {
    
    @JSImport("googleapis/build/src/apis/games", "games_v1.Games")
    @js.native
    open class Games protected ()
      extends typings.googleapis.gamesV1Mod.gamesV1.Games {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
    }
    
    @JSImport("googleapis/build/src/apis/games", "games_v1.Resource$Achievementdefinitions")
    @js.native
    open class ResourceAchievementdefinitions protected ()
      extends typings.googleapis.gamesV1Mod.gamesV1.ResourceAchievementdefinitions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/games", "games_v1.Resource$Achievements")
    @js.native
    open class ResourceAchievements protected ()
      extends typings.googleapis.gamesV1Mod.gamesV1.ResourceAchievements {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/games", "games_v1.Resource$Applications")
    @js.native
    open class ResourceApplications protected ()
      extends typings.googleapis.gamesV1Mod.gamesV1.ResourceApplications {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/games", "games_v1.Resource$Events")
    @js.native
    open class ResourceEvents protected ()
      extends typings.googleapis.gamesV1Mod.gamesV1.ResourceEvents {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/games", "games_v1.Resource$Leaderboards")
    @js.native
    open class ResourceLeaderboards protected ()
      extends typings.googleapis.gamesV1Mod.gamesV1.ResourceLeaderboards {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/games", "games_v1.Resource$Metagame")
    @js.native
    open class ResourceMetagame protected ()
      extends typings.googleapis.gamesV1Mod.gamesV1.ResourceMetagame {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/games", "games_v1.Resource$Players")
    @js.native
    open class ResourcePlayers protected ()
      extends typings.googleapis.gamesV1Mod.gamesV1.ResourcePlayers {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/games", "games_v1.Resource$Revisions")
    @js.native
    open class ResourceRevisions protected ()
      extends typings.googleapis.gamesV1Mod.gamesV1.ResourceRevisions {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/games", "games_v1.Resource$Scores")
    @js.native
    open class ResourceScores protected ()
      extends typings.googleapis.gamesV1Mod.gamesV1.ResourceScores {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/games", "games_v1.Resource$Snapshots")
    @js.native
    open class ResourceSnapshots protected ()
      extends typings.googleapis.gamesV1Mod.gamesV1.ResourceSnapshots {
      def this(context: APIRequestContext) = this()
    }
    
    @JSImport("googleapis/build/src/apis/games", "games_v1.Resource$Stats")
    @js.native
    open class ResourceStats protected ()
      extends typings.googleapis.gamesV1Mod.gamesV1.ResourceStats {
      def this(context: APIRequestContext) = this()
    }
  }
  
  inline def games_v1(version: v1): Games = ^.asInstanceOf[js.Dynamic].applyDynamic("games")(version.asInstanceOf[js.Any]).asInstanceOf[Games]
}

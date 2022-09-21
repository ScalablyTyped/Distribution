package typings.matrixAppservice

import typings.matrixAppservice.anon.Aliases
import typings.matrixAppservice.matrixAppserviceStrings.aliases
import typings.matrixAppservice.matrixAppserviceStrings.rooms
import typings.matrixAppservice.matrixAppserviceStrings.users
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appServiceRegistrationMod {
  
  @JSImport("matrix-appservice/lib/app-service-registration", "AppServiceRegistration")
  @js.native
  open class AppServiceRegistration () extends StObject {
    def this(url: String) = this()
    
    def _isMatch(regexList: js.Array[RegexObj], sample: String, onlyExclusive: Boolean): Boolean = js.native
    def _isMatch(regexList: Unit, sample: String, onlyExclusive: Boolean): Boolean = js.native
    
    /**
      * Add a regex pattern to be registered.
      * @param {String} type : The type of regex pattern. Must be 'users', 'rooms', or
      * 'aliases'.
      * @param {String} regex : The regex pattern.
      * @param {Boolean} exclusive : True to reserve the matched namespace.
      * @throws If given an invalid type or regex.
      */
    def addRegexPattern(`type`: users | rooms | aliases, regex: String): Unit = js.native
    def addRegexPattern(`type`: users | rooms | aliases, regex: String, exclusive: Boolean): Unit = js.native
    
    /* private */ var asToken: Any = js.native
    
    /* private */ var cachedRegex: Any = js.native
    
    /**
      * Get the token the app service will use to communicate with the homeserver.
      * @return {?string} The token
      */
    def getAppServiceToken(): String | Null = js.native
    
    /**
      * Get the URL which the home server will hit in order to talk to the AS.
      */
    def getAppServiceUrl(): String | Null = js.native
    
    /**
      * Get the token the homeserver will use to communicate with the app service.
      * @return {?string} The token
      */
    def getHomeserverToken(): String | Null = js.native
    
    /**
      * Get the ID of the appservice.
      * @return {?string} The ID
      */
    def getId(): String | Null = js.native
    
    /**
      * Get the key-value output which should be written to a YAML file.
      * @throws If required fields hs_token, as-token, url, sender_localpart are missing.
      */
    def getOutput(): AppServiceOutput = js.native
    
    /**
      * Get the list of protocols that this appservice will serve for third party lookups.
      * Will return null if no protocols have been set.
      * @return {string[]} The protocols.
      */
    def getProtocols(): js.Array[String] | Null = js.native
    
    /**
      * Get the desired user_id localpart for the app service itself.
      * @return {?string} The user_id localpart ("alice" in "@alice:domain")
      */
    def getSenderLocalpart(): String | Null = js.native
    
    /* private */ var hsToken: Any = js.native
    
    /**
      * Construct a new application service registration.
      * @constructor
      * @param {string} appServiceUrl The base URL the AS can be reached via.
      */
    /* private */ var id: Any = js.native
    
    /**
      * Check if a room alias meets this registration regex.
      * @param {string} alias The room alias
      * @param {boolean} onlyExclusive True to restrict matching to only exclusive
      * regexes. False to allow exclusive or non-exlusive regexes to match.
      * @return {boolean} True if there is a match.
      */
    def isAliasMatch(alias: String, onlyExclusive: Boolean): Boolean = js.native
    
    /**
      * Get whether requests from this AS are rate-limited by the home server.
      */
    def isRateLimited(): Boolean = js.native
    
    /**
      * Check if a room ID meets this registration regex.
      * @param {string} roomId The room ID
      * @param {boolean} onlyExclusive True to restrict matching to only exclusive
      * regexes. False to allow exclusive or non-exlusive regexes to match.
      * @return {boolean} True if there is a match.
      */
    def isRoomMatch(roomId: String, onlyExclusive: Boolean): Boolean = js.native
    
    /**
      * Check if a user_id meets this registration regex.
      * @param {string} userId The user ID
      * @param {boolean} onlyExclusive True to restrict matching to only exclusive
      * regexes. False to allow exclusive or non-exlusive regexes to match.
      * @return {boolean} True if there is a match.
      */
    def isUserMatch(userId: String, onlyExclusive: Boolean): Boolean = js.native
    
    /* private */ var namespaces: Any = js.native
    
    /**
      * Output this registration to the given file name.
      * @param {String} filename The file name to write the yaml to.
      * @throws If required fields hs_token, as_token, url are missing.
      */
    def outputAsYaml(filename: String): Unit = js.native
    
    /* private */ var protocols: Any = js.native
    
    /**
      * **Experimental**
      * Signal to the homeserver that this appservice will accept ephemeral events.
      */
    var pushEphemeral: js.UndefOr[Boolean] = js.native
    
    /**
      * **Experimental**
      *
      * Should the appservice receive ephemeral events. Note this requires
      * a homeserver implementing MSC2409.
      */
    def pushEphemeralEnabled(): Boolean = js.native
    
    /* private */ var rateLimited: Any = js.native
    
    /* private */ var senderLocalpart: Any = js.native
    
    /**
      * Set the token the app service will use to communicate with the homeserver.
      * @param {string} token The token
      */
    def setAppServiceToken(token: String): Unit = js.native
    
    /**
      * Set the URL which the home server will hit in order to talk to the AS.
      * @param {string} url The application service url
      */
    def setAppServiceUrl(url: String): Unit = js.native
    
    /**
      * Set the token the homeserver will use to communicate with the app service.
      * @param {string} token The token
      */
    def setHomeserverToken(token: String): Unit = js.native
    
    /**
      * Set the ID of the appservice; must be unique across the homeserver and never change.
      * @param {string} id The ID
      */
    def setId(id: String): Unit = js.native
    
    /**
      * Set the list of protocols that this appservice will serve for third party lookups.
      * @param {string[]} protocols The protocols
      */
    def setProtocols(protocols: js.Array[String]): Unit = js.native
    
    /**
      * Set whether requests from this AS are rate-limited by the home server.
      * @param {boolean} isRateLimited The flag which is set to true to enable rate
      * rate limiting, false to disable.
      */
    def setRateLimited(isRateLimited: Boolean): Unit = js.native
    
    /**
      * Set the desired user_id localpart for the app service itself.
      * @param {string} localpart The user_id localpart ("alice" in "@alice:domain")
      */
    def setSenderLocalpart(localpart: String): Unit = js.native
    
    /* private */ var url: Any = js.native
  }
  /* static members */
  object AppServiceRegistration {
    
    @JSImport("matrix-appservice/lib/app-service-registration", "AppServiceRegistration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert a JSON object to an AppServiceRegistration object.
      * @static
      * @param obj The registration object
      * @return The registration.
      */
    inline def fromObject(obj: AppServiceOutput): AppServiceRegistration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[AppServiceRegistration]
    
    /**
      * Generate a random token.
      * @return {string} A randomly generated token.
      */
    inline def generateToken(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateToken")().asInstanceOf[String]
  }
  
  trait AppServiceOutput extends StObject {
    
    var as_token: String
    
    @JSName("de.sorunome.msc2409.push_ephemeral")
    var deDotsorunomeDotmsc2409Dotpush_ephemeral: js.UndefOr[Boolean] = js.undefined
    
    var hs_token: String
    
    var id: String
    
    var namespaces: js.UndefOr[Aliases] = js.undefined
    
    var protocols: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    var rate_limited: js.UndefOr[Boolean] = js.undefined
    
    var sender_localpart: String
    
    var url: String | Null
  }
  object AppServiceOutput {
    
    inline def apply(as_token: String, hs_token: String, id: String, sender_localpart: String): AppServiceOutput = {
      val __obj = js.Dynamic.literal(as_token = as_token.asInstanceOf[js.Any], hs_token = hs_token.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sender_localpart = sender_localpart.asInstanceOf[js.Any], url = null)
      __obj.asInstanceOf[AppServiceOutput]
    }
    
    extension [Self <: AppServiceOutput](x: Self) {
      
      inline def setAs_token(value: String): Self = StObject.set(x, "as_token", value.asInstanceOf[js.Any])
      
      inline def setDeDotsorunomeDotmsc2409Dotpush_ephemeral(value: Boolean): Self = StObject.set(x, "de.sorunome.msc2409.push_ephemeral", value.asInstanceOf[js.Any])
      
      inline def setDeDotsorunomeDotmsc2409Dotpush_ephemeralUndefined: Self = StObject.set(x, "de.sorunome.msc2409.push_ephemeral", js.undefined)
      
      inline def setHs_token(value: String): Self = StObject.set(x, "hs_token", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNamespaces(value: Aliases): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
      
      inline def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsNull: Self = StObject.set(x, "protocols", null)
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setRate_limited(value: Boolean): Self = StObject.set(x, "rate_limited", value.asInstanceOf[js.Any])
      
      inline def setRate_limitedUndefined: Self = StObject.set(x, "rate_limited", js.undefined)
      
      inline def setSender_localpart(value: String): Self = StObject.set(x, "sender_localpart", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlNull: Self = StObject.set(x, "url", null)
    }
  }
  
  trait RegexObj extends StObject {
    
    var exclusive: Boolean
    
    var regex: String
  }
  object RegexObj {
    
    inline def apply(exclusive: Boolean, regex: String): RegexObj = {
      val __obj = js.Dynamic.literal(exclusive = exclusive.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegexObj]
    }
    
    extension [Self <: RegexObj](x: Self) {
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
}

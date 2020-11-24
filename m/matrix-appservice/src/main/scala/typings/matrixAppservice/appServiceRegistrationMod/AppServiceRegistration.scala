package typings.matrixAppservice.appServiceRegistrationMod

import typings.matrixAppservice.matrixAppserviceStrings.aliases
import typings.matrixAppservice.matrixAppserviceStrings.rooms
import typings.matrixAppservice.matrixAppserviceStrings.users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice/lib/app-service-registration", "AppServiceRegistration")
@js.native
class AppServiceRegistration () extends js.Object {
  def this(url: String) = this()
  
  def _isMatch(regexList: js.UndefOr[scala.Nothing], sample: String, onlyExclusive: Boolean): Boolean = js.native
  def _isMatch(regexList: js.Array[RegexObj], sample: String, onlyExclusive: Boolean): Boolean = js.native
  
  @JSName("addRegexPattern")
  def addRegexPattern_aliases(`type`: aliases, regex: String): Unit = js.native
  @JSName("addRegexPattern")
  def addRegexPattern_aliases(`type`: aliases, regex: String, exclusive: Boolean): Unit = js.native
  @JSName("addRegexPattern")
  def addRegexPattern_rooms(`type`: rooms, regex: String): Unit = js.native
  @JSName("addRegexPattern")
  def addRegexPattern_rooms(`type`: rooms, regex: String, exclusive: Boolean): Unit = js.native
  /**
    * Add a regex pattern to be registered.
    * @param {String} type : The type of regex pattern. Must be 'users', 'rooms', or
    * 'aliases'.
    * @param {String} regex : The regex pattern.
    * @param {Boolean} exclusive : True to reserve the matched namespace.
    * @throws If given an invalid type or regex.
    */
  @JSName("addRegexPattern")
  def addRegexPattern_users(`type`: users, regex: String): Unit = js.native
  @JSName("addRegexPattern")
  def addRegexPattern_users(`type`: users, regex: String, exclusive: Boolean): Unit = js.native
  
  var asToken: js.Any = js.native
  
  var cachedRegex: js.Any = js.native
  
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
  
  var hsToken: js.Any = js.native
  
  /**
    * Construct a new application service registration.
    * @constructor
    * @param {string} appServiceUrl The base URL the AS can be reached via.
    */
  var id: js.Any = js.native
  
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
  
  var namespaces: js.Any = js.native
  
  /**
    * Output this registration to the given file name.
    * @param {String} filename The file name to write the yaml to.
    * @throws If required fields hs_token, as_token, url are missing.
    */
  def outputAsYaml(filename: String): Unit = js.native
  
  var protocols: js.Any = js.native
  
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
  
  var rateLimited: js.Any = js.native
  
  var senderLocalpart: js.Any = js.native
  
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
  
  var url: js.Any = js.native
}
/* static members */
@JSImport("matrix-appservice/lib/app-service-registration", "AppServiceRegistration")
@js.native
object AppServiceRegistration extends js.Object {
  
  /**
    * Convert a JSON object to an AppServiceRegistration object.
    * @static
    * @param obj The registration object
    * @return The registration.
    */
  def fromObject(obj: AppServiceOutput): AppServiceRegistration = js.native
  
  /**
    * Generate a random token.
    * @return {string} A randomly generated token.
    */
  def generateToken(): String = js.native
}

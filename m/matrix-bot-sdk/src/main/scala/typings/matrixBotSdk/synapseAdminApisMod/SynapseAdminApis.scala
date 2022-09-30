package typings.matrixBotSdk.synapseAdminApisMod

import typings.matrixBotSdk.matrixClientMod.MatrixClient
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk/lib/SynapseAdminApis", "SynapseAdminApis")
@js.native
open class SynapseAdminApis protected () extends StObject {
  def this(client: MatrixClient) = this()
  
  /* private */ var client: Any = js.native
  
  /**
    * Create a new registration token.
    * @param options Options to pass to the request.
    * @returns The newly created token.
    */
  def createRegistrationToken(): js.Promise[SynapseRegistrationToken] = js.native
  def createRegistrationToken(options: SynapseRegistrationTokenOptions): js.Promise[SynapseRegistrationToken] = js.native
  
  /**
    * Delete a registration token
    * @param token The token to update.
    * @returns A promise that resolves upon success.
    */
  def deleteRegistrationToken(token: String): js.Promise[Unit] = js.native
  
  /**
    * Deletes a room from the server, purging all record of it.
    * @param {string} roomId The room to delete.
    * @returns {Promise} Resolves when complete.
    */
  def deleteRoom(roomId: String): js.Promise[Unit] = js.native
  
  /**
    * Gets the status of all active deletion tasks, and all those completed in the last 24h, for the given room_id.
    * @param {string} roomId The room ID to get deletion state for.
    * @returns {Promise<any[]>} Resolves to the room's deletion status results.
    */
  def getDeleteRoomState(roomId: String): js.Promise[js.Array[Any]] = js.native
  
  /**
    * Get details about a single token.
    * @param token The token to fetch.
    * @returns A registration tokens, or null if not found.
    */
  def getRegistrationToken(token: String): js.Promise[SynapseRegistrationToken | Null] = js.native
  
  /**
    * Gets a list of state events in a room.
    * @param {string} roomId The room ID to get state for.
    * @returns {Promise<any[]>} Resolves to the room's state events.
    */
  def getRoomState(roomId: String): js.Promise[js.Array[Any]] = js.native
  
  /**
    * Get information about a user. The client making the request must be an admin user.
    * @param {string} userId The user ID to check.
    * @returns {Promise<SynapseUser>} The resulting Synapse user record
    */
  def getUser(userId: String): js.Promise[SynapseUser] = js.native
  
  /**
    * Determines if the given user is a Synapse server administrator for this homeserver. The
    * client making the request must be an admin user themselves (check with `isSelfAdmin`)
    * @param {string} userId The user ID to check.
    * @returns {Promise<boolean>} Resolves to true if the user is an admin, false otherwise.
    * Throws if there's an error.
    */
  def isAdmin(userId: String): js.Promise[Boolean] = js.native
  
  /**
    * Determines if the current user is an admin for the Synapse homeserver.
    * @returns {Promise<boolean>} Resolve to true if the user is an admin, false otherwise.
    * Throws if there's an error.
    */
  def isSelfAdmin(): js.Promise[Boolean] = js.native
  
  /**
    * Get a list of all users registered with Synapse, optionally filtered by some criteria. The
    * client making the request must be an admin user.
    *
    * This method returns an async generator that can be used to filter results.
    * @param options Options to pass to the user listing function
    * @example
    * for await (const user of synapseAdminApis.listAllUsers()) {
    *    if (user.name === '@alice:example.com') {
    *       return user;
    *    }
    * }
    */
  def listAllUsers(): AsyncGenerator[SynapseUserListing, Any, Any] = js.native
  def listAllUsers(options: SynapseListUserOptions): AsyncGenerator[SynapseUserListing, Any, Any] = js.native
  
  /**
    * List all registration tokens on the homeserver.
    * @param valid If true, only valid tokens are returned.
    * If false, only tokens that have expired or have had all uses exhausted are returned.
    * If omitted, all tokens are returned regardless of validity.
    * @returns An array of registration tokens.
    */
  def listRegistrationTokens(): js.Promise[js.Array[SynapseRegistrationToken]] = js.native
  def listRegistrationTokens(valid: Boolean): js.Promise[js.Array[SynapseRegistrationToken]] = js.native
  
  /**
    * Lists the rooms on the server.
    * @param {string} searchTerm A term to search for in the room names
    * @param {string} from A previous batch token to search from
    * @param {number} limit The maximum number of rooms to return
    * @param {SynapseRoomProperty} orderBy A property of rooms to order by
    * @param {boolean} reverseOrder True to reverse the orderBy direction.
    * @returns {Promise<SynapseRoomList>} Resolves to the server's rooms, ordered and filtered.
    */
  def listRooms(): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: String): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: String, from: String): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: String, from: String, limit: Double): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: String, from: String, limit: Double, orderBy: Unit, reverseOrder: Boolean): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: String, from: String, limit: Double, orderBy: SynapseRoomProperty): js.Promise[SynapseRoomList] = js.native
  def listRooms(
    searchTerm: String,
    from: String,
    limit: Double,
    orderBy: SynapseRoomProperty,
    reverseOrder: Boolean
  ): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: String, from: String, limit: Unit, orderBy: Unit, reverseOrder: Boolean): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: String, from: String, limit: Unit, orderBy: SynapseRoomProperty): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: String, from: String, limit: Unit, orderBy: SynapseRoomProperty, reverseOrder: Boolean): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: String, from: Unit, limit: Double): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: String, from: Unit, limit: Double, orderBy: Unit, reverseOrder: Boolean): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: String, from: Unit, limit: Double, orderBy: SynapseRoomProperty): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: String, from: Unit, limit: Double, orderBy: SynapseRoomProperty, reverseOrder: Boolean): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: String, from: Unit, limit: Unit, orderBy: Unit, reverseOrder: Boolean): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: String, from: Unit, limit: Unit, orderBy: SynapseRoomProperty): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: String, from: Unit, limit: Unit, orderBy: SynapseRoomProperty, reverseOrder: Boolean): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: Unit, from: String): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: Unit, from: String, limit: Double): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: Unit, from: String, limit: Double, orderBy: Unit, reverseOrder: Boolean): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: Unit, from: String, limit: Double, orderBy: SynapseRoomProperty): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: Unit, from: String, limit: Double, orderBy: SynapseRoomProperty, reverseOrder: Boolean): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: Unit, from: String, limit: Unit, orderBy: Unit, reverseOrder: Boolean): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: Unit, from: String, limit: Unit, orderBy: SynapseRoomProperty): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: Unit, from: String, limit: Unit, orderBy: SynapseRoomProperty, reverseOrder: Boolean): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: Unit, from: Unit, limit: Double): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: Unit, from: Unit, limit: Double, orderBy: Unit, reverseOrder: Boolean): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: Unit, from: Unit, limit: Double, orderBy: SynapseRoomProperty): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: Unit, from: Unit, limit: Double, orderBy: SynapseRoomProperty, reverseOrder: Boolean): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: Unit, from: Unit, limit: Unit, orderBy: Unit, reverseOrder: Boolean): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: Unit, from: Unit, limit: Unit, orderBy: SynapseRoomProperty): js.Promise[SynapseRoomList] = js.native
  def listRooms(searchTerm: Unit, from: Unit, limit: Unit, orderBy: SynapseRoomProperty, reverseOrder: Boolean): js.Promise[SynapseRoomList] = js.native
  
  /**
    * Get a list of users registered with Synapse, optionally filtered by some criteria. The
    * client making the request must be an admin user.
    * @param {string} from The token to continue listing users from.
    * @param {number} limit The maximum number of users to request.
    * @param {string} name Optional localpart or display name filter for results.
    * @param {boolean} guests Whether or not to include guest accounts. Default true.
    * @param {boolean} deactivated Whether or not to include deactivated accounts. Default false.
    * @returns {Promise<SynapseUserList>} A batch of user results.
    */
  def listUsers(): js.Promise[SynapseUserList] = js.native
  def listUsers(from: String): js.Promise[SynapseUserList] = js.native
  def listUsers(from: String, limit: Double): js.Promise[SynapseUserList] = js.native
  def listUsers(from: String, limit: Double, name: String): js.Promise[SynapseUserList] = js.native
  def listUsers(from: String, limit: Double, name: String, guests: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: String, limit: Double, name: String, guests: Boolean, deactivated: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: String, limit: Double, name: String, guests: Unit, deactivated: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: String, limit: Double, name: Unit, guests: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: String, limit: Double, name: Unit, guests: Boolean, deactivated: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: String, limit: Double, name: Unit, guests: Unit, deactivated: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: String, limit: Unit, name: String): js.Promise[SynapseUserList] = js.native
  def listUsers(from: String, limit: Unit, name: String, guests: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: String, limit: Unit, name: String, guests: Boolean, deactivated: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: String, limit: Unit, name: String, guests: Unit, deactivated: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: String, limit: Unit, name: Unit, guests: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: String, limit: Unit, name: Unit, guests: Boolean, deactivated: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: String, limit: Unit, name: Unit, guests: Unit, deactivated: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: Unit, limit: Double): js.Promise[SynapseUserList] = js.native
  def listUsers(from: Unit, limit: Double, name: String): js.Promise[SynapseUserList] = js.native
  def listUsers(from: Unit, limit: Double, name: String, guests: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: Unit, limit: Double, name: String, guests: Boolean, deactivated: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: Unit, limit: Double, name: String, guests: Unit, deactivated: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: Unit, limit: Double, name: Unit, guests: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: Unit, limit: Double, name: Unit, guests: Boolean, deactivated: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: Unit, limit: Double, name: Unit, guests: Unit, deactivated: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: Unit, limit: Unit, name: String): js.Promise[SynapseUserList] = js.native
  def listUsers(from: Unit, limit: Unit, name: String, guests: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: Unit, limit: Unit, name: String, guests: Boolean, deactivated: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: Unit, limit: Unit, name: String, guests: Unit, deactivated: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: Unit, limit: Unit, name: Unit, guests: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: Unit, limit: Unit, name: Unit, guests: Boolean, deactivated: Boolean): js.Promise[SynapseUserList] = js.native
  def listUsers(from: Unit, limit: Unit, name: Unit, guests: Unit, deactivated: Boolean): js.Promise[SynapseUserList] = js.native
  
  /**
    * Update an existing registration token.
    * @param token The token to update.
    * @param options Options to pass to the request.
    * @returns The newly created token.
    */
  def updateRegistrationToken(token: String, options: SynapseRegistrationTokenUpdateOptions): js.Promise[SynapseRegistrationToken] = js.native
  
  /**
    * Create or update a given user on a Synapse server. The
    * client making the request must be an admin user.
    * @param {string} userId The user ID to check.
    * @param {SynapseUserProperties} opts Options to set when creating or updating the user.
    * @returns {Promise<SynapseUser>} The resulting Synapse user record
    */
  def upsertUser(userId: String): js.Promise[SynapseUser] = js.native
  def upsertUser(userId: String, opts: SynapseUserProperties): js.Promise[SynapseUser] = js.native
}

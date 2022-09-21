package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.bridgeStoreMod.BridgeStore
import typings.matrixAppserviceBridge.usersMatrixMod.MatrixUser
import typings.matrixAppserviceBridge.usersRemoteMod.RemoteUser
import typings.nedb.mod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userBridgeStoreMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/user-bridge-store", "UserBridgeStore")
  @js.native
  open class UserBridgeStore protected () extends BridgeStore {
    /**
      * Construct a store suitable for user bridging information.
      * @param db The connected NEDB database instance
      */
    def this(db: ^[Any]) = this()
    
    /**
      * Get Matrix users by some data about them, previously stored via the set
      * method on the Matrix user.
      * @param dataQuery The keys and matching values the remote users share.
      * This should use dot notation for nested types. For example:
      * <code> { "topLevel.midLevel.leaf": 42, "otherTopLevel": "foo" } </code>
      * @return Resolves to a possibly empty list of
      * MatrixUsers. Rejects with an error if there was a problem querying the store.
      * @throws If dataQuery isn't an object.
      * @example
      * matrixUser.set({
      *   toplevel: "foo",
      *   nested: {
      *     bar: {
      *       baz: 43
      *     }
      *   }
      * });
      * store.setMatrixUser(matrixUser).then(function() {
      *   store.getByMatrixData({
      *     "toplevel": "foo",
      *     "nested.bar.baz": 43
      *   })
      * });
      */
    def getByMatrixData(dataQuery: Record[String, Any]): js.Promise[js.Array[MatrixUser]] = js.native
    
    /**
      * Retrieve a MatrixUser based on their user ID localpart. If there is more than
      * one match (e.g. same localpart, different domains) then this will return an
      * arbitrary matching user.
      * @param localpart The user localpart
      * @return Resolves to a MatrixUser or null.
      */
    def getByMatrixLocalpart(localpart: String): js.Promise[MatrixUser | Null] = js.native
    
    /**
      * Get remote users by some data about them, previously stored via the set
      * method on the Remote user.
      * @param dataQuery The keys and matching values the remote users share.
      * This should use dot notation for nested types. For example:
      * <code> { "topLevel.midLevel.leaf": 42, "otherTopLevel": "foo" } </code>
      * @return Resolves to a possibly empty list of
      * RemoteUsers. Rejects with an error if there was a problem querying the store.
      * @throws If dataQuery isn't an object.
      * @example
      * remoteUser.set({
      *   toplevel: "foo",
      *   nested: {
      *     bar: {
      *       baz: 43
      *     }
      *   }
      * });
      * store.setRemoteUser(remoteUser).then(function() {
      *   store.getByRemoteData({
      *     "toplevel": "foo",
      *     "nested.bar.baz": 43
      *   })
      * });
      */
    def getByRemoteData(dataQuery: Record[String, Any]): js.Promise[js.Array[RemoteUser]] = js.native
    
    /**
      * Retrieve a list of matrix user IDs linked to this remote ID.
      * @param remoteId The remote ID
      * @return A list of user IDs.
      */
    def getMatrixLinks(remoteId: String): js.Promise[js.Array[String] | Null] = js.native
    
    /**
      * Get a matrix user by their user ID.
      * @param userId The user_id
      * @return Resolves to the user or null if they
      * do not exist. Rejects with an error if there was a problem querying the store.
      */
    def getMatrixUser(userId: String): js.Promise[MatrixUser | Null] = js.native
    
    /**
      * Retrieve a list of corresponding matrix users for the given remote ID.
      * @param remoteId The Remote ID
      * @return Resolves to a list of Matrix users.
      */
    def getMatrixUsersFromRemoteId(remoteId: String): js.Promise[js.Array[MatrixUser]] = js.native
    
    /**
      * Retrieve a list of remote IDs linked to this matrix user ID.
      * @param matrixId The matrix user ID
      * @return A list of remote IDs.
      */
    def getRemoteLinks(matrixId: String): js.Promise[js.Array[String] | Null] = js.native
    
    /**
      * Get a remote user by their remote ID.
      * @param id The remote ID
      * @return Resolves to the user or null if they
      * do not exist. Rejects with an error if there was a problem querying the store.
      */
    def getRemoteUser(id: String): js.Promise[RemoteUser | Null] = js.native
    
    /**
      * Retrieve a list of corresponding remote users for the given matrix user ID.
      * @param userId The Matrix user ID
      * @return Resolves to a list of Remote users.
      */
    def getRemoteUsersFromMatrixId(userId: String): js.Promise[js.Array[RemoteUser]] = js.native
    
    /**
      * Create a link between a matrix and remote user. If either user does not exist,
      * they will be inserted prior to linking. This is done to ensure foreign key
      * constraints are satisfied (so you cannot have a mapping to a user ID which
      * does not exist).
      * @param matrixUser The matrix user
      * @param remoteUser The remote user
      */
    def linkUsers(matrixUser: MatrixUser, remoteUser: RemoteUser): js.Promise[Unit] = js.native
    
    /**
      * Store a Matrix user. If they already exist, they will be updated. Equivalence
      * is determined by their user ID.
      * @param matrixUser The matrix user
      */
    def setMatrixUser(matrixUser: MatrixUser): js.Promise[Unit] = js.native
    
    /**
      * Store a Remote user. If they already exist, they will be updated. Equivalence
      * is determined by the Remote ID.
      * @param remoteUser The remote user
      */
    def setRemoteUser(remoteUser: RemoteUser): js.Promise[Unit] = js.native
    
    /**
      * Delete a link between a matrix user ID and a remote user ID.
      * @param matrixUserId The matrix user ID
      * @param remoteUserId The remote user ID
      * @return Resolves to the number of entries removed.
      */
    def unlinkUserIds(matrixUserId: String, remoteUserId: String): js.Promise[Double] = js.native
    
    /**
      * Delete a link between a matrix user and a remote user.
      * @param matrixUser The matrix user
      * @param remoteUser The remote user
      * @return Resolves to the number of entries removed.
      */
    def unlinkUsers(matrixUser: MatrixUser, remoteUser: RemoteUser): js.Promise[Double] = js.native
  }
}

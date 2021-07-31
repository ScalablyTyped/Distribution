package typings.googleapis.gamesV1Mod.gamesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Rooms")
@js.native
class ResourceRooms protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * games.rooms.create
    * @desc Create a room. For internal use by the Games SDK only. Calling this
    * method directly is unsupported.
    * @alias games.rooms.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {().RoomCreateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaRoom] = js.native
  def create(callback: BodyResponseCallback[SchemaRoom]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRoom] = js.native
  def create(params: ParamsResourceRoomsCreate): GaxiosPromise[SchemaRoom] = js.native
  def create(params: ParamsResourceRoomsCreate, callback: BodyResponseCallback[SchemaRoom]): Unit = js.native
  def create(
    params: ParamsResourceRoomsCreate,
    options: BodyResponseCallback[SchemaRoom],
    callback: BodyResponseCallback[SchemaRoom]
  ): Unit = js.native
  def create(params: ParamsResourceRoomsCreate, options: MethodOptions): GaxiosPromise[SchemaRoom] = js.native
  def create(
    params: ParamsResourceRoomsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoom]
  ): Unit = js.native
  
  /**
    * games.rooms.decline
    * @desc Decline an invitation to join a room. For internal use by the Games
    * SDK only. Calling this method directly is unsupported.
    * @alias games.rooms.decline
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.roomId The ID of the room.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def decline(): GaxiosPromise[SchemaRoom] = js.native
  def decline(callback: BodyResponseCallback[SchemaRoom]): Unit = js.native
  def decline(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRoom] = js.native
  def decline(params: ParamsResourceRoomsDecline): GaxiosPromise[SchemaRoom] = js.native
  def decline(params: ParamsResourceRoomsDecline, callback: BodyResponseCallback[SchemaRoom]): Unit = js.native
  def decline(
    params: ParamsResourceRoomsDecline,
    options: BodyResponseCallback[SchemaRoom],
    callback: BodyResponseCallback[SchemaRoom]
  ): Unit = js.native
  def decline(params: ParamsResourceRoomsDecline, options: MethodOptions): GaxiosPromise[SchemaRoom] = js.native
  def decline(
    params: ParamsResourceRoomsDecline,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoom]
  ): Unit = js.native
  
  /**
    * games.rooms.dismiss
    * @desc Dismiss an invitation to join a room. For internal use by the Games
    * SDK only. Calling this method directly is unsupported.
    * @alias games.rooms.dismiss
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.roomId The ID of the room.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def dismiss(): GaxiosPromise[Unit] = js.native
  def dismiss(callback: BodyResponseCallback[Unit]): Unit = js.native
  def dismiss(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def dismiss(params: ParamsResourceRoomsDismiss): GaxiosPromise[Unit] = js.native
  def dismiss(params: ParamsResourceRoomsDismiss, callback: BodyResponseCallback[Unit]): Unit = js.native
  def dismiss(
    params: ParamsResourceRoomsDismiss,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def dismiss(params: ParamsResourceRoomsDismiss, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def dismiss(params: ParamsResourceRoomsDismiss, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * games.rooms.get
    * @desc Get the data for a room.
    * @alias games.rooms.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.roomId The ID of the room.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaRoom] = js.native
  def get(callback: BodyResponseCallback[SchemaRoom]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRoom] = js.native
  def get(params: ParamsResourceRoomsGet): GaxiosPromise[SchemaRoom] = js.native
  def get(params: ParamsResourceRoomsGet, callback: BodyResponseCallback[SchemaRoom]): Unit = js.native
  def get(
    params: ParamsResourceRoomsGet,
    options: BodyResponseCallback[SchemaRoom],
    callback: BodyResponseCallback[SchemaRoom]
  ): Unit = js.native
  def get(params: ParamsResourceRoomsGet, options: MethodOptions): GaxiosPromise[SchemaRoom] = js.native
  def get(params: ParamsResourceRoomsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaRoom]): Unit = js.native
  
  /**
    * games.rooms.join
    * @desc Join a room. For internal use by the Games SDK only. Calling this
    * method directly is unsupported.
    * @alias games.rooms.join
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.roomId The ID of the room.
    * @param {().RoomJoinRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def join(): GaxiosPromise[SchemaRoom] = js.native
  def join(callback: BodyResponseCallback[SchemaRoom]): Unit = js.native
  def join(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRoom] = js.native
  def join(params: ParamsResourceRoomsJoin): GaxiosPromise[SchemaRoom] = js.native
  def join(params: ParamsResourceRoomsJoin, callback: BodyResponseCallback[SchemaRoom]): Unit = js.native
  def join(
    params: ParamsResourceRoomsJoin,
    options: BodyResponseCallback[SchemaRoom],
    callback: BodyResponseCallback[SchemaRoom]
  ): Unit = js.native
  def join(params: ParamsResourceRoomsJoin, options: MethodOptions): GaxiosPromise[SchemaRoom] = js.native
  def join(
    params: ParamsResourceRoomsJoin,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoom]
  ): Unit = js.native
  
  /**
    * games.rooms.leave
    * @desc Leave a room. For internal use by the Games SDK only. Calling this
    * method directly is unsupported.
    * @alias games.rooms.leave
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.roomId The ID of the room.
    * @param {().RoomLeaveRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def leave(): GaxiosPromise[SchemaRoom] = js.native
  def leave(callback: BodyResponseCallback[SchemaRoom]): Unit = js.native
  def leave(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRoom] = js.native
  def leave(params: ParamsResourceRoomsLeave): GaxiosPromise[SchemaRoom] = js.native
  def leave(params: ParamsResourceRoomsLeave, callback: BodyResponseCallback[SchemaRoom]): Unit = js.native
  def leave(
    params: ParamsResourceRoomsLeave,
    options: BodyResponseCallback[SchemaRoom],
    callback: BodyResponseCallback[SchemaRoom]
  ): Unit = js.native
  def leave(params: ParamsResourceRoomsLeave, options: MethodOptions): GaxiosPromise[SchemaRoom] = js.native
  def leave(
    params: ParamsResourceRoomsLeave,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoom]
  ): Unit = js.native
  
  /**
    * games.rooms.list
    * @desc Returns invitations to join rooms.
    * @alias games.rooms.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of rooms to return in the response, used for paging. For any response, the actual number of rooms to return may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaRoomList] = js.native
  def list(callback: BodyResponseCallback[SchemaRoomList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRoomList] = js.native
  def list(params: ParamsResourceRoomsList): GaxiosPromise[SchemaRoomList] = js.native
  def list(params: ParamsResourceRoomsList, callback: BodyResponseCallback[SchemaRoomList]): Unit = js.native
  def list(
    params: ParamsResourceRoomsList,
    options: BodyResponseCallback[SchemaRoomList],
    callback: BodyResponseCallback[SchemaRoomList]
  ): Unit = js.native
  def list(params: ParamsResourceRoomsList, options: MethodOptions): GaxiosPromise[SchemaRoomList] = js.native
  def list(
    params: ParamsResourceRoomsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoomList]
  ): Unit = js.native
  
  /**
    * games.rooms.reportStatus
    * @desc Updates sent by a client reporting the status of peers in a room.
    * For internal use by the Games SDK only. Calling this method directly is
    * unsupported.
    * @alias games.rooms.reportStatus
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.roomId The ID of the room.
    * @param {().RoomP2PStatuses} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reportStatus(): GaxiosPromise[SchemaRoomStatus] = js.native
  def reportStatus(callback: BodyResponseCallback[SchemaRoomStatus]): Unit = js.native
  def reportStatus(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRoomStatus] = js.native
  def reportStatus(params: ParamsResourceRoomsReportstatus): GaxiosPromise[SchemaRoomStatus] = js.native
  def reportStatus(params: ParamsResourceRoomsReportstatus, callback: BodyResponseCallback[SchemaRoomStatus]): Unit = js.native
  def reportStatus(
    params: ParamsResourceRoomsReportstatus,
    options: BodyResponseCallback[SchemaRoomStatus],
    callback: BodyResponseCallback[SchemaRoomStatus]
  ): Unit = js.native
  def reportStatus(params: ParamsResourceRoomsReportstatus, options: MethodOptions): GaxiosPromise[SchemaRoomStatus] = js.native
  def reportStatus(
    params: ParamsResourceRoomsReportstatus,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRoomStatus]
  ): Unit = js.native
}

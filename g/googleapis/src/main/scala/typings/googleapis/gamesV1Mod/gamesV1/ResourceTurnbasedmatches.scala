package typings.googleapis.gamesV1Mod.gamesV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Turnbasedmatches")
@js.native
class ResourceTurnbasedmatches protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * games.turnBasedMatches.cancel
    * @desc Cancel a turn-based match.
    * @alias games.turnBasedMatches.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matchId The ID of the match.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[Unit] = js.native
  def cancel(callback: BodyResponseCallback[Unit]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def cancel(params: ParamsResourceTurnbasedmatchesCancel): GaxiosPromise[Unit] = js.native
  def cancel(params: ParamsResourceTurnbasedmatchesCancel, callback: BodyResponseCallback[Unit]): Unit = js.native
  def cancel(
    params: ParamsResourceTurnbasedmatchesCancel,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def cancel(params: ParamsResourceTurnbasedmatchesCancel, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def cancel(
    params: ParamsResourceTurnbasedmatchesCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * games.turnBasedMatches.create
    * @desc Create a turn-based match.
    * @alias games.turnBasedMatches.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {().TurnBasedMatchCreateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def create(callback: BodyResponseCallback[SchemaTurnBasedMatch]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def create(params: ParamsResourceTurnbasedmatchesCreate): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def create(params: ParamsResourceTurnbasedmatchesCreate, callback: BodyResponseCallback[SchemaTurnBasedMatch]): Unit = js.native
  def create(
    params: ParamsResourceTurnbasedmatchesCreate,
    options: BodyResponseCallback[SchemaTurnBasedMatch],
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  def create(params: ParamsResourceTurnbasedmatchesCreate, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def create(
    params: ParamsResourceTurnbasedmatchesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  
  /**
    * games.turnBasedMatches.decline
    * @desc Decline an invitation to play a turn-based match.
    * @alias games.turnBasedMatches.decline
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.matchId The ID of the match.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def decline(): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def decline(callback: BodyResponseCallback[SchemaTurnBasedMatch]): Unit = js.native
  def decline(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def decline(params: ParamsResourceTurnbasedmatchesDecline): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def decline(
    params: ParamsResourceTurnbasedmatchesDecline,
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  def decline(
    params: ParamsResourceTurnbasedmatchesDecline,
    options: BodyResponseCallback[SchemaTurnBasedMatch],
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  def decline(params: ParamsResourceTurnbasedmatchesDecline, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def decline(
    params: ParamsResourceTurnbasedmatchesDecline,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  
  /**
    * games.turnBasedMatches.dismiss
    * @desc Dismiss a turn-based match from the match list. The match will no
    * longer show up in the list and will not generate notifications.
    * @alias games.turnBasedMatches.dismiss
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matchId The ID of the match.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def dismiss(): GaxiosPromise[Unit] = js.native
  def dismiss(callback: BodyResponseCallback[Unit]): Unit = js.native
  def dismiss(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def dismiss(params: ParamsResourceTurnbasedmatchesDismiss): GaxiosPromise[Unit] = js.native
  def dismiss(params: ParamsResourceTurnbasedmatchesDismiss, callback: BodyResponseCallback[Unit]): Unit = js.native
  def dismiss(
    params: ParamsResourceTurnbasedmatchesDismiss,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def dismiss(params: ParamsResourceTurnbasedmatchesDismiss, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def dismiss(
    params: ParamsResourceTurnbasedmatchesDismiss,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * games.turnBasedMatches.finish
    * @desc Finish a turn-based match. Each player should make this call once,
    * after all results are in. Only the player whose turn it is may make the
    * first call to Finish, and can pass in the final match state.
    * @alias games.turnBasedMatches.finish
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.matchId The ID of the match.
    * @param {().TurnBasedMatchResults} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def finish(): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def finish(callback: BodyResponseCallback[SchemaTurnBasedMatch]): Unit = js.native
  def finish(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def finish(params: ParamsResourceTurnbasedmatchesFinish): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def finish(params: ParamsResourceTurnbasedmatchesFinish, callback: BodyResponseCallback[SchemaTurnBasedMatch]): Unit = js.native
  def finish(
    params: ParamsResourceTurnbasedmatchesFinish,
    options: BodyResponseCallback[SchemaTurnBasedMatch],
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  def finish(params: ParamsResourceTurnbasedmatchesFinish, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def finish(
    params: ParamsResourceTurnbasedmatchesFinish,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  
  /**
    * games.turnBasedMatches.get
    * @desc Get the data for a turn-based match.
    * @alias games.turnBasedMatches.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeMatchData Get match data along with metadata.
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.matchId The ID of the match.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def get(callback: BodyResponseCallback[SchemaTurnBasedMatch]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def get(params: ParamsResourceTurnbasedmatchesGet): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def get(params: ParamsResourceTurnbasedmatchesGet, callback: BodyResponseCallback[SchemaTurnBasedMatch]): Unit = js.native
  def get(
    params: ParamsResourceTurnbasedmatchesGet,
    options: BodyResponseCallback[SchemaTurnBasedMatch],
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  def get(params: ParamsResourceTurnbasedmatchesGet, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def get(
    params: ParamsResourceTurnbasedmatchesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  
  /**
    * games.turnBasedMatches.join
    * @desc Join a turn-based match.
    * @alias games.turnBasedMatches.join
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.matchId The ID of the match.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def join(): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def join(callback: BodyResponseCallback[SchemaTurnBasedMatch]): Unit = js.native
  def join(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def join(params: ParamsResourceTurnbasedmatchesJoin): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def join(params: ParamsResourceTurnbasedmatchesJoin, callback: BodyResponseCallback[SchemaTurnBasedMatch]): Unit = js.native
  def join(
    params: ParamsResourceTurnbasedmatchesJoin,
    options: BodyResponseCallback[SchemaTurnBasedMatch],
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  def join(params: ParamsResourceTurnbasedmatchesJoin, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def join(
    params: ParamsResourceTurnbasedmatchesJoin,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  
  /**
    * games.turnBasedMatches.leave
    * @desc Leave a turn-based match when it is not the current player's turn,
    * without canceling the match.
    * @alias games.turnBasedMatches.leave
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.matchId The ID of the match.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def leave(): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def leave(callback: BodyResponseCallback[SchemaTurnBasedMatch]): Unit = js.native
  def leave(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def leave(params: ParamsResourceTurnbasedmatchesLeave): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def leave(params: ParamsResourceTurnbasedmatchesLeave, callback: BodyResponseCallback[SchemaTurnBasedMatch]): Unit = js.native
  def leave(
    params: ParamsResourceTurnbasedmatchesLeave,
    options: BodyResponseCallback[SchemaTurnBasedMatch],
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  def leave(params: ParamsResourceTurnbasedmatchesLeave, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def leave(
    params: ParamsResourceTurnbasedmatchesLeave,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  
  /**
    * games.turnBasedMatches.leaveTurn
    * @desc Leave a turn-based match during the current player's turn, without
    * canceling the match.
    * @alias games.turnBasedMatches.leaveTurn
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.matchId The ID of the match.
    * @param {integer} params.matchVersion The version of the match being updated.
    * @param {string=} params.pendingParticipantId The ID of another participant who should take their turn next. If not set, the match will wait for other player(s) to join via automatching; this is only valid if automatch criteria is set on the match with remaining slots for automatched players.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def leaveTurn(): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def leaveTurn(callback: BodyResponseCallback[SchemaTurnBasedMatch]): Unit = js.native
  def leaveTurn(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def leaveTurn(params: ParamsResourceTurnbasedmatchesLeaveturn): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def leaveTurn(
    params: ParamsResourceTurnbasedmatchesLeaveturn,
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  def leaveTurn(
    params: ParamsResourceTurnbasedmatchesLeaveturn,
    options: BodyResponseCallback[SchemaTurnBasedMatch],
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  def leaveTurn(params: ParamsResourceTurnbasedmatchesLeaveturn, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def leaveTurn(
    params: ParamsResourceTurnbasedmatchesLeaveturn,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  
  /**
    * games.turnBasedMatches.list
    * @desc Returns turn-based matches the player is or was involved in.
    * @alias games.turnBasedMatches.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {boolean=} params.includeMatchData True if match data should be returned in the response. Note that not all data will necessarily be returned if include_match_data is true; the server may decide to only return data for some of the matches to limit download size for the client. The remainder of the data for these matches will be retrievable on request.
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxCompletedMatches The maximum number of completed or canceled matches to return in the response. If not set, all matches returned could be completed or canceled.
    * @param {integer=} params.maxResults The maximum number of matches to return in the response, used for paging. For any response, the actual number of matches to return may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaTurnBasedMatchList] = js.native
  def list(callback: BodyResponseCallback[SchemaTurnBasedMatchList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatchList] = js.native
  def list(params: ParamsResourceTurnbasedmatchesList): GaxiosPromise[SchemaTurnBasedMatchList] = js.native
  def list(
    params: ParamsResourceTurnbasedmatchesList,
    callback: BodyResponseCallback[SchemaTurnBasedMatchList]
  ): Unit = js.native
  def list(
    params: ParamsResourceTurnbasedmatchesList,
    options: BodyResponseCallback[SchemaTurnBasedMatchList],
    callback: BodyResponseCallback[SchemaTurnBasedMatchList]
  ): Unit = js.native
  def list(params: ParamsResourceTurnbasedmatchesList, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatchList] = js.native
  def list(
    params: ParamsResourceTurnbasedmatchesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTurnBasedMatchList]
  ): Unit = js.native
  
  /**
    * games.turnBasedMatches.rematch
    * @desc Create a rematch of a match that was previously completed, with the
    * same participants. This can be called by only one player on a match still
    * in their list; the player must have called Finish first. Returns the
    * newly created match; it will be the caller's turn.
    * @alias games.turnBasedMatches.rematch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.matchId The ID of the match.
    * @param {string=} params.requestId A randomly generated numeric ID for each request specified by the caller. This number is used at the server to ensure that the request is handled correctly across retries.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rematch(): GaxiosPromise[SchemaTurnBasedMatchRematch] = js.native
  def rematch(callback: BodyResponseCallback[SchemaTurnBasedMatchRematch]): Unit = js.native
  def rematch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatchRematch] = js.native
  def rematch(params: ParamsResourceTurnbasedmatchesRematch): GaxiosPromise[SchemaTurnBasedMatchRematch] = js.native
  def rematch(
    params: ParamsResourceTurnbasedmatchesRematch,
    callback: BodyResponseCallback[SchemaTurnBasedMatchRematch]
  ): Unit = js.native
  def rematch(
    params: ParamsResourceTurnbasedmatchesRematch,
    options: BodyResponseCallback[SchemaTurnBasedMatchRematch],
    callback: BodyResponseCallback[SchemaTurnBasedMatchRematch]
  ): Unit = js.native
  def rematch(params: ParamsResourceTurnbasedmatchesRematch, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatchRematch] = js.native
  def rematch(
    params: ParamsResourceTurnbasedmatchesRematch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTurnBasedMatchRematch]
  ): Unit = js.native
  
  /**
    * games.turnBasedMatches.sync
    * @desc Returns turn-based matches the player is or was involved in that
    * changed since the last sync call, with the least recent changes coming
    * first. Matches that should be removed from the local cache will have a
    * status of MATCH_DELETED.
    * @alias games.turnBasedMatches.sync
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {boolean=} params.includeMatchData True if match data should be returned in the response. Note that not all data will necessarily be returned if include_match_data is true; the server may decide to only return data for some of the matches to limit download size for the client. The remainder of the data for these matches will be retrievable on request.
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxCompletedMatches The maximum number of completed or canceled matches to return in the response. If not set, all matches returned could be completed or canceled.
    * @param {integer=} params.maxResults The maximum number of matches to return in the response, used for paging. For any response, the actual number of matches to return may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sync(): GaxiosPromise[SchemaTurnBasedMatchSync] = js.native
  def sync(callback: BodyResponseCallback[SchemaTurnBasedMatchSync]): Unit = js.native
  def sync(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatchSync] = js.native
  def sync(params: ParamsResourceTurnbasedmatchesSync): GaxiosPromise[SchemaTurnBasedMatchSync] = js.native
  def sync(
    params: ParamsResourceTurnbasedmatchesSync,
    callback: BodyResponseCallback[SchemaTurnBasedMatchSync]
  ): Unit = js.native
  def sync(
    params: ParamsResourceTurnbasedmatchesSync,
    options: BodyResponseCallback[SchemaTurnBasedMatchSync],
    callback: BodyResponseCallback[SchemaTurnBasedMatchSync]
  ): Unit = js.native
  def sync(params: ParamsResourceTurnbasedmatchesSync, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatchSync] = js.native
  def sync(
    params: ParamsResourceTurnbasedmatchesSync,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTurnBasedMatchSync]
  ): Unit = js.native
  
  /**
    * games.turnBasedMatches.takeTurn
    * @desc Commit the results of a player turn.
    * @alias games.turnBasedMatches.takeTurn
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.matchId The ID of the match.
    * @param {().TurnBasedMatchTurn} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def takeTurn(): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def takeTurn(callback: BodyResponseCallback[SchemaTurnBasedMatch]): Unit = js.native
  def takeTurn(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def takeTurn(params: ParamsResourceTurnbasedmatchesTaketurn): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def takeTurn(
    params: ParamsResourceTurnbasedmatchesTaketurn,
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  def takeTurn(
    params: ParamsResourceTurnbasedmatchesTaketurn,
    options: BodyResponseCallback[SchemaTurnBasedMatch],
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
  def takeTurn(params: ParamsResourceTurnbasedmatchesTaketurn, options: MethodOptions): GaxiosPromise[SchemaTurnBasedMatch] = js.native
  def takeTurn(
    params: ParamsResourceTurnbasedmatchesTaketurn,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTurnBasedMatch]
  ): Unit = js.native
}

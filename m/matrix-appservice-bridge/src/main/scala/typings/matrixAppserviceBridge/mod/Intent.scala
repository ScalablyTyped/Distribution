package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.libComponentsIntentMod.IntentOpts
import typings.matrixBotSdk.mod.MatrixClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "Intent")
@js.native
open class Intent protected ()
  extends typings.matrixAppserviceBridge.libComponentsIntentMod.Intent {
  /**
    * Create an entity which can fulfil the intent of a given user.
    * @constructor
    * @param botSdkIntent The bot sdk intent which this intent wraps
    * fulfilled e.g. the entity joining the room when you call intent.join(roomId).
    * @param botClient The client instance for the AS bot itself.
    * This will be used to perform more priveleged actions such as creating new
    * rooms, sending invites, etc.
    * @param opts Options for this Intent instance.
    * @param opts.registered True to inform this instance that the client
    * is already registered. No registration requests will be made from this Intent.
    * Default: false.
    * @param opts.dontCheckPowerLevel True to not check for the right power
    * level before sending events. Default: false.
    *
    * @param opts.backingStore An object with 4 functions, outlined below.
    * If this Object is supplied, ALL 4 functions must be supplied. If this Object
    * is not supplied, the Intent will maintain its own backing store for membership
    * and power levels, which may scale badly for lots of users.
    *
    * @param opts.backingStore.getMembership A function which is called with a
    * room ID and user ID which should return the membership status of this user as
    * a string e.g "join". `null` should be returned if the membership is unknown.
    *
    * @param opts.backingStore.getPowerLevelContent A function which is called
    * with a room ID which should return the power level content for this room, as an Object.
    * `null` should be returned if there is no known content.
    *
    * @param opts.backingStore.setMembership A function with the signature:
    * function(roomId, userId, membership) which will set the membership of the given user in
    * the given room. This has no return value.
    *
    * @param opts.backingStore.setPowerLevelContent A function with the signature:
    * function(roomId, content) which will set the power level content in the given room.
    * This has no return value.
    *
    * @param opts.dontJoin True to not attempt to join a room before
    * sending messages into it. The surrounding code will have to ensure the correct
    * membership state itself in this case. Default: false.
    *
    * @param opts.enablePresence True to send presence, false to no-op.
    *
    * @param opts.caching.ttl How long requests can stay in the cache, in milliseconds.
    * @param opts.caching.size How many entries should be kept in the cache, before the oldest is dropped.
    * @param opts.getJsSdkClient Create a Matrix JS SDK client on demand for legacy code.
    */
  def this(botSdkIntent: typings.matrixBotSdk.mod.Intent, botClient: MatrixClient) = this()
  def this(botSdkIntent: typings.matrixBotSdk.mod.Intent, botClient: MatrixClient, opts: IntentOpts) = this()
}
/* static members */
object Intent {
  
  @JSImport("matrix-appservice-bridge", "Intent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("matrix-appservice-bridge", "Intent.getClientWarningFired")
  @js.native
  def getClientWarningFired: Any = js.native
  inline def getClientWarningFired_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getClientWarningFired")(x.asInstanceOf[js.Any])
}

package typings.matrixBotSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "MentionPill")
@js.native
/* private */ open class MentionPill ()
  extends typings.matrixBotSdk.libHelpersMentionPillMod.MentionPill
/* static members */
object MentionPill {
  
  @JSImport("matrix-bot-sdk", "MentionPill")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new mention for a room (not @room, but the room itself to be linked).
    * @param {string} roomIdOrAlias The room ID or alias to mention.
    * @param {MatrixClient} client Optional client for creating a more pleasing mention.
    * @returns {Promise<MentionPill>} Resolves to the room's mention.
    */
  inline def forRoom(roomIdOrAlias: String): js.Promise[typings.matrixBotSdk.libHelpersMentionPillMod.MentionPill] = ^.asInstanceOf[js.Dynamic].applyDynamic("forRoom")(roomIdOrAlias.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.matrixBotSdk.libHelpersMentionPillMod.MentionPill]]
  inline def forRoom(roomIdOrAlias: String, client: typings.matrixBotSdk.libMatrixClientMod.MatrixClient): js.Promise[typings.matrixBotSdk.libHelpersMentionPillMod.MentionPill] = (^.asInstanceOf[js.Dynamic].applyDynamic("forRoom")(roomIdOrAlias.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.matrixBotSdk.libHelpersMentionPillMod.MentionPill]]
  
  /**
    * Creates a new mention for a user in an optional room.
    * @param {string} userId The user ID the mention is for.
    * @param {String} inRoomId Optional room ID the user is being mentioned in, for the aesthetics of the mention.
    * @param {MatrixClient} client Optional client for creating a more pleasing mention.
    * @returns {Promise<MentionPill>} Resolves to the user's mention.
    */
  inline def forUser(userId: String): js.Promise[typings.matrixBotSdk.libHelpersMentionPillMod.MentionPill] = ^.asInstanceOf[js.Dynamic].applyDynamic("forUser")(userId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.matrixBotSdk.libHelpersMentionPillMod.MentionPill]]
  inline def forUser(userId: String, inRoomId: String): js.Promise[typings.matrixBotSdk.libHelpersMentionPillMod.MentionPill] = (^.asInstanceOf[js.Dynamic].applyDynamic("forUser")(userId.asInstanceOf[js.Any], inRoomId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.matrixBotSdk.libHelpersMentionPillMod.MentionPill]]
  inline def forUser(userId: String, inRoomId: String, client: typings.matrixBotSdk.libMatrixClientMod.MatrixClient): js.Promise[typings.matrixBotSdk.libHelpersMentionPillMod.MentionPill] = (^.asInstanceOf[js.Dynamic].applyDynamic("forUser")(userId.asInstanceOf[js.Any], inRoomId.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.matrixBotSdk.libHelpersMentionPillMod.MentionPill]]
  inline def forUser(userId: String, inRoomId: Unit, client: typings.matrixBotSdk.libMatrixClientMod.MatrixClient): js.Promise[typings.matrixBotSdk.libHelpersMentionPillMod.MentionPill] = (^.asInstanceOf[js.Dynamic].applyDynamic("forUser")(userId.asInstanceOf[js.Any], inRoomId.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.matrixBotSdk.libHelpersMentionPillMod.MentionPill]]
  
  /**
    * Creates a mention from static information.
    * @param {string} userId The user ID the mention is for.
    * @param {string} displayName The user's display name.
    * @returns {MentionPill} The mention for the user.
    */
  inline def withDisplayName(userId: String, displayName: String): typings.matrixBotSdk.libHelpersMentionPillMod.MentionPill = (^.asInstanceOf[js.Dynamic].applyDynamic("withDisplayName")(userId.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[typings.matrixBotSdk.libHelpersMentionPillMod.MentionPill]
}

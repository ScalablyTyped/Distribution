package typings.matrixJsSdk.mod

import typings.matrixJsSdk.anon.Presence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-js-sdk", "User")
@js.native
class User protected () extends js.Object {
    // The events describing this user.
  def this(userId: String) = this()
                       // The 'displayname' of the user if known.
  var avatarUrl: String = js.native
                       // Timestamp (ms since the epoch) for when we last received presence data for this user. We can subtract lastActiveAgo
  var currentlyActive: Boolean = js.native
                       // The info object supplied in the constructor.
  var displayName: String = js.native
                      // Whether we should consider lastActiveAgo to be an approximation and that the user should be seen as active 'now'
  var events: Presence = js.native
                       // The ID of the user.
  var info: js.Object = js.native
                       // The presence status message if known.
  var lastActiveAgo: Double = js.native
                       // The time elapsed in ms since the user interacted proactively with the server, or we saw a message from the user
  var lastPresenceTs: Double = js.native
                       // The 'avatar_url' of the user if known.
  var presence: String = js.native
                       // The presence enum if known.
  var presenceStatusMsg: String = js.native
  var userId: String = js.native
  def getLastActiveTs(): Double = js.native
  def getLastModifiedTime(): Double = js.native
  def setAvatarUrl(url: String): Unit = js.native
  def setDisplayName(name: String): Unit = js.native
  def setPresenceEvent(event: MatrixEvent): Unit = js.native
  def setRawDisplayName(name: String): Unit = js.native
}


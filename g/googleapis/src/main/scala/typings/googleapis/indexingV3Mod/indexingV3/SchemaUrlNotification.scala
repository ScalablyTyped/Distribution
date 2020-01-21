package typings.googleapis.indexingV3Mod.indexingV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `UrlNotification` is the resource used in all Indexing API calls. It
  * describes one event in the life cycle of a Web Document.
  */
@js.native
trait SchemaUrlNotification extends js.Object {
  /**
    * Creation timestamp for this notification. Users should _not_ specify it,
    * the field is ignored at the request time.
    */
  var notifyTime: js.UndefOr[String] = js.native
  /**
    * The URL life cycle event that Google is being notified about.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The object of this notification. The URL must be owned by the publisher
    * of this notification and, in case of `URL_UPDATED` notifications, it
    * _must_ be crawlable by Google.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaUrlNotification {
  @scala.inline
  def apply(notifyTime: String = null, `type`: String = null, url: String = null): SchemaUrlNotification = {
    val __obj = js.Dynamic.literal()
    if (notifyTime != null) __obj.updateDynamic("notifyTime")(notifyTime.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrlNotification]
  }
}


package typings.knuddelsUserappsApi.mod._Global_

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/Message.html
	 */
@JSGlobal("Message")
@js.native
class Message () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Message.html#method_getAuthor
  		 */
  def getAuthor(): User = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Message.html#method_getCreationDate
  		 */
  def getCreationDate(): Date = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Message.html#method_getRawText
  		 */
  def getRawText(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Message.html#method_getText
  		 */
  def getText(): java.lang.String = js.native
}


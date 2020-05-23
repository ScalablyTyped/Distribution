package typings.knuddelsUserappsApi.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see https://developer.knuddels.de/docs/classes/QuestAccess.html
  */
@JSGlobal("QuestAccess")
@js.native
class QuestAccess () extends js.Object {
  /**
    * @see https://developer.knuddels.de/docs/classes/QuestAccess.html#method_getQuest
    * @since AppServer 82290, ChatServer 82290
    */
  def getQuest(questKey: java.lang.String): Quest | Null = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/QuestAccess.html#method_getQuests
    * @since AppServer 82290, ChatServer 82290
    */
  def getQuests(): js.Array[Quest] = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/QuestAccess.html#method_getUser
    * @since AppServer 82290, ChatServer 82290
    */
  def getUser(): User = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/QuestAccess.html#method_hasQuest
    * @since AppServer 82290, ChatServer 82290
    */
  def hasQuest(questKey: java.lang.String): Boolean = js.native
}


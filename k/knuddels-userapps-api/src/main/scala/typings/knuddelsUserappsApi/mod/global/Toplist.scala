package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/Toplist.html
  */
@JSGlobal("Toplist")
@js.native
open class Toplist () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Toplist.html#method_addLabelChangeListener
    */
  def addLabelChangeListener(listener: js.Function1[/* labelChangeEvent */ ToplistLabelChangeEvent, Unit]): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Toplist.html#method_addRankChangeListener
    */
  def addRankChangeListener(listener: js.Function1[/* rankChangeEvent */ ToplistRankChangeEvent, Unit]): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Toplist.html#method_getChatCommand
    */
  def getChatCommand(): java.lang.String = js.native
  def getChatCommand(user_or_userId: Double): java.lang.String = js.native
  def getChatCommand(user_or_userId: User): java.lang.String = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Toplist.html#method_getDisplayName
    */
  def getDisplayName(): java.lang.String = js.native
  
  def getLabel(user_or_userId: Double): java.lang.String = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/Toplist.html#method_getLabel
    */
  def getLabel(user_or_userId: User): java.lang.String = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Toplist.html#method_getUserPersistenceNumberKey
    */
  def getUserPersistenceNumberKey(): java.lang.String = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Toplist.html#method_removeLabelChangeListener
    */
  def removeLabelChangeListener(listener: js.Function1[/* labelChangeEvent */ ToplistLabelChangeEvent, Unit]): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Toplist.html#method_removeRankChangeListener
    */
  def removeRankChangeListener(listener: js.Function1[/* rankChangeEvent */ ToplistRankChangeEvent, Unit]): Unit = js.native
}

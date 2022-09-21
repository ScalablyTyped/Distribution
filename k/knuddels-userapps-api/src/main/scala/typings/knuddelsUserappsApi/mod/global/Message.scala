package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/Message.html
  */
@JSGlobal("Message")
@js.native
open class Message () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Message.html#method_getAuthor
    */
  def getAuthor(): User = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Message.html#method_getCreationDate
    */
  def getCreationDate(): js.Date = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Message.html#method_getRawText
    */
  def getRawText(): java.lang.String = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Message.html#method_getText
    */
  def getText(): java.lang.String = js.native
}

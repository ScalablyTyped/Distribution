package typings.knuddelsUserappBackendApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/ToplistLabelChangeEvent.html
  */
@JSGlobal("ToplistLabelChangeEvent")
@js.native
open class ToplistLabelChangeEvent () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ToplistLabelChangeEvent.html#method_getNewLabel
    */
  def getNewLabel(): java.lang.String = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ToplistLabelChangeEvent.html#method_getNewValue
    */
  def getNewValue(): Double = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ToplistLabelChangeEvent.html#method_getOldLabel
    */
  def getOldLabel(): java.lang.String = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ToplistLabelChangeEvent.html#method_getOldValue
    */
  def getOldValue(): Double = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ToplistLabelChangeEvent.html#method_getToplist
    */
  def getToplist(): Toplist = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ToplistLabelChangeEvent.html#method_getUser
    */
  def getUser(): User = js.native
}

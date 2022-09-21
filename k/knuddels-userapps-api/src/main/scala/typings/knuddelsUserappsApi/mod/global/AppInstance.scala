package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.mod.KnuddelsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/AppInstance.html
  */
@JSGlobal("AppInstance")
@js.native
open class AppInstance () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/AppInstance.html#method_getAllInstances
    */
  def getAllInstances(): js.Array[AppInstance] = js.native
  def getAllInstances(includeSelf: Boolean): js.Array[AppInstance] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/AppInstance.html#method_getAppInfo
    */
  def getAppInfo(): AppInfo = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/AppInstance.html#method_getChannelName
    */
  def getChannelName(): java.lang.String = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/AppInstance.html#method_getRegisteredChatCommandNames
    */
  def getRegisteredChatCommandNames(): js.Array[java.lang.String] | Null = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/AppInstance.html#method_getRootInstance
    */
  def getRootInstance(): RootAppInstance = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/AppInstance.html#method_getStartDate
    */
  def getStartDate(): js.Date = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/AppInstance.html#method_isRootInstance
    */
  def isRootInstance(): Boolean = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/AppInstance.html#method_sendAppEvent
    */
  def sendAppEvent(`type`: java.lang.String, data: KnuddelsEvent): Unit = js.native
}

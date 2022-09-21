package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/RootAppInstance.html
  */
@JSGlobal("RootAppInstance")
@js.native
open class RootAppInstance () extends AppInstance {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/RootAppInstance.html#method_cancelUpdateApp
    * @since AppServer 98117
    */
  def cancelUpdateApp(): Boolean = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/RootAppInstance.html#method_invalidateClientCache
    */
  def invalidateClientCache(): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/RootAppInstance.html#method_stopApp
    */
  def stopApp(message: java.lang.String): Unit = js.native
  def stopApp(message: java.lang.String, logMessage: java.lang.String): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/RootAppInstance.html#method_updateApp
    */
  def updateApp(message: java.lang.String): Double = js.native
  def updateApp(message: java.lang.String, logMessage: java.lang.String): Double = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/RootAppInstance.html#method_updateAppFiles
    */
  def updateAppFiles(): js.Array[java.lang.String] = js.native
}

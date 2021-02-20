package typings.kurentoClient.mod

import typings.kurentoClient.anon.EventObjectCreatedobjects
import typings.kurentoClient.anon.EventObjectDestroyedobjec
import typings.kurentoClient.kurentoClientStrings.ObjectCreated
import typings.kurentoClient.kurentoClientStrings.ObjectDestroyed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerManager extends StObject {
  
  def getChildren(): js.Promise[MediaObject] = js.native
  def getChildren(callback: Callback[MediaObject]): js.Promise[MediaObject] = js.native
  
  def getCpuCount(): js.Promise[js.Array[Double]] = js.native
  def getCpuCount(callback: Callback[js.Array[Double]]): js.Promise[js.Array[Double]] = js.native
  
  def getKmd(moduleName: String): js.Promise[String] = js.native
  def getKmd(moduleName: String, callback: Callback[String]): js.Promise[String] = js.native
  
  def getName(): js.Promise[String] = js.native
  def getName(callback: Callback[String]): js.Promise[String] = js.native
  
  def getPipelines(): js.Promise[js.Array[MediaPipeline]] = js.native
  def getPipelines(callback: Callback[js.Array[MediaPipeline]]): js.Promise[js.Array[MediaPipeline]] = js.native
  
  def getUsedCpu(interval: Double): js.Promise[Double] = js.native
  def getUsedCpu(interval: Double, callback: Callback[Double]): js.Promise[Double] = js.native
  
  def getUsedMemory(): js.Promise[Double] = js.native
  def getUsedMemory(callback: Callback[Double]): js.Promise[Double] = js.native
  
  @JSName("on")
  def on_ObjectCreated(event: ObjectCreated, callback: js.Function1[/* event */ EventObjectCreatedobjects, Unit]): ServerManager = js.native
  // `object` is actually string while the doc says it's `MediaObject` (https://doc-kurento.readthedocs.io/en/stable/_static/client-jsdoc/module-core.html#event:ObjectCreated).
  @JSName("on")
  def on_ObjectDestroyed(event: ObjectDestroyed, callback: js.Function1[/* event */ EventObjectDestroyedobjec, Unit]): ServerManager = js.native
}

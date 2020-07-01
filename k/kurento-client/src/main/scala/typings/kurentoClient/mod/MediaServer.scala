package typings.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaServer extends js.Object {
  def getChildren(): js.Promise[MediaObject] = js.native
  def getChildren(callback: Callback[MediaObject]): js.Promise[MediaObject] = js.native
  def getCpuCount(): js.Promise[js.Array[Double]] = js.native
  def getCpuCount(callback: Callback[js.Array[Double]]): js.Promise[js.Array[Double]] = js.native
  def getKmd(moduleName: String): js.Promise[String] = js.native
  def getKmd(moduleName: String, callback: Callback[String]): js.Promise[String] = js.native
  def getName(): js.Promise[String] = js.native
  def getName(callback: Callback[String]): js.Promise[String] = js.native
  def getUsedCpu(interval: Double): js.Promise[Double] = js.native
  def getUsedCpu(interval: Double, callback: Callback[Double]): js.Promise[Double] = js.native
  def getUsedMemory(): js.Promise[Double] = js.native
  def getUsedMemory(callback: Callback[Double]): js.Promise[Double] = js.native
}


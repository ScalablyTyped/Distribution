package typings.humaneDashJs.humaneDashJsMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Humane extends js.Object {
  var addnCls: String = js.native
  var baseCls: String = js.native
  var clickToClose: Boolean = js.native
  var container: Element = js.native
  var error: js.UndefOr[SpawnLogFunction] = js.native
  var info: js.UndefOr[SpawnLogFunction] = js.native
  var queue: js.Array[String] = js.native
  var timeout: Double = js.native
  var waitForMove: Boolean = js.native
  def create(): Humane = js.native
  def create(options: HumaneOptions): Humane = js.native
  def log(message: logMessage): Humane = js.native
  def log(message: logMessage, callback: completionCallback): Humane = js.native
  def log(message: logMessage, callback: completionCallback, options: HumaneMessageOptions): Humane = js.native
  def log(message: logMessage, options: HumaneMessageOptions): Humane = js.native
  def remove(): Unit = js.native
  def remove(cb: completionCallback): Unit = js.native
  def spawn(options: HumaneMessageOptions): SpawnLogFunction = js.native
}


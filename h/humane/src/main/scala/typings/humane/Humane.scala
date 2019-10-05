package typings.humane

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Humane extends js.Object {
  var addnCls: String = js.native
  var baseCls: String = js.native
  var clickToClose: Boolean = js.native
  var error: js.Function = js.native
  var forceNew: Boolean = js.native
  var info: js.Function = js.native
  var queue: js.Array[String] = js.native
  var timeout: Double = js.native
  var waitForMove: Boolean = js.native
  def create(): Humane = js.native
  def create(options: HumaneOptions): Humane = js.native
  def log(listOfMessages: js.Array[_]): Humane = js.native
  def log(message: String): Humane = js.native
  def log(message: String, callback: js.Function): Humane = js.native
  def log(message: String, callback: js.Function, options: HumaneOptions): Humane = js.native
  def log(message: String, options: HumaneOptions): Humane = js.native
  def remove(x: js.Any): Unit = js.native
  def spawn(options: HumaneOptions): js.Function = js.native
}

@JSGlobal("humane")
@js.native
object humane extends TopLevel[Humane]


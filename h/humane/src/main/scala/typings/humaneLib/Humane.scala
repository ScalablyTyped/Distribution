package typings
package humaneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Humane extends js.Object {
  var addnCls: java.lang.String = js.native
  var baseCls: java.lang.String = js.native
  var clickToClose: scala.Boolean = js.native
  var error: js.Function = js.native
  var forceNew: scala.Boolean = js.native
  var info: js.Function = js.native
  var queue: js.Array[java.lang.String] = js.native
  var timeout: scala.Double = js.native
  var waitForMove: scala.Boolean = js.native
  def create(): Humane = js.native
  def create(options: HumaneOptions): Humane = js.native
  def log(listOfMessages: js.Array[_]): Humane = js.native
  def log(message: java.lang.String): Humane = js.native
  def log(message: java.lang.String, callback: js.Function): Humane = js.native
  def log(message: java.lang.String, callback: js.Function, options: HumaneOptions): Humane = js.native
  def log(message: java.lang.String, options: HumaneOptions): Humane = js.native
  def remove(x: js.Any): scala.Unit = js.native
  def spawn(options: HumaneOptions): js.Function = js.native
}


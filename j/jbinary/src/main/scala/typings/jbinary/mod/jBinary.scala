package typings.jbinary.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jBinary extends js.Object {
  def as(typeSet: js.Object): jBinary = js.native
  def as(typeSet: js.Object, modifyOriginal: Boolean): jBinary = js.native
  def read(`type`: String): js.Any = js.native
  def read(`type`: String, offset: Double): js.Any = js.native
  def readAll(): js.Any = js.native
  def seek(position: Double): Double = js.native
  def seek(position: Double, callback: js.Function2[/* prop */ this.type, /* data */ js.Any, _]): Double = js.native
  def skip(count: Double): Double = js.native
  def skip(count: Double, callback: js.Function2[/* prop */ this.type, /* data */ js.Any, _]): Double = js.native
  def slice(start: Double, end: Double): jBinary = js.native
  def slice(start: Double, end: Double, forceCopy: Boolean): jBinary = js.native
  def tell(): Double = js.native
  def write(`type`: String, data: js.Any): Double = js.native
  def write(`type`: String, data: js.Any, offset: Double): Double = js.native
  def writeAll(data: js.Any): Double = js.native
}


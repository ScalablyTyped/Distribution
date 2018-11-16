package typings
package jbinaryLib.jbinaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jBinary extends js.Object {
  def as(typeSet: js.Object): jBinary = js.native
  def as(typeSet: js.Object, modifyOriginal: scala.Boolean): jBinary = js.native
  def read(`type`: java.lang.String): js.Any = js.native
  def read(`type`: java.lang.String, offset: scala.Double): js.Any = js.native
  def readAll(): js.Any = js.native
  def seek(position: scala.Double): scala.Double = js.native
  def seek(position: scala.Double, callback: js.Function2[/* prop */ this.type, /* data */ js.Any, _]): scala.Double = js.native
  def skip(count: scala.Double): scala.Double = js.native
  def skip(count: scala.Double, callback: js.Function2[/* prop */ this.type, /* data */ js.Any, _]): scala.Double = js.native
  def slice(start: scala.Double, end: scala.Double): jBinary = js.native
  def slice(start: scala.Double, end: scala.Double, forceCopy: scala.Boolean): jBinary = js.native
  def tell(): scala.Double = js.native
  def write(`type`: java.lang.String, data: js.Any): scala.Double = js.native
  def write(`type`: java.lang.String, data: js.Any, offset: scala.Double): scala.Double = js.native
  def writeAll(data: js.Any): scala.Double = js.native
}


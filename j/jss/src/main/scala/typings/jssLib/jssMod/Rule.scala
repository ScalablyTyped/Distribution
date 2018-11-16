package typings
package jssLib.jssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  var className: java.lang.String = js.native
  var selector: java.lang.String = js.native
  def applyTo(element: stdLib.HTMLElement): scala.Unit = js.native
  def prop(key: java.lang.String): java.lang.String = js.native
  def prop(key: java.lang.String, value: js.Any): this.type = js.native
  def toJSON(): java.lang.String = js.native
}


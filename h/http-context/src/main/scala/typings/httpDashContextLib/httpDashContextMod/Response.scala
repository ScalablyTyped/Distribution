package typings
package httpDashContextLib.httpDashContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends ResponseDelegate {
  var header: nodeLib.httpMod.OutgoingHttpHeaders = js.native
  var response: nodeLib.httpMod.OutgoingMessage = js.native
  def get(field: java.lang.String): java.lang.String = js.native
  def inspect(): ResponseJSON = js.native
  def is(types: java.lang.String*): java.lang.String | httpDashContextLib.httpDashContextLibNumbers.`false` = js.native
  def is(types: js.Array[java.lang.String]): java.lang.String | httpDashContextLib.httpDashContextLibNumbers.`false` = js.native
  def toJSON(): ResponseJSON = js.native
}


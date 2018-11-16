package typings
package httpDashContextLib.httpDashContextMod.HttpContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseDelegate extends js.Object {
  var body: js.Any = js.native
  var etag: java.lang.String = js.native
  var headerSent: scala.Boolean = js.native
  var lastModified: java.lang.String | stdLib.Date = js.native
  var length: scala.Double = js.native
  var message: java.lang.String = js.native
  var status: scala.Double = js.native
  var `type`: java.lang.String = js.native
  var writable: scala.Boolean = js.native
  def append(field: java.lang.String, `val`: java.lang.String*): scala.Unit = js.native
  def append(field: java.lang.String, `val`: js.Array[java.lang.String]): scala.Unit = js.native
  def attachment(filename: java.lang.String): scala.Unit = js.native
  def redirect(url: java.lang.String, alt: java.lang.String): scala.Unit = js.native
  def remove(field: java.lang.String): scala.Unit = js.native
  def set(field: java.lang.String, `val`: java.lang.String): scala.Unit = js.native
  def vary(field: java.lang.String): scala.Unit = js.native
}


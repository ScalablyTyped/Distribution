package typings
package jsDashCookieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Read[TConv /* <: js.Object */] extends js.Object {
  @JSName("read")
  var read_Original: jsDashCookieLib.jsDashCookieMod.CookiesNs.CookieReadConverter = js.native
  @JSName("write")
  var write_Original: jsDashCookieLib.jsDashCookieMod.CookiesNs.CookieWriteConverter[TConv] = js.native
  def read(value: java.lang.String, name: java.lang.String): java.lang.String = js.native
  def write(value: TConv, name: java.lang.String): java.lang.String = js.native
  def write(value: java.lang.String, name: java.lang.String): java.lang.String = js.native
}


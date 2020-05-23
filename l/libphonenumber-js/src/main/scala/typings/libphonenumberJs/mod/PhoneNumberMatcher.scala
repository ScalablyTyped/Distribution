package typings.libphonenumberJs.mod

import typings.libphonenumberJs.anon.DefaultCountry
import typings.libphonenumberJs.typesMod.NumberFound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "PhoneNumberMatcher")
@js.native
class PhoneNumberMatcher protected () extends js.Object {
  def this(text: String) = this()
  def this(text: String, options: DefaultCountry) = this()
  def hasNext(): Boolean = js.native
  def next(): js.UndefOr[NumberFound] = js.native
}


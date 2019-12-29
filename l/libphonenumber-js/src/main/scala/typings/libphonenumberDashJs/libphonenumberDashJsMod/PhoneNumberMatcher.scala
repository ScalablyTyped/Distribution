package typings.libphonenumberDashJs.libphonenumberDashJsMod

import typings.libphonenumberDashJs.Anon_DefaultCountry
import typings.libphonenumberDashJs.typesMod.NumberFound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libphonenumber-js", "PhoneNumberMatcher")
@js.native
class PhoneNumberMatcher protected () extends js.Object {
  def this(text: String) = this()
  def this(text: String, options: Anon_DefaultCountry) = this()
  def hasNext(): Boolean = js.native
  def next(): js.UndefOr[NumberFound] = js.native
}


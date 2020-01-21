package typings.iso31662.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iso-3166-2", "subdivision")
@js.native
object subdivision extends js.Object {
  def apply(countryCodeOrFullSubdivisionCode: String): InfoOrEmptyRecord[SubdivisionInfo] = js.native
  def apply(countryCodeOrFullSubdivisionCode: String, subdivisionCodeOrName: String): InfoOrEmptyRecord[SubdivisionInfo] = js.native
}


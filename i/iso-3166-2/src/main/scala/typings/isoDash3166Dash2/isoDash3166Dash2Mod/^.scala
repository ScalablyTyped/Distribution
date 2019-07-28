package typings.isoDash3166Dash2.isoDash3166Dash2Mod

import typings.isoDash3166Dash2.isoDash3166Dash2Mod.CountryInfoNs.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iso-3166-2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val data: Map = js.native
  def country(countryCodeOrName: String): InfoOrEmptyRecord[CountryInfo] = js.native
  def subdivision(countryCodeOrFullSubdivisionCode: String): InfoOrEmptyRecord[SubdivisionInfo] = js.native
  def subdivision(countryCodeOrFullSubdivisionCode: String, subdivisionCodeOrName: String): InfoOrEmptyRecord[SubdivisionInfo] = js.native
}


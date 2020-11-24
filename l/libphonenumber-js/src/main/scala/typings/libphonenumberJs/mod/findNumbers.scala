package typings.libphonenumberJs.mod

import typings.libphonenumberJs.anon.DefaultCountry
import typings.libphonenumberJs.typesMod.CountryCode
import typings.libphonenumberJs.typesMod.NumberFound
import typings.libphonenumberJs.typesMod.NumberFoundLegacy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libphonenumber-js", "findNumbers")
@js.native
object findNumbers extends js.Object {
  
  def apply(text: String): js.Array[NumberFoundLegacy] = js.native
  def apply(text: String, options: DefaultCountry): js.Array[NumberFound] = js.native
  def apply(text: String, options: CountryCode): js.Array[NumberFoundLegacy] = js.native
}

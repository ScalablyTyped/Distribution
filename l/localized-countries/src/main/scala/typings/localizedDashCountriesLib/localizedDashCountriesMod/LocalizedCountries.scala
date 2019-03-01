package typings
package localizedDashCountriesLib.localizedDashCountriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedCountries extends js.Object {
  def array(): js.Array[localizedDashCountriesLib.Anon_Code]
  def get(code: java.lang.String): java.lang.String
  def `object`(): org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object LocalizedCountries {
  @scala.inline
  def apply(
    array: js.Function0[js.Array[localizedDashCountriesLib.Anon_Code]],
    get: js.Function1[java.lang.String, java.lang.String],
    `object`: js.Function0[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  ): LocalizedCountries = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("array")(array)
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[LocalizedCountries]
  }
}


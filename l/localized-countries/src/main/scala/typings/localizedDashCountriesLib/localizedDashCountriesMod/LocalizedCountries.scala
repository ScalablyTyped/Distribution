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
    array: () => js.Array[localizedDashCountriesLib.Anon_Code],
    get: java.lang.String => java.lang.String,
    `object`: () => org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): LocalizedCountries = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), get = js.Any.fromFunction1(get))
    __obj.updateDynamic("object")(js.Any.fromFunction0(`object`))
    __obj.asInstanceOf[LocalizedCountries]
  }
}


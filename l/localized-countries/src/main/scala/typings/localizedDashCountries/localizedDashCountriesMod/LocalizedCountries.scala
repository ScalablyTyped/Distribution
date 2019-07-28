package typings.localizedDashCountries.localizedDashCountriesMod

import org.scalablytyped.runtime.StringDictionary
import typings.localizedDashCountries.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedCountries extends js.Object {
  def array(): js.Array[Anon_Code]
  def get(code: String): String
  def `object`(): StringDictionary[String]
}

object LocalizedCountries {
  @scala.inline
  def apply(array: () => js.Array[Anon_Code], get: String => String, `object`: () => StringDictionary[String]): LocalizedCountries = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), get = js.Any.fromFunction1(get))
    __obj.updateDynamic("object")(js.Any.fromFunction0(`object`))
    __obj.asInstanceOf[LocalizedCountries]
  }
}


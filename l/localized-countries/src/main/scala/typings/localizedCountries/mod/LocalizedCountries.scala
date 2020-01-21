package typings.localizedCountries.mod

import org.scalablytyped.runtime.StringDictionary
import typings.localizedCountries.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizedCountries extends js.Object {
  def array(): js.Array[AnonCode]
  def get(code: String): String
  def `object`(): StringDictionary[String]
}

object LocalizedCountries {
  @scala.inline
  def apply(array: () => js.Array[AnonCode], get: String => String, `object`: () => StringDictionary[String]): LocalizedCountries = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), get = js.Any.fromFunction1(get))
    __obj.updateDynamic("object")(js.Any.fromFunction0(`object`))
    __obj.asInstanceOf[LocalizedCountries]
  }
}


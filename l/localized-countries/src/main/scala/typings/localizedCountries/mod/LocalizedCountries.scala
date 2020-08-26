package typings.localizedCountries.mod

import org.scalablytyped.runtime.StringDictionary
import typings.localizedCountries.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalizedCountries extends js.Object {
  def array(): js.Array[Code] = js.native
  def get(code: String): String = js.native
  def `object`(): StringDictionary[String] = js.native
}

object LocalizedCountries {
  @scala.inline
  def apply(array: () => js.Array[Code], get: String => String, `object`: () => StringDictionary[String]): LocalizedCountries = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction0(array), get = js.Any.fromFunction1(get))
    __obj.updateDynamic("object")(js.Any.fromFunction0(`object`))
    __obj.asInstanceOf[LocalizedCountries]
  }
  @scala.inline
  implicit class LocalizedCountriesOps[Self <: LocalizedCountries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArray(value: () => js.Array[Code]): Self = this.set("array", js.Any.fromFunction0(value))
    @scala.inline
    def setGet(value: String => String): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setObject(value: () => StringDictionary[String]): Self = this.set("object", js.Any.fromFunction0(value))
  }
  
}


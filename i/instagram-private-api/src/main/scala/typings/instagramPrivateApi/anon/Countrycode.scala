package typings.instagramPrivateApi.anon

import typings.instagramPrivateApi.instagramPrivateApiStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Countrycode extends js.Object {
  var country_code: String
  var source: js.Array[String | default]
}

object Countrycode {
  @scala.inline
  def apply(country_code: String, source: js.Array[String | default]): Countrycode = {
    val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Countrycode]
  }
}


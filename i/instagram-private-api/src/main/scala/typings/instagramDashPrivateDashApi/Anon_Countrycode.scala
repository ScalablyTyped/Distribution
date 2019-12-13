package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Countrycode extends js.Object {
  var country_code: String
  var source: js.Array[String | default]
}

object Anon_Countrycode {
  @scala.inline
  def apply(country_code: String, source: js.Array[String | default]): Anon_Countrycode = {
    val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Countrycode]
  }
}


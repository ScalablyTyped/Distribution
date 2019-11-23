package typings.hlsDashParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: String
  var language: js.UndefOr[String] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(id: String, language: String = null, uri: String = null, value: String = null): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id)
    if (language != null) __obj.updateDynamic("language")(language)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Id]
  }
}


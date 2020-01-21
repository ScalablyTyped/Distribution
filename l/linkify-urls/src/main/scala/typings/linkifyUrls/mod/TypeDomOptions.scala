package typings.linkifyUrls.mod

import org.scalablytyped.runtime.StringDictionary
import typings.linkifyUrls.linkifyUrlsStrings.dom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDomOptions extends Options {
  @JSName("type")
  val type_TypeDomOptions: dom
}

object TypeDomOptions {
  @scala.inline
  def apply(
    `type`: dom,
    attributes: StringDictionary[String | Double | Boolean | js.Array[String]] = null,
    value: String | (js.Function1[/* url */ String, String]) = null
  ): TypeDomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDomOptions]
  }
}


package typings.linkifyIssues.mod

import org.scalablytyped.runtime.StringDictionary
import typings.linkifyIssues.linkifyIssuesStrings.dom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDomOptions extends Options {
  @JSName("type")
  var type_TypeDomOptions: dom
}

object TypeDomOptions {
  @scala.inline
  def apply(
    repository: String,
    `type`: dom,
    user: String,
    attributes: StringDictionary[String | Double | Boolean | js.Array[String]] = null,
    baseUrl: String = null
  ): TypeDomOptions = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDomOptions]
  }
}


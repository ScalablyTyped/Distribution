package typings.linkifyDashIssues.linkifyDashIssuesMod

import org.scalablytyped.runtime.StringDictionary
import typings.linkifyDashIssues.linkifyDashIssuesStrings.dom
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
    val __obj = js.Dynamic.literal(repository = repository, user = user)
    __obj.updateDynamic("type")(`type`)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    __obj.asInstanceOf[TypeDomOptions]
  }
}


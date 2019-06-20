package typings
package linkifyDashIssuesLib.linkifyDashIssuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDomOptions extends Options {
  @JSName("type")
  var type_TypeDomOptions: linkifyDashIssuesLib.linkifyDashIssuesLibStrings.dom
}

object TypeDomOptions {
  @scala.inline
  def apply(
    repository: java.lang.String,
    `type`: linkifyDashIssuesLib.linkifyDashIssuesLibStrings.dom,
    user: java.lang.String,
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Array[java.lang.String]] = null,
    baseUrl: java.lang.String = null
  ): TypeDomOptions = {
    val __obj = js.Dynamic.literal(repository = repository, user = user)
    __obj.updateDynamic("type")(`type`)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    __obj.asInstanceOf[TypeDomOptions]
  }
}


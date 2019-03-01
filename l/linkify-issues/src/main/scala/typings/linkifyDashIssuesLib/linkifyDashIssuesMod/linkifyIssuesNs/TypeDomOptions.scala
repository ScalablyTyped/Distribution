package typings
package linkifyDashIssuesLib.linkifyDashIssuesMod.linkifyIssuesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDomOptions extends BaseOptions {
  var `type`: linkifyDashIssuesLib.linkifyDashIssuesLibStrings.dom
}

object TypeDomOptions {
  @scala.inline
  def apply(
    repo: java.lang.String,
    `type`: linkifyDashIssuesLib.linkifyDashIssuesLibStrings.dom,
    user: java.lang.String,
    attributes: org.scalablytyped.runtime.StringDictionary[
      java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double])
    ] = null,
    baseUrl: java.lang.String = null
  ): TypeDomOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("repo")(repo)
    __obj.updateDynamic("user")(user)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    __obj.asInstanceOf[TypeDomOptions]
  }
}


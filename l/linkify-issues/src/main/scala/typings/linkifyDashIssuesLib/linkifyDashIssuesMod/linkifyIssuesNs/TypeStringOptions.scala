package typings
package linkifyDashIssuesLib.linkifyDashIssuesMod.linkifyIssuesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeStringOptions extends BaseOptions {
  var `type`: js.UndefOr[linkifyDashIssuesLib.linkifyDashIssuesLibStrings.string] = js.undefined
}

object TypeStringOptions {
  @scala.inline
  def apply(
    repo: java.lang.String,
    user: java.lang.String,
    attributes: org.scalablytyped.runtime.StringDictionary[
      java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double])
    ] = null,
    baseUrl: java.lang.String = null,
    `type`: linkifyDashIssuesLib.linkifyDashIssuesLibStrings.string = null
  ): TypeStringOptions = {
    val __obj = js.Dynamic.literal(repo = repo, user = user)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TypeStringOptions]
  }
}


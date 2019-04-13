package typings
package linkifyDashIssuesLib.linkifyDashIssuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  var attributes: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double])
    ]
  ] = js.undefined
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var repo: java.lang.String
  var user: java.lang.String
}

object BaseOptions {
  @scala.inline
  def apply(
    repo: java.lang.String,
    user: java.lang.String,
    attributes: org.scalablytyped.runtime.StringDictionary[
      java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double])
    ] = null,
    baseUrl: java.lang.String = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal(repo = repo, user = user)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    __obj.asInstanceOf[BaseOptions]
  }
}


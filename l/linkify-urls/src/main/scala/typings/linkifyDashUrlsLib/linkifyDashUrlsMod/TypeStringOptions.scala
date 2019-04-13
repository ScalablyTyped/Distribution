package typings
package linkifyDashUrlsLib.linkifyDashUrlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeStringOptions extends BaseOptions {
  var `type`: js.UndefOr[linkifyDashUrlsLib.linkifyDashUrlsLibStrings.string] = js.undefined
}

object TypeStringOptions {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[
      java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double])
    ] = null,
    `type`: linkifyDashUrlsLib.linkifyDashUrlsLibStrings.string = null,
    value: java.lang.String | (js.Function1[/* url */ java.lang.String, java.lang.String]) = null
  ): TypeStringOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeStringOptions]
  }
}


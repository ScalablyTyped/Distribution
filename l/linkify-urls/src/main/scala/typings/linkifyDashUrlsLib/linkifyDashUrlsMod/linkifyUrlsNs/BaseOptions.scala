package typings
package linkifyDashUrlsLib.linkifyDashUrlsMod.linkifyUrlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  var attributes: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double])
    ]
  ] = js.undefined
  var value: js.UndefOr[java.lang.String | (js.Function1[/* url */ java.lang.String, java.lang.String])] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[
      java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double])
    ] = null,
    value: java.lang.String | (js.Function1[/* url */ java.lang.String, java.lang.String]) = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}


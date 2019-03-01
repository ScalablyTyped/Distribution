package typings
package linkifyDashUrlsLib.linkifyDashUrlsMod.linkifyUrlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDomOptions extends BaseOptions {
  var `type`: linkifyDashUrlsLib.linkifyDashUrlsLibStrings.dom
}

object TypeDomOptions {
  @scala.inline
  def apply(
    `type`: linkifyDashUrlsLib.linkifyDashUrlsLibStrings.dom,
    attributes: org.scalablytyped.runtime.StringDictionary[
      java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double])
    ] = null,
    value: java.lang.String | (js.Function1[/* url */ java.lang.String, java.lang.String]) = null
  ): TypeDomOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDomOptions]
  }
}


package typings
package jointjsLib.jointjsMod.attributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGCoreAttributes extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var tabindex: js.UndefOr[scala.Double] = js.undefined
  var `xml:base`: js.UndefOr[java.lang.String] = js.undefined
  var `xml:lang`: js.UndefOr[java.lang.String] = js.undefined
  var `xml:space`: js.UndefOr[java.lang.String] = js.undefined
}

object SVGCoreAttributes {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    tabindex: scala.Int | scala.Double = null,
    `xml:base`: java.lang.String = null,
    `xml:lang`: java.lang.String = null,
    `xml:space`: java.lang.String = null
  ): SVGCoreAttributes = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (`xml:base` != null) __obj.updateDynamic("xml:base")(`xml:base`)
    if (`xml:lang` != null) __obj.updateDynamic("xml:lang")(`xml:lang`)
    if (`xml:space` != null) __obj.updateDynamic("xml:space")(`xml:space`)
    __obj.asInstanceOf[SVGCoreAttributes]
  }
}


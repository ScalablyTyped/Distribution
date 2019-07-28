package typings.jointjs.jointjsMod.attributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGCoreAttributes extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var tabindex: js.UndefOr[Double] = js.undefined
  var `xml:base`: js.UndefOr[String] = js.undefined
  var `xml:lang`: js.UndefOr[String] = js.undefined
  var `xml:space`: js.UndefOr[String] = js.undefined
}

object SVGCoreAttributes {
  @scala.inline
  def apply(
    id: String = null,
    tabindex: Int | Double = null,
    `xml:base`: String = null,
    `xml:lang`: String = null,
    `xml:space`: String = null
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


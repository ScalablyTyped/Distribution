package typings.jointjs.jointjsMod.attributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGXLinkAttributes extends js.Object {
  var `xlink:actuate`: js.UndefOr[String] = js.undefined
  var `xlink:arcrole`: js.UndefOr[String] = js.undefined
  var `xlink:href`: js.UndefOr[String] = js.undefined
  var `xlink:role`: js.UndefOr[String] = js.undefined
  var `xlink:show`: js.UndefOr[String] = js.undefined
  var `xlink:title`: js.UndefOr[String] = js.undefined
  var `xlink:type`: js.UndefOr[String] = js.undefined
}

object SVGXLinkAttributes {
  @scala.inline
  def apply(
    `xlink:actuate`: String = null,
    `xlink:arcrole`: String = null,
    `xlink:href`: String = null,
    `xlink:role`: String = null,
    `xlink:show`: String = null,
    `xlink:title`: String = null,
    `xlink:type`: String = null
  ): SVGXLinkAttributes = {
    val __obj = js.Dynamic.literal()
    if (`xlink:actuate` != null) __obj.updateDynamic("xlink:actuate")(`xlink:actuate`)
    if (`xlink:arcrole` != null) __obj.updateDynamic("xlink:arcrole")(`xlink:arcrole`)
    if (`xlink:href` != null) __obj.updateDynamic("xlink:href")(`xlink:href`)
    if (`xlink:role` != null) __obj.updateDynamic("xlink:role")(`xlink:role`)
    if (`xlink:show` != null) __obj.updateDynamic("xlink:show")(`xlink:show`)
    if (`xlink:title` != null) __obj.updateDynamic("xlink:title")(`xlink:title`)
    if (`xlink:type` != null) __obj.updateDynamic("xlink:type")(`xlink:type`)
    __obj.asInstanceOf[SVGXLinkAttributes]
  }
}


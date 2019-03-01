package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DoubleLinkTools extends js.Object {
  var doubleLinkTools: js.UndefOr[scala.Boolean] = js.undefined
  var doubleLinkToolsOffset: js.UndefOr[scala.Double] = js.undefined
  var linkToolsOffset: js.UndefOr[scala.Double] = js.undefined
  var longLinkLength: js.UndefOr[scala.Double] = js.undefined
  var sampleInterval: js.UndefOr[scala.Double] = js.undefined
  var shortLinkLength: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DoubleLinkTools {
  @scala.inline
  def apply(
    doubleLinkTools: js.UndefOr[scala.Boolean] = js.undefined,
    doubleLinkToolsOffset: scala.Int | scala.Double = null,
    linkToolsOffset: scala.Int | scala.Double = null,
    longLinkLength: scala.Int | scala.Double = null,
    sampleInterval: scala.Int | scala.Double = null,
    shortLinkLength: scala.Int | scala.Double = null
  ): Anon_DoubleLinkTools = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doubleLinkTools)) __obj.updateDynamic("doubleLinkTools")(doubleLinkTools)
    if (doubleLinkToolsOffset != null) __obj.updateDynamic("doubleLinkToolsOffset")(doubleLinkToolsOffset.asInstanceOf[js.Any])
    if (linkToolsOffset != null) __obj.updateDynamic("linkToolsOffset")(linkToolsOffset.asInstanceOf[js.Any])
    if (longLinkLength != null) __obj.updateDynamic("longLinkLength")(longLinkLength.asInstanceOf[js.Any])
    if (sampleInterval != null) __obj.updateDynamic("sampleInterval")(sampleInterval.asInstanceOf[js.Any])
    if (shortLinkLength != null) __obj.updateDynamic("shortLinkLength")(shortLinkLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DoubleLinkTools]
  }
}


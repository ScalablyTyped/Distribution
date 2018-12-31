package typings
package markdownDashItDashAnchorLib.markdownDashItDashAnchorMod.anchorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorOptions extends js.Object {
  var callback: js.UndefOr[
    js.Function2[
      /* token */ markdownDashItLib.libTokenMod.namespaced, 
      /* anchor_info */ AnchorInfo, 
      scala.Unit
    ]
  ] = js.undefined
  var level: js.UndefOr[scala.Double] = js.undefined
  var permalink: js.UndefOr[scala.Boolean] = js.undefined
  var permalinkBefore: js.UndefOr[scala.Boolean] = js.undefined
  var permalinkClass: js.UndefOr[java.lang.String] = js.undefined
  var permalinkHref: js.UndefOr[js.Function1[/* slug */ java.lang.String, java.lang.String]] = js.undefined
  var permalinkSymbol: js.UndefOr[java.lang.String] = js.undefined
  var renderPermalink: js.UndefOr[
    js.Function4[
      /* slug */ java.lang.String, 
      /* opts */ this.type, 
      /* state */ markdownDashItLib.libParserUnderscoreCoreMod.namespaced, 
      /* idx */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var slugify: js.UndefOr[js.Function1[/* str */ java.lang.String, java.lang.String]] = js.undefined
}


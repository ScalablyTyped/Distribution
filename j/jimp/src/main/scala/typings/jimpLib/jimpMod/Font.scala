package typings
package jimpLib.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var chars: org.scalablytyped.runtime.StringDictionary[FontChar]
  var common: FontCommon
  var info: FontInfo
  var kernings: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[scala.Double]]
  var pages: coreDashJsLib.Array[java.lang.String]
}

object Font {
  @scala.inline
  def apply(
    chars: org.scalablytyped.runtime.StringDictionary[FontChar],
    common: FontCommon,
    info: FontInfo,
    kernings: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[scala.Double]],
    pages: coreDashJsLib.Array[java.lang.String]
  ): Font = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chars")(chars)
    __obj.updateDynamic("common")(common)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("kernings")(kernings)
    __obj.updateDynamic("pages")(pages)
    __obj.asInstanceOf[Font]
  }
}


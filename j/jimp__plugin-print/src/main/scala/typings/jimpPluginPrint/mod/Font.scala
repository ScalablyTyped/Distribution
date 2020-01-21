package typings.jimpPluginPrint.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var chars: StringDictionary[FontChar]
  var common: FontCommon
  var info: FontInfo
  var kernings: StringDictionary[StringDictionary[Double]]
  var pages: js.Array[String]
}

object Font {
  @scala.inline
  def apply(
    chars: StringDictionary[FontChar],
    common: FontCommon,
    info: FontInfo,
    kernings: StringDictionary[StringDictionary[Double]],
    pages: js.Array[String]
  ): Font = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], kernings = kernings.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Font]
  }
}


package typings.jimpPluginPrint.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Font extends js.Object {
  var chars: StringDictionary[FontChar] = js.native
  var common: FontCommon = js.native
  var info: FontInfo = js.native
  var kernings: StringDictionary[StringDictionary[Double]] = js.native
  var pages: js.Array[String] = js.native
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
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChars(value: StringDictionary[FontChar]): Self = this.set("chars", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommon(value: FontCommon): Self = this.set("common", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: FontInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setKernings(value: StringDictionary[StringDictionary[Double]]): Self = this.set("kernings", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagesVarargs(value: String*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[String]): Self = this.set("pages", value.asInstanceOf[js.Any])
  }
  
}


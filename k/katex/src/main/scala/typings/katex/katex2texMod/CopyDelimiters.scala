package typings.katex.katex2texMod

import typings.katex.katexStrings.$
import typings.katex.katexStrings.DollarDollar
import typings.katex.katexStrings.Leftparenthesis
import typings.katex.katexStrings.Rightparenthesis
import typings.katex.katexStrings.`[`
import typings.katex.katexStrings.`]`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyDelimiters extends js.Object {
  var display: js.Tuple2[DollarDollar | `[`, DollarDollar | `]`] = js.native
  var `inline`: js.Tuple2[$ | Leftparenthesis, $ | Rightparenthesis] = js.native
}

object CopyDelimiters {
  @scala.inline
  def apply(
    display: js.Tuple2[DollarDollar | `[`, DollarDollar | `]`],
    `inline`: js.Tuple2[$ | Leftparenthesis, $ | Rightparenthesis]
  ): CopyDelimiters = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDelimiters]
  }
  @scala.inline
  implicit class CopyDelimitersOps[Self <: CopyDelimiters] (val x: Self) extends AnyVal {
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
    def setDisplay(value: js.Tuple2[DollarDollar | `[`, DollarDollar | `]`]): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def setInline(value: js.Tuple2[$ | Leftparenthesis, $ | Rightparenthesis]): Self = this.set("inline", value.asInstanceOf[js.Any])
  }
  
}


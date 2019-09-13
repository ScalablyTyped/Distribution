package typings.katex.contribCopyDashTexKatex2texMod

import typings.katex.katexStrings.DOLLAR
import typings.katex.katexStrings.DOLLARDOLLAR
import typings.katex.katexStrings.`(`
import typings.katex.katexStrings.`)`
import typings.katex.katexStrings.`[`
import typings.katex.katexStrings.`]`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyDelimiters extends js.Object {
  var display: js.Tuple2[DOLLARDOLLAR | `[`, DOLLARDOLLAR | `]`]
  var `inline`: js.Tuple2[DOLLAR | `(`, DOLLAR | `)`]
}

object CopyDelimiters {
  @scala.inline
  def apply(
    display: js.Tuple2[DOLLARDOLLAR | `[`, DOLLARDOLLAR | `]`],
    `inline`: js.Tuple2[DOLLAR | `(`, DOLLAR | `)`]
  ): CopyDelimiters = {
    val __obj = js.Dynamic.literal(display = display)
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[CopyDelimiters]
  }
}


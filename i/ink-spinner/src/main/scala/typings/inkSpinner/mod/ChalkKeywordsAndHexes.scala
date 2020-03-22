package typings.inkSpinner.mod

import typings.chalk.mod.Chalk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<chalk.chalk.Chalk, 'keyword' | 'hex' | 'bgKeyword' | 'bgHex'> */
trait ChalkKeywordsAndHexes extends js.Object {
  var bgHex: js.Function1[/* color */ String, Chalk]
  var bgKeyword: js.Function1[/* color */ String, Chalk]
  var hex: js.Function1[/* color */ String, Chalk]
  var keyword: js.Function1[/* color */ String, Chalk]
}

object ChalkKeywordsAndHexes {
  @scala.inline
  def apply(
    bgHex: /* color */ String => Chalk,
    bgKeyword: /* color */ String => Chalk,
    hex: /* color */ String => Chalk,
    keyword: /* color */ String => Chalk
  ): ChalkKeywordsAndHexes = {
    val __obj = js.Dynamic.literal(bgHex = js.Any.fromFunction1(bgHex), bgKeyword = js.Any.fromFunction1(bgKeyword), hex = js.Any.fromFunction1(hex), keyword = js.Any.fromFunction1(keyword))
  
    __obj.asInstanceOf[ChalkKeywordsAndHexes]
  }
}


package typings.kuromoji.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenizerBuilderOption extends js.Object {
  var dicPath: js.UndefOr[String] = js.undefined
}

object TokenizerBuilderOption {
  @scala.inline
  def apply(dicPath: String = null): TokenizerBuilderOption = {
    val __obj = js.Dynamic.literal()
    if (dicPath != null) __obj.updateDynamic("dicPath")(dicPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenizerBuilderOption]
  }
}


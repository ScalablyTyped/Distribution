package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenizerBuilderOption extends js.Object {
  var dicPath: js.UndefOr[java.lang.String] = js.undefined
}

object TokenizerBuilderOption {
  @scala.inline
  def apply(dicPath: java.lang.String = null): TokenizerBuilderOption = {
    val __obj = js.Dynamic.literal()
    if (dicPath != null) __obj.updateDynamic("dicPath")(dicPath)
    __obj.asInstanceOf[TokenizerBuilderOption]
  }
}


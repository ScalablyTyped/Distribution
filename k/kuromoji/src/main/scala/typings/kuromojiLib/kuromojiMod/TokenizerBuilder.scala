package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TokenizerBuilder[T] extends js.Object {
  def build(callback: js.Function2[/* err */ stdLib.Error, /* tokenizer */ Tokenizer[T], scala.Unit]): scala.Unit
}


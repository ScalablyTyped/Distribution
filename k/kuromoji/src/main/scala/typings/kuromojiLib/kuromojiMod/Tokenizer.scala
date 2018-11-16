package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Tokenizer[T] extends js.Object {
  var formatter: Formatter[T]
  var token_info_dictionary: TokenInfoDictionary
  var unknown_dictionary: UnknownDictionary
  var viterbi_builder: ViterbiBuilder
  var viterbi_searcher: ViterbiSearcher
  def getLattice(text: java.lang.String): ViterbiLattice
  def tokenize(text: java.lang.String): js.Array[T]
}


package typings.kuromoji.mod

import typings.doublearray.doublearray.DoubleArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViterbiBuilder extends js.Object {
  var token_info_dictionary: TokenInfoDictionary = js.native
  var trie: DoubleArray = js.native
  var unknown_dictionary: UnknownDictionary = js.native
  def build(sentence_str: String): ViterbiLattice = js.native
}

object ViterbiBuilder {
  @scala.inline
  def apply(
    build: String => ViterbiLattice,
    token_info_dictionary: TokenInfoDictionary,
    trie: DoubleArray,
    unknown_dictionary: UnknownDictionary
  ): ViterbiBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build), token_info_dictionary = token_info_dictionary.asInstanceOf[js.Any], trie = trie.asInstanceOf[js.Any], unknown_dictionary = unknown_dictionary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViterbiBuilder]
  }
  @scala.inline
  implicit class ViterbiBuilderOps[Self <: ViterbiBuilder] (val x: Self) extends AnyVal {
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
    def setBuild(value: String => ViterbiLattice): Self = this.set("build", js.Any.fromFunction1(value))
    @scala.inline
    def setToken_info_dictionary(value: TokenInfoDictionary): Self = this.set("token_info_dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrie(value: DoubleArray): Self = this.set("trie", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnknown_dictionary(value: UnknownDictionary): Self = this.set("unknown_dictionary", value.asInstanceOf[js.Any])
  }
  
}


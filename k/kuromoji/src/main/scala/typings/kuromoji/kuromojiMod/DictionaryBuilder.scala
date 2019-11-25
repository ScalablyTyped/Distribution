package typings.kuromoji.kuromojiMod

import typings.doublearray.doublearray.DoubleArray
import typings.kuromoji.Anon_Tokeninfodictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryBuilder extends js.Object {
  var tid_entries: js.Array[String]
  var unk_entries: js.Array[String]
  def addTokenInfoDictionary(text: String): DictionaryBuilder
  def build(): DynamicDictionaries
  def buildConnectionCosts(): ConnectionCosts
  def buildDoubleArray(): DoubleArray
  def buildTokenInfoDictionary(): Anon_Tokeninfodictionary
  def buildUnknownDictionary(): UnknownDictionary
  def charDef(char_text: String): DictionaryBuilder
  def costMatrix(matrix_text: String): DictionaryBuilder
  def unkDef(text: String): DictionaryBuilder
}

object DictionaryBuilder {
  @scala.inline
  def apply(
    addTokenInfoDictionary: String => DictionaryBuilder,
    build: () => DynamicDictionaries,
    buildConnectionCosts: () => ConnectionCosts,
    buildDoubleArray: () => DoubleArray,
    buildTokenInfoDictionary: () => Anon_Tokeninfodictionary,
    buildUnknownDictionary: () => UnknownDictionary,
    charDef: String => DictionaryBuilder,
    costMatrix: String => DictionaryBuilder,
    tid_entries: js.Array[String],
    unkDef: String => DictionaryBuilder,
    unk_entries: js.Array[String]
  ): DictionaryBuilder = {
    val __obj = js.Dynamic.literal(addTokenInfoDictionary = js.Any.fromFunction1(addTokenInfoDictionary), build = js.Any.fromFunction0(build), buildConnectionCosts = js.Any.fromFunction0(buildConnectionCosts), buildDoubleArray = js.Any.fromFunction0(buildDoubleArray), buildTokenInfoDictionary = js.Any.fromFunction0(buildTokenInfoDictionary), buildUnknownDictionary = js.Any.fromFunction0(buildUnknownDictionary), charDef = js.Any.fromFunction1(charDef), costMatrix = js.Any.fromFunction1(costMatrix), tid_entries = tid_entries.asInstanceOf[js.Any], unkDef = js.Any.fromFunction1(unkDef), unk_entries = unk_entries.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DictionaryBuilder]
  }
}

@JSImport("kuromoji", "dictionaryBuilder")
@js.native
object dictionaryBuilder extends js.Object {
  def apply(): DictionaryBuilder = js.native
}


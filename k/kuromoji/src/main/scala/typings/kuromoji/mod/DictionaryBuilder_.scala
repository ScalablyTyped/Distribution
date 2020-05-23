package typings.kuromoji.mod

import typings.doublearray.doublearray.DoubleArray
import typings.kuromoji.anon.Tokeninfodictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryBuilder_ extends js.Object {
  var tid_entries: js.Array[String]
  var unk_entries: js.Array[String]
  def addTokenInfoDictionary(text: String): DictionaryBuilder_
  def build(): DynamicDictionaries
  def buildConnectionCosts(): ConnectionCosts
  def buildDoubleArray(): DoubleArray
  def buildTokenInfoDictionary(): Tokeninfodictionary
  def buildUnknownDictionary(): UnknownDictionary
  def charDef(char_text: String): DictionaryBuilder_
  def costMatrix(matrix_text: String): DictionaryBuilder_
  def unkDef(text: String): DictionaryBuilder_
}

object DictionaryBuilder_ {
  @scala.inline
  def apply(
    addTokenInfoDictionary: String => DictionaryBuilder_,
    build: () => DynamicDictionaries,
    buildConnectionCosts: () => ConnectionCosts,
    buildDoubleArray: () => DoubleArray,
    buildTokenInfoDictionary: () => Tokeninfodictionary,
    buildUnknownDictionary: () => UnknownDictionary,
    charDef: String => DictionaryBuilder_,
    costMatrix: String => DictionaryBuilder_,
    tid_entries: js.Array[String],
    unkDef: String => DictionaryBuilder_,
    unk_entries: js.Array[String]
  ): DictionaryBuilder_ = {
    val __obj = js.Dynamic.literal(addTokenInfoDictionary = js.Any.fromFunction1(addTokenInfoDictionary), build = js.Any.fromFunction0(build), buildConnectionCosts = js.Any.fromFunction0(buildConnectionCosts), buildDoubleArray = js.Any.fromFunction0(buildDoubleArray), buildTokenInfoDictionary = js.Any.fromFunction0(buildTokenInfoDictionary), buildUnknownDictionary = js.Any.fromFunction0(buildUnknownDictionary), charDef = js.Any.fromFunction1(charDef), costMatrix = js.Any.fromFunction1(costMatrix), tid_entries = tid_entries.asInstanceOf[js.Any], unkDef = js.Any.fromFunction1(unkDef), unk_entries = unk_entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryBuilder_]
  }
}


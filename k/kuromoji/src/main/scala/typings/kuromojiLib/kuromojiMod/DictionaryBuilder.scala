package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictionaryBuilder extends js.Object {
  var tid_entries: js.Array[java.lang.String]
  var unk_entries: js.Array[java.lang.String]
  def addTokenInfoDictionary(text: java.lang.String): DictionaryBuilder
  def build(): DynamicDictionaries
  def buildConnectionCosts(): ConnectionCosts
  def buildDoubleArray(): doublearrayLib.doublearrayNs.DoubleArray
  def buildTokenInfoDictionary(): kuromojiLib.Anon_Tokeninfodictionary
  def buildUnknownDictionary(): UnknownDictionary
  def charDef(char_text: java.lang.String): DictionaryBuilder
  def costMatrix(matrix_text: java.lang.String): DictionaryBuilder
  def unkDef(text: java.lang.String): DictionaryBuilder
}

object DictionaryBuilder {
  @scala.inline
  def apply(
    addTokenInfoDictionary: java.lang.String => DictionaryBuilder,
    build: () => DynamicDictionaries,
    buildConnectionCosts: () => ConnectionCosts,
    buildDoubleArray: () => doublearrayLib.doublearrayNs.DoubleArray,
    buildTokenInfoDictionary: () => kuromojiLib.Anon_Tokeninfodictionary,
    buildUnknownDictionary: () => UnknownDictionary,
    charDef: java.lang.String => DictionaryBuilder,
    costMatrix: java.lang.String => DictionaryBuilder,
    tid_entries: js.Array[java.lang.String],
    unkDef: java.lang.String => DictionaryBuilder,
    unk_entries: js.Array[java.lang.String]
  ): DictionaryBuilder = {
    val __obj = js.Dynamic.literal(addTokenInfoDictionary = js.Any.fromFunction1(addTokenInfoDictionary), build = js.Any.fromFunction0(build), buildConnectionCosts = js.Any.fromFunction0(buildConnectionCosts), buildDoubleArray = js.Any.fromFunction0(buildDoubleArray), buildTokenInfoDictionary = js.Any.fromFunction0(buildTokenInfoDictionary), buildUnknownDictionary = js.Any.fromFunction0(buildUnknownDictionary), charDef = js.Any.fromFunction1(charDef), costMatrix = js.Any.fromFunction1(costMatrix), tid_entries = tid_entries, unkDef = js.Any.fromFunction1(unkDef), unk_entries = unk_entries)
  
    __obj.asInstanceOf[DictionaryBuilder]
  }
}


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
    addTokenInfoDictionary: js.Function1[java.lang.String, DictionaryBuilder],
    build: js.Function0[DynamicDictionaries],
    buildConnectionCosts: js.Function0[ConnectionCosts],
    buildDoubleArray: js.Function0[doublearrayLib.doublearrayNs.DoubleArray],
    buildTokenInfoDictionary: js.Function0[kuromojiLib.Anon_Tokeninfodictionary],
    buildUnknownDictionary: js.Function0[UnknownDictionary],
    charDef: js.Function1[java.lang.String, DictionaryBuilder],
    costMatrix: js.Function1[java.lang.String, DictionaryBuilder],
    tid_entries: js.Array[java.lang.String],
    unkDef: js.Function1[java.lang.String, DictionaryBuilder],
    unk_entries: js.Array[java.lang.String]
  ): DictionaryBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addTokenInfoDictionary")(addTokenInfoDictionary)
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("buildConnectionCosts")(buildConnectionCosts)
    __obj.updateDynamic("buildDoubleArray")(buildDoubleArray)
    __obj.updateDynamic("buildTokenInfoDictionary")(buildTokenInfoDictionary)
    __obj.updateDynamic("buildUnknownDictionary")(buildUnknownDictionary)
    __obj.updateDynamic("charDef")(charDef)
    __obj.updateDynamic("costMatrix")(costMatrix)
    __obj.updateDynamic("tid_entries")(tid_entries)
    __obj.updateDynamic("unkDef")(unkDef)
    __obj.updateDynamic("unk_entries")(unk_entries)
    __obj.asInstanceOf[DictionaryBuilder]
  }
}


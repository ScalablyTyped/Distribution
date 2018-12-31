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
  def buildTokenInfoDictionary(): kuromojiLib.Anon_Trie
  def buildUnknownDictionary(): UnknownDictionary
  def charDef(char_text: java.lang.String): DictionaryBuilder
  def costMatrix(matrix_text: java.lang.String): DictionaryBuilder
  def unkDef(text: java.lang.String): DictionaryBuilder
}


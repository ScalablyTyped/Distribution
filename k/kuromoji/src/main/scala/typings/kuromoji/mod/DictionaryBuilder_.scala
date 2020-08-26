package typings.kuromoji.mod

import typings.doublearray.doublearray.DoubleArray
import typings.kuromoji.anon.Tokeninfodictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictionaryBuilder_ extends js.Object {
  var tid_entries: js.Array[String] = js.native
  var unk_entries: js.Array[String] = js.native
  def addTokenInfoDictionary(text: String): DictionaryBuilder_ = js.native
  def build(): DynamicDictionaries = js.native
  def buildConnectionCosts(): ConnectionCosts = js.native
  def buildDoubleArray(): DoubleArray = js.native
  def buildTokenInfoDictionary(): Tokeninfodictionary = js.native
  def buildUnknownDictionary(): UnknownDictionary = js.native
  def charDef(char_text: String): DictionaryBuilder_ = js.native
  def costMatrix(matrix_text: String): DictionaryBuilder_ = js.native
  def unkDef(text: String): DictionaryBuilder_ = js.native
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
  @scala.inline
  implicit class DictionaryBuilder_Ops[Self <: DictionaryBuilder_] (val x: Self) extends AnyVal {
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
    def setAddTokenInfoDictionary(value: String => DictionaryBuilder_): Self = this.set("addTokenInfoDictionary", js.Any.fromFunction1(value))
    @scala.inline
    def setBuild(value: () => DynamicDictionaries): Self = this.set("build", js.Any.fromFunction0(value))
    @scala.inline
    def setBuildConnectionCosts(value: () => ConnectionCosts): Self = this.set("buildConnectionCosts", js.Any.fromFunction0(value))
    @scala.inline
    def setBuildDoubleArray(value: () => DoubleArray): Self = this.set("buildDoubleArray", js.Any.fromFunction0(value))
    @scala.inline
    def setBuildTokenInfoDictionary(value: () => Tokeninfodictionary): Self = this.set("buildTokenInfoDictionary", js.Any.fromFunction0(value))
    @scala.inline
    def setBuildUnknownDictionary(value: () => UnknownDictionary): Self = this.set("buildUnknownDictionary", js.Any.fromFunction0(value))
    @scala.inline
    def setCharDef(value: String => DictionaryBuilder_): Self = this.set("charDef", js.Any.fromFunction1(value))
    @scala.inline
    def setCostMatrix(value: String => DictionaryBuilder_): Self = this.set("costMatrix", js.Any.fromFunction1(value))
    @scala.inline
    def setTid_entriesVarargs(value: String*): Self = this.set("tid_entries", js.Array(value :_*))
    @scala.inline
    def setTid_entries(value: js.Array[String]): Self = this.set("tid_entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnkDef(value: String => DictionaryBuilder_): Self = this.set("unkDef", js.Any.fromFunction1(value))
    @scala.inline
    def setUnk_entriesVarargs(value: String*): Self = this.set("unk_entries", js.Array(value :_*))
    @scala.inline
    def setUnk_entries(value: js.Array[String]): Self = this.set("unk_entries", value.asInstanceOf[js.Any])
  }
  
}


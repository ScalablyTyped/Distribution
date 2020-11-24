package typings.kuromoji.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenInfoDictionary extends js.Object {
  
  def addMapping(source: Double, target: Double): Unit = js.native
  
  def buildDictionary(entries: js.Array[js.Array[_]]): NumberDictionary[String] = js.native
  
  def getFeatures(token_info_id_str: String): String = js.native
  
  def loadDictionary(array_buffer: Uint8Array): TokenInfoDictionary = js.native
  
  def loadPosVector(array_buffer: Uint8Array): TokenInfoDictionary = js.native
  
  def loadTargetMap(array_buffer: Uint8Array): TokenInfoDictionary = js.native
  
  def put(left_id: Double, right_id: Double, word_cost: Double, surface_form: String, feature: String): Double = js.native
  
  def targetMapToBuffer(): Uint8Array = js.native
}
object TokenInfoDictionary {
  
  @scala.inline
  def apply(
    addMapping: (Double, Double) => Unit,
    buildDictionary: js.Array[js.Array[_]] => NumberDictionary[String],
    getFeatures: String => String,
    loadDictionary: Uint8Array => TokenInfoDictionary,
    loadPosVector: Uint8Array => TokenInfoDictionary,
    loadTargetMap: Uint8Array => TokenInfoDictionary,
    put: (Double, Double, Double, String, String) => Double,
    targetMapToBuffer: () => Uint8Array
  ): TokenInfoDictionary = {
    val __obj = js.Dynamic.literal(addMapping = js.Any.fromFunction2(addMapping), buildDictionary = js.Any.fromFunction1(buildDictionary), getFeatures = js.Any.fromFunction1(getFeatures), loadDictionary = js.Any.fromFunction1(loadDictionary), loadPosVector = js.Any.fromFunction1(loadPosVector), loadTargetMap = js.Any.fromFunction1(loadTargetMap), put = js.Any.fromFunction5(put), targetMapToBuffer = js.Any.fromFunction0(targetMapToBuffer))
    __obj.asInstanceOf[TokenInfoDictionary]
  }
  
  @scala.inline
  implicit class TokenInfoDictionaryOps[Self <: TokenInfoDictionary] (val x: Self) extends AnyVal {
    
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
    def setAddMapping(value: (Double, Double) => Unit): Self = this.set("addMapping", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBuildDictionary(value: js.Array[js.Array[_]] => NumberDictionary[String]): Self = this.set("buildDictionary", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFeatures(value: String => String): Self = this.set("getFeatures", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadDictionary(value: Uint8Array => TokenInfoDictionary): Self = this.set("loadDictionary", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadPosVector(value: Uint8Array => TokenInfoDictionary): Self = this.set("loadPosVector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadTargetMap(value: Uint8Array => TokenInfoDictionary): Self = this.set("loadTargetMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPut(value: (Double, Double, Double, String, String) => Double): Self = this.set("put", js.Any.fromFunction5(value))
    
    @scala.inline
    def setTargetMapToBuffer(value: () => Uint8Array): Self = this.set("targetMapToBuffer", js.Any.fromFunction0(value))
  }
}

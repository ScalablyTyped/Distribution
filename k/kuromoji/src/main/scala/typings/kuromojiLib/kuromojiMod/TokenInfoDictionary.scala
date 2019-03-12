package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenInfoDictionary extends js.Object {
  def addMapping(source: scala.Double, target: scala.Double): scala.Unit
  def buildDictionary(entries: js.Array[js.Array[_]]): org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  def getFeatures(token_info_id_str: java.lang.String): java.lang.String
  def loadDictionary(array_buffer: stdLib.Uint8Array): TokenInfoDictionary
  def loadPosVector(array_buffer: stdLib.Uint8Array): TokenInfoDictionary
  def loadTargetMap(array_buffer: stdLib.Uint8Array): TokenInfoDictionary
  def put(
    left_id: scala.Double,
    right_id: scala.Double,
    word_cost: scala.Double,
    surface_form: java.lang.String,
    feature: java.lang.String
  ): scala.Double
  def targetMapToBuffer(): stdLib.Uint8Array
}

object TokenInfoDictionary {
  @scala.inline
  def apply(
    addMapping: (scala.Double, scala.Double) => scala.Unit,
    buildDictionary: js.Array[js.Array[_]] => org.scalablytyped.runtime.NumberDictionary[java.lang.String],
    getFeatures: java.lang.String => java.lang.String,
    loadDictionary: stdLib.Uint8Array => TokenInfoDictionary,
    loadPosVector: stdLib.Uint8Array => TokenInfoDictionary,
    loadTargetMap: stdLib.Uint8Array => TokenInfoDictionary,
    put: (scala.Double, scala.Double, scala.Double, java.lang.String, java.lang.String) => scala.Double,
    targetMapToBuffer: () => stdLib.Uint8Array
  ): TokenInfoDictionary = {
    val __obj = js.Dynamic.literal(addMapping = js.Any.fromFunction2(addMapping), buildDictionary = js.Any.fromFunction1(buildDictionary), getFeatures = js.Any.fromFunction1(getFeatures), loadDictionary = js.Any.fromFunction1(loadDictionary), loadPosVector = js.Any.fromFunction1(loadPosVector), loadTargetMap = js.Any.fromFunction1(loadTargetMap), put = js.Any.fromFunction5(put), targetMapToBuffer = js.Any.fromFunction0(targetMapToBuffer))
  
    __obj.asInstanceOf[TokenInfoDictionary]
  }
}


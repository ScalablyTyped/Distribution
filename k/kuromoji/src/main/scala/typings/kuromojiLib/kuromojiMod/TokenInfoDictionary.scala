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
    addMapping: js.Function2[scala.Double, scala.Double, scala.Unit],
    buildDictionary: js.Function1[
      js.Array[js.Array[_]], 
      org.scalablytyped.runtime.NumberDictionary[java.lang.String]
    ],
    getFeatures: js.Function1[java.lang.String, java.lang.String],
    loadDictionary: js.Function1[stdLib.Uint8Array, TokenInfoDictionary],
    loadPosVector: js.Function1[stdLib.Uint8Array, TokenInfoDictionary],
    loadTargetMap: js.Function1[stdLib.Uint8Array, TokenInfoDictionary],
    put: js.Function5[scala.Double, scala.Double, scala.Double, java.lang.String, java.lang.String, scala.Double],
    targetMapToBuffer: js.Function0[stdLib.Uint8Array]
  ): TokenInfoDictionary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addMapping")(addMapping)
    __obj.updateDynamic("buildDictionary")(buildDictionary)
    __obj.updateDynamic("getFeatures")(getFeatures)
    __obj.updateDynamic("loadDictionary")(loadDictionary)
    __obj.updateDynamic("loadPosVector")(loadPosVector)
    __obj.updateDynamic("loadTargetMap")(loadTargetMap)
    __obj.updateDynamic("put")(put)
    __obj.updateDynamic("targetMapToBuffer")(targetMapToBuffer)
    __obj.asInstanceOf[TokenInfoDictionary]
  }
}


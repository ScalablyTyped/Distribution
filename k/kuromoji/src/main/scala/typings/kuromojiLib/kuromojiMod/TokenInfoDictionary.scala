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


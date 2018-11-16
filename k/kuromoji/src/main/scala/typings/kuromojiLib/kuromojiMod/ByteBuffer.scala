package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ByteBuffer extends js.Object {
  var buffer: stdLib.Uint8Array
  var position: scala.Double
  def get(index: scala.Double): scala.Double
  def getInt(index: scala.Double): scala.Double
  def getShort(index: scala.Double): scala.Double
  def getString(index: scala.Double): java.lang.String
  def put(b: scala.Double): scala.Unit
  def putInt(num: scala.Double): scala.Unit
  def putShort(num: scala.Double): scala.Unit
  def putString(str: java.lang.String): scala.Unit
  def readInt(): scala.Double
  def reallocate(): scala.Unit
  def shrink(): stdLib.Uint8Array
  def size(): scala.Double
}


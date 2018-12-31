package typings
package jsDashSha512Lib.jsDashSha512Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash extends js.Object {
  def array(): js.Array[scala.Double]
  def arrayBuffer(): stdLib.ArrayBuffer
  def digest(): js.Array[scala.Double]
  def hex(): java.lang.String
  def update(messageToHash: java.lang.String): Hash
}


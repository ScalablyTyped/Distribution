package typings
package ixDotJsLib.l2oMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("l2o", "Dictionary")
@js.native
class Dictionary[TKey, TValue] ()
  extends ixDotJsLib.IxNs.Dictionary[TKey, TValue] {
  def this(capacity: scala.Double) = this()
  def this(capacity: scala.Double, comparer: ixDotJsLib.IxNs.EqualityComparer[TKey, TKey]) = this()
}


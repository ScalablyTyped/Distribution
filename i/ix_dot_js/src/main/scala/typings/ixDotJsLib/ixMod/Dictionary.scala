package typings
package ixDotJsLib.ixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ix", "Dictionary")
@js.native
class Dictionary[TKey, TValue] ()
  extends ixDotJsLib.IxNs.Dictionary[TKey, TValue] {
  def this(capacity: scala.Double) = this()
  def this(capacity: scala.Double, comparer: ixDotJsLib.IxNs.EqualityComparer[TKey, TKey]) = this()
}


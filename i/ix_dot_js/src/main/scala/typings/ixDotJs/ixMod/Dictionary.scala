package typings.ixDotJs.ixMod

import typings.ixDotJs.Ix.EqualityComparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ix", "Dictionary")
@js.native
class Dictionary[TKey, TValue] ()
  extends typings.ixDotJs.Ix.Dictionary[TKey, TValue] {
  def this(capacity: Double) = this()
  def this(capacity: Double, comparer: EqualityComparer[TKey, TKey]) = this()
}


package typings.ixDotJs.l2oMod

import typings.ixDotJs.Ix.EqualityComparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("l2o", "Dictionary")
@js.native
class Dictionary[TKey, TValue] ()
  extends typings.ixDotJs.Ix.Dictionary[TKey, TValue] {
  def this(capacity: Double) = this()
  def this(capacity: Double, comparer: EqualityComparer[TKey, TKey]) = this()
}


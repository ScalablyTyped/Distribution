package typings.ixJs.l2oMod

import typings.ixJs.Ix.EqualityComparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("l2o", "Dictionary")
@js.native
class Dictionary[TKey, TValue] ()
  extends typings.ixJs.Ix.Dictionary[TKey, TValue] {
  def this(capacity: Double) = this()
  def this(capacity: js.UndefOr[scala.Nothing], comparer: EqualityComparer[TKey, TKey]) = this()
  def this(capacity: Double, comparer: EqualityComparer[TKey, TKey]) = this()
}

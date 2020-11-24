package typings.ixJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ix", "Enumerable")
@js.native
class EnumerableCls[T] protected ()
  extends typings.ixJs.Ix.Enumerable[T] {
  def this(getEnumerator: js.Function0[typings.ixJs.Ix.Enumerator[T]]) = this()
}

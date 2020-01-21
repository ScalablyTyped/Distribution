package typings.ixJs.Ix

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enumerator[T] extends Disposable {
  def getCurrent(): T
  def moveNext(): Boolean
}

@JSGlobal("Ix.Enumerator")
@js.native
object Enumerator extends TopLevel[EnumeratorStatic]


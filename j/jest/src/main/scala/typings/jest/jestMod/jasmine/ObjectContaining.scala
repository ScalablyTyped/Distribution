package typings.jest.jestMod.jasmine

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectContaining
  extends Instantiable1[/* sample */ js.Any, js.Any] {
  def jasmineMatches(other: js.Any, mismatchKeys: js.Array[_], mismatchValues: js.Array[_]): Boolean = js.native
  def jasmineToString(): String = js.native
}

@JSImport("jest", "jasmine.objectContaining")
@js.native
object objectContaining extends js.Object {
  def apply(sample: js.Any): ObjectContaining = js.native
}


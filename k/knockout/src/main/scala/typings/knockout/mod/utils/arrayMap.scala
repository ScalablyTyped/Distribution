package typings.knockout.mod.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("knockout", "utils.arrayMap")
@js.native
object arrayMap extends js.Object {
  
  def apply[T, U](array: js.Array[T], mapping: js.Function2[/* item */ T, /* index */ Double, U]): js.Array[U] = js.native
  def apply[T, U](
    array: js.Array[T],
    mapping: js.Function2[/* item */ T, /* index */ Double, U],
    mappingOwner: js.Any
  ): js.Array[U] = js.native
}

package typings.materializecssMaterialize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Chips, 'deleteChip'> */
trait PickChipsdeleteChip extends StObject {
  
  def deleteChip(): Unit
  def deleteChip(n: Double): Unit
  @JSName("deleteChip")
  var deleteChip_Original: js.Function1[/* n */ js.UndefOr[Double], Unit]
}
object PickChipsdeleteChip {
  
  inline def apply(deleteChip: /* n */ js.UndefOr[Double] => Unit): PickChipsdeleteChip = {
    val __obj = js.Dynamic.literal(deleteChip = js.Any.fromFunction1(deleteChip))
    __obj.asInstanceOf[PickChipsdeleteChip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickChipsdeleteChip] (val x: Self) extends AnyVal {
    
    inline def setDeleteChip(value: /* n */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "deleteChip", js.Any.fromFunction1(value))
  }
}

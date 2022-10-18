package typings.materializeCss.anon

import typings.materializeCss.M.ChipData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Chips, 'addChip'> */
trait PickChipsaddChip extends StObject {
  
  def addChip(chip: ChipData): Unit
  @JSName("addChip")
  var addChip_Original: js.Function1[/* chip */ ChipData, Unit]
}
object PickChipsaddChip {
  
  inline def apply(addChip: /* chip */ ChipData => Unit): PickChipsaddChip = {
    val __obj = js.Dynamic.literal(addChip = js.Any.fromFunction1(addChip))
    __obj.asInstanceOf[PickChipsaddChip]
  }
  
  extension [Self <: PickChipsaddChip](x: Self) {
    
    inline def setAddChip(value: /* chip */ ChipData => Unit): Self = StObject.set(x, "addChip", js.Any.fromFunction1(value))
  }
}

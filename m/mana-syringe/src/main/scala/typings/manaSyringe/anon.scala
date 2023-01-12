package typings.manaSyringe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<mana-syringe.mana-syringe/lib/core.TokenOption> */
  trait PartialTokenOption extends StObject {
    
    var multiple: js.UndefOr[Boolean] = js.undefined
  }
  object PartialTokenOption {
    
    inline def apply(): PartialTokenOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTokenOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialTokenOption] (val x: Self) extends AnyVal {
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    }
  }
}

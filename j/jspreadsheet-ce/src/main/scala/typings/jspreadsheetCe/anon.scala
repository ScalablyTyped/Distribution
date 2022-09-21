package typings.jspreadsheetCe

import typings.jspreadsheetCe.mod.CellValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Colspan extends StObject {
    
    var colspan: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[CellValue] = js.undefined
  }
  object Colspan {
    
    inline def apply(): Colspan = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Colspan]
    }
    
    extension [Self <: Colspan](x: Self) {
      
      inline def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
      
      inline def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
      
      inline def setTitle(value: CellValue): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: CellValue
    
    var name: CellValue
  }
  object Id {
    
    inline def apply(id: CellValue, name: CellValue): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: CellValue): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: CellValue): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}

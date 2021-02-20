package typings.jexcel

import typings.jexcel.mod.CellValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Colspan extends StObject {
    
    var colspan: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[CellValue] = js.native
  }
  object Colspan {
    
    @scala.inline
    def apply(): Colspan = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Colspan]
    }
    
    @scala.inline
    implicit class ColspanMutableBuilder[Self <: Colspan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
      
      @scala.inline
      def setTitle(value: CellValue): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: CellValue = js.native
    
    var name: CellValue = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: CellValue, name: CellValue): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: CellValue): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: CellValue): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}

package typings.handsontable.mod.Handsontable

import typings.handsontable.anon.Bottom
import typings.handsontable.anon.From
import typings.handsontable.mod.Handsontable.wot.CellCoords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customBorders {
  
  @js.native
  trait BorderOptions extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var hide: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object BorderOptions {
    
    @scala.inline
    def apply(): BorderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BorderOptions]
    }
    
    @scala.inline
    implicit class BorderOptionsMutableBuilder[Self <: BorderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait BorderRange extends StObject {
    
    var range: From = js.native
  }
  object BorderRange {
    
    @scala.inline
    def apply(range: From): BorderRange = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[BorderRange]
    }
    
    @scala.inline
    implicit class BorderRangeMutableBuilder[Self <: BorderRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRange(value: From): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  type Settings = (CellCoords | BorderRange) with Bottom
}

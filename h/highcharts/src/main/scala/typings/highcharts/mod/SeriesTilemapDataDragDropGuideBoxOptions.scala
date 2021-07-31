package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesTilemapDataDragDropGuideBoxOptions extends StObject {
  
  /**
    * (Highcharts, Highmaps) Style options for the guide box default state.
    */
  var default: js.UndefOr[DragDropGuideBoxOptionsObject] = js.undefined
}
object SeriesTilemapDataDragDropGuideBoxOptions {
  
  @scala.inline
  def apply(): SeriesTilemapDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesTilemapDataDragDropGuideBoxOptions]
  }
  
  @scala.inline
  implicit class SeriesTilemapDataDragDropGuideBoxOptionsMutableBuilder[Self <: SeriesTilemapDataDragDropGuideBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: DragDropGuideBoxOptionsObject): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}

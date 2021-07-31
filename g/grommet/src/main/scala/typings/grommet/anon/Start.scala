package typings.grommet.anon

import typings.grommet.utilsMod.EdgeSizeType
import typings.grommet.utilsMod._EdgeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Start
  extends StObject
     with _EdgeType {
  
  var bottom: js.UndefOr[EdgeSizeType | String] = js.undefined
  
  var end: js.UndefOr[EdgeSizeType | String] = js.undefined
  
  var horizontal: js.UndefOr[EdgeSizeType | String] = js.undefined
  
  var left: js.UndefOr[EdgeSizeType | String] = js.undefined
  
  var right: js.UndefOr[EdgeSizeType | String] = js.undefined
  
  var start: js.UndefOr[EdgeSizeType | String] = js.undefined
  
  var top: js.UndefOr[EdgeSizeType | String] = js.undefined
  
  var vertical: js.UndefOr[EdgeSizeType | String] = js.undefined
}
object Start {
  
  @scala.inline
  def apply(): Start = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Start]
  }
  
  @scala.inline
  implicit class StartMutableBuilder[Self <: Start] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: EdgeSizeType | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setEnd(value: EdgeSizeType | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setHorizontal(value: EdgeSizeType | String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setLeft(value: EdgeSizeType | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: EdgeSizeType | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setStart(value: EdgeSizeType | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTop(value: EdgeSizeType | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setVertical(value: EdgeSizeType | String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}

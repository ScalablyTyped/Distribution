package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefsArrowOptions extends StObject {
  
  var children: js.UndefOr[js.Array[DefsOptions]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var markerHeight: js.UndefOr[Double] = js.native
  
  var markerWidth: js.UndefOr[Double] = js.native
  
  var refX: js.UndefOr[Double] = js.native
  
  var refY: js.UndefOr[Double] = js.native
  
  var render: js.UndefOr[Boolean] = js.native
  
  var tagName: js.UndefOr[String] = js.native
}
object DefsArrowOptions {
  
  @scala.inline
  def apply(): DefsArrowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefsArrowOptions]
  }
  
  @scala.inline
  implicit class DefsArrowOptionsMutableBuilder[Self <: DefsArrowOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[DefsOptions]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: DefsOptions*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMarkerHeight(value: Double): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerHeightUndefined: Self = StObject.set(x, "markerHeight", js.undefined)
    
    @scala.inline
    def setMarkerWidth(value: Double): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", js.undefined)
    
    @scala.inline
    def setRefX(value: Double): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefXUndefined: Self = StObject.set(x, "refX", js.undefined)
    
    @scala.inline
    def setRefY(value: Double): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefYUndefined: Self = StObject.set(x, "refY", js.undefined)
    
    @scala.inline
    def setRender(value: Boolean): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}

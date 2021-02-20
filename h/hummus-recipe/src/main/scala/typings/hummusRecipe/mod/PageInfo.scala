package typings.hummusRecipe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageInfo extends StObject {
  
  var height: Double = js.native
  
  var layout: String = js.native
  
  var mediaBox: js.Array[Double] = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var pageNumber: Double = js.native
  
  var rotate: Double = js.native
  
  var size: js.Array[Double] = js.native
  
  var width: Double = js.native
}
object PageInfo {
  
  @scala.inline
  def apply(
    height: Double,
    layout: String,
    mediaBox: js.Array[Double],
    offsetX: Double,
    offsetY: Double,
    pageNumber: Double,
    rotate: Double,
    size: js.Array[Double],
    width: Double
  ): PageInfo = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mediaBox = mediaBox.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
  
  @scala.inline
  implicit class PageInfoMutableBuilder[Self <: PageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaBox(value: js.Array[Double]): Self = StObject.set(x, "mediaBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaBoxVarargs(value: Double*): Self = StObject.set(x, "mediaBox", js.Array(value :_*))
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

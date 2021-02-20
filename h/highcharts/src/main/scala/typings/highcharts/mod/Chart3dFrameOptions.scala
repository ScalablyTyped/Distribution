package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart3dFrameOptions extends StObject {
  
  /**
    * (Highcharts) The back side of the frame around a 3D chart.
    */
  var back: js.UndefOr[Chart3dFrameBackOptions] = js.native
  
  /**
    * (Highcharts) The bottom of the frame around a 3D chart.
    */
  var bottom: js.UndefOr[Chart3dFrameBottomOptions] = js.native
  
  /**
    * (Highcharts) The front of the frame around a 3D chart.
    */
  var front: js.UndefOr[Chart3dFrameFrontOptions] = js.native
  
  /**
    * (Highcharts) The left side of the frame around a 3D chart.
    */
  var left: js.UndefOr[Chart3dFrameLeftOptions] = js.native
  
  /**
    * (Highcharts) The right of the frame around a 3D chart.
    */
  var right: js.UndefOr[Chart3dFrameRightOptions] = js.native
  
  /**
    * (Highcharts) General pixel thickness for the frame faces.
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The top of the frame around a 3D chart.
    */
  var top: js.UndefOr[Chart3dFrameTopOptions] = js.native
  
  /**
    * (Highcharts) Whether the frames are visible.
    */
  var visible: js.UndefOr[String] = js.native
}
object Chart3dFrameOptions {
  
  @scala.inline
  def apply(): Chart3dFrameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chart3dFrameOptions]
  }
  
  @scala.inline
  implicit class Chart3dFrameOptionsMutableBuilder[Self <: Chart3dFrameOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBack(value: Chart3dFrameBackOptions): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackUndefined: Self = StObject.set(x, "back", js.undefined)
    
    @scala.inline
    def setBottom(value: Chart3dFrameBottomOptions): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setFront(value: Chart3dFrameFrontOptions): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontUndefined: Self = StObject.set(x, "front", js.undefined)
    
    @scala.inline
    def setLeft(value: Chart3dFrameLeftOptions): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Chart3dFrameRightOptions): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTop(value: Chart3dFrameTopOptions): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

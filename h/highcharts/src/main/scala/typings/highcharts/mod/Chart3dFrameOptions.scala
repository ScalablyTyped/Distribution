package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chart3dFrameOptions extends StObject {
  
  /**
    * (Highcharts) The back side of the frame around a 3D chart.
    */
  var back: js.UndefOr[Chart3dFrameBackOptions] = js.undefined
  
  /**
    * (Highcharts) The bottom of the frame around a 3D chart.
    */
  var bottom: js.UndefOr[Chart3dFrameBottomOptions] = js.undefined
  
  /**
    * (Highcharts) The front of the frame around a 3D chart.
    */
  var front: js.UndefOr[Chart3dFrameFrontOptions] = js.undefined
  
  /**
    * (Highcharts) The left side of the frame around a 3D chart.
    */
  var left: js.UndefOr[Chart3dFrameLeftOptions] = js.undefined
  
  /**
    * (Highcharts) The right of the frame around a 3D chart.
    */
  var right: js.UndefOr[Chart3dFrameRightOptions] = js.undefined
  
  /**
    * (Highcharts) General pixel thickness for the frame faces.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) The top of the frame around a 3D chart.
    */
  var top: js.UndefOr[Chart3dFrameTopOptions] = js.undefined
  
  /**
    * (Highcharts) Whether the frames are visible.
    */
  var visible: js.UndefOr[String] = js.undefined
}
object Chart3dFrameOptions {
  
  inline def apply(): Chart3dFrameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chart3dFrameOptions]
  }
  
  extension [Self <: Chart3dFrameOptions](x: Self) {
    
    inline def setBack(value: Chart3dFrameBackOptions): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    inline def setBackUndefined: Self = StObject.set(x, "back", js.undefined)
    
    inline def setBottom(value: Chart3dFrameBottomOptions): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setFront(value: Chart3dFrameFrontOptions): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
    
    inline def setFrontUndefined: Self = StObject.set(x, "front", js.undefined)
    
    inline def setLeft(value: Chart3dFrameLeftOptions): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Chart3dFrameRightOptions): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTop(value: Chart3dFrameTopOptions): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

package typings.gorillaEngine.GorillaEngine.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaveformMarker extends StObject {
  
  var backgroundColor: String
  
  var canResize: Boolean
  
  var enabled: Boolean
  
  var leftHandleHeight: Double
  
  var leftHandleImage: String
  
  var leftHandleWidth: Double
  
  var rightHandleHeight: Double
  
  var rightHandleImage: String
  
  var rightHandleWidth: Double
  
  var x: Double
  
  var x2: Double
  
  var y: Double
  
  var y2: Double
}
object WaveformMarker {
  
  inline def apply(
    backgroundColor: String,
    canResize: Boolean,
    enabled: Boolean,
    leftHandleHeight: Double,
    leftHandleImage: String,
    leftHandleWidth: Double,
    rightHandleHeight: Double,
    rightHandleImage: String,
    rightHandleWidth: Double,
    x: Double,
    x2: Double,
    y: Double,
    y2: Double
  ): WaveformMarker = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], canResize = canResize.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], leftHandleHeight = leftHandleHeight.asInstanceOf[js.Any], leftHandleImage = leftHandleImage.asInstanceOf[js.Any], leftHandleWidth = leftHandleWidth.asInstanceOf[js.Any], rightHandleHeight = rightHandleHeight.asInstanceOf[js.Any], rightHandleImage = rightHandleImage.asInstanceOf[js.Any], rightHandleWidth = rightHandleWidth.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaveformMarker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaveformMarker] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setCanResize(value: Boolean): Self = StObject.set(x, "canResize", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setLeftHandleHeight(value: Double): Self = StObject.set(x, "leftHandleHeight", value.asInstanceOf[js.Any])
    
    inline def setLeftHandleImage(value: String): Self = StObject.set(x, "leftHandleImage", value.asInstanceOf[js.Any])
    
    inline def setLeftHandleWidth(value: Double): Self = StObject.set(x, "leftHandleWidth", value.asInstanceOf[js.Any])
    
    inline def setRightHandleHeight(value: Double): Self = StObject.set(x, "rightHandleHeight", value.asInstanceOf[js.Any])
    
    inline def setRightHandleImage(value: String): Self = StObject.set(x, "rightHandleImage", value.asInstanceOf[js.Any])
    
    inline def setRightHandleWidth(value: Double): Self = StObject.set(x, "rightHandleWidth", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}

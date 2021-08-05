package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentSegmentInterfaceMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCore.ionicCoreStrings.`icon-top`
    - typings.ionicCore.ionicCoreStrings.`icon-start`
    - typings.ionicCore.ionicCoreStrings.`icon-end`
    - typings.ionicCore.ionicCoreStrings.`icon-bottom`
    - typings.ionicCore.ionicCoreStrings.`icon-hide`
    - typings.ionicCore.ionicCoreStrings.`label-hide`
  */
  trait SegmentButtonLayout extends StObject
  object SegmentButtonLayout {
    
    inline def `icon-bottom`: typings.ionicCore.ionicCoreStrings.`icon-bottom` = "icon-bottom".asInstanceOf[typings.ionicCore.ionicCoreStrings.`icon-bottom`]
    
    inline def `icon-end`: typings.ionicCore.ionicCoreStrings.`icon-end` = "icon-end".asInstanceOf[typings.ionicCore.ionicCoreStrings.`icon-end`]
    
    inline def `icon-hide`: typings.ionicCore.ionicCoreStrings.`icon-hide` = "icon-hide".asInstanceOf[typings.ionicCore.ionicCoreStrings.`icon-hide`]
    
    inline def `icon-start`: typings.ionicCore.ionicCoreStrings.`icon-start` = "icon-start".asInstanceOf[typings.ionicCore.ionicCoreStrings.`icon-start`]
    
    inline def `icon-top`: typings.ionicCore.ionicCoreStrings.`icon-top` = "icon-top".asInstanceOf[typings.ionicCore.ionicCoreStrings.`icon-top`]
    
    inline def `label-hide`: typings.ionicCore.ionicCoreStrings.`label-hide` = "label-hide".asInstanceOf[typings.ionicCore.ionicCoreStrings.`label-hide`]
  }
  
  trait SegmentChangeEventDetail extends StObject {
    
    var value: js.UndefOr[String] = js.undefined
  }
  object SegmentChangeEventDetail {
    
    inline def apply(): SegmentChangeEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentChangeEventDetail]
    }
    
    extension [Self <: SegmentChangeEventDetail](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

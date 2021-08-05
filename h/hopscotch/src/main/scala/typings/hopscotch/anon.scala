package typings.hopscotch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CloseTooltip extends StObject {
    
    var closeTooltip: js.UndefOr[String] = js.undefined
    
    var doneBtn: js.UndefOr[String] = js.undefined
    
    var nextBtn: js.UndefOr[String] = js.undefined
    
    var prevBtn: js.UndefOr[String] = js.undefined
    
    var skipBtn: js.UndefOr[String] = js.undefined
    
    var stepNums: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CloseTooltip {
    
    inline def apply(): CloseTooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseTooltip]
    }
    
    extension [Self <: CloseTooltip](x: Self) {
      
      inline def setCloseTooltip(value: String): Self = StObject.set(x, "closeTooltip", value.asInstanceOf[js.Any])
      
      inline def setCloseTooltipUndefined: Self = StObject.set(x, "closeTooltip", js.undefined)
      
      inline def setDoneBtn(value: String): Self = StObject.set(x, "doneBtn", value.asInstanceOf[js.Any])
      
      inline def setDoneBtnUndefined: Self = StObject.set(x, "doneBtn", js.undefined)
      
      inline def setNextBtn(value: String): Self = StObject.set(x, "nextBtn", value.asInstanceOf[js.Any])
      
      inline def setNextBtnUndefined: Self = StObject.set(x, "nextBtn", js.undefined)
      
      inline def setPrevBtn(value: String): Self = StObject.set(x, "prevBtn", value.asInstanceOf[js.Any])
      
      inline def setPrevBtnUndefined: Self = StObject.set(x, "prevBtn", js.undefined)
      
      inline def setSkipBtn(value: String): Self = StObject.set(x, "skipBtn", value.asInstanceOf[js.Any])
      
      inline def setSkipBtnUndefined: Self = StObject.set(x, "skipBtn", js.undefined)
      
      inline def setStepNums(value: js.Array[String]): Self = StObject.set(x, "stepNums", value.asInstanceOf[js.Any])
      
      inline def setStepNumsUndefined: Self = StObject.set(x, "stepNums", js.undefined)
      
      inline def setStepNumsVarargs(value: String*): Self = StObject.set(x, "stepNums", js.Array(value :_*))
    }
  }
}

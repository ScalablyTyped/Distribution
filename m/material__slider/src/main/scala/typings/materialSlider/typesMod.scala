package typings.materialSlider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  sealed trait Thumb extends StObject
  @JSImport("@material/slider/types", "Thumb")
  @js.native
  object Thumb extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Thumb & Double] = js.native
    
    @js.native
    sealed trait END
      extends StObject
         with Thumb
    /* 2 */ val END: typings.materialSlider.typesMod.Thumb.END & Double = js.native
    
    @js.native
    sealed trait START
      extends StObject
         with Thumb
    /* 1 */ val START: typings.materialSlider.typesMod.Thumb.START & Double = js.native
  }
  
  @js.native
  sealed trait TickMark extends StObject
  @JSImport("@material/slider/types", "TickMark")
  @js.native
  object TickMark extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TickMark & Double] = js.native
    
    @js.native
    sealed trait ACTIVE
      extends StObject
         with TickMark
    /* 0 */ val ACTIVE: typings.materialSlider.typesMod.TickMark.ACTIVE & Double = js.native
    
    @js.native
    sealed trait INACTIVE
      extends StObject
         with TickMark
    /* 1 */ val INACTIVE: typings.materialSlider.typesMod.TickMark.INACTIVE & Double = js.native
  }
  
  trait MDCSliderChangeEventDetail extends StObject {
    
    var thumb: Thumb
    
    var value: Double
  }
  object MDCSliderChangeEventDetail {
    
    inline def apply(thumb: Thumb, value: Double): MDCSliderChangeEventDetail = {
      val __obj = js.Dynamic.literal(thumb = thumb.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCSliderChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCSliderChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setThumb(value: Thumb): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

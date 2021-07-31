package typings.materialTooltip

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait ShowTooltipOptions extends StObject {
    
    val hideFromScreenreader: Boolean
  }
  object ShowTooltipOptions {
    
    @scala.inline
    def apply(hideFromScreenreader: Boolean): ShowTooltipOptions = {
      val __obj = js.Dynamic.literal(hideFromScreenreader = hideFromScreenreader.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowTooltipOptions]
    }
    
    @scala.inline
    implicit class ShowTooltipOptionsMutableBuilder[Self <: ShowTooltipOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHideFromScreenreader(value: Boolean): Self = StObject.set(x, "hideFromScreenreader", value.asInstanceOf[js.Any])
    }
  }
}

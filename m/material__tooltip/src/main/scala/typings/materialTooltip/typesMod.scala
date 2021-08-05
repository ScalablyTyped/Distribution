package typings.materialTooltip

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait ShowTooltipOptions extends StObject {
    
    val hideFromScreenreader: Boolean
  }
  object ShowTooltipOptions {
    
    inline def apply(hideFromScreenreader: Boolean): ShowTooltipOptions = {
      val __obj = js.Dynamic.literal(hideFromScreenreader = hideFromScreenreader.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowTooltipOptions]
    }
    
    extension [Self <: ShowTooltipOptions](x: Self) {
      
      inline def setHideFromScreenreader(value: Boolean): Self = StObject.set(x, "hideFromScreenreader", value.asInstanceOf[js.Any])
    }
  }
}

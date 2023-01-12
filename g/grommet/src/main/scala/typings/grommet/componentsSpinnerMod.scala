package typings.grommet

import typings.grommet.anon.Start
import typings.grommet.componentsBoxMod.BoxProps
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.utilsMod.ColorType
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSpinnerMod {
  
  @JSImport("grommet/components/Spinner", "Spinner")
  @js.native
  val Spinner: FC[SpinnerExtendedProps] = js.native
  
  trait SpinnerExtendedProps
    extends StObject
       with BoxProps
       with SpinnerProps
  object SpinnerExtendedProps {
    
    inline def apply(): SpinnerExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinnerExtendedProps]
    }
  }
  
  trait SpinnerProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var color: js.UndefOr[ColorType] = js.undefined
    
    var message: js.UndefOr[String | Start] = js.undefined
    
    var size: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
  }
  object SpinnerProps {
    
    inline def apply(): SpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinnerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpinnerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setMessage(value: String | Start): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setSize(value: xsmall | small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}

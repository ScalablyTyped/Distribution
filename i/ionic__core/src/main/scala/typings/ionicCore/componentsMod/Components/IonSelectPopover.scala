package typings.ionicCore.componentsMod.Components

import typings.ionicCore.selectPopoverInterfaceMod.SelectPopoverOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonSelectPopover extends StObject {
  
  /**
    * Header text for the popover
    */
  var header: js.UndefOr[String] = js.undefined
  
  /**
    * Text for popover body
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Array of options for the popover
    */
  var options: js.Array[SelectPopoverOption]
  
  /**
    * Subheader text for the popover
    */
  var subHeader: js.UndefOr[String] = js.undefined
}
object IonSelectPopover {
  
  @scala.inline
  def apply(options: js.Array[SelectPopoverOption]): IonSelectPopover = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSelectPopover]
  }
  
  @scala.inline
  implicit class IonSelectPopoverMutableBuilder[Self <: IonSelectPopover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[SelectPopoverOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsVarargs(value: SelectPopoverOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setSubHeader(value: String): Self = StObject.set(x, "subHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubHeaderUndefined: Self = StObject.set(x, "subHeader", js.undefined)
  }
}

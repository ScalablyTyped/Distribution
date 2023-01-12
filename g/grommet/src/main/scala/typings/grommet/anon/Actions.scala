package typings.grommet.anon

import typings.grommet.componentsAnchorMod.AnchorProps
import typings.grommet.componentsBoxMod.BoxProps
import typings.grommet.componentsTextMod.TextProps
import typings.grommet.grommetStrings.column
import typings.grommet.grommetStrings.row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: js.UndefOr[AnchorProps] = js.undefined
  
  var close: js.UndefOr[ColorIcon] = js.undefined
  
  var container: js.UndefOr[BoxProps] = js.undefined
  
  var critical: js.UndefOr[Global] = js.undefined
  
  var direction: js.UndefOr[column | row] = js.undefined
  
  var global: js.UndefOr[ContainerDirection] = js.undefined
  
  var iconContainer: js.UndefOr[BoxProps] = js.undefined
  
  var info: js.UndefOr[Global] = js.undefined
  
  var message: js.UndefOr[TextProps] = js.undefined
  
  var normal: js.UndefOr[Global] = js.undefined
  
  var textContainer: js.UndefOr[BoxProps] = js.undefined
  
  var title: js.UndefOr[TextProps] = js.undefined
  
  var toast: js.UndefOr[Time] = js.undefined
  
  var undefined: js.UndefOr[Global] = js.undefined
  
  var unknown: js.UndefOr[Global] = js.undefined
  
  var warning: js.UndefOr[Global] = js.undefined
}
object Actions {
  
  inline def apply(): Actions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
    inline def setActions(value: AnchorProps): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setClose(value: ColorIcon): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setContainer(value: BoxProps): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCritical(value: Global): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setDirection(value: column | row): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setGlobal(value: ContainerDirection): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setIconContainer(value: BoxProps): Self = StObject.set(x, "iconContainer", value.asInstanceOf[js.Any])
    
    inline def setIconContainerUndefined: Self = StObject.set(x, "iconContainer", js.undefined)
    
    inline def setInfo(value: Global): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setMessage(value: TextProps): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNormal(value: Global): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    
    inline def setTextContainer(value: BoxProps): Self = StObject.set(x, "textContainer", value.asInstanceOf[js.Any])
    
    inline def setTextContainerUndefined: Self = StObject.set(x, "textContainer", js.undefined)
    
    inline def setTitle(value: TextProps): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setToast(value: Time): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
    
    inline def setToastUndefined: Self = StObject.set(x, "toast", js.undefined)
    
    inline def setUndefined(value: Global): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
    
    inline def setUndefinedUndefined: Self = StObject.set(x, "undefined", js.undefined)
    
    inline def setUnknown(value: Global): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    
    inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    
    inline def setWarning(value: Global): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}

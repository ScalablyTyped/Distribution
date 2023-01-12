package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Accordion/Accordion.AccordionClassKey>> */
trait PartialClassNameMapAccord extends StObject {
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var expanded: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var rounded: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapAccord {
  
  inline def apply(): PartialClassNameMapAccord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapAccord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialClassNameMapAccord] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExpanded(value: String): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setRounded(value: String): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
  }
}

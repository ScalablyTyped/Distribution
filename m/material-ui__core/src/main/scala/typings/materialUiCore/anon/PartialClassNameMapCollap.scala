package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Collapse/Collapse.CollapseClassKey>> */
trait PartialClassNameMapCollap extends StObject {
  
  var container: js.UndefOr[String] = js.undefined
  
  var entered: js.UndefOr[String] = js.undefined
  
  var wrapper: js.UndefOr[String] = js.undefined
  
  var wrapperInner: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapCollap {
  
  inline def apply(): PartialClassNameMapCollap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapCollap]
  }
  
  extension [Self <: PartialClassNameMapCollap](x: Self) {
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setEntered(value: String): Self = StObject.set(x, "entered", value.asInstanceOf[js.Any])
    
    inline def setEnteredUndefined: Self = StObject.set(x, "entered", js.undefined)
    
    inline def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperInner(value: String): Self = StObject.set(x, "wrapperInner", value.asInstanceOf[js.Any])
    
    inline def setWrapperInnerUndefined: Self = StObject.set(x, "wrapperInner", js.undefined)
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}

package typings.materialUiLab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/TimelineOppositeContent/TimelineOppositeContent.TimelineOppositeContentClassKey>> */
trait PartialClassNameMapTimeliAlignRight extends StObject {
  
  var alignRight: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapTimeliAlignRight {
  
  inline def apply(): PartialClassNameMapTimeliAlignRight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTimeliAlignRight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialClassNameMapTimeliAlignRight] (val x: Self) extends AnyVal {
    
    inline def setAlignRight(value: String): Self = StObject.set(x, "alignRight", value.asInstanceOf[js.Any])
    
    inline def setAlignRightUndefined: Self = StObject.set(x, "alignRight", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

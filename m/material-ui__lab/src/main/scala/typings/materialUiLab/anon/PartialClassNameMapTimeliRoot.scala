package typings.materialUiLab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/TimelineSeparator/TimelineSeparator.TimelineSeparatorClassKey>> */
trait PartialClassNameMapTimeliRoot extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapTimeliRoot {
  
  inline def apply(): PartialClassNameMapTimeliRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTimeliRoot]
  }
  
  extension [Self <: PartialClassNameMapTimeliRoot](x: Self) {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

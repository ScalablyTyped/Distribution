package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/BottomNavigation/BottomNavigation.BottomNavigationClassKey>> */
trait PartialClassNameMapBottom extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapBottom {
  
  inline def apply(): PartialClassNameMapBottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapBottom]
  }
  
  extension [Self <: PartialClassNameMapBottom](x: Self) {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

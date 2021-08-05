package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/CardContent/CardContent.CardContentClassKey>> */
trait PartialClassNameMapCardCo extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapCardCo {
  
  inline def apply(): PartialClassNameMapCardCo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapCardCo]
  }
  
  extension [Self <: PartialClassNameMapCardCo](x: Self) {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

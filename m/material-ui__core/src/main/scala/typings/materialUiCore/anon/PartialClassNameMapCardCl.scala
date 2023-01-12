package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Card/Card.CardClassKey>> */
trait PartialClassNameMapCardCl extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapCardCl {
  
  inline def apply(): PartialClassNameMapCardCl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapCardCl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialClassNameMapCardCl] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

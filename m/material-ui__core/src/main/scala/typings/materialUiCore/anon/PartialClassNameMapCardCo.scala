package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/CardContent/CardContent.CardContentClassKey>> */
trait PartialClassNameMapCardCo extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapCardCo {
  
  @scala.inline
  def apply(): PartialClassNameMapCardCo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapCardCo]
  }
  
  @scala.inline
  implicit class PartialClassNameMapCardCoMutableBuilder[Self <: PartialClassNameMapCardCo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

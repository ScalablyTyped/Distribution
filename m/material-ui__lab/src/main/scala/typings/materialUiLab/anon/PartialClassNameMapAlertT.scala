package typings.materialUiLab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/AlertTitle/AlertTitle.AlertTitleClassKey>> */
trait PartialClassNameMapAlertT extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapAlertT {
  
  @scala.inline
  def apply(): PartialClassNameMapAlertT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapAlertT]
  }
  
  @scala.inline
  implicit class PartialClassNameMapAlertTMutableBuilder[Self <: PartialClassNameMapAlertT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

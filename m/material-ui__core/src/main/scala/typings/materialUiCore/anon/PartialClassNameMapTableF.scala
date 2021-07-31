package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/TableFooter/TableFooter.TableFooterClassKey>> */
trait PartialClassNameMapTableF extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialClassNameMapTableF {
  
  @scala.inline
  def apply(): PartialClassNameMapTableF = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTableF]
  }
  
  @scala.inline
  implicit class PartialClassNameMapTableFMutableBuilder[Self <: PartialClassNameMapTableF] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

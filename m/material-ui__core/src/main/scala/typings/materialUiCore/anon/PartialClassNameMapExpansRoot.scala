package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ExpansionPanelDetails/ExpansionPanelDetails.ExpansionPanelDetailsClassKey>> */
@js.native
trait PartialClassNameMapExpansRoot extends StObject {
  
  var root: js.UndefOr[String] = js.native
}
object PartialClassNameMapExpansRoot {
  
  @scala.inline
  def apply(): PartialClassNameMapExpansRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapExpansRoot]
  }
  
  @scala.inline
  implicit class PartialClassNameMapExpansRootMutableBuilder[Self <: PartialClassNameMapExpansRoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

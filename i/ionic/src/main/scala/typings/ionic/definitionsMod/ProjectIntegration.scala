package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectIntegration extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object ProjectIntegration {
  
  @scala.inline
  def apply(): ProjectIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectIntegration]
  }
  
  @scala.inline
  implicit class ProjectIntegrationMutableBuilder[Self <: ProjectIntegration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}

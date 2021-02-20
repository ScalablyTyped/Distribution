package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegrationAddDetails extends StObject {
  
  var enableArgs: js.UndefOr[js.Array[String]] = js.native
  
  var env: IonicEnvironment = js.native
  
  var quiet: js.UndefOr[Boolean] = js.native
  
  var root: String = js.native
}
object IntegrationAddDetails {
  
  @scala.inline
  def apply(env: IonicEnvironment, root: String): IntegrationAddDetails = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationAddDetails]
  }
  
  @scala.inline
  implicit class IntegrationAddDetailsMutableBuilder[Self <: IntegrationAddDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableArgs(value: js.Array[String]): Self = StObject.set(x, "enableArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableArgsUndefined: Self = StObject.set(x, "enableArgs", js.undefined)
    
    @scala.inline
    def setEnableArgsVarargs(value: String*): Self = StObject.set(x, "enableArgs", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: IonicEnvironment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}

package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerMethodConfigurationObject extends StObject {
  
  /**
    * the method function.
    */
  def method(args: js.Any*): js.Any = js.native
  /**
    * the method function.
    */
  @JSName("method")
  var method_Original: ServerMethod = js.native
  
  /**
    * the method name.
    */
  var name: String = js.native
  
  /**
    * (optional) settings.
    */
  var options: js.UndefOr[ServerMethodOptions] = js.native
}

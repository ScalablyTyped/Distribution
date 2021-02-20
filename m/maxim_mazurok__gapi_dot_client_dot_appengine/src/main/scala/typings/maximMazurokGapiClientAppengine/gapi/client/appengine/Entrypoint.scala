package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entrypoint extends StObject {
  
  /** The format should be a shell command that can be fed to bash -c. */
  var shell: js.UndefOr[String] = js.native
}
object Entrypoint {
  
  @scala.inline
  def apply(): Entrypoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entrypoint]
  }
  
  @scala.inline
  implicit class EntrypointMutableBuilder[Self <: Entrypoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
  }
}

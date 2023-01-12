package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entrypoint extends StObject {
  
  /** The format should be a shell command that can be fed to bash -c. */
  var shell: js.UndefOr[String] = js.undefined
}
object Entrypoint {
  
  inline def apply(): Entrypoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entrypoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Entrypoint] (val x: Self) extends AnyVal {
    
    inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
  }
}

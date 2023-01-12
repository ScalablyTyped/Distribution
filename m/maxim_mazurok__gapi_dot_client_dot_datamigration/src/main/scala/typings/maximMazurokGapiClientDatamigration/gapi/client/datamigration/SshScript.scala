package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SshScript extends StObject {
  
  /** The ssh configuration script. */
  var script: js.UndefOr[String] = js.undefined
}
object SshScript {
  
  inline def apply(): SshScript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SshScript]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SshScript] (val x: Self) extends AnyVal {
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}

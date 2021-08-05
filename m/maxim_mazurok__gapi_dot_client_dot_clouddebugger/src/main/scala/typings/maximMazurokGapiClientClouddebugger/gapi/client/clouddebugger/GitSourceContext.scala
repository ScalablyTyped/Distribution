package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitSourceContext extends StObject {
  
  /** Git commit hash. required. */
  var revisionId: js.UndefOr[String] = js.undefined
  
  /** Git repository URL. */
  var url: js.UndefOr[String] = js.undefined
}
object GitSourceContext {
  
  inline def apply(): GitSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitSourceContext]
  }
  
  extension [Self <: GitSourceContext](x: Self) {
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

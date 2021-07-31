package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitSourceContext extends StObject {
  
  /** Git commit hash. */
  var revisionId: js.UndefOr[String] = js.undefined
  
  /** Git repository URL. */
  var url: js.UndefOr[String] = js.undefined
}
object GitSourceContext {
  
  @scala.inline
  def apply(): GitSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitSourceContext]
  }
  
  @scala.inline
  implicit class GitSourceContextMutableBuilder[Self <: GitSourceContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

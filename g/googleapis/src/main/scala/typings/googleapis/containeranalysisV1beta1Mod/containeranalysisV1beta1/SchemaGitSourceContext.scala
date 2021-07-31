package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A GitSourceContext denotes a particular revision in a third party Git
  * repository (e.g., GitHub).
  */
trait SchemaGitSourceContext extends StObject {
  
  /**
    * Git commit hash.
    */
  var revisionId: js.UndefOr[String] = js.undefined
  
  /**
    * Git repository URL.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaGitSourceContext {
  
  @scala.inline
  def apply(): SchemaGitSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGitSourceContext]
  }
  
  @scala.inline
  implicit class SchemaGitSourceContextMutableBuilder[Self <: SchemaGitSourceContext] (val x: Self) extends AnyVal {
    
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

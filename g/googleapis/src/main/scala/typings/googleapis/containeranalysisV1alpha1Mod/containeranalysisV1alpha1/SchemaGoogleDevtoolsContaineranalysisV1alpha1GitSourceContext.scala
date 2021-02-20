package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A GitSourceContext denotes a particular revision in a third party Git
  * repository (e.g., GitHub).
  */
@js.native
trait SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext extends StObject {
  
  /**
    * Required. Git commit hash.
    */
  var revisionId: js.UndefOr[String] = js.native
  
  /**
    * Git repository URL.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContextMutableBuilder[Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext] (val x: Self) extends AnyVal {
    
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

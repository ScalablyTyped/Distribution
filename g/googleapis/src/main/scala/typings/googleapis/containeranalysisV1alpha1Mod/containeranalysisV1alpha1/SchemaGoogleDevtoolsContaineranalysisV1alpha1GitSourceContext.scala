package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext extends StObject {
  
  /**
    * Required. Git commit hash.
    */
  var revisionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Git repository URL.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext {
  
  inline def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext]
  }
  
  extension [Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1GitSourceContext](x: Self) {
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdNull: Self = StObject.set(x, "revisionId", null)
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

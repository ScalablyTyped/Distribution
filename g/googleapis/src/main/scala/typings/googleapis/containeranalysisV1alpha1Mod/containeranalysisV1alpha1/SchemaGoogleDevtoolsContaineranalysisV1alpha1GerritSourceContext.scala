package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext extends StObject {
  
  /**
    * An alias, which may be a branch or tag.
    */
  var aliasContext: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext] = js.undefined
  
  /**
    * The full project name within the host. Projects may be nested, so "project/subproject" is a valid project name. The "repo name" is the hostURI/project.
    */
  var gerritProject: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI of a running Gerrit instance.
    */
  var hostUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A revision (commit) ID.
    */
  var revisionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext {
  
  inline def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext]
  }
  
  extension [Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1GerritSourceContext](x: Self) {
    
    inline def setAliasContext(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext): Self = StObject.set(x, "aliasContext", value.asInstanceOf[js.Any])
    
    inline def setAliasContextUndefined: Self = StObject.set(x, "aliasContext", js.undefined)
    
    inline def setGerritProject(value: String): Self = StObject.set(x, "gerritProject", value.asInstanceOf[js.Any])
    
    inline def setGerritProjectNull: Self = StObject.set(x, "gerritProject", null)
    
    inline def setGerritProjectUndefined: Self = StObject.set(x, "gerritProject", js.undefined)
    
    inline def setHostUri(value: String): Self = StObject.set(x, "hostUri", value.asInstanceOf[js.Any])
    
    inline def setHostUriNull: Self = StObject.set(x, "hostUri", null)
    
    inline def setHostUriUndefined: Self = StObject.set(x, "hostUri", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdNull: Self = StObject.set(x, "revisionId", null)
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}

package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGerritSourceContext extends StObject {
  
  /**
    * An alias, which may be a branch or tag.
    */
  var aliasContext: js.UndefOr[SchemaAliasContext] = js.undefined
  
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
object SchemaGerritSourceContext {
  
  inline def apply(): SchemaGerritSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGerritSourceContext]
  }
  
  extension [Self <: SchemaGerritSourceContext](x: Self) {
    
    inline def setAliasContext(value: SchemaAliasContext): Self = StObject.set(x, "aliasContext", value.asInstanceOf[js.Any])
    
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

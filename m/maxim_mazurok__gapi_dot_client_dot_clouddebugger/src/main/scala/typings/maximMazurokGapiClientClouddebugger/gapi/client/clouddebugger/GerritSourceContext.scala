package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GerritSourceContext extends StObject {
  
  /** An alias, which may be a branch or tag. */
  var aliasContext: js.UndefOr[AliasContext] = js.undefined
  
  /** The name of an alias (branch, tag, etc.). */
  var aliasName: js.UndefOr[String] = js.undefined
  
  /** The full project name within the host. Projects may be nested, so "project/subproject" is a valid project name. The "repo name" is hostURI/project. */
  var gerritProject: js.UndefOr[String] = js.undefined
  
  /** The URI of a running Gerrit instance. */
  var hostUri: js.UndefOr[String] = js.undefined
  
  /** A revision (commit) ID. */
  var revisionId: js.UndefOr[String] = js.undefined
}
object GerritSourceContext {
  
  inline def apply(): GerritSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GerritSourceContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GerritSourceContext] (val x: Self) extends AnyVal {
    
    inline def setAliasContext(value: AliasContext): Self = StObject.set(x, "aliasContext", value.asInstanceOf[js.Any])
    
    inline def setAliasContextUndefined: Self = StObject.set(x, "aliasContext", js.undefined)
    
    inline def setAliasName(value: String): Self = StObject.set(x, "aliasName", value.asInstanceOf[js.Any])
    
    inline def setAliasNameUndefined: Self = StObject.set(x, "aliasName", js.undefined)
    
    inline def setGerritProject(value: String): Self = StObject.set(x, "gerritProject", value.asInstanceOf[js.Any])
    
    inline def setGerritProjectUndefined: Self = StObject.set(x, "gerritProject", js.undefined)
    
    inline def setHostUri(value: String): Self = StObject.set(x, "hostUri", value.asInstanceOf[js.Any])
    
    inline def setHostUriUndefined: Self = StObject.set(x, "hostUri", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}

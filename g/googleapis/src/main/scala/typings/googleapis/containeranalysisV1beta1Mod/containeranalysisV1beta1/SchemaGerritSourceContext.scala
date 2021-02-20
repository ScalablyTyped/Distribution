package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A SourceContext referring to a Gerrit project.
  */
@js.native
trait SchemaGerritSourceContext extends StObject {
  
  /**
    * An alias, which may be a branch or tag.
    */
  var aliasContext: js.UndefOr[SchemaAliasContext] = js.native
  
  /**
    * The full project name within the host. Projects may be nested, so
    * &quot;project/subproject&quot; is a valid project name. The &quot;repo
    * name&quot; is the hostURI/project.
    */
  var gerritProject: js.UndefOr[String] = js.native
  
  /**
    * The URI of a running Gerrit instance.
    */
  var hostUri: js.UndefOr[String] = js.native
  
  /**
    * A revision (commit) ID.
    */
  var revisionId: js.UndefOr[String] = js.native
}
object SchemaGerritSourceContext {
  
  @scala.inline
  def apply(): SchemaGerritSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGerritSourceContext]
  }
  
  @scala.inline
  implicit class SchemaGerritSourceContextMutableBuilder[Self <: SchemaGerritSourceContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasContext(value: SchemaAliasContext): Self = StObject.set(x, "aliasContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasContextUndefined: Self = StObject.set(x, "aliasContext", js.undefined)
    
    @scala.inline
    def setGerritProject(value: String): Self = StObject.set(x, "gerritProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGerritProjectUndefined: Self = StObject.set(x, "gerritProject", js.undefined)
    
    @scala.inline
    def setHostUri(value: String): Self = StObject.set(x, "hostUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUriUndefined: Self = StObject.set(x, "hostUri", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}

package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A CloudRepoSourceContext denotes a particular revision in a Google Cloud
  * Source Repo.
  */
@js.native
trait SchemaCloudRepoSourceContext extends StObject {
  
  /**
    * An alias, which may be a branch or tag.
    */
  var aliasContext: js.UndefOr[SchemaAliasContext] = js.native
  
  /**
    * The ID of the repo.
    */
  var repoId: js.UndefOr[SchemaRepoId] = js.native
  
  /**
    * A revision ID.
    */
  var revisionId: js.UndefOr[String] = js.native
}
object SchemaCloudRepoSourceContext {
  
  @scala.inline
  def apply(): SchemaCloudRepoSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudRepoSourceContext]
  }
  
  @scala.inline
  implicit class SchemaCloudRepoSourceContextMutableBuilder[Self <: SchemaCloudRepoSourceContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasContext(value: SchemaAliasContext): Self = StObject.set(x, "aliasContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasContextUndefined: Self = StObject.set(x, "aliasContext", js.undefined)
    
    @scala.inline
    def setRepoId(value: SchemaRepoId): Self = StObject.set(x, "repoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoIdUndefined: Self = StObject.set(x, "repoId", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}

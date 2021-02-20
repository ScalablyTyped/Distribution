package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A CloudRepoSourceContext denotes a particular revision in a Google Cloud
  * Source Repo.
  */
@js.native
trait SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext extends StObject {
  
  /**
    * An alias, which may be a branch or tag.
    */
  var aliasContext: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext] = js.native
  
  /**
    * The ID of the repo.
    */
  var repoId: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId] = js.native
  
  /**
    * A revision ID.
    */
  var revisionId: js.UndefOr[String] = js.native
}
object SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextMutableBuilder[Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasContext(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext): Self = StObject.set(x, "aliasContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasContextUndefined: Self = StObject.set(x, "aliasContext", js.undefined)
    
    @scala.inline
    def setRepoId(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId): Self = StObject.set(x, "repoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoIdUndefined: Self = StObject.set(x, "repoId", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}

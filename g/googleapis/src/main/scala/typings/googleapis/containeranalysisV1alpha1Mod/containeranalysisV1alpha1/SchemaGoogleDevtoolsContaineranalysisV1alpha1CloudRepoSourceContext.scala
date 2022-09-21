package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext extends StObject {
  
  /**
    * An alias, which may be a branch or tag.
    */
  var aliasContext: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext] = js.undefined
  
  /**
    * The ID of the repo.
    */
  var repoId: js.UndefOr[SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId] = js.undefined
  
  /**
    * A revision ID.
    */
  var revisionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext {
  
  inline def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext]
  }
  
  extension [Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContext](x: Self) {
    
    inline def setAliasContext(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1AliasContext): Self = StObject.set(x, "aliasContext", value.asInstanceOf[js.Any])
    
    inline def setAliasContextUndefined: Self = StObject.set(x, "aliasContext", js.undefined)
    
    inline def setRepoId(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1RepoId): Self = StObject.set(x, "repoId", value.asInstanceOf[js.Any])
    
    inline def setRepoIdUndefined: Self = StObject.set(x, "repoId", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdNull: Self = StObject.set(x, "revisionId", null)
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}

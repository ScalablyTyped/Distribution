package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A unique identifier for a Cloud Repo.
  */
trait SchemaRepoId extends StObject {
  
  /**
    * A combination of a project ID and a repo name.
    */
  var projectRepoId: js.UndefOr[SchemaProjectRepoId] = js.undefined
  
  /**
    * A server-assigned, globally unique identifier.
    */
  var uid: js.UndefOr[String] = js.undefined
}
object SchemaRepoId {
  
  @scala.inline
  def apply(): SchemaRepoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepoId]
  }
  
  @scala.inline
  implicit class SchemaRepoIdMutableBuilder[Self <: SchemaRepoId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectRepoId(value: SchemaProjectRepoId): Self = StObject.set(x, "projectRepoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectRepoIdUndefined: Self = StObject.set(x, "projectRepoId", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}

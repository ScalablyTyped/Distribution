package typings.ipfsCli.anon

import typings.bignumberJs.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoPath extends StObject {
  
  var numObjects: default
  
  var repoPath: js.Any
  
  var repoSize: default
  
  var storageMax: default
  
  var version: js.Any
}
object RepoPath {
  
  @scala.inline
  def apply(numObjects: default, repoPath: js.Any, repoSize: default, storageMax: default, version: js.Any): RepoPath = {
    val __obj = js.Dynamic.literal(numObjects = numObjects.asInstanceOf[js.Any], repoPath = repoPath.asInstanceOf[js.Any], repoSize = repoSize.asInstanceOf[js.Any], storageMax = storageMax.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoPath]
  }
  
  @scala.inline
  implicit class RepoPathMutableBuilder[Self <: RepoPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumObjects(value: default): Self = StObject.set(x, "numObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoPath(value: js.Any): Self = StObject.set(x, "repoPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoSize(value: default): Self = StObject.set(x, "repoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageMax(value: default): Self = StObject.set(x, "storageMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: js.Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

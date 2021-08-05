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
  
  inline def apply(numObjects: default, repoPath: js.Any, repoSize: default, storageMax: default, version: js.Any): RepoPath = {
    val __obj = js.Dynamic.literal(numObjects = numObjects.asInstanceOf[js.Any], repoPath = repoPath.asInstanceOf[js.Any], repoSize = repoSize.asInstanceOf[js.Any], storageMax = storageMax.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoPath]
  }
  
  extension [Self <: RepoPath](x: Self) {
    
    inline def setNumObjects(value: default): Self = StObject.set(x, "numObjects", value.asInstanceOf[js.Any])
    
    inline def setRepoPath(value: js.Any): Self = StObject.set(x, "repoPath", value.asInstanceOf[js.Any])
    
    inline def setRepoSize(value: default): Self = StObject.set(x, "repoSize", value.asInstanceOf[js.Any])
    
    inline def setStorageMax(value: default): Self = StObject.set(x, "storageMax", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: js.Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

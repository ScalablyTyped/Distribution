package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumObjects extends StObject {
  
  var numObjects: js.Any
  
  var repoPath: js.Any
  
  var repoSize: js.Any
  
  var storageMax: js.Any
  
  var version: js.Any
}
object NumObjects {
  
  @scala.inline
  def apply(numObjects: js.Any, repoPath: js.Any, repoSize: js.Any, storageMax: js.Any, version: js.Any): NumObjects = {
    val __obj = js.Dynamic.literal(numObjects = numObjects.asInstanceOf[js.Any], repoPath = repoPath.asInstanceOf[js.Any], repoSize = repoSize.asInstanceOf[js.Any], storageMax = storageMax.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumObjects]
  }
  
  @scala.inline
  implicit class NumObjectsMutableBuilder[Self <: NumObjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumObjects(value: js.Any): Self = StObject.set(x, "numObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoPath(value: js.Any): Self = StObject.set(x, "repoPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoSize(value: js.Any): Self = StObject.set(x, "repoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageMax(value: js.Any): Self = StObject.set(x, "storageMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: js.Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

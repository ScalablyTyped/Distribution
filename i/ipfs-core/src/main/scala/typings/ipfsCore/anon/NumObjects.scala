package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumObjects extends js.Object {
  
  var numObjects: js.Any = js.native
  
  var repoPath: js.Any = js.native
  
  var repoSize: js.Any = js.native
  
  var storageMax: js.Any = js.native
  
  var version: js.Any = js.native
}
object NumObjects {
  
  @scala.inline
  def apply(numObjects: js.Any, repoPath: js.Any, repoSize: js.Any, storageMax: js.Any, version: js.Any): NumObjects = {
    val __obj = js.Dynamic.literal(numObjects = numObjects.asInstanceOf[js.Any], repoPath = repoPath.asInstanceOf[js.Any], repoSize = repoSize.asInstanceOf[js.Any], storageMax = storageMax.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumObjects]
  }
  
  @scala.inline
  implicit class NumObjectsOps[Self <: NumObjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNumObjects(value: js.Any): Self = this.set("numObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoPath(value: js.Any): Self = this.set("repoPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepoSize(value: js.Any): Self = this.set("repoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageMax(value: js.Any): Self = this.set("storageMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: js.Any): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}

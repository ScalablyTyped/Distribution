package typings.ionicUtilsFs.mod

import typings.ionicUtilsFs.ionicUtilsFsStrings.directory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryNode extends FileNode {
  
  var children: js.Array[FileNode] = js.native
  
  var parent: js.UndefOr[FileNode] = js.native
  
  var path: String = js.native
  
  var `type`: directory = js.native
}
object DirectoryNode {
  
  @scala.inline
  def apply(children: js.Array[FileNode], path: String, `type`: directory): DirectoryNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryNode]
  }
  
  @scala.inline
  implicit class DirectoryNodeOps[Self <: DirectoryNode] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: FileNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[FileNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: directory): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: FileNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}

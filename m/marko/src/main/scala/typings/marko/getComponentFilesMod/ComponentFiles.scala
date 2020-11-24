package typings.marko.getComponentFilesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentFiles extends js.Object {
  
  @JSName("package")
  var _package: String | Null = js.native
  
  var browserFile: String | Null = js.native
  
  var file: String | Null = js.native
  
  var styles: js.Array[String] = js.native
}
object ComponentFiles {
  
  @scala.inline
  def apply(styles: js.Array[String]): ComponentFiles = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentFiles]
  }
  
  @scala.inline
  implicit class ComponentFilesOps[Self <: ComponentFiles] (val x: Self) extends AnyVal {
    
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
    def setStylesVarargs(value: String*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[String]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_packageNull: Self = this.set("package", null)
    
    @scala.inline
    def setBrowserFile(value: String): Self = this.set("browserFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserFileNull: Self = this.set("browserFile", null)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNull: Self = this.set("file", null)
  }
}

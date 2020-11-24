package typings.grunt.grunt.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link http://gruntjs.com/configuring-tasks#files-array-format}
  */
@js.native
trait IFileMap extends js.Object {
  
  /**
    * destination filename.
    */
  var dest: String = js.native
  
  /**
    * source filenames.
    */
  var src: js.Array[String] = js.native
}
object IFileMap {
  
  @scala.inline
  def apply(dest: String, src: js.Array[String]): IFileMap = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileMap]
  }
  
  @scala.inline
  implicit class IFileMapOps[Self <: IFileMap] (val x: Self) extends AnyVal {
    
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
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcVarargs(value: String*): Self = this.set("src", js.Array(value :_*))
    
    @scala.inline
    def setSrc(value: js.Array[String]): Self = this.set("src", value.asInstanceOf[js.Any])
  }
}

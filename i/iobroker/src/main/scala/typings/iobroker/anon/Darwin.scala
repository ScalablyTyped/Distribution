package typings.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Darwin extends js.Object {
  
  /** For OSX */
  var darwin: js.Array[String] = js.native
  
  /** For Linux */
  var linux: js.Array[String] = js.native
  
  /** For Windows */
  var win32: js.Array[String] = js.native
}
object Darwin {
  
  @scala.inline
  def apply(darwin: js.Array[String], linux: js.Array[String], win32: js.Array[String]): Darwin = {
    val __obj = js.Dynamic.literal(darwin = darwin.asInstanceOf[js.Any], linux = linux.asInstanceOf[js.Any], win32 = win32.asInstanceOf[js.Any])
    __obj.asInstanceOf[Darwin]
  }
  
  @scala.inline
  implicit class DarwinOps[Self <: Darwin] (val x: Self) extends AnyVal {
    
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
    def setDarwinVarargs(value: String*): Self = this.set("darwin", js.Array(value :_*))
    
    @scala.inline
    def setDarwin(value: js.Array[String]): Self = this.set("darwin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinuxVarargs(value: String*): Self = this.set("linux", js.Array(value :_*))
    
    @scala.inline
    def setLinux(value: js.Array[String]): Self = this.set("linux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWin32Varargs(value: String*): Self = this.set("win32", js.Array(value :_*))
    
    @scala.inline
    def setWin32(value: js.Array[String]): Self = this.set("win32", value.asInstanceOf[js.Any])
  }
}

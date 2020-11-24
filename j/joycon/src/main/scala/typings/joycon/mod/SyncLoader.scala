package typings.joycon.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncLoader extends js.Object {
  
  def loadSync(filepath: String): js.Any = js.native
  
  /** Optional loader name */
  var name: js.UndefOr[String] = js.native
  
  var test: RegExp = js.native
}
object SyncLoader {
  
  @scala.inline
  def apply(loadSync: String => js.Any, test: RegExp): SyncLoader = {
    val __obj = js.Dynamic.literal(loadSync = js.Any.fromFunction1(loadSync), test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncLoader]
  }
  
  @scala.inline
  implicit class SyncLoaderOps[Self <: SyncLoader] (val x: Self) extends AnyVal {
    
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
    def setLoadSync(value: String => js.Any): Self = this.set("loadSync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTest(value: RegExp): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}

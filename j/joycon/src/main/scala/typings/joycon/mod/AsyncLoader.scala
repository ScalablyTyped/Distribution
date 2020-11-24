package typings.joycon.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncLoader extends js.Object {
  
  def load(filepath: String): js.Promise[_] = js.native
  
  /** Optional loader name */
  var name: js.UndefOr[String] = js.native
  
  var test: RegExp = js.native
}
object AsyncLoader {
  
  @scala.inline
  def apply(load: String => js.Promise[_], test: RegExp): AsyncLoader = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncLoader]
  }
  
  @scala.inline
  implicit class AsyncLoaderOps[Self <: AsyncLoader] (val x: Self) extends AnyVal {
    
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
    def setLoad(value: String => js.Promise[_]): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTest(value: RegExp): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}

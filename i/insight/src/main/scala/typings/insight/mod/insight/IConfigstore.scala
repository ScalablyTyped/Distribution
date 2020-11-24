package typings.insight.mod.insight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConfigstore extends js.Object {
  
  var all: js.Any = js.native
  
  def del(key: String): Unit = js.native
  
  def get(key: String): js.Any = js.native
  
  var path: String = js.native
  
  def set(key: String, `val`: js.Any): Unit = js.native
}
object IConfigstore {
  
  @scala.inline
  def apply(
    all: js.Any,
    del: String => Unit,
    get: String => js.Any,
    path: String,
    set: (String, js.Any) => Unit
  ): IConfigstore = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), path = path.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[IConfigstore]
  }
  
  @scala.inline
  implicit class IConfigstoreOps[Self <: IConfigstore] (val x: Self) extends AnyVal {
    
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
    def setAll(value: js.Any): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDel(value: String => Unit): Self = this.set("del", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: (String, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
}

package typings.jsreportCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerCollection extends js.Object {
  
  def add(
    `type`: String,
    callback: js.Function3[
      /* req */ Request, 
      /* res */ Response, 
      /* err */ js.UndefOr[js.Any], 
      js.Promise[_] | Unit
    ]
  ): Unit = js.native
}
object ListenerCollection {
  
  @scala.inline
  def apply(
    add: (String, js.Function3[
      /* req */ Request, 
      /* res */ Response, 
      /* err */ js.UndefOr[js.Any], 
      js.Promise[_] | Unit
    ]) => Unit
  ): ListenerCollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add))
    __obj.asInstanceOf[ListenerCollection]
  }
  
  @scala.inline
  implicit class ListenerCollectionOps[Self <: ListenerCollection] (val x: Self) extends AnyVal {
    
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
    def setAdd(
      value: (String, js.Function3[
          /* req */ Request, 
          /* res */ Response, 
          /* err */ js.UndefOr[js.Any], 
          js.Promise[_] | Unit
        ]) => Unit
    ): Self = this.set("add", js.Any.fromFunction2(value))
  }
}

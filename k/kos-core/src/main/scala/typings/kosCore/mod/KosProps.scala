package typings.kosCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KosProps[T] extends js.Object {
  
  var dispatch: js.UndefOr[js.Function1[/* action */ Action[T], Unit]] = js.native
  
  var getNamespace: js.UndefOr[js.Function0[String]] = js.native
  
  var getParam: js.UndefOr[js.Function0[_]] = js.native
}
object KosProps {
  
  @scala.inline
  def apply[T](): KosProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KosProps[T]]
  }
  
  @scala.inline
  implicit class KosPropsOps[Self <: KosProps[_], T] (val x: Self with KosProps[T]) extends AnyVal {
    
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
    def setDispatch(value: /* action */ Action[T] => Unit): Self = this.set("dispatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDispatch: Self = this.set("dispatch", js.undefined)
    
    @scala.inline
    def setGetNamespace(value: () => String): Self = this.set("getNamespace", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetNamespace: Self = this.set("getNamespace", js.undefined)
    
    @scala.inline
    def setGetParam(value: () => _): Self = this.set("getParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetParam: Self = this.set("getParam", js.undefined)
  }
}

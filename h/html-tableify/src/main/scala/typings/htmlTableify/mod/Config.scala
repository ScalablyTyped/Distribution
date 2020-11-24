package typings.htmlTableify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Table config object for data with keys `T`. */
@js.native
trait Config[T] extends js.Object {
  
  var headers: js.UndefOr[js.Array[Header[T]]] = js.native
  
  /** Tidy the output HTML. */
  var tidy: js.UndefOr[Boolean] = js.native
}
object Config {
  
  @scala.inline
  def apply[T](): Config[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config[T]]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config[_], T] (val x: Self with Config[T]) extends AnyVal {
    
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
    def setHeadersVarargs(value: Header[T]*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[Header[T]]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setTidy(value: Boolean): Self = this.set("tidy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTidy: Self = this.set("tidy", js.undefined)
  }
}

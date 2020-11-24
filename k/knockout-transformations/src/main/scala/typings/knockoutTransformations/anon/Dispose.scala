package typings.knockoutTransformations.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dispose[TResult] extends js.Object {
  
  def dispose(): Unit = js.native
  
  var mappedValue: TResult = js.native
}
object Dispose {
  
  @scala.inline
  def apply[TResult](dispose: () => Unit, mappedValue: TResult): Dispose[TResult] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), mappedValue = mappedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispose[TResult]]
  }
  
  @scala.inline
  implicit class DisposeOps[Self <: Dispose[_], TResult] (val x: Self with Dispose[TResult]) extends AnyVal {
    
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMappedValue(value: TResult): Self = this.set("mappedValue", value.asInstanceOf[js.Any])
  }
}

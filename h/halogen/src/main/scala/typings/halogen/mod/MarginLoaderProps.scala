package typings.halogen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginLoaderProps[T] extends HalogenCommonProps {
  
  var margin: js.UndefOr[T] = js.native
  
  var size: js.UndefOr[T] = js.native
}
object MarginLoaderProps {
  
  @scala.inline
  def apply[T](): MarginLoaderProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginLoaderProps[T]]
  }
  
  @scala.inline
  implicit class MarginLoaderPropsOps[Self <: MarginLoaderProps[_], T] (val x: Self with MarginLoaderProps[T]) extends AnyVal {
    
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
    def setMargin(value: T): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setSize(value: T): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}

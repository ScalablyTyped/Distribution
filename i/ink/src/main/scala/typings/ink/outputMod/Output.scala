package typings.ink.outputMod

import typings.ink.anon.Height
import typings.ink.anon.Transformers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output extends js.Object {
  
  def get(): Height = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
  
  def write(x: Double, y: Double, text: String, options: Transformers): Unit = js.native
  
  val writes: js.Any = js.native
}
object Output {
  
  @scala.inline
  def apply(
    get: () => Height,
    height: Double,
    width: Double,
    write: (Double, Double, String, Transformers) => Unit,
    writes: js.Any
  ): Output = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], write = js.Any.fromFunction4(write), writes = writes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    
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
    def setGet(value: () => Height): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: (Double, Double, String, Transformers) => Unit): Self = this.set("write", js.Any.fromFunction4(value))
    
    @scala.inline
    def setWrites(value: js.Any): Self = this.set("writes", value.asInstanceOf[js.Any])
  }
}

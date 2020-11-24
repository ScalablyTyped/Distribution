package typings.iconGen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ico extends js.Object {
  
  var ico: js.Array[Double] = js.native
  
  var name: String = js.native
  
  var sizes: js.Array[Double] = js.native
}
object Ico {
  
  @scala.inline
  def apply(ico: js.Array[Double], name: String, sizes: js.Array[Double]): Ico = {
    val __obj = js.Dynamic.literal(ico = ico.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ico]
  }
  
  @scala.inline
  implicit class IcoOps[Self <: Ico] (val x: Self) extends AnyVal {
    
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
    def setIcoVarargs(value: Double*): Self = this.set("ico", js.Array(value :_*))
    
    @scala.inline
    def setIco(value: js.Array[Double]): Self = this.set("ico", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesVarargs(value: Double*): Self = this.set("sizes", js.Array(value :_*))
    
    @scala.inline
    def setSizes(value: js.Array[Double]): Self = this.set("sizes", value.asInstanceOf[js.Any])
  }
}

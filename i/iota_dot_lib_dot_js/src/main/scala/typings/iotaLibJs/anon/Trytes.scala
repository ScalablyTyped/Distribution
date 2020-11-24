package typings.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trytes extends js.Object {
  
  var trytes: js.Array[String] = js.native
}
object Trytes {
  
  @scala.inline
  def apply(trytes: js.Array[String]): Trytes = {
    val __obj = js.Dynamic.literal(trytes = trytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trytes]
  }
  
  @scala.inline
  implicit class TrytesOps[Self <: Trytes] (val x: Self) extends AnyVal {
    
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
    def setTrytesVarargs(value: String*): Self = this.set("trytes", js.Array(value :_*))
    
    @scala.inline
    def setTrytes(value: js.Array[String]): Self = this.set("trytes", value.asInstanceOf[js.Any])
  }
}

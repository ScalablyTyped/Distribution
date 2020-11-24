package typings.iostContract.IOSTContract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block extends js.Object {
  
  var number: Double = js.native
  
  var parent_hash: String = js.native
  
  var time: Double = js.native
  
  var witness: String = js.native
}
object Block {
  
  @scala.inline
  def apply(number: Double, parent_hash: String, time: Double, witness: String): Block = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], parent_hash = parent_hash.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], witness = witness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
    
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
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_hash(value: String): Self = this.set("parent_hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWitness(value: String): Self = this.set("witness", value.asInstanceOf[js.Any])
  }
}

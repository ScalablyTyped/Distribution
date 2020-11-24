package typings.jsrsasign.jsrsasign.KJUR.asn1.tsp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for simple TimeStampToken generator
  * @param params associative array of parameters
  * @description
  */
@js.native
trait SimpleTSAAdapter extends js.Object {
  
  def getTSTHex(msgHex: String, hashAlg: String): String = js.native
}
object SimpleTSAAdapter {
  
  @scala.inline
  def apply(getTSTHex: (String, String) => String): SimpleTSAAdapter = {
    val __obj = js.Dynamic.literal(getTSTHex = js.Any.fromFunction2(getTSTHex))
    __obj.asInstanceOf[SimpleTSAAdapter]
  }
  
  @scala.inline
  implicit class SimpleTSAAdapterOps[Self <: SimpleTSAAdapter] (val x: Self) extends AnyVal {
    
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
    def setGetTSTHex(value: (String, String) => String): Self = this.set("getTSTHex", js.Any.fromFunction2(value))
  }
}

package typings.hashJs

import typings.hashJs.hashJsStrings.big
import typings.hashJs.hashJsStrings.little
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockHash[T] extends js.Object {
  
  var endian: big | little = js.native
  
  var hmacStrength: Double = js.native
  
  var padLength: Double = js.native
}
object BlockHash {
  
  @scala.inline
  def apply[T](endian: big | little, hmacStrength: Double, padLength: Double): BlockHash[T] = {
    val __obj = js.Dynamic.literal(endian = endian.asInstanceOf[js.Any], hmacStrength = hmacStrength.asInstanceOf[js.Any], padLength = padLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockHash[T]]
  }
  
  @scala.inline
  implicit class BlockHashOps[Self <: BlockHash[_], T] (val x: Self with BlockHash[T]) extends AnyVal {
    
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
    def setEndian(value: big | little): Self = this.set("endian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHmacStrength(value: Double): Self = this.set("hmacStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadLength(value: Double): Self = this.set("padLength", value.asInstanceOf[js.Any])
  }
}

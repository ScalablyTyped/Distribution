package typings.hashJs

import typings.hashJs.hashJsStrings.big
import typings.hashJs.hashJsStrings.little
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockHash[T] extends StObject {
  
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
  implicit class BlockHashMutableBuilder[Self <: BlockHash[_], T] (val x: Self with BlockHash[T]) extends AnyVal {
    
    @scala.inline
    def setEndian(value: big | little): Self = StObject.set(x, "endian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHmacStrength(value: Double): Self = StObject.set(x, "hmacStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadLength(value: Double): Self = StObject.set(x, "padLength", value.asInstanceOf[js.Any])
  }
}

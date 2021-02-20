package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of an int64, n, that is immune to precision loss when
  * encoded in JSON.
  */
@js.native
trait SchemaSplitInt64 extends StObject {
  
  /**
    * The high order bits, including the sign: n &gt;&gt; 32.
    */
  var highBits: js.UndefOr[Double] = js.native
  
  /**
    * The low order bits: n &amp; 0xffffffff.
    */
  var lowBits: js.UndefOr[Double] = js.native
}
object SchemaSplitInt64 {
  
  @scala.inline
  def apply(): SchemaSplitInt64 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSplitInt64]
  }
  
  @scala.inline
  implicit class SchemaSplitInt64MutableBuilder[Self <: SchemaSplitInt64] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighBits(value: Double): Self = StObject.set(x, "highBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighBitsUndefined: Self = StObject.set(x, "highBits", js.undefined)
    
    @scala.inline
    def setLowBits(value: Double): Self = StObject.set(x, "lowBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowBitsUndefined: Self = StObject.set(x, "lowBits", js.undefined)
  }
}

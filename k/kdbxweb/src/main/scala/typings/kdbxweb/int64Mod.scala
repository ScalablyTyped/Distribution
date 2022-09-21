package typings.kdbxweb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object int64Mod {
  
  @JSImport("kdbxweb/dist/types/utils/int64", "Int64")
  @js.native
  open class Int64 () extends StObject {
    def this(lo: Double) = this()
    def this(lo: Double, hi: Double) = this()
    def this(lo: Unit, hi: Double) = this()
    
    val hi: Double = js.native
    
    val lo: Double = js.native
    
    def value: Double = js.native
  }
  object Int64 {
    
    @JSImport("kdbxweb/dist/types/utils/int64", "Int64")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def from(value: Double): Int64 = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[Int64]
  }
}

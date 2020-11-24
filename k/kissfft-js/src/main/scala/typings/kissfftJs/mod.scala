package typings.kissfftJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kissfft-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class FFT protected () extends js.Object {
    def this(size: Double) = this()
    
    def dispose(): Unit = js.native
    
    def forward(input: js.Array[Double]): js.Array[Double] = js.native
    
    def inverse(input: js.Array[Double]): js.Array[Double] = js.native
  }
  
  @js.native
  class FFTR protected () extends js.Object {
    def this(size: Double) = this()
    
    def dispose(): Unit = js.native
    
    def forward(input: js.Array[Double]): js.Array[Double] = js.native
    
    def inverse(input: js.Array[Double]): js.Array[Double] = js.native
  }
}

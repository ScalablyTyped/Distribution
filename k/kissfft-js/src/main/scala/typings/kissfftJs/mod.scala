package typings.kissfftJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kissfft-js", "FFT")
  @js.native
  open class FFT protected () extends StObject {
    def this(size: Double) = this()
    
    def dispose(): Unit = js.native
    
    def forward(input: js.Array[Double]): js.Array[Double] = js.native
    
    def inverse(input: js.Array[Double]): js.Array[Double] = js.native
  }
  
  @JSImport("kissfft-js", "FFTR")
  @js.native
  open class FFTR protected () extends StObject {
    def this(size: Double) = this()
    
    def dispose(): Unit = js.native
    
    def forward(input: js.Array[Double]): js.Array[Double] = js.native
    
    def inverse(input: js.Array[Double]): js.Array[Double] = js.native
  }
}

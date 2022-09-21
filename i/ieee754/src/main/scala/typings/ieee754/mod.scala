package typings.ieee754

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ieee754", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def read(buffer: js.typedarray.Uint8Array, offset: Double, isLE: Boolean, mLen: Double, nBytes: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], isLE.asInstanceOf[js.Any], mLen.asInstanceOf[js.Any], nBytes.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def write(
    buffer: js.typedarray.Uint8Array,
    value: Double,
    offset: Double,
    isLE: Boolean,
    mLen: Double,
    nBytes: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], isLE.asInstanceOf[js.Any], mLen.asInstanceOf[js.Any], nBytes.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

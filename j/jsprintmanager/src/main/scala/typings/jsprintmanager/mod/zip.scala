package typings.jsprintmanager.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zip {
  
  @JSImport("jsprintmanager", "zip.Reader")
  @js.native
  open class Reader () extends StObject {
    
    def init(callback: js.Function0[Unit], onerror: js.Function1[/* error */ Any, Unit]): Unit = js.native
    
    def readUint8Array(index: Double, length: Double, callback: js.Function1[/* result */ js.typedarray.Uint8Array, Unit]): Unit = js.native
    def readUint8Array(
      index: Double,
      length: Double,
      callback: js.Function1[/* result */ js.typedarray.Uint8Array, Unit],
      onerror: js.Function1[/* error */ Any, Unit]
    ): Unit = js.native
    
    var size: Double = js.native
  }
}

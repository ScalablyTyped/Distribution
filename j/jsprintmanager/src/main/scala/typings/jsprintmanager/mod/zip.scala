package typings.jsprintmanager.mod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zip {
  
  @JSImport("jsprintmanager", "zip.Reader")
  @js.native
  class Reader () extends StObject {
    
    def init(callback: js.Function0[Unit], onerror: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    def readUint8Array(index: Double, length: Double, callback: js.Function1[/* result */ Uint8Array, Unit]): Unit = js.native
    def readUint8Array(
      index: Double,
      length: Double,
      callback: js.Function1[/* result */ Uint8Array, Unit],
      onerror: js.Function1[/* error */ js.Any, Unit]
    ): Unit = js.native
    
    var size: Double = js.native
  }
}

package typings.jsprintmanager.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsprintmanager", "zip")
@js.native
object zip extends js.Object {
  
  @js.native
  class Reader () extends js.Object {
    
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

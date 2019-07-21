package typings
package jsprintmanagerLib.jsprintmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsprintmanager", "zip")
@js.native
object zipNs extends js.Object {
  @js.native
  class Reader () extends js.Object {
    var size: scala.Double = js.native
    def init(callback: js.Function0[scala.Unit], onerror: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit = js.native
    def readUint8Array(
      index: scala.Double,
      length: scala.Double,
      callback: js.Function1[/* result */ stdLib.Uint8Array, scala.Unit]
    ): scala.Unit = js.native
    def readUint8Array(
      index: scala.Double,
      length: scala.Double,
      callback: js.Function1[/* result */ stdLib.Uint8Array, scala.Unit],
      onerror: js.Function1[/* error */ js.Any, scala.Unit]
    ): scala.Unit = js.native
  }
  
}


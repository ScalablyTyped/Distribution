package typings.jupyterlabServices.wsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/shim/ws", JSImport.Default)
@js.native
object default
  extends Instantiable1[/* url */ String, WebSocket]
     with Instantiable2[
      /* url */ String, 
      (/* protocols */ js.Array[String]) | (/* protocols */ String), 
      WebSocket
    ] {
  val CLOSED: Double = js.native
  val CLOSING: Double = js.native
  val CONNECTING: Double = js.native
  val OPEN: Double = js.native
}


package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CLOSED
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

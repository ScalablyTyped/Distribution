package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Sleeping")
@js.native
class Sleeping () extends StObject
/* static members */
object Sleeping {
  
  @JSImport("matter-js", "Sleeping")
  @js.native
  val ^ : js.Any = js.native
  
  inline def set(body: Body, isSleeping: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(body.asInstanceOf[js.Any], isSleeping.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

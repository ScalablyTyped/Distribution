package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsplumb", "Endpoint")
@js.native
class Endpoint ()
  extends jsplumbLib.jsplumbMod.jsPlumbNs.Endpoint {
  /* CompleteClass */
  override var anchor: jsplumbLib.jsplumbMod.jsPlumbNs.Anchor = js.native
  //= 1?
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /* CompleteClass */
  override var maxConnections: scala.Double = js.native
  /* CompleteClass */
  override var scope: java.lang.String = js.native
  /* CompleteClass */
  override var `type`: jsplumbLib.jsplumbMod.jsPlumbNs.EndpointId = js.native
  /* CompleteClass */
  override def connectorSelector(): jsplumbLib.jsplumbMod.jsPlumbNs.Connection = js.native
  /* CompleteClass */
  override def getElement(): stdLib.Element = js.native
  /* CompleteClass */
  override def isEnabled(): scala.Boolean = js.native
  /* CompleteClass */
  override def setElement(el: stdLib.Element): scala.Unit = js.native
  /* CompleteClass */
  override def setEnabled(enabled: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def setEndpoint(spec: jsplumbLib.jsplumbMod.jsPlumbNs.EndpointSpec): scala.Unit = js.native
  /* CompleteClass */
  override def setHover(hover: scala.Boolean): scala.Unit = js.native
}


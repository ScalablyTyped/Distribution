package typings
package hubspotDashPaceLib.HubSpotPaceInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pace extends js.Object {
  var options: PaceOptions = js.native
  def ignore(fn: js.Function0[scala.Unit], args: js.Any*): scala.Unit = js.native
  def off(event: java.lang.String): scala.Unit = js.native
  def off(event: java.lang.String, handler: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit = js.native
  def on(event: java.lang.String, handler: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit = js.native
  def on(event: java.lang.String, handler: js.Function1[/* repeated */js.Any, scala.Unit], context: js.Any): scala.Unit = js.native
  def once(event: java.lang.String, handler: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit = js.native
  def once(event: java.lang.String, handler: js.Function1[/* repeated */js.Any, scala.Unit], context: js.Any): scala.Unit = js.native
  def restart(): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def start(options: PaceOptions): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def track(fn: js.Function0[scala.Unit], args: js.Any*): scala.Unit = js.native
}


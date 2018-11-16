package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Clients
//
@js.native
trait Client
  extends nodeLib.eventsMod.EventEmitter {
  var config: Config = js.native
  var connectionSettings: js.Object = js.native
  var dialect: java.lang.String = js.native
  var driverName: java.lang.String = js.native
  def acquireRawConnection(): stdLib.Promise[_] = js.native
  def destroyRawConnection(connection: js.Any): stdLib.Promise[scala.Unit] = js.native
  def validateConnection(connection: js.Any): stdLib.Promise[scala.Boolean] = js.native
}


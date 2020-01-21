package typings.knex.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Clients
//
@JSImport("knex", "Client")
@js.native
class Client protected () extends EventEmitter {
  def this(config: Config) = this()
  var config: Config = js.native
  var connectionSettings: js.Object = js.native
  var dialect: String = js.native
  var driverName: String = js.native
  def acquireRawConnection(): js.Promise[_] = js.native
  def destroyRawConnection(connection: js.Any): js.Promise[Unit] = js.native
  def validateConnection(connection: js.Any): js.Promise[Boolean] = js.native
}


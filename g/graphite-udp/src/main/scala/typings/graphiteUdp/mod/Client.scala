package typings.graphiteUdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphite-udp", "Client")
@js.native
class Client () extends js.Object {
  def this(clientOptions: ClientOptions) = this()
  /**
  	 * During the interval time option, if 2 or more metrics with the same name are sent, metrics will be added (summed)
  	 */
  def add(name: String, value: Double): Unit = js.native
  /**
  	 * Close the underlying UDP client socket
  	 *
  	 * @return void
  	 */
  def close(): Unit = js.native
  /**
  	 * During the interval time option, if 2 or more metrics with the same name are sent, the last one will be used
  	 */
  def put(name: String, value: Double): Unit = js.native
}


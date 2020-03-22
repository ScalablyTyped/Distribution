package typings.hashring.mod

import typings.hashring.PartialHashRingOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hashring", JSImport.Namespace)
@js.native
class ^ protected () extends HashRing {
  def this(servers: Servers) = this()
  def this(servers: Servers, algorithm: String) = this()
  def this(servers: Servers, algorithm: js.Function1[/* key */ String, String | Buffer]) = this()
  def this(servers: Servers, algorithm: String, options: PartialHashRingOptions) = this()
  def this(
    servers: Servers,
    algorithm: js.Function1[/* key */ String, String | Buffer],
    options: PartialHashRingOptions
  ) = this()
}


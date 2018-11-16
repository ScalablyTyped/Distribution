package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Clients
//
@JSImport("knex", "Client")
@js.native
class Client protected ()
  extends knexLib.knexMod.KnexNs.Client {
  def this(config: knexLib.knexMod.KnexNs.Config) = this()
}


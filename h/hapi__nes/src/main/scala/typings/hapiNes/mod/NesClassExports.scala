package typings.hapiNes.mod

import typings.hapiNes.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NesClassExports extends js.Object {
  var Client: Instantiable
}

object NesClassExports {
  @scala.inline
  def apply(Client: Instantiable): NesClassExports = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any])
    __obj.asInstanceOf[NesClassExports]
  }
}


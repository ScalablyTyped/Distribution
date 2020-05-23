package typings.mapboxSpritezero.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: String
  var svg: Buffer
}

object Id {
  @scala.inline
  def apply(id: String, svg: Buffer): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}


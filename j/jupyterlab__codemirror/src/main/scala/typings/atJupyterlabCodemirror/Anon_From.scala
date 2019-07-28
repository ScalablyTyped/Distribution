package typings.atJupyterlabCodemirror

import typings.codemirror.codemirrorMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: Position
  var to: Position
}

object Anon_From {
  @scala.inline
  def apply(from: Position, to: Position): Anon_From = {
    val __obj = js.Dynamic.literal(from = from, to = to)
  
    __obj.asInstanceOf[Anon_From]
  }
}


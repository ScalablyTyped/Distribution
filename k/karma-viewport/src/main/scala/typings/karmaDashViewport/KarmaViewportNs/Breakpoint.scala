package typings.karmaDashViewport.KarmaViewportNs

import typings.karmaDashViewport.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breakpoint extends js.Object {
  var name: String
  var size: Anon_Height
}

object Breakpoint {
  @scala.inline
  def apply(name: String, size: Anon_Height): Breakpoint = {
    val __obj = js.Dynamic.literal(name = name, size = size)
  
    __obj.asInstanceOf[Breakpoint]
  }
}


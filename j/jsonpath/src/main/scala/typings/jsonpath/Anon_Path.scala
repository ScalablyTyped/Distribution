package typings.jsonpath

import typings.jsonpath.jsonpathMod.PathComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  var path: js.Array[PathComponent]
  var value: js.Any
}

object Anon_Path {
  @scala.inline
  def apply(path: js.Array[PathComponent], value: js.Any): Anon_Path = {
    val __obj = js.Dynamic.literal(path = path, value = value)
  
    __obj.asInstanceOf[Anon_Path]
  }
}


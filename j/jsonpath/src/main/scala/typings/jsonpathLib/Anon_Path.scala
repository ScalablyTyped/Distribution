package typings
package jsonpathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  var path: js.Array[jsonpathLib.jsonpathMod.PathComponent]
  var value: js.Any
}

object Anon_Path {
  @scala.inline
  def apply(path: js.Array[jsonpathLib.jsonpathMod.PathComponent], value: js.Any): Anon_Path = {
    val __obj = js.Dynamic.literal(path = path, value = value)
  
    __obj.asInstanceOf[Anon_Path]
  }
}


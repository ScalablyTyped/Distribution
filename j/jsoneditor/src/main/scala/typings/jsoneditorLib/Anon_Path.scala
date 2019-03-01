package typings
package jsoneditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  var path: jsoneditorLib.jsoneditorMod.JSONPath
}

object Anon_Path {
  @scala.inline
  def apply(path: jsoneditorLib.jsoneditorMod.JSONPath): Anon_Path = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_Path]
  }
}


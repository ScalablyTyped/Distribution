package typings.ionic

import typings.ionic.definitionsMod.ProjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdName extends js.Object {
  var id: String
  var name: String
  var `type`: ProjectType
}

object Anon_IdName {
  @scala.inline
  def apply(id: String, name: String, `type`: ProjectType): Anon_IdName = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_IdName]
  }
}


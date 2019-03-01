package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppAssociation extends js.Object {
  var repository: RepoAssociation
}

object AppAssociation {
  @scala.inline
  def apply(repository: RepoAssociation): AppAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("repository")(repository)
    __obj.asInstanceOf[AppAssociation]
  }
}


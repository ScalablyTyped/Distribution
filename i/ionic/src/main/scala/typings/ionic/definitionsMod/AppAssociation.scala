package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppAssociation extends js.Object {
  var repository: RepoAssociation
}

object AppAssociation {
  @scala.inline
  def apply(repository: RepoAssociation): AppAssociation = {
    val __obj = js.Dynamic.literal(repository = repository.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppAssociation]
  }
}


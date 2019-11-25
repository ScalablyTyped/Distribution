package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GithubRepo extends js.Object {
  var full_name: String
  var id: Double
}

object GithubRepo {
  @scala.inline
  def apply(full_name: String, id: Double): GithubRepo = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GithubRepo]
  }
}


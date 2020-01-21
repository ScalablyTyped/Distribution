package typings.lasso.dependenciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bundle extends js.Object {
  var dependencies: js.Array[DependencyConfig | String]
  var name: String
}

object Bundle {
  @scala.inline
  def apply(dependencies: js.Array[DependencyConfig | String], name: String): Bundle = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bundle]
  }
}


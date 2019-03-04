package typings
package lassoLib.libDependenciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bundle extends js.Object {
  var dependencies: js.Array[DependencyConfig | java.lang.String]
  var name: java.lang.String
}

object Bundle {
  @scala.inline
  def apply(dependencies: js.Array[DependencyConfig | java.lang.String], name: java.lang.String): Bundle = {
    val __obj = js.Dynamic.literal(dependencies = dependencies, name = name)
  
    __obj.asInstanceOf[Bundle]
  }
}


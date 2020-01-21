package typings.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Watermarks extends js.Object {
  var branches: js.Array[Double]
  var functions: js.Array[Double]
  var lines: js.Array[Double]
  var statements: js.Array[Double]
}

object Watermarks {
  @scala.inline
  def apply(
    branches: js.Array[Double],
    functions: js.Array[Double],
    lines: js.Array[Double],
    statements: js.Array[Double]
  ): Watermarks = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Watermarks]
  }
}


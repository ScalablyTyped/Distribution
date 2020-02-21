package typings.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Watermarks extends js.Object {
  var branches: Watermark
  var functions: Watermark
  var lines: Watermark
  var statements: Watermark
}

object Watermarks {
  @scala.inline
  def apply(branches: Watermark, functions: Watermark, lines: Watermark, statements: Watermark): Watermarks = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Watermarks]
  }
}


package typings.knockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportDependencies extends js.Object {
  var exportDependencies: Boolean
}

object ExportDependencies {
  @scala.inline
  def apply(exportDependencies: Boolean): ExportDependencies = {
    val __obj = js.Dynamic.literal(exportDependencies = exportDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDependencies]
  }
}


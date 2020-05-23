package typings.istanbulLibInstrument.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCoverage extends js.Object {
  var fileCoverage: typings.istanbulLibCoverage.mod.FileCoverage
  var sourceMappingURL: String
}

object FileCoverage {
  @scala.inline
  def apply(fileCoverage: typings.istanbulLibCoverage.mod.FileCoverage, sourceMappingURL: String): FileCoverage = {
    val __obj = js.Dynamic.literal(fileCoverage = fileCoverage.asInstanceOf[js.Any], sourceMappingURL = sourceMappingURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCoverage]
  }
}


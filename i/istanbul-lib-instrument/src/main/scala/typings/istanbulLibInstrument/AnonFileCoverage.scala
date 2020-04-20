package typings.istanbulLibInstrument

import typings.istanbulLibCoverage.mod.FileCoverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFileCoverage extends js.Object {
  var fileCoverage: FileCoverage
  var sourceMappingURL: String
}

object AnonFileCoverage {
  @scala.inline
  def apply(fileCoverage: FileCoverage, sourceMappingURL: String): AnonFileCoverage = {
    val __obj = js.Dynamic.literal(fileCoverage = fileCoverage.asInstanceOf[js.Any], sourceMappingURL = sourceMappingURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileCoverage]
  }
}


package typings.istanbulLibInstrument.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialCoverage extends js.Object {
  var coverageData: js.Any
  var gcv: js.Any
  var hash: String
  var path: String
}

object InitialCoverage {
  @scala.inline
  def apply(coverageData: js.Any, gcv: js.Any, hash: String, path: String): InitialCoverage = {
    val __obj = js.Dynamic.literal(coverageData = coverageData.asInstanceOf[js.Any], gcv = gcv.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InitialCoverage]
  }
}


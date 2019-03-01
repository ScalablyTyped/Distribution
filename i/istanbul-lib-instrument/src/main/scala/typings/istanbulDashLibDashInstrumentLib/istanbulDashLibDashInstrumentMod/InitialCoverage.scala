package typings
package istanbulDashLibDashInstrumentLib.istanbulDashLibDashInstrumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialCoverage extends js.Object {
  var coverageData: js.Any
  var gcv: js.Any
  var hash: java.lang.String
  var path: java.lang.String
}

object InitialCoverage {
  @scala.inline
  def apply(coverageData: js.Any, gcv: js.Any, hash: java.lang.String, path: java.lang.String): InitialCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("coverageData")(coverageData)
    __obj.updateDynamic("gcv")(gcv)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[InitialCoverage]
  }
}


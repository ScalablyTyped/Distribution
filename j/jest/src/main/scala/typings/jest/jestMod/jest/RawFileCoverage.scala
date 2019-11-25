package typings.jest.jestMod.jest

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TestResult
trait RawFileCoverage extends js.Object {
  var b: NumberDictionary[Double]
  var branchMap: NumberDictionary[js.Any]
  var f: NumberDictionary[Double]
  var fnMap: NumberDictionary[js.Any]
  var inputSourceMap: js.UndefOr[js.Object] = js.undefined
  var l: NumberDictionary[Double]
  var path: String
  var s: NumberDictionary[Double]
  var statementMap: NumberDictionary[js.Any]
}

object RawFileCoverage {
  @scala.inline
  def apply(
    b: NumberDictionary[Double],
    branchMap: NumberDictionary[js.Any],
    f: NumberDictionary[Double],
    fnMap: NumberDictionary[js.Any],
    l: NumberDictionary[Double],
    path: String,
    s: NumberDictionary[Double],
    statementMap: NumberDictionary[js.Any],
    inputSourceMap: js.Object = null
  ): RawFileCoverage = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], branchMap = branchMap.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], fnMap = fnMap.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], statementMap = statementMap.asInstanceOf[js.Any])
    if (inputSourceMap != null) __obj.updateDynamic("inputSourceMap")(inputSourceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawFileCoverage]
  }
}


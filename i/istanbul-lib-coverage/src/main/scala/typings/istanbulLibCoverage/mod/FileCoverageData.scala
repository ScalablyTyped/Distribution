package typings.istanbulLibCoverage.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCoverageData extends js.Object {
  var b: StringDictionary[js.Array[Double]]
  var branchMap: StringDictionary[BranchMapping]
  var f: StringDictionary[Double]
  var fnMap: StringDictionary[FunctionMapping]
  var path: String
  var s: StringDictionary[Double]
  var statementMap: StringDictionary[Range]
}

object FileCoverageData {
  @scala.inline
  def apply(
    b: StringDictionary[js.Array[Double]],
    branchMap: StringDictionary[BranchMapping],
    f: StringDictionary[Double],
    fnMap: StringDictionary[FunctionMapping],
    path: String,
    s: StringDictionary[Double],
    statementMap: StringDictionary[Range]
  ): FileCoverageData = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], branchMap = branchMap.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], fnMap = fnMap.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], statementMap = statementMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCoverageData]
  }
}


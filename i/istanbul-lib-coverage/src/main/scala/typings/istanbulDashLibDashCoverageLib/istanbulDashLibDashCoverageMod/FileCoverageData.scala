package typings
package istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCoverageData extends js.Object {
  var b: org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]]
  var branchMap: org.scalablytyped.runtime.StringDictionary[BranchMapping]
  var f: org.scalablytyped.runtime.StringDictionary[scala.Double]
  var fnMap: org.scalablytyped.runtime.StringDictionary[FunctionMapping]
  var path: java.lang.String
  var s: org.scalablytyped.runtime.StringDictionary[scala.Double]
  var statementMap: org.scalablytyped.runtime.StringDictionary[Range]
}

object FileCoverageData {
  @scala.inline
  def apply(
    b: org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]],
    branchMap: org.scalablytyped.runtime.StringDictionary[BranchMapping],
    f: org.scalablytyped.runtime.StringDictionary[scala.Double],
    fnMap: org.scalablytyped.runtime.StringDictionary[FunctionMapping],
    path: java.lang.String,
    s: org.scalablytyped.runtime.StringDictionary[scala.Double],
    statementMap: org.scalablytyped.runtime.StringDictionary[Range]
  ): FileCoverageData = {
    val __obj = js.Dynamic.literal(b = b, branchMap = branchMap, f = f, fnMap = fnMap, path = path, s = s, statementMap = statementMap)
  
    __obj.asInstanceOf[FileCoverageData]
  }
}


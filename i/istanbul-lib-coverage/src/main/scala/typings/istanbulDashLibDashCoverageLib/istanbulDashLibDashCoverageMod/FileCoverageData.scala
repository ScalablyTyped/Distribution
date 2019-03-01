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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("branchMap")(branchMap)
    __obj.updateDynamic("f")(f)
    __obj.updateDynamic("fnMap")(fnMap)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("s")(s)
    __obj.updateDynamic("statementMap")(statementMap)
    __obj.asInstanceOf[FileCoverageData]
  }
}


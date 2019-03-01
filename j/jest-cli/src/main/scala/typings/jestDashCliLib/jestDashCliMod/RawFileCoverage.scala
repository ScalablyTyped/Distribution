package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawFileCoverage extends js.Object {
  var b: org.scalablytyped.runtime.NumberDictionary[scala.Double]
  var branchMap: org.scalablytyped.runtime.NumberDictionary[js.Any]
  var f: org.scalablytyped.runtime.NumberDictionary[scala.Double]
  var fnMap: org.scalablytyped.runtime.NumberDictionary[js.Any]
  var inputSourceMap: js.UndefOr[js.Object] = js.undefined
  var l: org.scalablytyped.runtime.NumberDictionary[scala.Double]
  var path: java.lang.String
  var s: org.scalablytyped.runtime.NumberDictionary[scala.Double]
  var statementMap: org.scalablytyped.runtime.NumberDictionary[js.Any]
}

object RawFileCoverage {
  @scala.inline
  def apply(
    b: org.scalablytyped.runtime.NumberDictionary[scala.Double],
    branchMap: org.scalablytyped.runtime.NumberDictionary[js.Any],
    f: org.scalablytyped.runtime.NumberDictionary[scala.Double],
    fnMap: org.scalablytyped.runtime.NumberDictionary[js.Any],
    l: org.scalablytyped.runtime.NumberDictionary[scala.Double],
    path: java.lang.String,
    s: org.scalablytyped.runtime.NumberDictionary[scala.Double],
    statementMap: org.scalablytyped.runtime.NumberDictionary[js.Any],
    inputSourceMap: js.Object = null
  ): RawFileCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("branchMap")(branchMap)
    __obj.updateDynamic("f")(f)
    __obj.updateDynamic("fnMap")(fnMap)
    __obj.updateDynamic("l")(l)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("s")(s)
    __obj.updateDynamic("statementMap")(statementMap)
    if (inputSourceMap != null) __obj.updateDynamic("inputSourceMap")(inputSourceMap)
    __obj.asInstanceOf[RawFileCoverage]
  }
}


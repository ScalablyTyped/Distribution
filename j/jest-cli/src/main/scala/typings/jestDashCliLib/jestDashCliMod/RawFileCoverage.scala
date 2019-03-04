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
    val __obj = js.Dynamic.literal(b = b, branchMap = branchMap, f = f, fnMap = fnMap, l = l, path = path, s = s, statementMap = statementMap)
    if (inputSourceMap != null) __obj.updateDynamic("inputSourceMap")(inputSourceMap)
    __obj.asInstanceOf[RawFileCoverage]
  }
}


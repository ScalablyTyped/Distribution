package typings
package jasminewd2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmineNs {
  type AsyncCustomMatcherFactory = js.Function2[
    /* util */ jasmineLib.jasmineNs.MatchersUtil, 
    /* customEqualityTesters */ js.Array[jasmineLib.jasmineNs.CustomEqualityTester], 
    AsyncCustomMatcher
  ]
}

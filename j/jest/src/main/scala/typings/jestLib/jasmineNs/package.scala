package typings
package jestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmineNs {
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, scala.Boolean]
  type CustomMatcherFactory = js.Function2[
    /* util */ MatchersUtil, 
    /* customEqualityTesters */ js.Array[CustomEqualityTester], 
    CustomMatcher
  ]
}

package typings.jasminewd2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmineNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.jasmine.jasmineNs.CustomEqualityTester
  import typings.jasmine.jasmineNs.MatchersUtil

  type AsyncCustomMatcherFactories = StringDictionary[AsyncCustomMatcherFactory]
  type AsyncCustomMatcherFactory = js.Function2[
    /* util */ MatchersUtil, 
    /* customEqualityTesters */ js.Array[CustomEqualityTester], 
    AsyncCustomMatcher
  ]
}

package typings.jasminewd2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmine {
  import org.scalablytyped.runtime.StringDictionary
  import typings.jasmine.jasmine.CustomEqualityTester
  import typings.jasmine.jasmine.MatchersUtil

  type AsyncCustomMatcherFactories = StringDictionary[AsyncCustomMatcherFactory]
  type AsyncCustomMatcherFactory = js.Function2[
    /* util */ MatchersUtil, 
    /* customEqualityTesters */ js.Array[CustomEqualityTester], 
    AsyncCustomMatcher
  ]
}

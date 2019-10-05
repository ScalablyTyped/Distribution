package typings.jest.jestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmine {
  import org.scalablytyped.runtime.StringDictionary

  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, Boolean]
  type CustomMatcherFactories = StringDictionary[CustomMatcherFactory]
  type CustomMatcherFactory = js.Function2[
    /* util */ MatchersUtil, 
    /* customEqualityTesters */ js.Array[CustomEqualityTester], 
    CustomMatcher
  ]
}

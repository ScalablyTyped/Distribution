package typings.jest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmine {
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, scala.Boolean]
  type CustomMatcherFactories = org.scalablytyped.runtime.StringDictionary[typings.jest.mod.jasmine.CustomMatcherFactory]
  type CustomMatcherFactory = js.Function2[
    /* util */ typings.jest.mod.jasmine.MatchersUtil, 
    /* customEqualityTesters */ js.Array[typings.jest.mod.jasmine.CustomEqualityTester], 
    typings.jest.mod.jasmine.CustomMatcher
  ]
}

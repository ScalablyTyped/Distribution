package typings.jasminewd2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jasmine {
  
  type AsyncCustomMatcherFactories = org.scalablytyped.runtime.StringDictionary[typings.jasminewd2.jasmine.AsyncCustomMatcherFactory]
  
  type AsyncCustomMatcherFactory = js.Function2[
    /* util */ typings.jasmine.jasmine.MatchersUtil, 
    /* customEqualityTesters */ js.Array[typings.jasmine.jasmine.CustomEqualityTester], 
    typings.jasminewd2.jasmine.AsyncCustomMatcher
  ]
}

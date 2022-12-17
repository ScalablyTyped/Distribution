package typings.jasmine.jasmine

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAsyncMatcher extends StObject {
  
  def compare(actual: scala.Any, expected: scala.Any*): PromiseLike[CustomMatcherResult] = js.native
  def compare[T](actual: T, expected: T, args: scala.Any*): PromiseLike[CustomMatcherResult] = js.native
  
  var negativeCompare: js.UndefOr[
    js.Function3[
      /* actual */ scala.Any, 
      /* expected */ scala.Any, 
      /* repeated */ scala.Any, 
      PromiseLike[CustomMatcherResult]
    ]
  ] = js.native
}

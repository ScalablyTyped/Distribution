package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsymmetricMatcher[TValue] extends StObject {
  
  def asymmetricMatch(other: TValue): Boolean = js.native
  def asymmetricMatch(other: TValue, matchersUtil: MatchersUtil): Boolean = js.native
  
  var jasmineToString: js.UndefOr[
    js.Function1[/* prettyPrint */ js.Function1[/* value */ scala.Any, String], String]
  ] = js.native
}

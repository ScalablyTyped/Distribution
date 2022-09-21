package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayContaining[T]
  extends StObject
     with AsymmetricMatcher[scala.Any] {
  
  @JSName("jasmineToString")
  def jasmineToString_MArrayContaining(prettyPrint: js.Function1[/* value */ scala.Any, String]): String = js.native
  
  var `new`: js.UndefOr[js.Function1[/* sample */ ArrayLike[T], ArrayLike[T]]] = js.native
}

package typings.jest.mod.jest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomMatcher extends StObject {
  
  def apply(received: js.Any, actual: js.Any*): CustomMatcherResult | js.Promise[CustomMatcherResult] = js.native
}

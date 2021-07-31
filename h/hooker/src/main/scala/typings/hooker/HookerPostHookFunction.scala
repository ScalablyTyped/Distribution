package typings.hooker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HookerPostHookFunction extends StObject {
  
  def apply(result: js.Any, args: js.Any*): IHookerPostHookResult | Unit = js.native
}

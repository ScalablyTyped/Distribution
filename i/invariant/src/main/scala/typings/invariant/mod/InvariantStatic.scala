package typings.invariant.mod

import typings.invariant.invariantBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvariantStatic extends js.Object {
  
  def apply(testValue: js.Any, format: String, extra: js.Any*): /* asserts testValue */ Boolean = js.native
  def apply(testValue: `false`, format: String, extra: js.Any*): scala.Nothing = js.native
}

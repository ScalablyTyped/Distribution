package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Describe extends js.Object {
  
  def apply(name: String, fn: EmptyFunction): Unit = js.native
  def apply(name: js.Function, fn: EmptyFunction): Unit = js.native
  // tslint:disable-next-line ban-types
  def apply(name: Double, fn: EmptyFunction): Unit = js.native
  def apply(name: FunctionLike, fn: EmptyFunction): Unit = js.native
  
  var each: Each = js.native
  
  /** Only runs the tests inside this `describe` for the current file */
  var only: Describe = js.native
  
  /** Skips running the tests inside this `describe` for the current file */
  var skip: Describe = js.native
}

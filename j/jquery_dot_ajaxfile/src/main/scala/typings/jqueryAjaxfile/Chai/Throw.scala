package typings.jqueryAjaxfile.Chai

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Throw extends js.Object {
  
  def apply(): Assertion = js.native
  def apply(constructor: js.Function): Assertion = js.native
  def apply(constructor: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
  def apply(constructor: js.Function, expected: String): Assertion = js.native
  def apply(constructor: js.Function, expected: String, message: String): Assertion = js.native
  def apply(constructor: js.Function, expected: RegExp): Assertion = js.native
  def apply(constructor: js.Function, expected: RegExp, message: String): Assertion = js.native
  def apply(constructor: Error): Assertion = js.native
  def apply(constructor: Error, expected: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
  def apply(constructor: Error, expected: String): Assertion = js.native
  def apply(constructor: Error, expected: String, message: String): Assertion = js.native
  def apply(constructor: Error, expected: RegExp): Assertion = js.native
  def apply(constructor: Error, expected: RegExp, message: String): Assertion = js.native
  def apply(expected: String): Assertion = js.native
  def apply(expected: String, message: String): Assertion = js.native
  def apply(expected: RegExp): Assertion = js.native
  def apply(expected: RegExp, message: String): Assertion = js.native
}

package typings.jqueryCycle2.JQueryCycle2

import typings.jqueryCycle2.JQuery
import typings.jqueryCycle2.jqueryCycle2Strings.add
import typings.jqueryCycle2.jqueryCycle2Strings.destroy
import typings.jqueryCycle2.jqueryCycle2Strings.goto
import typings.jqueryCycle2.jqueryCycle2Strings.next
import typings.jqueryCycle2.jqueryCycle2Strings.pause
import typings.jqueryCycle2.jqueryCycle2Strings.prev
import typings.jqueryCycle2.jqueryCycle2Strings.reinit
import typings.jqueryCycle2.jqueryCycle2Strings.remove
import typings.jqueryCycle2.jqueryCycle2Strings.resume
import typings.jqueryCycle2.jqueryCycle2Strings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cycle2 extends js.Object {
  
  def apply(): JQuery = js.native
  def apply(methodNameDontCallMe: String, arg1DontCallMe: js.Any, arg2DontCallMe: js.Any): JQuery = js.native
  def apply(methodName: add, newSlide: js.Any): JQuery = js.native
   // string or JQuery
  def apply(methodName: destroy): JQuery = js.native
  def apply(methodName: goto, index: Double): JQuery = js.native
  def apply(methodName: next): JQuery = js.native
  def apply(methodName: pause): JQuery = js.native
  def apply(methodName: prev): JQuery = js.native
  def apply(methodName: reinit): JQuery = js.native
  def apply(methodName: remove, index: Double): JQuery = js.native
  def apply(methodName: resume): JQuery = js.native
  def apply(methodName: stop): JQuery = js.native
  def apply(options: Options): JQuery = js.native
}

package typings
package jestLib.jestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRequire extends js.Object {
  /**
    * Returns the actual module instead of a mock, bypassing all checks on
    * whether the module should receive a mock implementation or not.
    *
    * @deprecated Use `jest.requireActual` instead.
    */
  def requireActual(moduleName: java.lang.String): js.Any
  /**
    * Returns a mock module instead of the actual module, bypassing all checks
    * on whether the module should be required normally or not.
    *
    * @deprecated Use `jest.requireMock`instead.
    */
  def requireMock(moduleName: java.lang.String): js.Any
}

object NodeRequire {
  @scala.inline
  def apply(requireActual: java.lang.String => js.Any, requireMock: java.lang.String => js.Any): NodeRequire = {
    val __obj = js.Dynamic.literal(requireActual = js.Any.fromFunction1(requireActual), requireMock = js.Any.fromFunction1(requireMock))
  
    __obj.asInstanceOf[NodeRequire]
  }
}


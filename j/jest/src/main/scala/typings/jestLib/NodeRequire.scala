package typings
package jestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodeRequire extends js.Object {
  /**
       * Returns the actual module instead of a mock, bypassing all checks on
       * whether the module should receive a mock implementation or not.
       */
  def requireActual(moduleName: java.lang.String): js.Any
  /**
       * Returns a mock module instead of the actual module, bypassing all checks
       * on whether the module should be required normally or not.
       */
  def requireMock(moduleName: java.lang.String): js.Any
}


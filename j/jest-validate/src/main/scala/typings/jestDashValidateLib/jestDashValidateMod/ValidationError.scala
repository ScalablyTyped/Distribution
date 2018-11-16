package typings
package jestDashValidateLib.jestDashValidateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-validate", "ValidationError")
@js.native
class ValidationError protected ()
  extends stdLib.Error {
  def this(name: java.lang.String, message: java.lang.String) = this()
  def this(name: java.lang.String, message: java.lang.String, comment: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}


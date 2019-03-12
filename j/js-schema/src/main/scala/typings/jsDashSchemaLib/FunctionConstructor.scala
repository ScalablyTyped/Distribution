package typings
package jsDashSchemaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionConstructor extends js.Object {
  def reference(func: js.Function): FunctionConstructor
}

object FunctionConstructor {
  @scala.inline
  def apply(reference: js.Function => FunctionConstructor): FunctionConstructor = {
    val __obj = js.Dynamic.literal(reference = js.Any.fromFunction1(reference))
  
    __obj.asInstanceOf[FunctionConstructor]
  }
}


package typings
package jsDashSchemaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectConstructor extends js.Object {
  def like(obj: js.Any): ObjectConstructor
  def reference(obj: js.Any): ObjectConstructor
}

object ObjectConstructor {
  @scala.inline
  def apply(like: js.Function1[js.Any, ObjectConstructor], reference: js.Function1[js.Any, ObjectConstructor]): ObjectConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("like")(like)
    __obj.updateDynamic("reference")(reference)
    __obj.asInstanceOf[ObjectConstructor]
  }
}


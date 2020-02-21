package typings.jasmine.jasmine

import typings.jasmine.jasmineStrings.objectContaining_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine.objectContaining")
@js.native
object objectContaining extends js.Object {
  def apply[T](
    sample: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? jasmine.jasmine.ExpectedRecursive<T[K]>}
    */ objectContaining_ with T
  ): ObjectContaining_[T] = js.native
}


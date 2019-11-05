package typings.jestDashGetDashType

import typings.jestDashGetDashType.jestDashGetDashTypeMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-get-type", JSImport.Namespace)
@js.native
object jestDashGetDashTypeMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.jestDashGetDashType.jestDashGetDashTypeStrings.array
    - typings.jestDashGetDashType.jestDashGetDashTypeStrings.boolean
    - typings.jestDashGetDashType.jestDashGetDashTypeStrings.function
    - typings.jestDashGetDashType.jestDashGetDashTypeStrings.`null`
    - typings.jestDashGetDashType.jestDashGetDashTypeStrings.number
    - typings.jestDashGetDashType.jestDashGetDashTypeStrings.`object`
    - typings.jestDashGetDashType.jestDashGetDashTypeStrings.regexp
    - typings.jestDashGetDashType.jestDashGetDashTypeStrings.map
    - typings.jestDashGetDashType.jestDashGetDashTypeStrings.set
    - typings.jestDashGetDashType.jestDashGetDashTypeStrings.date
    - typings.jestDashGetDashType.jestDashGetDashTypeStrings.string
    - typings.jestDashGetDashType.jestDashGetDashTypeStrings.symbol
    - typings.jestDashGetDashType.jestDashGetDashTypeStrings.undefined
  */
  trait ValueType extends js.Object
  
  var isPrimitive: js.Function1[/* value */ js.Any, Boolean] = js.native
  def apply(value: js.Any): ValueType = js.native
}


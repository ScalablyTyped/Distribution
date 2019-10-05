package typings.jest.jestMod.jest

import typings.jest.jestStrings.set
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.spyOn")
@js.native
object spyOn_set extends js.Object {
  def apply[T /* <: js.Object */, M /* <: NonFunctionPropertyNames[Required[T]] */](`object`: T, method: M, accessType: set): SpyInstance[
    Unit, 
    js.Array[
      /* import warning: ImportType.apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ] = js.native
}


package typings.jest.jestMod.jest

import typings.std.Required
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.spyOn")
@js.native
object spyOn extends js.Object {
  def apply[T /* <: js.Object */, M /* <: FunctionPropertyNames[Required[T]] */](`object`: T, method: M): SpyInstance[
    ReturnType[
      /* import warning: ImportType.apply Failed type conversion: std.Required<T>[M] */ js.Any
    ], 
    ArgsType[
      /* import warning: ImportType.apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ] = js.native
}


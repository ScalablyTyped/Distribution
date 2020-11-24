package typings.jest.mod.jest

import typings.std.InstanceType
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest", "jest.spyOn")
@js.native
object spyOn extends js.Object {
  
  def apply[T /* <: js.Object */, M /* <: ConstructorPropertyNames[Required[T]] */](`object`: T, method: M): SpyInstance[
    InstanceType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ], 
    ConstructorArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ] = js.native
}

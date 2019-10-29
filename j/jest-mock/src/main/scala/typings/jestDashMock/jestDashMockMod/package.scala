package typings.jestDashMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jestDashMockMod {
  type FunctionPropertyNames[T] = (/* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}[keyof T] */ js.Any) with String
  type Global = typings.node.NodeJS.Global
  type ModuleMocker = ModuleMockerClass
  type NonFunctionPropertyNames[T] = (/* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? never : K}[keyof T] */ js.Any) with String
  type SpyInstance[T, Y /* <: js.Array[_] */] = MockInstance[T, Y]
}

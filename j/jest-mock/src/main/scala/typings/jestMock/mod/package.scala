package typings.jestMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FunctionPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}[keyof T] */ js.Any) with java.lang.String
  type Global = typings.node.NodeJS.Global
  type ModuleMocker = typings.jestMock.mod.ModuleMockerClass
  type NonFunctionPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? never : K}[keyof T] */ js.Any) with java.lang.String
  type SpyInstance[T, Y /* <: js.Array[_] */] = typings.jestMock.mod.MockInstance[T, Y]
}

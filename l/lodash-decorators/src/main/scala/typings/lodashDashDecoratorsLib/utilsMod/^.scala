package typings
package lodashDashDecoratorsLib.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def assignAll[T, U](to: T, from: U): T = js.native
  def assignAll[T, U](to: T, from: U, excludes: js.Array[java.lang.String]): T = js.native
  def assignProperty[T, U](to: T, from: U, prop: java.lang.String): scala.Unit = js.native
  def bind(fn: js.Function, context: js.Any): js.Function = js.native
  def copyMetadata(to: js.Any, from: js.Any): js.Any = js.native
  def isMethodOrPropertyDecoratorArgs(args: js.Any*): scala.Boolean = js.native
  def isPrototypeAccess(context: js.Object, target: js.Object): scala.Boolean = js.native
  def log(): java.lang.String = js.native
  def log(message: java.lang.String): java.lang.String = js.native
  def resolveFunction(): js.Any = js.native
  def resolveFunction(method: java.lang.String): js.Any = js.native
  def resolveFunction(method: java.lang.String, context: js.Any): js.Any = js.native
  def resolveFunction(method: java.lang.String, context: js.Any, target: js.Any): js.Any = js.native
  def resolveFunction(method: java.lang.String, context: js.Any, target: js.Any, throwNotFound: scala.Boolean): js.Any = js.native
  def resolveFunction(method: js.Function): js.Any = js.native
  def resolveFunction(method: js.Function, context: js.Any): js.Any = js.native
  def resolveFunction(method: js.Function, context: js.Any, target: js.Any): js.Any = js.native
  def resolveFunction(method: js.Function, context: js.Any, target: js.Any, throwNotFound: scala.Boolean): js.Any = js.native
  def returnAtIndex(fn: js.Function, index: scala.Double): js.Function = js.native
  def wrapConstructor(Ctor: js.Function, wrapper: js.Function2[/* Ctor */ js.Function, /* repeated */ js.Any, _]): js.Function = js.native
}


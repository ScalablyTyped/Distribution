package typings.lodashDecorators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  @js.native
  class CompositeKeyWeakMap[T] ()
    extends typings.lodashDecorators.compositeKeyWeakMapMod.CompositeKeyWeakMap[T]
  
  def assignAll[T, U](to: T, from: U): T = js.native
  def assignAll[T, U](to: T, from: U, excludes: js.Array[String]): T = js.native
  def assignProperty[T, U](to: T, from: U, prop: String): Unit = js.native
  def bind(fn: js.Function, context: js.Any): js.Function = js.native
  def copyMetadata(to: js.Any, from: js.Any): js.Any = js.native
  def isMethodOrPropertyDecoratorArgs(args: js.Any*): Boolean = js.native
  def isPrototypeAccess(context: js.Object, target: js.Object): Boolean = js.native
  def log(): String = js.native
  def log(message: String): String = js.native
  def resolveFunction(): js.Any = js.native
  def resolveFunction(
    method: js.UndefOr[scala.Nothing],
    context: js.UndefOr[scala.Nothing],
    target: js.UndefOr[scala.Nothing],
    throwNotFound: Boolean
  ): js.Any = js.native
  def resolveFunction(method: js.UndefOr[scala.Nothing], context: js.UndefOr[scala.Nothing], target: js.Any): js.Any = js.native
  def resolveFunction(
    method: js.UndefOr[scala.Nothing],
    context: js.UndefOr[scala.Nothing],
    target: js.Any,
    throwNotFound: Boolean
  ): js.Any = js.native
  def resolveFunction(method: js.UndefOr[scala.Nothing], context: js.Any): js.Any = js.native
  def resolveFunction(
    method: js.UndefOr[scala.Nothing],
    context: js.Any,
    target: js.UndefOr[scala.Nothing],
    throwNotFound: Boolean
  ): js.Any = js.native
  def resolveFunction(method: js.UndefOr[scala.Nothing], context: js.Any, target: js.Any): js.Any = js.native
  def resolveFunction(method: js.UndefOr[scala.Nothing], context: js.Any, target: js.Any, throwNotFound: Boolean): js.Any = js.native
  def resolveFunction(method: String): js.Any = js.native
  def resolveFunction(
    method: String,
    context: js.UndefOr[scala.Nothing],
    target: js.UndefOr[scala.Nothing],
    throwNotFound: Boolean
  ): js.Any = js.native
  def resolveFunction(method: String, context: js.UndefOr[scala.Nothing], target: js.Any): js.Any = js.native
  def resolveFunction(method: String, context: js.UndefOr[scala.Nothing], target: js.Any, throwNotFound: Boolean): js.Any = js.native
  def resolveFunction(method: String, context: js.Any): js.Any = js.native
  def resolveFunction(method: String, context: js.Any, target: js.UndefOr[scala.Nothing], throwNotFound: Boolean): js.Any = js.native
  def resolveFunction(method: String, context: js.Any, target: js.Any): js.Any = js.native
  def resolveFunction(method: String, context: js.Any, target: js.Any, throwNotFound: Boolean): js.Any = js.native
  def resolveFunction(method: js.Function): js.Any = js.native
  def resolveFunction(
    method: js.Function,
    context: js.UndefOr[scala.Nothing],
    target: js.UndefOr[scala.Nothing],
    throwNotFound: Boolean
  ): js.Any = js.native
  def resolveFunction(method: js.Function, context: js.UndefOr[scala.Nothing], target: js.Any): js.Any = js.native
  def resolveFunction(method: js.Function, context: js.UndefOr[scala.Nothing], target: js.Any, throwNotFound: Boolean): js.Any = js.native
  def resolveFunction(method: js.Function, context: js.Any): js.Any = js.native
  def resolveFunction(method: js.Function, context: js.Any, target: js.UndefOr[scala.Nothing], throwNotFound: Boolean): js.Any = js.native
  def resolveFunction(method: js.Function, context: js.Any, target: js.Any): js.Any = js.native
  def resolveFunction(method: js.Function, context: js.Any, target: js.Any, throwNotFound: Boolean): js.Any = js.native
  def returnAtIndex(fn: js.Function, index: Double): js.Function = js.native
  def wrapConstructor(Ctor: js.Function, wrapper: js.Function2[/* Ctor */ js.Function, /* repeated */ js.Any, _]): js.Function = js.native
}


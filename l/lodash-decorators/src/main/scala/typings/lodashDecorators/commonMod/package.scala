package typings.lodashDecorators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonMod {
  type BiTypedDecorator = js.Function0[typings.lodashDecorators.commonMod.LodashDecorator] with typings.lodashDecorators.commonMod.LodashDecorator
  type BiTypedDecorator1[T] = (js.Function1[/* arg */ js.UndefOr[T], typings.lodashDecorators.commonMod.LodashDecorator]) with typings.lodashDecorators.commonMod.LodashDecorator
  type BiTypedDecorator2[T, T2] = (js.Function2[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    typings.lodashDecorators.commonMod.LodashDecorator
  ]) with typings.lodashDecorators.commonMod.LodashDecorator
  type BiTypedDecorator3[T, T2, T3] = (js.Function3[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    /* arg3 */ js.UndefOr[T3], 
    typings.lodashDecorators.commonMod.LodashDecorator
  ]) with typings.lodashDecorators.commonMod.LodashDecorator
  type BiTypedDecoratorN = (js.Function1[/* repeated */ js.Any, typings.lodashDecorators.commonMod.LodashDecorator]) with typings.lodashDecorators.commonMod.LodashDecorator
  type BiTypedMethodDecorator = js.Function0[typings.lodashDecorators.commonMod.LodashMethodDecorator] with typings.lodashDecorators.commonMod.LodashMethodDecorator
  type BiTypedMethodDecorator1[T] = (js.Function1[/* arg */ js.UndefOr[T], typings.lodashDecorators.commonMod.LodashMethodDecorator]) with typings.lodashDecorators.commonMod.LodashMethodDecorator
  type BiTypedMethodDecorator2[T, T2] = (js.Function2[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    typings.lodashDecorators.commonMod.LodashMethodDecorator
  ]) with typings.lodashDecorators.commonMod.LodashMethodDecorator
  type BiTypedMethodDecorator3[T, T2, T3] = (js.Function3[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    /* arg3 */ js.UndefOr[T3], 
    typings.lodashDecorators.commonMod.LodashMethodDecorator
  ]) with typings.lodashDecorators.commonMod.LodashMethodDecorator
  type BiTypedMethodDecoratorN = (js.Function1[/* repeated */ js.Any, typings.lodashDecorators.commonMod.LodashMethodDecorator]) with typings.lodashDecorators.commonMod.LodashMethodDecorator
  type LodashDecorator = typings.std.MethodDecorator with typings.std.PropertyDecorator
  type LodashMethodDecorator = typings.std.MethodDecorator
  type ResolvableFunction = java.lang.String | js.Function
}

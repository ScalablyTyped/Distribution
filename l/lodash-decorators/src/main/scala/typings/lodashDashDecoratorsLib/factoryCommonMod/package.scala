package typings
package lodashDashDecoratorsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object factoryCommonMod {
  type BiTypedDecorator = js.Function0[LodashDecorator] with LodashDecorator
  type BiTypedDecorator1[T] = (js.Function1[/* arg */ js.UndefOr[T], LodashDecorator]) with LodashDecorator
  type BiTypedDecorator2[T, T2] = (js.Function2[/* arg1 */ js.UndefOr[T], /* arg2 */ js.UndefOr[T2], LodashDecorator]) with LodashDecorator
  type BiTypedDecorator3[T, T2, T3] = (js.Function3[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    /* arg3 */ js.UndefOr[T3], 
    LodashDecorator
  ]) with LodashDecorator
  type BiTypedDecoratorN = (js.Function1[/* repeated */ js.Any, LodashDecorator]) with LodashDecorator
  type BiTypedMethodDecorator = js.Function0[LodashMethodDecorator] with LodashMethodDecorator
  type BiTypedMethodDecorator1[T] = (js.Function1[/* arg */ js.UndefOr[T], LodashMethodDecorator]) with LodashMethodDecorator
  type BiTypedMethodDecorator2[T, T2] = (js.Function2[/* arg1 */ js.UndefOr[T], /* arg2 */ js.UndefOr[T2], LodashMethodDecorator]) with LodashMethodDecorator
  type BiTypedMethodDecorator3[T, T2, T3] = (js.Function3[
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[T2], 
    /* arg3 */ js.UndefOr[T3], 
    LodashMethodDecorator
  ]) with LodashMethodDecorator
  type BiTypedMethodDecoratorN = (js.Function1[/* repeated */ js.Any, LodashMethodDecorator]) with LodashMethodDecorator
  type LodashDecorator = stdLib.MethodDecorator with stdLib.PropertyDecorator
  type LodashMethodDecorator = stdLib.MethodDecorator
  type ResolvableFunction = java.lang.String | js.Function
}

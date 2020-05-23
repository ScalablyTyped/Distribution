package typings.lodash.anon

import typings.lodash.mod.MapCacheConstructor
import typings.lodash.mod.MemoizedFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Call extends js.Object {
  var Cache: MapCacheConstructor = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T): T with MemoizedFunction = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, resolver: js.Function1[/* repeated */ js.Any, _]): T with MemoizedFunction = js.native
}


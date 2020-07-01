package typings.lodash.fpMod

import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashInvokeMap extends LodashConvertible {
  def apply(methodNameOrMethod: __): LodashInvokeMap1x2 = js.native
  def apply(methodNameOrMethod: __, collection: js.Object): LodashInvokeMap1x2 = js.native
  def apply(methodName: String): js.Array[_] = js.native
  def apply(methodName: String, collection: js.Object): js.Array[_] = js.native
  def apply[TResult](method: js.Function1[/* repeated */ js.Any, TResult]): js.Array[TResult] = js.native
  def apply[TResult](method: js.Function1[/* repeated */ js.Any, TResult], collection: js.Object): js.Array[TResult] = js.native
}


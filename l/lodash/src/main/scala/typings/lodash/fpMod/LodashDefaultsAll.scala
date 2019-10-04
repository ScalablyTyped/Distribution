package typings.lodash.fpMod

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashDefaultsAll extends js.Object {
  def apply(`object`: js.Array[_]): js.Any = js.native
  def apply[TObject, TSource](`object`: js.Tuple2[TObject, TSource]): NonNullable[TSource with TObject] = js.native
  def apply[TObject, TSource1, TSource2](`object`: js.Tuple3[TObject, TSource1, TSource2]): NonNullable[TSource2 with TSource1 with TObject] = js.native
  def apply[TObject, TSource1, TSource2, TSource3](`object`: js.Tuple4[TObject, TSource1, TSource2, TSource3]): NonNullable[TSource3 with TSource2 with TSource1 with TObject] = js.native
  def apply[TObject, TSource1, TSource2, TSource3, TSource4](`object`: js.Tuple5[TObject, TSource1, TSource2, TSource3, TSource4]): NonNullable[TSource4 with TSource3 with TSource2 with TSource1 with TObject] = js.native
}


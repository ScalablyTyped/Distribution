package typings.immutable.Immutable

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Immutable.get")
@js.native
object get extends js.Object {
  def apply[V](collection: js.Array[V], key: Double): js.UndefOr[V] = js.native
  def apply[V](collection: StringDictionary[V], key: String): js.UndefOr[V] = js.native
  def apply[V, NSV](collection: js.Array[V], key: Double, notSetValue: NSV): V | NSV = js.native
  def apply[V, NSV](collection: StringDictionary[V], key: String, notSetValue: NSV): V | NSV = js.native
  def apply[K, V](collection: Collection[K, V], key: K): js.UndefOr[V] = js.native
  def apply[C /* <: js.Object */, K /* <: /* keyof C */ String */](`object`: C, key: K, notSetValue: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any = js.native
  def apply[TProps, K /* <: /* keyof TProps */ String */](record: Record[TProps], key: K, notSetValue: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any = js.native
  def apply[K, V, NSV](collection: Collection[K, V], key: K, notSetValue: NSV): V | NSV = js.native
}


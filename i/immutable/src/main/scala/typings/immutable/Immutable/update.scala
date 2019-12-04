package typings.immutable.Immutable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Immutable.update")
@js.native
object update extends js.Object {
  def apply[V](collection: js.Array[V], key: Double, updater: js.Function1[/* value */ V, V]): js.Array[V] = js.native
  def apply[V, NSV](
    collection: js.Array[V],
    key: Double,
    notSetValue: NSV,
    updater: js.Function1[/* value */ V | NSV, V]
  ): js.Array[V] = js.native
  def apply[C, K /* <: String */](
    `object`: C,
    key: K,
    updater: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
    ]
  ): C = js.native
  def apply[C, K /* <: String */, NSV](
    `object`: C,
    key: K,
    notSetValue: NSV,
    updater: js.Function1[
      /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any) | NSV, 
      /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
    ]
  ): C = js.native
}


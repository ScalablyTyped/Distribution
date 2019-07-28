package typings.jsDashData.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val belongsToType: String = js.native
  val hasManyType: String = js.native
  val hasOneType: String = js.native
  def belongsTo(related: js.Any, opts: js.Any): js.Function1[/* target */ js.Any, Unit] = js.native
  def hasMany(related: js.Any, opts: js.Any): js.Function1[/* target */ js.Any, Unit] = js.native
  def hasOne(related: js.Any, opts: js.Any): js.Function1[/* target */ js.Any, Unit] = js.native
}


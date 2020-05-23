package typings.jsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data/dist/decorators", JSImport.Namespace)
@js.native
object decoratorsMod extends js.Object {
  val belongsToType: /* "belongsTo" */ String = js.native
  val hasManyType: /* "hasMany" */ String = js.native
  val hasOneType: /* "hasOne" */ String = js.native
  def belongsTo(related: js.Any, opts: js.Any): js.Function1[/* mapper */ js.Any, Unit] = js.native
  def hasMany(related: js.Any, opts: js.Any): js.Function1[/* mapper */ js.Any, Unit] = js.native
  def hasOne(related: js.Any, opts: js.Any): js.Function1[/* mapper */ js.Any, Unit] = js.native
}


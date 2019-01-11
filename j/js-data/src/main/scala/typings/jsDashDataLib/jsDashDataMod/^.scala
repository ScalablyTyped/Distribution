package typings
package jsDashDataLib.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val belongsToType: java.lang.String = js.native
  val hasManyType: java.lang.String = js.native
  val hasOneType: java.lang.String = js.native
  val utils: jsDashDataLib.`Anon_` = js.native
  val version: jsDashDataLib.Anon_Alpha = js.native
  def belongsTo(related: js.Any, opts: js.Any): js.Function1[/* target */ js.Any, scala.Unit] = js.native
  def hasMany(related: js.Any, opts: js.Any): js.Function1[/* target */ js.Any, scala.Unit] = js.native
  def hasOne(related: js.Any, opts: js.Any): js.Function1[/* target */ js.Any, scala.Unit] = js.native
}


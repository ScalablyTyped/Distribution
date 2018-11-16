package typings
package hookerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hooker", JSImport.Namespace)
@js.native
object hookerMod extends js.Object {
  def filter(context: js.Any, args: js.Array[_]): hookerLib.HookerFilter = js.native
  def hook(`object`: js.Any, props: java.lang.String, options: hookerLib.IHookerOptions): scala.Unit = js.native
  def hook(`object`: js.Any, props: java.lang.String, prehookFunction: hookerLib.HookerPreHookFunction): scala.Unit = js.native
  def hook(`object`: js.Any, props: js.Array[java.lang.String], options: hookerLib.IHookerOptions): scala.Unit = js.native
  def hook(
    `object`: js.Any,
    props: js.Array[java.lang.String],
    prehookFunction: hookerLib.HookerPreHookFunction
  ): scala.Unit = js.native
  def orig(`object`: js.Any, props: java.lang.String): js.Function = js.native
  def orig(`object`: js.Any, props: js.Array[java.lang.String]): js.Function = js.native
  def `override`(value: js.Any): hookerLib.HookerOverride = js.native
  def preempt(value: js.Any): hookerLib.HookerPreempt = js.native
  def unhook(`object`: js.Any): js.Array[java.lang.String] = js.native
  def unhook(`object`: js.Any, props: java.lang.String): js.Array[java.lang.String] = js.native
  def unhook(`object`: js.Any, props: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
}


package typings.hooker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hooker", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def filter(context: js.Any, args: js.Array[_]): HookerFilter = js.native
  def hook(`object`: js.Any, props: String, options: IHookerOptions): Unit = js.native
  def hook(`object`: js.Any, props: String, prehookFunction: HookerPreHookFunction): Unit = js.native
  def hook(`object`: js.Any, props: js.Array[String], options: IHookerOptions): Unit = js.native
  def hook(`object`: js.Any, props: js.Array[String], prehookFunction: HookerPreHookFunction): Unit = js.native
  def orig(`object`: js.Any, props: String): js.Function = js.native
  def orig(`object`: js.Any, props: js.Array[String]): js.Function = js.native
  def `override`(value: js.Any): HookerOverride = js.native
  def preempt(value: js.Any): HookerPreempt = js.native
  def unhook(`object`: js.Any): js.Array[String] = js.native
  def unhook(`object`: js.Any, props: String): js.Array[String] = js.native
  def unhook(`object`: js.Any, props: js.Array[String]): js.Array[String] = js.native
}


package typings.hooker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hooker", "filter")
  @js.native
  def filter(context: js.Any, args: js.Array[_]): HookerFilter = js.native
  
  @JSImport("hooker", "hook")
  @js.native
  def hook(`object`: js.Any, props: String, options: IHookerOptions): Unit = js.native
  @JSImport("hooker", "hook")
  @js.native
  def hook(`object`: js.Any, props: String, prehookFunction: HookerPreHookFunction): Unit = js.native
  @JSImport("hooker", "hook")
  @js.native
  def hook(`object`: js.Any, props: js.Array[String], options: IHookerOptions): Unit = js.native
  @JSImport("hooker", "hook")
  @js.native
  def hook(`object`: js.Any, props: js.Array[String], prehookFunction: HookerPreHookFunction): Unit = js.native
  
  @JSImport("hooker", "orig")
  @js.native
  def orig(`object`: js.Any, props: String): js.Function = js.native
  @JSImport("hooker", "orig")
  @js.native
  def orig(`object`: js.Any, props: js.Array[String]): js.Function = js.native
  
  @JSImport("hooker", "preempt")
  @js.native
  def preempt(value: js.Any): HookerPreempt = js.native
  
  @JSImport("hooker", "unhook")
  @js.native
  def unhook(`object`: js.Any): js.Array[String] = js.native
  @JSImport("hooker", "unhook")
  @js.native
  def unhook(`object`: js.Any, props: String): js.Array[String] = js.native
  @JSImport("hooker", "unhook")
  @js.native
  def unhook(`object`: js.Any, props: js.Array[String]): js.Array[String] = js.native
  
  @JSImport("hooker", "override")
  @js.native
  def `override`(value: js.Any): HookerOverride = js.native
}

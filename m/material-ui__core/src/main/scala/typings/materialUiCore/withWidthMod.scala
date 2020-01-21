package typings.materialUiCore

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import typings.materialUiCore.mod.PropInjector
import typings.materialUiCore.withWidthWithWidthMod.WithWidth
import typings.materialUiCore.withWidthWithWidthMod.WithWidthOptions
import typings.materialUiCore.withWidthWithWidthMod.WithWidthProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/withWidth", JSImport.Namespace)
@js.native
object withWidthMod extends js.Object {
  def default(): PropInjector[WithWidth, WithWidthProps] = js.native
  def default(options: WithWidthOptions): PropInjector[WithWidth, WithWidthProps] = js.native
  def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = js.native
  def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = js.native
  def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = js.native
  def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = js.native
}


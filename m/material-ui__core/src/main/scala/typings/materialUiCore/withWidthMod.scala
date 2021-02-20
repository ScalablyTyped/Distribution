package typings.materialUiCore

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import typings.materialUiCore.mod.PropInjector
import typings.materialUiCore.withWidthWithWidthMod.WithWidth
import typings.materialUiCore.withWidthWithWidthMod.WithWidthOptions
import typings.materialUiCore.withWidthWithWidthMod.WithWidthProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withWidthMod {
  
  @JSImport("@material-ui/core/withWidth", JSImport.Default)
  @js.native
  def default(): PropInjector[WithWidth, WithWidthProps] = js.native
  @JSImport("@material-ui/core/withWidth", JSImport.Default)
  @js.native
  def default(options: WithWidthOptions): PropInjector[WithWidth, WithWidthProps] = js.native
  
  @JSImport("@material-ui/core/withWidth", "isWidthDown")
  @js.native
  def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = js.native
  @JSImport("@material-ui/core/withWidth", "isWidthDown")
  @js.native
  def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = js.native
  
  @JSImport("@material-ui/core/withWidth", "isWidthUp")
  @js.native
  def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = js.native
  @JSImport("@material-ui/core/withWidth", "isWidthUp")
  @js.native
  def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = js.native
}

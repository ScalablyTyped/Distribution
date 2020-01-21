package typings.jimpPluginColor

import typings.jimpPluginColor.mod.ColorActionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jimpPluginColorStrings {
  @js.native
  sealed trait blue extends ColorActionName
  
  @js.native
  sealed trait green extends ColorActionName
  
  @js.native
  sealed trait hue extends ColorActionName
  
  @js.native
  sealed trait mix extends ColorActionName
  
  @js.native
  sealed trait red extends ColorActionName
  
  @js.native
  sealed trait shade extends ColorActionName
  
  @js.native
  sealed trait tint extends ColorActionName
  
  @js.native
  sealed trait xor extends ColorActionName
  
  @scala.inline
  def blue: blue = "blue".asInstanceOf[blue]
  @scala.inline
  def green: green = "green".asInstanceOf[green]
  @scala.inline
  def hue: hue = "hue".asInstanceOf[hue]
  @scala.inline
  def mix: mix = "mix".asInstanceOf[mix]
  @scala.inline
  def red: red = "red".asInstanceOf[red]
  @scala.inline
  def shade: shade = "shade".asInstanceOf[shade]
  @scala.inline
  def tint: tint = "tint".asInstanceOf[tint]
  @scala.inline
  def xor: xor = "xor".asInstanceOf[xor]
}


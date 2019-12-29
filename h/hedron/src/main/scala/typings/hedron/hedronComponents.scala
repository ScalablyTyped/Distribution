package typings.hedron

import typings.hedron.hedronMod.BoundsProps
import typings.hedron.hedronMod.BoxProps
import typings.hedron.hedronMod.ProviderProps
import typings.react.reactMod.ComponentType
import typings.react.reactMod.HTMLProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object hedronComponents extends hedronProps {
  @scala.inline
  def Bounds: ComponentType[BoundsProps with HTMLProps[HTMLElement]] = js.constructorOf[typings.hedron.hedronMod.Bounds].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.hedron.hedronMod.BoundsProps with typings.react.reactMod.HTMLProps[typings.std.HTMLElement]]]
  @scala.inline
  def Box: ComponentType[BoxProps with HTMLProps[HTMLElement]] = js.constructorOf[typings.hedron.hedronMod.Box].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.hedron.hedronMod.BoxProps with typings.react.reactMod.HTMLProps[typings.std.HTMLElement]]]
  @scala.inline
  def Provider: ComponentType[ProviderProps with HTMLProps[HTMLElement]] = js.constructorOf[typings.hedron.hedronMod.Provider].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.hedron.hedronMod.ProviderProps with typings.react.reactMod.HTMLProps[typings.std.HTMLElement]]]
}


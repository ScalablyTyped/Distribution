package typings.hedron

import typings.hedron.mod.BoundsProps
import typings.hedron.mod.BoxProps
import typings.hedron.mod.ProviderProps
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object hedronComponents extends hedronProps {
  @scala.inline
  def Bounds: ComponentType[BoundsProps with HTMLProps[HTMLElement]] = js.constructorOf[typings.hedron.mod.Bounds].asInstanceOf[typings.react.mod.ComponentType[
  typings.hedron.mod.BoundsProps with typings.react.mod.HTMLProps[typings.std.HTMLElement]]]
  @scala.inline
  def Box: ComponentType[BoxProps with HTMLProps[HTMLElement]] = js.constructorOf[typings.hedron.mod.Box].asInstanceOf[typings.react.mod.ComponentType[
  typings.hedron.mod.BoxProps with typings.react.mod.HTMLProps[typings.std.HTMLElement]]]
  @scala.inline
  def Provider: ComponentType[ProviderProps with HTMLProps[HTMLElement]] = js.constructorOf[typings.hedron.mod.Provider].asInstanceOf[typings.react.mod.ComponentType[
  typings.hedron.mod.ProviderProps with typings.react.mod.HTMLProps[typings.std.HTMLElement]]]
}


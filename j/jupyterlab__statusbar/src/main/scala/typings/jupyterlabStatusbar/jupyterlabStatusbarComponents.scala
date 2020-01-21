package typings.jupyterlabStatusbar

import typings.jupyterlabStatusbar.groupMod.GroupItem.IProps
import typings.react.mod.ComponentType
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jupyterlabStatusbarComponents extends jupyterlabStatusbarProps {
  @scala.inline
  def GroupItem: ComponentType[IProps with HTMLAttributes[HTMLDivElement]] = typings.jupyterlabStatusbar.mod.GroupItem.asInstanceOf[typings.react.mod.ComponentType[
  typings.jupyterlabStatusbar.groupMod.GroupItem.IProps with typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement]]]
  @scala.inline
  def IconItem: ComponentType[
    typings.jupyterlabStatusbar.deprecatedMod.IconItem.IProps with HTMLAttributes[HTMLDivElement]
  ] = typings.jupyterlabStatusbar.mod.IconItem.asInstanceOf[typings.react.mod.ComponentType[
  typings.jupyterlabStatusbar.deprecatedMod.IconItem.IProps with typings.react.mod.HTMLAttributes[typings.std.HTMLDivElement]]]
  @scala.inline
  def ProgressBar: ComponentType[ProgressBarProps] = typings.jupyterlabStatusbar.mod.ProgressBar.asInstanceOf[typings.react.mod.ComponentType[ProgressBarProps]]
  @scala.inline
  def TextItem: ComponentType[
    typings.jupyterlabStatusbar.textMod.TextItem.IProps with HTMLAttributes[HTMLSpanElement]
  ] = typings.jupyterlabStatusbar.mod.TextItem.asInstanceOf[typings.react.mod.ComponentType[
  typings.jupyterlabStatusbar.textMod.TextItem.IProps with typings.react.mod.HTMLAttributes[typings.std.HTMLSpanElement]]]
}


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
  def GroupItem: ComponentType[IProps with HTMLAttributes[HTMLDivElement]] = typings.jupyterlabStatusbar.mod.GroupItem.asInstanceOf[ComponentType[IProps with HTMLAttributes[HTMLDivElement]]]
  @scala.inline
  def ProgressBar: ComponentType[ProgressBarProps] = typings.jupyterlabStatusbar.mod.ProgressBar.asInstanceOf[ComponentType[ProgressBarProps]]
  @scala.inline
  def TextItem: ComponentType[
    typings.jupyterlabStatusbar.textMod.TextItem.IProps with HTMLAttributes[HTMLSpanElement]
  ] = typings.jupyterlabStatusbar.mod.TextItem.asInstanceOf[ComponentType[
    typings.jupyterlabStatusbar.textMod.TextItem.IProps with HTMLAttributes[HTMLSpanElement]
  ]]
}


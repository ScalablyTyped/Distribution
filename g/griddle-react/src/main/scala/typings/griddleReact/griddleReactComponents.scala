package typings.griddleReact

import typings.griddleReact.mod.components.Cell
import typings.griddleReact.mod.components.ColumnDefinition
import typings.griddleReact.mod.components.Filter
import typings.griddleReact.mod.components.Row
import typings.griddleReact.mod.components.RowDefinition
import typings.griddleReact.mod.components.Settings
import typings.griddleReact.mod.components.SettingsToggle
import typings.griddleReact.mod.components.SettingsWrapper
import typings.griddleReact.mod.components.Table
import typings.griddleReact.mod.components.TableBody
import typings.griddleReact.mod.components.TableHeading
import typings.griddleReact.mod.components.TableHeadingCell
import typings.griddleReact.mod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object griddleReactComponents extends griddleReactProps {
  @scala.inline
  def ComponentsCell: ComponentType[ComponentsCellProps] = js.constructorOf[Cell].asInstanceOf[ComponentType[ComponentsCellProps]]
  @scala.inline
  def ComponentsColumnDefinition: ComponentType[ComponentsColumnDefinitionProps] = js.constructorOf[ColumnDefinition].asInstanceOf[ComponentType[ComponentsColumnDefinitionProps]]
  @scala.inline
  def ComponentsFilter: ComponentType[ComponentsFilterProps] = js.constructorOf[Filter].asInstanceOf[ComponentType[ComponentsFilterProps]]
  @scala.inline
  def ComponentsRow: ComponentType[ComponentsRowProps] = js.constructorOf[Row].asInstanceOf[ComponentType[ComponentsRowProps]]
  @scala.inline
  def ComponentsRowDefinition: ComponentType[ComponentsRowDefinitionProps] = js.constructorOf[RowDefinition].asInstanceOf[ComponentType[ComponentsRowDefinitionProps]]
  @scala.inline
  def ComponentsSettings: ComponentType[ComponentsSettingsProps] = js.constructorOf[Settings].asInstanceOf[ComponentType[ComponentsSettingsProps]]
  @scala.inline
  def ComponentsSettingsToggle: ComponentType[ComponentsSettingsToggleProps] = js.constructorOf[SettingsToggle].asInstanceOf[ComponentType[ComponentsSettingsToggleProps]]
  @scala.inline
  def ComponentsSettingsWrapper: ComponentType[ComponentsSettingsWrapperProps] = js.constructorOf[SettingsWrapper].asInstanceOf[ComponentType[ComponentsSettingsWrapperProps]]
  @scala.inline
  def ComponentsTable: ComponentType[ComponentsTableProps] = js.constructorOf[Table].asInstanceOf[ComponentType[ComponentsTableProps]]
  @scala.inline
  def ComponentsTableBody: ComponentType[ComponentsTableBodyProps] = js.constructorOf[TableBody].asInstanceOf[ComponentType[ComponentsTableBodyProps]]
  @scala.inline
  def ComponentsTableHeading: ComponentType[ComponentsTableHeadingProps] = js.constructorOf[TableHeading].asInstanceOf[ComponentType[ComponentsTableHeadingProps]]
  @scala.inline
  def ComponentsTableHeadingCell: ComponentType[ComponentsTableHeadingCellProps] = js.constructorOf[TableHeadingCell].asInstanceOf[ComponentType[ComponentsTableHeadingCellProps]]
  @scala.inline
  def GriddleReact[T]: ComponentType[GriddleReactProps[T]] = js.constructorOf[default[T]].asInstanceOf[ComponentType[GriddleReactProps[T]]]
}


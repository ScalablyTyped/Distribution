package typings.materialUiLab

import typings.materialUiCore.buttonBaseButtonBaseMod.ButtonBaseTypeMap
import typings.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiLab.alertAlertMod.AlertProps
import typings.materialUiLab.alertTitleAlertTitleMod.AlertTitleProps
import typings.materialUiLab.anon.AnchorEl
import typings.materialUiLab.autocompleteAutocompleteMod.AutocompleteProps
import typings.materialUiLab.avatarGroupAvatarGroupMod.AvatarGroupProps
import typings.materialUiLab.materialUiLabStrings.button
import typings.materialUiLab.materialUiLabStrings.div
import typings.materialUiLab.materialUiLabStrings.span
import typings.materialUiLab.paginationItemPaginationItemMod.PaginationItemTypeMap
import typings.materialUiLab.paginationPaginationMod.PaginationProps
import typings.materialUiLab.paginationUsePaginationMod.UsePaginationProps
import typings.materialUiLab.paginationUsePaginationMod.UsePaginationResult
import typings.materialUiLab.ratingRatingMod.RatingProps
import typings.materialUiLab.skeletonSkeletonMod.SkeletonTypeMap
import typings.materialUiLab.speedDialActionSpeedDialActionMod.SpeedDialActionProps
import typings.materialUiLab.speedDialIconSpeedDialIconMod.SpeedDialIconProps
import typings.materialUiLab.speedDialSpeedDialMod.SpeedDialProps
import typings.materialUiLab.tabContextTabContextMod.TabContextProps
import typings.materialUiLab.tabContextTabContextMod.TabContextValue
import typings.materialUiLab.tabListTabListMod.TabListTypeMap
import typings.materialUiLab.tabPanelTabPanelMod.TabPanelProps
import typings.materialUiLab.timelineConnectorTimelineConnectorMod.TimelineConnectorProps
import typings.materialUiLab.timelineContentTimelineContentMod.TimelineContentProps
import typings.materialUiLab.timelineDotTimelineDotMod.TimelineDotProps
import typings.materialUiLab.timelineItemTimelineItemMod.TimelineItemProps
import typings.materialUiLab.timelineOppositeContentTimelineOppositeContentMod.TimelineOppositeContentProps
import typings.materialUiLab.timelineSeparatorTimelineSeparatorMod.TimelineSeparatorProps
import typings.materialUiLab.timelineTimelineMod.TimelineProps
import typings.materialUiLab.toggleButtonGroupToggleButtonGroupMod.ToggleButtonGroupProps
import typings.materialUiLab.toggleButtonToggleButtonMod.ToggleButtonTypeMap
import typings.materialUiLab.treeItemTreeItemMod.TreeItemProps
import typings.materialUiLab.treeViewTreeViewMod.TreeViewProps
import typings.materialUiLab.useAutocompleteUseAutocompleteMod.CreateFilterOptionsConfig
import typings.materialUiLab.useAutocompleteUseAutocompleteMod.FilterOptionsState
import typings.materialUiLab.useAutocompleteUseAutocompleteMod.UseAutocompleteProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material-ui/lab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Alert(props: AlertProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Alert")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def AlertTitle(props: AlertTitleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AlertTitle")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Autocomplete[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: AutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Autocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def AvatarGroup(props: AvatarGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AvatarGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Pagination(props: PaginationProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Pagination")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    *
    * Demos:
    *
    * - [Pagination](https://mui.com/components/pagination/)
    *
    * API:
    *
    * - [PaginationItem API](https://mui.com/api/pagination-item/)
    */
  @JSImport("@material-ui/lab", "PaginationItem")
  @js.native
  val PaginationItem: OverridableComponent[PaginationItemTypeMap[js.Object, div]] = js.native
  
  inline def Rating(props: RatingProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Rating")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    *
    * Demos:
    *
    * - [Skeleton](https://mui.com/components/skeleton/)
    *
    * API:
    *
    * - [Skeleton API](https://mui.com/api/skeleton/)
    */
  @JSImport("@material-ui/lab", "Skeleton")
  @js.native
  val Skeleton: OverridableComponent[SkeletonTypeMap[js.Object, span]] = js.native
  
  inline def SpeedDial(props: SpeedDialProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SpeedDial")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SpeedDialAction(props: SpeedDialActionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SpeedDialAction")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SpeedDialIcon(props: SpeedDialIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SpeedDialIcon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TabContext(props: TabContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TabContext")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/components/tabs/)
    *
    * API:
    *
    * - [TabList API](https://mui.com/api/tab-list/)
    * - inherits [Tabs API](https://mui.com/api/tabs/)
    */
  @JSImport("@material-ui/lab", "TabList")
  @js.native
  val TabList: OverridableComponent[
    TabListTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]
  ] = js.native
  
  inline def TabPanel(props: TabPanelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TabPanel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Timeline(props: TimelineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Timeline")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TimelineConnector(props: TimelineConnectorProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineConnector")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TimelineContent(props: TimelineContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineContent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TimelineDot(props: TimelineDotProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineDot")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TimelineItem(props: TimelineItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineItem")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TimelineOppositeContent(props: TimelineOppositeContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineOppositeContent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TimelineSeparator(props: TimelineSeparatorProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineSeparator")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    *
    * Demos:
    *
    * - [Toggle Button](https://mui.com/components/toggle-button/)
    *
    * API:
    *
    * - [ToggleButton API](https://mui.com/api/toggle-button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/lab", "ToggleButton")
  @js.native
  val ToggleButton: ExtendButtonBase[ToggleButtonTypeMap[js.Object, button]] = js.native
  
  inline def ToggleButtonGroup(props: ToggleButtonGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleButtonGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TreeItem(props: TreeItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeItem")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TreeView(props: TreeViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterOptions")().asInstanceOf[js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]]
  inline def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterOptions")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]]
  
  inline def getPanelId(context: TabContextValue, tabValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPanelId")(context.asInstanceOf[js.Any], tabValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTabId(context: TabContextValue, tabValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTabId")(context.asInstanceOf[js.Any], tabValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useAutocomplete[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): AnchorEl[T, Multiple, DisableClearable, FreeSolo] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[AnchorEl[T, Multiple, DisableClearable, FreeSolo]]
  
  inline def usePagination(props: UsePaginationProps): UsePaginationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("usePagination")(props.asInstanceOf[js.Any]).asInstanceOf[UsePaginationResult]
  
  inline def useTabContext(): TabContextValue | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabContext")().asInstanceOf[TabContextValue | Null]
}

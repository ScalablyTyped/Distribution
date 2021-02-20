package typings.materialUiLab

import typings.materialUiLab.alertAlertMod.AlertProps
import typings.materialUiLab.alertTitleAlertTitleMod.AlertTitleProps
import typings.materialUiLab.anon.AnchorEl
import typings.materialUiLab.autocompleteAutocompleteMod.AutocompleteProps
import typings.materialUiLab.avatarGroupAvatarGroupMod.AvatarGroupProps
import typings.materialUiLab.paginationPaginationMod.PaginationProps
import typings.materialUiLab.ratingRatingMod.RatingProps
import typings.materialUiLab.speedDialActionSpeedDialActionMod.SpeedDialActionProps
import typings.materialUiLab.speedDialIconSpeedDialIconMod.SpeedDialIconProps
import typings.materialUiLab.speedDialSpeedDialMod.SpeedDialProps
import typings.materialUiLab.tabContextTabContextMod.TabContextProps
import typings.materialUiLab.tabContextTabContextMod.TabContextValue
import typings.materialUiLab.tabPanelTabPanelMod.TabPanelProps
import typings.materialUiLab.timelineConnectorTimelineConnectorMod.TimelineConnectorProps
import typings.materialUiLab.timelineContentTimelineContentMod.TimelineContentProps
import typings.materialUiLab.timelineDotTimelineDotMod.TimelineDotProps
import typings.materialUiLab.timelineItemTimelineItemMod.TimelineItemProps
import typings.materialUiLab.timelineOppositeContentTimelineOppositeContentMod.TimelineOppositeContentProps
import typings.materialUiLab.timelineSeparatorTimelineSeparatorMod.TimelineSeparatorProps
import typings.materialUiLab.timelineTimelineMod.TimelineProps
import typings.materialUiLab.toggleButtonGroupToggleButtonGroupMod.ToggleButtonGroupProps
import typings.materialUiLab.treeItemTreeItemMod.TreeItemProps
import typings.materialUiLab.treeViewTreeViewMod.TreeViewProps
import typings.materialUiLab.useAutocompleteUseAutocompleteMod.CreateFilterOptionsConfig
import typings.materialUiLab.useAutocompleteUseAutocompleteMod.FilterOptionsState
import typings.materialUiLab.useAutocompleteUseAutocompleteMod.UseAutocompleteProps
import typings.materialUiLab.usePaginationMod.UsePaginationProps
import typings.materialUiLab.usePaginationMod.UsePaginationResult
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material-ui/lab", "Alert")
  @js.native
  def Alert(props: AlertProps): Element = js.native
  
  @JSImport("@material-ui/lab", "AlertTitle")
  @js.native
  def AlertTitle(props: AlertTitleProps): Element = js.native
  
  @JSImport("@material-ui/lab", "Autocomplete")
  @js.native
  def Autocomplete[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: AutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): Element = js.native
  
  @JSImport("@material-ui/lab", "AvatarGroup")
  @js.native
  def AvatarGroup(props: AvatarGroupProps): Element = js.native
  
  @JSImport("@material-ui/lab", "Pagination")
  @js.native
  def Pagination(props: PaginationProps): Element = js.native
  
  /**
    *
    * Demos:
    *
    * - [Pagination](https://material-ui.com/components/pagination/)
    *
    * API:
    *
    * - [PaginationItem API](https://material-ui.com/api/pagination-item/)
    */
  @JSImport("@material-ui/lab", "PaginationItem")
  @js.native
  val PaginationItem: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<PaginationItemTypeMap> */ js.Any = js.native
  
  @JSImport("@material-ui/lab", "Rating")
  @js.native
  def Rating(props: RatingProps): Element = js.native
  
  /**
    *
    * Demos:
    *
    * - [Skeleton](https://material-ui.com/components/skeleton/)
    *
    * API:
    *
    * - [Skeleton API](https://material-ui.com/api/skeleton/)
    */
  @JSImport("@material-ui/lab", "Skeleton")
  @js.native
  val Skeleton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<SkeletonTypeMap> */ js.Any = js.native
  
  @JSImport("@material-ui/lab", "SpeedDial")
  @js.native
  def SpeedDial(props: SpeedDialProps): Element = js.native
  
  @JSImport("@material-ui/lab", "SpeedDialAction")
  @js.native
  def SpeedDialAction(props: SpeedDialActionProps): Element = js.native
  
  @JSImport("@material-ui/lab", "SpeedDialIcon")
  @js.native
  def SpeedDialIcon(props: SpeedDialIconProps): Element = js.native
  
  @JSImport("@material-ui/lab", "TabContext")
  @js.native
  def TabContext(props: TabContextProps): Element = js.native
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://material-ui.com/components/tabs/)
    *
    * API:
    *
    * - [TabList API](https://material-ui.com/api/tab-list/)
    * - inherits [Tabs API](https://material-ui.com/api/tabs/)
    */
  @JSImport("@material-ui/lab", "TabList")
  @js.native
  val TabList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<TabListTypeMap> */ js.Any = js.native
  
  @JSImport("@material-ui/lab", "TabPanel")
  @js.native
  def TabPanel(props: TabPanelProps): Element = js.native
  
  @JSImport("@material-ui/lab", "Timeline")
  @js.native
  def Timeline(props: TimelineProps): Element = js.native
  
  @JSImport("@material-ui/lab", "TimelineConnector")
  @js.native
  def TimelineConnector(props: TimelineConnectorProps): Element = js.native
  
  @JSImport("@material-ui/lab", "TimelineContent")
  @js.native
  def TimelineContent(props: TimelineContentProps): Element = js.native
  
  @JSImport("@material-ui/lab", "TimelineDot")
  @js.native
  def TimelineDot(props: TimelineDotProps): Element = js.native
  
  @JSImport("@material-ui/lab", "TimelineItem")
  @js.native
  def TimelineItem(props: TimelineItemProps): Element = js.native
  
  @JSImport("@material-ui/lab", "TimelineOppositeContent")
  @js.native
  def TimelineOppositeContent(props: TimelineOppositeContentProps): Element = js.native
  
  @JSImport("@material-ui/lab", "TimelineSeparator")
  @js.native
  def TimelineSeparator(props: TimelineSeparatorProps): Element = js.native
  
  /**
    *
    * Demos:
    *
    * - [Toggle Button](https://material-ui.com/components/toggle-button/)
    *
    * API:
    *
    * - [ToggleButton API](https://material-ui.com/api/toggle-button/)
    * - inherits [ButtonBase API](https://material-ui.com/api/button-base/)
    */
  @JSImport("@material-ui/lab", "ToggleButton")
  @js.native
  val ToggleButton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendButtonBase<ToggleButtonTypeMap> */ js.Any = js.native
  
  @JSImport("@material-ui/lab", "ToggleButtonGroup")
  @js.native
  def ToggleButtonGroup(props: ToggleButtonGroupProps): Element = js.native
  
  @JSImport("@material-ui/lab", "TreeItem")
  @js.native
  def TreeItem(props: TreeItemProps): Element = js.native
  
  @JSImport("@material-ui/lab", "TreeView")
  @js.native
  def TreeView(props: TreeViewProps): Element = js.native
  
  @JSImport("@material-ui/lab", "createFilterOptions")
  @js.native
  def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
  @JSImport("@material-ui/lab", "createFilterOptions")
  @js.native
  def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
  
  @JSImport("@material-ui/lab", "getPanelId")
  @js.native
  def getPanelId(context: TabContextValue, tabValue: String): String = js.native
  
  @JSImport("@material-ui/lab", "getTabId")
  @js.native
  def getTabId(context: TabContextValue, tabValue: String): String = js.native
  
  @JSImport("@material-ui/lab", "useAutocomplete")
  @js.native
  def useAutocomplete[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): AnchorEl[T, Multiple, DisableClearable, FreeSolo] = js.native
  
  @JSImport("@material-ui/lab", "usePagination")
  @js.native
  def usePagination(props: UsePaginationProps): UsePaginationResult = js.native
  
  @JSImport("@material-ui/lab", "useTabContext")
  @js.native
  def useTabContext(): TabContextValue | Null = js.native
}

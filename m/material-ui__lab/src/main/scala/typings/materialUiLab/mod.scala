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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material-ui/lab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Alert(props: AlertProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Alert")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def AlertTitle(props: AlertTitleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AlertTitle")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def Autocomplete[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: AutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Autocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def AvatarGroup(props: AvatarGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AvatarGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def Pagination(props: PaginationProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Pagination")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
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
  
  @scala.inline
  def Rating(props: RatingProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Rating")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
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
  
  @scala.inline
  def SpeedDial(props: SpeedDialProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SpeedDial")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def SpeedDialAction(props: SpeedDialActionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SpeedDialAction")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def SpeedDialIcon(props: SpeedDialIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SpeedDialIcon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def TabContext(props: TabContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TabContext")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
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
  
  @scala.inline
  def TabPanel(props: TabPanelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TabPanel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def Timeline(props: TimelineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Timeline")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def TimelineConnector(props: TimelineConnectorProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineConnector")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def TimelineContent(props: TimelineContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineContent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def TimelineDot(props: TimelineDotProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineDot")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def TimelineItem(props: TimelineItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineItem")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def TimelineOppositeContent(props: TimelineOppositeContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineOppositeContent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def TimelineSeparator(props: TimelineSeparatorProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TimelineSeparator")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
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
  
  @scala.inline
  def ToggleButtonGroup(props: ToggleButtonGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleButtonGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def TreeItem(props: TreeItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeItem")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def TreeView(props: TreeViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterOptions")().asInstanceOf[js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]]
  @scala.inline
  def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterOptions")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]]
  
  @scala.inline
  def getPanelId(context: TabContextValue, tabValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPanelId")(context.asInstanceOf[js.Any], tabValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getTabId(context: TabContextValue, tabValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTabId")(context.asInstanceOf[js.Any], tabValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def useAutocomplete[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): AnchorEl[T, Multiple, DisableClearable, FreeSolo] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[AnchorEl[T, Multiple, DisableClearable, FreeSolo]]
  
  @scala.inline
  def usePagination(props: UsePaginationProps): UsePaginationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("usePagination")(props.asInstanceOf[js.Any]).asInstanceOf[UsePaginationResult]
  
  @scala.inline
  def useTabContext(): TabContextValue | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabContext")().asInstanceOf[TabContextValue | Null]
  
  trait AutocompleteChangeDetails[T]
    extends StObject
       with typings.materialUiLab.useAutocompleteUseAutocompleteMod.AutocompleteChangeDetails[T]
  object AutocompleteChangeDetails {
    
    @scala.inline
    def apply[T](option: T): AutocompleteChangeDetails[T] = {
      val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteChangeDetails[T]]
    }
  }
}

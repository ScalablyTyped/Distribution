package typings.materialUiLab.propsMod

import typings.materialUiLab.alertAlertMod.AlertProps
import typings.materialUiLab.alertTitleAlertTitleMod.AlertTitleProps
import typings.materialUiLab.autocompleteAutocompleteMod.AutocompleteProps
import typings.materialUiLab.avatarGroupAvatarGroupMod.AvatarGroupProps
import typings.materialUiLab.materialUiLabStrings.div
import typings.materialUiLab.paginationItemPaginationItemMod.PaginationItemProps
import typings.materialUiLab.paginationPaginationMod.PaginationProps
import typings.materialUiLab.ratingRatingMod.RatingProps
import typings.materialUiLab.skeletonSkeletonMod.SkeletonProps
import typings.materialUiLab.speedDialActionSpeedDialActionMod.SpeedDialActionProps
import typings.materialUiLab.speedDialIconSpeedDialIconMod.SpeedDialIconProps
import typings.materialUiLab.speedDialSpeedDialMod.SpeedDialProps
import typings.materialUiLab.tabListTabListMod.TabListProps
import typings.materialUiLab.tabPanelTabPanelMod.TabPanelProps
import typings.materialUiLab.toggleButtonGroupToggleButtonGroupMod.ToggleButtonGroupProps
import typings.materialUiLab.toggleButtonToggleButtonMod.ToggleButtonProps
import typings.materialUiLab.treeItemTreeItemMod.TreeItemProps
import typings.materialUiLab.treeViewTreeViewMod.TreeViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabComponentsPropsList extends js.Object {
  var MuiAlert: AlertProps = js.native
  var MuiAlertTitle: AlertTitleProps = js.native
  var MuiAutocomplete: AutocompleteProps[_, _, _, _] = js.native
  var MuiAvatarGroup: AvatarGroupProps = js.native
  var MuiPagination: PaginationProps = js.native
  var MuiPaginationItem: PaginationItemProps[div, js.Object] = js.native
  var MuiRating: RatingProps = js.native
  var MuiSkeleton: SkeletonProps[div, js.Object] = js.native
  var MuiSpeedDial: SpeedDialProps = js.native
  var MuiSpeedDialAction: SpeedDialActionProps = js.native
  var MuiSpeedDialIcon: SpeedDialIconProps = js.native
  var MuiTabList: TabListProps[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsTypeMap * / any['defaultComponent'] */ js.Any, 
    js.Object
  ] = js.native
  var MuiTabPanel: TabPanelProps = js.native
  var MuiToggleButton: ToggleButtonProps[
    /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/lab.@material-ui/lab/ToggleButton/ToggleButton.ToggleButtonTypeMap<{}, 'button'>['defaultComponent'] */ js.Any, 
    js.Object
  ] = js.native
  var MuiToggleButtonGroup: ToggleButtonGroupProps = js.native
  var MuiTreeItem: TreeItemProps = js.native
  var MuiTreeView: TreeViewProps = js.native
}

object LabComponentsPropsList {
  @scala.inline
  def apply(
    MuiAlert: AlertProps,
    MuiAlertTitle: AlertTitleProps,
    MuiAutocomplete: AutocompleteProps[_, _, _, _],
    MuiAvatarGroup: AvatarGroupProps,
    MuiPagination: PaginationProps,
    MuiPaginationItem: PaginationItemProps[div, js.Object],
    MuiRating: RatingProps,
    MuiSkeleton: SkeletonProps[div, js.Object],
    MuiSpeedDial: SpeedDialProps,
    MuiSpeedDialAction: SpeedDialActionProps,
    MuiSpeedDialIcon: SpeedDialIconProps,
    MuiTabList: TabListProps[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsTypeMap * / any['defaultComponent'] */ js.Any, 
      js.Object
    ],
    MuiTabPanel: TabPanelProps,
    MuiToggleButton: ToggleButtonProps[
      /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/lab.@material-ui/lab/ToggleButton/ToggleButton.ToggleButtonTypeMap<{}, 'button'>['defaultComponent'] */ js.Any, 
      js.Object
    ],
    MuiToggleButtonGroup: ToggleButtonGroupProps,
    MuiTreeItem: TreeItemProps,
    MuiTreeView: TreeViewProps
  ): LabComponentsPropsList = {
    val __obj = js.Dynamic.literal(MuiAlert = MuiAlert.asInstanceOf[js.Any], MuiAlertTitle = MuiAlertTitle.asInstanceOf[js.Any], MuiAutocomplete = MuiAutocomplete.asInstanceOf[js.Any], MuiAvatarGroup = MuiAvatarGroup.asInstanceOf[js.Any], MuiPagination = MuiPagination.asInstanceOf[js.Any], MuiPaginationItem = MuiPaginationItem.asInstanceOf[js.Any], MuiRating = MuiRating.asInstanceOf[js.Any], MuiSkeleton = MuiSkeleton.asInstanceOf[js.Any], MuiSpeedDial = MuiSpeedDial.asInstanceOf[js.Any], MuiSpeedDialAction = MuiSpeedDialAction.asInstanceOf[js.Any], MuiSpeedDialIcon = MuiSpeedDialIcon.asInstanceOf[js.Any], MuiTabList = MuiTabList.asInstanceOf[js.Any], MuiTabPanel = MuiTabPanel.asInstanceOf[js.Any], MuiToggleButton = MuiToggleButton.asInstanceOf[js.Any], MuiToggleButtonGroup = MuiToggleButtonGroup.asInstanceOf[js.Any], MuiTreeItem = MuiTreeItem.asInstanceOf[js.Any], MuiTreeView = MuiTreeView.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabComponentsPropsList]
  }
  @scala.inline
  implicit class LabComponentsPropsListOps[Self <: LabComponentsPropsList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMuiAlert(value: AlertProps): Self = this.set("MuiAlert", value.asInstanceOf[js.Any])
    @scala.inline
    def setMuiAlertTitle(value: AlertTitleProps): Self = this.set("MuiAlertTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setMuiAutocomplete(value: AutocompleteProps[_, _, _, _]): Self = this.set("MuiAutocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setMuiAvatarGroup(value: AvatarGroupProps): Self = this.set("MuiAvatarGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setMuiPagination(value: PaginationProps): Self = this.set("MuiPagination", value.asInstanceOf[js.Any])
    @scala.inline
    def setMuiPaginationItem(value: PaginationItemProps[div, js.Object]): Self = this.set("MuiPaginationItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setMuiRating(value: RatingProps): Self = this.set("MuiRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setMuiSkeleton(value: SkeletonProps[div, js.Object]): Self = this.set("MuiSkeleton", value.asInstanceOf[js.Any])
    @scala.inline
    def setMuiSpeedDial(value: SpeedDialProps): Self = this.set("MuiSpeedDial", value.asInstanceOf[js.Any])
    @scala.inline
    def setMuiSpeedDialAction(value: SpeedDialActionProps): Self = this.set("MuiSpeedDialAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setMuiSpeedDialIcon(value: SpeedDialIconProps): Self = this.set("MuiSpeedDialIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setMuiTabList(
      value: TabListProps[
          /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsTypeMap * / any['defaultComponent'] */ js.Any, 
          js.Object
        ]
    ): Self = this.set("MuiTabList", value.asInstanceOf[js.Any])
    @scala.inline
    def setMuiTabPanel(value: TabPanelProps): Self = this.set("MuiTabPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMuiToggleButton(
      value: ToggleButtonProps[
          /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/lab.@material-ui/lab/ToggleButton/ToggleButton.ToggleButtonTypeMap<{}, 'button'>['defaultComponent'] */ js.Any, 
          js.Object
        ]
    ): Self = this.set("MuiToggleButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setMuiToggleButtonGroup(value: ToggleButtonGroupProps): Self = this.set("MuiToggleButtonGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setMuiTreeItem(value: TreeItemProps): Self = this.set("MuiTreeItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setMuiTreeView(value: TreeViewProps): Self = this.set("MuiTreeView", value.asInstanceOf[js.Any])
  }
  
}


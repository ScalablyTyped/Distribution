package typings.atMaterialDashUiLab

import org.scalablytyped.runtime.TopLevel
import typings.atMaterialDashUiLab.autocompleteAutocompleteMod.AutocompleteProps
import typings.atMaterialDashUiLab.avatarGroupAvatarGroupMod.AvatarGroupProps
import typings.atMaterialDashUiLab.ratingRatingMod.RatingProps
import typings.atMaterialDashUiLab.speedDialActionSpeedDialActionMod.SpeedDialActionProps
import typings.atMaterialDashUiLab.speedDialIconSpeedDialIconMod.SpeedDialIconProps
import typings.atMaterialDashUiLab.speedDialSpeedDialMod.SpeedDialProps
import typings.atMaterialDashUiLab.toggleButtonGroupToggleButtonGroupMod.ToggleButtonGroupProps
import typings.atMaterialDashUiLab.treeItemTreeItemMod.TreeItemProps
import typings.atMaterialDashUiLab.treeViewTreeViewMod.TreeViewProps
import typings.atMaterialDashUiLab.useAutocompleteUseAutocompleteMod.CreateFilterOptions
import typings.atMaterialDashUiLab.useAutocompleteUseAutocompleteMod.UseAutocompleteProps
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/lab", JSImport.Namespace)
@js.native
object atMaterialDashUiLabMod extends js.Object {
  @js.native
  class Rating protected ()
    extends Component[RatingProps, ComponentState, js.Any] {
    def this(props: RatingProps) = this()
    def this(props: RatingProps, context: js.Any) = this()
  }
  
  val Skeleton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<SkeletonTypeMap> */ js.Any = js.native
  val ToggleButton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendButtonBase<ToggleButtonTypeMap> */ js.Any = js.native
  val createFilterOptions: CreateFilterOptions = js.native
  def Autocomplete(props: AutocompleteProps): Element = js.native
  def AvatarGroup(props: AvatarGroupProps): Element | Null = js.native
  def SpeedDial(props: SpeedDialProps): Element = js.native
  def SpeedDialAction(props: SpeedDialActionProps): Element = js.native
  def SpeedDialIcon(props: SpeedDialIconProps): Element = js.native
  def ToggleButtonGroup(props: ToggleButtonGroupProps): Element = js.native
  def TreeItem(props: TreeItemProps): Element = js.native
  def TreeView(props: TreeViewProps): Element = js.native
  def useAutocomplete(props: UseAutocompleteProps): Anon_AnchorEl = js.native
  @js.native
  object Rating extends TopLevel[ComponentType[RatingProps]]
  
}


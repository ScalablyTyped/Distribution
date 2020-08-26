package typings.materialUiLab.speedDialSpeedDialMod

import typings.materialUiCore.anon.ClassName
import typings.materialUiCore.withStylesMod.StyledComponentProps
import typings.materialUiLab.anon.PartialFabProps
import typings.materialUiLab.materialUiLabStrings.down
import typings.materialUiLab.materialUiLabStrings.left
import typings.materialUiLab.materialUiLabStrings.right
import typings.materialUiLab.materialUiLabStrings.up
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any> extends any ? std.Pick<react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any>, std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement> & std.Partial</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionHandlerProps * / any>, 'classes' | 'children'>> : never */ @js.native
trait SpeedDialProps
  extends StyledComponentProps[SpeedDialClassKey]
     with ClassName {
  /**
    * Props applied to the [`Fab`](/api/fab/) element.
    */
  var FabProps: js.UndefOr[PartialFabProps] = js.native
  /**
    * The component used for the transition.
    * [Follow this guide](/components/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
    */
  var TransitionComponent: js.UndefOr[
    ComponentType[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ _
    ]
  ] = js.native
  /**
    * Props applied to the [`Transition`](http://reactcommunity.org/react-transition-group/transition#Transition-props) element.
    */
  var TransitionProps: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ js.Any
  ] = js.native
  /**
    * The aria-label of the button element.
    * Also used to provide the `id` for the `SpeedDial` element and its children.
    */
  var ariaLabel: String = js.native
  /**
    * SpeedDialActions to display when the SpeedDial is `open`.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * The direction the actions open relative to the floating action button.
    */
  var direction: js.UndefOr[up | down | left | right] = js.native
  /**
    * If `true`, the SpeedDial will be hidden.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * The icon to display in the SpeedDial Fab. The `SpeedDialIcon` component
    * provides a default Icon with animation.
    */
  var icon: js.UndefOr[ReactNode] = js.native
  /**
    * Callback fired when the component requests to be closed.
    *
    * @param {object} event The event source of the callback.
    * @param {string} reason Can be: `"toggle"`, `"blur"`, `"mouseLeave"`, `"escapeKeyDown"`.
    */
  var onClose: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[js.Object, Event], /* reason */ CloseReason, Unit]
  ] = js.native
  /**
    * Callback fired when the component requests to be open.
    *
    * @param {object} event The event source of the callback.
    * @param {string} reason Can be: `"toggle"`, `"focus"`, `"mouseEnter"`.
    */
  var onOpen: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[js.Object, Event], /* reason */ OpenReason, Unit]
  ] = js.native
  /**
    * If `true`, the SpeedDial is open.
    */
  var open: Boolean = js.native
  /**
    * The icon to display in the SpeedDial Fab when the SpeedDial is open.
    */
  var openIcon: js.UndefOr[ReactNode] = js.native
  /**
    * The duration for the transition, in milliseconds.
    * You may specify a single timeout for all transitions, or individually with an object.
    */
  var transitionDuration: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps * / any['timeout'] */ js.Any
  ] = js.native
}

object SpeedDialProps {
  @scala.inline
  def apply(ariaLabel: String, open: Boolean): SpeedDialProps = {
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeedDialProps]
  }
  @scala.inline
  implicit class SpeedDialPropsOps[Self <: SpeedDialProps] (val x: Self) extends AnyVal {
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
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def setFabProps(value: PartialFabProps): Self = this.set("FabProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFabProps: Self = this.set("FabProps", js.undefined)
    @scala.inline
    def setTransitionComponent(
      value: ComponentType[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ _
        ]
    ): Self = this.set("TransitionComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionComponent: Self = this.set("TransitionComponent", js.undefined)
    @scala.inline
    def setTransitionProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps */ js.Any
    ): Self = this.set("TransitionProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionProps: Self = this.set("TransitionProps", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDirection(value: up | down | left | right): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setOnClose(value: (/* event */ SyntheticEvent[js.Object, Event], /* reason */ CloseReason) => Unit): Self = this.set("onClose", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnOpen(value: (/* event */ SyntheticEvent[js.Object, Event], /* reason */ OpenReason) => Unit): Self = this.set("onOpen", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    @scala.inline
    def setOpenIcon(value: ReactNode): Self = this.set("openIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenIcon: Self = this.set("openIcon", js.undefined)
    @scala.inline
    def setTransitionDuration(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionProps * / any['timeout'] */ js.Any
    ): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
  }
  
}


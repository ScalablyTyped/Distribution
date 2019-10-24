package typings.atIonicReact

import org.scalablytyped.runtime.StringDictionary
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPopoverElement
import typings.atIonicCore.distTypesComponentsPopoverPopoverDashInterfaceMod.PopoverOptions
import typings.atIonicCore.distTypesInterfaceMod.ComponentRef
import typings.atIonicReact.atIonicReactStrings.animated
import typings.atIonicReact.atIonicReactStrings.backdropDismiss
import typings.atIonicReact.atIonicReactStrings.cssClass
import typings.atIonicReact.atIonicReactStrings.delegate
import typings.atIonicReact.atIonicReactStrings.enterAnimation
import typings.atIonicReact.atIonicReactStrings.event
import typings.atIonicReact.atIonicReactStrings.id
import typings.atIonicReact.atIonicReactStrings.keyboardClose
import typings.atIonicReact.atIonicReactStrings.leaveAnimation
import typings.atIonicReact.atIonicReactStrings.mode
import typings.atIonicReact.atIonicReactStrings.showBackdrop
import typings.atIonicReact.atIonicReactStrings.translucent
import typings.atIonicReact.distTypesComponentsCreateOverlayComponentMod.ReactOverlayProps
import typings.react.reactMod.ReactInstance
import typings.react.reactMod.ReactPortal
import typings.std.HTMLDivElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AnimatedBackdropDismiss extends js.Object {
  var context: js.Any = js.native
  var el: HTMLDivElement = js.native
  var overlay: js.UndefOr[HTMLIonPopoverElement] = js.native
  val props: (Pick[
    PopoverOptions[ComponentRef], 
    id | mode | animated | translucent | showBackdrop | backdropDismiss | cssClass | delegate | keyboardClose | enterAnimation | leaveAnimation | event
  ]) with Anon_ChildrenReactNode with ReactOverlayProps with Anon_Children = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var state: js.Object = js.native
  def componentDidMount(): Unit = js.native
  def componentDidUpdate(
    prevProps: (Pick[
      PopoverOptions[ComponentRef], 
      id | mode | animated | translucent | showBackdrop | backdropDismiss | cssClass | delegate | keyboardClose | enterAnimation | leaveAnimation | event
    ]) with Anon_ChildrenReactNode with ReactOverlayProps
  ): js.Promise[Unit] = js.native
  def componentWillUnmount(): Unit = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  def present(): js.Promise[Unit] = js.native
  def present(
    prevProps: (Pick[
      PopoverOptions[ComponentRef], 
      id | mode | animated | translucent | showBackdrop | backdropDismiss | cssClass | delegate | keyboardClose | enterAnimation | leaveAnimation | event
    ]) with Anon_ChildrenReactNode with ReactOverlayProps
  ): js.Promise[Unit] = js.native
  def render(): ReactPortal = js.native
  def setState[K /* <: scala.Nothing */](): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ (Pick[
        PopoverOptions[ComponentRef], 
        id | mode | animated | translucent | showBackdrop | backdropDismiss | cssClass | delegate | keyboardClose | enterAnimation | leaveAnimation | event
      ]) with Anon_ChildrenReactNode with ReactOverlayProps, 
      js.Object | (Pick[js.Object, K]) | Null
    ]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ (Pick[
        PopoverOptions[ComponentRef], 
        id | mode | animated | translucent | showBackdrop | backdropDismiss | cssClass | delegate | keyboardClose | enterAnimation | leaveAnimation | event
      ]) with Anon_ChildrenReactNode with ReactOverlayProps, 
      js.Object | (Pick[js.Object, K]) | Null
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: Null, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: Pick[js.Object, K]): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: Pick[js.Object, K], callback: js.Function0[Unit]): Unit = js.native
}


package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonSegmentElement
import typings.ionicCore.gestureMod.GestureDetail
import typings.ionicCore.mod.Color
import typings.ionicCore.mod.StyleEventDetail
import typings.ionicCore.segmentSegmentInterfaceMod.SegmentChangeEventDetail
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/segment/segment", JSImport.Namespace)
@js.native
object segmentMod extends js.Object {
  @js.native
  class Segment () extends ComponentInterface {
    var activate: js.Any = js.native
    var activated: Boolean = js.native
    /**
      * The gesture blocks the segment button ripple. This
      * function adds the ripple based on the checked segment
      * and where the cursor ended.
      */
    var addRipple: js.Any = js.native
    var checkButton: js.Any = js.native
    var checked: js.Any = js.native
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    var didInit: js.Any = js.native
    /**
      * If `true`, the user cannot interact with the segment.
      */
    var disabled: Boolean = js.native
    var el: HTMLIonSegmentElement = js.native
    var emitStyle: js.Any = js.native
    var gesture: js.Any = js.native
    var gestureChanged: js.Any = js.native
    var getButtons: js.Any = js.native
    var getIndicator: js.Any = js.native
    /**
      * Emitted when the value property has changed and any
      * dragging pointer has been released from `ion-segment`.
      */
    var ionChange: EventEmitter[SegmentChangeEventDetail] = js.native
    /**
      * Emitted when user has dragged over a new button
      * @internal
      */
    var ionSelect: EventEmitter[SegmentChangeEventDetail] = js.native
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    var onClick: js.Any = js.native
    /**
      * If `true`, the segment buttons will overflow and the user can swipe to see them.
      * In addition, this will disable the gesture to drag the indicator between the buttons
      * in order to swipe to see hidden buttons.
      */
    var scrollable: Boolean = js.native
    var setActivated: js.Any = js.native
    var setCheckedClasses: js.Any = js.native
    var setNextIndex: js.Any = js.native
    /**
      * the value of the segment.
      */
    var value: js.UndefOr[String | Null] = js.native
    var valueAfterGesture: js.Any = js.native
    @JSName("componentDidLoad")
    def componentDidLoad_MSegment(): js.Promise[Unit] = js.native
    @JSName("componentWillLoad")
    def componentWillLoad_MSegment(): Unit = js.native
    @JSName("connectedCallback")
    def connectedCallback_MSegment(): Unit = js.native
    def disabledChanged(): Unit = js.native
    def onEnd(detail: GestureDetail): Unit = js.native
    def onMove(detail: GestureDetail): Unit = js.native
    def onStart(detail: GestureDetail): Unit = js.native
    @JSName("render")
    def render_MSegment(): js.Any = js.native
    /* protected */ def valueChanged(): Unit = js.native
    /* protected */ def valueChanged(value: js.UndefOr[scala.Nothing], oldValue: String): Unit = js.native
    /* protected */ def valueChanged(value: String): Unit = js.native
    /* protected */ def valueChanged(value: String, oldValue: String): Unit = js.native
  }
  
}


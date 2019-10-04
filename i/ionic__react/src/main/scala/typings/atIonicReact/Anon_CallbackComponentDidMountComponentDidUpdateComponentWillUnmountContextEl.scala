package typings.atIonicReact

import org.scalablytyped.runtime.StringDictionary
import typings.atIonicReact.distTypesComponentsCreateOverlayComponentMod.OverlayElement
import typings.atIonicReact.distTypesComponentsCreateOverlayComponentMod.ReactOverlayProps
import typings.react.reactMod.ReactInstance
import typings.react.reactMod.ReactPortal
import typings.std.HTMLDivElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackComponentDidMountComponentDidUpdateComponentWillUnmountContextEl[OverlayType /* <: OverlayElement */, T /* <: js.Object */] extends js.Object {
  var context: js.Any = js.native
  var el: HTMLDivElement = js.native
  var overlay: js.UndefOr[OverlayType] = js.native
  val props: T with ReactOverlayProps with Anon_Children = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var state: js.Object = js.native
  def componentDidMount(): Unit = js.native
  def componentDidUpdate(prevProps: T with ReactOverlayProps): js.Promise[Unit] = js.native
  def componentWillUnmount(): Unit = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  def present(): js.Promise[Unit] = js.native
  def present(prevProps: T with ReactOverlayProps): js.Promise[Unit] = js.native
  def render(): ReactPortal = js.native
  def setState[K /* <: scala.Nothing */](): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ T with ReactOverlayProps, 
      js.Object | (Pick[js.Object, K]) | Null
    ]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ T with ReactOverlayProps, 
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


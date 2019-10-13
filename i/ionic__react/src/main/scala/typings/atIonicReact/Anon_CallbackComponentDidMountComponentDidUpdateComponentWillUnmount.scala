package typings.atIonicReact

import org.scalablytyped.runtime.StringDictionary
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonToastElement
import typings.atIonicReact.distTypesComponentsCreateControllerComponentMod.ReactControllerProps
import typings.react.reactMod.ReactInstance
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackComponentDidMountComponentDidUpdateComponentWillUnmount extends js.Object {
  var context: js.Any = js.native
  var overlay: js.UndefOr[HTMLIonToastElement] = js.native
  val props: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ToastOptions */ js.Any) with ReactControllerProps with Anon_Children = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var state: js.Object = js.native
  def componentDidMount(): js.Promise[Unit] = js.native
  def componentDidUpdate(
    prevProps: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ToastOptions */ js.Any) with ReactControllerProps
  ): js.Promise[Unit] = js.native
  def componentWillUnmount(): Unit = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  def present(): js.Promise[Unit] = js.native
  def present(
    prevProps: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ToastOptions */ js.Any) with ReactControllerProps
  ): js.Promise[Unit] = js.native
  def render(): Null = js.native
  def setState[K /* <: scala.Nothing */](): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ToastOptions */ js.Any) with ReactControllerProps, 
      js.Object | (Pick[js.Object, K]) | Null
    ]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ToastOptions */ js.Any) with ReactControllerProps, 
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


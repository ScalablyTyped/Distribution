package typings.atIonicReact

import org.scalablytyped.runtime.StringDictionary
import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonActionSheetElement
import typings.atIonicReact.distTypesComponentsReactPropsMod.ReactProps
import typings.react.reactMod.ErrorInfo
import typings.react.reactMod.ReactInstance
import typings.react.reactMod.ReactPortal
import typings.std.Error
import typings.std.HTMLDivElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallBack extends js.Object {
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  var UNSAFE_componentWillReceiveProps: js.UndefOr[
    js.Function2[
      /* nextProps */ (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JSX.IonActionSheet */ js.Any) with ReactProps with Anon_Children, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JSX.IonActionSheet */ js.Any) with ReactProps with Anon_Children, 
      /* nextState */ js.Object, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillReceiveProps: js.UndefOr[
    js.Function2[
      /* nextProps */ (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JSX.IonActionSheet */ js.Any) with ReactProps with Anon_Children, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JSX.IonActionSheet */ js.Any) with ReactProps with Anon_Children, 
      /* nextState */ js.Object, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  var context: js.Any = js.native
  var controller: HTMLIonActionSheetElement = js.native
  var el: HTMLDivElement = js.native
  var getSnapshotBeforeUpdate: js.UndefOr[
    js.Function2[
      /* prevProps */ (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JSX.IonActionSheet */ js.Any) with ReactProps with Anon_Children, 
      /* prevState */ js.Object, 
      _
    ]
  ] = js.native
  val props: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JSX.IonActionSheet */ js.Any) with ReactProps with Anon_Children with Anon_ChildrenReactNode = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JSX.IonActionSheet */ js.Any) with ReactProps with Anon_Children, 
      /* nextState */ js.Object, 
      /* nextContext */ js.Any, 
      Boolean
    ]
  ] = js.native
  var state: js.Object = js.native
  def componentDidMount(): Unit = js.native
  def componentDidUpdate(
    prevProps: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JSX.IonActionSheet */ js.Any) with ReactProps with Anon_Children
  ): js.Promise[Unit] = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[Unit]): Unit = js.native
  def present(): js.Promise[Unit] = js.native
  def present(
    prevProps: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JSX.IonActionSheet */ js.Any) with ReactProps with Anon_Children
  ): js.Promise[Unit] = js.native
  def render(): ReactPortal = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JSX.IonActionSheet */ js.Any) with ReactProps with Anon_Children, 
      js.Object | (Pick[js.Object, K])
    ]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JSX.IonActionSheet */ js.Any) with ReactProps with Anon_Children, 
      js.Object | (Pick[js.Object, K])
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: Pick[js.Object, K]): Unit = js.native
  def setState[K /* <: scala.Nothing */](state: Pick[js.Object, K], callback: js.Function0[Unit]): Unit = js.native
}


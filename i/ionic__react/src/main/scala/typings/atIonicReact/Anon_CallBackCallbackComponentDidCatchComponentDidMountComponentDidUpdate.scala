package typings.atIonicReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ErrorInfo
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.ReactInstance
import typings.react.reactMod.RefObject
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallBackCallbackComponentDidCatchComponentDidMountComponentDidUpdate extends js.Object {
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  var UNSAFE_componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ js.Any, /* nextContext */ js.Any, Unit]] = js.native
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ js.Any, /* nextState */ js.Any, /* nextContext */ js.Any, Unit]
  ] = js.native
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ js.Any, 
      /* prevState */ js.Any, 
      /* snapshot */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var componentRef: RefObject[_] = js.native
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ js.Any, /* nextContext */ js.Any, Unit]] = js.native
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ js.Any, /* nextState */ js.Any, /* nextContext */ js.Any, Unit]
  ] = js.native
  var context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@ionic/react/dist/types/lifecycle/IonLifeCycleContext.IonLifeCycleContextInterface */ js.Any = js.native
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ js.Any, /* prevState */ js.Any, _]] = js.native
  val props: js.Any with Anon_ChildrenReactNode = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[/* nextProps */ js.Any, /* nextState */ js.Any, /* nextContext */ js.Any, Boolean]
  ] = js.native
  var state: js.Any = js.native
  def componentDidMount(): Unit = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[Unit]): Unit = js.native
  def render(): Element = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[Unit]): Unit = js.native
}


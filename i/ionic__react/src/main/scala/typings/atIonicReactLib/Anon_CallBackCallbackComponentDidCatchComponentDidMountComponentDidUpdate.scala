package typings
package atIonicReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallBackCallbackComponentDidCatchComponentDidMountComponentDidUpdate extends js.Object {
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var UNSAFE_componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ js.Any, /* nextContext */ js.Any, scala.Unit]] = js.native
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ js.Any, /* nextState */ js.Any, /* nextContext */ js.Any, scala.Unit]
  ] = js.native
  var componentDidCatch: js.UndefOr[
    js.Function2[/* error */ stdLib.Error, /* errorInfo */ reactLib.reactMod.ErrorInfo, scala.Unit]
  ] = js.native
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ js.Any, 
      /* prevState */ js.Any, 
      /* snapshot */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.native
  var componentRef: reactLib.reactMod.RefObject[_] = js.native
  var componentWillMount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ js.Any, /* nextContext */ js.Any, scala.Unit]] = js.native
  var componentWillUnmount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ js.Any, /* nextState */ js.Any, /* nextContext */ js.Any, scala.Unit]
  ] = js.native
  var context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_@ionic/react/dist/types/lifecycle/IonLifeCycleContext.IonLifeCycleContextInterface */ js.Any = js.native
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ js.Any, /* prevState */ js.Any, _]] = js.native
  val props: js.Any with Anon_ChildrenReactNode = js.native
  var refs: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactInstance] = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ js.Any, 
      /* nextState */ js.Any, 
      /* nextContext */ js.Any, 
      scala.Boolean
    ]
  ] = js.native
  var state: js.Any = js.native
  def componentDidMount(): scala.Unit = js.native
  def forceUpdate(): scala.Unit = js.native
  def forceUpdate(callBack: js.Function0[scala.Unit]): scala.Unit = js.native
  def render(): reactLib.reactMod.Global.JSXNs.Element = js.native
  def setState[K /* <: java.lang.String | scala.Double | js.Symbol */](state: js.Any): scala.Unit = js.native
  def setState[K /* <: java.lang.String | scala.Double | js.Symbol */](state: js.Any, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}


package typings.ionicReact.anon

import org.scalablytyped.runtime.StringDictionary
import typings.ionicReact.ionLifeCycleContextMod.IonLifeCycleContextInterface
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.react.mod.ErrorInfo
import typings.react.mod.ReactInstance
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDidCatch extends StObject {
  
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var UNSAFE_componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ js.Any, /* nextContext */ js.Any, Unit]] = js.native
  
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ js.Any, /* nextState */ js.Any, /* nextContext */ js.Any, Unit]
  ] = js.native
  
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ Error, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  def componentDidMount(): Unit = js.native
  
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ js.Any, 
      /* prevState */ js.Any, 
      /* snapshot */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  var componentRef: RefObject[js.Any] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ js.Any, /* nextContext */ js.Any, Unit]] = js.native
  
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ js.Any, /* nextState */ js.Any, /* nextContext */ js.Any, Unit]
  ] = js.native
  
  var context: ContextType[Context[IonLifeCycleContextInterface]] = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ js.Any, /* prevState */ js.Any, js.Any]] = js.native
  
  val props: js.Any & ReadonlychildrenReactNode = js.native
  
  var refs: StringDictionary[ReactInstance] = js.native
  
  def render(): Element = js.native
  
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[Unit]): Unit = js.native
  
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[/* nextProps */ js.Any, /* nextState */ js.Any, /* nextContext */ js.Any, Boolean]
  ] = js.native
  
  var state: js.Any = js.native
}

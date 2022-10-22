package typings.inferno.distCoreTypesMod

import typings.inferno.anon.Children
import typings.inferno.distCoreTypesMod.Inferno.InfernoNode
import typings.std.Element
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComponent[P, S] extends StObject {
  
  var componentDidAppear: js.UndefOr[js.Function1[/* domNode */ Element, Unit]] = js.native
  
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentDidUpdate: js.UndefOr[
    js.Function3[/* prevProps */ Children & P, /* prevState */ S, /* snapshot */ Any, Unit]
  ] = js.native
  
  var componentWillDisappear: js.UndefOr[js.Function2[/* domNode */ Element, /* callback */ js.Function, Unit]] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ Children & P, /* nextContext */ Any, Unit]] = js.native
  
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ Children & P, /* nextState */ S, /* context */ Any, Unit]
  ] = js.native
  
  var context: js.UndefOr[Any] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  def forceUpdate(): Any = js.native
  def forceUpdate(callback: js.Function): Any = js.native
  
  var getChildContext: js.UndefOr[js.Function0[Unit]] = js.native
  
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* prevProps */ Children & P, /* prevState */ S, Any]] = js.native
  
  var props: Children & P = js.native
  
  var refs: js.UndefOr[Any] = js.native
  
  def render(nextProps: Children & P, nextState: S, nextContext: Any): InfernoNode = js.native
  
  def setState[K /* <: /* keyof S */ String */](): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](newState: (Pick[S, K]) | S): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](newState: (Pick[S, K]) | S, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](newState: js.Function2[/* prevState */ S, /* props */ Children & P, (Pick[S, K]) | S | Null]): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](
    newState: js.Function2[/* prevState */ S, /* props */ Children & P, (Pick[S, K]) | S | Null],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](newState: Null, callback: js.Function0[Unit]): Unit = js.native
  
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[/* nextProps */ Children & P, /* nextState */ S, /* context */ Any, Boolean]
  ] = js.native
  
  var state: S | Null = js.native
}

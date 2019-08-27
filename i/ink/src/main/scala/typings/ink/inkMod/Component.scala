package typings.ink.inkMod

import typings.ink.Anon_Children
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ink", "Component")
@js.native
abstract class Component[P /* <: Record[String, _] */, S /* <: Record[String, _] */, C /* <: Record[String, _] */] () extends js.Object {
  def this(props: P) = this()
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentDidUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillReceiveProps: js.UndefOr[
    js.Function2[/* nextProps */ js.Object with Anon_Children, /* nextState */ js.Object, Unit]
  ] = js.native
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function2[/* nextProps */ js.Object with Anon_Children, /* nextState */ js.Object, Unit]
  ] = js.native
  val context: C = js.native
  var getChildContext: js.UndefOr[js.Function0[js.Function0[Record[String, _]]]] = js.native
  val props: P with Anon_Children = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.Function2[/* nextProps */ js.Object with Anon_Children, /* nextState */ js.Object, Unit]
  ] = js.native
  var state: S = js.native
  def render(props: js.Object with Anon_Children, state: js.Object, context: js.Object): InkElement = js.native
  def setState(nextState: js.Function1[/* state */ js.Object, Partial[js.Object]]): Unit = js.native
  def setState(nextState: js.Function1[/* state */ js.Object, Partial[js.Object]], callback: js.Function0[Unit]): Unit = js.native
  def setState(nextState: Partial[js.Object]): Unit = js.native
  def setState(nextState: Partial[js.Object], callback: js.Function0[Unit]): Unit = js.native
}


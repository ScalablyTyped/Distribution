package typings.atIonicReact

import org.scalablytyped.runtime.StringDictionary
import typings.atIonicReact.distTypesContextsIonLifeCycleContextMod.IonLifeCycleContextInterface
import typings.react.reactMod.ReactInstance
import typings.react.reactMod.RefObject
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackComponentDidMountComponentRef extends js.Object {
  var componentRef: RefObject[_] = js.native
  var context: IonLifeCycleContextInterface = js.native
  val props: js.Any with Anon_Children = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var state: js.Any = js.native
  def componentDidMount(): Unit = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  def render(): Element = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[Unit]): Unit = js.native
}


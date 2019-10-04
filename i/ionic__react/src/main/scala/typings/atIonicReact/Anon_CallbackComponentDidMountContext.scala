package typings.atIonicReact

import org.scalablytyped.runtime.StringDictionary
import typings.atIonicReact.distTypesComponentsIonicReactPropsMod.IonicReactProps
import typings.atIonicReact.distTypesContextsNavContextMod.NavContextState
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactInstance
import typings.react.reactMod.RefObject
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackComponentDidMountContext extends js.Object {
  var context: NavContextState = js.native
  val props: HTMLAttributes[HTMLElement] with IonicReactProps with Anon_Children = js.native
  var ref: RefObject[HTMLDivElement] = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var state: js.Object = js.native
  def componentDidMount(): Unit = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  def render(): Element = js.native
  def setState[K /* <: scala.Nothing */](): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ HTMLAttributes[HTMLElement] with IonicReactProps, 
      js.Object | (Pick[js.Object, K]) | Null
    ]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ HTMLAttributes[HTMLElement] with IonicReactProps, 
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


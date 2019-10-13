package typings.atIonicReact

import org.scalablytyped.runtime.StringDictionary
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonRouterOutletElement
import typings.atIonicReact.distTypesComponentsNavigationIonTabsMod.Props
import typings.atIonicReact.distTypesContextsNavContextMod.NavContextState
import typings.react.reactMod.ReactInstance
import typings.react.reactMod.Ref
import typings.react.reactMod._Global_.JSX.Element
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackContext extends js.Object {
  var context: NavContextState = js.native
  val props: Props with Anon_Children = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var routerOutletRef: Ref[HTMLIonRouterOutletElement] = js.native
  var state: js.Object = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  def render(): Element = js.native
  def setState[K /* <: scala.Nothing */](): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ Props, 
      js.Object | (Pick[js.Object, K]) | Null
    ]
  ): Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ Props, 
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


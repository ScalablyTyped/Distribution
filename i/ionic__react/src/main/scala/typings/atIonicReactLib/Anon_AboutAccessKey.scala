package typings
package atIonicReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AboutAccessKey extends js.Object {
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var UNSAFE_componentWillReceiveProps: js.UndefOr[
    js.Function2[
      /* nextProps */ Anon_ChildrenEvent with (stdLib.Pick[
        atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonPopoverAttributes, 
        /* import warning: LimitUnionLength.enterTypeRef Was union type with length 177 */ js.Any
      ]), 
      /* nextContext */ js.Any, 
      scala.Unit
    ]
  ] = js.native
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ Anon_ChildrenEvent with (stdLib.Pick[
        atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonPopoverAttributes, 
        /* import warning: LimitUnionLength.enterTypeRef Was union type with length 177 */ js.Any
      ]), 
      /* nextState */ js.Object, 
      /* nextContext */ js.Any, 
      scala.Unit
    ]
  ] = js.native
  var componentDidCatch: js.UndefOr[
    js.Function2[/* error */ stdLib.Error, /* errorInfo */ reactLib.reactMod.ErrorInfo, scala.Unit]
  ] = js.native
  var componentWillMount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentWillReceiveProps: js.UndefOr[
    js.Function2[
      /* nextProps */ Anon_ChildrenEvent with (stdLib.Pick[
        atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonPopoverAttributes, 
        /* import warning: LimitUnionLength.enterTypeRef Was union type with length 177 */ js.Any
      ]), 
      /* nextContext */ js.Any, 
      scala.Unit
    ]
  ] = js.native
  var componentWillUnmount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ Anon_ChildrenEvent with (stdLib.Pick[
        atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonPopoverAttributes, 
        /* import warning: LimitUnionLength.enterTypeRef Was union type with length 177 */ js.Any
      ]), 
      /* nextState */ js.Object, 
      /* nextContext */ js.Any, 
      scala.Unit
    ]
  ] = js.native
  var context: js.Any = js.native
  var controllerElement: atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonPopoverControllerElement = js.native
  var el: stdLib.HTMLDivElement = js.native
  var element: atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonPopoverElement = js.native
  var getSnapshotBeforeUpdate: js.UndefOr[
    js.Function2[
      /* prevProps */ Anon_ChildrenEvent with (stdLib.Pick[
        atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonPopoverAttributes, 
        /* import warning: LimitUnionLength.enterTypeRef Was union type with length 177 */ js.Any
      ]), 
      /* prevState */ js.Object, 
      _
    ]
  ] = js.native
  val props: Anon_ChildrenReactNode with Anon_ChildrenEvent with (stdLib.Pick[
    atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonPopoverAttributes, 
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 177 */ js.Any
  ]) = js.native
  var refs: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactInstance] = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ Anon_ChildrenEvent with (stdLib.Pick[
        atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonPopoverAttributes, 
        /* import warning: LimitUnionLength.enterTypeRef Was union type with length 177 */ js.Any
      ]), 
      /* nextState */ js.Object, 
      /* nextContext */ js.Any, 
      scala.Boolean
    ]
  ] = js.native
  var state: js.Object = js.native
  def componentDidMount(): scala.Unit = js.native
  def componentDidUpdate(
    prevProps: Anon_ChildrenEvent with (stdLib.Pick[
      atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonPopoverAttributes, 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 177 */ js.Any
    ])
  ): js.Promise[scala.Unit] = js.native
  def forceUpdate(): scala.Unit = js.native
  def forceUpdate(callBack: js.Function0[scala.Unit]): scala.Unit = js.native
  def render(): reactLib.reactMod.ReactPortal = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ Anon_ChildrenEvent with (stdLib.Pick[
        atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonPopoverAttributes, 
        /* import warning: LimitUnionLength.enterTypeRef Was union type with length 177 */ js.Any
      ]), 
      js.Object | (stdLib.Pick[js.Object, K])
    ]
  ): scala.Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ js.Object, 
      /* props */ Anon_ChildrenEvent with (stdLib.Pick[
        atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonPopoverAttributes, 
        /* import warning: LimitUnionLength.enterTypeRef Was union type with length 177 */ js.Any
      ]), 
      js.Object | (stdLib.Pick[js.Object, K])
    ],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object): scala.Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setState[K /* <: scala.Nothing */](state: stdLib.Pick[js.Object, K]): scala.Unit = js.native
  def setState[K /* <: scala.Nothing */](state: stdLib.Pick[js.Object, K], callback: js.Function0[scala.Unit]): scala.Unit = js.native
}


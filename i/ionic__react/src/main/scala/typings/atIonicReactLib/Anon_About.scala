package typings
package atIonicReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_About extends js.Object {
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var UNSAFE_componentWillReceiveProps: js.UndefOr[
    js.Function2[
      /* nextProps */ stdLib.Readonly[
        Anon_ChildrenEvent with (stdLib.Pick[
          atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonModalAttributes, 
          /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any
        ])
      ], 
      /* nextContext */ js.Any, 
      scala.Unit
    ]
  ] = js.native
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ stdLib.Readonly[
        Anon_ChildrenEvent with (stdLib.Pick[
          atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonModalAttributes, 
          /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any
        ])
      ], 
      /* nextState */ stdLib.Readonly[js.Object], 
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
      /* nextProps */ stdLib.Readonly[
        Anon_ChildrenEvent with (stdLib.Pick[
          atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonModalAttributes, 
          /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any
        ])
      ], 
      /* nextContext */ js.Any, 
      scala.Unit
    ]
  ] = js.native
  var componentWillUnmount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ stdLib.Readonly[
        Anon_ChildrenEvent with (stdLib.Pick[
          atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonModalAttributes, 
          /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any
        ])
      ], 
      /* nextState */ stdLib.Readonly[js.Object], 
      /* nextContext */ js.Any, 
      scala.Unit
    ]
  ] = js.native
  var context: js.Any = js.native
  var controllerElement: atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonModalControllerElement = js.native
  var el: stdLib.HTMLDivElement = js.native
  var element: atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonModalElement = js.native
  var getSnapshotBeforeUpdate: js.UndefOr[
    js.Function2[
      /* prevProps */ stdLib.Readonly[
        Anon_ChildrenEvent with (stdLib.Pick[
          atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonModalAttributes, 
          /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any
        ])
      ], 
      /* prevState */ stdLib.Readonly[js.Object], 
      _
    ]
  ] = js.native
  val props: stdLib.Readonly[Anon_ChildrenReactNode] with (stdLib.Readonly[
    Anon_ChildrenEvent with (stdLib.Pick[
      atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonModalAttributes, 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any
    ])
  ]) = js.native
  var refs: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactInstance] = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ stdLib.Readonly[
        Anon_ChildrenEvent with (stdLib.Pick[
          atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonModalAttributes, 
          /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any
        ])
      ], 
      /* nextState */ stdLib.Readonly[js.Object], 
      /* nextContext */ js.Any, 
      scala.Boolean
    ]
  ] = js.native
  var state: stdLib.Readonly[js.Object] = js.native
  def componentDidMount(): scala.Unit = js.native
  def componentDidUpdate(
    prevProps: Anon_ChildrenEvent with (stdLib.Pick[
      atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonModalAttributes, 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any
    ])
  ): js.Promise[scala.Unit] = js.native
  def forceUpdate(): scala.Unit = js.native
  def forceUpdate(callBack: js.Function0[scala.Unit]): scala.Unit = js.native
  def render(): reactLib.reactMod.ReactPortal = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ stdLib.Readonly[js.Object], 
      /* props */ stdLib.Readonly[
        Anon_ChildrenEvent with (stdLib.Pick[
          atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonModalAttributes, 
          /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any
        ])
      ], 
      js.Object | (stdLib.Pick[js.Object, K])
    ]
  ): scala.Unit = js.native
  def setState[K /* <: scala.Nothing */](
    state: js.Function2[
      /* prevState */ stdLib.Readonly[js.Object], 
      /* props */ stdLib.Readonly[
        Anon_ChildrenEvent with (stdLib.Pick[
          atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonModalAttributes, 
          /* import warning: LimitUnionLength.enterTypeRef Was union type with length 175 */ js.Any
        ])
      ], 
      js.Object | (stdLib.Pick[js.Object, K])
    ],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object): scala.Unit = js.native
  def setState[K /* <: scala.Nothing */](state: js.Object, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setState[K /* <: scala.Nothing */](state: stdLib.Pick[js.Object, K]): scala.Unit = js.native
  def setState[K /* <: scala.Nothing */](state: stdLib.Pick[js.Object, K], callback: js.Function0[scala.Unit]): scala.Unit = js.native
}


package typings.kosDashCore.kosDashCoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.kosDashCore.Anon_Payload
import typings.kosDashCore.Anon_PayloadAnonParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KosModel[T] extends js.Object {
  var asyncs: StringDictionary[
    js.Function3[
      /* dispatch */ js.UndefOr[KosDispatch], 
      /* getState */ js.UndefOr[GetKosState[T]], 
      /* action */ js.UndefOr[Anon_Payload[T]], 
      Unit
    ]
  ]
  var getAsync: js.UndefOr[
    js.Function1[
      /* key */ String, 
      js.Function2[/* dispatch */ KosDispatch, /* getState */ js.UndefOr[GetKosState[_]], Unit]
    ]
  ] = js.undefined
  var initial: T
  var namespace: String
  var reducers: StringDictionary[js.Function2[/* state */ T, /* hasPayload */ Anon_Payload[T], Unit]]
  var setup: js.UndefOr[
    js.Function3[
      /* dispatch */ KosDispatch, 
      /* getState */ GetKosState[T], 
      /* action */ Anon_PayloadAnonParam, 
      Unit
    ]
  ] = js.undefined
}

object KosModel {
  @scala.inline
  def apply[T](
    asyncs: StringDictionary[
      js.Function3[
        /* dispatch */ js.UndefOr[KosDispatch], 
        /* getState */ js.UndefOr[GetKosState[T]], 
        /* action */ js.UndefOr[Anon_Payload[T]], 
        Unit
      ]
    ],
    initial: T,
    namespace: String,
    reducers: StringDictionary[js.Function2[/* state */ T, /* hasPayload */ Anon_Payload[T], Unit]],
    getAsync: /* key */ String => js.Function2[/* dispatch */ KosDispatch, /* getState */ js.UndefOr[GetKosState[_]], Unit] = null,
    setup: (/* dispatch */ KosDispatch, /* getState */ GetKosState[T], /* action */ Anon_PayloadAnonParam) => Unit = null
  ): KosModel[T] = {
    val __obj = js.Dynamic.literal(asyncs = asyncs, initial = initial.asInstanceOf[js.Any], namespace = namespace, reducers = reducers)
    if (getAsync != null) __obj.updateDynamic("getAsync")(js.Any.fromFunction1(getAsync))
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction3(setup))
    __obj.asInstanceOf[KosModel[T]]
  }
}


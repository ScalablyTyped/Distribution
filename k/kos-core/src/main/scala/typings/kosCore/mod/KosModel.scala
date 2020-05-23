package typings.kosCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.kosCore.anon.Payload
import typings.kosCore.anon.PayloadParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KosModel[T] extends js.Object {
  var asyncs: StringDictionary[
    js.Function3[
      /* dispatch */ js.UndefOr[KosDispatch], 
      /* getState */ js.UndefOr[GetKosState[T]], 
      /* action */ js.UndefOr[Payload[T]], 
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
  var reducers: StringDictionary[js.Function2[/* state */ T, /* hasPayload */ Payload[T], Unit]]
  var setup: js.UndefOr[
    js.Function3[
      /* dispatch */ KosDispatch, 
      /* getState */ GetKosState[T], 
      /* action */ PayloadParam, 
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
        /* action */ js.UndefOr[Payload[T]], 
        Unit
      ]
    ],
    initial: T,
    namespace: String,
    reducers: StringDictionary[js.Function2[/* state */ T, /* hasPayload */ Payload[T], Unit]],
    getAsync: /* key */ String => js.Function2[/* dispatch */ KosDispatch, /* getState */ js.UndefOr[GetKosState[_]], Unit] = null,
    setup: (/* dispatch */ KosDispatch, /* getState */ GetKosState[T], /* action */ PayloadParam) => Unit = null
  ): KosModel[T] = {
    val __obj = js.Dynamic.literal(asyncs = asyncs.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], reducers = reducers.asInstanceOf[js.Any])
    if (getAsync != null) __obj.updateDynamic("getAsync")(js.Any.fromFunction1(getAsync))
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction3(setup))
    __obj.asInstanceOf[KosModel[T]]
  }
}


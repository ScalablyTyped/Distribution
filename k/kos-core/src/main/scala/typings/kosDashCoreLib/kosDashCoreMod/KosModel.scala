package typings
package kosDashCoreLib.kosDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KosModel[T] extends js.Object {
  var asyncs: org.scalablytyped.runtime.StringDictionary[
    js.Function3[
      /* dispatch */ KosDispatch, 
      /* getState */ GetKosState[T], 
      /* action */ Action[_], 
      scala.Unit
    ]
  ]
  var getAsync: js.UndefOr[
    js.Function1[
      /* key */ java.lang.String, 
      js.Function2[/* dispatch */ KosDispatch, /* getState */ js.UndefOr[GetKosState[_]], scala.Unit]
    ]
  ] = js.undefined
  var initial: T
  var namespace: java.lang.String
  var reducers: org.scalablytyped.runtime.StringDictionary[
    js.Function2[/* state */ T, /* hasPayload */ kosDashCoreLib.Anon_Payload[T], scala.Unit]
  ]
  var setup: js.UndefOr[
    js.Function2[/* dispatch */ KosDispatch, /* getState */ GetKosState[T], scala.Unit]
  ] = js.undefined
}

object KosModel {
  @scala.inline
  def apply[T](
    asyncs: org.scalablytyped.runtime.StringDictionary[
      js.Function3[
        /* dispatch */ KosDispatch, 
        /* getState */ GetKosState[T], 
        /* action */ Action[_], 
        scala.Unit
      ]
    ],
    initial: T,
    namespace: java.lang.String,
    reducers: org.scalablytyped.runtime.StringDictionary[
      js.Function2[/* state */ T, /* hasPayload */ kosDashCoreLib.Anon_Payload[T], scala.Unit]
    ],
    getAsync: /* key */ java.lang.String => js.Function2[/* dispatch */ KosDispatch, /* getState */ js.UndefOr[GetKosState[_]], scala.Unit] = null,
    setup: (/* dispatch */ KosDispatch, /* getState */ GetKosState[T]) => scala.Unit = null
  ): KosModel[T] = {
    val __obj = js.Dynamic.literal(asyncs = asyncs, initial = initial.asInstanceOf[js.Any], namespace = namespace, reducers = reducers)
    if (getAsync != null) __obj.updateDynamic("getAsync")(js.Any.fromFunction1(getAsync))
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction2(setup))
    __obj.asInstanceOf[KosModel[T]]
  }
}


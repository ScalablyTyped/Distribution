package typings
package kosDashCoreLib.kosDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KosModel[T] extends js.Object {
  var asyncs: ScalablyTyped.runtime.StringDictionary[
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
  var reducers: ScalablyTyped.runtime.StringDictionary[
    js.Function2[/* state */ T, /* hasPayload */ kosDashCoreLib.Anon_Payload[T], scala.Unit]
  ]
  var setup: js.UndefOr[
    js.Function2[/* dispatch */ KosDispatch, /* getState */ GetKosState[T], scala.Unit]
  ] = js.undefined
}


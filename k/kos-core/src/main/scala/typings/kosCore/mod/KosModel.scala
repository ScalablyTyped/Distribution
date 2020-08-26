package typings.kosCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.kosCore.anon.Payload
import typings.kosCore.anon.PayloadParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KosModel[T] extends js.Object {
  var asyncs: StringDictionary[
    js.Function3[
      /* dispatch */ js.UndefOr[KosDispatch], 
      /* getState */ js.UndefOr[GetKosState[T]], 
      /* action */ js.UndefOr[Payload[T]], 
      Unit
    ]
  ] = js.native
  var getAsync: js.UndefOr[
    js.Function1[
      /* key */ String, 
      js.Function2[/* dispatch */ KosDispatch, /* getState */ js.UndefOr[GetKosState[_]], Unit]
    ]
  ] = js.native
  var initial: T = js.native
  var namespace: String = js.native
  var reducers: StringDictionary[js.Function2[/* state */ T, /* hasPayload */ Payload[T], Unit]] = js.native
  var setup: js.UndefOr[
    js.Function3[
      /* dispatch */ KosDispatch, 
      /* getState */ GetKosState[T], 
      /* action */ PayloadParam, 
      Unit
    ]
  ] = js.native
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
    reducers: StringDictionary[js.Function2[/* state */ T, /* hasPayload */ Payload[T], Unit]]
  ): KosModel[T] = {
    val __obj = js.Dynamic.literal(asyncs = asyncs.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], reducers = reducers.asInstanceOf[js.Any])
    __obj.asInstanceOf[KosModel[T]]
  }
  @scala.inline
  implicit class KosModelOps[Self <: KosModel[_], T] (val x: Self with KosModel[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsyncs(
      value: StringDictionary[
          js.Function3[
            /* dispatch */ js.UndefOr[KosDispatch], 
            /* getState */ js.UndefOr[GetKosState[T]], 
            /* action */ js.UndefOr[Payload[T]], 
            Unit
          ]
        ]
    ): Self = this.set("asyncs", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitial(value: T): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setReducers(value: StringDictionary[js.Function2[/* state */ T, /* hasPayload */ Payload[T], Unit]]): Self = this.set("reducers", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAsync(
      value: /* key */ String => js.Function2[/* dispatch */ KosDispatch, /* getState */ js.UndefOr[GetKosState[_]], Unit]
    ): Self = this.set("getAsync", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAsync: Self = this.set("getAsync", js.undefined)
    @scala.inline
    def setSetup(
      value: (/* dispatch */ KosDispatch, /* getState */ GetKosState[T], /* action */ PayloadParam) => Unit
    ): Self = this.set("setup", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
  }
  
}


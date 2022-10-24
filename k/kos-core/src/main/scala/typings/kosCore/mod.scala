package typings.kosCore

import org.scalablytyped.runtime.StringDictionary
import typings.kosCore.anon.Dispatch
import typings.kosCore.anon.Namespace
import typings.kosCore.anon.Payload
import typings.kosCore.anon.PayloadParam
import typings.react.mod.ComponentClass
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kos-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kos-core", JSImport.Default)
  @js.native
  def default: Kos = js.native
  inline def default_=(x: Kos): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait Action[T] extends StObject {
    
    var payload: js.UndefOr[Partial[T] & StringDictionary[Any]] = js.undefined
    
    var `type`: String
  }
  object Action {
    
    inline def apply[T](`type`: String): Action[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[T]]
    }
    
    extension [Self <: Action[?], T](x: Self & Action[T]) {
      
      inline def setPayload(value: Partial[T] & StringDictionary[Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GetKosState[T] = js.Function0[T]
  
  @js.native
  trait Kos extends StObject {
    
    var Util: typings.kosCore.mod.Util = js.native
    
    def Wrapper(config: WrapperConfig): js.Function1[/* component */ ReactComponent[Any & KosProps[Any], Any], Any] = js.native
    
    def getModel(namespace: String): KosModel[Any] = js.native
    
    def registeModel(model: Any): Unit = js.native
    
    def removeModel(namespace: String): Unit = js.native
    
    def start(Layout: ReactComponent[Any, Any]): Unit = js.native
    def start(Layout: ReactComponent[Any, Any], container: String): Unit = js.native
    
    def use(middleware: js.Function1[/* api */ Dispatch, Unit]): Unit = js.native
  }
  
  type KosDispatch = js.Function1[/* action */ Action[Any], Unit]
  
  trait KosModel[T] extends StObject {
    
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
          js.Function2[/* dispatch */ KosDispatch, /* getState */ js.UndefOr[GetKosState[Any]], Unit]
        ]
      ] = js.undefined
    
    var initial: T
    
    var namespace: String
    
    var reducers: StringDictionary[js.Function2[/* state */ T, /* param1 */ Payload[T], Unit]]
    
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
    
    inline def apply[T](
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
      reducers: StringDictionary[js.Function2[/* state */ T, /* param1 */ Payload[T], Unit]]
    ): KosModel[T] = {
      val __obj = js.Dynamic.literal(asyncs = asyncs.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], reducers = reducers.asInstanceOf[js.Any])
      __obj.asInstanceOf[KosModel[T]]
    }
    
    extension [Self <: KosModel[?], T](x: Self & KosModel[T]) {
      
      inline def setAsyncs(
        value: StringDictionary[
              js.Function3[
                /* dispatch */ js.UndefOr[KosDispatch], 
                /* getState */ js.UndefOr[GetKosState[T]], 
                /* action */ js.UndefOr[Payload[T]], 
                Unit
              ]
            ]
      ): Self = StObject.set(x, "asyncs", value.asInstanceOf[js.Any])
      
      inline def setGetAsync(
        value: /* key */ String => js.Function2[/* dispatch */ KosDispatch, /* getState */ js.UndefOr[GetKosState[Any]], Unit]
      ): Self = StObject.set(x, "getAsync", js.Any.fromFunction1(value))
      
      inline def setGetAsyncUndefined: Self = StObject.set(x, "getAsync", js.undefined)
      
      inline def setInitial(value: T): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setReducers(value: StringDictionary[js.Function2[/* state */ T, /* param1 */ Payload[T], Unit]]): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
      
      inline def setSetup(
        value: (/* dispatch */ KosDispatch, /* getState */ GetKosState[T], /* action */ PayloadParam) => Unit
      ): Self = StObject.set(x, "setup", js.Any.fromFunction3(value))
      
      inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    }
  }
  
  trait KosProps[T] extends StObject {
    
    var dispatch: js.UndefOr[js.Function1[/* action */ Action[T], Unit]] = js.undefined
    
    var getNamespace: js.UndefOr[js.Function0[String]] = js.undefined
    
    var getParam: js.UndefOr[js.Function0[Any]] = js.undefined
  }
  object KosProps {
    
    inline def apply[T](): KosProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KosProps[T]]
    }
    
    extension [Self <: KosProps[?], T](x: Self & KosProps[T]) {
      
      inline def setDispatch(value: /* action */ Action[T] => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      inline def setGetNamespace(value: () => String): Self = StObject.set(x, "getNamespace", js.Any.fromFunction0(value))
      
      inline def setGetNamespaceUndefined: Self = StObject.set(x, "getNamespace", js.undefined)
      
      inline def setGetParam(value: () => Any): Self = StObject.set(x, "getParam", js.Any.fromFunction0(value))
      
      inline def setGetParamUndefined: Self = StObject.set(x, "getParam", js.undefined)
    }
  }
  
  type ReactComponent[P, S] = ComponentClass[P, S]
  
  trait Util extends StObject {
    
    def getActionType(action: String): Namespace
    
    def getParam(): Any
  }
  object Util {
    
    inline def apply(getActionType: String => Namespace, getParam: () => Any): Util = {
      val __obj = js.Dynamic.literal(getActionType = js.Any.fromFunction1(getActionType), getParam = js.Any.fromFunction0(getParam))
      __obj.asInstanceOf[Util]
    }
    
    extension [Self <: Util](x: Self) {
      
      inline def setGetActionType(value: String => Namespace): Self = StObject.set(x, "getActionType", js.Any.fromFunction1(value))
      
      inline def setGetParam(value: () => Any): Self = StObject.set(x, "getParam", js.Any.fromFunction0(value))
    }
  }
  
  trait WrapperConfig extends StObject {
    
    var autoLoad: js.UndefOr[Boolean] = js.undefined
    
    var autoReset: js.UndefOr[Boolean] = js.undefined
    
    var model: KosModel[Any]
    
    var namespace: js.UndefOr[String] = js.undefined
  }
  object WrapperConfig {
    
    inline def apply(model: KosModel[Any]): WrapperConfig = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapperConfig]
    }
    
    extension [Self <: WrapperConfig](x: Self) {
      
      inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
      
      inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
      
      inline def setAutoReset(value: Boolean): Self = StObject.set(x, "autoReset", value.asInstanceOf[js.Any])
      
      inline def setAutoResetUndefined: Self = StObject.set(x, "autoReset", js.undefined)
      
      inline def setModel(value: KosModel[Any]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    }
  }
}

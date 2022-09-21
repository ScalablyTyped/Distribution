package typings.i18next.mod

import org.scalablytyped.runtime.StringDictionary
import typings.i18next.anon.InterpolationOptionskeyst
import typings.i18next.anon.PickInitOptionsfallbackLn
import typings.i18next.mod.^
import typings.std.Exclude
import typings.std.Pick
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default: i18n = ^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[i18n]

inline def changeLanguage: js.Function2[
/* lng */ js.UndefOr[String], 
/* callback */ js.UndefOr[Callback], 
js.Promise[TFunction]] = ^.asInstanceOf[js.Dynamic].selectDynamic("changeLanguage").asInstanceOf[js.Function2[
/* lng */ js.UndefOr[String], 
/* callback */ js.UndefOr[Callback], 
js.Promise[TFunction]]]

inline def createInstance: js.Function2[/* options */ js.UndefOr[InitOptions], /* callback */ js.UndefOr[Callback], i18n] = ^.asInstanceOf[js.Dynamic].selectDynamic("createInstance").asInstanceOf[js.Function2[/* options */ js.UndefOr[InitOptions], /* callback */ js.UndefOr[Callback], i18n]]

inline def exists: ExistsFunction[String, StringMap] = ^.asInstanceOf[js.Dynamic].selectDynamic("exists").asInstanceOf[ExistsFunction[String, StringMap]]

inline def getFixedT(): TFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")().asInstanceOf[TFunction]
inline def getFixedT(lng: String): TFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any]).asInstanceOf[TFunction]
inline def getFixedT(lng: String, ns: String): TFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[TFunction]
inline def getFixedT(lng: String, ns: String, keyPrefix: String): TFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction]
inline def getFixedT(lng: String, ns: js.Array[String]): TFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[TFunction]
inline def getFixedT(lng: String, ns: js.Array[String], keyPrefix: String): TFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction]
inline def getFixedT(lng: String, ns: Unit, keyPrefix: String): TFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction]
inline def getFixedT(lng: js.Array[String]): TFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any]).asInstanceOf[TFunction]
inline def getFixedT(lng: js.Array[String], ns: String): TFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[TFunction]
inline def getFixedT(lng: js.Array[String], ns: String, keyPrefix: String): TFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction]
inline def getFixedT(lng: js.Array[String], ns: js.Array[String]): TFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[TFunction]
inline def getFixedT(lng: js.Array[String], ns: js.Array[String], keyPrefix: String): TFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction]
inline def getFixedT(lng: js.Array[String], ns: Unit, keyPrefix: String): TFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction]
inline def getFixedT(lng: Null, ns: String): TFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[TFunction]
inline def getFixedT(lng: Null, ns: String, keyPrefix: String): TFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction]
inline def getFixedT(lng: Null, ns: js.Array[String]): TFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[TFunction]
inline def getFixedT(lng: Null, ns: js.Array[String], keyPrefix: String): TFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction]
inline def getFixedT(lng: Null, ns: Null, keyPrefix: String): TFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction]

inline def hasLoadedNamespace: js.Function2[/* ns */ String, /* options */ js.UndefOr[PickInitOptionsfallbackLn], Boolean] = ^.asInstanceOf[js.Dynamic].selectDynamic("hasLoadedNamespace").asInstanceOf[js.Function2[/* ns */ String, /* options */ js.UndefOr[PickInitOptionsfallbackLn], Boolean]]

inline def init(): js.Promise[TFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[js.Promise[TFunction]]
inline def init(callback: Callback): js.Promise[TFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TFunction]]
inline def init(options: InitOptions): js.Promise[TFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TFunction]]
inline def init(options: InitOptions, callback: Callback): js.Promise[TFunction] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TFunction]]

inline def loadLanguages: js.Function2[
/* lngs */ String | js.Array[String], 
/* callback */ js.UndefOr[Callback], 
js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].selectDynamic("loadLanguages").asInstanceOf[js.Function2[
/* lngs */ String | js.Array[String], 
/* callback */ js.UndefOr[Callback], 
js.Promise[Unit]]]

inline def loadNamespaces: js.Function2[
/* ns */ String | js.Array[String], 
/* callback */ js.UndefOr[Callback], 
js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].selectDynamic("loadNamespaces").asInstanceOf[js.Function2[
/* ns */ String | js.Array[String], 
/* callback */ js.UndefOr[Callback], 
js.Promise[Unit]]]

inline def loadResources: js.Function1[/* callback */ js.UndefOr[js.Function1[/* err */ Any, Unit]], Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("loadResources").asInstanceOf[js.Function1[/* callback */ js.UndefOr[js.Function1[/* err */ Any, Unit]], Unit]]

inline def reloadResources(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")().asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: String, ns: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: String, ns: String, callback: js.Function0[Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: String, ns: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: String, ns: js.Array[String], callback: js.Function0[Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: String, ns: Unit, callback: js.Function0[Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: js.Array[String]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: js.Array[String], ns: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: js.Array[String], ns: String, callback: js.Function0[Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: js.Array[String], ns: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: js.Array[String], ns: js.Array[String], callback: js.Function0[Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: js.Array[String], ns: Unit, callback: js.Function0[Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: Null, ns: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: Null, ns: String, callback: js.Function0[Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: Null, ns: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: Null, ns: js.Array[String], callback: js.Function0[Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: Unit, ns: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: Unit, ns: String, callback: js.Function0[Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: Unit, ns: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: Unit, ns: js.Array[String], callback: js.Function0[Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def reloadResources(lngs: Unit, ns: Unit, callback: js.Function0[Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reloadResources")(lngs.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def setDefaultNamespace: js.Function1[/* ns */ String, Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("setDefaultNamespace").asInstanceOf[js.Function1[/* ns */ String, Unit]]

inline def t: TFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("t").asInstanceOf[TFunction]

inline def use: js.Function1[/* module */ Module | NewableModule[Module] | Newable[Module], this.type] = ^.asInstanceOf[js.Dynamic].selectDynamic("use").asInstanceOf[js.Function1[/* module */ Module | NewableModule[Module] | Newable[Module], this.type]]

type Callback = js.Function2[/* error */ Any, /* t */ TFunction, Unit]

type CallbackError = js.UndefOr[js.Error | Null]

type ExistsFunction[TKeys /* <: String */, TInterpolationMap /* <: js.Object */] = js.Function2[
/* key */ TKeys | js.Array[TKeys], 
/* options */ js.UndefOr[TOptions[TInterpolationMap]], 
Boolean]

type FallbackLng = String | js.Array[String] | FallbackLngObjList | (js.Function1[/* code */ String, String | js.Array[String] | FallbackLngObjList])

type FallbackLngObjList = StringDictionary[js.Array[String]]

type FormatFunction = js.Function4[
/* value */ Any, 
/* format */ js.UndefOr[String], 
/* lng */ js.UndefOr[String], 
/* options */ js.UndefOr[InterpolationOptionskeyst], 
String]

type MergeBy[T, K] = (Omit[T, /* keyof K */ String]) & K

type MultiReadCallback = js.Function2[/* err */ CallbackError, /* data */ js.UndefOr[Resource | Null], Unit]

type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]

type ReadCallback = js.Function2[/* err */ CallbackError, /* data */ js.UndefOr[ResourceKey | Boolean | Null], Unit]

type Resource = StringDictionary[ResourceLanguage]

type ResourceKey = String | StringDictionary[Any]

type ResourceLanguage = StringDictionary[ResourceKey]

type StringMap = StringDictionary[Any]

type TFunctionKeys = String | TemplateStringsArray

type TFunctionResult = js.UndefOr[
String | js.Object | TFunctionDetailedResult[String] | (js.Array[String | js.Object]) | Null]

type TOptions[TInterpolationMap /* <: js.Object */] = TOptionsBase & TInterpolationMap

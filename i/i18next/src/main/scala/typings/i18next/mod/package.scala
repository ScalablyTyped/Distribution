package typings.i18next.mod

import org.scalablytyped.runtime.StringDictionary
import typings.i18next.anon.PickInitOptionsfallbackLn
import typings.i18next.i18nextStrings.Dot
import typings.i18next.i18nextStrings.translation
import typings.i18next.mod.^
import typings.std.Exclude
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default: i18n = ^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[i18n]

inline def changeLanguage: js.Function2[
/* lng */ js.UndefOr[String], 
/* callback */ js.UndefOr[Callback], 
js.Promise[TFunction[DefaultNamespace, Unit]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("changeLanguage").asInstanceOf[js.Function2[
/* lng */ js.UndefOr[String], 
/* callback */ js.UndefOr[Callback], 
js.Promise[TFunction[DefaultNamespace, Unit]]]]

inline def createInstance: js.Function2[/* options */ js.UndefOr[InitOptions], /* callback */ js.UndefOr[Callback], i18n] = ^.asInstanceOf[js.Dynamic].selectDynamic("createInstance").asInstanceOf[js.Function2[/* options */ js.UndefOr[InitOptions], /* callback */ js.UndefOr[Callback], i18n]]

inline def exists: ExistsFunction[String, StringMap] = ^.asInstanceOf[js.Dynamic].selectDynamic("exists").asInstanceOf[ExistsFunction[String, StringMap]]

inline def getFixedT[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](lng: String): TFunction[N, TKPrefix] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any]).asInstanceOf[TFunction[N, TKPrefix]]
inline def getFixedT[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](lng: String, ns: N): TFunction[N, TKPrefix] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[TFunction[N, TKPrefix]]
inline def getFixedT[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](lng: String, ns: N, keyPrefix: TKPrefix): TFunction[N, TKPrefix] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction[N, TKPrefix]]
inline def getFixedT[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](lng: String, ns: Unit, keyPrefix: TKPrefix): TFunction[N, TKPrefix] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction[N, TKPrefix]]
inline def getFixedT[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](lng: js.Array[String]): TFunction[N, TKPrefix] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any]).asInstanceOf[TFunction[N, TKPrefix]]
inline def getFixedT[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](lng: js.Array[String], ns: N): TFunction[N, TKPrefix] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[TFunction[N, TKPrefix]]
inline def getFixedT[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](lng: js.Array[String], ns: N, keyPrefix: TKPrefix): TFunction[N, TKPrefix] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction[N, TKPrefix]]
inline def getFixedT[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](lng: js.Array[String], ns: Unit, keyPrefix: TKPrefix): TFunction[N, TKPrefix] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction[N, TKPrefix]]
inline def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: Null, ns: N): TFunction[ActualNS, TKPrefix] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[TFunction[ActualNS, TKPrefix]]
inline def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: Null, ns: N, keyPrefix: TKPrefix): TFunction[ActualNS, TKPrefix] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction[ActualNS, TKPrefix]]

inline def hasLoadedNamespace: js.Function2[/* ns */ String, /* options */ js.UndefOr[PickInitOptionsfallbackLn], Boolean] = ^.asInstanceOf[js.Dynamic].selectDynamic("hasLoadedNamespace").asInstanceOf[js.Function2[/* ns */ String, /* options */ js.UndefOr[PickInitOptionsfallbackLn], Boolean]]

inline def init(): js.Promise[TFunction[DefaultNamespace, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[js.Promise[TFunction[DefaultNamespace, Unit]]]
inline def init(callback: Callback): js.Promise[TFunction[DefaultNamespace, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TFunction[DefaultNamespace, Unit]]]
inline def init(options: InitOptions): js.Promise[TFunction[DefaultNamespace, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TFunction[DefaultNamespace, Unit]]]
inline def init(options: InitOptions, callback: Callback): js.Promise[TFunction[DefaultNamespace, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TFunction[DefaultNamespace, Unit]]]

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

inline def t: TFunction[js.Array[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]], Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("t").asInstanceOf[TFunction[js.Array[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]], Unit]]

inline def use: js.Function1[/* module */ Module | NewableModule[Module] | Newable[Module], this.type] = ^.asInstanceOf[js.Dynamic].selectDynamic("use").asInstanceOf[js.Function1[/* module */ Module | NewableModule[Module] | Newable[Module], this.type]]

type Callback = js.Function2[/* error */ Any, /* t */ TFunction[DefaultNamespace, Unit], Unit]

type CallbackError = js.UndefOr[js.Error | Null]

type DefaultNamespace = translation

type DefaultTFuncReturn = js.UndefOr[String | Null]

type DefaultTFuncReturnWithObject = DefaultTFuncReturn | js.Object | (js.Array[String | js.Object])

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
/* options */ js.UndefOr[InterpolationOptions & StringMap], 
String]

type KeyPrefix[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */] = js.UndefOr[
/* import warning: importer.ImportType#apply Failed type conversion: N extends keyof i18next.i18next.Resources ? i18next.i18next.Normalize<i18next.i18next.Resources[N]> : string */ js.Any]

// Normalize multiple namespaces
type KeyWithNSSeparator[N, K, S /* <: String */] = /* template literal string: ${N&string}${S}${K&string} */ String

type KeysWithSeparator[K1, K2, S /* <: String */] = /* template literal string: ${K1&string}${S}${K2&string} */ String

type KeysWithSeparator2[K1, K2] = KeysWithSeparator[K1, Exclude[K2, js.Array[/* keyof any */ String]], Dot]

type MergeBy[T, K] = (Omit[T, /* keyof K */ String]) & K

type MultiReadCallback = js.Function2[/* err */ CallbackError, /* data */ js.UndefOr[Resource | Null], Unit]

type Namespace[T] = T | js.Array[T]

type Normalize[T] = (WithOrWithoutPlural[/* keyof T */ String]) | (Normalize2[T, /* keyof T */ String])

type NormalizeByTypeOptions[TranslationValue, Options /* <: CustomTypeParameters */, R] = TypeOptionsFallback[
R, 
/* import warning: importer.ImportType#apply Failed type conversion: Options['returnNull'] */ js.Any, 
Null]

type ReadCallback = js.Function2[/* err */ CallbackError, /* data */ js.UndefOr[ResourceKey | Boolean | Null], Unit]

type Resource = StringDictionary[ResourceLanguage]

type ResourceKey = String | StringDictionary[Any]

type ResourceLanguage = StringDictionary[ResourceKey]

type Resources = /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TypeOptions['resources'] */ js.Any

type StringMap = StringDictionary[Any]

type TOptions[TInterpolationMap /* <: js.Object */] = TOptionsBase & TInterpolationMap

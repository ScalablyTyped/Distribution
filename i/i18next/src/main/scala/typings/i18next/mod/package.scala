package typings.i18next.mod

import org.scalablytyped.runtime.StringDictionary
import typings.i18next.anon.PickInitOptionsobjectfall
import typings.i18next.i18nextBooleans.`false`
import typings.i18next.i18nextBooleans.`true`
import typings.i18next.i18nextStrings.Colon
import typings.i18next.i18nextStrings.Dot
import typings.i18next.i18nextStrings._empty
import typings.i18next.i18nextStrings.ltr
import typings.i18next.i18nextStrings.rtl
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
js.Promise[
  TFunction[
    DefaultNamespace, 
    Unit, 
    /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
  ]
]] = ^.asInstanceOf[js.Dynamic].selectDynamic("changeLanguage").asInstanceOf[js.Function2[
/* lng */ js.UndefOr[String], 
/* callback */ js.UndefOr[Callback], 
js.Promise[
  TFunction[
    DefaultNamespace, 
    Unit, 
    /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
  ]
]]]

inline def createInstance: js.Function2[
/* options */ js.UndefOr[InitOptions[js.Object]], 
/* callback */ js.UndefOr[Callback], 
i18n] = ^.asInstanceOf[js.Dynamic].selectDynamic("createInstance").asInstanceOf[js.Function2[
/* options */ js.UndefOr[InitOptions[js.Object]], 
/* callback */ js.UndefOr[Callback], 
i18n]]

inline def dir: js.Function1[/* lng */ js.UndefOr[String], ltr | rtl] = ^.asInstanceOf[js.Dynamic].selectDynamic("dir").asInstanceOf[js.Function1[/* lng */ js.UndefOr[String], ltr | rtl]]

inline def exists: ExistsFunction[String, StringMap] = ^.asInstanceOf[js.Dynamic].selectDynamic("exists").asInstanceOf[ExistsFunction[String, StringMap]]

inline def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: String): TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any]).asInstanceOf[TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any]]
inline def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: String, ns: N): TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any]]
inline def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: String, ns: N, keyPrefix: TKPrefix): TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any]]
inline def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: String, ns: Unit, keyPrefix: TKPrefix): TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any]]
inline def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: js.Array[String]): TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any]).asInstanceOf[TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any]]
inline def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: js.Array[String], ns: N): TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any]]
inline def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: js.Array[String], ns: N, keyPrefix: TKPrefix): TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any]]
inline def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: js.Array[String], ns: Unit, keyPrefix: TKPrefix): TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any]]
inline def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: Null, ns: N): TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any]]
inline def getFixedT[N /* <: (Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]) | Null */, TKPrefix /* <: KeyPrefix[ActualNS] */, ActualNS /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](lng: Null, ns: N, keyPrefix: TKPrefix): TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedT")(lng.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], keyPrefix.asInstanceOf[js.Any])).asInstanceOf[TFunction[
ActualNS, 
TKPrefix, 
/* import warning: importer.ImportType#apply Failed type conversion: ActualNS extends null ? i18next.i18next.DefaultNamespace : ActualNS */ js.Any]]

inline def hasLoadedNamespace: js.Function2[/* ns */ String, /* options */ js.UndefOr[PickInitOptionsobjectfall], Boolean] = ^.asInstanceOf[js.Dynamic].selectDynamic("hasLoadedNamespace").asInstanceOf[js.Function2[/* ns */ String, /* options */ js.UndefOr[PickInitOptionsobjectfall], Boolean]]

inline def init(): js.Promise[
TFunction[
  DefaultNamespace, 
  Unit, 
  /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
]] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[js.Promise[
TFunction[
  DefaultNamespace, 
  Unit, 
  /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
]]]
inline def init(callback: Callback): js.Promise[
TFunction[
  DefaultNamespace, 
  Unit, 
  /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
]] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
TFunction[
  DefaultNamespace, 
  Unit, 
  /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
]]]
inline def init[T](options: InitOptions[T]): js.Promise[
TFunction[
  DefaultNamespace, 
  Unit, 
  /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
]] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
TFunction[
  DefaultNamespace, 
  Unit, 
  /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
]]]
inline def init[T](options: InitOptions[T], callback: Callback): js.Promise[
TFunction[
  DefaultNamespace, 
  Unit, 
  /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
TFunction[
  DefaultNamespace, 
  Unit, 
  /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
]]]

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

inline def t: TFunction[
js.Array[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]], 
Unit, 
/* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("t").asInstanceOf[TFunction[
js.Array[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]], 
Unit, 
/* import warning: importer.ImportType#apply Failed type conversion: std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> extends null ? i18next.i18next.DefaultNamespace : std.Array<i18next.i18next.FallbackOrNS<string, keyof i18next.i18next.Resources>> */ js.Any]]

inline def use: js.Function1[/* module */ Module | NewableModule[Module] | Newable[Module], this.type] = ^.asInstanceOf[js.Dynamic].selectDynamic("use").asInstanceOf[js.Function1[/* module */ Module | NewableModule[Module] | Newable[Module], this.type]]

type Callback = js.Function2[
/* error */ Any, 
/* t */ TFunction[
  DefaultNamespace, 
  Unit, 
  /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.DefaultNamespace extends null ? i18next.i18next.DefaultNamespace : i18next.i18next.DefaultNamespace */ js.Any
], 
Unit]

type CallbackError = js.UndefOr[js.Error | String | Null]

type DefaultNamespace = translation

type DefaultTFuncReturn = String | (/* import warning: importer.ImportType#apply Failed type conversion: true extends true ? null : never */ js.Any)

type DefaultTFuncReturnWithObject = DefaultTFuncReturn | js.Object | (js.Array[String | js.Object])

type ExistsFunction[TKeys /* <: String */, TInterpolationMap /* <: js.Object */] = js.Function2[
/* key */ TKeys | js.Array[TKeys], 
/* options */ js.UndefOr[TOptions[TInterpolationMap]], 
Boolean]

type FallbackLng = String | js.Array[String] | FallbackLngObjList | (js.Function1[/* code */ String, String | js.Array[String] | FallbackLngObjList])

type FallbackLngObjList = StringDictionary[js.Array[String]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  [T] extends [never] ? F : T
  }}}
  */
type FallbackOrNS[F, T] = F

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

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  V extends / * template literal string: ${inferN}:${inferR} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N * / any extends keyof T ? i18next.i18next.NormalizeReturn<T[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N * / any], / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any, '.'> : never : never
  }}}
  */
type NormalizeMultiReturn[T, V] = NormalizeByTypeOptions[
/* import warning: importer.ImportType#apply Failed type conversion: T[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N * / any][/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any] */ js.Any, 
TypeOptions, 
TypeOptionsFallback[
  /* import warning: importer.ImportType#apply Failed type conversion: T[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N * / any][/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any] */ js.Any, 
  `true`, 
  _empty
]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  V extends keyof T ? i18next.i18next.NormalizeByTypeOptions<T[V], i18next.i18next.TypeOptions, i18next.i18next.TypeOptionsFallback<T[V], true, ''>> : S extends false ? V : V extends / * template literal string: ${inferK}${S}${inferR} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K * / any extends keyof T ? i18next.i18next.NormalizeReturn<T[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K * / any], / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any, '.'> : never : i18next.i18next.StringIfPlural<keyof T>
  }}}
  */
type NormalizeReturn[T, V, S /* <: String | `false` */] = V

// Normalize single namespace with key prefix
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  K extends / * template literal string: ${inferK1}${S}${inferK2} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K1 * / any extends keyof T ? i18next.i18next.NormalizeWithKeyPrefix<T[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K1 * / any], / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify K2 * / any, '.'> : never : K extends keyof T ? T[K] extends string ? never : i18next.i18next.Normalize<T[K]> : never
  }}}
  */
type NormalizeWithKeyPrefix[T, K, S /* <: String */] = Normalize[
/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any]

type ReadCallback = js.Function2[/* err */ CallbackError, /* data */ js.UndefOr[ResourceKey | Boolean | Null], Unit]

type Resource = StringDictionary[ResourceLanguage]

type ResourceKey = String | StringDictionary[Any]

type ResourceLanguage = StringDictionary[ResourceKey]

type Resources = /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TypeOptions['resources'] */ js.Any

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  'v4' extends 'v4' ? T extends / * template literal string: ${string}_${PluralSuffix} * / string ? string : never : never
  }}}
  */
type StringIfPlural[T] = String

type StringMap = StringDictionary[Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  N extends std.Array<keyof T> | std.Readonly<std.Array<keyof T>> ? i18next.i18next.NormalizeMulti<T, N[number], i18next.i18next.LastOf<N[number]>> : N extends keyof T ? TKPrefix extends undefined ? i18next.i18next.Normalize<T[N]> : i18next.i18next.NormalizeWithKeyPrefix<T[N], TKPrefix, '.'> : string
  }}}
  */
type TFuncKey[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix, T] = (KeyWithNSSeparator[
LastOf[
  /* import warning: importer.ImportType#apply Failed type conversion: N[number] */ js.Any
], 
Normalize[
  /* import warning: importer.ImportType#apply Failed type conversion: T[i18next.i18next.LastOf<N[number]>] */ js.Any
], 
Colon]) | (NormalizeMulti[
T, 
Exclude[
  /* import warning: importer.ImportType#apply Failed type conversion: N[number] */ js.Any, 
  LastOf[
    /* import warning: importer.ImportType#apply Failed type conversion: N[number] */ js.Any
  ]
], 
LastOf[
  Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: N[number] */ js.Any, 
    LastOf[
      /* import warning: importer.ImportType#apply Failed type conversion: N[number] */ js.Any
    ]
  ]
]])

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  N extends std.Array<keyof T> ? i18next.i18next.NormalizeMultiReturn<T, TKeys> : N extends keyof T ? TKPrefix extends undefined ? i18next.i18next.NormalizeReturn<T[N], TKeys, '.'> : i18next.i18next.NormalizeReturn<T[N], i18next.i18next.KeysWithSeparator<TKPrefix, TKeys, '.'>, '.'> : TDefaultResult
  }}}
  */
type TFuncReturn[N, TKeys, TDefaultResult, TKPrefix, T] = TDefaultResult

type TOptions[TInterpolationMap /* <: js.Object */] = TOptionsBase & TInterpolationMap

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  Option extends false ? TranslationValue extends MatchingValue ? string : TranslationValue : TranslationValue
  }}}
  */
type TypeOptionsFallback[TranslationValue, Option, MatchingValue] = TranslationValue

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  'v4' extends 'v4' ? K extends / * template literal string: ${inferB}_${PluralSuffix} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify B * / any | K : K : K
  }}}
  */
type WithOrWithoutPlural[K] = K

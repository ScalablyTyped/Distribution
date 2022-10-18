package typings.immer

import org.scalablytyped.runtime.StringDictionary
import typings.immer.anon.ApplyPatches
import typings.immer.anon.AutoFreeze
import typings.immer.anon.Base
import typings.immer.anon.CreateES5Proxy
import typings.immer.anon.ProxyMap
import typings.immer.distCoreProxyMod.ProxyState
import typings.immer.distCoreScopeMod.ImmerScope
import typings.immer.distTypesTypesExternalMod.PatchListener
import typings.immer.distTypesTypesInternalMod.AnyMap
import typings.immer.distTypesTypesInternalMod.AnyObject
import typings.immer.distTypesTypesInternalMod.Archtype
import typings.immer.distTypesTypesInternalMod.Drafted
import typings.immer.distTypesTypesInternalMod.ImmerState
import typings.immer.distTypesTypesInternalMod.Objectish
import typings.immer.immerStrings.ES5
import typings.immer.immerStrings.MapSet
import typings.immer.immerStrings.Patches
import typings.immer.immerStrings.`0`
import typings.immer.immerStrings.`10`
import typings.immer.immerStrings.`11`
import typings.immer.immerStrings.`12`
import typings.immer.immerStrings.`13`
import typings.immer.immerStrings.`14`
import typings.immer.immerStrings.`15`
import typings.immer.immerStrings.`16`
import typings.immer.immerStrings.`17`
import typings.immer.immerStrings.`18`
import typings.immer.immerStrings.`1`
import typings.immer.immerStrings.`20`
import typings.immer.immerStrings.`21`
import typings.immer.immerStrings.`22`
import typings.immer.immerStrings.`23`
import typings.immer.immerStrings.`24`
import typings.immer.immerStrings.`2`
import typings.immer.immerStrings.`3`
import typings.immer.immerStrings.`4`
import typings.immer.immerStrings.`5`
import typings.immer.immerStrings.`6`
import typings.immer.immerStrings.`7`
import typings.immer.immerStrings.`8`
import typings.immer.immerStrings.`9`
import typings.std.Exclude
import typings.std.PropertyKey
import typings.std.ProxyHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInternalMod {
  
  @JSImport("immer/dist/internal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("immer/dist/internal", "DRAFTABLE")
  @js.native
  val DRAFTABLE: js.Symbol = js.native
  
  @JSImport("immer/dist/internal", "DRAFT_STATE")
  @js.native
  val DRAFT_STATE: js.Symbol = js.native
  
  @JSImport("immer/dist/internal", "Immer")
  @js.native
  open class Immer ()
    extends typings.immer.distCoreImmerClassMod.Immer {
    def this(config: AutoFreeze) = this()
  }
  
  @JSImport("immer/dist/internal", "NOTHING")
  @js.native
  val NOTHING_ : typings.immer.distUtilsEnvMod.Nothing = js.native
  
  @JSImport("immer/dist/internal", "Nothing")
  @js.native
  open class Nothing ()
    extends typings.immer.distUtilsEnvMod.Nothing
  
  inline def createProxy[T /* <: Objectish */](immer: typings.immer.distCoreImmerClassMod.Immer, value: T): Drafted[T, ImmerState] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxy")(immer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Drafted[T, ImmerState]]
  inline def createProxy[T /* <: Objectish */](immer: typings.immer.distCoreImmerClassMod.Immer, value: T, parent: ImmerState): Drafted[T, ImmerState] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxy")(immer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Drafted[T, ImmerState]]
  
  inline def createProxyProxy[T /* <: Objectish */](base: T): Drafted[T, ProxyState] = ^.asInstanceOf[js.Dynamic].applyDynamic("createProxyProxy")(base.asInstanceOf[js.Any]).asInstanceOf[Drafted[T, ProxyState]]
  inline def createProxyProxy[T /* <: Objectish */](base: T, parent: ImmerState): Drafted[T, ProxyState] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyProxy")(base.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Drafted[T, ProxyState]]
  
  inline def current[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("current")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def die(
    error: /* keyof immer.anon.0 */ `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15` | `16` | `17` | `18` | `20` | `21` | `22` | `23` | `24`,
    args: Any*
  ): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("die")(scala.List(error.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[scala.Nothing]
  
  inline def each[T /* <: Objectish */](obj: T, iter: js.Function3[/* key */ String | Double, /* value */ Any, /* source */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T /* <: Objectish */](
    obj: T,
    iter: js.Function3[/* key */ String | Double, /* value */ Any, /* source */ T, Unit],
    enumerableOnly: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], iter.asInstanceOf[js.Any], enumerableOnly.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enterScope(immer: Immer): ImmerScope = ^.asInstanceOf[js.Dynamic].applyDynamic("enterScope")(immer.asInstanceOf[js.Any]).asInstanceOf[ImmerScope]
  
  inline def freeze[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("freeze")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def freeze[T](obj: T, deep: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("freeze")(obj.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def get(thing: AnyMap, prop: PropertyKey): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get(thing: AnyObject, prop: PropertyKey): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getArchtype(thing: Any): Archtype = ^.asInstanceOf[js.Dynamic].applyDynamic("getArchtype")(thing.asInstanceOf[js.Any]).asInstanceOf[Archtype]
  
  inline def getCurrentScope(): ImmerScope = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentScope")().asInstanceOf[ImmerScope]
  
  inline def getOwnPropertyDescriptors[T](o: T): (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: std.TypedPropertyDescriptor<T[P]>} */ js.Any) & StringDictionary[js.PropertyDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptors")(o.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: std.TypedPropertyDescriptor<T[P]>} */ js.Any) & StringDictionary[js.PropertyDescriptor]]
  
  inline def getPlugin_ES5(pluginKey: ES5): Exclude[js.UndefOr[CreateES5Proxy], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginKey.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[CreateES5Proxy], Unit]]
  
  inline def getPlugin_MapSet(pluginKey: MapSet): Exclude[js.UndefOr[ProxyMap], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginKey.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[ProxyMap], Unit]]
  
  inline def getPlugin_Patches(pluginKey: Patches): Exclude[js.UndefOr[ApplyPatches], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginKey.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[ApplyPatches], Unit]]
  
  inline def has(thing: Any, prop: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("immer/dist/internal", "hasMap")
  @js.native
  val hasMap: Boolean = js.native
  
  @JSImport("immer/dist/internal", "hasProxies")
  @js.native
  val hasProxies: Boolean = js.native
  
  @JSImport("immer/dist/internal", "hasSet")
  @js.native
  val hasSet: Boolean = js.native
  
  inline def is(x: Any, y: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isDraft(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDraft")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDraftable(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDraftable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFrozen(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFrozen")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMap(target: Any): /* is immer.immer/dist/types/types-internal.AnyMap */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(target.asInstanceOf[js.Any]).asInstanceOf[/* is immer.immer/dist/types/types-internal.AnyMap */ Boolean]
  
  inline def isPlainObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSet(target: Any): /* is immer.immer/dist/types/types-internal.AnySet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(target.asInstanceOf[js.Any]).asInstanceOf[/* is immer.immer/dist/types/types-internal.AnySet */ Boolean]
  
  @JSImport("immer/dist/internal", "iteratorSymbol")
  @js.native
  val iteratorSymbol: js.Symbol = js.native
  
  inline def latest(state: ImmerState): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("latest")(state.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def leaveScope(scope: ImmerScope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("leaveScope")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def loadPlugin_ES5(pluginKey: ES5): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugin")(pluginKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loadPlugin_ES5(pluginKey: ES5, implementation: CreateES5Proxy): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugin")(pluginKey.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loadPlugin_MapSet(pluginKey: MapSet): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugin")(pluginKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loadPlugin_MapSet(pluginKey: MapSet, implementation: ProxyMap): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugin")(pluginKey.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loadPlugin_Patches(pluginKey: Patches): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugin")(pluginKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loadPlugin_Patches(pluginKey: Patches, implementation: ApplyPatches): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugin")(pluginKey.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def markChanged(state: ImmerState): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markChanged")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def neverUsed(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("never_used")().asInstanceOf[Unit]
  
  @JSImport("immer/dist/internal", "objectTraps")
  @js.native
  val objectTraps: ProxyHandler[ProxyState] = js.native
  
  inline def original[T](value: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("original")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def ownKeys(target: AnyObject): js.Array[PropertyKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("ownKeys")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[PropertyKey]]
  
  inline def prepareCopy(state: Base): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareCopy")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def processResult(result: Any, scope: ImmerScope): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("processResult")(result.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def revokeScope(scope: ImmerScope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeScope")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def set(thing: Any, propOrOldValue: PropertyKey, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(thing.asInstanceOf[js.Any], propOrOldValue.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def shallowCopy(base: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowCopy")(base.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def usePatchesInScope(scope: ImmerScope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("usePatchesInScope")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def usePatchesInScope(scope: ImmerScope, patchListener: PatchListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePatchesInScope")(scope.asInstanceOf[js.Any], patchListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

package typings.immer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.immer.typesInternalMod.AnyMap
import typings.immer.typesInternalMod.AnyObject
import typings.immer.typesInternalMod.Archtype
import typings.immer.typesInternalMod.ImmerState
import typings.immer.typesInternalMod.Objectish
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("immer/dist/utils/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def each[T /* <: Objectish */](obj: T, iter: js.Function3[/* key */ String | Double, /* value */ Any, /* source */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], iter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T /* <: Objectish */](
    obj: T,
    iter: js.Function3[/* key */ String | Double, /* value */ Any, /* source */ T, Unit],
    enumerableOnly: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(obj.asInstanceOf[js.Any], iter.asInstanceOf[js.Any], enumerableOnly.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def freeze[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("freeze")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def freeze[T](obj: T, deep: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("freeze")(obj.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def get(thing: AnyMap, prop: PropertyKey): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get(thing: AnyObject, prop: PropertyKey): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getArchtype(thing: Any): Archtype = ^.asInstanceOf[js.Dynamic].applyDynamic("getArchtype")(thing.asInstanceOf[js.Any]).asInstanceOf[Archtype]
  
  inline def getOwnPropertyDescriptors[T](o: T): typings.immer.immerStrings.getOwnPropertyDescriptors & TopLevel[T] & StringDictionary[js.PropertyDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptors")(o.asInstanceOf[js.Any]).asInstanceOf[typings.immer.immerStrings.getOwnPropertyDescriptors & TopLevel[T] & StringDictionary[js.PropertyDescriptor]]
  
  inline def has(thing: Any, prop: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(thing.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def is(x: Any, y: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isDraft(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDraft")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDraftable(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDraftable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFrozen(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFrozen")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMap(target: Any): /* is immer.immer/dist/types/types-internal.AnyMap */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(target.asInstanceOf[js.Any]).asInstanceOf[/* is immer.immer/dist/types/types-internal.AnyMap */ Boolean]
  
  inline def isPlainObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSet(target: Any): /* is immer.immer/dist/types/types-internal.AnySet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(target.asInstanceOf[js.Any]).asInstanceOf[/* is immer.immer/dist/types/types-internal.AnySet */ Boolean]
  
  inline def latest(state: ImmerState): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("latest")(state.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def original[T](value: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("original")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def ownKeys(target: AnyObject): js.Array[PropertyKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("ownKeys")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[PropertyKey]]
  
  inline def set(thing: Any, propOrOldValue: PropertyKey, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(thing.asInstanceOf[js.Any], propOrOldValue.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def shallowCopy(base: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowCopy")(base.asInstanceOf[js.Any]).asInstanceOf[Any]
}

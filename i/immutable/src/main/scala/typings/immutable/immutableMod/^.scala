package typings.immutable.immutableMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.immutableMod.CollectionNs.Indexed
import typings.immutable.immutableMod.CollectionNs.Keyed
import typings.immutable.immutableMod.RecordNs.Factory
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Collection[I /* <: typings.immutable.immutableMod.Collection[_, _] */](collection: I): I = js.native
  def Collection[T](collection: Iterable[T]): Indexed[T] = js.native
  def Collection[V](obj: StringDictionary[V]): Keyed[String, V] = js.native
  def List(): typings.immutable.immutableMod.List[_] = js.native
  def List[T](collection: Iterable[T]): typings.immutable.immutableMod.List[T] = js.native
  @JSName("List")
  def List_T[T](): List[T] = js.native
  def Map(): typings.immutable.immutableMod.Map[_, _] = js.native
  def Map[V](obj: StringDictionary[V]): typings.immutable.immutableMod.Map[String, V] = js.native
  def Map[K, V](collection: Iterable[js.Tuple2[K, V]]): typings.immutable.immutableMod.Map[K, V] = js.native
  @JSName("Map")
  def Map_KV[K, V](): Map[K, V] = js.native
  def OrderedMap(): typings.immutable.immutableMod.OrderedMap[_, _] = js.native
  def OrderedMap[V](obj: StringDictionary[V]): typings.immutable.immutableMod.OrderedMap[String, V] = js.native
  def OrderedMap[K, V](collection: Iterable[js.Tuple2[K, V]]): typings.immutable.immutableMod.OrderedMap[K, V] = js.native
  @JSName("OrderedMap")
  def OrderedMap_KV[K, V](): OrderedMap[K, V] = js.native
  def OrderedSet(): typings.immutable.immutableMod.OrderedSet[_] = js.native
  def OrderedSet[T](collection: Iterable[T]): typings.immutable.immutableMod.OrderedSet[T] = js.native
  @JSName("OrderedSet")
  def OrderedSet_T[T](): OrderedSet[T] = js.native
  def Range(): typings.immutable.immutableMod.SeqNs.Indexed[Double] = js.native
  def Range(start: Double): typings.immutable.immutableMod.SeqNs.Indexed[Double] = js.native
  def Range(start: Double, end: Double): typings.immutable.immutableMod.SeqNs.Indexed[Double] = js.native
  def Range(start: Double, end: Double, step: Double): typings.immutable.immutableMod.SeqNs.Indexed[Double] = js.native
  def Record[TProps](defaultValues: TProps): Factory[TProps] = js.native
  def Record[TProps](defaultValues: TProps, name: String): Factory[TProps] = js.native
  def Repeat[T](value: T): typings.immutable.immutableMod.SeqNs.Indexed[T] = js.native
  def Repeat[T](value: T, times: Double): typings.immutable.immutableMod.SeqNs.Indexed[T] = js.native
  def Seq(): typings.immutable.immutableMod.Seq[_, _] = js.native
  def Seq[T](collection: Indexed[T]): typings.immutable.immutableMod.SeqNs.Indexed[T] = js.native
  def Seq[T](collection: typings.immutable.immutableMod.CollectionNs.Set[T]): typings.immutable.immutableMod.SeqNs.Set[T] = js.native
  def Seq[T](collection: Iterable[T]): typings.immutable.immutableMod.SeqNs.Indexed[T] = js.native
  def Seq[V](obj: StringDictionary[V]): typings.immutable.immutableMod.SeqNs.Keyed[String, V] = js.native
  def Seq[S /* <: typings.immutable.immutableMod.Seq[_, _] */](seq: S): S = js.native
  def Seq[K, V](collection: Keyed[K, V]): typings.immutable.immutableMod.SeqNs.Keyed[K, V] = js.native
  def Set(): typings.immutable.immutableMod.Set[_] = js.native
  def Set[T](collection: Iterable[T]): typings.immutable.immutableMod.Set[T] = js.native
  @JSName("Set")
  def Set_T[T](): Set[T] = js.native
  def Stack(): typings.immutable.immutableMod.Stack[_] = js.native
  def Stack[T](collection: Iterable[T]): typings.immutable.immutableMod.Stack[T] = js.native
  @JSName("Stack")
  def Stack_T[T](): Stack[T] = js.native
  def fromJS(jsValue: js.Any): js.Any = js.native
  def fromJS(
    jsValue: js.Any,
    reviver: js.Function3[
      /* key */ String | Double, 
      /* sequence */ (Keyed[String, _]) | Indexed[_], 
      /* path */ js.UndefOr[js.Array[String | Double]], 
      _
    ]
  ): js.Any = js.native
  def get[V](collection: js.Array[V], key: Double): js.UndefOr[V] = js.native
  def get[V](collection: StringDictionary[V], key: String): js.UndefOr[V] = js.native
  def get[V, NSV](collection: js.Array[V], key: Double, notSetValue: NSV): V | NSV = js.native
  def get[V, NSV](collection: StringDictionary[V], key: String, notSetValue: NSV): V | NSV = js.native
  def get[K, V](collection: Collection[K, V], key: K): js.UndefOr[V] = js.native
  def get[C /* <: js.Object */, K /* <: String */](`object`: C, key: K, notSetValue: js.Any): /* import warning: ImportType.apply Failed type conversion: C[K] */ js.Any = js.native
  def get[TProps, K /* <: String */](record: Record[TProps], key: K, notSetValue: js.Any): /* import warning: ImportType.apply Failed type conversion: TProps[K] */ js.Any = js.native
  def get[K, V, NSV](collection: Collection[K, V], key: K, notSetValue: NSV): V | NSV = js.native
  def getIn(collection: js.Any, keyPath: Iterable[_], notSetValue: js.Any): js.Any = js.native
  def has(collection: js.Object, key: js.Any): Boolean = js.native
  def hasIn(collection: js.Any, keyPath: Iterable[_]): Boolean = js.native
  def hash(value: js.Any): Double = js.native
  def is(first: js.Any, second: js.Any): Boolean = js.native
  def isAssociative(maybeAssociative: js.Any): Boolean = js.native
  def isCollection(maybeCollection: js.Any): /* is immutable.immutable.Collection<any, any> */ Boolean = js.native
  def isImmutable(maybeImmutable: js.Any): /* is immutable.immutable.Collection<any, any> */ Boolean = js.native
  def isIndexed(maybeIndexed: js.Any): /* is immutable.immutable.Collection.Indexed<any> */ Boolean = js.native
  def isKeyed(maybeKeyed: js.Any): /* is immutable.immutable.Collection.Keyed<any, any> */ Boolean = js.native
  def isList(maybeList: js.Any): /* is immutable.immutable.List<any> */ Boolean = js.native
  def isMap(maybeMap: js.Any): /* is immutable.immutable.Map<any, any> */ Boolean = js.native
  def isOrdered(maybeOrdered: js.Any): Boolean = js.native
  def isOrderedMap(maybeOrderedMap: js.Any): /* is immutable.immutable.OrderedMap<any, any> */ Boolean = js.native
  def isOrderedSet(maybeOrderedSet: js.Any): /* is immutable.immutable.OrderedSet<any> */ Boolean = js.native
  def isRecord(maybeRecord: js.Any): /* is immutable.immutable.Record<any> */ Boolean = js.native
  def isSeq(maybeSeq: js.Any): Boolean = js.native
  def isSet(maybeSet: js.Any): /* is immutable.immutable.Set<any> */ Boolean = js.native
  def isStack(maybeStack: js.Any): /* is immutable.immutable.Stack<any> */ Boolean = js.native
  def isValueObject(maybeValue: js.Any): /* is immutable.immutable.ValueObject */ Boolean = js.native
  def merge[C](collection: C, collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*): C = js.native
  def mergeDeep[C](collection: C, collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*): C = js.native
  def mergeDeepWith[C](
    merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
    collection: C,
    collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*
  ): C = js.native
  def mergeWith[C](
    merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
    collection: C,
    collections: ((Iterable[_ | (js.Tuple2[_, _])]) | StringDictionary[js.Any])*
  ): C = js.native
  def remove[C /* <: js.Array[_] */](collection: C, key: Double): C = js.native
  def remove[C, K /* <: String */](collection: C, key: K): C = js.native
  def removeIn[C](collection: C, keyPath: Iterable[_]): C = js.native
  @JSName("remove")
  def remove_C_StringDictionaryAnyK_String[C /* <: StringDictionary[js.Any] */, K /* <: String */](collection: C, key: K): C = js.native
  @JSName("remove")
  def remove_KC_CollectionKWildcard[K, C /* <: Collection[K, _] */](collection: C, key: K): C = js.native
  @JSName("remove")
  def remove_TPropsC_RecordTPropsK_String[TProps, C /* <: Record[TProps] */, K /* <: String */](collection: C, key: K): C = js.native
  def set[V, C /* <: StringDictionary[V] */](collection: C, key: String, value: V): C = js.native
  def set[V, C /* <: js.Array[V] */](collection: C, key: Double, value: V): C = js.native
  def set[C, K /* <: String */](
    `object`: C,
    key: K,
    value: /* import warning: ImportType.apply Failed type conversion: C[K] */ js.Any
  ): C = js.native
  def set[K, V, C /* <: Collection[K, V] */](collection: C, key: K, value: V): C = js.native
  def setIn[C](collection: C, keyPath: Iterable[_], value: js.Any): C = js.native
  @JSName("set")
  def set_TPropsC_RecordTPropsK_String[TProps, C /* <: Record[TProps] */, K /* <: String */](
    record: C,
    key: K,
    value: /* import warning: ImportType.apply Failed type conversion: TProps[K] */ js.Any
  ): C = js.native
  def update[V](collection: js.Array[V], key: Double, updater: js.Function1[/* value */ V, V]): js.Array[V] = js.native
  def update[V, NSV](
    collection: js.Array[V],
    key: Double,
    notSetValue: NSV,
    updater: js.Function1[/* value */ V | NSV, V]
  ): js.Array[V] = js.native
  def update[C, K /* <: String */](
    `object`: C,
    key: K,
    updater: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: C[K] */ /* value */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: C[K] */ js.Any
    ]
  ): C = js.native
  def update[C, K /* <: String */, NSV](
    `object`: C,
    key: K,
    notSetValue: NSV,
    updater: js.Function1[
      /* value */ (/* import warning: ImportType.apply Failed type conversion: C[K] */ js.Any) | NSV, 
      /* import warning: ImportType.apply Failed type conversion: C[K] */ js.Any
    ]
  ): C = js.native
  def updateIn[C](
    collection: C,
    keyPath: Iterable[_],
    notSetValue: js.Any,
    updater: js.Function1[/* value */ js.Any, _]
  ): C = js.native
  def updateIn[C](collection: C, keyPath: Iterable[_], updater: js.Function1[/* value */ js.Any, _]): C = js.native
  @JSName("update")
  def update_KVC_CollectionKV[K, V, C /* <: Collection[K, V] */](collection: C, key: K, updater: js.Function1[/* value */ V, V]): C = js.native
  @JSName("update")
  def update_KVC_CollectionKVNSV[K, V, C /* <: Collection[K, V] */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[/* value */ V | NSV, V]): C = js.native
  @JSName("update")
  def update_TPropsC_RecordTPropsK_String[TProps, C /* <: Record[TProps] */, K /* <: String */](
    record: C,
    key: K,
    updater: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: TProps[K] */ /* value */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: TProps[K] */ js.Any
    ]
  ): C = js.native
  @JSName("update")
  def update_TPropsC_RecordTPropsK_StringNSV[TProps, C /* <: Record[TProps] */, K /* <: String */, NSV](
    record: C,
    key: K,
    notSetValue: NSV,
    updater: js.Function1[
      /* value */ (/* import warning: ImportType.apply Failed type conversion: TProps[K] */ js.Any) | NSV, 
      /* import warning: ImportType.apply Failed type conversion: TProps[K] */ js.Any
    ]
  ): C = js.native
  @JSName("update")
  def update_VC_StringDictionaryVK_StringNSV_StringDictionary[V, C /* <: StringDictionary[V] */, K /* <: String */, NSV](collection: C, key: K, notSetValue: NSV, updater: js.Function1[/* value */ V | NSV, V]): StringDictionary[V] = js.native
  @JSName("update")
  def update_VC_StringDictionaryVK_String_StringDictionary[V, C /* <: StringDictionary[V] */, K /* <: String */](collection: C, key: K, updater: js.Function1[/* value */ V, V]): StringDictionary[V] = js.native
}


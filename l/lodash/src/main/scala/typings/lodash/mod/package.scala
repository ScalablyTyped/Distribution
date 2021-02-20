package typings.lodash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // Crazy typedef needed get _.omit to work properly with Dictionary and NumericDictionary
  type AnyKindOfDictionary = typings.lodash.mod.Dictionary[js.Any] | typings.lodash.mod.NumericDictionary[js.Any]
  
  type ArrayIterator[T, TResult] = js.Function3[/* value */ T, /* index */ scala.Double, /* collection */ js.Array[T], TResult]
  
  type AssignCustomizer = js.Function5[
    /* objectValue */ js.Any, 
    /* sourceValue */ js.Any, 
    /* key */ js.UndefOr[java.lang.String], 
    /* object */ js.UndefOr[js.Object], 
    /* source */ js.UndefOr[js.Object], 
    js.Any
  ]
  
  type CloneDeepWithCustomizer[TObject] = js.Function4[
    /* value */ js.Any, 
    /* key */ js.UndefOr[scala.Double | java.lang.String], 
    /* object */ js.UndefOr[TObject], 
    /* stack */ js.Any, 
    js.Any
  ]
  
  type CloneWithCustomizer[TValue, TResult] = js.Function4[
    /* value */ TValue, 
    /* key */ js.UndefOr[scala.Double | java.lang.String], 
    /* object */ js.Any, 
    /* stack */ js.Any, 
    TResult
  ]
  
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, scala.Boolean]
  
  type Comparator2[T1, T2] = js.Function2[/* a */ T1, /* b */ T2, scala.Boolean]
  
  type CondPair[T, R] = js.Tuple2[js.Function1[/* val */ T, scala.Boolean], js.Function1[/* val */ T, R]]
  
  type ConformsPredicateObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] extends (arg : infer A): any? any : any}
    */ typings.lodash.lodashStrings.ConformsPredicateObject with org.scalablytyped.runtime.TopLevel[T]
  
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type DictionaryIteratee[T] = typings.lodash.mod.ObjectIteratee[typings.lodash.mod.Dictionary[T]]
  
  type DictionaryIterator[T, TResult] = typings.lodash.mod.ObjectIterator[typings.lodash.mod.Dictionary[T], TResult]
  
  type DictionaryIteratorTypeGuard[T, S /* <: T */] = typings.lodash.mod.ObjectIteratorTypeGuard[typings.lodash.mod.Dictionary[T], S]
  
  /* Rewritten from type alias, can be one of: 
    - typings.lodash.mod.PrimitiveChain[T]
    - typings.lodash.mod.ObjectChain[T]
    - typings.lodash.mod.CollectionChain[js.Any]
    - typings.lodash.mod.FunctionChain[T]
    - typings.lodash.mod.StringNullableChain
    - typings.lodash.mod.StringChain
    - typings.lodash.mod.CollectionChain[_] with typings.lodash.mod.FunctionChain[_] with typings.lodash.mod.ObjectChain[_] with typings.lodash.mod.PrimitiveChain[_] with typings.lodash.mod.StringChain
  */
  type ExpChain[T] = typings.lodash.mod._ExpChain[T] | typings.lodash.mod.CollectionChain[js.Any] | (typings.lodash.mod.CollectionChain[_] with typings.lodash.mod.FunctionChain[_] with typings.lodash.mod.ObjectChain[_] with typings.lodash.mod.PrimitiveChain[_] with typings.lodash.mod.StringChain)
  
  type Flat[T] = T
  
  type Function0[R] = js.Function0[R]
  
  type Function1[T1, R] = js.Function1[/* t1 */ T1, R]
  
  type Function2[T1, T2, R] = js.Function2[/* t1 */ T1, /* t2 */ T2, R]
  
  type Function3[T1, T2, T3, R] = js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]
  
  type Function4[T1, T2, T3, T4, R] = js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]
  
  type FunctionBase = typings.lodash.GlobalFunction
  
  /* Rewritten from type alias, can be one of: 
    - typings.lodash.mod.Primitive[T]
    - typings.lodash.mod.Object[T]
    - typings.lodash.mod.Collection[js.Any]
    - typings.lodash.mod.Function[T]
    - typings.lodash.mod.String
    - typings.lodash.mod.Collection[_] with typings.lodash.mod.Function[_] with typings.lodash.mod.Object[_] with typings.lodash.mod.Primitive[_] with typings.lodash.mod.String
  */
  type ImpChain[T] = typings.lodash.mod._ImpChain[T] | typings.lodash.mod.Collection[js.Any] | (typings.lodash.mod.Collection[_] with typings.lodash.mod.Function[_] with typings.lodash.mod.Object[_] with typings.lodash.mod.Primitive[_] with typings.lodash.mod.String)
  
  type IsEqualCustomizer = js.Function6[
    /* value */ js.Any, 
    /* other */ js.Any, 
    /* indexOrKey */ js.UndefOr[typings.lodash.mod.PropertyName], 
    /* parent */ js.Any, 
    /* otherParent */ js.Any, 
    /* stack */ js.Any, 
    js.UndefOr[scala.Boolean]
  ]
  
  type IterateeShorthand[T] = typings.lodash.mod.PropertyName | (js.Tuple2[typings.lodash.mod.PropertyName, js.Any]) | typings.lodash.mod.PartialShallow[T]
  
  /** Common interface between Arrays and jQuery objects */
  type List[T] = typings.std.ArrayLike[T]
  
  type ListIteratee[T] = (typings.lodash.mod.ListIterator[T, typings.lodash.mod.NotVoid]) | typings.lodash.mod.IterateeShorthand[T]
  
  type ListIterateeCustom[T, TResult] = (typings.lodash.mod.ListIterator[T, TResult]) | typings.lodash.mod.IterateeShorthand[T]
  
  type ListIterator[T, TResult] = js.Function3[
    /* value */ T, 
    /* index */ scala.Double, 
    /* collection */ typings.lodash.mod.List[T], 
    TResult
  ]
  
  type ListIteratorTypeGuard[T, S /* <: T */] = js.Function3[
    /* value */ T, 
    /* index */ scala.Double, 
    /* collection */ typings.lodash.mod.List[T], 
    /* is S */ scala.Boolean
  ]
  
  type ListOfRecursiveArraysOrValues[T] = typings.lodash.mod.List[T | typings.lodash.mod.RecursiveArray[T]]
  
  type LoDashExplicitArrayWrapper[T] = typings.lodash.mod.LoDashExplicitWrapper[js.Array[T]]
  
  type LoDashExplicitNillableArrayWrapper[T] = typings.lodash.mod.LoDashExplicitWrapper[js.UndefOr[js.Array[T] | scala.Null]]
  
  type LoDashExplicitNillableObjectWrapper[T] = typings.lodash.mod.LoDashExplicitWrapper[js.UndefOr[T | scala.Null]]
  
  type LoDashExplicitNumberArrayWrapper = typings.lodash.mod.LoDashExplicitWrapper[js.Array[scala.Double]]
  
  type LoDashExplicitObjectWrapper[T] = typings.lodash.mod.LoDashExplicitWrapper[T]
  
  type LoDashExplicitStringWrapper = typings.lodash.mod.LoDashExplicitWrapper[java.lang.String]
  
  // For backwards compatibility
  type LoDashImplicitArrayWrapper[T] = typings.lodash.mod.LoDashImplicitWrapper[js.Array[T]]
  
  type LoDashImplicitNillableArrayWrapper[T] = typings.lodash.mod.LoDashImplicitWrapper[js.UndefOr[js.Array[T] | scala.Null]]
  
  type LoDashImplicitNillableObjectWrapper[T] = typings.lodash.mod.LoDashImplicitWrapper[js.UndefOr[T | scala.Null]]
  
  type LoDashImplicitNumberArrayWrapper = typings.lodash.mod.LoDashImplicitWrapper[js.Array[scala.Double]]
  
  type LoDashImplicitObjectWrapper[T] = typings.lodash.mod.LoDashImplicitWrapper[T]
  
  type LoDashImplicitStringWrapper = typings.lodash.mod.LoDashImplicitWrapper[java.lang.String]
  
  type Many[T] = T | js.Array[T]
  
  /** @deprecated Use MemoListIterator or MemoObjectIterator instead. */
  type MemoIterator[T, TResult] = js.Function4[
    /* prev */ TResult, 
    /* curr */ T, 
    /* indexOrKey */ js.Any, 
    /* list */ js.Array[T], 
    TResult
  ]
  
  type MemoIteratorCapped[T, TResult] = js.Function2[/* prev */ TResult, /* curr */ T, TResult]
  
  type MemoIteratorCappedRight[T, TResult] = js.Function2[/* curr */ T, /* prev */ TResult, TResult]
  
  type MemoListIterator[T, TResult, TList] = js.Function4[/* prev */ TResult, /* curr */ T, /* index */ scala.Double, /* list */ TList, TResult]
  
  type MemoObjectIterator[T, TResult, TList] = js.Function4[/* prev */ TResult, /* curr */ T, /* key */ java.lang.String, /* list */ TList, TResult]
  
  type MemoVoidArrayIterator[T, TResult] = js.Function4[
    /* acc */ TResult, 
    /* curr */ T, 
    /* index */ scala.Double, 
    /* arr */ js.Array[T], 
    scala.Unit
  ]
  
  type MemoVoidDictionaryIterator[T, TResult] = js.Function4[
    /* acc */ TResult, 
    /* curr */ T, 
    /* key */ java.lang.String, 
    /* dict */ typings.lodash.mod.Dictionary[T], 
    scala.Unit
  ]
  
  /** @deprecated Use MemoVoidArrayIterator or MemoVoidDictionaryIterator instead. */
  type MemoVoidIterator[T, TResult] = js.Function4[
    /* prev */ TResult, 
    /* curr */ T, 
    /* indexOrKey */ js.Any, 
    /* list */ js.Array[T], 
    scala.Unit
  ]
  
  type MemoVoidIteratorCapped[T, TResult] = js.Function2[/* acc */ TResult, /* curr */ T, scala.Unit]
  
  type MergeWithCustomizer = js.Function5[
    /* value */ js.Any, 
    /* srcValue */ js.Any, 
    /* key */ java.lang.String, 
    /* object */ js.Any, 
    /* source */ js.Any, 
    js.Any
  ]
  
  type NotVoid = js.Any
  
  type NumericDictionary[T] = org.scalablytyped.runtime.NumberDictionary[T]
  
  type NumericDictionaryIteratee[T] = (typings.lodash.mod.NumericDictionaryIterator[T, typings.lodash.mod.NotVoid]) | typings.lodash.mod.IterateeShorthand[T]
  
  type NumericDictionaryIterateeCustom[T, TResult] = (typings.lodash.mod.NumericDictionaryIterator[T, TResult]) | typings.lodash.mod.IterateeShorthand[T]
  
  // NOTE: keys of objects at run time are always strings, even when a NumericDictionary is being iterated.
  type NumericDictionaryIterator[T, TResult] = js.Function3[
    /* value */ T, 
    /* key */ java.lang.String, 
    /* collection */ typings.lodash.mod.NumericDictionary[T], 
    TResult
  ]
  
  type ObjectIteratee[TObject] = (typings.lodash.mod.ObjectIterator[TObject, typings.lodash.mod.NotVoid]) | (typings.lodash.mod.IterateeShorthand[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any
  ])
  
  type ObjectIterateeCustom[TObject, TResult] = (typings.lodash.mod.ObjectIterator[TObject, TResult]) | (typings.lodash.mod.IterateeShorthand[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any
  ])
  
  // Note: key should be string, not keyof T, because the actual object may contain extra properties that were not specified in the type.
  type ObjectIterator[TObject, TResult] = js.Function3[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ /* value */ js.Any, 
    /* key */ java.lang.String, 
    /* collection */ TObject, 
    TResult
  ]
  
  type ObjectIteratorTypeGuard[TObject, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any */] = js.Function3[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ /* value */ js.Any, 
    /* key */ java.lang.String, 
    /* collection */ TObject, 
    /* is S */ scala.Boolean
  ]
  
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type PartialObject[T] = typings.lodash.GlobalPartial[T]
  
  type PartialShallow[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends object? object : T[P]}
    */ typings.lodash.lodashStrings.PartialShallow with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type PropertyName = java.lang.String | scala.Double | js.Symbol
  
  type PropertyPath = typings.lodash.mod.Many[typings.lodash.mod.PropertyName]
  
  type ReplaceFunction = js.Function2[/* match */ java.lang.String, /* repeated */ js.Any, java.lang.String]
  
  type SetWithCustomizer[T] = js.Function3[/* nsValue */ js.Any, /* key */ java.lang.String, /* nsObject */ T, js.Any]
  
  type StringIterator[TResult] = js.Function3[
    /* char */ java.lang.String, 
    /* index */ scala.Double, 
    /* string */ java.lang.String, 
    TResult
  ]
  
  type Truthy[T] = T
  
  type ValueIteratee[T] = (js.Function1[/* value */ T, typings.lodash.mod.NotVoid]) | typings.lodash.mod.IterateeShorthand[T]
  
  type ValueIterateeCustom[T, TResult] = (js.Function1[/* value */ T, TResult]) | typings.lodash.mod.IterateeShorthand[T]
  
  type ValueIteratorTypeGuard[T, S /* <: T */] = js.Function1[/* value */ T, /* is S */ scala.Boolean]
  
  type ValueKeyIteratee[T] = (js.Function2[/* value */ T, /* key */ java.lang.String, typings.lodash.mod.NotVoid]) | typings.lodash.mod.IterateeShorthand[T]
  
  type ValueKeyIterateeTypeGuard[T, S /* <: T */] = js.Function2[/* value */ T, /* key */ java.lang.String, /* is S */ scala.Boolean]
  
  type __ = typings.lodash.mod.LoDashStatic
  
  type isMatchWithCustomizer = js.Function5[
    /* value */ js.Any, 
    /* other */ js.Any, 
    /* indexOrKey */ typings.lodash.mod.PropertyName, 
    /* object */ js.Object, 
    /* source */ js.Object, 
    js.UndefOr[scala.Boolean]
  ]
}

package typings
package lodashLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fpMod {
  type LodashAdd1x1 = js.Function1[/* addend */ scala.Double, scala.Double]
  type LodashAdd1x2 = js.Function1[/* augend */ scala.Double, scala.Double]
  type LodashAfter1x1[TFunc] = js.Function1[/* n */ scala.Double, TFunc]
  type LodashAfter1x2 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashApply = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashAry1x1 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashAry1x2 = js.Function1[/* n */ scala.Double, js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashAssign1x1[TObject] = js.Function1[/* source */ js.Any, TObject with js.Any]
  type LodashAssign1x2[TSource] = js.Function1[/* object */ js.Any, js.Any with TSource]
  type LodashAssignAllWith1x1 = js.Function1[/* args */ js.Array[js.Any], js.Any]
  type LodashAssignAllWith1x2 = js.Function1[/* customizer */ lodashLib.lodashMod.AssignCustomizer, js.Any]
  type LodashAssignIn1x1[TObject] = js.Function1[/* source */ js.Any, TObject with js.Any]
  type LodashAssignIn1x2[TSource] = js.Function1[/* object */ js.Any, js.Any with TSource]
  type LodashAssignInAllWith1x1 = js.Function1[/* args */ js.Array[js.Any], js.Any]
  type LodashAssignInAllWith1x2 = js.Function1[/* customizer */ lodashLib.lodashMod.AssignCustomizer, js.Any]
  type LodashAssignInWith1x3[TObject] = js.Function1[/* source */ js.Any, TObject with js.Any]
  type LodashAssignInWith1x5[TSource] = js.Function1[/* object */ js.Any, js.Any with TSource]
  type LodashAssignInWith1x6[TObject, TSource] = js.Function1[/* customizer */ lodashLib.lodashMod.AssignCustomizer, TObject with TSource]
  type LodashAssignWith1x3[TObject] = js.Function1[/* source */ js.Any, TObject with js.Any]
  type LodashAssignWith1x5[TSource] = js.Function1[/* object */ js.Any, js.Any with TSource]
  type LodashAssignWith1x6[TObject, TSource] = js.Function1[/* customizer */ lodashLib.lodashMod.AssignCustomizer, TObject with TSource]
  type LodashAt1x1 = js.Function1[
    /* object */ js.UndefOr[
      lodashLib.lodashMod.List[js.Any] | lodashLib.lodashMod.Dictionary[js.Any] | lodashLib.lodashMod.NumericDictionary[js.Any] | scala.Null
    ], 
    js.Array[js.Any]
  ]
  type LodashAt1x2[T] = js.Function1[/* props */ lodashLib.lodashMod.PropertyPath, js.Array[T]]
  type LodashAt2x1[T] = js.Function1[
    /* object */ js.UndefOr[T | scala.Null], 
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ]
  type LodashAt2x2[T] = js.Function1[
    /* props */ lodashLib.lodashMod.Many[java.lang.String], 
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ]
  type LodashAttempt = js.Function1[/* func */ js.Function1[/* repeated */ js.Any, js.Any], js.Any | stdLib.Error]
  type LodashBefore1x1[TFunc] = js.Function1[/* n */ scala.Double, TFunc]
  type LodashBefore1x2 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashBind1x1 = js.Function1[/* thisArg */ js.Any, js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashBind1x2 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashBindAll1x1 = js.Function1[/* object */ js.Any, js.Any]
  type LodashBindAll1x2[T] = js.Function1[/* methodNames */ lodashLib.lodashMod.Many[java.lang.String], T]
  type LodashBindKey1x1 = js.Function1[/* key */ java.lang.String, js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashBindKey1x2 = js.Function1[/* object */ js.Object, js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashCamelCase = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashCapitalize = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashCastArray = js.Function1[/* value */ lodashLib.lodashMod.Many[js.Any], js.Array[js.Any]]
  type LodashCeil = js.Function1[/* n */ scala.Double, scala.Double]
  type LodashChunk1x1 = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    js.Array[js.Array[js.Any]]
  ]
  type LodashChunk1x2[T] = js.Function1[/* size */ scala.Double, js.Array[js.Array[T]]]
  type LodashClamp1x3 = js.Function1[/* number */ scala.Double, scala.Double]
  type LodashClamp1x5 = js.Function1[/* upper */ scala.Double, scala.Double]
  type LodashClamp1x6 = js.Function1[/* lower */ scala.Double, scala.Double]
  type LodashClone = js.Function1[/* value */ js.Any, js.Any]
  type LodashCloneDeep = js.Function1[/* value */ js.Any, js.Any]
  type LodashCloneDeepWith1x1[T] = js.Function1[/* value */ T, js.Any]
  type LodashCloneDeepWith1x2[T] = js.Function1[/* customizer */ lodashLib.lodashMod.CloneDeepWithCustomizer[T], js.Any]
  type LodashCloneWith1x1[T, TResult] = js.Function1[/* value */ T, TResult]
  type LodashCloneWith2x1[T, TResult] = js.Function1[/* value */ T, TResult | T]
  type LodashCompact = js.Function1[
    /* array */ js.UndefOr[
      (lodashLib.lodashMod.List[
        js.UndefOr[
          js.Any | scala.Null | lodashLib.lodashLibNumbers.`false` | lodashLib.lodashLibStrings.Empty | lodashLib.lodashLibNumbers.`0`
        ]
      ]) | scala.Null
    ], 
    js.Array[js.Any]
  ]
  type LodashConcat1x1[T] = js.Function1[/* values */ lodashLib.lodashMod.Many[T], js.Array[T]]
  type LodashConcat1x2[T] = js.Function1[/* array */ lodashLib.lodashMod.Many[T], js.Array[T]]
  type LodashCond = js.Function1[
    /* pairs */ js.Array[lodashLib.lodashMod.CondPair[js.Any, js.Any]], 
    js.Function1[/* Target */ js.Any, js.Any]
  ]
  type LodashConformsTo1x1[T] = js.Function1[/* object */ T, scala.Boolean]
  type LodashConformsTo1x2[T] = js.Function1[/* source */ lodashLib.lodashMod.ConformsPredicateObject[T], scala.Boolean]
  type LodashConstant = js.Function1[/* value */ js.Any, js.Function0[js.Any]]
  type LodashContains1x1[T] = js.Function1[
    /* collection */ js.UndefOr[
      lodashLib.lodashMod.List[T] | lodashLib.lodashMod.Dictionary[T] | lodashLib.lodashMod.NumericDictionary[T] | scala.Null
    ], 
    scala.Boolean
  ]
  type LodashContains1x2[T] = js.Function1[/* target */ T, scala.Boolean]
  type LodashCountBy1x1[T] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | js.Object | scala.Null], 
    lodashLib.lodashMod.Dictionary[scala.Double]
  ]
  type LodashCountBy1x2[T] = js.Function1[
    /* iteratee */ lodashLib.lodashMod.ValueIteratee[T], 
    lodashLib.lodashMod.Dictionary[scala.Double]
  ]
  type LodashCountBy2x2[T] = js.Function1[
    /* iteratee */ lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any], 
    lodashLib.lodashMod.Dictionary[scala.Double]
  ]
  type LodashCreate = js.Function1[/* prototype */ js.Object, js.Object]
  type LodashCurryN1x2[T1, R] = js.Function1[/* arity */ scala.Double, lodashLib.lodashMod.CurriedFunction1[T1, R]]
  type LodashCurryN2x2[T1, T2, R] = js.Function1[/* arity */ scala.Double, lodashLib.lodashMod.CurriedFunction2[T1, T2, R]]
  type LodashCurryN3x2[T1, T2, T3, R] = js.Function1[/* arity */ scala.Double, lodashLib.lodashMod.CurriedFunction3[T1, T2, T3, R]]
  type LodashCurryN4x2[T1, T2, T3, T4, R] = js.Function1[/* arity */ scala.Double, lodashLib.lodashMod.CurriedFunction4[T1, T2, T3, T4, R]]
  type LodashCurryN5x2[T1, T2, T3, T4, T5, R] = js.Function1[
    /* arity */ scala.Double, 
    lodashLib.lodashMod.CurriedFunction5[T1, T2, T3, T4, T5, R]
  ]
  type LodashCurryN6x2 = js.Function1[/* arity */ scala.Double, js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashCurryRightN1x2[T1, R] = js.Function1[/* arity */ scala.Double, lodashLib.lodashMod.RightCurriedFunction1[T1, R]]
  type LodashCurryRightN2x2[T1, T2, R] = js.Function1[/* arity */ scala.Double, lodashLib.lodashMod.RightCurriedFunction2[T1, T2, R]]
  type LodashCurryRightN3x2[T1, T2, T3, R] = js.Function1[/* arity */ scala.Double, lodashLib.lodashMod.RightCurriedFunction3[T1, T2, T3, R]]
  type LodashCurryRightN4x2[T1, T2, T3, T4, R] = js.Function1[
    /* arity */ scala.Double, 
    lodashLib.lodashMod.RightCurriedFunction4[T1, T2, T3, T4, R]
  ]
  type LodashCurryRightN5x2[T1, T2, T3, T4, T5, R] = js.Function1[
    /* arity */ scala.Double, 
    lodashLib.lodashMod.RightCurriedFunction5[T1, T2, T3, T4, T5, R]
  ]
  type LodashCurryRightN6x2 = js.Function1[/* arity */ scala.Double, js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashDebounce1x1 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    (js.Function1[/* repeated */ js.Any, _]) with lodashLib.lodashMod.Cancelable
  ]
  type LodashDebounce1x2[T] = js.Function1[/* wait */ scala.Double, T with lodashLib.lodashMod.Cancelable]
  type LodashDeburr = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashDefaultTo1x1[T] = js.Function1[/* value */ js.UndefOr[T | scala.Null], T]
  type LodashDefaultTo2x1[TDefault] = js.Function1[/* value */ js.UndefOr[js.Any | scala.Null], js.Any | TDefault]
  type LodashDefaults1x1[TSource] = js.Function1[/* object */ js.Any, TSource with js.Any]
  type LodashDefaults1x2[TObject] = js.Function1[/* source */ js.Any, js.Any with TObject]
  type LodashDefaultsDeep1x1 = js.Function1[/* object */ js.Any, js.Any]
  type LodashDefaultsDeep1x2 = js.Function1[/* sources */ js.Any, js.Any]
  type LodashDefaultsDeepAll = js.Function1[/* object */ js.Array[js.Any], js.Any]
  type LodashDefer = js.Function2[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    /* repeated */ js.Any, 
    scala.Double
  ]
  type LodashDelay1x1 = js.Function1[/* func */ js.Function1[/* repeated */ js.Any, js.Any], scala.Double]
  type LodashDelay1x2 = js.Function1[/* wait */ scala.Double, scala.Double]
  type LodashDifference1x1[T] = js.Function1[/* values */ lodashLib.lodashMod.List[T], js.Array[T]]
  type LodashDifference1x2[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashDifferenceBy1x3[T1, T2] = js.Function1[/* values */ lodashLib.lodashMod.List[T2], js.Array[T1]]
  type LodashDifferenceBy1x5[T1] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T1] | scala.Null], js.Array[T1]]
  type LodashDifferenceBy1x6[T1, T2] = js.Function1[/* iteratee */ lodashLib.lodashMod.ValueIteratee[T1 | T2], js.Array[T1]]
  type LodashDifferenceWith1x3[T1, T2] = js.Function1[/* values */ lodashLib.lodashMod.List[T2], js.Array[T1]]
  type LodashDifferenceWith1x5[T1] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T1] | scala.Null], js.Array[T1]]
  type LodashDifferenceWith1x6[T1, T2] = js.Function1[/* comparator */ lodashLib.lodashMod.Comparator2[T1, T2], js.Array[T1]]
  type LodashDivide1x1 = js.Function1[/* divisor */ scala.Double, scala.Double]
  type LodashDivide1x2 = js.Function1[/* dividend */ scala.Double, scala.Double]
  type LodashDrop1x1 = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    js.Array[js.Any]
  ]
  type LodashDrop1x2[T] = js.Function1[/* n */ scala.Double, js.Array[T]]
  type LodashDropRight1x1 = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    js.Array[js.Any]
  ]
  type LodashDropRight1x2[T] = js.Function1[/* n */ scala.Double, js.Array[T]]
  type LodashDropRightWhile1x1[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashDropRightWhile1x2[T] = js.Function1[/* predicate */ lodashLib.lodashMod.ValueIteratee[T], js.Array[T]]
  type LodashDropWhile1x1[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashDropWhile1x2[T] = js.Function1[/* predicate */ lodashLib.lodashMod.ValueIteratee[T], js.Array[T]]
  type LodashEndsWith1x1 = js.Function1[/* string */ java.lang.String, scala.Boolean]
  type LodashEndsWith1x2 = js.Function1[/* target */ java.lang.String, scala.Boolean]
  type LodashEq1x1 = js.Function1[/* other */ js.Any, scala.Boolean]
  type LodashEq1x2 = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashEscape = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashEscapeRegExp = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashEvery1x1[T] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | js.Object | scala.Null], 
    scala.Boolean
  ]
  type LodashEvery1x2[T] = js.Function1[
    /* predicate */ lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean], 
    scala.Boolean
  ]
  type LodashEvery2x2[T] = js.Function1[
    /* predicate */ lodashLib.lodashMod.ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      scala.Boolean
    ], 
    scala.Boolean
  ]
  type LodashExtend1x1[TObject] = js.Function1[/* source */ js.Any, TObject with js.Any]
  type LodashExtend1x2[TSource] = js.Function1[/* object */ js.Any, js.Any with TSource]
  type LodashExtendAllWith1x1 = js.Function1[/* args */ js.Array[js.Any], js.Any]
  type LodashExtendAllWith1x2 = js.Function1[/* customizer */ lodashLib.lodashMod.AssignCustomizer, js.Any]
  type LodashExtendWith1x3[TObject] = js.Function1[/* source */ js.Any, TObject with js.Any]
  type LodashExtendWith1x5[TSource] = js.Function1[/* object */ js.Any, js.Any with TSource]
  type LodashExtendWith1x6[TObject, TSource] = js.Function1[/* customizer */ lodashLib.lodashMod.AssignCustomizer, TObject with TSource]
  type LodashFill1x11[U] = js.Function1[/* value */ js.Any, js.Array[js.Any | U]]
  type LodashFill1x13[T, U] = js.Function1[/* end */ scala.Double, js.Array[T | U]]
  type LodashFill1x14[T, U] = js.Function1[/* start */ scala.Double, js.Array[T | U]]
  type LodashFill2x11[U] = js.Function1[/* value */ js.Any, lodashLib.lodashMod.List[js.Any | U]]
  type LodashFill2x13[T, U] = js.Function1[/* end */ scala.Double, lodashLib.lodashMod.List[T | U]]
  type LodashFill2x14[T, U] = js.Function1[/* start */ scala.Double, lodashLib.lodashMod.List[T | U]]
  type LodashFilter1x1[T, S] = js.Function1[/* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[S]]
  type LodashFilter2x1[T] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | js.Object | scala.Null], 
    js.Array[T]
  ]
  type LodashFilter3x1[T, S] = js.Function1[/* collection */ js.UndefOr[T | scala.Null], js.Array[S]]
  type LodashFind1x1[T, S] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], 
    js.UndefOr[S]
  ]
  type LodashFind2x1[T] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | js.Object | scala.Null], 
    js.UndefOr[T]
  ]
  type LodashFind3x1[T, S] = js.Function1[/* collection */ js.UndefOr[T | scala.Null], js.UndefOr[S]]
  type LodashFindFrom1x3[T, S] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], 
    js.UndefOr[S]
  ]
  type LodashFindFrom1x5[S] = js.Function1[/* fromIndex */ scala.Double, js.UndefOr[S]]
  type LodashFindFrom2x5[T] = js.Function1[/* fromIndex */ scala.Double, js.UndefOr[T]]
  type LodashFindFrom3x3[T, S] = js.Function1[/* collection */ js.UndefOr[T | scala.Null], js.UndefOr[S]]
  type LodashFindFrom3x5[S] = js.Function1[/* fromIndex */ scala.Double, js.UndefOr[S]]
  type LodashFindFrom4x5[T] = js.Function1[
    /* fromIndex */ scala.Double, 
    js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ]
  type LodashFindIndex1x1[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], scala.Double]
  type LodashFindIndex1x2[T] = js.Function1[
    /* predicate */ lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean], 
    scala.Double
  ]
  type LodashFindIndexFrom1x3[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], scala.Double]
  type LodashFindIndexFrom1x5 = js.Function1[/* fromIndex */ scala.Double, scala.Double]
  type LodashFindIndexFrom1x6[T] = js.Function1[
    /* predicate */ lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean], 
    scala.Double
  ]
  type LodashFindKey1x1[T] = js.Function1[/* object */ js.UndefOr[js.Object | scala.Null], js.UndefOr[java.lang.String]]
  type LodashFindKey1x2[T] = js.Function1[
    /* predicate */ lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any], 
    js.UndefOr[java.lang.String]
  ]
  type LodashFindLast1x1[T, S] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], 
    js.UndefOr[S]
  ]
  type LodashFindLast2x1[T] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | js.Object | scala.Null], 
    js.UndefOr[T]
  ]
  type LodashFindLast3x1[T, S] = js.Function1[/* collection */ js.UndefOr[T | scala.Null], js.UndefOr[S]]
  type LodashFindLastFrom1x3[T, S] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], 
    js.UndefOr[S]
  ]
  type LodashFindLastFrom1x5[S] = js.Function1[/* fromIndex */ scala.Double, js.UndefOr[S]]
  type LodashFindLastFrom2x5[T] = js.Function1[/* fromIndex */ scala.Double, js.UndefOr[T]]
  type LodashFindLastFrom3x3[T, S] = js.Function1[/* collection */ js.UndefOr[T | scala.Null], js.UndefOr[S]]
  type LodashFindLastFrom3x5[S] = js.Function1[/* fromIndex */ scala.Double, js.UndefOr[S]]
  type LodashFindLastFrom4x5[T] = js.Function1[
    /* fromIndex */ scala.Double, 
    js.UndefOr[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ]
  type LodashFindLastIndex1x1[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], scala.Double]
  type LodashFindLastIndex1x2[T] = js.Function1[
    /* predicate */ lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean], 
    scala.Double
  ]
  type LodashFindLastIndexFrom1x3[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], scala.Double]
  type LodashFindLastIndexFrom1x5 = js.Function1[/* fromIndex */ scala.Double, scala.Double]
  type LodashFindLastIndexFrom1x6[T] = js.Function1[
    /* predicate */ lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean], 
    scala.Double
  ]
  type LodashFindLastKey1x1[T] = js.Function1[/* object */ js.UndefOr[js.Object | scala.Null], js.UndefOr[java.lang.String]]
  type LodashFindLastKey1x2[T] = js.Function1[
    /* predicate */ lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any], 
    js.UndefOr[java.lang.String]
  ]
  type LodashFlatMap1x1[T, TResult] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], 
    js.Array[TResult]
  ]
  type LodashFlatMap1x2[T] = js.Function1[
    /* iteratee */ js.Function1[/* value */ T, lodashLib.lodashMod.Many[js.Any]], 
    js.Array[js.Any]
  ]
  type LodashFlatMap2x1[T, TResult] = js.Function1[/* collection */ js.UndefOr[T | scala.Null], js.Array[TResult]]
  type LodashFlatMap2x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      lodashLib.lodashMod.Many[js.Any]
    ], 
    js.Array[js.Any]
  ]
  type LodashFlatMap3x1 = js.Function1[/* collection */ js.UndefOr[js.Object | scala.Null], js.Array[js.Any]]
  type LodashFlatMap4x1 = js.Function1[/* collection */ js.UndefOr[js.Object | scala.Null], js.Array[scala.Boolean]]
  type LodashFlatMapDeep1x1[T, TResult] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], 
    js.Array[TResult]
  ]
  type LodashFlatMapDeep1x2[T] = js.Function1[
    /* iteratee */ js.Function1[/* value */ T, lodashLib.lodashMod.ListOfRecursiveArraysOrValues[js.Any] | js.Any], 
    js.Array[js.Any]
  ]
  type LodashFlatMapDeep2x1[T, TResult] = js.Function1[/* collection */ js.UndefOr[T | scala.Null], js.Array[TResult]]
  type LodashFlatMapDeep2x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      lodashLib.lodashMod.ListOfRecursiveArraysOrValues[js.Any] | js.Any
    ], 
    js.Array[js.Any]
  ]
  type LodashFlatMapDeep3x1 = js.Function1[/* collection */ js.UndefOr[js.Object | scala.Null], js.Array[js.Any]]
  type LodashFlatMapDeep4x1 = js.Function1[/* collection */ js.UndefOr[js.Object | scala.Null], js.Array[scala.Boolean]]
  type LodashFlatMapDepth1x3[T, TResult] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], 
    js.Array[TResult]
  ]
  type LodashFlatMapDepth1x5[TResult] = js.Function1[/* depth */ scala.Double, js.Array[TResult]]
  type LodashFlatMapDepth1x6[T] = js.Function1[
    /* iteratee */ js.Function1[/* value */ T, lodashLib.lodashMod.ListOfRecursiveArraysOrValues[js.Any] | js.Any], 
    js.Array[js.Any]
  ]
  type LodashFlatMapDepth2x3[T, TResult] = js.Function1[/* collection */ js.UndefOr[T | scala.Null], js.Array[TResult]]
  type LodashFlatMapDepth2x5[TResult] = js.Function1[/* depth */ scala.Double, js.Array[TResult]]
  type LodashFlatMapDepth2x6[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      lodashLib.lodashMod.ListOfRecursiveArraysOrValues[js.Any] | js.Any
    ], 
    js.Array[js.Any]
  ]
  type LodashFlatMapDepth3x3 = js.Function1[/* collection */ js.UndefOr[js.Object | scala.Null], js.Array[js.Any]]
  type LodashFlatMapDepth3x5 = js.Function1[/* depth */ scala.Double, js.Array[js.Any]]
  type LodashFlatMapDepth4x3 = js.Function1[/* collection */ js.UndefOr[js.Object | scala.Null], js.Array[scala.Boolean]]
  type LodashFlatMapDepth4x5 = js.Function1[/* depth */ scala.Double, js.Array[scala.Boolean]]
  type LodashFlatten = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.List[lodashLib.lodashMod.Many[js.Any]] | scala.Null], 
    js.Array[js.Any]
  ]
  type LodashFlattenDeep = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.ListOfRecursiveArraysOrValues[js.Any] | scala.Null], 
    js.Array[js.Any]
  ]
  type LodashFlattenDepth1x1 = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.ListOfRecursiveArraysOrValues[js.Any] | scala.Null], 
    js.Array[js.Any]
  ]
  type LodashFlattenDepth1x2[T] = js.Function1[/* depth */ scala.Double, js.Array[T]]
  type LodashFlip = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashFloor = js.Function1[/* n */ scala.Double, scala.Double]
  type LodashForEach1x2[T] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], js.Array[T]]
  type LodashForEach2x2[T] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], lodashLib.lodashMod.List[T]]
  type LodashForEach3x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    T
  ]
  type LodashForEach4x2[T, TArray] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], TArray]
  type LodashForEach5x2[T, TList] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], TList]
  type LodashForEach6x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    js.UndefOr[T | scala.Null]
  ]
  type LodashForEachRight1x2[T] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], js.Array[T]]
  type LodashForEachRight2x2[T] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], lodashLib.lodashMod.List[T]]
  type LodashForEachRight3x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    T
  ]
  type LodashForEachRight4x2[T, TArray] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], TArray]
  type LodashForEachRight5x2[T, TList] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], TList]
  type LodashForEachRight6x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    js.UndefOr[T | scala.Null]
  ]
  type LodashForIn1x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    T
  ]
  type LodashForIn2x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    js.UndefOr[T | scala.Null]
  ]
  type LodashForInRight1x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    T
  ]
  type LodashForInRight2x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    js.UndefOr[T | scala.Null]
  ]
  type LodashForOwn1x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    T
  ]
  type LodashForOwn2x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    js.UndefOr[T | scala.Null]
  ]
  type LodashForOwnRight1x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    T
  ]
  type LodashForOwnRight2x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    js.UndefOr[T | scala.Null]
  ]
  type LodashFunctions = js.Function1[/* object */ js.Any, js.Array[java.lang.String]]
  type LodashFunctionsIn = js.Function1[/* object */ js.Any, js.Array[java.lang.String]]
  type LodashGet1x2[TObject] = js.Function1[
    /* path */ java.lang.String | js.Array[java.lang.String], 
    /* import warning: ImportType.apply Failed type conversion: TObject[keyof TObject] */ js.Any
  ]
  type LodashGet2x2[TObject] = js.Function1[
    /* path */ java.lang.String | js.Array[java.lang.String], 
    js.UndefOr[
      /* import warning: ImportType.apply Failed type conversion: TObject[keyof TObject] */ js.Any
    ]
  ]
  type LodashGet3x2[T] = js.Function1[/* path */ scala.Double, T]
  type LodashGet4x2[T] = js.Function1[/* path */ scala.Double, js.UndefOr[T]]
  type LodashGet5x2 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.UndefOr[scala.Nothing]]
  type LodashGet6x2 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.Any]
  type LodashGetOr1x3[TObject, TKey /* <: java.lang.String */, TDefault] = js.Function1[
    /* object */ js.UndefOr[TObject | scala.Null], 
    (stdLib.Exclude[
      /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashGetOr1x5[TObject, TDefault] = js.Function1[
    /* path */ java.lang.String | js.Array[java.lang.String], 
    (stdLib.Exclude[
      /* import warning: ImportType.apply Failed type conversion: TObject[keyof TObject] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashGetOr1x6[TObject, TKey /* <: java.lang.String */] = js.Function1[
    /* defaultValue */ js.Any, 
    (stdLib.Exclude[
      /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | js.Any
  ]
  type LodashGetOr2x3[TDefault] = js.Function1[
    /* object */ js.UndefOr[lodashLib.lodashMod.NumericDictionary[js.Any] | scala.Null], 
    js.Any | TDefault
  ]
  type LodashGetOr2x5[T, TDefault] = js.Function1[/* path */ scala.Double, T | TDefault]
  type LodashGetOr2x6[T] = js.Function1[/* defaultValue */ js.Any, T | js.Any]
  type LodashGetOr3x3[TDefault] = js.Function1[/* object */ js.UndefOr[scala.Null], TDefault]
  type LodashGetOr3x5[TDefault] = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, TDefault]
  type LodashGetOr3x6 = js.Function1[/* defaultValue */ js.Any, js.Any]
  type LodashGetOr4x3 = js.Function1[/* object */ js.Any, js.Any]
  type LodashGetOr4x5 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.Any]
  type LodashGetOr4x6 = js.Function1[/* defaultValue */ js.Any, js.Any]
  type LodashGroupBy1x1[T] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | js.Object | scala.Null], 
    lodashLib.lodashMod.Dictionary[js.Array[T]]
  ]
  type LodashGroupBy1x2[T] = js.Function1[
    /* iteratee */ lodashLib.lodashMod.ValueIteratee[T], 
    lodashLib.lodashMod.Dictionary[js.Array[T]]
  ]
  type LodashGroupBy2x2[T] = js.Function1[
    /* iteratee */ lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any], 
    lodashLib.lodashMod.Dictionary[
      js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
    ]
  ]
  type LodashGt1x1 = js.Function1[/* other */ js.Any, scala.Boolean]
  type LodashGt1x2 = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashGte1x1 = js.Function1[/* other */ js.Any, scala.Boolean]
  type LodashGte1x2 = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashHas1x1 = js.Function1[/* object */ js.Any, scala.Boolean]
  type LodashHas1x2 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, scala.Boolean]
  type LodashHasIn1x1 = js.Function1[/* object */ js.Any, scala.Boolean]
  type LodashHasIn1x2 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, scala.Boolean]
  type LodashHead = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    js.UndefOr[js.Any]
  ]
  type LodashInRange1x3 = js.Function1[/* n */ scala.Double, scala.Boolean]
  type LodashInRange1x5 = js.Function1[/* end */ scala.Double, scala.Boolean]
  type LodashInRange1x6 = js.Function1[/* start */ scala.Double, scala.Boolean]
  type LodashIncludes1x1[T] = js.Function1[
    /* collection */ js.UndefOr[
      lodashLib.lodashMod.List[T] | lodashLib.lodashMod.Dictionary[T] | lodashLib.lodashMod.NumericDictionary[T] | scala.Null
    ], 
    scala.Boolean
  ]
  type LodashIncludes1x2[T] = js.Function1[/* target */ T, scala.Boolean]
  type LodashIncludesFrom1x3[T] = js.Function1[
    /* collection */ js.UndefOr[
      lodashLib.lodashMod.List[T] | lodashLib.lodashMod.Dictionary[T] | lodashLib.lodashMod.NumericDictionary[T] | scala.Null
    ], 
    scala.Boolean
  ]
  type LodashIncludesFrom1x5 = js.Function1[/* fromIndex */ scala.Double, scala.Boolean]
  type LodashIncludesFrom1x6[T] = js.Function1[/* target */ T, scala.Boolean]
  type LodashIndexOf1x1[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], scala.Double]
  type LodashIndexOf1x2[T] = js.Function1[/* value */ T, scala.Double]
  type LodashIndexOfFrom1x3[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], scala.Double]
  type LodashIndexOfFrom1x5 = js.Function1[/* fromIndex */ scala.Double, scala.Double]
  type LodashIndexOfFrom1x6[T] = js.Function1[/* value */ T, scala.Double]
  type LodashInitial = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    js.Array[js.Any]
  ]
  type LodashIntersection1x1[T] = js.Function1[/* arrays */ lodashLib.lodashMod.List[T], js.Array[T]]
  type LodashIntersection1x2[T] = js.Function1[/* arrays2 */ lodashLib.lodashMod.List[T], js.Array[T]]
  type LodashIntersectionBy1x3[T1, T2] = js.Function1[/* values */ lodashLib.lodashMod.List[T2], js.Array[T1]]
  type LodashIntersectionBy1x5[T1] = js.Function1[/* array */ lodashLib.lodashMod.List[T1] | scala.Null, js.Array[T1]]
  type LodashIntersectionBy1x6[T1, T2] = js.Function1[/* iteratee */ lodashLib.lodashMod.ValueIteratee[T1 | T2], js.Array[T1]]
  type LodashIntersectionWith1x3[T1, T2] = js.Function1[/* values */ lodashLib.lodashMod.List[T2], js.Array[T1]]
  type LodashIntersectionWith1x5[T1] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T1] | scala.Null], js.Array[T1]]
  type LodashIntersectionWith1x6[T1, T2] = js.Function1[/* comparator */ lodashLib.lodashMod.Comparator2[T1, T2], js.Array[T1]]
  type LodashInvert = js.Function1[/* object */ js.Object, lodashLib.lodashMod.Dictionary[java.lang.String]]
  type LodashInvertBy1x1[T] = js.Function1[
    /* object */ js.UndefOr[
      lodashLib.lodashMod.List[T] | lodashLib.lodashMod.Dictionary[T] | lodashLib.lodashMod.NumericDictionary[T] | js.Object | scala.Null
    ], 
    lodashLib.lodashMod.Dictionary[js.Array[java.lang.String]]
  ]
  type LodashInvertBy1x2[T] = js.Function1[
    /* interatee */ lodashLib.lodashMod.ValueIteratee[T], 
    lodashLib.lodashMod.Dictionary[js.Array[java.lang.String]]
  ]
  type LodashInvertBy2x2[T] = js.Function1[
    /* interatee */ lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any], 
    lodashLib.lodashMod.Dictionary[js.Array[java.lang.String]]
  ]
  type LodashInvoke1x1 = js.Function1[/* object */ js.Any, js.Any]
  type LodashInvoke1x2 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.Any]
  type LodashInvokeArgs1x3 = js.Function1[/* object */ js.Any, js.Any]
  type LodashInvokeArgs1x5 = js.Function1[/* args */ js.Array[js.Any], js.Any]
  type LodashInvokeArgs1x6 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.Any]
  type LodashInvokeArgsMap1x3 = js.Function1[/* collection */ js.UndefOr[js.Object | scala.Null], js.Array[js.Any]]
  type LodashInvokeArgsMap1x5 = js.Function1[/* args */ js.Array[js.Any], js.Array[js.Any]]
  type LodashInvokeArgsMap2x3[TResult] = js.Function1[/* collection */ js.UndefOr[js.Object | scala.Null], js.Array[TResult]]
  type LodashInvokeArgsMap2x5[TResult] = js.Function1[/* args */ js.Array[js.Any], js.Array[TResult]]
  type LodashInvokeMap1x1 = js.Function1[/* collection */ js.UndefOr[js.Object | scala.Null], js.Array[js.Any]]
  type LodashInvokeMap2x1[TResult] = js.Function1[/* collection */ js.UndefOr[js.Object | scala.Null], js.Array[TResult]]
  type LodashIsArguments = js.Function1[/* value */ js.Any, /* is std.IArguments */ scala.Boolean]
  type LodashIsArray = js.Function1[/* value */ js.Any, /* is std.Array<any> */ scala.Boolean]
  type LodashIsArrayBuffer = js.Function1[/* value */ js.Any, /* is std.ArrayBuffer */ scala.Boolean]
  type LodashIsBoolean = js.Function1[/* value */ js.Any, /* is boolean */ scala.Boolean]
  type LodashIsBuffer = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsDate = js.Function1[/* value */ js.Any, /* is std.Date */ scala.Boolean]
  type LodashIsElement = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsEmpty = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsEqual1x1 = js.Function1[/* other */ js.Any, scala.Boolean]
  type LodashIsEqual1x2 = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsEqualWith1x3 = js.Function1[/* other */ js.Any, scala.Boolean]
  type LodashIsEqualWith1x5 = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsEqualWith1x6 = js.Function1[/* customizer */ lodashLib.lodashMod.IsEqualCustomizer, scala.Boolean]
  type LodashIsError = js.Function1[/* value */ js.Any, /* is std.Error */ scala.Boolean]
  type LodashIsFinite = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsFunction = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsInteger = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsLength = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsMap = js.Function1[/* value */ js.Any, /* is lodash.lodash.Global.Map<any, any> */ scala.Boolean]
  type LodashIsMatch1x1 = js.Function1[/* object */ js.Object, scala.Boolean]
  type LodashIsMatch1x2 = js.Function1[/* source */ js.Object, scala.Boolean]
  type LodashIsMatchWith1x3 = js.Function1[/* object */ js.Object, scala.Boolean]
  type LodashIsMatchWith1x5 = js.Function1[/* source */ js.Object, scala.Boolean]
  type LodashIsMatchWith1x6 = js.Function1[/* customizer */ lodashLib.lodashMod.isMatchWithCustomizer, scala.Boolean]
  type LodashIsNaN = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsNative = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsNil = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsNull = js.Function1[/* value */ js.Any, /* is null */ scala.Boolean]
  type LodashIsNumber = js.Function1[/* value */ js.Any, /* is number */ scala.Boolean]
  type LodashIsObject = js.Function1[/* value */ js.Any, /* is object */ scala.Boolean]
  type LodashIsObjectLike = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsPlainObject = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsRegExp = js.Function1[/* value */ js.Any, /* is std.RegExp */ scala.Boolean]
  type LodashIsSafeInteger = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsSet = js.Function1[/* value */ js.Any, /* is lodash.lodash.Global.Set<any> */ scala.Boolean]
  type LodashIsString = js.Function1[/* value */ js.Any, /* is string */ scala.Boolean]
  type LodashIsSymbol = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsTypedArray = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashIsUndefined = js.Function1[/* value */ js.Any, /* is undefined */ scala.Boolean]
  type LodashIsWeakMap = js.Function1[
    /* value */ js.Any, 
    /* is lodash.lodash.Global.WeakMap<object, any> */ scala.Boolean
  ]
  type LodashIsWeakSet = js.Function1[/* value */ js.Any, /* is lodash.lodash.Global.WeakSet<object> */ scala.Boolean]
  type LodashJoin1x1 = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    java.lang.String
  ]
  type LodashJoin1x2 = js.Function1[/* separator */ java.lang.String, java.lang.String]
  type LodashKebabCase = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashKeyBy1x1[T] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | js.Object | scala.Null], 
    lodashLib.lodashMod.Dictionary[T]
  ]
  type LodashKeyBy1x2[T] = js.Function1[
    /* iteratee */ lodashLib.lodashMod.ValueIterateeCustom[T, lodashLib.lodashMod.PropertyName], 
    lodashLib.lodashMod.Dictionary[T]
  ]
  type LodashKeyBy2x2[T] = js.Function1[
    /* iteratee */ lodashLib.lodashMod.ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      lodashLib.lodashMod.PropertyName
    ], 
    lodashLib.lodashMod.Dictionary[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ]
  type LodashKeys = js.Function1[/* object */ js.Any, js.Array[java.lang.String]]
  type LodashKeysIn = js.Function1[/* object */ js.Any, js.Array[java.lang.String]]
  type LodashLast = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    js.UndefOr[js.Any]
  ]
  type LodashLastIndexOf1x1[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], scala.Double]
  type LodashLastIndexOf1x2[T] = js.Function1[/* value */ T, scala.Double]
  type LodashLastIndexOfFrom1x3[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], scala.Double]
  type LodashLastIndexOfFrom1x5 = js.Function1[/* fromIndex */ lodashLib.lodashLibNumbers.`true` | scala.Double, scala.Double]
  type LodashLastIndexOfFrom1x6[T] = js.Function1[/* value */ T, scala.Double]
  type LodashLowerCase = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashLowerFirst = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashLt1x1 = js.Function1[/* other */ js.Any, scala.Boolean]
  type LodashLt1x2 = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashLte1x1 = js.Function1[/* other */ js.Any, scala.Boolean]
  type LodashLte1x2 = js.Function1[/* value */ js.Any, scala.Boolean]
  type LodashMap1x1[T, TResult] = js.Function1[
    /* collection */ js.UndefOr[js.Array[T] | lodashLib.lodashMod.List[T] | scala.Null], 
    js.Array[TResult]
  ]
  type LodashMap1x2[T] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], js.Array[js.Any]]
  type LodashMap2x2[T] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], js.Array[js.Any]]
  type LodashMap3x1[T, TResult] = js.Function1[/* collection */ js.UndefOr[T | scala.Null], js.Array[TResult]]
  type LodashMap3x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    js.Array[js.Any]
  ]
  type LodashMap4x1[T, K /* <: java.lang.String */] = js.Function1[
    /* collection */ js.UndefOr[
      lodashLib.lodashMod.List[T] | lodashLib.lodashMod.Dictionary[T] | lodashLib.lodashMod.NumericDictionary[T] | scala.Null
    ], 
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ]
  type LodashMap5x1 = js.Function1[
    /* collection */ js.UndefOr[
      lodashLib.lodashMod.List[js.Any] | lodashLib.lodashMod.Dictionary[js.Any] | lodashLib.lodashMod.NumericDictionary[js.Any] | scala.Null
    ], 
    js.Array[js.Any]
  ]
  type LodashMap6x1 = js.Function1[
    /* collection */ js.UndefOr[
      lodashLib.lodashMod.List[js.Any] | lodashLib.lodashMod.Dictionary[js.Any] | lodashLib.lodashMod.NumericDictionary[js.Any] | scala.Null
    ], 
    js.Array[scala.Boolean]
  ]
  type LodashMapKeys1x1 = js.Function1[
    /* object */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    lodashLib.lodashMod.Dictionary[js.Any]
  ]
  type LodashMapKeys1x2[T] = js.Function1[
    /* iteratee */ lodashLib.lodashMod.ValueIteratee[scala.Double], 
    lodashLib.lodashMod.Dictionary[T]
  ]
  type LodashMapKeys2x1 = js.Function1[
    /* object */ js.UndefOr[js.Object | scala.Null], 
    lodashLib.lodashMod.Dictionary[
      /* import warning: ImportType.apply Failed type conversion: object[keyof object] */ js.Any
    ]
  ]
  type LodashMapKeys2x2[T] = js.Function1[
    /* iteratee */ lodashLib.lodashMod.ValueIteratee[java.lang.String], 
    lodashLib.lodashMod.Dictionary[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ]
  type LodashMapValues1x1[T, TResult] = js.Function1[
    /* obj */ js.UndefOr[
      lodashLib.lodashMod.Dictionary[T] | lodashLib.lodashMod.NumericDictionary[T] | scala.Null
    ], 
    lodashLib.lodashMod.Dictionary[TResult]
  ]
  type LodashMapValues2x1[T, TResult] = js.Function1[
    /* obj */ js.UndefOr[T | scala.Null], 
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: TResult}
    */ lodashLib.lodashLibStrings.LodashMapValues2x1 with js.Any
  ]
  type LodashMapValues5x1[T, TKey /* <: java.lang.String */] = js.Function1[
    /* obj */ js.UndefOr[
      lodashLib.lodashMod.Dictionary[T] | lodashLib.lodashMod.NumericDictionary[T] | scala.Null
    ], 
    lodashLib.lodashMod.Dictionary[/* import warning: ImportType.apply Failed type conversion: T[TKey] */ js.Any]
  ]
  type LodashMatchesProperty1x1 = js.Function1[/* srcValue */ js.Any, js.Function1[/* value */ js.Any, scala.Boolean]]
  type LodashMatchesProperty1x2 = js.Function1[
    /* path */ lodashLib.lodashMod.PropertyPath, 
    js.Function1[/* value */ js.Any, scala.Boolean]
  ]
  type LodashMax = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    js.UndefOr[js.Any]
  ]
  type LodashMaxBy1x1[T] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], 
    js.UndefOr[T]
  ]
  type LodashMaxBy1x2[T] = js.Function1[/* iteratee */ lodashLib.lodashMod.ValueIteratee[T], js.UndefOr[T]]
  type LodashMean = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    scala.Double
  ]
  type LodashMeanBy1x1[T] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], 
    scala.Double
  ]
  type LodashMeanBy1x2[T] = js.Function1[/* iteratee */ lodashLib.lodashMod.ValueIteratee[T], scala.Double]
  type LodashMemoize = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    (js.Function1[/* repeated */ js.Any, _]) with lodashLib.lodashMod.MemoizedFunction
  ]
  type LodashMerge1x1[TObject] = js.Function1[/* source */ js.Any, TObject with js.Any]
  type LodashMerge1x2[TSource] = js.Function1[/* object */ js.Any, js.Any with TSource]
  type LodashMergeAllWith1x1 = js.Function1[/* args */ js.Array[js.Any], js.Any]
  type LodashMergeAllWith1x2 = js.Function1[/* customizer */ lodashLib.lodashMod.MergeWithCustomizer, js.Any]
  type LodashMergeWith1x3[TObject] = js.Function1[/* source */ js.Any, TObject with js.Any]
  type LodashMergeWith1x5[TSource] = js.Function1[/* object */ js.Any, js.Any with TSource]
  type LodashMergeWith1x6[TObject, TSource] = js.Function1[/* customizer */ lodashLib.lodashMod.MergeWithCustomizer, TObject with TSource]
  type LodashMethod = js.Function1[
    /* path */ lodashLib.lodashMod.PropertyPath, 
    js.Function1[/* object */ js.Any, js.Any]
  ]
  type LodashMethodOf = js.Function1[
    /* object */ js.Object, 
    js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.Any]
  ]
  type LodashMin = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    js.UndefOr[js.Any]
  ]
  type LodashMinBy1x1[T] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], 
    js.UndefOr[T]
  ]
  type LodashMinBy1x2[T] = js.Function1[/* iteratee */ lodashLib.lodashMod.ValueIteratee[T], js.UndefOr[T]]
  type LodashMultiply1x1 = js.Function1[/* multiplicand */ scala.Double, scala.Double]
  type LodashMultiply1x2 = js.Function1[/* multiplier */ scala.Double, scala.Double]
  type LodashNoConflict = js.Function0[LoDashFp]
  type LodashNoop = js.Function1[/* repeated */ js.Any, scala.Unit]
  type LodashNow = js.Function0[scala.Double]
  type LodashNth1x1 = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    js.UndefOr[js.Any]
  ]
  type LodashNth1x2[T] = js.Function1[/* n */ scala.Double, js.UndefOr[T]]
  type LodashNthArg = js.Function1[/* n */ scala.Double, js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashOmit1x2[T] = js.Function1[/* paths */ lodashLib.lodashMod.Many[lodashLib.lodashMod.PropertyName], T]
  type LodashOmit2x1[T, K /* <: java.lang.String */] = js.Function1[/* object */ js.UndefOr[T | scala.Null], lodashLib.lodashMod.Omit[T, K]]
  type LodashOmitBy1x2[T] = js.Function1[
    /* predicate */ lodashLib.lodashMod.ValueKeyIteratee[T], 
    lodashLib.lodashMod.Dictionary[T]
  ]
  type LodashOmitBy2x2[T] = js.Function1[
    /* predicate */ lodashLib.lodashMod.ValueKeyIteratee[T], 
    lodashLib.lodashMod.NumericDictionary[T]
  ]
  type LodashOmitBy3x2[T] = js.Function1[
    /* predicate */ lodashLib.lodashMod.ValueKeyIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any], 
    lodashLib.lodashMod.PartialObject[T]
  ]
  type LodashOnce = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashOrderBy1x5[T] = js.Function1[
    /* orders */ lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc], 
    js.Array[T]
  ]
  type LodashOrderBy1x6[T] = js.Function1[
    /* iteratees */ (lodashLib.lodashMod.Many[js.Function1[/* value */ T, lodashLib.lodashMod.NotVoid]]) | lodashLib.lodashMod.Many[lodashLib.lodashMod.ValueIteratee[T]], 
    js.Array[T]
  ]
  type LodashOrderBy2x5[T] = js.Function1[
    /* orders */ lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc], 
    js.Array[T]
  ]
  type LodashOrderBy3x5[T] = js.Function1[
    /* orders */ lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc], 
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ]
  type LodashOrderBy3x6[T] = js.Function1[
    /* iteratees */ (lodashLib.lodashMod.Many[
      js.Function1[
        /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        lodashLib.lodashMod.NotVoid
      ]
    ]) | (lodashLib.lodashMod.Many[
      lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
    ]), 
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ]
  type LodashOrderBy4x5[T] = js.Function1[
    /* orders */ lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc], 
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ]
  type LodashOver = js.Function1[
    /* iteratees */ lodashLib.lodashMod.Many[js.Function1[/* repeated */ js.Any, js.Any]], 
    js.Function1[/* repeated */ js.Any, js.Array[js.Any]]
  ]
  type LodashOverArgs1x1 = js.Function1[
    /* transforms */ lodashLib.lodashMod.Many[js.Function1[/* repeated */ js.Any, js.Any]], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashOverArgs1x2 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashOverEvery = js.Function1[
    /* predicates */ lodashLib.lodashMod.Many[js.Function1[/* repeated */ js.Any, scala.Boolean]], 
    js.Function1[/* repeated */ js.Any, scala.Boolean]
  ]
  type LodashOverSome = js.Function1[
    /* predicates */ lodashLib.lodashMod.Many[js.Function1[/* repeated */ js.Any, scala.Boolean]], 
    js.Function1[/* repeated */ js.Any, scala.Boolean]
  ]
  type LodashPad1x1 = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashPad1x2 = js.Function1[/* length */ scala.Double, java.lang.String]
  type LodashPadChars1x3 = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashPadChars1x5 = js.Function1[/* length */ scala.Double, java.lang.String]
  type LodashPadChars1x6 = js.Function1[/* chars */ java.lang.String, java.lang.String]
  type LodashPadCharsEnd1x3 = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashPadCharsEnd1x5 = js.Function1[/* length */ scala.Double, java.lang.String]
  type LodashPadCharsEnd1x6 = js.Function1[/* chars */ java.lang.String, java.lang.String]
  type LodashPadCharsStart1x3 = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashPadCharsStart1x5 = js.Function1[/* length */ scala.Double, java.lang.String]
  type LodashPadCharsStart1x6 = js.Function1[/* chars */ java.lang.String, java.lang.String]
  type LodashPadEnd1x1 = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashPadEnd1x2 = js.Function1[/* length */ scala.Double, java.lang.String]
  type LodashPadStart1x1 = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashPadStart1x2 = js.Function1[/* length */ scala.Double, java.lang.String]
  type LodashParseInt1x1 = js.Function1[/* string */ java.lang.String, scala.Double]
  type LodashParseInt1x2 = js.Function1[/* radix */ scala.Double, scala.Double]
  type LodashPartial19x2[T4] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[js.Any, js.Any, js.Any, T4, js.Any], 
    lodashLib.lodashMod.Function3[js.Any, js.Any, js.Any, js.Any]
  ]
  type LodashPartial1x1[T1, R] = js.Function1[/* arg1 */ js.Array[T1], lodashLib.lodashMod.Function0[R]]
  type LodashPartial20x2[T1, T4] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[T1, js.Any, js.Any, T4, js.Any], 
    lodashLib.lodashMod.Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartial21x2[T2, T4] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[js.Any, T2, js.Any, T4, js.Any], 
    lodashLib.lodashMod.Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartial22x2[T1, T2, T4] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[T1, T2, js.Any, T4, js.Any], 
    lodashLib.lodashMod.Function1[js.Any, js.Any]
  ]
  type LodashPartial23x2[T3, T4] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[js.Any, js.Any, T3, T4, js.Any], 
    lodashLib.lodashMod.Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartial24x2[T1, T3, T4] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[T1, js.Any, T3, T4, js.Any], 
    lodashLib.lodashMod.Function1[js.Any, js.Any]
  ]
  type LodashPartial25x2[T2, T3, T4] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[js.Any, T2, T3, T4, js.Any], 
    lodashLib.lodashMod.Function1[js.Any, js.Any]
  ]
  type LodashPartial26x2[T1, T2, T3, T4] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[T1, T2, T3, T4, js.Any], 
    lodashLib.lodashMod.Function0[js.Any]
  ]
  type LodashPartial27x1 = js.Function1[/* args */ js.Array[js.Any], js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashPartial27x2 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashPartialRight10x2[T2, T3] = js.Function1[
    /* func */ lodashLib.lodashMod.Function3[js.Any, T2, T3, js.Any], 
    lodashLib.lodashMod.Function1[js.Any, js.Any]
  ]
  type LodashPartialRight11x2[T1, T2, T3] = js.Function1[
    /* func */ lodashLib.lodashMod.Function3[T1, T2, T3, js.Any], 
    lodashLib.lodashMod.Function0[js.Any]
  ]
  type LodashPartialRight12x2[T1] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[T1, js.Any, js.Any, js.Any, js.Any], 
    lodashLib.lodashMod.Function3[js.Any, js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight13x2[T2] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[js.Any, T2, js.Any, js.Any, js.Any], 
    lodashLib.lodashMod.Function3[js.Any, js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight14x2[T1, T2] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[T1, T2, js.Any, js.Any, js.Any], 
    lodashLib.lodashMod.Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight15x2[T3] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[js.Any, js.Any, T3, js.Any, js.Any], 
    lodashLib.lodashMod.Function3[js.Any, js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight16x2[T1, T3] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[T1, js.Any, T3, js.Any, js.Any], 
    lodashLib.lodashMod.Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight17x2[T2, T3] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[js.Any, T2, T3, js.Any, js.Any], 
    lodashLib.lodashMod.Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight18x2[T1, T2, T3] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[T1, T2, T3, js.Any, js.Any], 
    lodashLib.lodashMod.Function1[js.Any, js.Any]
  ]
  type LodashPartialRight19x2[T4] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[js.Any, js.Any, js.Any, T4, js.Any], 
    lodashLib.lodashMod.Function3[js.Any, js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight1x1[T1, R] = js.Function1[/* arg1 */ js.Array[T1], lodashLib.lodashMod.Function0[R]]
  type LodashPartialRight1x2[T1] = js.Function1[
    /* func */ lodashLib.lodashMod.Function1[T1, js.Any], 
    lodashLib.lodashMod.Function0[js.Any]
  ]
  type LodashPartialRight20x2[T1, T4] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[T1, js.Any, js.Any, T4, js.Any], 
    lodashLib.lodashMod.Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight21x2[T2, T4] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[js.Any, T2, js.Any, T4, js.Any], 
    lodashLib.lodashMod.Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight22x2[T1, T2, T4] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[T1, T2, js.Any, T4, js.Any], 
    lodashLib.lodashMod.Function1[js.Any, js.Any]
  ]
  type LodashPartialRight23x2[T3, T4] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[js.Any, js.Any, T3, T4, js.Any], 
    lodashLib.lodashMod.Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight24x2[T1, T3, T4] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[T1, js.Any, T3, T4, js.Any], 
    lodashLib.lodashMod.Function1[js.Any, js.Any]
  ]
  type LodashPartialRight25x2[T2, T3, T4] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[js.Any, T2, T3, T4, js.Any], 
    lodashLib.lodashMod.Function1[js.Any, js.Any]
  ]
  type LodashPartialRight26x2[T1, T2, T3, T4] = js.Function1[
    /* func */ lodashLib.lodashMod.Function4[T1, T2, T3, T4, js.Any], 
    lodashLib.lodashMod.Function0[js.Any]
  ]
  type LodashPartialRight27x1 = js.Function1[/* args */ js.Array[js.Any], js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashPartialRight27x2 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashPartialRight2x2[T1] = js.Function1[
    /* func */ lodashLib.lodashMod.Function2[T1, js.Any, js.Any], 
    lodashLib.lodashMod.Function1[js.Any, js.Any]
  ]
  type LodashPartialRight3x2[T2] = js.Function1[
    /* func */ lodashLib.lodashMod.Function2[js.Any, T2, js.Any], 
    lodashLib.lodashMod.Function1[js.Any, js.Any]
  ]
  type LodashPartialRight4x2[T1, T2] = js.Function1[
    /* func */ lodashLib.lodashMod.Function2[T1, T2, js.Any], 
    lodashLib.lodashMod.Function0[js.Any]
  ]
  type LodashPartialRight5x2[T1] = js.Function1[
    /* func */ lodashLib.lodashMod.Function3[T1, js.Any, js.Any, js.Any], 
    lodashLib.lodashMod.Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight6x2[T2] = js.Function1[
    /* func */ lodashLib.lodashMod.Function3[js.Any, T2, js.Any, js.Any], 
    lodashLib.lodashMod.Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight7x2[T1, T2] = js.Function1[
    /* func */ lodashLib.lodashMod.Function3[T1, T2, js.Any, js.Any], 
    lodashLib.lodashMod.Function1[js.Any, js.Any]
  ]
  type LodashPartialRight8x2[T3] = js.Function1[
    /* func */ lodashLib.lodashMod.Function3[js.Any, js.Any, T3, js.Any], 
    lodashLib.lodashMod.Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight9x2[T1, T3] = js.Function1[
    /* func */ lodashLib.lodashMod.Function3[T1, js.Any, T3, js.Any], 
    lodashLib.lodashMod.Function1[js.Any, js.Any]
  ]
  type LodashPartition1x1[T] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | js.Object | scala.Null], 
    js.Tuple2[js.Array[T], js.Array[T]]
  ]
  type LodashPartition1x2[T] = js.Function1[
    /* callback */ lodashLib.lodashMod.ValueIteratee[T], 
    js.Tuple2[js.Array[T], js.Array[T]]
  ]
  type LodashPartition2x2[T] = js.Function1[
    /* callback */ lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any], 
    js.Tuple2[
      js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any], 
      js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
    ]
  ]
  type LodashPath1x2[TObject] = js.Function1[
    /* path */ java.lang.String | js.Array[java.lang.String], 
    /* import warning: ImportType.apply Failed type conversion: TObject[keyof TObject] */ js.Any
  ]
  type LodashPath2x2[TObject] = js.Function1[
    /* path */ java.lang.String | js.Array[java.lang.String], 
    js.UndefOr[
      /* import warning: ImportType.apply Failed type conversion: TObject[keyof TObject] */ js.Any
    ]
  ]
  type LodashPath3x2[T] = js.Function1[/* path */ scala.Double, T]
  type LodashPath4x2[T] = js.Function1[/* path */ scala.Double, js.UndefOr[T]]
  type LodashPath5x2 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.UndefOr[scala.Nothing]]
  type LodashPath6x2 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.Any]
  type LodashPathOr1x3[TObject, TKey /* <: java.lang.String */, TDefault] = js.Function1[
    /* object */ js.UndefOr[TObject | scala.Null], 
    (stdLib.Exclude[
      /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashPathOr1x5[TObject, TDefault] = js.Function1[
    /* path */ java.lang.String | js.Array[java.lang.String], 
    (stdLib.Exclude[
      /* import warning: ImportType.apply Failed type conversion: TObject[keyof TObject] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashPathOr1x6[TObject, TKey /* <: java.lang.String */] = js.Function1[
    /* defaultValue */ js.Any, 
    (stdLib.Exclude[
      /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | js.Any
  ]
  type LodashPathOr2x3[TDefault] = js.Function1[
    /* object */ js.UndefOr[lodashLib.lodashMod.NumericDictionary[js.Any] | scala.Null], 
    js.Any | TDefault
  ]
  type LodashPathOr2x5[T, TDefault] = js.Function1[/* path */ scala.Double, T | TDefault]
  type LodashPathOr2x6[T] = js.Function1[/* defaultValue */ js.Any, T | js.Any]
  type LodashPathOr3x3[TDefault] = js.Function1[/* object */ js.UndefOr[scala.Null], TDefault]
  type LodashPathOr3x5[TDefault] = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, TDefault]
  type LodashPathOr3x6 = js.Function1[/* defaultValue */ js.Any, js.Any]
  type LodashPathOr4x3 = js.Function1[/* object */ js.Any, js.Any]
  type LodashPathOr4x5 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.Any]
  type LodashPathOr4x6 = js.Function1[/* defaultValue */ js.Any, js.Any]
  type LodashPick1x1[T, U /* <: java.lang.String */] = js.Function1[/* object */ T, stdLib.Pick[T, U]]
  type LodashPick1x2[T] = js.Function1[
    /* props */ lodashLib.lodashMod.Many[java.lang.String], 
    stdLib.Pick[T, java.lang.String]
  ]
  type LodashPick2x1 = js.Function1[
    /* object */ js.UndefOr[js.Any | scala.Null], 
    lodashLib.lodashMod.PartialDeep[js.Any]
  ]
  type LodashPick2x2[T] = js.Function1[/* props */ lodashLib.lodashMod.PropertyPath, lodashLib.lodashMod.PartialDeep[T]]
  type LodashPickBy5x2[T] = js.Function1[
    /* predicate */ lodashLib.lodashMod.ValueKeyIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any], 
    lodashLib.lodashMod.PartialObject[T]
  ]
  type LodashProp1x2[TObject] = js.Function1[
    /* path */ java.lang.String | js.Array[java.lang.String], 
    /* import warning: ImportType.apply Failed type conversion: TObject[keyof TObject] */ js.Any
  ]
  type LodashProp2x2[TObject] = js.Function1[
    /* path */ java.lang.String | js.Array[java.lang.String], 
    js.UndefOr[
      /* import warning: ImportType.apply Failed type conversion: TObject[keyof TObject] */ js.Any
    ]
  ]
  type LodashProp3x2[T] = js.Function1[/* path */ scala.Double, T]
  type LodashProp4x2[T] = js.Function1[/* path */ scala.Double, js.UndefOr[T]]
  type LodashProp5x2 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.UndefOr[scala.Nothing]]
  type LodashProp6x2 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.Any]
  type LodashPropOr1x3[TObject, TKey /* <: java.lang.String */, TDefault] = js.Function1[
    /* object */ js.UndefOr[TObject | scala.Null], 
    (stdLib.Exclude[
      /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashPropOr1x5[TObject, TDefault] = js.Function1[
    /* path */ java.lang.String | js.Array[java.lang.String], 
    (stdLib.Exclude[
      /* import warning: ImportType.apply Failed type conversion: TObject[keyof TObject] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashPropOr1x6[TObject, TKey /* <: java.lang.String */] = js.Function1[
    /* defaultValue */ js.Any, 
    (stdLib.Exclude[
      /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | js.Any
  ]
  type LodashPropOr2x3[TDefault] = js.Function1[
    /* object */ js.UndefOr[lodashLib.lodashMod.NumericDictionary[js.Any] | scala.Null], 
    js.Any | TDefault
  ]
  type LodashPropOr2x5[T, TDefault] = js.Function1[/* path */ scala.Double, T | TDefault]
  type LodashPropOr2x6[T] = js.Function1[/* defaultValue */ js.Any, T | js.Any]
  type LodashPropOr3x3[TDefault] = js.Function1[/* object */ js.UndefOr[scala.Null], TDefault]
  type LodashPropOr3x5[TDefault] = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, TDefault]
  type LodashPropOr3x6 = js.Function1[/* defaultValue */ js.Any, js.Any]
  type LodashPropOr4x3 = js.Function1[/* object */ js.Any, js.Any]
  type LodashPropOr4x5 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.Any]
  type LodashPropOr4x6 = js.Function1[/* defaultValue */ js.Any, js.Any]
  type LodashProperty1x2[TObject] = js.Function1[
    /* path */ java.lang.String | js.Array[java.lang.String], 
    /* import warning: ImportType.apply Failed type conversion: TObject[keyof TObject] */ js.Any
  ]
  type LodashProperty2x2[TObject] = js.Function1[
    /* path */ java.lang.String | js.Array[java.lang.String], 
    js.UndefOr[
      /* import warning: ImportType.apply Failed type conversion: TObject[keyof TObject] */ js.Any
    ]
  ]
  type LodashProperty3x2[T] = js.Function1[/* path */ scala.Double, T]
  type LodashProperty4x2[T] = js.Function1[/* path */ scala.Double, js.UndefOr[T]]
  type LodashProperty5x2 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.UndefOr[scala.Nothing]]
  type LodashProperty6x2 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.Any]
  type LodashPropertyOf1x2[TObject] = js.Function1[
    /* path */ java.lang.String | js.Array[java.lang.String], 
    /* import warning: ImportType.apply Failed type conversion: TObject[keyof TObject] */ js.Any
  ]
  type LodashPropertyOf2x2[TObject] = js.Function1[
    /* path */ java.lang.String | js.Array[java.lang.String], 
    js.UndefOr[
      /* import warning: ImportType.apply Failed type conversion: TObject[keyof TObject] */ js.Any
    ]
  ]
  type LodashPropertyOf3x2[T] = js.Function1[/* path */ scala.Double, T]
  type LodashPropertyOf4x2[T] = js.Function1[/* path */ scala.Double, js.UndefOr[T]]
  type LodashPropertyOf5x2 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.UndefOr[scala.Nothing]]
  type LodashPropertyOf6x2 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.Any]
  type LodashPull1x2[T] = js.Function1[/* values */ T, js.Array[T]]
  type LodashPull2x2[T] = js.Function1[/* values */ T, lodashLib.lodashMod.List[T]]
  type LodashPullAll1x2[T] = js.Function1[/* values */ lodashLib.lodashMod.List[T], js.Array[T]]
  type LodashPullAll2x2[T] = js.Function1[/* values */ lodashLib.lodashMod.List[T], lodashLib.lodashMod.List[T]]
  type LodashPullAllBy1x5[T] = js.Function1[/* values */ lodashLib.lodashMod.List[T], js.Array[T]]
  type LodashPullAllBy1x6[T] = js.Function1[/* iteratee */ lodashLib.lodashMod.ValueIteratee[T], js.Array[T]]
  type LodashPullAllBy2x5[T] = js.Function1[/* values */ lodashLib.lodashMod.List[T], lodashLib.lodashMod.List[T]]
  type LodashPullAllBy2x6[T] = js.Function1[/* iteratee */ lodashLib.lodashMod.ValueIteratee[T], lodashLib.lodashMod.List[T]]
  type LodashPullAllBy3x5[T1, T2] = js.Function1[/* values */ lodashLib.lodashMod.List[T2], js.Array[T1]]
  type LodashPullAllBy3x6[T1, T2] = js.Function1[/* iteratee */ lodashLib.lodashMod.ValueIteratee[T1 | T2], js.Array[T1]]
  type LodashPullAllBy4x5[T1, T2] = js.Function1[/* values */ lodashLib.lodashMod.List[T2], lodashLib.lodashMod.List[T1]]
  type LodashPullAllBy4x6[T1, T2] = js.Function1[
    /* iteratee */ lodashLib.lodashMod.ValueIteratee[T1 | T2], 
    lodashLib.lodashMod.List[T1]
  ]
  type LodashPullAllWith1x5[T] = js.Function1[/* values */ lodashLib.lodashMod.List[T], js.Array[T]]
  type LodashPullAllWith1x6[T] = js.Function1[/* comparator */ lodashLib.lodashMod.Comparator[T], js.Array[T]]
  type LodashPullAllWith2x5[T] = js.Function1[/* values */ lodashLib.lodashMod.List[T], lodashLib.lodashMod.List[T]]
  type LodashPullAllWith2x6[T] = js.Function1[/* comparator */ lodashLib.lodashMod.Comparator[T], lodashLib.lodashMod.List[T]]
  type LodashPullAllWith3x5[T1, T2] = js.Function1[/* values */ lodashLib.lodashMod.List[T2], js.Array[T1]]
  type LodashPullAllWith3x6[T1, T2] = js.Function1[/* comparator */ lodashLib.lodashMod.Comparator2[T1, T2], js.Array[T1]]
  type LodashPullAllWith4x5[T1, T2] = js.Function1[/* values */ lodashLib.lodashMod.List[T2], lodashLib.lodashMod.List[T1]]
  type LodashPullAllWith4x6[T1, T2] = js.Function1[
    /* comparator */ lodashLib.lodashMod.Comparator2[T1, T2], 
    lodashLib.lodashMod.List[T1]
  ]
  type LodashPullAt1x2[T] = js.Function1[/* indexes */ lodashLib.lodashMod.Many[scala.Double], js.Array[T]]
  type LodashPullAt2x2[T] = js.Function1[/* indexes */ lodashLib.lodashMod.Many[scala.Double], lodashLib.lodashMod.List[T]]
  type LodashRandom1x1 = js.Function1[/* floatingOrMax */ scala.Boolean | scala.Double, scala.Double]
  type LodashRandom1x2 = js.Function1[/* max */ scala.Double, scala.Double]
  type LodashRandom2x2 = js.Function1[/* min */ scala.Double, scala.Double]
  type LodashRange1x1 = js.Function1[/* end */ scala.Double, js.Array[scala.Double]]
  type LodashRange1x2 = js.Function1[/* start */ scala.Double, js.Array[scala.Double]]
  type LodashRangeRight1x1 = js.Function1[/* end */ scala.Double, js.Array[scala.Double]]
  type LodashRangeRight1x2 = js.Function1[/* start */ scala.Double, js.Array[scala.Double]]
  type LodashRangeStep1x3 = js.Function1[/* step */ scala.Double, js.Array[scala.Double]]
  type LodashRangeStep1x5 = js.Function1[/* end */ scala.Double, js.Array[scala.Double]]
  type LodashRangeStep1x6 = js.Function1[/* start */ scala.Double, js.Array[scala.Double]]
  type LodashRangeStepRight1x3 = js.Function1[/* step */ scala.Double, js.Array[scala.Double]]
  type LodashRangeStepRight1x5 = js.Function1[/* end */ scala.Double, js.Array[scala.Double]]
  type LodashRangeStepRight1x6 = js.Function1[/* start */ scala.Double, js.Array[scala.Double]]
  type LodashRearg1x1 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashRearg1x2 = js.Function1[
    /* indexes */ lodashLib.lodashMod.Many[scala.Double], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashReduce1x3[T, TResult] = js.Function1[
    /* collection */ js.UndefOr[js.Array[T] | lodashLib.lodashMod.List[T] | scala.Null], 
    TResult
  ]
  type LodashReduce1x5[TResult] = js.Function1[/* accumulator */ TResult, TResult]
  type LodashReduce1x6[T, TResult] = js.Function1[/* callback */ lodashLib.lodashMod.MemoIteratorCapped[T, TResult], TResult]
  type LodashReduce2x5[TResult] = js.Function1[/* accumulator */ TResult, TResult]
  type LodashReduce2x6[T, TResult] = js.Function1[/* callback */ lodashLib.lodashMod.MemoIteratorCapped[T, TResult], TResult]
  type LodashReduce3x3[T, TResult] = js.Function1[/* collection */ js.UndefOr[T | scala.Null], TResult]
  type LodashReduce3x5[TResult] = js.Function1[/* accumulator */ TResult, TResult]
  type LodashReduce3x6[T, TResult] = js.Function1[
    /* callback */ lodashLib.lodashMod.MemoIteratorCapped[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ], 
    TResult
  ]
  type LodashReduceRight1x3[T, TResult] = js.Function1[
    /* collection */ js.UndefOr[js.Array[T] | lodashLib.lodashMod.List[T] | scala.Null], 
    TResult
  ]
  type LodashReduceRight1x5[TResult] = js.Function1[/* accumulator */ TResult, TResult]
  type LodashReduceRight1x6[T, TResult] = js.Function1[/* callback */ lodashLib.lodashMod.MemoIteratorCappedRight[T, TResult], TResult]
  type LodashReduceRight2x5[TResult] = js.Function1[/* accumulator */ TResult, TResult]
  type LodashReduceRight2x6[T, TResult] = js.Function1[/* callback */ lodashLib.lodashMod.MemoIteratorCappedRight[T, TResult], TResult]
  type LodashReduceRight3x3[T, TResult] = js.Function1[/* collection */ js.UndefOr[T | scala.Null], TResult]
  type LodashReduceRight3x5[TResult] = js.Function1[/* accumulator */ TResult, TResult]
  type LodashReduceRight3x6[T, TResult] = js.Function1[
    /* callback */ lodashLib.lodashMod.MemoIteratorCappedRight[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ], 
    TResult
  ]
  type LodashReject1x1[T] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | js.Object | scala.Null], 
    js.Array[T]
  ]
  type LodashReject1x2[T] = js.Function1[
    /* predicate */ lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean], 
    js.Array[T]
  ]
  type LodashReject2x2[T] = js.Function1[
    /* predicate */ lodashLib.lodashMod.ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      scala.Boolean
    ], 
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ]
  type LodashRemove1x1[T] = js.Function1[/* array */ lodashLib.lodashMod.List[T], js.Array[T]]
  type LodashRemove1x2[T] = js.Function1[/* predicate */ lodashLib.lodashMod.ValueIteratee[T], js.Array[T]]
  type LodashRepeat1x1 = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashRepeat1x2 = js.Function1[/* n */ scala.Double, java.lang.String]
  type LodashReplace1x3 = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashReplace1x5 = js.Function1[
    /* replacement */ lodashLib.lodashMod.ReplaceFunction | java.lang.String, 
    java.lang.String
  ]
  type LodashReplace1x6 = js.Function1[/* pattern */ stdLib.RegExp | java.lang.String, java.lang.String]
  type LodashRest = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashRestFrom1x1 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashRestFrom1x2 = js.Function1[/* start */ scala.Double, js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashResult1x1 = js.Function1[/* object */ js.Any, js.Any]
  type LodashResult1x2 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.Any]
  type LodashReverse = js.Function1[/* array */ lodashLib.lodashMod.List[js.Any], lodashLib.lodashMod.List[js.Any]]
  type LodashRound = js.Function1[/* n */ scala.Double, scala.Double]
  type LodashRunInContext = js.Function1[/* context */ js.Object, lodashLib.lodashMod.LoDashStatic]
  type LodashSampleSize1x2[T] = js.Function1[/* n */ scala.Double, js.Array[T]]
  type LodashSampleSize2x2[T] = js.Function1[
    /* n */ scala.Double, 
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ]
  type LodashSet1x5[T] = js.Function1[/* value */ js.Any, T]
  type LodashSet1x6[T] = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, T]
  type LodashSet2x5 = js.Function1[/* value */ js.Any, js.Any]
  type LodashSet2x6 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.Any]
  type LodashSetWith1x11[T] = js.Function1[/* value */ js.Any, T]
  type LodashSetWith1x13[T] = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, T]
  type LodashSetWith1x14[T] = js.Function1[/* customizer */ lodashLib.lodashMod.SetWithCustomizer[T], T]
  type LodashSetWith1x7[T] = js.Function1[/* object */ T, T]
  type LodashSize = js.Function1[
    /* collection */ js.UndefOr[js.Object | java.lang.String | scala.Null], 
    scala.Double
  ]
  type LodashSlice1x3 = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    js.Array[js.Any]
  ]
  type LodashSlice1x5[T] = js.Function1[/* end */ scala.Double, js.Array[T]]
  type LodashSlice1x6[T] = js.Function1[/* start */ scala.Double, js.Array[T]]
  type LodashSnakeCase = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashSome1x1[T] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | js.Object | scala.Null], 
    scala.Boolean
  ]
  type LodashSome1x2[T] = js.Function1[
    /* predicate */ lodashLib.lodashMod.ValueIterateeCustom[T, scala.Boolean], 
    scala.Boolean
  ]
  type LodashSome2x2[T] = js.Function1[
    /* predicate */ lodashLib.lodashMod.ValueIterateeCustom[
      /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
      scala.Boolean
    ], 
    scala.Boolean
  ]
  type LodashSortBy1x1[T] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | js.Object | scala.Null], 
    js.Array[T]
  ]
  type LodashSortBy1x2[T] = js.Function1[
    /* iteratees */ lodashLib.lodashMod.Many[lodashLib.lodashMod.ValueIteratee[T]], 
    js.Array[T]
  ]
  type LodashSortBy2x2[T] = js.Function1[
    /* iteratees */ lodashLib.lodashMod.Many[
      lodashLib.lodashMod.ValueIteratee[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
    ], 
    js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
  ]
  type LodashSortedIndex1x1[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], scala.Double]
  type LodashSortedIndex1x2[T] = js.Function1[/* value */ T, scala.Double]
  type LodashSortedIndexBy1x3[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], scala.Double]
  type LodashSortedIndexBy1x5[T] = js.Function1[/* value */ T, scala.Double]
  type LodashSortedIndexBy1x6[T] = js.Function1[/* iteratee */ lodashLib.lodashMod.ValueIteratee[T], scala.Double]
  type LodashSortedIndexOf1x1[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], scala.Double]
  type LodashSortedIndexOf1x2[T] = js.Function1[/* value */ T, scala.Double]
  type LodashSortedLastIndex1x1[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], scala.Double]
  type LodashSortedLastIndex1x2[T] = js.Function1[/* value */ T, scala.Double]
  type LodashSortedLastIndexBy1x3[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], scala.Double]
  type LodashSortedLastIndexBy1x5[T] = js.Function1[/* value */ T, scala.Double]
  type LodashSortedLastIndexBy1x6[T] = js.Function1[/* iteratee */ lodashLib.lodashMod.ValueIteratee[T], scala.Double]
  type LodashSortedLastIndexOf1x1[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], scala.Double]
  type LodashSortedLastIndexOf1x2[T] = js.Function1[/* value */ T, scala.Double]
  type LodashSortedUniq = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    js.Array[js.Any]
  ]
  type LodashSortedUniqBy1x1[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashSortedUniqBy1x2[T] = js.Function1[/* iteratee */ lodashLib.lodashMod.ValueIteratee[T], js.Array[T]]
  type LodashSplit1x1 = js.Function1[/* string */ java.lang.String, js.Array[java.lang.String]]
  type LodashSplit1x2 = js.Function1[/* separator */ stdLib.RegExp | java.lang.String, js.Array[java.lang.String]]
  type LodashSpread = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashSpreadFrom1x1 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashSpreadFrom1x2[TResult] = js.Function1[/* start */ scala.Double, js.Function1[/* repeated */ js.Any, TResult]]
  type LodashStartCase = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashStartsWith1x1 = js.Function1[/* string */ java.lang.String, scala.Boolean]
  type LodashStartsWith1x2 = js.Function1[/* target */ java.lang.String, scala.Boolean]
  type LodashStubArray = js.Function0[js.Array[js.Any]]
  type LodashStubFalse = js.Function0[lodashLib.lodashLibNumbers.`false`]
  type LodashStubObject = js.Function0[js.Any]
  type LodashStubString = js.Function0[java.lang.String]
  type LodashStubTrue = js.Function0[lodashLib.lodashLibNumbers.`true`]
  type LodashSubtract1x1 = js.Function1[/* subtrahend */ scala.Double, scala.Double]
  type LodashSubtract1x2 = js.Function1[/* minuend */ scala.Double, scala.Double]
  type LodashSum = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    scala.Double
  ]
  type LodashSumBy1x1[T] = js.Function1[
    /* collection */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], 
    scala.Double
  ]
  type LodashSumBy1x2[T] = js.Function1[
    /* iteratee */ (js.Function1[/* value */ T, scala.Double]) | java.lang.String, 
    scala.Double
  ]
  type LodashTail = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    js.Array[js.Any]
  ]
  type LodashTake1x1 = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    js.Array[js.Any]
  ]
  type LodashTake1x2[T] = js.Function1[/* n */ scala.Double, js.Array[T]]
  type LodashTakeRight1x1 = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    js.Array[js.Any]
  ]
  type LodashTakeRight1x2[T] = js.Function1[/* n */ scala.Double, js.Array[T]]
  type LodashTakeRightWhile1x1[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashTakeRightWhile1x2[T] = js.Function1[/* predicate */ lodashLib.lodashMod.ValueIteratee[T], js.Array[T]]
  type LodashTakeWhile1x1[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashTakeWhile1x2[T] = js.Function1[/* predicate */ lodashLib.lodashMod.ValueIteratee[T], js.Array[T]]
  type LodashTap1x1[T] = js.Function1[/* value */ T, T]
  type LodashTap1x2[T] = js.Function1[/* interceptor */ js.Function1[/* value */ T, scala.Unit], T]
  type LodashTemplate = js.Function1[/* string */ java.lang.String, lodashLib.lodashMod.TemplateExecutor]
  type LodashThrottle1x1 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    (js.Function1[/* repeated */ js.Any, _]) with lodashLib.lodashMod.Cancelable
  ]
  type LodashThrottle1x2[T] = js.Function1[/* wait */ scala.Double, T with lodashLib.lodashMod.Cancelable]
  type LodashThru1x1[T, TResult] = js.Function1[/* value */ T, TResult]
  type LodashThru1x2[T] = js.Function1[/* interceptor */ js.Function1[/* value */ T, js.Any], js.Any]
  type LodashTimes1x1[TResult] = js.Function1[/* n */ scala.Double, js.Array[TResult]]
  type LodashTimes1x2 = js.Function1[/* iteratee */ js.Function1[/* num */ scala.Double, js.Any], js.Array[js.Any]]
  type LodashToFinite = js.Function1[/* value */ js.Any, scala.Double]
  type LodashToInteger = js.Function1[/* value */ js.Any, scala.Double]
  type LodashToLength = js.Function1[/* value */ js.Any, scala.Double]
  type LodashToLower = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashToNumber = js.Function1[/* value */ js.Any, scala.Double]
  type LodashToPath = js.Function1[/* value */ js.Any, js.Array[java.lang.String]]
  type LodashToPlainObject = js.Function1[/* value */ js.Any, js.Any]
  type LodashToSafeInteger = js.Function1[/* value */ js.Any, scala.Double]
  type LodashToString = js.Function1[/* value */ js.Any, java.lang.String]
  type LodashToUpper = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashTransform1x3[T, TResult] = js.Function1[/* object */ js.Array[T] | lodashLib.lodashMod.Dictionary[T], js.Array[TResult]]
  type LodashTransform1x5[TResult] = js.Function1[/* accumulator */ js.Array[TResult], js.Array[TResult]]
  type LodashTransform1x6[T, TResult] = js.Function1[
    /* iteratee */ lodashLib.lodashMod.MemoVoidIteratorCapped[T, js.Array[TResult]], 
    js.Array[TResult]
  ]
  type LodashTransform2x3[T, TResult] = js.Function1[
    /* object */ js.Array[T] | lodashLib.lodashMod.Dictionary[T], 
    lodashLib.lodashMod.Dictionary[TResult]
  ]
  type LodashTransform2x5[TResult] = js.Function1[
    /* accumulator */ lodashLib.lodashMod.Dictionary[TResult], 
    lodashLib.lodashMod.Dictionary[TResult]
  ]
  type LodashTransform2x6[T, TResult] = js.Function1[
    /* iteratee */ lodashLib.lodashMod.MemoVoidIteratorCapped[T, lodashLib.lodashMod.Dictionary[TResult]], 
    lodashLib.lodashMod.Dictionary[TResult]
  ]
  type LodashTransform3x5[TResult] = js.Function1[
    /* accumulator */ lodashLib.lodashMod.Dictionary[TResult], 
    lodashLib.lodashMod.Dictionary[TResult]
  ]
  type LodashTransform3x6[T, TResult] = js.Function1[
    /* iteratee */ lodashLib.lodashMod.MemoVoidIteratorCapped[T, lodashLib.lodashMod.Dictionary[TResult]], 
    lodashLib.lodashMod.Dictionary[TResult]
  ]
  type LodashTransform4x5[TResult] = js.Function1[/* accumulator */ js.Array[TResult], js.Array[TResult]]
  type LodashTransform4x6[T, TResult] = js.Function1[
    /* iteratee */ lodashLib.lodashMod.MemoVoidIteratorCapped[T, js.Array[TResult]], 
    js.Array[TResult]
  ]
  type LodashTrim = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashTrimChars1x1 = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashTrimChars1x2 = js.Function1[/* chars */ java.lang.String, java.lang.String]
  type LodashTrimCharsEnd1x1 = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashTrimCharsEnd1x2 = js.Function1[/* chars */ java.lang.String, java.lang.String]
  type LodashTrimCharsStart1x1 = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashTrimCharsStart1x2 = js.Function1[/* chars */ java.lang.String, java.lang.String]
  type LodashTrimEnd = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashTrimStart = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashTruncate1x1 = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashTruncate1x2 = js.Function1[/* options */ lodashLib.lodashMod.TruncateOptions, java.lang.String]
  type LodashUnapply = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashUnary = js.Function1[
    /* func */ js.Function2[/* arg1 */ js.Any, /* repeated */ js.Any, js.Any], 
    js.Function1[/* arg1 */ js.Any, js.Any]
  ]
  type LodashUnescape = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashUnion1x1[T] = js.Function1[/* arrays */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashUnion1x2[T] = js.Function1[/* arrays2 */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashUnionBy1x3[T] = js.Function1[/* arrays2 */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashUnionBy1x5[T] = js.Function1[/* arrays1 */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashUnionBy1x6[T] = js.Function1[/* iteratee */ lodashLib.lodashMod.ValueIteratee[T], js.Array[T]]
  type LodashUnionWith1x3[T] = js.Function1[/* arrays2 */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashUnionWith1x5[T] = js.Function1[/* arrays */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashUnionWith1x6[T] = js.Function1[/* comparator */ lodashLib.lodashMod.Comparator[T], js.Array[T]]
  type LodashUniq = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.List[js.Any] | scala.Null], 
    js.Array[js.Any]
  ]
  type LodashUniqBy1x1[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashUniqBy1x2[T] = js.Function1[/* iteratee */ lodashLib.lodashMod.ValueIteratee[T], js.Array[T]]
  type LodashUniqWith1x1[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashUniqWith1x2[T] = js.Function1[/* comparator */ lodashLib.lodashMod.Comparator[T], js.Array[T]]
  type LodashUniqueId = js.Function1[/* prefix */ java.lang.String, java.lang.String]
  type LodashUnset1x1 = js.Function1[/* object */ js.Any, js.Any]
  type LodashUnset1x2[T] = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, T]
  type LodashUnzip = js.Function1[
    /* array */ js.UndefOr[
      js.Array[js.Array[js.Any]] | lodashLib.lodashMod.List[lodashLib.lodashMod.List[js.Any]] | scala.Null
    ], 
    js.Array[js.Array[js.Any]]
  ]
  type LodashUnzipWith1x1[T, TResult] = js.Function1[
    /* array */ js.UndefOr[lodashLib.lodashMod.List[lodashLib.lodashMod.List[T]] | scala.Null], 
    js.Array[TResult]
  ]
  type LodashUnzipWith1x2[T] = js.Function1[/* iteratee */ js.Function1[/* repeated */ T, js.Any], js.Array[js.Any]]
  type LodashUpdate1x3 = js.Function1[/* object */ js.Object, js.Any]
  type LodashUpdate1x5 = js.Function1[/* updater */ js.Function1[/* value */ js.Any, js.Any], js.Any]
  type LodashUpdate1x6 = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, js.Any]
  type LodashUpdateWith1x11[T] = js.Function1[/* updater */ js.Function1[/* oldValue */ js.Any, js.Any], T]
  type LodashUpdateWith1x13[T] = js.Function1[/* path */ lodashLib.lodashMod.PropertyPath, T]
  type LodashUpdateWith1x14[T] = js.Function1[/* customizer */ lodashLib.lodashMod.SetWithCustomizer[T], T]
  type LodashUpdateWith1x7[T] = js.Function1[/* object */ T, T]
  type LodashUpperCase = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashUpperFirst = js.Function1[/* string */ java.lang.String, java.lang.String]
  type LodashWithout1x1[T] = js.Function1[/* array */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashWithout1x2[T] = js.Function1[/* values */ js.Array[T], js.Array[T]]
  type LodashWords = js.Function1[/* string */ java.lang.String, js.Array[java.lang.String]]
  type LodashWrap1x1[T, TArgs, TResult] = js.Function1[/* value */ T, js.Function1[/* repeated */ TArgs, TResult]]
  type LodashWrap2x1[T, TResult] = js.Function1[/* value */ T, js.Function1[/* repeated */ js.Any, TResult]]
  type LodashXor1x1[T] = js.Function1[/* arrays */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashXor1x2[T] = js.Function1[/* arrays2 */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashXorBy1x3[T] = js.Function1[/* arrays2 */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashXorBy1x5[T] = js.Function1[/* arrays */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashXorBy1x6[T] = js.Function1[/* iteratee */ lodashLib.lodashMod.ValueIteratee[T], js.Array[T]]
  type LodashXorWith1x3[T] = js.Function1[/* arrays2 */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashXorWith1x5[T] = js.Function1[/* arrays */ js.UndefOr[lodashLib.lodashMod.List[T] | scala.Null], js.Array[T]]
  type LodashXorWith1x6[T] = js.Function1[/* comparator */ lodashLib.lodashMod.Comparator[T], js.Array[T]]
  type LodashZip1x1[T1] = js.Function1[
    /* arrays2 */ lodashLib.lodashMod.List[js.Any], 
    js.Array[js.Tuple2[js.UndefOr[T1], js.UndefOr[js.Any]]]
  ]
  type LodashZip1x2[T2] = js.Function1[
    /* arrays1 */ lodashLib.lodashMod.List[js.Any], 
    js.Array[js.Tuple2[js.UndefOr[js.Any], js.UndefOr[T2]]]
  ]
  type LodashZipObject1x1 = js.Function1[
    /* values */ lodashLib.lodashMod.List[js.Any], 
    lodashLib.lodashMod.Dictionary[js.Any]
  ]
  type LodashZipObject1x2[T] = js.Function1[
    /* props */ lodashLib.lodashMod.List[lodashLib.lodashMod.PropertyName], 
    lodashLib.lodashMod.Dictionary[T]
  ]
  type LodashZipObjectDeep1x1 = js.Function1[/* values */ lodashLib.lodashMod.List[js.Any], js.Object]
  type LodashZipObjectDeep1x2 = js.Function1[/* paths */ lodashLib.lodashMod.List[lodashLib.lodashMod.PropertyPath], js.Object]
  type LodashZipWith1x3[T2, TResult] = js.Function1[/* arrays2 */ lodashLib.lodashMod.List[T2], js.Array[TResult]]
  type LodashZipWith1x5[T1, TResult] = js.Function1[/* arrays1 */ lodashLib.lodashMod.List[T1], js.Array[TResult]]
  type LodashZipWith1x6[T1, T2] = js.Function1[
    /* iteratee */ js.Function2[/* value1 */ T1, /* value2 */ T2, js.Any], 
    js.Array[js.Any]
  ]
}

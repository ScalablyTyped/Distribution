package typings
package ioDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ioDashTsMod {
  type Any = Type[js.Any, js.Any, js.Any]
  type AnyC = AnyType
  type ArrayC[C /* <: Mixed */] = ArrayType[
    C, 
    fpDashTsLib.libArrayMod.Global.Array[TypeOf[C]], 
    fpDashTsLib.libArrayMod.Global.Array[OutputOf[C]], 
    js.Any
  ]
  type BooleanC = BooleanType
  type Compact[A] = ioDashTsLib.ioDashTsLibStrings.Compact with A
  type Context = js.Array[ContextEntry]
  type Decode[I, A] = js.Function1[/* i */ I, Validation[A]]
  type Encode[A, O] = js.Function1[/* a */ A, O]
  type Errors = fpDashTsLib.libArrayMod.Global.Array[ValidationError]
  type Exact[T, X /* <: T */] = T with ioDashTsLib.ioDashTsLibStrings.Exact with js.Any
  type ExactC[C /* <: HasProps */] = ExactType[C, TypeOf[C], OutputOf[C], InputOf[C]]
  type FunctionC = FunctionType
  type HasProps = HasPropsRefinement | HasPropsReadonly | HasPropsIntersection | (InterfaceType[js.Any, js.Any, js.Any, js.Any]) | (StrictType[js.Any, js.Any, js.Any, js.Any]) | (PartialType[js.Any, js.Any, js.Any, js.Any])
  type IndexRecord = stdLib.Record[java.lang.String, ioDashTsLib.Index]
  type InputOf[C /* <: Any */] = /* import warning: ImportType.apply Failed type conversion: C['_I'] */ js.Any
  type IntersectionC[CS /* <: js.Array[Mixed] */] = IntersectionType[
    CS, 
    js.Any | (TypeOf[/* import warning: ImportType.apply Failed type conversion: CS['0'] */ js.Any]), 
    js.Any | (OutputOf[/* import warning: ImportType.apply Failed type conversion: CS['0'] */ js.Any]), 
    js.Any
  ]
  type Is[A] = js.Function1[/* u */ js.Any, /* is A */ scala.Boolean]
  type KeyofC[D /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */] = KeyofType[D]
  type LiteralC[V /* <: ioDashTsLib.LiteralValue */] = LiteralType[V]
  type Mixed = Type[js.Any, js.Any, js.Any]
  type NeverC = NeverType
  type NullC = NullType
  type NumberC = NumberType
  type ObjectC = ObjectType
  type OutputOf[C /* <: Any */] = /* import warning: ImportType.apply Failed type conversion: C['_O'] */ js.Any
  type OutputOfDictionary[D /* <: Any */, C /* <: Any */] = ioDashTsLib.ioDashTsLibStrings.OutputOfDictionary with js.Any
  type OutputOfPartialProps[P /* <: AnyProps */] = ioDashTsLib.ioDashTsLibStrings.OutputOfPartialProps with P
  type OutputOfProps[P /* <: AnyProps */] = ioDashTsLib.ioDashTsLibStrings.OutputOfProps with P
  type PartialC[P /* <: Props */] = PartialType[
    P, 
    ioDashTsLib.ioDashTsLibStrings.PartialC with P, 
    ioDashTsLib.ioDashTsLibStrings.PartialC with P, 
    js.Any
  ]
  type PropsOf[T /* <: ioDashTsLib.Anon_Props */] = /* import warning: ImportType.apply Failed type conversion: T['props'] */ js.Any
  type ReadonlyArrayC[C /* <: Mixed */] = ReadonlyArrayType[C, js.Array[TypeOf[C]], js.Array[OutputOf[C]], js.Any]
  type ReadonlyC[C /* <: Mixed */] = ReadonlyType[
    C, 
    ioDashTsLib.ioDashTsLibStrings.ReadonlyC with TypeOf[C], 
    ioDashTsLib.ioDashTsLibStrings.ReadonlyC with OutputOf[C], 
    js.Any
  ]
  type RecordC[D /* <: Mixed */, C /* <: Mixed */] = DictionaryType[
    D, 
    C, 
    ioDashTsLib.ioDashTsLibStrings.RecordC with js.Any, 
    ioDashTsLib.ioDashTsLibStrings.RecordC with js.Any, 
    js.Any
  ]
  type RefinementC[C /* <: Any */] = RefinementType[C, TypeOf[C], OutputOf[C], InputOf[C]]
  type StrictC[P /* <: Props */] = StrictType[
    P, 
    ioDashTsLib.ioDashTsLibStrings.StrictC with P, 
    ioDashTsLib.ioDashTsLibStrings.StrictC with P, 
    js.Any
  ]
  type StringC = StringType
  type Tagged[Tag /* <: java.lang.String */, A, O] = (InterfaceType[TaggedProps[Tag], A, O, js.Any]) | (StrictType[TaggedProps[Tag], A, O, js.Any]) | (TaggedRefinement[Tag, A, O]) | (TaggedUnion[Tag, A, O]) | (TaggedIntersection[Tag, A, O]) | (TaggedExact[Tag, A, O]) | (RecursiveType[js.Any, A, O, js.Any])
  type TaggedIntersectionArgument[Tag /* <: java.lang.String */] = (js.Array[Tagged[Tag, js.Any, js.Any]]) | (js.Tuple2[Tagged[Tag, js.Any, js.Any], Mixed]) | (js.Tuple2[Mixed, Tagged[Tag, js.Any, js.Any]]) | (js.Tuple3[Tagged[Tag, js.Any, js.Any], Mixed, Mixed]) | (js.Tuple3[Mixed, Tagged[Tag, js.Any, js.Any], Mixed]) | (js.Tuple3[Mixed, Mixed, Tagged[Tag, js.Any, js.Any]]) | (js.Tuple4[Tagged[Tag, js.Any, js.Any], Mixed, Mixed, Mixed]) | (js.Tuple4[Mixed, Tagged[Tag, js.Any, js.Any], Mixed, Mixed]) | (js.Tuple4[Mixed, Mixed, Tagged[Tag, js.Any, js.Any], Mixed]) | (js.Tuple4[Mixed, Mixed, Mixed, Tagged[Tag, js.Any, js.Any]]) | (js.Tuple5[Tagged[Tag, js.Any, js.Any], Mixed, Mixed, Mixed, Mixed]) | (js.Tuple5[Mixed, Tagged[Tag, js.Any, js.Any], Mixed, Mixed, Mixed]) | (js.Tuple5[Mixed, Mixed, Tagged[Tag, js.Any, js.Any], Mixed, Mixed]) | (js.Tuple5[Mixed, Mixed, Mixed, Tagged[Tag, js.Any, js.Any], Mixed]) | (js.Tuple5[Mixed, Mixed, Mixed, Mixed, Tagged[Tag, js.Any, js.Any]])
  type TaggedProps[Tag /* <: java.lang.String */] = ioDashTsLib.ioDashTsLibStrings.TaggedProps with js.Any
  type TaggedUnionC[Tag /* <: java.lang.String */, CS /* <: js.Array[Tagged[Tag, _, _]] */] = TaggedUnionType[
    Tag, 
    CS, 
    TypeOf[/* import warning: ImportType.apply Failed type conversion: CS[number] */ js.Any], 
    OutputOf[/* import warning: ImportType.apply Failed type conversion: CS[number] */ js.Any], 
    js.Any
  ]
  type TupleC[CS /* <: js.Array[Mixed] */] = TupleType[
    CS, 
    js.Any | (js.Tuple5[
      TypeOf[/* import warning: ImportType.apply Failed type conversion: CS['0'] */ js.Any], 
      TypeOf[/* import warning: ImportType.apply Failed type conversion: CS['1'] */ js.Any], 
      TypeOf[/* import warning: ImportType.apply Failed type conversion: CS['2'] */ js.Any], 
      TypeOf[/* import warning: ImportType.apply Failed type conversion: CS['3'] */ js.Any], 
      TypeOf[/* import warning: ImportType.apply Failed type conversion: CS['4'] */ js.Any]
    ]) | (js.Tuple4[
      TypeOf[/* import warning: ImportType.apply Failed type conversion: CS['0'] */ js.Any], 
      TypeOf[/* import warning: ImportType.apply Failed type conversion: CS['1'] */ js.Any], 
      TypeOf[/* import warning: ImportType.apply Failed type conversion: CS['2'] */ js.Any], 
      TypeOf[/* import warning: ImportType.apply Failed type conversion: CS['3'] */ js.Any]
    ]) | (js.Tuple3[
      TypeOf[/* import warning: ImportType.apply Failed type conversion: CS['0'] */ js.Any], 
      TypeOf[/* import warning: ImportType.apply Failed type conversion: CS['1'] */ js.Any], 
      TypeOf[/* import warning: ImportType.apply Failed type conversion: CS['2'] */ js.Any]
    ]) | (js.Tuple2[
      TypeOf[/* import warning: ImportType.apply Failed type conversion: CS['0'] */ js.Any], 
      TypeOf[/* import warning: ImportType.apply Failed type conversion: CS['1'] */ js.Any]
    ]) | (js.Array[
      TypeOf[/* import warning: ImportType.apply Failed type conversion: CS['0'] */ js.Any]
    ]), 
    js.Any | (js.Tuple5[
      OutputOf[/* import warning: ImportType.apply Failed type conversion: CS['0'] */ js.Any], 
      OutputOf[/* import warning: ImportType.apply Failed type conversion: CS['1'] */ js.Any], 
      OutputOf[/* import warning: ImportType.apply Failed type conversion: CS['2'] */ js.Any], 
      OutputOf[/* import warning: ImportType.apply Failed type conversion: CS['3'] */ js.Any], 
      OutputOf[/* import warning: ImportType.apply Failed type conversion: CS['4'] */ js.Any]
    ]) | (js.Tuple4[
      OutputOf[/* import warning: ImportType.apply Failed type conversion: CS['0'] */ js.Any], 
      OutputOf[/* import warning: ImportType.apply Failed type conversion: CS['1'] */ js.Any], 
      OutputOf[/* import warning: ImportType.apply Failed type conversion: CS['2'] */ js.Any], 
      OutputOf[/* import warning: ImportType.apply Failed type conversion: CS['3'] */ js.Any]
    ]) | (js.Tuple3[
      OutputOf[/* import warning: ImportType.apply Failed type conversion: CS['0'] */ js.Any], 
      OutputOf[/* import warning: ImportType.apply Failed type conversion: CS['1'] */ js.Any], 
      OutputOf[/* import warning: ImportType.apply Failed type conversion: CS['2'] */ js.Any]
    ]) | (js.Tuple2[
      OutputOf[/* import warning: ImportType.apply Failed type conversion: CS['0'] */ js.Any], 
      OutputOf[/* import warning: ImportType.apply Failed type conversion: CS['1'] */ js.Any]
    ]) | (js.Array[
      OutputOf[/* import warning: ImportType.apply Failed type conversion: CS['0'] */ js.Any]
    ]), 
    js.Any
  ]
  type TypeC[P /* <: Props */] = InterfaceType[
    P, 
    ioDashTsLib.ioDashTsLibStrings.TypeC with P, 
    ioDashTsLib.ioDashTsLibStrings.TypeC with P, 
    js.Any
  ]
  type TypeOf[C /* <: Any */] = /* import warning: ImportType.apply Failed type conversion: C['_A'] */ js.Any
  type TypeOfDictionary[D /* <: Any */, C /* <: Any */] = ioDashTsLib.ioDashTsLibStrings.TypeOfDictionary with js.Any
  type TypeOfPartialProps[P /* <: AnyProps */] = ioDashTsLib.ioDashTsLibStrings.TypeOfPartialProps with P
  type TypeOfProps[P /* <: AnyProps */] = ioDashTsLib.ioDashTsLibStrings.TypeOfProps with P
  type UndefinedC = UndefinedType
  type UnionC[CS /* <: js.Array[Mixed] */] = UnionType[
    CS, 
    TypeOf[/* import warning: ImportType.apply Failed type conversion: CS[number] */ js.Any], 
    OutputOf[/* import warning: ImportType.apply Failed type conversion: CS[number] */ js.Any], 
    js.Any
  ]
  type UnknownArrayC = AnyArrayType
  type UnknownC = UnknownType
  type UnknownRecordC = AnyDictionaryType
  type Validate[I, A] = js.Function2[/* i */ I, /* context */ Context, Validation[A]]
  type Validation[A] = fpDashTsLib.libEitherMod.Either[Errors, A]
  type VoidC = VoidType
  type mixed = js.Any
}

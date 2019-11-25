package typings.ioDashTs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ioDashTsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.ioDashTs.Anon_Props

  type Any = Type[js.Any, js.Any, js.Any]
  type AnyC = AnyType
  type AnyProps = StringDictionary[Any]
  type ArrayC[C /* <: Mixed */] = ArrayType[C, js.Array[TypeOf[C]], js.Array[OutputOf[C]], js.Any]
  type BooleanC = BooleanType
  type BrandC[C /* <: Any */, B] = RefinementType[C, Branded[TypeOf[C], B], OutputOf[C], InputOf[C]]
  type Branded[A, B] = A with Brand[B]
  type Compact[A] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: A[K]}
    */ typings.ioDashTs.ioDashTsStrings.Compact with A
  type Context = js.Array[ContextEntry]
  type Decode[I, A] = js.Function1[/* i */ I, Validation[A]]
  type Encode[A, O] = js.Function1[/* a */ A, O]
  type Errors = js.Array[ValidationError]
  type Exact[T, X /* <: T */] = T with typings.ioDashTs.ioDashTsStrings.Exact with js.Any
  type ExactC[C /* <: HasProps */] = ExactType[C, TypeOf[C], OutputOf[C], InputOf[C]]
  type FunctionC = FunctionType
  /* Rewritten from type alias, can be one of: 
    - typings.ioDashTs.ioDashTsMod.HasPropsRefinement
    - typings.ioDashTs.ioDashTsMod.HasPropsReadonly
    - typings.ioDashTs.ioDashTsMod.HasPropsIntersection
    - typings.ioDashTs.ioDashTsMod.InterfaceType[js.Any, js.Any, js.Any, js.Any]
    - typings.ioDashTs.ioDashTsMod.StrictType[js.Any, js.Any, js.Any, js.Any]
    - typings.ioDashTs.ioDashTsMod.PartialType[js.Any, js.Any, js.Any, js.Any]
  */
  type HasProps = _HasProps | (InterfaceType[js.Any, js.Any, js.Any, js.Any]) | (StrictType[js.Any, js.Any, js.Any, js.Any]) | (PartialType[js.Any, js.Any, js.Any, js.Any])
  type InputOf[C /* <: Any */] = /* import warning: importer.ImportType#apply Failed type conversion: C['_I'] */ js.Any
  type Int = Branded[Double, IntBrand]
  type IntersectionC[CS /* <: js.Array[Mixed] */] = IntersectionType[
    CS, 
    js.Any | (TypeOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
    ]), 
    js.Any | (OutputOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
    ]), 
    js.Any
  ]
  type Is[A] = js.Function1[/* u */ js.Any, /* is A */ Boolean]
  type KeyofC[D /* <: StringDictionary[js.Any] */] = KeyofType[D]
  type LiteralC[V /* <: LiteralValue */] = LiteralType[V]
  type LiteralValue = String | Double | Boolean
  type Mixed = Type[js.Any, js.Any, js.Any]
  type NeverC = NeverType
  type NullC = NullType
  type NumberC = NumberType
  type ObjectC = ObjectType
  type OutputOf[C /* <: Any */] = /* import warning: importer.ImportType#apply Failed type conversion: C['_O'] */ js.Any
  type OutputOfDictionary[D /* <: Any */, C /* <: Any */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in io-ts.io-ts.OutputOf<D> ]: io-ts.io-ts.OutputOf<C>}
    */ typings.ioDashTs.ioDashTsStrings.OutputOfDictionary with js.Any
  type OutputOfPartialProps[P /* <: AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]:? io-ts.io-ts.OutputOf<P[K]>}
    */ typings.ioDashTs.ioDashTsStrings.OutputOfPartialProps with P
  type OutputOfProps[P /* <: AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>}
    */ typings.ioDashTs.ioDashTsStrings.OutputOfProps with P
  type PartialC[P /* <: Props */] = PartialType[
    P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]:? io-ts.io-ts.TypeOf<P[K]>}
    */ typings.ioDashTs.ioDashTsStrings.PartialC with P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]:? io-ts.io-ts.OutputOf<P[K]>}
    */ typings.ioDashTs.ioDashTsStrings.PartialC with P, 
    js.Any
  ]
  type Props = StringDictionary[Mixed]
  type PropsOf[T /* <: Anon_Props */] = /* import warning: importer.ImportType#apply Failed type conversion: T['props'] */ js.Any
  type ReadonlyArrayC[C /* <: Mixed */] = ReadonlyArrayType[C, js.Array[TypeOf[C]], js.Array[OutputOf[C]], js.Any]
  type ReadonlyC[C /* <: Mixed */] = ReadonlyType[
    C, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof io-ts.io-ts.TypeOf<C> ]: io-ts.io-ts.TypeOf<C>[K]}
    */ typings.ioDashTs.ioDashTsStrings.ReadonlyC with TypeOf[C], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof io-ts.io-ts.OutputOf<C> ]: io-ts.io-ts.OutputOf<C>[K]}
    */ typings.ioDashTs.ioDashTsStrings.ReadonlyC with OutputOf[C], 
    js.Any
  ]
  type RecordC[D /* <: Mixed */, C /* <: Mixed */] = DictionaryType[
    D, 
    C, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in io-ts.io-ts.TypeOf<D> ]: io-ts.io-ts.TypeOf<C>}
    */ typings.ioDashTs.ioDashTsStrings.RecordC with js.Any, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in io-ts.io-ts.OutputOf<D> ]: io-ts.io-ts.OutputOf<C>}
    */ typings.ioDashTs.ioDashTsStrings.RecordC with js.Any, 
    js.Any
  ]
  type RefinementC[C /* <: Any */] = RefinementType[C, TypeOf[C], OutputOf[C], InputOf[C]]
  type StrictC[P /* <: Props */] = StrictType[
    P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>}
    */ typings.ioDashTs.ioDashTsStrings.StrictC with P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>}
    */ typings.ioDashTs.ioDashTsStrings.StrictC with P, 
    js.Any
  ]
  type StringC = StringType
  /* Rewritten from type alias, can be one of: 
    - typings.ioDashTs.ioDashTsMod.InterfaceType[typings.ioDashTs.ioDashTsMod.TaggedProps[Tag], A, O, js.Any]
    - typings.ioDashTs.ioDashTsMod.StrictType[typings.ioDashTs.ioDashTsMod.TaggedProps[Tag], A, O, js.Any]
    - typings.ioDashTs.ioDashTsMod.TaggedRefinement[Tag, A, O]
    - typings.ioDashTs.ioDashTsMod.TaggedUnion[Tag, A, O]
    - typings.ioDashTs.ioDashTsMod.TaggedIntersection[Tag, A, O]
    - typings.ioDashTs.ioDashTsMod.TaggedExact[Tag, A, O]
    - typings.ioDashTs.ioDashTsMod.RecursiveType[js.Any, A, O, js.Any]
  */
  type Tagged[Tag /* <: String */, A, O] = (_Tagged[Tag, A, O]) | (InterfaceType[TaggedProps[Tag], A, O, js.Any]) | (StrictType[TaggedProps[Tag], A, O, js.Any]) | (RecursiveType[js.Any, A, O, js.Any])
  type TaggedIntersectionArgument[Tag /* <: String */] = (js.Array[Tagged[Tag, js.Any, js.Any]]) | (js.Tuple2[Mixed | (Tagged[Tag, js.Any, js.Any]), Mixed | (Tagged[Tag, js.Any, js.Any])]) | (js.Tuple3[
    Mixed | (Tagged[Tag, js.Any, js.Any]), 
    Mixed | (Tagged[Tag, js.Any, js.Any]), 
    Mixed | (Tagged[Tag, js.Any, js.Any])
  ]) | (js.Tuple4[
    Mixed | (Tagged[Tag, js.Any, js.Any]), 
    Mixed | (Tagged[Tag, js.Any, js.Any]), 
    Mixed | (Tagged[Tag, js.Any, js.Any]), 
    Mixed | (Tagged[Tag, js.Any, js.Any])
  ]) | (js.Tuple5[
    Mixed | (Tagged[Tag, js.Any, js.Any]), 
    Mixed | (Tagged[Tag, js.Any, js.Any]), 
    Mixed | (Tagged[Tag, js.Any, js.Any]), 
    Mixed | (Tagged[Tag, js.Any, js.Any]), 
    Mixed | (Tagged[Tag, js.Any, js.Any])
  ])
  type TaggedProps[Tag /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Tag ]: io-ts.io-ts.LiteralType<any>}
    */ typings.ioDashTs.ioDashTsStrings.TaggedProps with js.Any
  type TaggedUnionC[Tag /* <: String */, CS /* <: js.Array[Mixed] */] = TaggedUnionType[
    Tag, 
    CS, 
    TypeOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
    ], 
    OutputOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
    ], 
    js.Any
  ]
  type TupleC[CS /* <: js.Array[Mixed] */] = TupleType[
    CS, 
    js.Any | (js.Tuple5[
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[3] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[4] */ js.Any
      ]
    ]) | (js.Tuple4[
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[3] */ js.Any
      ]
    ]) | (js.Tuple3[
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ]
    ]) | (js.Tuple2[
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ]
    ]) | (js.Array[
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ]
    ]), 
    js.Any | (js.Tuple5[
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ], 
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[3] */ js.Any
      ], 
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[4] */ js.Any
      ]
    ]) | (js.Tuple4[
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ], 
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[3] */ js.Any
      ]
    ]) | (js.Tuple3[
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ]
    ]) | (js.Tuple2[
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ]
    ]) | (js.Array[
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ]
    ]), 
    js.Any
  ]
  type TypeC[P /* <: Props */] = InterfaceType[
    P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>}
    */ typings.ioDashTs.ioDashTsStrings.TypeC with P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>}
    */ typings.ioDashTs.ioDashTsStrings.TypeC with P, 
    js.Any
  ]
  type TypeOf[C /* <: Any */] = /* import warning: importer.ImportType#apply Failed type conversion: C['_A'] */ js.Any
  type TypeOfDictionary[D /* <: Any */, C /* <: Any */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in io-ts.io-ts.TypeOf<D> ]: io-ts.io-ts.TypeOf<C>}
    */ typings.ioDashTs.ioDashTsStrings.TypeOfDictionary with js.Any
  type TypeOfPartialProps[P /* <: AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]:? io-ts.io-ts.TypeOf<P[K]>}
    */ typings.ioDashTs.ioDashTsStrings.TypeOfPartialProps with P
  type TypeOfProps[P /* <: AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>}
    */ typings.ioDashTs.ioDashTsStrings.TypeOfProps with P
  type UndefinedC = UndefinedType
  type UnionC[CS /* <: js.Array[Mixed] */] = UnionType[
    CS, 
    TypeOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
    ], 
    OutputOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
    ], 
    js.Any
  ]
  type UnknownArrayC = AnyArrayType
  type UnknownC = UnknownType
  type UnknownRecordC = AnyDictionaryType
  type Validate[I, A] = js.Function2[/* i */ I, /* context */ Context, Validation[A]]
  type Validation[A] = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Either<Errors, A> */ js.Any
  type VoidC = VoidType
  type mixed = js.Any
}

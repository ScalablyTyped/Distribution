package typings.ioTs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnyC = typings.ioTs.mod.AnyType
  type AnyProps = org.scalablytyped.runtime.StringDictionary[typings.ioTs.mod.Any_]
  type Any_ = typings.ioTs.mod.Type_[js.Any, js.Any, js.Any]
  type ArrayC[C /* <: typings.ioTs.mod.Mixed_ */] = typings.ioTs.mod.ArrayType[
    C, 
    js.Array[typings.ioTs.mod.TypeOf[C]], 
    js.Array[typings.ioTs.mod.OutputOf[C]], 
    js.Any
  ]
  type BigIntC = typings.ioTs.mod.BigIntType
  type BooleanC = typings.ioTs.mod.BooleanType
  type BrandC[C /* <: typings.ioTs.mod.Any_ */, B] = typings.ioTs.mod.RefinementType[
    C, 
    typings.ioTs.mod.Branded[typings.ioTs.mod.TypeOf[C], B], 
    typings.ioTs.mod.OutputOf[C], 
    typings.ioTs.mod.InputOf[C]
  ]
  type Branded[A, B] = A with typings.ioTs.mod.Brand_[B]
  type Compact[A] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: A[K]}
    */ typings.ioTs.ioTsStrings.Compact with A
  type Context = js.Array[typings.ioTs.mod.ContextEntry]
  type Decode[I, A] = js.Function1[/* i */ I, typings.ioTs.mod.Validation[A]]
  type Encode[A, O] = js.Function1[/* a */ A, O]
  type Errors = js.Array[typings.ioTs.mod.ValidationError]
  type ExactC[C /* <: typings.ioTs.mod.HasProps */] = typings.ioTs.mod.ExactType[
    C, 
    typings.ioTs.mod.TypeOf[C], 
    typings.ioTs.mod.OutputOf[C], 
    typings.ioTs.mod.InputOf[C]
  ]
  type Exact_[T, X /* <: T */] = T with typings.ioTs.ioTsStrings.Exact with js.Any
  type FunctionC = typings.ioTs.mod.FunctionType
  /* Rewritten from type alias, can be one of: 
    - typings.ioTs.mod.HasPropsRefinement
    - typings.ioTs.mod.HasPropsReadonly
    - typings.ioTs.mod.HasPropsIntersection
    - typings.ioTs.mod.InterfaceType[js.Any, js.Any, js.Any, js.Any]
    - typings.ioTs.mod.StrictType[js.Any, js.Any, js.Any, js.Any]
    - typings.ioTs.mod.PartialType[js.Any, js.Any, js.Any, js.Any]
  */
  type HasProps = typings.ioTs.mod._HasProps | (typings.ioTs.mod.InterfaceType[js.Any, js.Any, js.Any, js.Any]) | (typings.ioTs.mod.StrictType[js.Any, js.Any, js.Any, js.Any]) | (typings.ioTs.mod.PartialType[js.Any, js.Any, js.Any, js.Any])
  type InputOf[C /* <: typings.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply Failed type conversion: C['_I'] */ js.Any
  type Int = typings.ioTs.mod.Branded[scala.Double, typings.ioTs.mod.IntBrand]
  type IntersectionC[CS /* <: js.Array[typings.ioTs.mod.Mixed_] */] = typings.ioTs.mod.IntersectionType[
    CS, 
    js.Any | (typings.ioTs.mod.TypeOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
    ]), 
    js.Any | (typings.ioTs.mod.OutputOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
    ]), 
    js.Any
  ]
  type Is[A] = js.Function1[/* u */ js.Any, /* is A */ scala.Boolean]
  type KeyofC[D /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */] = typings.ioTs.mod.KeyofType[D]
  type LiteralC[V /* <: typings.ioTs.mod.LiteralValue */] = typings.ioTs.mod.LiteralType[V]
  type LiteralValue = java.lang.String | scala.Double | scala.Boolean
  type Mixed_ = typings.ioTs.mod.Type_[js.Any, js.Any, js.Any]
  type NeverC = typings.ioTs.mod.NeverType
  type NullC = typings.ioTs.mod.NullType_
  type NumberC = typings.ioTs.mod.NumberType
  type ObjectC = typings.ioTs.mod.ObjectType
  type OutputOf[C /* <: typings.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply Failed type conversion: C['_O'] */ js.Any
  type OutputOfDictionary[D /* <: typings.ioTs.mod.Any_ */, C /* <: typings.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in io-ts.io-ts.OutputOf<D> ]: io-ts.io-ts.OutputOf<C>}
    */ typings.ioTs.ioTsStrings.OutputOfDictionary with js.Any
  type OutputOfPartialProps[P /* <: typings.ioTs.mod.AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]:? io-ts.io-ts.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.OutputOfPartialProps with P
  type OutputOfProps[P /* <: typings.ioTs.mod.AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.OutputOfProps with P
  type PartialC[P /* <: typings.ioTs.mod.Props */] = typings.ioTs.mod.PartialType[
    P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]:? io-ts.io-ts.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.PartialC with P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]:? io-ts.io-ts.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.PartialC with P, 
    js.Any
  ]
  type Props = org.scalablytyped.runtime.StringDictionary[typings.ioTs.mod.Mixed_]
  type PropsOf[T /* <: typings.ioTs.AnonProps */] = /* import warning: importer.ImportType#apply Failed type conversion: T['props'] */ js.Any
  type ReadonlyArrayC[C /* <: typings.ioTs.mod.Mixed_ */] = typings.ioTs.mod.ReadonlyArrayType[
    C, 
    js.Array[typings.ioTs.mod.TypeOf[C]], 
    js.Array[typings.ioTs.mod.OutputOf[C]], 
    js.Any
  ]
  type ReadonlyC[C /* <: typings.ioTs.mod.Mixed_ */] = typings.ioTs.mod.ReadonlyType[
    C, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof io-ts.io-ts.TypeOf<C> ]: io-ts.io-ts.TypeOf<C>[K]}
    */ typings.ioTs.ioTsStrings.ReadonlyC with typings.ioTs.mod.TypeOf[C], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof io-ts.io-ts.OutputOf<C> ]: io-ts.io-ts.OutputOf<C>[K]}
    */ typings.ioTs.ioTsStrings.ReadonlyC with typings.ioTs.mod.OutputOf[C], 
    js.Any
  ]
  type RecordC[D /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */] = typings.ioTs.mod.DictionaryType[
    D, 
    C, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in io-ts.io-ts.TypeOf<D> ]: io-ts.io-ts.TypeOf<C>}
    */ typings.ioTs.ioTsStrings.RecordC with js.Any, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in io-ts.io-ts.OutputOf<D> ]: io-ts.io-ts.OutputOf<C>}
    */ typings.ioTs.ioTsStrings.RecordC with js.Any, 
    js.Any
  ]
  type RefinementC[C /* <: typings.ioTs.mod.Any_ */] = typings.ioTs.mod.RefinementType[
    C, 
    typings.ioTs.mod.TypeOf[C], 
    typings.ioTs.mod.OutputOf[C], 
    typings.ioTs.mod.InputOf[C]
  ]
  type StrictC[P /* <: typings.ioTs.mod.Props */] = typings.ioTs.mod.StrictType[
    P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.StrictC with P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.StrictC with P, 
    js.Any
  ]
  type StringC = typings.ioTs.mod.StringType
  /* Rewritten from type alias, can be one of: 
    - typings.ioTs.mod.InterfaceType[typings.ioTs.mod.TaggedProps[Tag], A, O, js.Any]
    - typings.ioTs.mod.StrictType[typings.ioTs.mod.TaggedProps[Tag], A, O, js.Any]
    - typings.ioTs.mod.TaggedRefinement[Tag, A, O]
    - typings.ioTs.mod.TaggedUnion_[Tag, A, O]
    - typings.ioTs.mod.TaggedIntersection[Tag, A, O]
    - typings.ioTs.mod.TaggedExact[Tag, A, O]
    - typings.ioTs.mod.RecursiveType[js.Any, A, O, js.Any]
  */
  type Tagged[Tag /* <: java.lang.String */, A, O] = (typings.ioTs.mod._Tagged[Tag, A, O]) | (typings.ioTs.mod.InterfaceType[typings.ioTs.mod.TaggedProps[Tag], A, O, js.Any]) | (typings.ioTs.mod.StrictType[typings.ioTs.mod.TaggedProps[Tag], A, O, js.Any]) | (typings.ioTs.mod.RecursiveType[js.Any, A, O, js.Any])
  type TaggedIntersectionArgument[Tag /* <: java.lang.String */] = (js.Array[typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]]) | (js.Tuple2[
    typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any])
  ]) | (js.Tuple3[
    typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any])
  ]) | (js.Tuple4[
    typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any])
  ]) | (js.Tuple5[
    typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
    typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any])
  ])
  type TaggedProps[Tag /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in Tag ]: io-ts.io-ts.LiteralType<any>}
    */ typings.ioTs.ioTsStrings.TaggedProps with js.Any
  type TaggedUnionC[Tag /* <: java.lang.String */, CS /* <: js.Array[typings.ioTs.mod.Mixed_] */] = typings.ioTs.mod.TaggedUnionType[
    Tag, 
    CS, 
    typings.ioTs.mod.TypeOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
    ], 
    typings.ioTs.mod.OutputOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
    ], 
    js.Any
  ]
  type TupleC[CS /* <: js.Array[typings.ioTs.mod.Mixed_] */] = typings.ioTs.mod.TupleType[
    CS, 
    js.Any | (js.Tuple5[
      typings.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typings.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typings.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ], 
      typings.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[3] */ js.Any
      ], 
      typings.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[4] */ js.Any
      ]
    ]) | (js.Tuple4[
      typings.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typings.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typings.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ], 
      typings.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[3] */ js.Any
      ]
    ]) | (js.Tuple3[
      typings.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typings.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typings.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ]
    ]) | (js.Tuple2[
      typings.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typings.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ]
    ]) | (js.Array[
      typings.ioTs.mod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ]
    ]), 
    js.Any | (js.Tuple5[
      typings.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typings.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typings.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ], 
      typings.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[3] */ js.Any
      ], 
      typings.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[4] */ js.Any
      ]
    ]) | (js.Tuple4[
      typings.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typings.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typings.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ], 
      typings.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[3] */ js.Any
      ]
    ]) | (js.Tuple3[
      typings.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typings.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ], 
      typings.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[2] */ js.Any
      ]
    ]) | (js.Tuple2[
      typings.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ], 
      typings.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[1] */ js.Any
      ]
    ]) | (js.Array[
      typings.ioTs.mod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
      ]
    ]), 
    js.Any
  ]
  type TypeC[P /* <: typings.ioTs.mod.Props */] = typings.ioTs.mod.InterfaceType[
    P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.TypeC with P, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.TypeC with P, 
    js.Any
  ]
  type TypeOf[C /* <: typings.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply Failed type conversion: C['_A'] */ js.Any
  type TypeOfDictionary[D /* <: typings.ioTs.mod.Any_ */, C /* <: typings.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in io-ts.io-ts.TypeOf<D> ]: io-ts.io-ts.TypeOf<C>}
    */ typings.ioTs.ioTsStrings.TypeOfDictionary with js.Any
  type TypeOfPartialProps[P /* <: typings.ioTs.mod.AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]:? io-ts.io-ts.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.TypeOfPartialProps with P
  type TypeOfProps[P /* <: typings.ioTs.mod.AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.TypeOfProps with P
  type UndefinedC = typings.ioTs.mod.UndefinedType
  type UnionC[CS /* <: js.Array[typings.ioTs.mod.Mixed_] */] = typings.ioTs.mod.UnionType[
    CS, 
    typings.ioTs.mod.TypeOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
    ], 
    typings.ioTs.mod.OutputOf[
      /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
    ], 
    js.Any
  ]
  type UnknownArrayC = typings.ioTs.mod.AnyArrayType
  type UnknownC = typings.ioTs.mod.UnknownType
  type UnknownRecordC = typings.ioTs.mod.AnyDictionaryType
  type Validate[I, A] = js.Function2[/* i */ I, /* context */ typings.ioTs.mod.Context, typings.ioTs.mod.Validation[A]]
  type Validation[A] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Either<Errors, A> */ js.Any
  type VoidC = typings.ioTs.mod.VoidType_
  type mixed = js.Any
}

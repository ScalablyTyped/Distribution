package typings.ioTs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libFunctionMod.Predicate
import typings.fpTs.libFunctionMod.Refinement
import typings.ioTs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Array_ : UnknownArrayC = ^.asInstanceOf[js.Dynamic].selectDynamic("Array").asInstanceOf[UnknownArrayC]

inline def Dictionary_ : UnknownRecordC = ^.asInstanceOf[js.Dynamic].selectDynamic("Dictionary").asInstanceOf[UnknownRecordC]

inline def Function: FunctionC = ^.asInstanceOf[js.Dynamic].selectDynamic("Function").asInstanceOf[FunctionC]

inline def Int: BrandC[NumberC, IntBrand] = ^.asInstanceOf[js.Dynamic].selectDynamic("Int").asInstanceOf[BrandC[NumberC, IntBrand]]
type Int = Branded[Double, IntBrand]

inline def Integer: RefinementC[NumberC] = ^.asInstanceOf[js.Dynamic].selectDynamic("Integer").asInstanceOf[RefinementC[NumberC]]

inline def UnknownArray: UnknownArrayC = ^.asInstanceOf[js.Dynamic].selectDynamic("UnknownArray").asInstanceOf[UnknownArrayC]

inline def UnknownRecord: UnknownRecordC = ^.asInstanceOf[js.Dynamic].selectDynamic("UnknownRecord").asInstanceOf[UnknownRecordC]

inline def alias[A, O, P, I](codec: InterfaceType[P, A, O, I]): js.Function0[InterfaceType[P, A, O, I]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alias")(codec.asInstanceOf[js.Any]).asInstanceOf[js.Function0[InterfaceType[P, A, O, I]]]
inline def alias[A, O, P, I](codec: PartialType[P, A, O, I]): js.Function0[PartialType[P, A, O, I]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alias")(codec.asInstanceOf[js.Any]).asInstanceOf[js.Function0[PartialType[P, A, O, I]]]
inline def alias[A, O, P, I](codec: StrictType[P, A, O, I]): js.Function0[StrictType[P, A, O, I]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alias")(codec.asInstanceOf[js.Any]).asInstanceOf[js.Function0[StrictType[P, A, O, I]]]

inline def any: AnyC = ^.asInstanceOf[js.Dynamic].selectDynamic("any").asInstanceOf[AnyC]

inline def appendContext(c: Context, key: String, decoder: Decoder[Any, Any]): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("appendContext")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[Context]
inline def appendContext(c: Context, key: String, decoder: Decoder[Any, Any], actual: Any): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("appendContext")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any], actual.asInstanceOf[js.Any])).asInstanceOf[Context]

inline def array[C /* <: Mixed_ */](item: C): ArrayC[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(item.asInstanceOf[js.Any]).asInstanceOf[ArrayC[C]]
inline def array[C /* <: Mixed_ */](item: C, name: String): ArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(item.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ArrayC[C]]

inline def bigint: BigIntC = ^.asInstanceOf[js.Dynamic].selectDynamic("bigint").asInstanceOf[BigIntC]

inline def boolean: BooleanC = ^.asInstanceOf[js.Dynamic].selectDynamic("boolean").asInstanceOf[BooleanC]

inline def brand[C /* <: Any_ */, N /* <: String */, B /* <: /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: symbol} */ js.Any */](codec: C, predicate: Refinement[TypeOf[C], Branded[TypeOf[C], B]], name: N): BrandC[C, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("brand")(codec.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[BrandC[C, B]]

inline def clean[A, O, I](codec: Type_[A, O, I]): Type_[A, O, I] = ^.asInstanceOf[js.Dynamic].applyDynamic("clean")(codec.asInstanceOf[js.Any]).asInstanceOf[Type_[A, O, I]]

inline def dictionary[D /* <: Mixed_ */, C /* <: Mixed_ */](domain: D, codomain: C): RecordC[D, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("dictionary")(domain.asInstanceOf[js.Any], codomain.asInstanceOf[js.Any])).asInstanceOf[RecordC[D, C]]
inline def dictionary[D /* <: Mixed_ */, C /* <: Mixed_ */](domain: D, codomain: C, name: String): RecordC[D, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("dictionary")(domain.asInstanceOf[js.Any], codomain.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[RecordC[D, C]]

inline def exact[C /* <: HasProps */](codec: C): ExactC[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("exact")(codec.asInstanceOf[js.Any]).asInstanceOf[ExactC[C]]
inline def exact[C /* <: HasProps */](codec: C, name: String): ExactC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("exact")(codec.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ExactC[C]]

inline def failure[T](value: Any, context: Context): Validation[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("failure")(value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Validation[T]]
inline def failure[T](value: Any, context: Context, message: String): Validation[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("failure")(value.asInstanceOf[js.Any], context.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Validation[T]]

inline def failures[T](errors: Errors): Validation[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("failures")(errors.asInstanceOf[js.Any]).asInstanceOf[Validation[T]]

inline def getContextEntry(key: String, decoder: Decoder[Any, Any]): ContextEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("getContextEntry")(key.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[ContextEntry]

inline def getDefaultContext(decoder: Decoder[Any, Any]): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultContext")(decoder.asInstanceOf[js.Any]).asInstanceOf[Context]

inline def getFunctionName(f: js.Function): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionName")(f.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getValidationError(value: Any, context: Context): ValidationError = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationError")(value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ValidationError]

inline def identity[A](a: A): A = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(a.asInstanceOf[js.Any]).asInstanceOf[A]

inline def interface[P /* <: Props */](props: P): TypeC[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("interface")(props.asInstanceOf[js.Any]).asInstanceOf[TypeC[P]]
inline def interface[P /* <: Props */](props: P, name: String): TypeC[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("interface")(props.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TypeC[P]]

inline def intersection[A /* <: Mixed_ */, B /* <: Mixed_ */](codecs: js.Tuple2[A, B]): IntersectionC[js.Tuple2[A, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(codecs.asInstanceOf[js.Any]).asInstanceOf[IntersectionC[js.Tuple2[A, B]]]
inline def intersection[A /* <: Mixed_ */, B /* <: Mixed_ */](codecs: js.Tuple2[A, B], name: String): IntersectionC[js.Tuple2[A, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IntersectionC[js.Tuple2[A, B]]]
inline def intersection[A /* <: Mixed_ */, B /* <: Mixed_ */, C /* <: Mixed_ */](codecs: js.Tuple3[A, B, C]): IntersectionC[js.Tuple3[A, B, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(codecs.asInstanceOf[js.Any]).asInstanceOf[IntersectionC[js.Tuple3[A, B, C]]]
inline def intersection[A /* <: Mixed_ */, B /* <: Mixed_ */, C /* <: Mixed_ */](codecs: js.Tuple3[A, B, C], name: String): IntersectionC[js.Tuple3[A, B, C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IntersectionC[js.Tuple3[A, B, C]]]
inline def intersection[A /* <: Mixed_ */, B /* <: Mixed_ */, C /* <: Mixed_ */, D /* <: Mixed_ */](codecs: js.Tuple4[A, B, C, D]): IntersectionC[js.Tuple4[A, B, C, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(codecs.asInstanceOf[js.Any]).asInstanceOf[IntersectionC[js.Tuple4[A, B, C, D]]]
inline def intersection[A /* <: Mixed_ */, B /* <: Mixed_ */, C /* <: Mixed_ */, D /* <: Mixed_ */](codecs: js.Tuple4[A, B, C, D], name: String): IntersectionC[js.Tuple4[A, B, C, D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IntersectionC[js.Tuple4[A, B, C, D]]]
inline def intersection[A /* <: Mixed_ */, B /* <: Mixed_ */, C /* <: Mixed_ */, D /* <: Mixed_ */, E /* <: Mixed_ */](codecs: js.Tuple5[A, B, C, D, E]): IntersectionC[js.Tuple5[A, B, C, D, E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(codecs.asInstanceOf[js.Any]).asInstanceOf[IntersectionC[js.Tuple5[A, B, C, D, E]]]
inline def intersection[A /* <: Mixed_ */, B /* <: Mixed_ */, C /* <: Mixed_ */, D /* <: Mixed_ */, E /* <: Mixed_ */](codecs: js.Tuple5[A, B, C, D, E], name: String): IntersectionC[js.Tuple5[A, B, C, D, E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IntersectionC[js.Tuple5[A, B, C, D, E]]]

inline def keyof[D /* <: StringDictionary[Any] */](keys: D): KeyofC[D] = ^.asInstanceOf[js.Dynamic].applyDynamic("keyof")(keys.asInstanceOf[js.Any]).asInstanceOf[KeyofC[D]]
inline def keyof[D /* <: StringDictionary[Any] */](keys: D, name: String): KeyofC[D] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyof")(keys.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[KeyofC[D]]

inline def literal(value: String): LiteralC[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[LiteralC[String]]
inline def literal(value: String, name: String): LiteralC[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LiteralC[String]]
inline def literal(value: Boolean): LiteralC[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[LiteralC[Boolean]]
inline def literal(value: Boolean, name: String): LiteralC[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LiteralC[Boolean]]
inline def literal(value: Double): LiteralC[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[LiteralC[Double]]
inline def literal(value: Double, name: String): LiteralC[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[LiteralC[Double]]

inline def never: NeverC = ^.asInstanceOf[js.Dynamic].selectDynamic("never").asInstanceOf[NeverC]

inline def `null`: NullC = ^.asInstanceOf[js.Dynamic].selectDynamic("null").asInstanceOf[NullC]

inline def nullType: NullC = ^.asInstanceOf[js.Dynamic].selectDynamic("nullType").asInstanceOf[NullC]

inline def number: NumberC = ^.asInstanceOf[js.Dynamic].selectDynamic("number").asInstanceOf[NumberC]

inline def `object`: ObjectC = ^.asInstanceOf[js.Dynamic].selectDynamic("object").asInstanceOf[ObjectC]

inline def partial[P /* <: Props */](props: P): PartialC[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(props.asInstanceOf[js.Any]).asInstanceOf[PartialC[P]]
inline def partial[P /* <: Props */](props: P, name: String): PartialC[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("partial")(props.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[PartialC[P]]

inline def readonly[C /* <: Mixed_ */](codec: C): ReadonlyC[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("readonly")(codec.asInstanceOf[js.Any]).asInstanceOf[ReadonlyC[C]]
inline def readonly[C /* <: Mixed_ */](codec: C, name: String): ReadonlyC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("readonly")(codec.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ReadonlyC[C]]

inline def readonlyArray[C /* <: Mixed_ */](item: C): ReadonlyArrayC[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("readonlyArray")(item.asInstanceOf[js.Any]).asInstanceOf[ReadonlyArrayC[C]]
inline def readonlyArray[C /* <: Mixed_ */](item: C, name: String): ReadonlyArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("readonlyArray")(item.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ReadonlyArrayC[C]]

inline def record[D /* <: Mixed_ */, C /* <: Mixed_ */](domain: D, codomain: C): RecordC[D, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("record")(domain.asInstanceOf[js.Any], codomain.asInstanceOf[js.Any])).asInstanceOf[RecordC[D, C]]
inline def record[D /* <: Mixed_ */, C /* <: Mixed_ */](domain: D, codomain: C, name: String): RecordC[D, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("record")(domain.asInstanceOf[js.Any], codomain.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[RecordC[D, C]]

inline def recursion[A, O, I, C /* <: Type_[A, O, I] */](name: String, definition: js.Function1[/* self */ C, C]): RecursiveType[C, A, O, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursion")(name.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[RecursiveType[C, A, O, I]]

inline def refinement[C /* <: Any_ */](codec: C, predicate: Predicate[TypeOf[C]]): RefinementC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(codec.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[RefinementC[C]]
inline def refinement[C /* <: Any_ */](codec: C, predicate: Predicate[TypeOf[C]], name: String): RefinementC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(codec.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[RefinementC[C]]

inline def strict[P /* <: Props */](props: P): ExactC[TypeC[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("strict")(props.asInstanceOf[js.Any]).asInstanceOf[ExactC[TypeC[P]]]
inline def strict[P /* <: Props */](props: P, name: String): ExactC[TypeC[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("strict")(props.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ExactC[TypeC[P]]]

inline def string: StringC = ^.asInstanceOf[js.Dynamic].selectDynamic("string").asInstanceOf[StringC]

inline def success[T](value: T): Validation[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(value.asInstanceOf[js.Any]).asInstanceOf[Validation[T]]

inline def taggedUnion[Tag /* <: String */, CS /* <: Array[Mixed_] */](tag: Tag, codecs: CS): TaggedUnionC[Tag, CS] = (^.asInstanceOf[js.Dynamic].applyDynamic("taggedUnion")(tag.asInstanceOf[js.Any], codecs.asInstanceOf[js.Any])).asInstanceOf[TaggedUnionC[Tag, CS]]
inline def taggedUnion[Tag /* <: String */, CS /* <: Array[Mixed_] */](tag: Tag, codecs: CS, name: String): TaggedUnionC[Tag, CS] = (^.asInstanceOf[js.Dynamic].applyDynamic("taggedUnion")(tag.asInstanceOf[js.Any], codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TaggedUnionC[Tag, CS]]

inline def tuple[A /* <: Mixed_ */](codecs: js.Array[A]): TupleC[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any]).asInstanceOf[TupleC[js.Array[A]]]
inline def tuple[A /* <: Mixed_ */](codecs: js.Array[A], name: String): TupleC[js.Array[A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TupleC[js.Array[A]]]
inline def tuple[A /* <: Mixed_ */, B /* <: Mixed_ */](codecs: js.Tuple2[A, B]): TupleC[js.Tuple2[A, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any]).asInstanceOf[TupleC[js.Tuple2[A, B]]]
inline def tuple[A /* <: Mixed_ */, B /* <: Mixed_ */](codecs: js.Tuple2[A, B], name: String): TupleC[js.Tuple2[A, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TupleC[js.Tuple2[A, B]]]
inline def tuple[A /* <: Mixed_ */, B /* <: Mixed_ */, C /* <: Mixed_ */](codecs: js.Tuple3[A, B, C]): TupleC[js.Tuple3[A, B, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any]).asInstanceOf[TupleC[js.Tuple3[A, B, C]]]
inline def tuple[A /* <: Mixed_ */, B /* <: Mixed_ */, C /* <: Mixed_ */](codecs: js.Tuple3[A, B, C], name: String): TupleC[js.Tuple3[A, B, C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TupleC[js.Tuple3[A, B, C]]]
inline def tuple[A /* <: Mixed_ */, B /* <: Mixed_ */, C /* <: Mixed_ */, D /* <: Mixed_ */](codecs: js.Tuple4[A, B, C, D]): TupleC[js.Tuple4[A, B, C, D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any]).asInstanceOf[TupleC[js.Tuple4[A, B, C, D]]]
inline def tuple[A /* <: Mixed_ */, B /* <: Mixed_ */, C /* <: Mixed_ */, D /* <: Mixed_ */](codecs: js.Tuple4[A, B, C, D], name: String): TupleC[js.Tuple4[A, B, C, D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TupleC[js.Tuple4[A, B, C, D]]]
inline def tuple[A /* <: Mixed_ */, B /* <: Mixed_ */, C /* <: Mixed_ */, D /* <: Mixed_ */, E /* <: Mixed_ */](codecs: js.Tuple5[A, B, C, D, E]): TupleC[js.Tuple5[A, B, C, D, E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any]).asInstanceOf[TupleC[js.Tuple5[A, B, C, D, E]]]
inline def tuple[A /* <: Mixed_ */, B /* <: Mixed_ */, C /* <: Mixed_ */, D /* <: Mixed_ */, E /* <: Mixed_ */](codecs: js.Tuple5[A, B, C, D, E], name: String): TupleC[js.Tuple5[A, B, C, D, E]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TupleC[js.Tuple5[A, B, C, D, E]]]

inline def `type`[P /* <: Props */](props: P): TypeC[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(props.asInstanceOf[js.Any]).asInstanceOf[TypeC[P]]
inline def `type`[P /* <: Props */](props: P, name: String): TypeC[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(props.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[TypeC[P]]

inline def undefined: UndefinedC = ^.asInstanceOf[js.Dynamic].selectDynamic("undefined").asInstanceOf[UndefinedC]

inline def union[CS /* <: Array[Mixed_] */](codecs: CS): UnionC[CS] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(codecs.asInstanceOf[js.Any]).asInstanceOf[UnionC[CS]]
inline def union[CS /* <: Array[Mixed_] */](codecs: CS, name: String): UnionC[CS] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[UnionC[CS]]

inline def unknown: UnknownC = ^.asInstanceOf[js.Dynamic].selectDynamic("unknown").asInstanceOf[UnknownC]

inline def void: VoidC = ^.asInstanceOf[js.Dynamic].selectDynamic("void").asInstanceOf[VoidC]

inline def voidType: VoidC = ^.asInstanceOf[js.Dynamic].selectDynamic("voidType").asInstanceOf[VoidC]

type AnyC = AnyType

type AnyProps = StringDictionary[Any_]

type Any_ = Type_[Any, Any, Any]

type ArrayC[C /* <: Mixed_ */] = ArrayType[C, js.Array[TypeOf[C]], js.Array[OutputOf[C]], Any]

type BigIntC = BigIntType

type BooleanC = BooleanType

type BrandC[C /* <: Any_ */, B] = RefinementType[C, Branded[TypeOf[C], B], OutputOf[C], InputOf[C]]

type Branded[A, B] = A & Brand_[B]

/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ K in keyof A ]: A[K]}
  }}}
  */
type Compact[A] = A

type Context = js.Array[ContextEntry]

type Decode[I, A] = js.Function1[/* i */ I, Validation[A]]

type Encode[A, O] = js.Function1[/* a */ A, O]

type Errors = js.Array[ValidationError]

type ExactC[C /* <: HasProps */] = ExactType[C, TypeOf[C], OutputOf[C], InputOf[C]]

type Exact_[T, X /* <: T */] = T & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in {[ K in keyof X ]: K} & {[ K in keyof T ]: never} & {[key: string] : never}[keyof X] ]:? never} */ js.Any)

type FunctionC = FunctionType

/* Rewritten from type alias, can be one of: 
  - typings.ioTs.mod.HasPropsRefinement
  - typings.ioTs.mod.HasPropsReadonly
  - typings.ioTs.mod.HasPropsIntersection
  - typings.ioTs.mod.InterfaceType[scala.Any, scala.Any, scala.Any, scala.Any]
  - typings.ioTs.mod.StrictType[scala.Any, scala.Any, scala.Any, scala.Any]
  - typings.ioTs.mod.PartialType[scala.Any, scala.Any, scala.Any, scala.Any]
*/
type HasProps = _HasProps | (InterfaceType[Any, Any, Any, Any]) | (StrictType[Any, Any, Any, Any]) | (PartialType[Any, Any, Any, Any])

type InputOf[C /* <: Any_ */] = /* import warning: importer.ImportType#apply Failed type conversion: C['_I'] */ js.Any

type IntersectionC[CS /* <: Array[Mixed_] */] = IntersectionType[
CS, 
/* import warning: importer.ImportType#apply Failed type conversion: CS extends {  length :2} ? io-ts.io-ts.TypeOf<CS[0]> & io-ts.io-ts.TypeOf<CS[1]> : CS extends {  length :3} ? io-ts.io-ts.TypeOf<CS[0]> & io-ts.io-ts.TypeOf<CS[1]> & io-ts.io-ts.TypeOf<CS[2]> : CS extends {  length :4} ? io-ts.io-ts.TypeOf<CS[0]> & io-ts.io-ts.TypeOf<CS[1]> & io-ts.io-ts.TypeOf<CS[2]> & io-ts.io-ts.TypeOf<CS[3]> : CS extends {  length :5} ? io-ts.io-ts.TypeOf<CS[0]> & io-ts.io-ts.TypeOf<CS[1]> & io-ts.io-ts.TypeOf<CS[2]> & io-ts.io-ts.TypeOf<CS[3]> & io-ts.io-ts.TypeOf<CS[4]> : unknown */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: CS extends {  length :2} ? io-ts.io-ts.OutputOf<CS[0]> & io-ts.io-ts.OutputOf<CS[1]> : CS extends {  length :3} ? io-ts.io-ts.OutputOf<CS[0]> & io-ts.io-ts.OutputOf<CS[1]> & io-ts.io-ts.OutputOf<CS[2]> : CS extends {  length :4} ? io-ts.io-ts.OutputOf<CS[0]> & io-ts.io-ts.OutputOf<CS[1]> & io-ts.io-ts.OutputOf<CS[2]> & io-ts.io-ts.OutputOf<CS[3]> : CS extends {  length :5} ? io-ts.io-ts.OutputOf<CS[0]> & io-ts.io-ts.OutputOf<CS[1]> & io-ts.io-ts.OutputOf<CS[2]> & io-ts.io-ts.OutputOf<CS[3]> & io-ts.io-ts.OutputOf<CS[4]> : unknown */ js.Any, 
Any]

type Is[A] = js.Function1[/* u */ Any, /* is A */ Boolean]

type KeyofC[D /* <: StringDictionary[Any] */] = KeyofType[D]

type LiteralC[V /* <: LiteralValue */] = LiteralType[V]

type LiteralValue = String | Double | Boolean

type Mixed_ = Type_[Any, Any, Any]

type NeverC = NeverType

type NullC = NullType_

type NumberC = NumberType

type ObjectC = ObjectType

type OutputOf[C /* <: Any_ */] = /* import warning: importer.ImportType#apply Failed type conversion: C['_O'] */ js.Any

type PartialC[P /* <: Props */] = PartialType[
P, 
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]:? io-ts.io-ts.TypeOf<P[K]>} */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]:? io-ts.io-ts.OutputOf<P[K]>} */ js.Any, 
Any]

type Props = StringDictionary[Mixed_]

type PropsOf[T /* <: typings.ioTs.anon.Props */] = /* import warning: importer.ImportType#apply Failed type conversion: T['props'] */ js.Any

type ReadonlyArrayC[C /* <: Mixed_ */] = ReadonlyArrayType[C, js.Array[TypeOf[C]], js.Array[OutputOf[C]], Any]

type ReadonlyC[C /* <: Mixed_ */] = ReadonlyType[C, TypeOf[C], OutputOf[C], Any]

type RecordC[D /* <: Mixed_ */, C /* <: Mixed_ */] = DictionaryType[
D, 
C, 
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in io-ts.io-ts.TypeOf<D> ]: io-ts.io-ts.TypeOf<C>} */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in io-ts.io-ts.OutputOf<D> ]: io-ts.io-ts.OutputOf<C>} */ js.Any, 
Any]

type RefinementC[C /* <: Any_ */] = RefinementType[C, TypeOf[C], OutputOf[C], InputOf[C]]

type StrictC[P /* <: Props */] = StrictType[
P, 
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>} */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>} */ js.Any, 
Any]

type StringC = StringType

/* Rewritten from type alias, can be one of: 
  - typings.ioTs.mod.InterfaceType[typings.ioTs.mod.TaggedProps[Tag], A, O, scala.Any]
  - typings.ioTs.mod.StrictType[typings.ioTs.mod.TaggedProps[Tag], A, O, scala.Any]
  - typings.ioTs.mod.TaggedRefinement[Tag, A, O]
  - typings.ioTs.mod.TaggedUnion_[Tag, A, O]
  - typings.ioTs.mod.TaggedIntersection[Tag, A, O]
  - typings.ioTs.mod.TaggedExact[Tag, A, O]
  - typings.ioTs.mod.RecursiveType[scala.Any, A, O, scala.Any]
*/
type Tagged[Tag /* <: String */, A, O] = (_Tagged[Tag, A, O]) | (InterfaceType[TaggedProps[Tag], A, O, Any]) | (StrictType[TaggedProps[Tag], A, O, Any]) | (RecursiveType[Any, A, O, Any]) | (TaggedIntersection[Tag, A, O])

type TaggedIntersection[Tag /* <: String */, A, O] = IntersectionType[TaggedIntersectionArgument[Tag], A, O, Any]

/** 
NOTE: Rewritten from type alias:
{{{
type TaggedIntersectionArgument = [io-ts.io-ts.Tagged<Tag, any, any>] | [io-ts.io-ts.Tagged<Tag, any, any>, io-ts.io-ts.Mixed] | [io-ts.io-ts.Mixed, io-ts.io-ts.Tagged<Tag, any, any>] | [io-ts.io-ts.Tagged<Tag, any, any>, io-ts.io-ts.Mixed, io-ts.io-ts.Mixed] | [io-ts.io-ts.Mixed, io-ts.io-ts.Tagged<Tag, any, any>, io-ts.io-ts.Mixed] | [io-ts.io-ts.Mixed, io-ts.io-ts.Mixed, io-ts.io-ts.Tagged<Tag, any, any>] | [io-ts.io-ts.Tagged<Tag, any, any>, io-ts.io-ts.Mixed, io-ts.io-ts.Mixed, io-ts.io-ts.Mixed] | [io-ts.io-ts.Mixed, io-ts.io-ts.Tagged<Tag, any, any>, io-ts.io-ts.Mixed, io-ts.io-ts.Mixed] | [io-ts.io-ts.Mixed, io-ts.io-ts.Mixed, io-ts.io-ts.Tagged<Tag, any, any>, io-ts.io-ts.Mixed] | [io-ts.io-ts.Mixed, io-ts.io-ts.Mixed, io-ts.io-ts.Mixed, io-ts.io-ts.Tagged<Tag, any, any>] | [io-ts.io-ts.Tagged<Tag, any, any>, io-ts.io-ts.Mixed, io-ts.io-ts.Mixed, io-ts.io-ts.Mixed, io-ts.io-ts.Mixed] | [io-ts.io-ts.Mixed, io-ts.io-ts.Tagged<Tag, any, any>, io-ts.io-ts.Mixed, io-ts.io-ts.Mixed, io-ts.io-ts.Mixed] | [io-ts.io-ts.Mixed, io-ts.io-ts.Mixed, io-ts.io-ts.Tagged<Tag, any, any>, io-ts.io-ts.Mixed, io-ts.io-ts.Mixed] | [io-ts.io-ts.Mixed, io-ts.io-ts.Mixed, io-ts.io-ts.Mixed, io-ts.io-ts.Tagged<Tag, any, any>, io-ts.io-ts.Mixed] | [io-ts.io-ts.Mixed, io-ts.io-ts.Mixed, io-ts.io-ts.Mixed, io-ts.io-ts.Mixed, io-ts.io-ts.Tagged<Tag, any, any>]
}}}
to avoid circular code involving: 
- io-ts.io-ts.Tagged
- io-ts.io-ts.TaggedExact
- io-ts.io-ts.TaggedIntersection
- io-ts.io-ts.TaggedIntersectionArgument
*/
type TaggedIntersectionArgument[Tag /* <: String */] = js.Array[Any] | (js.Tuple2[Any | Mixed_, Any | Mixed_]) | (js.Tuple3[Any | Mixed_, Any | Mixed_, Any | Mixed_]) | (js.Tuple4[Any | Mixed_, Any | Mixed_, Any | Mixed_, Any | Mixed_]) | (js.Tuple5[Any | Mixed_, Any | Mixed_, Any | Mixed_, Any | Mixed_, Any | Mixed_])

type TaggedUnionC[Tag /* <: String */, CS /* <: Array[Mixed_] */] = TaggedUnionType[
Tag, 
CS, 
TypeOf[
  /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
], 
OutputOf[
  /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
], 
Any]

type TupleC[CS /* <: Array[Mixed_] */] = TupleType[
CS, 
/* import warning: importer.ImportType#apply Failed type conversion: CS extends {  length :1} ? [io-ts.io-ts.TypeOf<CS[0]>] : CS extends {  length :2} ? [io-ts.io-ts.TypeOf<CS[0]>, io-ts.io-ts.TypeOf<CS[1]>] : CS extends {  length :3} ? [io-ts.io-ts.TypeOf<CS[0]>, io-ts.io-ts.TypeOf<CS[1]>, io-ts.io-ts.TypeOf<CS[2]>] : CS extends {  length :4} ? [io-ts.io-ts.TypeOf<CS[0]>, io-ts.io-ts.TypeOf<CS[1]>, io-ts.io-ts.TypeOf<CS[2]>, io-ts.io-ts.TypeOf<CS[3]>] : CS extends {  length :5} ? [io-ts.io-ts.TypeOf<CS[0]>, io-ts.io-ts.TypeOf<CS[1]>, io-ts.io-ts.TypeOf<CS[2]>, io-ts.io-ts.TypeOf<CS[3]>, io-ts.io-ts.TypeOf<CS[4]>] : unknown */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: CS extends {  length :1} ? [io-ts.io-ts.OutputOf<CS[0]>] : CS extends {  length :2} ? [io-ts.io-ts.OutputOf<CS[0]>, io-ts.io-ts.OutputOf<CS[1]>] : CS extends {  length :3} ? [io-ts.io-ts.OutputOf<CS[0]>, io-ts.io-ts.OutputOf<CS[1]>, io-ts.io-ts.OutputOf<CS[2]>] : CS extends {  length :4} ? [io-ts.io-ts.OutputOf<CS[0]>, io-ts.io-ts.OutputOf<CS[1]>, io-ts.io-ts.OutputOf<CS[2]>, io-ts.io-ts.OutputOf<CS[3]>] : CS extends {  length :5} ? [io-ts.io-ts.OutputOf<CS[0]>, io-ts.io-ts.OutputOf<CS[1]>, io-ts.io-ts.OutputOf<CS[2]>, io-ts.io-ts.OutputOf<CS[3]>, io-ts.io-ts.OutputOf<CS[4]>] : unknown */ js.Any, 
Any]

type TypeC[P /* <: Props */] = InterfaceType[
P, 
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>} */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>} */ js.Any, 
Any]

type TypeOf[C /* <: Any_ */] = /* import warning: importer.ImportType#apply Failed type conversion: C['_A'] */ js.Any

type UndefinedC = UndefinedType

type UnionC[CS /* <: Array[Mixed_] */] = UnionType[
CS, 
TypeOf[
  /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
], 
OutputOf[
  /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
], 
Any]

type UnknownArrayC = AnyArrayType

type UnknownC = UnknownType

type UnknownRecordC = AnyDictionaryType

type Validate[I, A] = js.Function2[/* i */ I, /* context */ Context, Validation[A]]

type Validation[A] = Either_[Errors, A]

type VoidC = VoidType_

type mixed = Any

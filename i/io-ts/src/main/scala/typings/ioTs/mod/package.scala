package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Array_ : typings.ioTs.mod.UnknownArrayC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Array").asInstanceOf[typings.ioTs.mod.UnknownArrayC]

inline def Dictionary_ : typings.ioTs.mod.UnknownRecordC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Dictionary").asInstanceOf[typings.ioTs.mod.UnknownRecordC]

inline def Function: typings.ioTs.mod.FunctionC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Function").asInstanceOf[typings.ioTs.mod.FunctionC]

inline def Int: typings.ioTs.mod.BrandC[typings.ioTs.mod.NumberC, typings.ioTs.mod.IntBrand] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Int").asInstanceOf[typings.ioTs.mod.BrandC[typings.ioTs.mod.NumberC, typings.ioTs.mod.IntBrand]]
type Int = typings.ioTs.mod.Branded[scala.Double, typings.ioTs.mod.IntBrand]

inline def Integer: typings.ioTs.mod.RefinementC[typings.ioTs.mod.NumberC] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Integer").asInstanceOf[typings.ioTs.mod.RefinementC[typings.ioTs.mod.NumberC]]

inline def UnknownArray: typings.ioTs.mod.UnknownArrayC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("UnknownArray").asInstanceOf[typings.ioTs.mod.UnknownArrayC]

inline def UnknownRecord: typings.ioTs.mod.UnknownRecordC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("UnknownRecord").asInstanceOf[typings.ioTs.mod.UnknownRecordC]

inline def alias[A, O, P, I](codec: typings.ioTs.mod.InterfaceType[P, A, O, I]): js.Function0[typings.ioTs.mod.InterfaceType[P, js.Any, O, I]] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("alias")(codec.asInstanceOf[js.Any]).asInstanceOf[js.Function0[typings.ioTs.mod.InterfaceType[P, js.Any, O, I]]]
inline def alias[A, O, P, I](codec: typings.ioTs.mod.PartialType[P, A, O, I]): js.Function0[typings.ioTs.mod.PartialType[P, js.Any, O, I]] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("alias")(codec.asInstanceOf[js.Any]).asInstanceOf[js.Function0[typings.ioTs.mod.PartialType[P, js.Any, O, I]]]
inline def alias[A, O, P, I](codec: typings.ioTs.mod.StrictType[P, A, O, I]): js.Function0[typings.ioTs.mod.StrictType[P, js.Any, O, I]] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("alias")(codec.asInstanceOf[js.Any]).asInstanceOf[js.Function0[typings.ioTs.mod.StrictType[P, js.Any, O, I]]]

inline def any: typings.ioTs.mod.AnyC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("any").asInstanceOf[typings.ioTs.mod.AnyC]

inline def appendContext(
  c: typings.ioTs.mod.Context,
  key: java.lang.String,
  decoder: typings.ioTs.mod.Decoder[js.Any, js.Any]
): typings.ioTs.mod.Context = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendContext")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.Context]
inline def appendContext(
  c: typings.ioTs.mod.Context,
  key: java.lang.String,
  decoder: typings.ioTs.mod.Decoder[js.Any, js.Any],
  actual: js.Any
): typings.ioTs.mod.Context = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("appendContext")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any], actual.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.Context]

inline def array[C /* <: typings.ioTs.mod.Mixed_ */](item: C): typings.ioTs.mod.ArrayC[C] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("array")(item.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.ArrayC[C]]
inline def array[C /* <: typings.ioTs.mod.Mixed_ */](item: C, name: java.lang.String): typings.ioTs.mod.ArrayC[C] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("array")(item.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.ArrayC[C]]

inline def bigint: typings.ioTs.mod.BigIntC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("bigint").asInstanceOf[typings.ioTs.mod.BigIntC]

inline def boolean: typings.ioTs.mod.BooleanC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("boolean").asInstanceOf[typings.ioTs.mod.BooleanC]

inline def brand[C /* <: typings.ioTs.mod.Any_ */, N /* <: java.lang.String */, B /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{readonly [ K in N ]: symbol}
  */ typings.ioTs.ioTsStrings.brand & org.scalablytyped.runtime.TopLevel[js.Any] */](
  codec: C,
  predicate: typings.fpTs.functionMod.Refinement[
  typings.ioTs.mod.TypeOf[C], 
  typings.ioTs.mod.Branded[typings.ioTs.mod.TypeOf[C], B]
],
  name: N
): typings.ioTs.mod.BrandC[C, B] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("brand")(codec.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.BrandC[C, B]]

inline def clean[A, O, I](codec: typings.ioTs.mod.Type_[A, O, I]): typings.ioTs.mod.Type_[A, O, I] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clean")(codec.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.Type_[A, O, I]]

inline def dictionary[D /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */](domain: D, codomain: C): typings.ioTs.mod.RecordC[D, C] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dictionary")(domain.asInstanceOf[js.Any], codomain.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.RecordC[D, C]]
inline def dictionary[D /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */](domain: D, codomain: C, name: java.lang.String): typings.ioTs.mod.RecordC[D, C] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dictionary")(domain.asInstanceOf[js.Any], codomain.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.RecordC[D, C]]

inline def exact[C /* <: typings.ioTs.mod.HasProps */](codec: C): typings.ioTs.mod.ExactC[C] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exact")(codec.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.ExactC[C]]
inline def exact[C /* <: typings.ioTs.mod.HasProps */](codec: C, name: java.lang.String): typings.ioTs.mod.ExactC[C] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exact")(codec.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.ExactC[C]]

inline def failure[T](value: js.Any, context: typings.ioTs.mod.Context): typings.fpTs.eitherMod.Either_[typings.ioTs.mod.Errors, T] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("failure")(value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.fpTs.eitherMod.Either_[typings.ioTs.mod.Errors, T]]
inline def failure[T](value: js.Any, context: typings.ioTs.mod.Context, message: java.lang.String): typings.fpTs.eitherMod.Either_[typings.ioTs.mod.Errors, T] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("failure")(value.asInstanceOf[js.Any], context.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[typings.fpTs.eitherMod.Either_[typings.ioTs.mod.Errors, T]]

inline def failures[T](errors: typings.ioTs.mod.Errors): typings.ioTs.mod.Validation[T] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("failures")(errors.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.Validation[T]]

inline def getContextEntry(key: java.lang.String, decoder: typings.ioTs.mod.Decoder[js.Any, js.Any]): typings.ioTs.mod.ContextEntry = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getContextEntry")(key.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.ContextEntry]

inline def getDefaultContext(decoder: typings.ioTs.mod.Decoder[js.Any, js.Any]): typings.ioTs.mod.Context = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultContext")(decoder.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.Context]

inline def getFunctionName(f: js.Function): java.lang.String = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionName")(f.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def getValidationError(value: js.Any, context: typings.ioTs.mod.Context): typings.ioTs.mod.ValidationError = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getValidationError")(value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.ValidationError]

inline def identity[A](a: A): A = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("identity")(a.asInstanceOf[js.Any]).asInstanceOf[A]

inline def interface[P /* <: typings.ioTs.mod.Props */](props: P): typings.ioTs.mod.TypeC[P] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("interface")(props.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.TypeC[P]]
inline def interface[P /* <: typings.ioTs.mod.Props */](props: P, name: java.lang.String): typings.ioTs.mod.TypeC[P] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("interface")(props.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.TypeC[P]]

inline def intersection[A /* <: typings.ioTs.mod.Mixed_ */, B /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Tuple2[A, B]): typings.ioTs.mod.IntersectionC[js.Tuple2[A, B]] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(codecs.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.IntersectionC[js.Tuple2[A, B]]]
inline def intersection[A /* <: typings.ioTs.mod.Mixed_ */, B /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Tuple2[A, B], name: java.lang.String): typings.ioTs.mod.IntersectionC[js.Tuple2[A, B]] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.IntersectionC[js.Tuple2[A, B]]]
inline def intersection[A /* <: typings.ioTs.mod.Mixed_ */, B /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Tuple3[A, B, C]): typings.ioTs.mod.IntersectionC[js.Tuple3[A, B, C]] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(codecs.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.IntersectionC[js.Tuple3[A, B, C]]]
inline def intersection[A /* <: typings.ioTs.mod.Mixed_ */, B /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Tuple3[A, B, C], name: java.lang.String): typings.ioTs.mod.IntersectionC[js.Tuple3[A, B, C]] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.IntersectionC[js.Tuple3[A, B, C]]]
inline def intersection[A /* <: typings.ioTs.mod.Mixed_ */, B /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */, D /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Tuple4[A, B, C, D]): typings.ioTs.mod.IntersectionC[js.Tuple4[A, B, C, D]] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(codecs.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.IntersectionC[js.Tuple4[A, B, C, D]]]
inline def intersection[A /* <: typings.ioTs.mod.Mixed_ */, B /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */, D /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Tuple4[A, B, C, D], name: java.lang.String): typings.ioTs.mod.IntersectionC[js.Tuple4[A, B, C, D]] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.IntersectionC[js.Tuple4[A, B, C, D]]]
inline def intersection[A /* <: typings.ioTs.mod.Mixed_ */, B /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */, D /* <: typings.ioTs.mod.Mixed_ */, E /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Tuple5[A, B, C, D, E]): typings.ioTs.mod.IntersectionC[js.Tuple5[A, B, C, D, E]] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(codecs.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.IntersectionC[js.Tuple5[A, B, C, D, E]]]
inline def intersection[A /* <: typings.ioTs.mod.Mixed_ */, B /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */, D /* <: typings.ioTs.mod.Mixed_ */, E /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Tuple5[A, B, C, D, E], name: java.lang.String): typings.ioTs.mod.IntersectionC[js.Tuple5[A, B, C, D, E]] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.IntersectionC[js.Tuple5[A, B, C, D, E]]]

inline def keyof[D /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](keys: D): typings.ioTs.mod.KeyofC[D] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("keyof")(keys.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.KeyofC[D]]
inline def keyof[D /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](keys: D, name: java.lang.String): typings.ioTs.mod.KeyofC[D] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("keyof")(keys.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.KeyofC[D]]

inline def literal(value: java.lang.String): typings.ioTs.mod.LiteralC[java.lang.String] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.LiteralC[java.lang.String]]
inline def literal(value: java.lang.String, name: java.lang.String): typings.ioTs.mod.LiteralC[java.lang.String] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.LiteralC[java.lang.String]]
inline def literal(value: scala.Boolean): typings.ioTs.mod.LiteralC[scala.Boolean] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.LiteralC[scala.Boolean]]
inline def literal(value: scala.Boolean, name: java.lang.String): typings.ioTs.mod.LiteralC[scala.Boolean] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.LiteralC[scala.Boolean]]
inline def literal(value: scala.Double): typings.ioTs.mod.LiteralC[scala.Double] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.LiteralC[scala.Double]]
inline def literal(value: scala.Double, name: java.lang.String): typings.ioTs.mod.LiteralC[scala.Double] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.LiteralC[scala.Double]]

inline def never: typings.ioTs.mod.NeverC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("never").asInstanceOf[typings.ioTs.mod.NeverC]

inline def `null`: typings.ioTs.mod.NullC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("null").asInstanceOf[typings.ioTs.mod.NullC]

inline def nullType: typings.ioTs.mod.NullC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("nullType").asInstanceOf[typings.ioTs.mod.NullC]

inline def number: typings.ioTs.mod.NumberC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("number").asInstanceOf[typings.ioTs.mod.NumberC]

inline def `object`: typings.ioTs.mod.ObjectC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("object").asInstanceOf[typings.ioTs.mod.ObjectC]

inline def partial[P /* <: typings.ioTs.mod.Props */](props: P): typings.ioTs.mod.PartialC[P] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("partial")(props.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.PartialC[P]]
inline def partial[P /* <: typings.ioTs.mod.Props */](props: P, name: java.lang.String): typings.ioTs.mod.PartialC[P] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("partial")(props.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.PartialC[P]]

inline def readonly[C /* <: typings.ioTs.mod.Mixed_ */](codec: C): typings.ioTs.mod.ReadonlyC[C] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readonly")(codec.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.ReadonlyC[C]]
inline def readonly[C /* <: typings.ioTs.mod.Mixed_ */](codec: C, name: java.lang.String): typings.ioTs.mod.ReadonlyC[C] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readonly")(codec.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.ReadonlyC[C]]

inline def readonlyArray[C /* <: typings.ioTs.mod.Mixed_ */](item: C): typings.ioTs.mod.ReadonlyArrayC[C] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readonlyArray")(item.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.ReadonlyArrayC[C]]
inline def readonlyArray[C /* <: typings.ioTs.mod.Mixed_ */](item: C, name: java.lang.String): typings.ioTs.mod.ReadonlyArrayC[C] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("readonlyArray")(item.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.ReadonlyArrayC[C]]

inline def record[D /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */](domain: D, codomain: C): typings.ioTs.mod.RecordC[D, C] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("record")(domain.asInstanceOf[js.Any], codomain.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.RecordC[D, C]]
inline def record[D /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */](domain: D, codomain: C, name: java.lang.String): typings.ioTs.mod.RecordC[D, C] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("record")(domain.asInstanceOf[js.Any], codomain.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.RecordC[D, C]]

inline def recursion[A, O, I, C /* <: typings.ioTs.mod.Type_[A, O, I] */](name: java.lang.String, definition: js.Function1[/* self */ C, C]): typings.ioTs.mod.RecursiveType[C, A, O, I] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("recursion")(name.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.RecursiveType[C, A, O, I]]

inline def refinement[C /* <: typings.ioTs.mod.Any_ */](codec: C, predicate: typings.fpTs.functionMod.Predicate[typings.ioTs.mod.TypeOf[C]]): typings.ioTs.mod.RefinementC[C] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(codec.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.RefinementC[C]]
inline def refinement[C /* <: typings.ioTs.mod.Any_ */](
  codec: C,
  predicate: typings.fpTs.functionMod.Predicate[typings.ioTs.mod.TypeOf[C]],
  name: java.lang.String
): typings.ioTs.mod.RefinementC[C] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(codec.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.RefinementC[C]]

inline def strict[P /* <: typings.ioTs.mod.Props */](props: P): typings.ioTs.mod.ExactC[typings.ioTs.mod.TypeC[P]] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("strict")(props.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.ExactC[typings.ioTs.mod.TypeC[P]]]
inline def strict[P /* <: typings.ioTs.mod.Props */](props: P, name: java.lang.String): typings.ioTs.mod.ExactC[typings.ioTs.mod.TypeC[P]] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("strict")(props.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.ExactC[typings.ioTs.mod.TypeC[P]]]

inline def string: typings.ioTs.mod.StringC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("string").asInstanceOf[typings.ioTs.mod.StringC]

inline def success[T](value: T): typings.ioTs.mod.Validation[T] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("success")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.Validation[T]]

inline def taggedUnion[Tag /* <: java.lang.String */, CS /* <: Array[typings.ioTs.mod.Mixed_] */](tag: Tag, codecs: CS): typings.ioTs.mod.TaggedUnionC[Tag, CS] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("taggedUnion")(tag.asInstanceOf[js.Any], codecs.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.TaggedUnionC[Tag, CS]]
inline def taggedUnion[Tag /* <: java.lang.String */, CS /* <: Array[typings.ioTs.mod.Mixed_] */](tag: Tag, codecs: CS, name: java.lang.String): typings.ioTs.mod.TaggedUnionC[Tag, CS] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("taggedUnion")(tag.asInstanceOf[js.Any], codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.TaggedUnionC[Tag, CS]]

inline def tuple[A /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Array[A]): typings.ioTs.mod.TupleC[js.Array[A]] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.TupleC[js.Array[A]]]
inline def tuple[A /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Array[A], name: java.lang.String): typings.ioTs.mod.TupleC[js.Array[A]] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.TupleC[js.Array[A]]]
inline def tuple[A /* <: typings.ioTs.mod.Mixed_ */, B /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Tuple2[A, B]): typings.ioTs.mod.TupleC[js.Tuple2[A, B]] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.TupleC[js.Tuple2[A, B]]]
inline def tuple[A /* <: typings.ioTs.mod.Mixed_ */, B /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Tuple2[A, B], name: java.lang.String): typings.ioTs.mod.TupleC[js.Tuple2[A, B]] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.TupleC[js.Tuple2[A, B]]]
inline def tuple[A /* <: typings.ioTs.mod.Mixed_ */, B /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Tuple3[A, B, C]): typings.ioTs.mod.TupleC[js.Tuple3[A, B, C]] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.TupleC[js.Tuple3[A, B, C]]]
inline def tuple[A /* <: typings.ioTs.mod.Mixed_ */, B /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Tuple3[A, B, C], name: java.lang.String): typings.ioTs.mod.TupleC[js.Tuple3[A, B, C]] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.TupleC[js.Tuple3[A, B, C]]]
inline def tuple[A /* <: typings.ioTs.mod.Mixed_ */, B /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */, D /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Tuple4[A, B, C, D]): typings.ioTs.mod.TupleC[js.Tuple4[A, B, C, D]] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.TupleC[js.Tuple4[A, B, C, D]]]
inline def tuple[A /* <: typings.ioTs.mod.Mixed_ */, B /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */, D /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Tuple4[A, B, C, D], name: java.lang.String): typings.ioTs.mod.TupleC[js.Tuple4[A, B, C, D]] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.TupleC[js.Tuple4[A, B, C, D]]]
inline def tuple[A /* <: typings.ioTs.mod.Mixed_ */, B /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */, D /* <: typings.ioTs.mod.Mixed_ */, E /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Tuple5[A, B, C, D, E]): typings.ioTs.mod.TupleC[js.Tuple5[A, B, C, D, E]] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.TupleC[js.Tuple5[A, B, C, D, E]]]
inline def tuple[A /* <: typings.ioTs.mod.Mixed_ */, B /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */, D /* <: typings.ioTs.mod.Mixed_ */, E /* <: typings.ioTs.mod.Mixed_ */](codecs: js.Tuple5[A, B, C, D, E], name: java.lang.String): typings.ioTs.mod.TupleC[js.Tuple5[A, B, C, D, E]] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.TupleC[js.Tuple5[A, B, C, D, E]]]

inline def `type`[P /* <: typings.ioTs.mod.Props */](props: P): typings.ioTs.mod.TypeC[P] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("type")(props.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.TypeC[P]]
inline def `type`[P /* <: typings.ioTs.mod.Props */](props: P, name: java.lang.String): typings.ioTs.mod.TypeC[P] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("type")(props.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.TypeC[P]]

inline def undefined: typings.ioTs.mod.UndefinedC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("undefined").asInstanceOf[typings.ioTs.mod.UndefinedC]

inline def union[CS /* <: Array[typings.ioTs.mod.Mixed_] */](codecs: CS): typings.ioTs.mod.UnionC[CS] = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("union")(codecs.asInstanceOf[js.Any]).asInstanceOf[typings.ioTs.mod.UnionC[CS]]
inline def union[CS /* <: Array[typings.ioTs.mod.Mixed_] */](codecs: CS, name: java.lang.String): typings.ioTs.mod.UnionC[CS] = (typings.ioTs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("union")(codecs.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ioTs.mod.UnionC[CS]]

inline def unknown: typings.ioTs.mod.UnknownC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("unknown").asInstanceOf[typings.ioTs.mod.UnknownC]

inline def void: typings.ioTs.mod.VoidC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("void").asInstanceOf[typings.ioTs.mod.VoidC]

inline def voidType: typings.ioTs.mod.VoidC = typings.ioTs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("voidType").asInstanceOf[typings.ioTs.mod.VoidC]

type AnyC = typings.ioTs.mod.AnyType

type AnyProps = org.scalablytyped.runtime.StringDictionary[typings.ioTs.mod.Any_]

type Any_ = typings.ioTs.mod.Type_[js.Any, js.Any, js.Any]

type ArrayC[C /* <: typings.ioTs.mod.Mixed_ */] = typings.ioTs.mod.ArrayType[
C, 
js.Array[typings.ioTs.mod.TypeOf[C]], 
js.Array[typings.ioTs.mod.OutputOf[C]], 
js.Any]

type BigIntC = typings.ioTs.mod.BigIntType

type BooleanC = typings.ioTs.mod.BooleanType

type BrandC[C /* <: typings.ioTs.mod.Any_ */, B] = typings.ioTs.mod.RefinementType[
C, 
typings.ioTs.mod.Branded[typings.ioTs.mod.TypeOf[C], B], 
typings.ioTs.mod.OutputOf[C], 
typings.ioTs.mod.InputOf[C]]

type Branded[A, B] = A & typings.ioTs.mod.Brand_[B]

type Compact[A] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof A ]: A[K]}
  */ typings.ioTs.ioTsStrings.Compact & org.scalablytyped.runtime.TopLevel[A]

type Context = js.Array[typings.ioTs.mod.ContextEntry]

type Decode[I, A] = js.Function1[/* i */ I, typings.ioTs.mod.Validation[A]]

type Encode[A, O] = js.Function1[/* a */ A, O]

type Errors = js.Array[typings.ioTs.mod.ValidationError]

type ExactC[C /* <: typings.ioTs.mod.HasProps */] = typings.ioTs.mod.ExactType[
C, 
typings.ioTs.mod.TypeOf[C], 
typings.ioTs.mod.OutputOf[C], 
typings.ioTs.mod.InputOf[C]]

type Exact_[T, X /* <: T */] = T & typings.ioTs.ioTsStrings.Exact & org.scalablytyped.runtime.TopLevel[js.Any]

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

type IntersectionC[CS /* <: Array[typings.ioTs.mod.Mixed_] */] = typings.ioTs.mod.IntersectionType[
CS, 
js.Any | (typings.ioTs.mod.TypeOf[
  /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
]), 
js.Any | (typings.ioTs.mod.OutputOf[
  /* import warning: importer.ImportType#apply Failed type conversion: CS[0] */ js.Any
]), 
js.Any]

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
  */ typings.ioTs.ioTsStrings.OutputOfDictionary & org.scalablytyped.runtime.TopLevel[js.Any]

type OutputOfPartialProps[P /* <: typings.ioTs.mod.AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof P ]:? io-ts.io-ts.OutputOf<P[K]>}
  */ typings.ioTs.ioTsStrings.OutputOfPartialProps & org.scalablytyped.runtime.TopLevel[P]

type OutputOfProps[P /* <: typings.ioTs.mod.AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>}
  */ typings.ioTs.ioTsStrings.OutputOfProps & org.scalablytyped.runtime.TopLevel[P]

type PartialC[P /* <: typings.ioTs.mod.Props */] = typings.ioTs.mod.PartialType[
P, 
/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof P ]:? io-ts.io-ts.TypeOf<P[K]>}
  */ typings.ioTs.ioTsStrings.PartialC & org.scalablytyped.runtime.TopLevel[P], 
/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof P ]:? io-ts.io-ts.OutputOf<P[K]>}
  */ typings.ioTs.ioTsStrings.PartialC & org.scalablytyped.runtime.TopLevel[P], 
js.Any]

type Props = org.scalablytyped.runtime.StringDictionary[typings.ioTs.mod.Mixed_]

type PropsOf[T /* <: typings.ioTs.anon.Props */] = /* import warning: importer.ImportType#apply Failed type conversion: T['props'] */ js.Any

type ReadonlyArrayC[C /* <: typings.ioTs.mod.Mixed_ */] = typings.ioTs.mod.ReadonlyArrayType[
C, 
js.Array[typings.ioTs.mod.TypeOf[C]], 
js.Array[typings.ioTs.mod.OutputOf[C]], 
js.Any]

type ReadonlyC[C /* <: typings.ioTs.mod.Mixed_ */] = typings.ioTs.mod.ReadonlyType[C, typings.ioTs.mod.TypeOf[C], typings.ioTs.mod.OutputOf[C], js.Any]

type RecordC[D /* <: typings.ioTs.mod.Mixed_ */, C /* <: typings.ioTs.mod.Mixed_ */] = typings.ioTs.mod.DictionaryType[
D, 
C, 
/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in io-ts.io-ts.TypeOf<D> ]: io-ts.io-ts.TypeOf<C>}
  */ typings.ioTs.ioTsStrings.RecordC & org.scalablytyped.runtime.TopLevel[js.Any], 
/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in io-ts.io-ts.OutputOf<D> ]: io-ts.io-ts.OutputOf<C>}
  */ typings.ioTs.ioTsStrings.RecordC & org.scalablytyped.runtime.TopLevel[js.Any], 
js.Any]

type RefinementC[C /* <: typings.ioTs.mod.Any_ */] = typings.ioTs.mod.RefinementType[
C, 
typings.ioTs.mod.TypeOf[C], 
typings.ioTs.mod.OutputOf[C], 
typings.ioTs.mod.InputOf[C]]

type StrictC[P /* <: typings.ioTs.mod.Props */] = typings.ioTs.mod.StrictType[
P, 
/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>}
  */ typings.ioTs.ioTsStrings.StrictC & org.scalablytyped.runtime.TopLevel[P], 
/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>}
  */ typings.ioTs.ioTsStrings.StrictC & org.scalablytyped.runtime.TopLevel[P], 
js.Any]

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
typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any])]) | (js.Tuple3[
typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any])]) | (js.Tuple4[
typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any])]) | (js.Tuple5[
typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any]), 
typings.ioTs.mod.Mixed_ | (typings.ioTs.mod.Tagged[Tag, js.Any, js.Any])])

type TaggedProps[Tag /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in Tag ]: io-ts.io-ts.LiteralType<any>}
  */ typings.ioTs.ioTsStrings.TaggedProps & org.scalablytyped.runtime.TopLevel[js.Any]

type TaggedUnionC[Tag /* <: java.lang.String */, CS /* <: Array[typings.ioTs.mod.Mixed_] */] = typings.ioTs.mod.TaggedUnionType[
Tag, 
CS, 
typings.ioTs.mod.TypeOf[
  /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
], 
typings.ioTs.mod.OutputOf[
  /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
], 
js.Any]

type TupleC[CS /* <: Array[typings.ioTs.mod.Mixed_] */] = typings.ioTs.mod.TupleType[
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
js.Any]

type TypeC[P /* <: typings.ioTs.mod.Props */] = typings.ioTs.mod.InterfaceType[
P, 
/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>}
  */ typings.ioTs.ioTsStrings.TypeC & org.scalablytyped.runtime.TopLevel[P], 
/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof P ]: io-ts.io-ts.OutputOf<P[K]>}
  */ typings.ioTs.ioTsStrings.TypeC & org.scalablytyped.runtime.TopLevel[P], 
js.Any]

type TypeOf[C /* <: typings.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply Failed type conversion: C['_A'] */ js.Any

type TypeOfDictionary[D /* <: typings.ioTs.mod.Any_ */, C /* <: typings.ioTs.mod.Any_ */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in io-ts.io-ts.TypeOf<D> ]: io-ts.io-ts.TypeOf<C>}
  */ typings.ioTs.ioTsStrings.TypeOfDictionary & org.scalablytyped.runtime.TopLevel[js.Any]

type TypeOfPartialProps[P /* <: typings.ioTs.mod.AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof P ]:? io-ts.io-ts.TypeOf<P[K]>}
  */ typings.ioTs.ioTsStrings.TypeOfPartialProps & org.scalablytyped.runtime.TopLevel[P]

type TypeOfProps[P /* <: typings.ioTs.mod.AnyProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof P ]: io-ts.io-ts.TypeOf<P[K]>}
  */ typings.ioTs.ioTsStrings.TypeOfProps & org.scalablytyped.runtime.TopLevel[P]

type UndefinedC = typings.ioTs.mod.UndefinedType

type UnionC[CS /* <: Array[typings.ioTs.mod.Mixed_] */] = typings.ioTs.mod.UnionType[
CS, 
typings.ioTs.mod.TypeOf[
  /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
], 
typings.ioTs.mod.OutputOf[
  /* import warning: importer.ImportType#apply Failed type conversion: CS[number] */ js.Any
], 
js.Any]

type UnknownArrayC = typings.ioTs.mod.AnyArrayType

type UnknownC = typings.ioTs.mod.UnknownType

type UnknownRecordC = typings.ioTs.mod.AnyDictionaryType

type Validate[I, A] = js.Function2[/* i */ I, /* context */ typings.ioTs.mod.Context, typings.ioTs.mod.Validation[A]]

type Validation[A] = typings.fpTs.eitherMod.Either_[typings.ioTs.mod.Errors, A]

type VoidC = typings.ioTs.mod.VoidType_

type mixed = js.Any

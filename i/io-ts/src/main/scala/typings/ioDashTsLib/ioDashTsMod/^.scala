package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Array: ioDashTsLib.ioDashTsMod.UnknownArrayC = js.native
  val Dictionary: ioDashTsLib.ioDashTsMod.UnknownRecordC = js.native
  val Function: ioDashTsLib.ioDashTsMod.FunctionC = js.native
  val Int: ioDashTsLib.ioDashTsMod.BrandC[ioDashTsLib.ioDashTsMod.NumberC, ioDashTsLib.ioDashTsMod.IntBrand] = js.native
  val Integer: ioDashTsLib.ioDashTsMod.RefinementC[ioDashTsLib.ioDashTsMod.NumberC] = js.native
  val UnknownArray: ioDashTsLib.ioDashTsMod.UnknownArrayC = js.native
  val UnknownRecord: ioDashTsLib.ioDashTsMod.UnknownRecordC = js.native
  val any: ioDashTsLib.ioDashTsMod.AnyC = js.native
  val boolean: ioDashTsLib.ioDashTsMod.BooleanC = js.native
  val dictionary: ioDashTsLib.Anon_Codomain = js.native
  val emptyIndexRecord: ioDashTsLib.ioDashTsMod.IndexRecord = js.native
  val never: ioDashTsLib.ioDashTsMod.NeverC = js.native
  val `null`: ioDashTsLib.ioDashTsMod.NullC = js.native
  val nullType: ioDashTsLib.ioDashTsMod.NullC = js.native
  val number: ioDashTsLib.ioDashTsMod.NumberC = js.native
  val `object`: ioDashTsLib.ioDashTsMod.ObjectC = js.native
  val string: ioDashTsLib.ioDashTsMod.StringC = js.native
  val undefined: ioDashTsLib.ioDashTsMod.UndefinedC = js.native
  val unknown: ioDashTsLib.ioDashTsMod.UnknownC = js.native
  val void: ioDashTsLib.ioDashTsMod.VoidC = js.native
  val voidType: ioDashTsLib.ioDashTsMod.VoidC = js.native
  def alias[A, O, P, I](codec: ioDashTsLib.ioDashTsMod.InterfaceType[P, A, O, I]): js.Function0[ioDashTsLib.ioDashTsMod.InterfaceType[_, _, _, I]] = js.native
  def alias[A, O, P, I](codec: ioDashTsLib.ioDashTsMod.PartialType[P, A, O, I]): js.Function0[ioDashTsLib.ioDashTsMod.PartialType[_, _, _, I]] = js.native
  def alias[A, O, P, I](codec: ioDashTsLib.ioDashTsMod.StrictType[P, A, O, I]): js.Function0[ioDashTsLib.ioDashTsMod.StrictType[_, _, _, I]] = js.native
  def appendContext(
    c: ioDashTsLib.ioDashTsMod.Context,
    key: java.lang.String,
    decoder: ioDashTsLib.ioDashTsMod.Decoder[_, _]
  ): ioDashTsLib.ioDashTsMod.Context = js.native
  def appendContext(
    c: ioDashTsLib.ioDashTsMod.Context,
    key: java.lang.String,
    decoder: ioDashTsLib.ioDashTsMod.Decoder[_, _],
    actual: js.Any
  ): ioDashTsLib.ioDashTsMod.Context = js.native
  def array[C /* <: ioDashTsLib.ioDashTsMod.Mixed */](codec: C): ioDashTsLib.ioDashTsMod.ArrayC[C] = js.native
  def array[C /* <: ioDashTsLib.ioDashTsMod.Mixed */](codec: C, name: java.lang.String): ioDashTsLib.ioDashTsMod.ArrayC[C] = js.native
  @JSName("brand")
  def brand__A[C /* <: ioDashTsLib.ioDashTsMod.Any */, N /* <: java.lang.String */, B /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ K in N ]: symbol}
    */ ioDashTsLib.ioDashTsLibStrings.brand with js.Any */](
    codec: C,
    predicate: fpDashTsLib.libFunctionMod.Refinement[
      /* import warning: ImportType.apply Failed type conversion: C['_A'] */ js.Any, 
      ioDashTsLib.ioDashTsMod.Branded[/* import warning: ImportType.apply Failed type conversion: C['_A'] */ js.Any, B]
    ],
    name: N
  ): ioDashTsLib.ioDashTsMod.BrandC[C, B] = js.native
  def clean[A, O, I](codec: ioDashTsLib.ioDashTsMod.Type[A, O, I]): ioDashTsLib.ioDashTsMod.Type[A, O, I] = js.native
  def exact[C /* <: ioDashTsLib.ioDashTsMod.HasProps */](codec: C): ioDashTsLib.ioDashTsMod.ExactC[C] = js.native
  def exact[C /* <: ioDashTsLib.ioDashTsMod.HasProps */](codec: C, name: java.lang.String): ioDashTsLib.ioDashTsMod.ExactC[C] = js.native
  def failure[T](value: js.Any, context: ioDashTsLib.ioDashTsMod.Context): fpDashTsLib.libEitherMod.Either[ioDashTsLib.ioDashTsMod.Errors, T] = js.native
  def failure[T](value: js.Any, context: ioDashTsLib.ioDashTsMod.Context, message: java.lang.String): fpDashTsLib.libEitherMod.Either[ioDashTsLib.ioDashTsMod.Errors, T] = js.native
  def failures[T](errors: ioDashTsLib.ioDashTsMod.Errors): fpDashTsLib.libEitherMod.Either[ioDashTsLib.ioDashTsMod.Errors, T] = js.native
  def getContextEntry(key: java.lang.String, decoder: ioDashTsLib.ioDashTsMod.Decoder[_, _]): ioDashTsLib.ioDashTsMod.ContextEntry = js.native
  def getDefaultContext(decoder: ioDashTsLib.ioDashTsMod.Decoder[_, _]): ioDashTsLib.ioDashTsMod.Context = js.native
  def getFunctionName(f: js.Function): java.lang.String = js.native
  def getIndexRecord(codecs: fpDashTsLib.libArrayMod.Global.Array[ioDashTsLib.ioDashTsMod.Mixed]): ioDashTsLib.ioDashTsMod.IndexRecord = js.native
  def getValidationError(value: js.Any, context: ioDashTsLib.ioDashTsMod.Context): ioDashTsLib.ioDashTsMod.ValidationError = js.native
  def identity[A](a: A): A = js.native
  def interface[P /* <: ioDashTsLib.ioDashTsMod.Props */](props: P): ioDashTsLib.ioDashTsMod.TypeC[P] = js.native
  def interface[P /* <: ioDashTsLib.ioDashTsMod.Props */](props: P, name: java.lang.String): ioDashTsLib.ioDashTsMod.TypeC[P] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Tuple2[A, B]): ioDashTsLib.ioDashTsMod.IntersectionC[js.Tuple2[A, B]] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Tuple2[A, B], name: java.lang.String): ioDashTsLib.ioDashTsMod.IntersectionC[js.Tuple2[A, B]] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Tuple3[A, B, C]): ioDashTsLib.ioDashTsMod.IntersectionC[js.Tuple3[A, B, C]] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Tuple3[A, B, C], name: java.lang.String): ioDashTsLib.ioDashTsMod.IntersectionC[js.Tuple3[A, B, C]] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */, D /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Tuple4[A, B, C, D]): ioDashTsLib.ioDashTsMod.IntersectionC[js.Tuple4[A, B, C, D]] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */, D /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Tuple4[A, B, C, D], name: java.lang.String): ioDashTsLib.ioDashTsMod.IntersectionC[js.Tuple4[A, B, C, D]] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */, D /* <: ioDashTsLib.ioDashTsMod.Mixed */, E /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Tuple5[A, B, C, D, E]): ioDashTsLib.ioDashTsMod.IntersectionC[js.Tuple5[A, B, C, D, E]] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */, D /* <: ioDashTsLib.ioDashTsMod.Mixed */, E /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Tuple5[A, B, C, D, E], name: java.lang.String): ioDashTsLib.ioDashTsMod.IntersectionC[js.Tuple5[A, B, C, D, E]] = js.native
  def keyof[D /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](keys: D): ioDashTsLib.ioDashTsMod.KeyofC[D] = js.native
  def keyof[D /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](keys: D, name: java.lang.String): ioDashTsLib.ioDashTsMod.KeyofC[D] = js.native
  def literal[V /* <: ioDashTsLib.LiteralValue */](value: V): ioDashTsLib.ioDashTsMod.LiteralC[V] = js.native
  def literal[V /* <: ioDashTsLib.LiteralValue */](value: V, name: java.lang.String): ioDashTsLib.ioDashTsMod.LiteralC[V] = js.native
  def partial[P /* <: ioDashTsLib.ioDashTsMod.Props */](props: P): ioDashTsLib.ioDashTsMod.PartialC[P] = js.native
  def partial[P /* <: ioDashTsLib.ioDashTsMod.Props */](props: P, name: java.lang.String): ioDashTsLib.ioDashTsMod.PartialC[P] = js.native
  def readonly[C /* <: ioDashTsLib.ioDashTsMod.Mixed */](codec: C): ioDashTsLib.ioDashTsMod.ReadonlyC[C] = js.native
  def readonly[C /* <: ioDashTsLib.ioDashTsMod.Mixed */](codec: C, name: java.lang.String): ioDashTsLib.ioDashTsMod.ReadonlyC[C] = js.native
  def readonlyArray[C /* <: ioDashTsLib.ioDashTsMod.Mixed */](codec: C): ioDashTsLib.ioDashTsMod.ReadonlyArrayC[C] = js.native
  def readonlyArray[C /* <: ioDashTsLib.ioDashTsMod.Mixed */](codec: C, name: java.lang.String): ioDashTsLib.ioDashTsMod.ReadonlyArrayC[C] = js.native
  def record[D /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */](domain: D, codomain: C): ioDashTsLib.ioDashTsMod.RecordC[D, C] = js.native
  def record[D /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */](domain: D, codomain: C, name: java.lang.String): ioDashTsLib.ioDashTsMod.RecordC[D, C] = js.native
  def recursion[A, O, I, C /* <: ioDashTsLib.ioDashTsMod.Type[A, O, I] */](name: java.lang.String, definition: js.Function1[/* self */ C, C]): ioDashTsLib.ioDashTsMod.RecursiveType[C, A, O, I] = js.native
  def refinement[C /* <: ioDashTsLib.ioDashTsMod.Any */](codec: C, predicate: fpDashTsLib.libFunctionMod.Predicate[ioDashTsLib.ioDashTsMod.TypeOf[C]]): ioDashTsLib.ioDashTsMod.RefinementC[C] = js.native
  def refinement[C /* <: ioDashTsLib.ioDashTsMod.Any */](
    codec: C,
    predicate: fpDashTsLib.libFunctionMod.Predicate[ioDashTsLib.ioDashTsMod.TypeOf[C]],
    name: java.lang.String
  ): ioDashTsLib.ioDashTsMod.RefinementC[C] = js.native
  def strict[P /* <: ioDashTsLib.ioDashTsMod.Props */](props: P): ioDashTsLib.ioDashTsMod.ExactC[ioDashTsLib.ioDashTsMod.TypeC[P]] = js.native
  def strict[P /* <: ioDashTsLib.ioDashTsMod.Props */](props: P, name: java.lang.String): ioDashTsLib.ioDashTsMod.ExactC[ioDashTsLib.ioDashTsMod.TypeC[P]] = js.native
  def success[T](value: T): fpDashTsLib.libEitherMod.Either[ioDashTsLib.ioDashTsMod.Errors, T] = js.native
  def taggedUnion[Tag /* <: java.lang.String */, CS /* <: js.Array[ioDashTsLib.ioDashTsMod.Mixed] */](tag: Tag, codecs: CS): ioDashTsLib.ioDashTsMod.TaggedUnionC[Tag, CS] = js.native
  def taggedUnion[Tag /* <: java.lang.String */, CS /* <: js.Array[ioDashTsLib.ioDashTsMod.Mixed] */](tag: Tag, codecs: CS, name: java.lang.String): ioDashTsLib.ioDashTsMod.TaggedUnionC[Tag, CS] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Array[A]): ioDashTsLib.ioDashTsMod.TupleC[js.Array[A]] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Array[A], name: java.lang.String): ioDashTsLib.ioDashTsMod.TupleC[js.Array[A]] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Tuple2[A, B]): ioDashTsLib.ioDashTsMod.TupleC[js.Tuple2[A, B]] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Tuple2[A, B], name: java.lang.String): ioDashTsLib.ioDashTsMod.TupleC[js.Tuple2[A, B]] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Tuple3[A, B, C]): ioDashTsLib.ioDashTsMod.TupleC[js.Tuple3[A, B, C]] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Tuple3[A, B, C], name: java.lang.String): ioDashTsLib.ioDashTsMod.TupleC[js.Tuple3[A, B, C]] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */, D /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Tuple4[A, B, C, D]): ioDashTsLib.ioDashTsMod.TupleC[js.Tuple4[A, B, C, D]] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */, D /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Tuple4[A, B, C, D], name: java.lang.String): ioDashTsLib.ioDashTsMod.TupleC[js.Tuple4[A, B, C, D]] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */, D /* <: ioDashTsLib.ioDashTsMod.Mixed */, E /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Tuple5[A, B, C, D, E]): ioDashTsLib.ioDashTsMod.TupleC[js.Tuple5[A, B, C, D, E]] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */, D /* <: ioDashTsLib.ioDashTsMod.Mixed */, E /* <: ioDashTsLib.ioDashTsMod.Mixed */](codecs: js.Tuple5[A, B, C, D, E], name: java.lang.String): ioDashTsLib.ioDashTsMod.TupleC[js.Tuple5[A, B, C, D, E]] = js.native
  def `type`[P /* <: ioDashTsLib.ioDashTsMod.Props */](props: P): ioDashTsLib.ioDashTsMod.TypeC[P] = js.native
  def `type`[P /* <: ioDashTsLib.ioDashTsMod.Props */](props: P, name: java.lang.String): ioDashTsLib.ioDashTsMod.TypeC[P] = js.native
  def union[CS /* <: js.Array[ioDashTsLib.ioDashTsMod.Mixed] */](codecs: CS): ioDashTsLib.ioDashTsMod.UnionC[CS] = js.native
  def union[CS /* <: js.Array[ioDashTsLib.ioDashTsMod.Mixed] */](codecs: CS, name: java.lang.String): ioDashTsLib.ioDashTsMod.UnionC[CS] = js.native
}


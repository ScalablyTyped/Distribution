package typings.ioDashTs.es6Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/es6", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Array: UnknownArrayC = js.native
  val Dictionary: UnknownRecordC = js.native
  val Function: FunctionC = js.native
  val Int: BrandC[NumberC, IntBrand] = js.native
  val Integer: RefinementC[NumberC] = js.native
  val UnknownArray: UnknownArrayC = js.native
  val UnknownRecord: UnknownRecordC = js.native
  val any: AnyC = js.native
  val boolean: BooleanC = js.native
  val never: NeverC = js.native
  val `null`: NullC = js.native
  val nullType: NullC = js.native
  val number: NumberC = js.native
  val `object`: ObjectC = js.native
  val string: StringC = js.native
  val undefined: UndefinedC = js.native
  val unknown: UnknownC = js.native
  val void: VoidC = js.native
  val voidType: VoidC = js.native
  def alias[A, O, P, I](codec: InterfaceType[P, A, O, I]): js.Function0[InterfaceType[_, _, _, I]] = js.native
  def alias[A, O, P, I](codec: PartialType[P, A, O, I]): js.Function0[PartialType[_, _, _, I]] = js.native
  def alias[A, O, P, I](codec: StrictType[P, A, O, I]): js.Function0[StrictType[_, _, _, I]] = js.native
  def appendContext(c: Context, key: String, decoder: Decoder[_, _]): Context = js.native
  def appendContext(c: Context, key: String, decoder: Decoder[_, _], actual: js.Any): Context = js.native
  def array[C /* <: Mixed */](codec: C): ArrayC[C] = js.native
  def array[C /* <: Mixed */](codec: C, name: String): ArrayC[C] = js.native
  def brand[C /* <: Any */, N /* <: String */, B /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ K in N ]: symbol}
    */ typings.ioDashTs.ioDashTsStrings.brand with js.Any */](
    codec: C,
    predicate: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Refinement<C['_A'], Branded<C['_A'], B>> */ js.Any,
    name: N
  ): BrandC[C, B] = js.native
  def clean[A, O, I](codec: Type[A, O, I]): Type[A, O, I] = js.native
  def exact(codec: HasPropsIntersection): ExactC[HasPropsIntersection] = js.native
  def exact(codec: HasPropsIntersection, name: String): ExactC[HasPropsIntersection] = js.native
  def exact(codec: HasPropsReadonly): ExactC[HasPropsReadonly] = js.native
  def exact(codec: HasPropsReadonly, name: String): ExactC[HasPropsReadonly] = js.native
  def exact(codec: HasPropsRefinement): ExactC[HasPropsRefinement] = js.native
  def exact(codec: HasPropsRefinement, name: String): ExactC[HasPropsRefinement] = js.native
  def exact[C /* <: (InterfaceType[_, _, _, _]) | (StrictType[_, _, _, _]) | (PartialType[_, _, _, _]) */](codec: C): ExactC[C] = js.native
  def exact[C /* <: (InterfaceType[_, _, _, _]) | (StrictType[_, _, _, _]) | (PartialType[_, _, _, _]) */](codec: C, name: String): ExactC[C] = js.native
  def failure[T](value: js.Any, context: Context): js.Any = js.native
  def failure[T](value: js.Any, context: Context, message: String): js.Any = js.native
  def failures[T](errors: Errors): Validation[T] = js.native
  def getContextEntry(key: String, decoder: Decoder[_, _]): ContextEntry = js.native
  def getDefaultContext(decoder: Decoder[_, _]): Context = js.native
  def getFunctionName(f: js.Function): String = js.native
  def getValidationError(value: js.Any, context: Context): ValidationError = js.native
  def identity[A](a: A): A = js.native
  def interface[P /* <: Props */](props: P): TypeC[P] = js.native
  def interface[P /* <: Props */](props: P, name: String): TypeC[P] = js.native
  def intersection[A /* <: Mixed */, B /* <: Mixed */](codecs: js.Tuple2[A, B]): IntersectionC[js.Tuple2[A, B]] = js.native
  def intersection[A /* <: Mixed */, B /* <: Mixed */](codecs: js.Tuple2[A, B], name: String): IntersectionC[js.Tuple2[A, B]] = js.native
  def intersection[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */](codecs: js.Tuple3[A, B, C]): IntersectionC[js.Tuple3[A, B, C]] = js.native
  def intersection[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */](codecs: js.Tuple3[A, B, C], name: String): IntersectionC[js.Tuple3[A, B, C]] = js.native
  def intersection[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */, D /* <: Mixed */](codecs: js.Tuple4[A, B, C, D]): IntersectionC[js.Tuple4[A, B, C, D]] = js.native
  def intersection[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */, D /* <: Mixed */](codecs: js.Tuple4[A, B, C, D], name: String): IntersectionC[js.Tuple4[A, B, C, D]] = js.native
  def intersection[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */, D /* <: Mixed */, E /* <: Mixed */](codecs: js.Tuple5[A, B, C, D, E]): IntersectionC[js.Tuple5[A, B, C, D, E]] = js.native
  def intersection[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */, D /* <: Mixed */, E /* <: Mixed */](codecs: js.Tuple5[A, B, C, D, E], name: String): IntersectionC[js.Tuple5[A, B, C, D, E]] = js.native
  def keyof[D /* <: StringDictionary[js.Any] */](keys: D): KeyofC[D] = js.native
  def keyof[D /* <: StringDictionary[js.Any] */](keys: D, name: String): KeyofC[D] = js.native
  def literal(value: String): LiteralC[String] = js.native
  def literal(value: String, name: String): LiteralC[String] = js.native
  def literal(value: Boolean): LiteralC[Boolean] = js.native
  def literal(value: Boolean, name: String): LiteralC[Boolean] = js.native
  def literal(value: Double): LiteralC[Double] = js.native
  def literal(value: Double, name: String): LiteralC[Double] = js.native
  def partial[P /* <: Props */](props: P): PartialC[P] = js.native
  def partial[P /* <: Props */](props: P, name: String): PartialC[P] = js.native
  def readonly[C /* <: Mixed */](codec: C): ReadonlyC[C] = js.native
  def readonly[C /* <: Mixed */](codec: C, name: String): ReadonlyC[C] = js.native
  def readonlyArray[C /* <: Mixed */](codec: C): ReadonlyArrayC[C] = js.native
  def readonlyArray[C /* <: Mixed */](codec: C, name: String): ReadonlyArrayC[C] = js.native
  def record[D /* <: Mixed */, C /* <: Mixed */](domain: D, codomain: C): RecordC[D, C] = js.native
  def record[D /* <: Mixed */, C /* <: Mixed */](domain: D, codomain: C, name: String): RecordC[D, C] = js.native
  def recursion[A, O, I, C /* <: Type[A, O, I] */](name: String, definition: js.Function1[/* self */ C, C]): RecursiveType[C, A, O, I] = js.native
  def refinement[C /* <: Any */](
    codec: C,
    predicate: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Predicate<TypeOf<C>> */ js.Any
  ): RefinementC[C] = js.native
  def refinement[C /* <: Any */](
    codec: C,
    predicate: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Predicate<TypeOf<C>> */ js.Any,
    name: String
  ): RefinementC[C] = js.native
  def strict[P /* <: Props */](props: P): ExactC[TypeC[P]] = js.native
  def strict[P /* <: Props */](props: P, name: String): ExactC[TypeC[P]] = js.native
  def success[T](value: T): Validation[T] = js.native
  def taggedUnion[Tag /* <: String */, CS /* <: js.Array[Mixed] */](tag: Tag, codecs: CS): TaggedUnionC[Tag, CS] = js.native
  def taggedUnion[Tag /* <: String */, CS /* <: js.Array[Mixed] */](tag: Tag, codecs: CS, name: String): TaggedUnionC[Tag, CS] = js.native
  def tuple[A /* <: Mixed */](codecs: js.Array[A]): TupleC[js.Array[A]] = js.native
  def tuple[A /* <: Mixed */](codecs: js.Array[A], name: String): TupleC[js.Array[A]] = js.native
  def tuple[A /* <: Mixed */, B /* <: Mixed */](codecs: js.Tuple2[A, B]): TupleC[js.Tuple2[A, B]] = js.native
  def tuple[A /* <: Mixed */, B /* <: Mixed */](codecs: js.Tuple2[A, B], name: String): TupleC[js.Tuple2[A, B]] = js.native
  def tuple[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */](codecs: js.Tuple3[A, B, C]): TupleC[js.Tuple3[A, B, C]] = js.native
  def tuple[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */](codecs: js.Tuple3[A, B, C], name: String): TupleC[js.Tuple3[A, B, C]] = js.native
  def tuple[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */, D /* <: Mixed */](codecs: js.Tuple4[A, B, C, D]): TupleC[js.Tuple4[A, B, C, D]] = js.native
  def tuple[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */, D /* <: Mixed */](codecs: js.Tuple4[A, B, C, D], name: String): TupleC[js.Tuple4[A, B, C, D]] = js.native
  def tuple[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */, D /* <: Mixed */, E /* <: Mixed */](codecs: js.Tuple5[A, B, C, D, E]): TupleC[js.Tuple5[A, B, C, D, E]] = js.native
  def tuple[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */, D /* <: Mixed */, E /* <: Mixed */](codecs: js.Tuple5[A, B, C, D, E], name: String): TupleC[js.Tuple5[A, B, C, D, E]] = js.native
  def `type`[P /* <: Props */](props: P): TypeC[P] = js.native
  def `type`[P /* <: Props */](props: P, name: String): TypeC[P] = js.native
  def union[CS /* <: js.Array[Mixed] */](codecs: CS): UnionC[CS] = js.native
  def union[CS /* <: js.Array[Mixed] */](codecs: CS, name: String): UnionC[CS] = js.native
}


package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", JSImport.Namespace)
@js.native
object ioDashTsModMembers extends js.Object {
  val Array: AnyArrayType = js.native
  val Dictionary: AnyDictionaryType = js.native
  val Function: FunctionType = js.native
  val Integer: RefinementType[NumberType, scala.Double, scala.Double, js.Any] = js.native
  val any: AnyType = js.native
  val boolean: BooleanType = js.native
  val never: NeverType = js.native
  val `null`: NullType = js.native
  val nullType: NullType = js.native
  val number: NumberType = js.native
  val `object`: ObjectType = js.native
  val string: StringType = js.native
  val undefined: UndefinedType = js.native
  val void: VoidType = js.native
  val voidType: VoidType = js.native
  def alias[A, O, P, I](`type`: InterfaceType[P, A, O, I]): js.Function0[InterfaceType[_, _, _, I]] = js.native
  def alias[A, O, P, I](`type`: PartialType[P, A, O, I]): js.Function0[PartialType[_, _, _, I]] = js.native
  def alias[A, O, P, I](`type`: StrictType[P, A, O, I]): js.Function0[StrictType[_, _, _, I]] = js.native
  def appendContext(c: Context, key: java.lang.String, `type`: Decoder[_, _]): Context = js.native
  def array[RT /* <: Mixed */](`type`: RT): ArrayType[
    RT, 
    ioDashTsLib.ioDashTsMod.Global.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_A))) */js.Any
    ], 
    ioDashTsLib.ioDashTsMod.Global.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_O))) */js.Any
    ], 
    _
  ] = js.native
  def array[RT /* <: Mixed */](`type`: RT, name: java.lang.String): ArrayType[
    RT, 
    ioDashTsLib.ioDashTsMod.Global.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_A))) */js.Any
    ], 
    ioDashTsLib.ioDashTsMod.Global.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_O))) */js.Any
    ], 
    _
  ] = js.native
  def clean[A, O, I](`type`: Type[A, O, I]): Type[A, O, I] = js.native
  def dictionary[D /* <: Mixed */, C /* <: Mixed */](domain: D, codomain: C): DictionaryType[D, C, TypeOfDictionary[D, C], OutputOfDictionary[D, C], _] = js.native
  def dictionary[D /* <: Mixed */, C /* <: Mixed */](domain: D, codomain: C, name: java.lang.String): DictionaryType[D, C, TypeOfDictionary[D, C], OutputOfDictionary[D, C], _] = js.native
  def exact[RT /* <: HasProps */](`type`: RT): ExactType[RT, TypeOf[RT], OutputOf[RT], InputOf[RT]] = js.native
  def exact[RT /* <: HasProps */](`type`: RT, name: java.lang.String): ExactType[RT, TypeOf[RT], OutputOf[RT], InputOf[RT]] = js.native
  def failure[T](value: js.Any, context: Context): fpDashTsLib.libEitherMod.Either[Errors, T] = js.native
  def failures[T](errors: Errors): fpDashTsLib.libEitherMod.Either[Errors, T] = js.native
  def getContextEntry(key: java.lang.String, `type`: Decoder[_, _]): ContextEntry = js.native
  def getDefaultContext(`type`: Decoder[_, _]): Context = js.native
  def getFunctionName(f: js.Function): java.lang.String = js.native
  def getTagValue[Tag /* <: java.lang.String */](tag: Tag): js.Function1[/* type */ Tagged[Tag, _, _], java.lang.String | scala.Double | scala.Boolean] = js.native
  def getValidationError(value: js.Any, context: Context): ValidationError = js.native
  def identity[A](a: A): A = js.native
  def interface[P /* <: Props */](props: P): InterfaceType[P, TypeOfProps[P], OutputOfProps[P], _] = js.native
  def interface[P /* <: Props */](props: P, name: java.lang.String): InterfaceType[P, TypeOfProps[P], OutputOfProps[P], _] = js.native
  def intersection[A /* <: Mixed */](types: js.Array[A]): IntersectionType[js.Array[A], TypeOf[A], OutputOf[A], mixed] = js.native
  def intersection[A /* <: Mixed */](types: js.Array[A], name: java.lang.String): IntersectionType[js.Array[A], TypeOf[A], OutputOf[A], mixed] = js.native
  def intersection[A /* <: Mixed */, B /* <: Mixed */](types: js.Tuple2[A, B]): IntersectionType[
    js.Tuple2[A, B], 
    Compact[TypeOf[A] with TypeOf[B]], 
    Compact[OutputOf[A] with OutputOf[B]], 
    mixed
  ] = js.native
  def intersection[A /* <: Mixed */, B /* <: Mixed */](types: js.Tuple2[A, B], name: java.lang.String): IntersectionType[
    js.Tuple2[A, B], 
    Compact[TypeOf[A] with TypeOf[B]], 
    Compact[OutputOf[A] with OutputOf[B]], 
    mixed
  ] = js.native
  def intersection[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */](types: js.Tuple3[A, B, C]): IntersectionType[
    js.Tuple3[A, B, C], 
    Compact[TypeOf[A] with TypeOf[B] with TypeOf[C]], 
    Compact[OutputOf[A] with OutputOf[B] with OutputOf[C]], 
    mixed
  ] = js.native
  def intersection[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */](types: js.Tuple3[A, B, C], name: java.lang.String): IntersectionType[
    js.Tuple3[A, B, C], 
    Compact[TypeOf[A] with TypeOf[B] with TypeOf[C]], 
    Compact[OutputOf[A] with OutputOf[B] with OutputOf[C]], 
    mixed
  ] = js.native
  def intersection[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */, D /* <: Mixed */](types: js.Tuple4[A, B, C, D]): IntersectionType[
    js.Tuple4[A, B, C, D], 
    Compact[TypeOf[A] with TypeOf[B] with TypeOf[C] with TypeOf[D]], 
    Compact[OutputOf[A] with OutputOf[B] with OutputOf[C] with OutputOf[D]], 
    mixed
  ] = js.native
  def intersection[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */, D /* <: Mixed */](types: js.Tuple4[A, B, C, D], name: java.lang.String): IntersectionType[
    js.Tuple4[A, B, C, D], 
    Compact[TypeOf[A] with TypeOf[B] with TypeOf[C] with TypeOf[D]], 
    Compact[OutputOf[A] with OutputOf[B] with OutputOf[C] with OutputOf[D]], 
    mixed
  ] = js.native
  def intersection[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */, D /* <: Mixed */, E /* <: Mixed */](types: js.Tuple5[A, B, C, D, E]): IntersectionType[
    js.Tuple5[A, B, C, D, E], 
    Compact[TypeOf[A] with TypeOf[B] with TypeOf[C] with TypeOf[D] with TypeOf[E]], 
    Compact[OutputOf[A] with OutputOf[B] with OutputOf[C] with OutputOf[D] with OutputOf[E]], 
    mixed
  ] = js.native
  def intersection[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */, D /* <: Mixed */, E /* <: Mixed */](types: js.Tuple5[A, B, C, D, E], name: java.lang.String): IntersectionType[
    js.Tuple5[A, B, C, D, E], 
    Compact[TypeOf[A] with TypeOf[B] with TypeOf[C] with TypeOf[D] with TypeOf[E]], 
    Compact[OutputOf[A] with OutputOf[B] with OutputOf[C] with OutputOf[D] with OutputOf[E]], 
    mixed
  ] = js.native
  def isTagged[Tag /* <: java.lang.String */](tag: Tag): js.Function1[/* type */ Mixed, /* is Tagged */scala.Boolean] = js.native
  def keyof[D /* <: ScalablyTyped.runtime.StringDictionary[js.Any] */](keys: D): KeyofType[D] = js.native
  def keyof[D /* <: ScalablyTyped.runtime.StringDictionary[js.Any] */](keys: D, name: java.lang.String): KeyofType[D] = js.native
  def literal[V /* <: java.lang.String | scala.Double | scala.Boolean */](value: V): LiteralType[V] = js.native
  def literal[V /* <: java.lang.String | scala.Double | scala.Boolean */](value: V, name: java.lang.String): LiteralType[V] = js.native
  def partial[P /* <: Props */](props: P): PartialType[P, TypeOfPartialProps[P], OutputOfPartialProps[P], _] = js.native
  def partial[P /* <: Props */](props: P, name: java.lang.String): PartialType[P, TypeOfPartialProps[P], OutputOfPartialProps[P], _] = js.native
  def readonly[RT /* <: Mixed */](`type`: RT): ReadonlyType[
    RT, 
    stdLib.Readonly[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_A))) */js.Any
    ], 
    stdLib.Readonly[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_O))) */js.Any
    ], 
    _
  ] = js.native
  def readonly[RT /* <: Mixed */](`type`: RT, name: java.lang.String): ReadonlyType[
    RT, 
    stdLib.Readonly[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_A))) */js.Any
    ], 
    stdLib.Readonly[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_O))) */js.Any
    ], 
    _
  ] = js.native
  def readonlyArray[RT /* <: Mixed */](`type`: RT): ReadonlyArrayType[
    RT, 
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_A))) */js.Any
    ], 
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_O))) */js.Any
    ], 
    _
  ] = js.native
  def readonlyArray[RT /* <: Mixed */](`type`: RT, name: java.lang.String): ReadonlyArrayType[
    RT, 
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_A))) */js.Any
    ], 
    js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_O))) */js.Any
    ], 
    _
  ] = js.native
  def recursion[A, O, I, RT /* <: Type[A, O, I] */](name: java.lang.String, definition: js.Function1[/* self */ RT, RT]): RecursiveType[RT, A, O, I] = js.native
  def refinement[RT /* <: Any */](
    `type`: RT,
    predicate: fpDashTsLib.libFunctionMod.Predicate[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_A))) */js.Any
    ]
  ): RefinementType[
    RT, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_A))) */js.Any, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_O))) */js.Any, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_I))) */js.Any
  ] = js.native
  def refinement[RT /* <: Any */](
    `type`: RT,
    predicate: fpDashTsLib.libFunctionMod.Predicate[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_A))) */js.Any
    ],
    name: java.lang.String
  ): RefinementType[
    RT, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_A))) */js.Any, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_O))) */js.Any, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RT))),List()),Left(TsIdentSimple(_I))) */js.Any
  ] = js.native
  def strict[P /* <: Props */](props: P): StrictType[P, TypeOfProps[P], OutputOfProps[P], _] = js.native
  def strict[P /* <: Props */](props: P, name: java.lang.String): StrictType[P, TypeOfProps[P], OutputOfProps[P], _] = js.native
  def success[T](value: T): fpDashTsLib.libEitherMod.Either[Errors, T] = js.native
  def taggedUnion[Tag /* <: java.lang.String */, RTS /* <: ioDashTsLib.ioDashTsMod.Global.Array[Tagged[Tag, _, _]] */](tag: Tag, types: RTS): TaggedUnionType[
    Tag, 
    RTS, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RTS))),List()),Left(TsIdentSimple(_A))),Left(TsIdentSimple(_A))) */js.Any, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RTS))),List()),Left(TsIdentSimple(_A))),Left(TsIdentSimple(_O))) */js.Any, 
    _
  ] = js.native
  def taggedUnion[Tag /* <: java.lang.String */, RTS /* <: ioDashTsLib.ioDashTsMod.Global.Array[Tagged[Tag, _, _]] */](tag: Tag, types: RTS, name: java.lang.String): TaggedUnionType[
    Tag, 
    RTS, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RTS))),List()),Left(TsIdentSimple(_A))),Left(TsIdentSimple(_A))) */js.Any, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RTS))),List()),Left(TsIdentSimple(_A))),Left(TsIdentSimple(_O))) */js.Any, 
    _
  ] = js.native
  def tuple[A /* <: Mixed */](types: js.Array[A]): TupleType[js.Array[A], js.Array[TypeOf[A]], js.Array[OutputOf[A]], mixed] = js.native
  def tuple[A /* <: Mixed */](types: js.Array[A], name: java.lang.String): TupleType[js.Array[A], js.Array[TypeOf[A]], js.Array[OutputOf[A]], mixed] = js.native
  def tuple[A /* <: Mixed */, B /* <: Mixed */](types: js.Tuple2[A, B]): TupleType[
    js.Tuple2[A, B], 
    js.Tuple2[TypeOf[A], TypeOf[B]], 
    js.Tuple2[OutputOf[A], OutputOf[B]], 
    mixed
  ] = js.native
  def tuple[A /* <: Mixed */, B /* <: Mixed */](types: js.Tuple2[A, B], name: java.lang.String): TupleType[
    js.Tuple2[A, B], 
    js.Tuple2[TypeOf[A], TypeOf[B]], 
    js.Tuple2[OutputOf[A], OutputOf[B]], 
    mixed
  ] = js.native
  def tuple[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */](types: js.Tuple3[A, B, C]): TupleType[
    js.Tuple3[A, B, C], 
    js.Tuple3[TypeOf[A], TypeOf[B], TypeOf[C]], 
    js.Tuple3[OutputOf[A], OutputOf[B], OutputOf[C]], 
    mixed
  ] = js.native
  def tuple[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */](types: js.Tuple3[A, B, C], name: java.lang.String): TupleType[
    js.Tuple3[A, B, C], 
    js.Tuple3[TypeOf[A], TypeOf[B], TypeOf[C]], 
    js.Tuple3[OutputOf[A], OutputOf[B], OutputOf[C]], 
    mixed
  ] = js.native
  def tuple[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */, D /* <: Mixed */](types: js.Tuple4[A, B, C, D]): TupleType[
    js.Tuple4[A, B, C, D], 
    js.Tuple4[TypeOf[A], TypeOf[B], TypeOf[C], TypeOf[D]], 
    js.Tuple4[OutputOf[A], OutputOf[B], OutputOf[C], OutputOf[D]], 
    mixed
  ] = js.native
  def tuple[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */, D /* <: Mixed */](types: js.Tuple4[A, B, C, D], name: java.lang.String): TupleType[
    js.Tuple4[A, B, C, D], 
    js.Tuple4[TypeOf[A], TypeOf[B], TypeOf[C], TypeOf[D]], 
    js.Tuple4[OutputOf[A], OutputOf[B], OutputOf[C], OutputOf[D]], 
    mixed
  ] = js.native
  def tuple[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */, D /* <: Mixed */, E /* <: Mixed */](types: js.Tuple5[A, B, C, D, E]): TupleType[
    js.Tuple5[A, B, C, D, E], 
    js.Tuple5[TypeOf[A], TypeOf[B], TypeOf[C], TypeOf[D], TypeOf[E]], 
    js.Tuple5[OutputOf[A], OutputOf[B], OutputOf[C], OutputOf[D], OutputOf[E]], 
    mixed
  ] = js.native
  def tuple[A /* <: Mixed */, B /* <: Mixed */, C /* <: Mixed */, D /* <: Mixed */, E /* <: Mixed */](types: js.Tuple5[A, B, C, D, E], name: java.lang.String): TupleType[
    js.Tuple5[A, B, C, D, E], 
    js.Tuple5[TypeOf[A], TypeOf[B], TypeOf[C], TypeOf[D], TypeOf[E]], 
    js.Tuple5[OutputOf[A], OutputOf[B], OutputOf[C], OutputOf[D], OutputOf[E]], 
    mixed
  ] = js.native
  def `type`[P /* <: Props */](props: P): InterfaceType[P, TypeOfProps[P], OutputOfProps[P], _] = js.native
  def `type`[P /* <: Props */](props: P, name: java.lang.String): InterfaceType[P, TypeOfProps[P], OutputOfProps[P], _] = js.native
  def union[RTS /* <: ioDashTsLib.ioDashTsMod.Global.Array[Mixed] */](types: RTS): UnionType[
    RTS, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RTS))),List()),Left(TsIdentSimple(_A))),Left(TsIdentSimple(_A))) */js.Any, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RTS))),List()),Left(TsIdentSimple(_A))),Left(TsIdentSimple(_O))) */js.Any, 
    _
  ] = js.native
  def union[RTS /* <: ioDashTsLib.ioDashTsMod.Global.Array[Mixed] */](types: RTS, name: java.lang.String): UnionType[
    RTS, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RTS))),List()),Left(TsIdentSimple(_A))),Left(TsIdentSimple(_A))) */js.Any, 
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(RTS))),List()),Left(TsIdentSimple(_A))),Left(TsIdentSimple(_O))) */js.Any, 
    _
  ] = js.native
}


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
  val appendContext: js.Function3[
    /* c */ Context, 
    /* key */ java.lang.String, 
    /* type */ Decoder[js.Any, js.Any], 
    Context
  ] = js.native
  val array: js.Function2[
    /* type */ Mixed, 
    /* name */ js.UndefOr[java.lang.String], 
    ArrayType[
      Mixed, 
      ioDashTsLib.ioDashTsMod.Global.Array[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Mixed))),List()),Left(TsIdentSimple(_A))) */js.Any
      ], 
      ioDashTsLib.ioDashTsMod.Global.Array[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Mixed))),List()),Left(TsIdentSimple(_O))) */js.Any
      ], 
      js.Any
    ]
  ] = js.native
  val boolean: BooleanType = js.native
  val dictionary: js.Function3[
    /* domain */ Mixed, 
    /* codomain */ Mixed, 
    /* name */ js.UndefOr[java.lang.String], 
    DictionaryType[Mixed, Mixed, TypeOfDictionary[Mixed, Mixed], OutputOfDictionary[Mixed, Mixed], js.Any]
  ] = js.native
  val failure: js.Function2[
    /* value */ js.Any, 
    /* context */ Context, 
    fpDashTsLib.libEitherMod.Either[Errors, js.Any]
  ] = js.native
  val failures: js.Function1[/* errors */ Errors, fpDashTsLib.libEitherMod.Either[Errors, js.Any]] = js.native
  val getContextEntry: js.Function2[/* key */ java.lang.String, /* type */ Decoder[js.Any, js.Any], ContextEntry] = js.native
  val getDefaultContext: js.Function1[/* type */ Decoder[js.Any, js.Any], Context] = js.native
  val getFunctionName: js.Function1[/* f */ js.Function, java.lang.String] = js.native
  val getTagValue: js.Function1[
    /* tag */ java.lang.String, 
    js.Function1[
      /* type */ Tagged[java.lang.String, js.Any, js.Any], 
      java.lang.String | scala.Double | scala.Boolean
    ]
  ] = js.native
  val getValidationError: js.Function2[/* value */ js.Any, /* context */ Context, ValidationError] = js.native
  val identity: js.Function1[/* a */ js.Any, js.Any] = js.native
  val interface: js.Function2[
    /* props */ Props, 
    /* name */ js.UndefOr[java.lang.String], 
    InterfaceType[Props, TypeOfProps[Props], OutputOfProps[Props], js.Any]
  ] = js.native
  val isTagged: js.Function1[
    /* tag */ java.lang.String, 
    js.Function1[/* type */ Mixed, /* is Tagged */scala.Boolean]
  ] = js.native
  val keyof: js.Function2[
    /* keys */ ScalablyTyped.runtime.StringDictionary[js.Any], 
    /* name */ js.UndefOr[java.lang.String], 
    KeyofType[ScalablyTyped.runtime.StringDictionary[js.Any]]
  ] = js.native
  val literal: js.Function2[
    /* value */ java.lang.String | scala.Double | scala.Boolean, 
    /* name */ js.UndefOr[java.lang.String], 
    LiteralType[java.lang.String | scala.Double | scala.Boolean]
  ] = js.native
  val never: NeverType = js.native
  val `null`: NullType = js.native
  val nullType: NullType = js.native
  val number: NumberType = js.native
  val `object`: ObjectType = js.native
  val partial: js.Function2[
    /* props */ Props, 
    /* name */ js.UndefOr[java.lang.String], 
    PartialType[Props, TypeOfPartialProps[Props], OutputOfPartialProps[Props], js.Any]
  ] = js.native
  val readonly: js.Function2[
    /* type */ Mixed, 
    /* name */ js.UndefOr[java.lang.String], 
    ReadonlyType[
      Mixed, 
      stdLib.Readonly[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Mixed))),List()),Left(TsIdentSimple(_A))) */js.Any
      ], 
      stdLib.Readonly[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Mixed))),List()),Left(TsIdentSimple(_O))) */js.Any
      ], 
      js.Any
    ]
  ] = js.native
  val readonlyArray: js.Function2[
    /* type */ Mixed, 
    /* name */ js.UndefOr[java.lang.String], 
    ReadonlyArrayType[
      Mixed, 
      js.Array[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Mixed))),List()),Left(TsIdentSimple(_A))) */js.Any
      ], 
      js.Array[
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Mixed))),List()),Left(TsIdentSimple(_O))) */js.Any
      ], 
      js.Any
    ]
  ] = js.native
  val recursion: js.Function2[
    /* name */ java.lang.String, 
    /* definition */ js.Function1[/* self */ Type[js.Any, js.Any, js.Any], Type[js.Any, js.Any, js.Any]], 
    RecursiveType[Type[js.Any, js.Any, js.Any], js.Any, js.Any, js.Any]
  ] = js.native
  val refinement: js.Function3[
    /* type */ Any, 
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Any))),List()),Left(TsIdentSimple(_A))) */js.Any
    ], 
    /* name */ js.UndefOr[java.lang.String], 
    RefinementType[
      Any, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Any))),List()),Left(TsIdentSimple(_A))) */js.Any, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Any))),List()),Left(TsIdentSimple(_O))) */js.Any, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Any))),List()),Left(TsIdentSimple(_I))) */js.Any
    ]
  ] = js.native
  val strict: js.Function2[
    /* props */ Props, 
    /* name */ js.UndefOr[java.lang.String], 
    StrictType[Props, TypeOfProps[Props], OutputOfProps[Props], js.Any]
  ] = js.native
  val string: StringType = js.native
  val success: js.Function1[/* value */ js.Any, fpDashTsLib.libEitherMod.Either[Errors, js.Any]] = js.native
  val taggedUnion: js.Function3[
    /* tag */ java.lang.String, 
    /* types */ ioDashTsLib.ioDashTsMod.Global.Array[Tagged[java.lang.String, js.Any, js.Any]], 
    /* name */ js.UndefOr[java.lang.String], 
    TaggedUnionType[
      java.lang.String, 
      ioDashTsLib.ioDashTsMod.Global.Array[Tagged[java.lang.String, js.Any, js.Any]], 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Global), TsIdentSimple(Array))),List(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Tagged))),List(TsTypeRef(TsQIdent(List(TsIdentSimple(string))),List()), TsTypeRef(TsQIdent(List(TsIdentSimple(any))),List()), TsTypeRef(TsQIdent(List(TsIdentSimple(any))),List()))))),Left(TsIdentSimple(_A))),Left(TsIdentSimple(_A))) */js.Any, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Global), TsIdentSimple(Array))),List(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Tagged))),List(TsTypeRef(TsQIdent(List(TsIdentSimple(string))),List()), TsTypeRef(TsQIdent(List(TsIdentSimple(any))),List()), TsTypeRef(TsQIdent(List(TsIdentSimple(any))),List()))))),Left(TsIdentSimple(_A))),Left(TsIdentSimple(_O))) */js.Any, 
      js.Any
    ]
  ] = js.native
  val `type`: js.Function2[
    /* props */ Props, 
    /* name */ js.UndefOr[java.lang.String], 
    InterfaceType[Props, TypeOfProps[Props], OutputOfProps[Props], js.Any]
  ] = js.native
  val undefined: UndefinedType = js.native
  val union: js.Function2[
    /* types */ ioDashTsLib.ioDashTsMod.Global.Array[Mixed], 
    /* name */ js.UndefOr[java.lang.String], 
    UnionType[
      ioDashTsLib.ioDashTsMod.Global.Array[Mixed], 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Global), TsIdentSimple(Array))),List(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Mixed))),List()))),Left(TsIdentSimple(_A))),Left(TsIdentSimple(_A))) */js.Any, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Global), TsIdentSimple(Array))),List(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(io-ts), TsIdentModule(None,List(io-ts)), TsIdentSimple(Mixed))),List()))),Left(TsIdentSimple(_A))),Left(TsIdentSimple(_O))) */js.Any, 
      js.Any
    ]
  ] = js.native
  val void: VoidType = js.native
  val voidType: VoidType = js.native
  def alias[A, O, P, I](`type`: InterfaceType[P, A, O, I]): js.Function0[InterfaceType[_, _, _, I]] = js.native
  def alias[A, O, P, I](`type`: PartialType[P, A, O, I]): js.Function0[PartialType[_, _, _, I]] = js.native
  def alias[A, O, P, I](`type`: StrictType[P, A, O, I]): js.Function0[StrictType[_, _, _, I]] = js.native
  def clean[A, O, I](`type`: Type[A, O, I]): Type[A, O, I] = js.native
  def exact[RT /* <: HasProps */](`type`: RT): ExactType[RT, TypeOf[RT], OutputOf[RT], InputOf[RT]] = js.native
  def exact[RT /* <: HasProps */](`type`: RT, name: java.lang.String): ExactType[RT, TypeOf[RT], OutputOf[RT], InputOf[RT]] = js.native
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
}


package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Array: ioDashTsLib.ioDashTsMod.AnyArrayType = js.native
  val Dictionary: ioDashTsLib.ioDashTsMod.AnyDictionaryType = js.native
  val Function: ioDashTsLib.ioDashTsMod.FunctionType = js.native
  val Integer: ioDashTsLib.ioDashTsMod.RefinementType[ioDashTsLib.ioDashTsMod.NumberType, scala.Double, scala.Double, js.Any] = js.native
  val any: ioDashTsLib.ioDashTsMod.AnyType = js.native
  val boolean: ioDashTsLib.ioDashTsMod.BooleanType = js.native
  val never: ioDashTsLib.ioDashTsMod.NeverType = js.native
  val `null`: ioDashTsLib.ioDashTsMod.NullType = js.native
  val nullType: ioDashTsLib.ioDashTsMod.NullType = js.native
  val number: ioDashTsLib.ioDashTsMod.NumberType = js.native
  val `object`: ioDashTsLib.ioDashTsMod.ObjectType = js.native
  val string: ioDashTsLib.ioDashTsMod.StringType = js.native
  val undefined: ioDashTsLib.ioDashTsMod.UndefinedType = js.native
  val unknown: ioDashTsLib.ioDashTsMod.UnknownType = js.native
  val void: ioDashTsLib.ioDashTsMod.VoidType = js.native
  val voidType: ioDashTsLib.ioDashTsMod.VoidType = js.native
  def alias[A, O, P, I](`type`: ioDashTsLib.ioDashTsMod.InterfaceType[P, A, O, I]): js.Function0[ioDashTsLib.ioDashTsMod.InterfaceType[_, _, _, I]] = js.native
  def alias[A, O, P, I](`type`: ioDashTsLib.ioDashTsMod.PartialType[P, A, O, I]): js.Function0[ioDashTsLib.ioDashTsMod.PartialType[_, _, _, I]] = js.native
  def alias[A, O, P, I](`type`: ioDashTsLib.ioDashTsMod.StrictType[P, A, O, I]): js.Function0[ioDashTsLib.ioDashTsMod.StrictType[_, _, _, I]] = js.native
  def appendContext(
    c: ioDashTsLib.ioDashTsMod.Context,
    key: java.lang.String,
    `type`: ioDashTsLib.ioDashTsMod.Decoder[_, _]
  ): ioDashTsLib.ioDashTsMod.Context = js.native
  def array[RT /* <: ioDashTsLib.ioDashTsMod.Mixed */](`type`: RT): ioDashTsLib.ioDashTsMod.ArrayType[
    RT, 
    fpDashTsLib.libArrayMod.Global.Array[/* import warning: ImportType.apply Failed type conversion: RT['_A'] */ js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[/* import warning: ImportType.apply Failed type conversion: RT['_O'] */ js.Any], 
    _
  ] = js.native
  def array[RT /* <: ioDashTsLib.ioDashTsMod.Mixed */](`type`: RT, name: java.lang.String): ioDashTsLib.ioDashTsMod.ArrayType[
    RT, 
    fpDashTsLib.libArrayMod.Global.Array[/* import warning: ImportType.apply Failed type conversion: RT['_A'] */ js.Any], 
    fpDashTsLib.libArrayMod.Global.Array[/* import warning: ImportType.apply Failed type conversion: RT['_O'] */ js.Any], 
    _
  ] = js.native
  def clean[A, O, I](`type`: ioDashTsLib.ioDashTsMod.Type[A, O, I]): ioDashTsLib.ioDashTsMod.Type[A, O, I] = js.native
  def dictionary[D /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */](domain: D, codomain: C): ioDashTsLib.ioDashTsMod.DictionaryType[
    D, 
    C, 
    ioDashTsLib.ioDashTsMod.TypeOfDictionary[D, C], 
    ioDashTsLib.ioDashTsMod.OutputOfDictionary[D, C], 
    _
  ] = js.native
  def dictionary[D /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */](domain: D, codomain: C, name: java.lang.String): ioDashTsLib.ioDashTsMod.DictionaryType[
    D, 
    C, 
    ioDashTsLib.ioDashTsMod.TypeOfDictionary[D, C], 
    ioDashTsLib.ioDashTsMod.OutputOfDictionary[D, C], 
    _
  ] = js.native
  def exact[RT /* <: ioDashTsLib.ioDashTsMod.HasProps */](`type`: RT): ioDashTsLib.ioDashTsMod.ExactType[
    RT, 
    ioDashTsLib.ioDashTsMod.TypeOf[RT], 
    ioDashTsLib.ioDashTsMod.OutputOf[RT], 
    ioDashTsLib.ioDashTsMod.InputOf[RT]
  ] = js.native
  def exact[RT /* <: ioDashTsLib.ioDashTsMod.HasProps */](`type`: RT, name: java.lang.String): ioDashTsLib.ioDashTsMod.ExactType[
    RT, 
    ioDashTsLib.ioDashTsMod.TypeOf[RT], 
    ioDashTsLib.ioDashTsMod.OutputOf[RT], 
    ioDashTsLib.ioDashTsMod.InputOf[RT]
  ] = js.native
  def failure[T](value: js.Any, context: ioDashTsLib.ioDashTsMod.Context): fpDashTsLib.libEitherMod.Either[ioDashTsLib.ioDashTsMod.Errors, T] = js.native
  def failures[T](errors: ioDashTsLib.ioDashTsMod.Errors): fpDashTsLib.libEitherMod.Either[ioDashTsLib.ioDashTsMod.Errors, T] = js.native
  def getContextEntry(key: java.lang.String, `type`: ioDashTsLib.ioDashTsMod.Decoder[_, _]): ioDashTsLib.ioDashTsMod.ContextEntry = js.native
  def getDefaultContext(`type`: ioDashTsLib.ioDashTsMod.Decoder[_, _]): ioDashTsLib.ioDashTsMod.Context = js.native
  def getFunctionName(f: js.Function): java.lang.String = js.native
  def getTagValue[Tag /* <: java.lang.String */](tag: Tag): js.Function1[
    /* type */ ioDashTsLib.ioDashTsMod.Tagged[Tag, _, _], 
    java.lang.String | scala.Double | scala.Boolean
  ] = js.native
  def getValidationError(value: js.Any, context: ioDashTsLib.ioDashTsMod.Context): ioDashTsLib.ioDashTsMod.ValidationError = js.native
  def identity[A](a: A): A = js.native
  def interface[P /* <: ioDashTsLib.ioDashTsMod.Props */](props: P): ioDashTsLib.ioDashTsMod.InterfaceType[P, ioDashTsLib.ioDashTsMod.TypeOfProps[P], ioDashTsLib.ioDashTsMod.OutputOfProps[P], _] = js.native
  def interface[P /* <: ioDashTsLib.ioDashTsMod.Props */](props: P, name: java.lang.String): ioDashTsLib.ioDashTsMod.InterfaceType[P, ioDashTsLib.ioDashTsMod.TypeOfProps[P], ioDashTsLib.ioDashTsMod.OutputOfProps[P], _] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Array[A]): ioDashTsLib.ioDashTsMod.IntersectionType[
    js.Array[A], 
    ioDashTsLib.ioDashTsMod.TypeOf[A], 
    ioDashTsLib.ioDashTsMod.OutputOf[A], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Array[A], name: java.lang.String): ioDashTsLib.ioDashTsMod.IntersectionType[
    js.Array[A], 
    ioDashTsLib.ioDashTsMod.TypeOf[A], 
    ioDashTsLib.ioDashTsMod.OutputOf[A], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Tuple2[A, B]): ioDashTsLib.ioDashTsMod.IntersectionType[
    js.Tuple2[A, B], 
    ioDashTsLib.ioDashTsMod.TypeOf[A] with ioDashTsLib.ioDashTsMod.TypeOf[B], 
    ioDashTsLib.ioDashTsMod.OutputOf[A] with ioDashTsLib.ioDashTsMod.OutputOf[B], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Tuple2[A, B], name: java.lang.String): ioDashTsLib.ioDashTsMod.IntersectionType[
    js.Tuple2[A, B], 
    ioDashTsLib.ioDashTsMod.TypeOf[A] with ioDashTsLib.ioDashTsMod.TypeOf[B], 
    ioDashTsLib.ioDashTsMod.OutputOf[A] with ioDashTsLib.ioDashTsMod.OutputOf[B], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Tuple3[A, B, C]): ioDashTsLib.ioDashTsMod.IntersectionType[
    js.Tuple3[A, B, C], 
    ioDashTsLib.ioDashTsMod.TypeOf[A] with ioDashTsLib.ioDashTsMod.TypeOf[B] with ioDashTsLib.ioDashTsMod.TypeOf[C], 
    ioDashTsLib.ioDashTsMod.OutputOf[A] with ioDashTsLib.ioDashTsMod.OutputOf[B] with ioDashTsLib.ioDashTsMod.OutputOf[C], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Tuple3[A, B, C], name: java.lang.String): ioDashTsLib.ioDashTsMod.IntersectionType[
    js.Tuple3[A, B, C], 
    ioDashTsLib.ioDashTsMod.TypeOf[A] with ioDashTsLib.ioDashTsMod.TypeOf[B] with ioDashTsLib.ioDashTsMod.TypeOf[C], 
    ioDashTsLib.ioDashTsMod.OutputOf[A] with ioDashTsLib.ioDashTsMod.OutputOf[B] with ioDashTsLib.ioDashTsMod.OutputOf[C], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */, D /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Tuple4[A, B, C, D]): ioDashTsLib.ioDashTsMod.IntersectionType[
    js.Tuple4[A, B, C, D], 
    ioDashTsLib.ioDashTsMod.TypeOf[A] with ioDashTsLib.ioDashTsMod.TypeOf[B] with ioDashTsLib.ioDashTsMod.TypeOf[C] with ioDashTsLib.ioDashTsMod.TypeOf[D], 
    ioDashTsLib.ioDashTsMod.OutputOf[A] with ioDashTsLib.ioDashTsMod.OutputOf[B] with ioDashTsLib.ioDashTsMod.OutputOf[C] with ioDashTsLib.ioDashTsMod.OutputOf[D], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */, D /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Tuple4[A, B, C, D], name: java.lang.String): ioDashTsLib.ioDashTsMod.IntersectionType[
    js.Tuple4[A, B, C, D], 
    ioDashTsLib.ioDashTsMod.TypeOf[A] with ioDashTsLib.ioDashTsMod.TypeOf[B] with ioDashTsLib.ioDashTsMod.TypeOf[C] with ioDashTsLib.ioDashTsMod.TypeOf[D], 
    ioDashTsLib.ioDashTsMod.OutputOf[A] with ioDashTsLib.ioDashTsMod.OutputOf[B] with ioDashTsLib.ioDashTsMod.OutputOf[C] with ioDashTsLib.ioDashTsMod.OutputOf[D], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */, D /* <: ioDashTsLib.ioDashTsMod.Mixed */, E /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Tuple5[A, B, C, D, E]): ioDashTsLib.ioDashTsMod.IntersectionType[
    js.Tuple5[A, B, C, D, E], 
    ioDashTsLib.ioDashTsMod.TypeOf[A] with ioDashTsLib.ioDashTsMod.TypeOf[B] with ioDashTsLib.ioDashTsMod.TypeOf[C] with ioDashTsLib.ioDashTsMod.TypeOf[D] with ioDashTsLib.ioDashTsMod.TypeOf[E], 
    ioDashTsLib.ioDashTsMod.OutputOf[A] with ioDashTsLib.ioDashTsMod.OutputOf[B] with ioDashTsLib.ioDashTsMod.OutputOf[C] with ioDashTsLib.ioDashTsMod.OutputOf[D] with ioDashTsLib.ioDashTsMod.OutputOf[E], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def intersection[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */, D /* <: ioDashTsLib.ioDashTsMod.Mixed */, E /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Tuple5[A, B, C, D, E], name: java.lang.String): ioDashTsLib.ioDashTsMod.IntersectionType[
    js.Tuple5[A, B, C, D, E], 
    ioDashTsLib.ioDashTsMod.TypeOf[A] with ioDashTsLib.ioDashTsMod.TypeOf[B] with ioDashTsLib.ioDashTsMod.TypeOf[C] with ioDashTsLib.ioDashTsMod.TypeOf[D] with ioDashTsLib.ioDashTsMod.TypeOf[E], 
    ioDashTsLib.ioDashTsMod.OutputOf[A] with ioDashTsLib.ioDashTsMod.OutputOf[B] with ioDashTsLib.ioDashTsMod.OutputOf[C] with ioDashTsLib.ioDashTsMod.OutputOf[D] with ioDashTsLib.ioDashTsMod.OutputOf[E], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def isTagged[Tag /* <: java.lang.String */](tag: Tag): js.Function1[
    /* type */ ioDashTsLib.ioDashTsMod.Mixed, 
    /* is io-ts.io-ts.Tagged<Tag, any, any> */ scala.Boolean
  ] = js.native
  def keyof[D /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](keys: D): ioDashTsLib.ioDashTsMod.KeyofType[D] = js.native
  def keyof[D /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](keys: D, name: java.lang.String): ioDashTsLib.ioDashTsMod.KeyofType[D] = js.native
  def literal[V /* <: java.lang.String | scala.Double | scala.Boolean */](value: V): ioDashTsLib.ioDashTsMod.LiteralType[V] = js.native
  def literal[V /* <: java.lang.String | scala.Double | scala.Boolean */](value: V, name: java.lang.String): ioDashTsLib.ioDashTsMod.LiteralType[V] = js.native
  def partial[P /* <: ioDashTsLib.ioDashTsMod.Props */](props: P): ioDashTsLib.ioDashTsMod.PartialType[
    P, 
    ioDashTsLib.ioDashTsMod.TypeOfPartialProps[P], 
    ioDashTsLib.ioDashTsMod.OutputOfPartialProps[P], 
    _
  ] = js.native
  def partial[P /* <: ioDashTsLib.ioDashTsMod.Props */](props: P, name: java.lang.String): ioDashTsLib.ioDashTsMod.PartialType[
    P, 
    ioDashTsLib.ioDashTsMod.TypeOfPartialProps[P], 
    ioDashTsLib.ioDashTsMod.OutputOfPartialProps[P], 
    _
  ] = js.native
  def readonly[RT /* <: ioDashTsLib.ioDashTsMod.Mixed */](`type`: RT): ioDashTsLib.ioDashTsMod.ReadonlyType[
    RT, 
    stdLib.Readonly[/* import warning: ImportType.apply Failed type conversion: RT['_A'] */ js.Any], 
    stdLib.Readonly[/* import warning: ImportType.apply Failed type conversion: RT['_O'] */ js.Any], 
    _
  ] = js.native
  def readonly[RT /* <: ioDashTsLib.ioDashTsMod.Mixed */](`type`: RT, name: java.lang.String): ioDashTsLib.ioDashTsMod.ReadonlyType[
    RT, 
    stdLib.Readonly[/* import warning: ImportType.apply Failed type conversion: RT['_A'] */ js.Any], 
    stdLib.Readonly[/* import warning: ImportType.apply Failed type conversion: RT['_O'] */ js.Any], 
    _
  ] = js.native
  def readonlyArray[RT /* <: ioDashTsLib.ioDashTsMod.Mixed */](`type`: RT): ioDashTsLib.ioDashTsMod.ReadonlyArrayType[
    RT, 
    js.Array[/* import warning: ImportType.apply Failed type conversion: RT['_A'] */ js.Any], 
    js.Array[/* import warning: ImportType.apply Failed type conversion: RT['_O'] */ js.Any], 
    _
  ] = js.native
  def readonlyArray[RT /* <: ioDashTsLib.ioDashTsMod.Mixed */](`type`: RT, name: java.lang.String): ioDashTsLib.ioDashTsMod.ReadonlyArrayType[
    RT, 
    js.Array[/* import warning: ImportType.apply Failed type conversion: RT['_A'] */ js.Any], 
    js.Array[/* import warning: ImportType.apply Failed type conversion: RT['_O'] */ js.Any], 
    _
  ] = js.native
  def recursion[A, O, I, RT /* <: ioDashTsLib.ioDashTsMod.Type[A, O, I] */](name: java.lang.String, definition: js.Function1[/* self */ RT, RT]): ioDashTsLib.ioDashTsMod.RecursiveType[RT, A, O, I] = js.native
  @JSName("refinement")
  def refinement__A[RT /* <: ioDashTsLib.ioDashTsMod.Any */](
    `type`: RT,
    predicate: fpDashTsLib.libFunctionMod.Predicate[/* import warning: ImportType.apply Failed type conversion: RT['_A'] */ js.Any]
  ): ioDashTsLib.ioDashTsMod.RefinementType[
    RT, 
    /* import warning: ImportType.apply Failed type conversion: RT['_A'] */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: RT['_O'] */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: RT['_I'] */ js.Any
  ] = js.native
  @JSName("refinement")
  def refinement__A[RT /* <: ioDashTsLib.ioDashTsMod.Any */](
    `type`: RT,
    predicate: fpDashTsLib.libFunctionMod.Predicate[/* import warning: ImportType.apply Failed type conversion: RT['_A'] */ js.Any],
    name: java.lang.String
  ): ioDashTsLib.ioDashTsMod.RefinementType[
    RT, 
    /* import warning: ImportType.apply Failed type conversion: RT['_A'] */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: RT['_O'] */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: RT['_I'] */ js.Any
  ] = js.native
  def strict[P /* <: ioDashTsLib.ioDashTsMod.Props */](props: P): ioDashTsLib.ioDashTsMod.StrictType[P, ioDashTsLib.ioDashTsMod.TypeOfProps[P], ioDashTsLib.ioDashTsMod.OutputOfProps[P], _] = js.native
  def strict[P /* <: ioDashTsLib.ioDashTsMod.Props */](props: P, name: java.lang.String): ioDashTsLib.ioDashTsMod.StrictType[P, ioDashTsLib.ioDashTsMod.TypeOfProps[P], ioDashTsLib.ioDashTsMod.OutputOfProps[P], _] = js.native
  def success[T](value: T): fpDashTsLib.libEitherMod.Either[ioDashTsLib.ioDashTsMod.Errors, T] = js.native
  def taggedUnion[Tag /* <: java.lang.String */, RTS /* <: fpDashTsLib.libArrayMod.Global.Array[ioDashTsLib.ioDashTsMod.Tagged[Tag, _, _]] */](tag: Tag, types: RTS): ioDashTsLib.ioDashTsMod.TaggedUnionType[
    Tag, 
    RTS, 
    /* import warning: ImportType.apply Failed type conversion: RTS[number]['_A'] */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: RTS[number]['_O'] */ js.Any, 
    _
  ] = js.native
  def taggedUnion[Tag /* <: java.lang.String */, RTS /* <: fpDashTsLib.libArrayMod.Global.Array[ioDashTsLib.ioDashTsMod.Tagged[Tag, _, _]] */](tag: Tag, types: RTS, name: java.lang.String): ioDashTsLib.ioDashTsMod.TaggedUnionType[
    Tag, 
    RTS, 
    /* import warning: ImportType.apply Failed type conversion: RTS[number]['_A'] */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: RTS[number]['_O'] */ js.Any, 
    _
  ] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Array[A]): ioDashTsLib.ioDashTsMod.TupleType[
    js.Array[A], 
    js.Array[ioDashTsLib.ioDashTsMod.TypeOf[A]], 
    js.Array[ioDashTsLib.ioDashTsMod.OutputOf[A]], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Array[A], name: java.lang.String): ioDashTsLib.ioDashTsMod.TupleType[
    js.Array[A], 
    js.Array[ioDashTsLib.ioDashTsMod.TypeOf[A]], 
    js.Array[ioDashTsLib.ioDashTsMod.OutputOf[A]], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Tuple2[A, B]): ioDashTsLib.ioDashTsMod.TupleType[
    js.Tuple2[A, B], 
    js.Tuple2[ioDashTsLib.ioDashTsMod.TypeOf[A], ioDashTsLib.ioDashTsMod.TypeOf[B]], 
    js.Tuple2[ioDashTsLib.ioDashTsMod.OutputOf[A], ioDashTsLib.ioDashTsMod.OutputOf[B]], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Tuple2[A, B], name: java.lang.String): ioDashTsLib.ioDashTsMod.TupleType[
    js.Tuple2[A, B], 
    js.Tuple2[ioDashTsLib.ioDashTsMod.TypeOf[A], ioDashTsLib.ioDashTsMod.TypeOf[B]], 
    js.Tuple2[ioDashTsLib.ioDashTsMod.OutputOf[A], ioDashTsLib.ioDashTsMod.OutputOf[B]], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Tuple3[A, B, C]): ioDashTsLib.ioDashTsMod.TupleType[
    js.Tuple3[A, B, C], 
    js.Tuple3[
      ioDashTsLib.ioDashTsMod.TypeOf[A], 
      ioDashTsLib.ioDashTsMod.TypeOf[B], 
      ioDashTsLib.ioDashTsMod.TypeOf[C]
    ], 
    js.Tuple3[
      ioDashTsLib.ioDashTsMod.OutputOf[A], 
      ioDashTsLib.ioDashTsMod.OutputOf[B], 
      ioDashTsLib.ioDashTsMod.OutputOf[C]
    ], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Tuple3[A, B, C], name: java.lang.String): ioDashTsLib.ioDashTsMod.TupleType[
    js.Tuple3[A, B, C], 
    js.Tuple3[
      ioDashTsLib.ioDashTsMod.TypeOf[A], 
      ioDashTsLib.ioDashTsMod.TypeOf[B], 
      ioDashTsLib.ioDashTsMod.TypeOf[C]
    ], 
    js.Tuple3[
      ioDashTsLib.ioDashTsMod.OutputOf[A], 
      ioDashTsLib.ioDashTsMod.OutputOf[B], 
      ioDashTsLib.ioDashTsMod.OutputOf[C]
    ], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */, D /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Tuple4[A, B, C, D]): ioDashTsLib.ioDashTsMod.TupleType[
    js.Tuple4[A, B, C, D], 
    js.Tuple4[
      ioDashTsLib.ioDashTsMod.TypeOf[A], 
      ioDashTsLib.ioDashTsMod.TypeOf[B], 
      ioDashTsLib.ioDashTsMod.TypeOf[C], 
      ioDashTsLib.ioDashTsMod.TypeOf[D]
    ], 
    js.Tuple4[
      ioDashTsLib.ioDashTsMod.OutputOf[A], 
      ioDashTsLib.ioDashTsMod.OutputOf[B], 
      ioDashTsLib.ioDashTsMod.OutputOf[C], 
      ioDashTsLib.ioDashTsMod.OutputOf[D]
    ], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */, D /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Tuple4[A, B, C, D], name: java.lang.String): ioDashTsLib.ioDashTsMod.TupleType[
    js.Tuple4[A, B, C, D], 
    js.Tuple4[
      ioDashTsLib.ioDashTsMod.TypeOf[A], 
      ioDashTsLib.ioDashTsMod.TypeOf[B], 
      ioDashTsLib.ioDashTsMod.TypeOf[C], 
      ioDashTsLib.ioDashTsMod.TypeOf[D]
    ], 
    js.Tuple4[
      ioDashTsLib.ioDashTsMod.OutputOf[A], 
      ioDashTsLib.ioDashTsMod.OutputOf[B], 
      ioDashTsLib.ioDashTsMod.OutputOf[C], 
      ioDashTsLib.ioDashTsMod.OutputOf[D]
    ], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */, D /* <: ioDashTsLib.ioDashTsMod.Mixed */, E /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Tuple5[A, B, C, D, E]): ioDashTsLib.ioDashTsMod.TupleType[
    js.Tuple5[A, B, C, D, E], 
    js.Tuple5[
      ioDashTsLib.ioDashTsMod.TypeOf[A], 
      ioDashTsLib.ioDashTsMod.TypeOf[B], 
      ioDashTsLib.ioDashTsMod.TypeOf[C], 
      ioDashTsLib.ioDashTsMod.TypeOf[D], 
      ioDashTsLib.ioDashTsMod.TypeOf[E]
    ], 
    js.Tuple5[
      ioDashTsLib.ioDashTsMod.OutputOf[A], 
      ioDashTsLib.ioDashTsMod.OutputOf[B], 
      ioDashTsLib.ioDashTsMod.OutputOf[C], 
      ioDashTsLib.ioDashTsMod.OutputOf[D], 
      ioDashTsLib.ioDashTsMod.OutputOf[E]
    ], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def tuple[A /* <: ioDashTsLib.ioDashTsMod.Mixed */, B /* <: ioDashTsLib.ioDashTsMod.Mixed */, C /* <: ioDashTsLib.ioDashTsMod.Mixed */, D /* <: ioDashTsLib.ioDashTsMod.Mixed */, E /* <: ioDashTsLib.ioDashTsMod.Mixed */](types: js.Tuple5[A, B, C, D, E], name: java.lang.String): ioDashTsLib.ioDashTsMod.TupleType[
    js.Tuple5[A, B, C, D, E], 
    js.Tuple5[
      ioDashTsLib.ioDashTsMod.TypeOf[A], 
      ioDashTsLib.ioDashTsMod.TypeOf[B], 
      ioDashTsLib.ioDashTsMod.TypeOf[C], 
      ioDashTsLib.ioDashTsMod.TypeOf[D], 
      ioDashTsLib.ioDashTsMod.TypeOf[E]
    ], 
    js.Tuple5[
      ioDashTsLib.ioDashTsMod.OutputOf[A], 
      ioDashTsLib.ioDashTsMod.OutputOf[B], 
      ioDashTsLib.ioDashTsMod.OutputOf[C], 
      ioDashTsLib.ioDashTsMod.OutputOf[D], 
      ioDashTsLib.ioDashTsMod.OutputOf[E]
    ], 
    ioDashTsLib.ioDashTsMod.mixed
  ] = js.native
  def `type`[P /* <: ioDashTsLib.ioDashTsMod.Props */](props: P): ioDashTsLib.ioDashTsMod.InterfaceType[P, ioDashTsLib.ioDashTsMod.TypeOfProps[P], ioDashTsLib.ioDashTsMod.OutputOfProps[P], _] = js.native
  def `type`[P /* <: ioDashTsLib.ioDashTsMod.Props */](props: P, name: java.lang.String): ioDashTsLib.ioDashTsMod.InterfaceType[P, ioDashTsLib.ioDashTsMod.TypeOfProps[P], ioDashTsLib.ioDashTsMod.OutputOfProps[P], _] = js.native
  def union[RTS /* <: fpDashTsLib.libArrayMod.Global.Array[ioDashTsLib.ioDashTsMod.Mixed] */](types: RTS): ioDashTsLib.ioDashTsMod.UnionType[
    RTS, 
    /* import warning: ImportType.apply Failed type conversion: RTS[number]['_A'] */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: RTS[number]['_O'] */ js.Any, 
    _
  ] = js.native
  def union[RTS /* <: fpDashTsLib.libArrayMod.Global.Array[ioDashTsLib.ioDashTsMod.Mixed] */](types: RTS, name: java.lang.String): ioDashTsLib.ioDashTsMod.UnionType[
    RTS, 
    /* import warning: ImportType.apply Failed type conversion: RTS[number]['_A'] */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: RTS[number]['_O'] */ js.Any, 
    _
  ] = js.native
}


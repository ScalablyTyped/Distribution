package typings.ioTs

import typings.fpTs.libAltMod.Alt2
import typings.fpTs.libCategoryMod.Category2
import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libFunctionMod.Refinement
import typings.fpTs.libFunctorMod.Functor2
import typings.ioTs.ioTsStrings.Either
import typings.ioTs.libFreeSemigroupMod.FreeSemigroup
import typings.ioTs.libGuardMod.Guard
import typings.ioTs.libKleisliMod.Kleisli
import typings.ioTs.libSchemableMod.Literal
import typings.ioTs.libSchemableMod.Schemable2C
import typings.ioTs.libSchemableMod.WithRefine2C
import typings.ioTs.libSchemableMod.WithUnion2C
import typings.ioTs.libSchemableMod.WithUnknownContainers2C
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDecoderMod {
  
  @JSImport("io-ts/lib/Decoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("io-ts/lib/Decoder", "Alt")
  @js.native
  val Alt_ : Alt2[typings.ioTs.libDecoderMod.URI] = js.native
  
  @JSImport("io-ts/lib/Decoder", "Category")
  @js.native
  val Category: Category2[typings.ioTs.libDecoderMod.URI] = js.native
  
  @JSImport("io-ts/lib/Decoder", "Functor")
  @js.native
  val Functor: Functor2[typings.ioTs.libDecoderMod.URI] = js.native
  
  @JSImport("io-ts/lib/Decoder", "Schemable")
  @js.native
  val Schemable: Schemable2C[typings.ioTs.libDecoderMod.URI, Any] = js.native
  
  @JSImport("io-ts/lib/Decoder", "URI")
  @js.native
  val URI: /* "io-ts/Decoder" */ String = js.native
  type URI = /* "io-ts/Decoder" */ String
  
  @JSImport("io-ts/lib/Decoder", "UnknownArray")
  @js.native
  val UnknownArray: Decoder[Any, js.Array[Any]] = js.native
  
  @JSImport("io-ts/lib/Decoder", "UnknownRecord")
  @js.native
  val UnknownRecord: Decoder[Any, Record[String, Any]] = js.native
  
  @JSImport("io-ts/lib/Decoder", "WithRefine")
  @js.native
  val WithRefine: WithRefine2C[typings.ioTs.libDecoderMod.URI, Any] = js.native
  
  @JSImport("io-ts/lib/Decoder", "WithUnion")
  @js.native
  val WithUnion: WithUnion2C[typings.ioTs.libDecoderMod.URI, Any] = js.native
  
  @JSImport("io-ts/lib/Decoder", "WithUnknownContainers")
  @js.native
  val WithUnknownContainers: WithUnknownContainers2C[typings.ioTs.libDecoderMod.URI, Any] = js.native
  
  inline def alt[I, A](that: js.Function0[Decoder[I, A]]): js.Function1[/* me */ Decoder[I, A], Decoder[I, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* me */ Decoder[I, A], Decoder[I, A]]]
  
  inline def array[A](item: Decoder[Any, A]): Decoder[Any, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(item.asInstanceOf[js.Any]).asInstanceOf[Decoder[Any, js.Array[A]]]
  
  @JSImport("io-ts/lib/Decoder", "boolean")
  @js.native
  val boolean: Decoder[Any, Boolean] = js.native
  
  inline def compose[A, B](to: Decoder[A, B]): js.Function1[/* from */ Decoder[Any, A], Decoder[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(to.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* from */ Decoder[Any, A], Decoder[Any, B]]]
  
  inline def draw(e: DecodeError): String = ^.asInstanceOf[js.Dynamic].applyDynamic("draw")(e.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def error(actual: Any, message: String): DecodeError = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[DecodeError]
  
  inline def failure[A](actual: Any, message: String): Either_[DecodeError, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("failure")(actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Either_[DecodeError, A]]
  
  inline def fromArray[I, A](item: Decoder[I, A]): Decoder[js.Array[I], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(item.asInstanceOf[js.Any]).asInstanceOf[Decoder[js.Array[I], js.Array[A]]]
  
  inline def fromGuard[I, A /* <: I */](guard: Guard[I, A], expected: String): Decoder[I, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGuard")(guard.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Decoder[I, A]]
  
  inline def fromPartial[P /* <: Record[String, Decoder[Any, Any]] */](properties: P): Decoder[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', P[K]>} */ js.Any
    ], 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'Either', P[K_1]>} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPartial")(properties.asInstanceOf[js.Any]).asInstanceOf[Decoder[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', P[K]>} */ js.Any
    ], 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'Either', P[K_1]>} */ js.Any
    ]
  ]]
  
  inline def fromRecord[I, A](codomain: Decoder[I, A]): Decoder[Record[String, I], Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRecord")(codomain.asInstanceOf[js.Any]).asInstanceOf[Decoder[Record[String, I], Record[String, A]]]
  
  inline def fromRefinement[I, A /* <: I */](refinement: Refinement[I, A], expected: String): Decoder[I, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRefinement")(refinement.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Decoder[I, A]]
  
  inline def fromStruct[P /* <: Record[String, Decoder[Any, Any]] */](properties: P): Decoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'Either', P[K_1]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStruct")(properties.asInstanceOf[js.Any]).asInstanceOf[Decoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'Either', P[K_1]>} */ js.Any
  ]]
  
  inline def fromSum[T /* <: String */](tag: T): js.Function1[
    /* members */ Record[String, Decoder[Any, Any]], 
    Decoder[
      typings.ioTs.libKleisliMod.InputOf[
        Either, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Decoder.Decoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Decoder.Decoder<any, any>>] */ js.Any
      ], 
      typings.ioTs.libKleisliMod.TypeOf[
        Either, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Decoder.Decoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Decoder.Decoder<any, any>>] */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* members */ Record[String, Decoder[Any, Any]], 
    Decoder[
      typings.ioTs.libKleisliMod.InputOf[
        Either, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Decoder.Decoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Decoder.Decoder<any, any>>] */ js.Any
      ], 
      typings.ioTs.libKleisliMod.TypeOf[
        Either, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Decoder.Decoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Decoder.Decoder<any, any>>] */ js.Any
      ]
    ]
  ]]
  
  inline def fromTuple[C /* <: js.Array[Decoder[Any, Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type C is not an array type */ components: C
  ): Decoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof C ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', C[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof C ]: io-ts.io-ts/lib/Kleisli.TypeOf<'Either', C[K_1]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTuple")(components.asInstanceOf[js.Any]).asInstanceOf[Decoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof C ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', C[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof C ]: io-ts.io-ts/lib/Kleisli.TypeOf<'Either', C[K_1]>} */ js.Any
  ]]
  
  inline def fromType[P /* <: Record[String, Decoder[Any, Any]] */](properties: P): Decoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'Either', P[K_1]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromType")(properties.asInstanceOf[js.Any]).asInstanceOf[Decoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'Either', P[K_1]>} */ js.Any
  ]]
  
  inline def id[A](): Decoder[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Decoder[A, A]]
  
  inline def intersect[IB, B](right: Decoder[IB, B]): js.Function1[/* left */ Decoder[Any, Any], Decoder[Any & IB, Any & B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(right.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* left */ Decoder[Any, Any], Decoder[Any & IB, Any & B]]]
  
  inline def `lazy`[I, A](id: String, f: js.Function0[Decoder[I, A]]): Decoder[I, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(id.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Decoder[I, A]]
  
  inline def literal[A /* <: Array[L] */, L /* <: Literal */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
  ): Decoder[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(values.asInstanceOf[js.Any]).asInstanceOf[Decoder[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Decoder[Any, A], Decoder[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Decoder[Any, A], Decoder[Any, B]]]
  
  inline def mapLeftWithInput[I](f: js.Function2[/* input */ I, /* e */ DecodeError, DecodeError]): js.Function1[/* decoder */ Decoder[I, Any], Decoder[I, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeftWithInput")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* decoder */ Decoder[I, Any], Decoder[I, Any]]]
  
  inline def nullable[I, A](or: Decoder[I, A]): Decoder[Null | I, Null | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(or.asInstanceOf[js.Any]).asInstanceOf[Decoder[Null | I, Null | A]]
  
  @JSImport("io-ts/lib/Decoder", "number")
  @js.native
  val number: Decoder[Any, Double] = js.native
  
  inline def parse[A, B](parser: js.Function1[/* a */ A, Either_[DecodeError, B]]): js.Function1[/* from */ Decoder[Any, A], Decoder[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(parser.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* from */ Decoder[Any, A], Decoder[Any, B]]]
  
  inline def partial[A](
    properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: io-ts.io-ts/lib/Decoder.Decoder<unknown, A[K]>} */ js.Any
  ): Decoder[
    Any, 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(properties.asInstanceOf[js.Any]).asInstanceOf[Decoder[
    Any, 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
    ]
  ]]
  
  inline def readonly[I, A](decoder: Decoder[I, A]): Decoder[I, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("readonly")(decoder.asInstanceOf[js.Any]).asInstanceOf[Decoder[I, A]]
  
  inline def record[A](codomain: Decoder[Any, A]): Decoder[Any, Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("record")(codomain.asInstanceOf[js.Any]).asInstanceOf[Decoder[Any, Record[String, A]]]
  
  inline def refine[A, B /* <: A */](refinement: Refinement[A, B], id: String): js.Function1[/* from */ Decoder[Any, A], Decoder[Any, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("refine")(refinement.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* from */ Decoder[Any, A], Decoder[Any, B]]]
  
  @JSImport("io-ts/lib/Decoder", "string")
  @js.native
  val string: Decoder[Any, String] = js.native
  
  inline def struct[A](
    properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: io-ts.io-ts/lib/Decoder.Decoder<unknown, A[K]>} */ js.Any
  ): Decoder[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("struct")(properties.asInstanceOf[js.Any]).asInstanceOf[Decoder[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
  ]]
  
  inline def success[A](a: A): Either_[DecodeError, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(a.asInstanceOf[js.Any]).asInstanceOf[Either_[DecodeError, A]]
  
  inline def sum[T /* <: String */](tag: T): js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: io-ts.io-ts/lib/Decoder.Decoder<unknown, any[K] & std.Record<T, K>>} */ /* members */ js.Any, 
    Decoder[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: io-ts.io-ts/lib/Decoder.Decoder<unknown, any[K] & std.Record<T, K>>} */ /* members */ js.Any, 
    Decoder[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ]]
  
  inline def tuple[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: Decoder<unknown, A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: io-ts.io-ts/lib/Decoder.Decoder<unknown, A[K]>} */ js.Any
  ): Decoder[Any, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(components.asInstanceOf[js.Any]).asInstanceOf[Decoder[Any, A]]
  
  inline def `type`[A](
    properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: io-ts.io-ts/lib/Decoder.Decoder<unknown, A[K]>} */ js.Any
  ): Decoder[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(properties.asInstanceOf[js.Any]).asInstanceOf[Decoder[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
  ]]
  
  inline def union[MS /* <: Array[Decoder[Any, Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param members because its type MS is not an array type */ members: MS
  ): Decoder[
    InputOf[
      /* import warning: importer.ImportType#apply Failed type conversion: MS[keyof MS] */ js.Any
    ], 
    TypeOf[
      /* import warning: importer.ImportType#apply Failed type conversion: MS[keyof MS] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(members.asInstanceOf[js.Any]).asInstanceOf[Decoder[
    InputOf[
      /* import warning: importer.ImportType#apply Failed type conversion: MS[keyof MS] */ js.Any
    ], 
    TypeOf[
      /* import warning: importer.ImportType#apply Failed type conversion: MS[keyof MS] */ js.Any
    ]
  ]]
  
  inline def withMessage[I](message: js.Function2[/* input */ I, /* e */ DecodeError, String]): js.Function1[/* decoder */ Decoder[I, Any], Decoder[I, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withMessage")(message.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* decoder */ Decoder[I, Any], Decoder[I, Any]]]
  
  type DecodeError = FreeSemigroup[typings.ioTs.libDecodeErrorMod.DecodeError[String]]
  
  type Decoder[I, A] = Kleisli[typings.fpTs.libEitherMod.URI, I, DecodeError, A]
  
  type InputOf[D] = typings.ioTs.libKleisliMod.InputOf[typings.fpTs.libEitherMod.URI, D]
  
  type TypeOf[D] = typings.ioTs.libKleisliMod.TypeOf[typings.fpTs.libEitherMod.URI, D]
  
  /* augmented module */
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}

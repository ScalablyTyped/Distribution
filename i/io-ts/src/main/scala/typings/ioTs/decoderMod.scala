package typings.ioTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.altMod.Alt2
import typings.fpTs.categoryMod.Category2
import typings.fpTs.eitherMod.Either_
import typings.fpTs.functionMod.Refinement
import typings.fpTs.functorMod.Functor2
import typings.ioTs.freeSemigroupMod.FreeSemigroup
import typings.ioTs.guardMod.Guard
import typings.ioTs.ioTsStrings.Either
import typings.ioTs.kleisliMod.Kleisli
import typings.ioTs.schemableMod.Literal
import typings.ioTs.schemableMod.Schemable2C
import typings.ioTs.schemableMod.WithRefine2C
import typings.ioTs.schemableMod.WithUnion2C
import typings.ioTs.schemableMod.WithUnknownContainers2C
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoderMod {
  
  @JSImport("io-ts/lib/Decoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("io-ts/lib/Decoder", "Alt")
  @js.native
  val Alt_ : Alt2[typings.ioTs.decoderMod.URI] = js.native
  
  @JSImport("io-ts/lib/Decoder", "Category")
  @js.native
  val Category: Category2[typings.ioTs.decoderMod.URI] = js.native
  
  @JSImport("io-ts/lib/Decoder", "Functor")
  @js.native
  val Functor: Functor2[typings.ioTs.decoderMod.URI] = js.native
  
  @JSImport("io-ts/lib/Decoder", "Schemable")
  @js.native
  val Schemable: Schemable2C[typings.ioTs.decoderMod.URI, js.Any] = js.native
  
  @JSImport("io-ts/lib/Decoder", "URI")
  @js.native
  val URI: /* "io-ts/Decoder" */ String = js.native
  type URI = /* "io-ts/Decoder" */ String
  
  @JSImport("io-ts/lib/Decoder", "UnknownArray")
  @js.native
  val UnknownArray: Decoder[js.Any, js.Array[js.Any]] = js.native
  
  @JSImport("io-ts/lib/Decoder", "UnknownRecord")
  @js.native
  val UnknownRecord: Decoder[js.Any, Record[String, js.Any]] = js.native
  
  @JSImport("io-ts/lib/Decoder", "WithRefine")
  @js.native
  val WithRefine: WithRefine2C[typings.ioTs.decoderMod.URI, js.Any] = js.native
  
  @JSImport("io-ts/lib/Decoder", "WithUnion")
  @js.native
  val WithUnion: WithUnion2C[typings.ioTs.decoderMod.URI, js.Any] = js.native
  
  @JSImport("io-ts/lib/Decoder", "WithUnknownContainers")
  @js.native
  val WithUnknownContainers: WithUnknownContainers2C[typings.ioTs.decoderMod.URI, js.Any] = js.native
  
  inline def alt[I, A](that: js.Function0[Decoder[I, A]]): js.Function1[/* me */ Decoder[I, A], Decoder[I, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* me */ Decoder[I, A], Decoder[I, A]]]
  
  inline def array[A](item: Decoder[js.Any, A]): Decoder[js.Any, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(item.asInstanceOf[js.Any]).asInstanceOf[Decoder[js.Any, js.Array[A]]]
  
  @JSImport("io-ts/lib/Decoder", "boolean")
  @js.native
  val boolean: Decoder[js.Any, Boolean] = js.native
  
  inline def compose[A, B](to: Decoder[A, B]): js.Function1[/* from */ Decoder[js.Any, A], Decoder[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(to.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* from */ Decoder[js.Any, A], Decoder[js.Any, B]]]
  
  inline def draw(e: DecodeError): String = ^.asInstanceOf[js.Dynamic].applyDynamic("draw")(e.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def error(actual: js.Any, message: String): DecodeError = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[DecodeError]
  
  inline def failure[A](actual: js.Any, message: String): Either_[FreeSemigroup[typings.ioTs.decodeErrorMod.DecodeError[String]], A] = (^.asInstanceOf[js.Dynamic].applyDynamic("failure")(actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Either_[FreeSemigroup[typings.ioTs.decodeErrorMod.DecodeError[String]], A]]
  
  inline def fromArray[I, A](item: Decoder[I, A]): Decoder[js.Array[I], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(item.asInstanceOf[js.Any]).asInstanceOf[Decoder[js.Array[I], js.Array[A]]]
  
  inline def fromGuard[I, A /* <: I */](guard: Guard[I, A], expected: String): Decoder[I, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGuard")(guard.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Decoder[I, A]]
  
  inline def fromPartial[P /* <: Record[String, Decoder[js.Any, js.Any]] */](properties: P): Decoder[
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', P[K]>}
    */ typings.ioTs.ioTsStrings.fromPartial & TopLevel[P]
    ], 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'Either', P[K_1]>}
    */ typings.ioTs.ioTsStrings.fromPartial & TopLevel[P]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPartial")(properties.asInstanceOf[js.Any]).asInstanceOf[Decoder[
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', P[K]>}
    */ typings.ioTs.ioTsStrings.fromPartial & TopLevel[P]
    ], 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'Either', P[K_1]>}
    */ typings.ioTs.ioTsStrings.fromPartial & TopLevel[P]
    ]
  ]]
  
  inline def fromRecord[I, A](codomain: Decoder[I, A]): Decoder[Record[String, I], Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRecord")(codomain.asInstanceOf[js.Any]).asInstanceOf[Decoder[Record[String, I], Record[String, A]]]
  
  inline def fromRefinement[I, A /* <: I */](refinement: Refinement[I, A], expected: String): Decoder[I, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRefinement")(refinement.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Decoder[I, A]]
  
  inline def fromSum[T /* <: String */](tag: T): js.Function1[
    /* members */ Record[String, Decoder[js.Any, js.Any]], 
    Decoder[
      typings.ioTs.kleisliMod.InputOf[
        Either, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Decoder.Decoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Decoder.Decoder<any, any>>] */ js.Any
      ], 
      typings.ioTs.kleisliMod.TypeOf[
        Either, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Decoder.Decoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Decoder.Decoder<any, any>>] */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* members */ Record[String, Decoder[js.Any, js.Any]], 
    Decoder[
      typings.ioTs.kleisliMod.InputOf[
        Either, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Decoder.Decoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Decoder.Decoder<any, any>>] */ js.Any
      ], 
      typings.ioTs.kleisliMod.TypeOf[
        Either, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Decoder.Decoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Decoder.Decoder<any, any>>] */ js.Any
      ]
    ]
  ]]
  
  inline def fromTuple[C /* <: js.Array[Decoder[js.Any, js.Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type C is not an array type */ components: C
  ): Decoder[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof C ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', C[K]>}
    */ typings.ioTs.ioTsStrings.fromTuple & TopLevel[C], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof C ]: io-ts.io-ts/lib/Kleisli.TypeOf<'Either', C[K_1]>}
    */ typings.ioTs.ioTsStrings.fromTuple & TopLevel[C]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTuple")(components.asInstanceOf[js.Any]).asInstanceOf[Decoder[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof C ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', C[K]>}
    */ typings.ioTs.ioTsStrings.fromTuple & TopLevel[C], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof C ]: io-ts.io-ts/lib/Kleisli.TypeOf<'Either', C[K_1]>}
    */ typings.ioTs.ioTsStrings.fromTuple & TopLevel[C]
  ]]
  
  inline def fromType[P /* <: Record[String, Decoder[js.Any, js.Any]] */](properties: P): Decoder[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', P[K]>}
    */ typings.ioTs.ioTsStrings.fromType & TopLevel[P], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'Either', P[K_1]>}
    */ typings.ioTs.ioTsStrings.fromType & TopLevel[P]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromType")(properties.asInstanceOf[js.Any]).asInstanceOf[Decoder[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', P[K]>}
    */ typings.ioTs.ioTsStrings.fromType & TopLevel[P], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'Either', P[K_1]>}
    */ typings.ioTs.ioTsStrings.fromType & TopLevel[P]
  ]]
  
  inline def id[A](): Decoder[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Decoder[A, A]]
  
  inline def intersect[IB, B](right: Decoder[IB, B]): js.Function1[/* left */ Decoder[js.Any, js.Any], Decoder[js.Any & IB, js.Any & B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(right.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* left */ Decoder[js.Any, js.Any], Decoder[js.Any & IB, js.Any & B]]]
  
  inline def `lazy`[I, A](id: String, f: js.Function0[Decoder[I, A]]): Decoder[I, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(id.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Decoder[I, A]]
  
  inline def literal[A /* <: Array[Literal] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
  ): Decoder[
    js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(values.asInstanceOf[js.Any]).asInstanceOf[Decoder[
    js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Decoder[js.Any, A], Decoder[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Decoder[js.Any, A], Decoder[js.Any, B]]]
  
  inline def mapLeftWithInput[I](f: js.Function2[/* input */ I, /* e */ DecodeError, DecodeError]): js.Function1[/* decoder */ Decoder[I, js.Any], Decoder[I, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeftWithInput")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* decoder */ Decoder[I, js.Any], Decoder[I, js.Any]]]
  
  inline def nullable[I, A](or: Decoder[I, A]): Decoder[Null | I, Null | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(or.asInstanceOf[js.Any]).asInstanceOf[Decoder[Null | I, Null | A]]
  
  @JSImport("io-ts/lib/Decoder", "number")
  @js.native
  val number: Decoder[js.Any, Double] = js.native
  
  inline def parse[A, B](parser: js.Function1[/* a */ A, Either_[DecodeError, B]]): js.Function1[/* from */ Decoder[js.Any, A], Decoder[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(parser.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* from */ Decoder[js.Any, A], Decoder[js.Any, B]]]
  
  inline def partial[A](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/Decoder.Decoder<unknown, A[K]>}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[A]
  ): Decoder[
    js.Any, 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof A ]: A[K_1]}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[A]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(properties.asInstanceOf[js.Any]).asInstanceOf[Decoder[
    js.Any, 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof A ]: A[K_1]}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[A]
    ]
  ]]
  
  inline def record[A](codomain: Decoder[js.Any, A]): Decoder[js.Any, Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("record")(codomain.asInstanceOf[js.Any]).asInstanceOf[Decoder[js.Any, Record[String, A]]]
  
  inline def refine[A, B /* <: A */](refinement: js.Function1[/* a */ A, /* is B */ Boolean], id: String): js.Function1[/* from */ Decoder[js.Any, A], Decoder[js.Any, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("refine")(refinement.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* from */ Decoder[js.Any, A], Decoder[js.Any, B]]]
  
  @JSImport("io-ts/lib/Decoder", "string")
  @js.native
  val string: Decoder[js.Any, String] = js.native
  
  inline def success[A](a: A): Either_[DecodeError, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(a.asInstanceOf[js.Any]).asInstanceOf[Either_[DecodeError, A]]
  
  inline def sum[T /* <: String */](tag: T): js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: io-ts.io-ts/lib/Decoder.Decoder<unknown, any[K] & std.Record<T, K>>}
    */ /* members */ typings.ioTs.ioTsStrings.sum & TopLevel[js.Any], 
    Decoder[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: io-ts.io-ts/lib/Decoder.Decoder<unknown, any[K] & std.Record<T, K>>}
    */ /* members */ typings.ioTs.ioTsStrings.sum & TopLevel[js.Any], 
    Decoder[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ]]
  
  inline def tuple[A /* <: js.Array[js.Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: Decoder<unknown, A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/Decoder.Decoder<unknown, A[K]>}
    */ typings.ioTs.ioTsStrings.tuple & TopLevel[A]
  ): Decoder[js.Any, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(components.asInstanceOf[js.Any]).asInstanceOf[Decoder[js.Any, A]]
  
  inline def `type`[A](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/Decoder.Decoder<unknown, A[K]>}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[A]
  ): Decoder[
    js.Any, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof A ]: A[K_1]}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(properties.asInstanceOf[js.Any]).asInstanceOf[Decoder[
    js.Any, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof A ]: A[K_1]}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[A]
  ]]
  
  inline def union[MS /* <: Array[Decoder[js.Any, js.Any]] */](
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
  
  inline def withMessage[I](message: js.Function2[/* input */ I, /* e */ DecodeError, String]): js.Function1[/* decoder */ Decoder[I, js.Any], Decoder[I, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withMessage")(message.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* decoder */ Decoder[I, js.Any], Decoder[I, js.Any]]]
  
  type DecodeError = FreeSemigroup[typings.ioTs.decodeErrorMod.DecodeError[String]]
  
  type Decoder[I, A] = Kleisli[typings.fpTs.eitherMod.URI, I, DecodeError, A]
  
  type InputOf[D] = typings.ioTs.kleisliMod.InputOf[typings.fpTs.eitherMod.URI, D]
  
  type TypeOf[D] = typings.ioTs.kleisliMod.TypeOf[typings.fpTs.eitherMod.URI, D]
  
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind3[R, E, A] extends StObject
  }
}

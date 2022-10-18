package typings.ioTs

import typings.fpTs.libFunctionMod.Refinement
import typings.fpTs.libInvariantMod.Invariant3
import typings.ioTs.ioTsStrings.Either
import typings.ioTs.libDecoderMod.DecodeError
import typings.ioTs.libDecoderMod.Decoder
import typings.ioTs.libEncoderMod.Encoder
import typings.ioTs.libKleisliMod.Kleisli
import typings.ioTs.libSchemableMod.Literal
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCodecMod {
  
  @JSImport("io-ts/lib/Codec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("io-ts/lib/Codec", "Invariant")
  @js.native
  val Invariant: Invariant3[typings.ioTs.libCodecMod.URI] = js.native
  
  @JSImport("io-ts/lib/Codec", "URI")
  @js.native
  val URI: /* "io-ts/Codec" */ String = js.native
  type URI = /* "io-ts/Codec" */ String
  
  @JSImport("io-ts/lib/Codec", "UnknownArray")
  @js.native
  val UnknownArray: Codec[Any, js.Array[Any], js.Array[Any]] = js.native
  
  @JSImport("io-ts/lib/Codec", "UnknownRecord")
  @js.native
  val UnknownRecord: Codec[Any, Record[String, Any], Record[String, Any]] = js.native
  
  inline def array[O, A](item: Codec[Any, O, A]): Codec[Any, js.Array[O], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(item.asInstanceOf[js.Any]).asInstanceOf[Codec[Any, js.Array[O], js.Array[A]]]
  
  @JSImport("io-ts/lib/Codec", "boolean")
  @js.native
  val boolean: Codec[Any, Boolean, Boolean] = js.native
  
  inline def compose[L, A /* <: L */, P /* <: A */, B](to: Codec[L, P, B]): js.Function1[/* from */ Codec[Any, Any, A], Codec[Any, Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(to.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* from */ Codec[Any, Any, A], Codec[Any, Any, B]]]
  
  inline def fromArray[I, O, A](item: Codec[I, O, A]): Codec[js.Array[I], js.Array[O], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(item.asInstanceOf[js.Any]).asInstanceOf[Codec[js.Array[I], js.Array[O], js.Array[A]]]
  
  inline def fromDecoder[I, A](decoder: Decoder[I, A]): Codec[I, A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDecoder")(decoder.asInstanceOf[js.Any]).asInstanceOf[Codec[I, A, A]]
  
  inline def fromPartial[P /* <: Record[String, Codec[Any, Any, Any]] */](properties: P): Codec[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.InputOf<P[K]>} */ js.Any
    ], 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>} */ js.Any
    ], 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPartial")(properties.asInstanceOf[js.Any]).asInstanceOf[Codec[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.InputOf<P[K]>} */ js.Any
    ], 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>} */ js.Any
    ], 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>} */ js.Any
    ]
  ]]
  
  inline def fromRecord[I, O, A](codomain: Codec[I, O, A]): Codec[Record[String, I], Record[String, O], Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRecord")(codomain.asInstanceOf[js.Any]).asInstanceOf[Codec[Record[String, I], Record[String, O], Record[String, A]]]
  
  inline def fromStruct[P /* <: Record[String, Codec[Any, Any, Any]] */](properties: P): Codec[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.InputOf<P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStruct")(properties.asInstanceOf[js.Any]).asInstanceOf[Codec[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.InputOf<P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>} */ js.Any
  ]]
  
  inline def fromSum[T /* <: String */](tag: T): js.Function1[
    /* members */ Record[String, Codec[Any, Any, Any]], 
    Codec[
      typings.ioTs.libKleisliMod.InputOf[
        Either, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>] */ js.Any
      ], 
      typings.ioTs.libEncoderMod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>] */ js.Any
      ], 
      typings.ioTs.libEncoderMod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>] */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* members */ Record[String, Codec[Any, Any, Any]], 
    Codec[
      typings.ioTs.libKleisliMod.InputOf[
        Either, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>] */ js.Any
      ], 
      typings.ioTs.libEncoderMod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>] */ js.Any
      ], 
      typings.ioTs.libEncoderMod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>] */ js.Any
      ]
    ]
  ]]
  
  inline def fromTuple[C /* <: js.Array[Codec[Any, Any, Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type C is not an array type */ components: C
  ): Codec[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof C ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', C[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof C ]: io-ts.io-ts/lib/Encoder.OutputOf<C[K_1]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_2 in keyof C ]: io-ts.io-ts/lib/Encoder.TypeOf<C[K_2]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTuple")(components.asInstanceOf[js.Any]).asInstanceOf[Codec[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof C ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', C[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof C ]: io-ts.io-ts/lib/Encoder.OutputOf<C[K_1]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_2 in keyof C ]: io-ts.io-ts/lib/Encoder.TypeOf<C[K_2]>} */ js.Any
  ]]
  
  inline def fromType[P /* <: Record[String, Codec[Any, Any, Any]] */](properties: P): Codec[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.InputOf<P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromType")(properties.asInstanceOf[js.Any]).asInstanceOf[Codec[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.InputOf<P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>} */ js.Any
  ]]
  
  inline def imap[I, O, A, B](f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): js.Function1[/* fa */ Codec[I, O, A], Codec[I, O, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("imap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Codec[I, O, A], Codec[I, O, B]]]
  
  inline def intersect[IB, OB, B](right: Codec[IB, OB, B]): js.Function1[/* left */ Codec[Any, Any, Any], Codec[Any & IB, Any & OB, Any & B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(right.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* left */ Codec[Any, Any, Any], Codec[Any & IB, Any & OB, Any & B]]]
  
  inline def `lazy`[I, O, A](id: String, f: js.Function0[Codec[I, O, A]]): Codec[I, O, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(id.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Codec[I, O, A]]
  
  inline def literal[A /* <: Array[L] */, L /* <: Literal */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
  ): Codec[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(values.asInstanceOf[js.Any]).asInstanceOf[Codec[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ]]
  
  inline def make[I, O, A](decoder: Decoder[I, A], encoder: Encoder[O, A]): Codec[I, O, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(decoder.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[Codec[I, O, A]]
  
  inline def mapLeftWithInput[I](f: js.Function2[/* i */ I, /* e */ DecodeError, DecodeError]): js.Function1[/* codec */ Codec[I, Any, Any], Codec[I, Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeftWithInput")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* codec */ Codec[I, Any, Any], Codec[I, Any, Any]]]
  
  inline def nullable[I, O, A](or: Codec[I, O, A]): Codec[Null | I, Null | O, Null | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(or.asInstanceOf[js.Any]).asInstanceOf[Codec[Null | I, Null | O, Null | A]]
  
  @JSImport("io-ts/lib/Codec", "number")
  @js.native
  val number: Codec[Any, Double, Double] = js.native
  
  inline def partial[P /* <: Record[String, Codec[Any, Any, Any]] */](properties: P): Codec[
    Any, 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>} */ js.Any
    ], 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(properties.asInstanceOf[js.Any]).asInstanceOf[Codec[
    Any, 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>} */ js.Any
    ], 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>} */ js.Any
    ]
  ]]
  
  inline def readonly[I, O, A](codec: Codec[I, O, A]): Codec[I, O, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("readonly")(codec.asInstanceOf[js.Any]).asInstanceOf[Codec[I, O, A]]
  
  inline def record[O, A](codomain: Codec[Any, O, A]): Codec[Any, Record[String, O], Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("record")(codomain.asInstanceOf[js.Any]).asInstanceOf[Codec[Any, Record[String, O], Record[String, A]]]
  
  inline def refine[A, B /* <: A */](refinement: Refinement[A, B], id: String): js.Function1[/* from */ Codec[Any, Any, A], Codec[Any, Any, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("refine")(refinement.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* from */ Codec[Any, Any, A], Codec[Any, Any, B]]]
  
  @JSImport("io-ts/lib/Codec", "string")
  @js.native
  val string: Codec[Any, String, String] = js.native
  
  inline def struct[P /* <: Record[String, Codec[Any, Any, Any]] */](properties: P): Codec[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("struct")(properties.asInstanceOf[js.Any]).asInstanceOf[Codec[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>} */ js.Any
  ]]
  
  inline def sum[T /* <: String */](tag: T): js.Function1[
    /* members */ Record[String, Codec[Any, Any, Any]], 
    Codec[
      Any, 
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<unknown, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<unknown, any, any>>] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<unknown, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<unknown, any, any>>] */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* members */ Record[String, Codec[Any, Any, Any]], 
    Codec[
      Any, 
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<unknown, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<unknown, any, any>>] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<unknown, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<unknown, any, any>>] */ js.Any
      ]
    ]
  ]]
  
  inline def tuple[C /* <: js.Array[Codec[Any, Any, Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type C is not an array type */ components: C
  ): Codec[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof C ]: io-ts.io-ts/lib/Codec.OutputOf<C[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof C ]: io-ts.io-ts/lib/Codec.TypeOf<C[K]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(components.asInstanceOf[js.Any]).asInstanceOf[Codec[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof C ]: io-ts.io-ts/lib/Codec.OutputOf<C[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof C ]: io-ts.io-ts/lib/Codec.TypeOf<C[K]>} */ js.Any
  ]]
  
  inline def `type`[P /* <: Record[String, Codec[Any, Any, Any]] */](properties: P): Codec[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(properties.asInstanceOf[js.Any]).asInstanceOf[Codec[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>} */ js.Any
  ]]
  
  trait Codec[I, O, A]
    extends StObject
       with Kleisli[typings.fpTs.libEitherMod.URI, I, DecodeError, A]
       with Encoder[O, A]
  object Codec {
    
    inline def apply[I, O, A](decode: I => Any, encode: A => O): Codec[I, O, A] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Codec[I, O, A]]
    }
  }
  
  type InputOf[C] = typings.ioTs.libDecoderMod.InputOf[C]
  
  type OutputOf[C] = typings.ioTs.libEncoderMod.OutputOf[C]
  
  type TypeOf[C] = typings.ioTs.libEncoderMod.TypeOf[C]
  
  /* augmented module */
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind3[R, E, A] extends StObject
  }
}

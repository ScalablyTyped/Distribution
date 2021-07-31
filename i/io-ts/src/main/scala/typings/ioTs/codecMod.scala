package typings.ioTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.invariantMod.Invariant3
import typings.ioTs.decoderMod.DecodeError
import typings.ioTs.decoderMod.Decoder
import typings.ioTs.encoderMod.Encoder
import typings.ioTs.ioTsStrings.Either
import typings.ioTs.kleisliMod.Kleisli
import typings.ioTs.schemableMod.Literal
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codecMod {
  
  @JSImport("io-ts/lib/Codec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("io-ts/lib/Codec", "Invariant")
  @js.native
  val Invariant: Invariant3[typings.ioTs.codecMod.URI] = js.native
  
  @JSImport("io-ts/lib/Codec", "URI")
  @js.native
  val URI: /* "io-ts/Codec" */ String = js.native
  type URI = /* "io-ts/Codec" */ String
  
  @JSImport("io-ts/lib/Codec", "UnknownArray")
  @js.native
  val UnknownArray: Codec[js.Any, js.Array[js.Any], js.Array[js.Any]] = js.native
  
  @JSImport("io-ts/lib/Codec", "UnknownRecord")
  @js.native
  val UnknownRecord: Codec[js.Any, Record[String, js.Any], Record[String, js.Any]] = js.native
  
  @scala.inline
  def array[O, A](item: Codec[js.Any, O, A]): Codec[js.Any, js.Array[O], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(item.asInstanceOf[js.Any]).asInstanceOf[Codec[js.Any, js.Array[O], js.Array[A]]]
  
  @JSImport("io-ts/lib/Codec", "boolean")
  @js.native
  val boolean: Codec[js.Any, Boolean, Boolean] = js.native
  
  @scala.inline
  def compose[L, A /* <: L */, P /* <: A */, B](to: Codec[L, P, B]): js.Function1[/* from */ Codec[js.Any, js.Any, A], Codec[js.Any, js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(to.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* from */ Codec[js.Any, js.Any, A], Codec[js.Any, js.Any, B]]]
  
  @scala.inline
  def fromArray[I, O, A](item: Codec[I, O, A]): Codec[js.Array[I], js.Array[O], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(item.asInstanceOf[js.Any]).asInstanceOf[Codec[js.Array[I], js.Array[O], js.Array[A]]]
  
  @scala.inline
  def fromDecoder[I, A](decoder: Decoder[I, A]): Codec[I, A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDecoder")(decoder.asInstanceOf[js.Any]).asInstanceOf[Codec[I, A, A]]
  
  @scala.inline
  def fromPartial[P /* <: Record[String, Codec[js.Any, js.Any, js.Any]] */](properties: P): Codec[
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.InputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.fromPartial & TopLevel[P]
    ], 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.fromPartial & TopLevel[P]
    ], 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.fromPartial & TopLevel[P]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPartial")(properties.asInstanceOf[js.Any]).asInstanceOf[Codec[
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.InputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.fromPartial & TopLevel[P]
    ], 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.fromPartial & TopLevel[P]
    ], 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.fromPartial & TopLevel[P]
    ]
  ]]
  
  @scala.inline
  def fromRecord[I, O, A](codomain: Codec[I, O, A]): Codec[Record[String, I], Record[String, O], Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRecord")(codomain.asInstanceOf[js.Any]).asInstanceOf[Codec[Record[String, I], Record[String, O], Record[String, A]]]
  
  @scala.inline
  def fromSum[T /* <: String */](tag: T): js.Function1[
    /* members */ Record[String, Codec[js.Any, js.Any, js.Any]], 
    Codec[
      typings.ioTs.kleisliMod.InputOf[
        Either, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>] */ js.Any
      ], 
      typings.ioTs.encoderMod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>] */ js.Any
      ], 
      typings.ioTs.encoderMod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>] */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* members */ Record[String, Codec[js.Any, js.Any, js.Any]], 
    Codec[
      typings.ioTs.kleisliMod.InputOf[
        Either, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>] */ js.Any
      ], 
      typings.ioTs.encoderMod.OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>] */ js.Any
      ], 
      typings.ioTs.encoderMod.TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<any, any, any>>] */ js.Any
      ]
    ]
  ]]
  
  @scala.inline
  def fromTuple[C /* <: js.Array[Codec[js.Any, js.Any, js.Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type C is not an array type */ components: C
  ): Codec[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof C ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', C[K]>}
    */ typings.ioTs.ioTsStrings.fromTuple & TopLevel[C], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof C ]: io-ts.io-ts/lib/Encoder.OutputOf<C[K_1]>}
    */ typings.ioTs.ioTsStrings.fromTuple & TopLevel[C], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_2 in keyof C ]: io-ts.io-ts/lib/Encoder.TypeOf<C[K_2]>}
    */ typings.ioTs.ioTsStrings.fromTuple & TopLevel[C]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTuple")(components.asInstanceOf[js.Any]).asInstanceOf[Codec[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof C ]: io-ts.io-ts/lib/Kleisli.InputOf<'Either', C[K]>}
    */ typings.ioTs.ioTsStrings.fromTuple & TopLevel[C], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof C ]: io-ts.io-ts/lib/Encoder.OutputOf<C[K_1]>}
    */ typings.ioTs.ioTsStrings.fromTuple & TopLevel[C], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_2 in keyof C ]: io-ts.io-ts/lib/Encoder.TypeOf<C[K_2]>}
    */ typings.ioTs.ioTsStrings.fromTuple & TopLevel[C]
  ]]
  
  @scala.inline
  def fromType[P /* <: Record[String, Codec[js.Any, js.Any, js.Any]] */](properties: P): Codec[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.InputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.fromType & TopLevel[P], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.fromType & TopLevel[P], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.fromType & TopLevel[P]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromType")(properties.asInstanceOf[js.Any]).asInstanceOf[Codec[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.InputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.fromType & TopLevel[P], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.fromType & TopLevel[P], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.fromType & TopLevel[P]
  ]]
  
  @scala.inline
  def imap[I, O, A, B](f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): js.Function1[/* fa */ Codec[I, O, A], Codec[I, O, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("imap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ Codec[I, O, A], Codec[I, O, B]]]
  
  @scala.inline
  def intersect[IB, OB, B](right: Codec[IB, OB, B]): js.Function1[
    /* left */ Codec[js.Any, js.Any, js.Any], 
    Codec[js.Any & IB, js.Any & OB, js.Any & B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(right.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* left */ Codec[js.Any, js.Any, js.Any], 
    Codec[js.Any & IB, js.Any & OB, js.Any & B]
  ]]
  
  @scala.inline
  def `lazy`[I, O, A](id: String, f: js.Function0[Codec[I, O, A]]): Codec[I, O, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(id.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Codec[I, O, A]]
  
  @scala.inline
  def literal[A /* <: Array[Literal] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
  ): Codec[
    js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(values.asInstanceOf[js.Any]).asInstanceOf[Codec[
    js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ]]
  
  @scala.inline
  def make[I, O, A](decoder: Decoder[I, A], encoder: Encoder[O, A]): Codec[I, O, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(decoder.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[Codec[I, O, A]]
  
  @scala.inline
  def mapLeftWithInput[I](f: js.Function2[/* i */ I, /* e */ DecodeError, DecodeError]): js.Function1[/* codec */ Codec[I, js.Any, js.Any], Codec[I, js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeftWithInput")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* codec */ Codec[I, js.Any, js.Any], Codec[I, js.Any, js.Any]]]
  
  @scala.inline
  def nullable[I, O, A](or: Codec[I, O, A]): Codec[Null | I, Null | O, Null | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(or.asInstanceOf[js.Any]).asInstanceOf[Codec[Null | I, Null | O, Null | A]]
  
  @JSImport("io-ts/lib/Codec", "number")
  @js.native
  val number: Codec[js.Any, Double, Double] = js.native
  
  @scala.inline
  def partial[P /* <: Record[String, Codec[js.Any, js.Any, js.Any]] */](properties: P): Codec[
    js.Any, 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[P]
    ], 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[P]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(properties.asInstanceOf[js.Any]).asInstanceOf[Codec[
    js.Any, 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[P]
    ], 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[P]
    ]
  ]]
  
  @scala.inline
  def record[O, A](codomain: Codec[js.Any, O, A]): Codec[js.Any, Record[String, O], Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("record")(codomain.asInstanceOf[js.Any]).asInstanceOf[Codec[js.Any, Record[String, O], Record[String, A]]]
  
  @scala.inline
  def refine[A, B /* <: A */](refinement: js.Function1[/* a */ A, /* is B */ Boolean], id: String): js.Function1[/* from */ Codec[js.Any, js.Any, A], Codec[js.Any, js.Any, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("refine")(refinement.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* from */ Codec[js.Any, js.Any, A], Codec[js.Any, js.Any, B]]]
  
  @JSImport("io-ts/lib/Codec", "string")
  @js.native
  val string: Codec[js.Any, String, String] = js.native
  
  @scala.inline
  def sum[T /* <: String */](tag: T): js.Function1[
    /* members */ Record[String, Codec[js.Any, js.Any, js.Any]], 
    Codec[
      js.Any, 
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<unknown, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<unknown, any, any>>] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<unknown, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<unknown, any, any>>] */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* members */ Record[String, Codec[js.Any, js.Any, js.Any]], 
    Codec[
      js.Any, 
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<unknown, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<unknown, any, any>>] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Codec.Codec<unknown, any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Codec.Codec<unknown, any, any>>] */ js.Any
      ]
    ]
  ]]
  
  @scala.inline
  def tuple[C /* <: js.Array[Codec[js.Any, js.Any, js.Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type C is not an array type */ components: C
  ): Codec[
    js.Any, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof C ]: io-ts.io-ts/lib/Codec.OutputOf<C[K]>}
    */ typings.ioTs.ioTsStrings.tuple & TopLevel[C], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof C ]: io-ts.io-ts/lib/Codec.TypeOf<C[K]>}
    */ typings.ioTs.ioTsStrings.tuple & TopLevel[C]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(components.asInstanceOf[js.Any]).asInstanceOf[Codec[
    js.Any, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof C ]: io-ts.io-ts/lib/Codec.OutputOf<C[K]>}
    */ typings.ioTs.ioTsStrings.tuple & TopLevel[C], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof C ]: io-ts.io-ts/lib/Codec.TypeOf<C[K]>}
    */ typings.ioTs.ioTsStrings.tuple & TopLevel[C]
  ]]
  
  @scala.inline
  def `type`[P /* <: Record[String, Codec[js.Any, js.Any, js.Any]] */](properties: P): Codec[
    js.Any, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[P], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[P]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(properties.asInstanceOf[js.Any]).asInstanceOf[Codec[
    js.Any, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[P], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Codec.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[P]
  ]]
  
  trait Codec[I, O, A]
    extends StObject
       with Kleisli[typings.fpTs.eitherMod.URI, I, DecodeError, A]
       with Encoder[O, A]
  object Codec {
    
    @scala.inline
    def apply[I, O, A](decode: I => js.Any, encode: A => O): Codec[I, O, A] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Codec[I, O, A]]
    }
  }
  
  type InputOf[C] = typings.ioTs.decoderMod.InputOf[C]
  
  type OutputOf[C] = typings.ioTs.encoderMod.OutputOf[C]
  
  type TypeOf[C] = typings.ioTs.encoderMod.TypeOf[C]
  
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind3[R, E, A] extends StObject
  }
}

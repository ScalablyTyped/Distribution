package typings.ioTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.altMod.Alt2
import typings.fpTs.categoryMod.Category2
import typings.fpTs.functionMod.Refinement
import typings.fpTs.functorMod.Functor2
import typings.fpTs.taskEitherMod.TaskEither_
import typings.ioTs.decoderMod.Decoder
import typings.ioTs.freeSemigroupMod.FreeSemigroup
import typings.ioTs.guardMod.Guard
import typings.ioTs.ioTsStrings.TaskEither
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

object taskDecoderMod {
  
  @JSImport("io-ts/lib/TaskDecoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "Alt")
  @js.native
  val Alt_ : Alt2[typings.ioTs.taskDecoderMod.URI] = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "Category")
  @js.native
  val Category: Category2[typings.ioTs.taskDecoderMod.URI] = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "Functor")
  @js.native
  val Functor: Functor2[typings.ioTs.taskDecoderMod.URI] = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "Schemable")
  @js.native
  val Schemable: Schemable2C[typings.ioTs.taskDecoderMod.URI, js.Any] = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "URI")
  @js.native
  val URI: /* "io-ts/TaskDecoder" */ String = js.native
  type URI = /* "io-ts/TaskDecoder" */ String
  
  @JSImport("io-ts/lib/TaskDecoder", "UnknownArray")
  @js.native
  val UnknownArray: TaskDecoder[js.Any, js.Array[js.Any]] = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "UnknownRecord")
  @js.native
  val UnknownRecord: TaskDecoder[js.Any, Record[String, js.Any]] = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "WithRefine")
  @js.native
  val WithRefine: WithRefine2C[typings.ioTs.taskDecoderMod.URI, js.Any] = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "WithUnion")
  @js.native
  val WithUnion: WithUnion2C[typings.ioTs.taskDecoderMod.URI, js.Any] = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "WithUnknownContainers")
  @js.native
  val WithUnknownContainers: WithUnknownContainers2C[typings.ioTs.taskDecoderMod.URI, js.Any] = js.native
  
  inline def alt[I, A](that: js.Function0[TaskDecoder[I, A]]): js.Function1[/* me */ TaskDecoder[I, A], TaskDecoder[I, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* me */ TaskDecoder[I, A], TaskDecoder[I, A]]]
  
  inline def array[A](item: TaskDecoder[js.Any, A]): TaskDecoder[js.Any, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(item.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[js.Any, js.Array[A]]]
  
  @JSImport("io-ts/lib/TaskDecoder", "boolean")
  @js.native
  val boolean: TaskDecoder[js.Any, Boolean] = js.native
  
  inline def compose[A, B](to: TaskDecoder[A, B]): js.Function1[/* from */ TaskDecoder[js.Any, A], TaskDecoder[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(to.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* from */ TaskDecoder[js.Any, A], TaskDecoder[js.Any, B]]]
  
  inline def draw(e: DecodeError): String = ^.asInstanceOf[js.Dynamic].applyDynamic("draw")(e.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def error(actual: js.Any, message: String): DecodeError = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[DecodeError]
  
  inline def failure[A](actual: js.Any, message: String): TaskEither_[FreeSemigroup[typings.ioTs.decodeErrorMod.DecodeError[String]], A] = (^.asInstanceOf[js.Dynamic].applyDynamic("failure")(actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[TaskEither_[FreeSemigroup[typings.ioTs.decodeErrorMod.DecodeError[String]], A]]
  
  inline def fromArray[I, A](item: TaskDecoder[I, A]): TaskDecoder[js.Array[I], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(item.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[js.Array[I], js.Array[A]]]
  
  inline def fromDecoder[I, A](decoder: Decoder[I, A]): TaskDecoder[I, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDecoder")(decoder.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[I, A]]
  
  inline def fromGuard[I, A /* <: I */](guard: Guard[I, A], expected: String): TaskDecoder[I, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGuard")(guard.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[TaskDecoder[I, A]]
  
  inline def fromPartial[P /* <: Record[String, TaskDecoder[js.Any, js.Any]] */](properties: P): TaskDecoder[
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'TaskEither', P[K]>}
    */ typings.ioTs.ioTsStrings.fromPartial & TopLevel[P]
    ], 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'TaskEither', P[K_1]>}
    */ typings.ioTs.ioTsStrings.fromPartial & TopLevel[P]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPartial")(properties.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'TaskEither', P[K]>}
    */ typings.ioTs.ioTsStrings.fromPartial & TopLevel[P]
    ], 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'TaskEither', P[K_1]>}
    */ typings.ioTs.ioTsStrings.fromPartial & TopLevel[P]
    ]
  ]]
  
  inline def fromRecord[I, A](codomain: TaskDecoder[I, A]): TaskDecoder[Record[String, I], Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRecord")(codomain.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[Record[String, I], Record[String, A]]]
  
  inline def fromRefinement[I, A /* <: I */](refinement: Refinement[I, A], expected: String): TaskDecoder[I, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRefinement")(refinement.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[TaskDecoder[I, A]]
  
  inline def fromSum[T /* <: String */](tag: T): js.Function1[
    /* members */ Record[String, TaskDecoder[js.Any, js.Any]], 
    TaskDecoder[
      typings.ioTs.kleisliMod.InputOf[
        TaskEither, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/TaskDecoder.TaskDecoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/TaskDecoder.TaskDecoder<any, any>>] */ js.Any
      ], 
      typings.ioTs.kleisliMod.TypeOf[
        TaskEither, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/TaskDecoder.TaskDecoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/TaskDecoder.TaskDecoder<any, any>>] */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* members */ Record[String, TaskDecoder[js.Any, js.Any]], 
    TaskDecoder[
      typings.ioTs.kleisliMod.InputOf[
        TaskEither, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/TaskDecoder.TaskDecoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/TaskDecoder.TaskDecoder<any, any>>] */ js.Any
      ], 
      typings.ioTs.kleisliMod.TypeOf[
        TaskEither, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/TaskDecoder.TaskDecoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/TaskDecoder.TaskDecoder<any, any>>] */ js.Any
      ]
    ]
  ]]
  
  inline def fromTuple[C /* <: js.Array[TaskDecoder[js.Any, js.Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type C is not an array type */ components: C
  ): TaskDecoder[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof C ]: io-ts.io-ts/lib/Kleisli.InputOf<'TaskEither', C[K]>}
    */ typings.ioTs.ioTsStrings.fromTuple & TopLevel[C], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof C ]: io-ts.io-ts/lib/Kleisli.TypeOf<'TaskEither', C[K_1]>}
    */ typings.ioTs.ioTsStrings.fromTuple & TopLevel[C]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTuple")(components.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof C ]: io-ts.io-ts/lib/Kleisli.InputOf<'TaskEither', C[K]>}
    */ typings.ioTs.ioTsStrings.fromTuple & TopLevel[C], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof C ]: io-ts.io-ts/lib/Kleisli.TypeOf<'TaskEither', C[K_1]>}
    */ typings.ioTs.ioTsStrings.fromTuple & TopLevel[C]
  ]]
  
  inline def fromType[P /* <: Record[String, TaskDecoder[js.Any, js.Any]] */](properties: P): TaskDecoder[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'TaskEither', P[K]>}
    */ typings.ioTs.ioTsStrings.fromType & TopLevel[P], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'TaskEither', P[K_1]>}
    */ typings.ioTs.ioTsStrings.fromType & TopLevel[P]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromType")(properties.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'TaskEither', P[K]>}
    */ typings.ioTs.ioTsStrings.fromType & TopLevel[P], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'TaskEither', P[K_1]>}
    */ typings.ioTs.ioTsStrings.fromType & TopLevel[P]
  ]]
  
  inline def id[A](): TaskDecoder[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[TaskDecoder[A, A]]
  
  inline def intersect[IB, B](right: TaskDecoder[IB, B]): js.Function1[/* left */ TaskDecoder[js.Any, js.Any], TaskDecoder[js.Any & IB, js.Any & B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(right.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* left */ TaskDecoder[js.Any, js.Any], TaskDecoder[js.Any & IB, js.Any & B]]]
  
  inline def `lazy`[I, A](id: String, f: js.Function0[TaskDecoder[I, A]]): TaskDecoder[I, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(id.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[TaskDecoder[I, A]]
  
  inline def literal[A /* <: Array[Literal] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
  ): TaskDecoder[
    js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(values.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[
    js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ TaskDecoder[js.Any, A], TaskDecoder[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskDecoder[js.Any, A], TaskDecoder[js.Any, B]]]
  
  inline def mapLeftWithInput[I](f: js.Function2[/* input */ I, /* e */ DecodeError, DecodeError]): js.Function1[/* decoder */ TaskDecoder[I, js.Any], TaskDecoder[I, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeftWithInput")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* decoder */ TaskDecoder[I, js.Any], TaskDecoder[I, js.Any]]]
  
  inline def nullable[I, A](or: TaskDecoder[I, A]): TaskDecoder[Null | I, Null | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(or.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[Null | I, Null | A]]
  
  @JSImport("io-ts/lib/TaskDecoder", "number")
  @js.native
  val number: TaskDecoder[js.Any, Double] = js.native
  
  inline def parse[A, B](parser: js.Function1[/* a */ A, TaskEither_[DecodeError, B]]): js.Function1[/* from */ TaskDecoder[js.Any, A], TaskDecoder[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(parser.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* from */ TaskDecoder[js.Any, A], TaskDecoder[js.Any, B]]]
  
  inline def partial[A](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/TaskDecoder.TaskDecoder<unknown, A[K]>}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[A]
  ): TaskDecoder[
    js.Any, 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof A ]: A[K_1]}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[A]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(properties.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[
    js.Any, 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof A ]: A[K_1]}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[A]
    ]
  ]]
  
  inline def record[A](codomain: TaskDecoder[js.Any, A]): TaskDecoder[js.Any, Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("record")(codomain.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[js.Any, Record[String, A]]]
  
  inline def refine[A, B /* <: A */](refinement: js.Function1[/* a */ A, /* is B */ Boolean], id: String): js.Function1[/* from */ TaskDecoder[js.Any, A], TaskDecoder[js.Any, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("refine")(refinement.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* from */ TaskDecoder[js.Any, A], TaskDecoder[js.Any, B]]]
  
  @JSImport("io-ts/lib/TaskDecoder", "string")
  @js.native
  val string: TaskDecoder[js.Any, String] = js.native
  
  inline def success[A](a: A): TaskEither_[DecodeError, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(a.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[DecodeError, A]]
  
  inline def sum[T /* <: String */](tag: T): js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: io-ts.io-ts/lib/TaskDecoder.TaskDecoder<unknown, any[K] & std.Record<T, K>>}
    */ /* members */ typings.ioTs.ioTsStrings.sum & TopLevel[js.Any], 
    TaskDecoder[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: io-ts.io-ts/lib/TaskDecoder.TaskDecoder<unknown, any[K] & std.Record<T, K>>}
    */ /* members */ typings.ioTs.ioTsStrings.sum & TopLevel[js.Any], 
    TaskDecoder[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ]]
  
  inline def tuple[A /* <: js.Array[js.Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: TaskDecoder<unknown, A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/TaskDecoder.TaskDecoder<unknown, A[K]>}
    */ typings.ioTs.ioTsStrings.tuple & TopLevel[A]
  ): TaskDecoder[js.Any, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(components.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[js.Any, A]]
  
  inline def `type`[A](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/TaskDecoder.TaskDecoder<unknown, A[K]>}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[A]
  ): TaskDecoder[
    js.Any, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof A ]: A[K_1]}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(properties.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[
    js.Any, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof A ]: A[K_1]}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[A]
  ]]
  
  inline def union[MS /* <: Array[TaskDecoder[js.Any, js.Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param members because its type MS is not an array type */ members: MS
  ): TaskDecoder[
    InputOf[
      /* import warning: importer.ImportType#apply Failed type conversion: MS[keyof MS] */ js.Any
    ], 
    TypeOf[
      /* import warning: importer.ImportType#apply Failed type conversion: MS[keyof MS] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(members.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[
    InputOf[
      /* import warning: importer.ImportType#apply Failed type conversion: MS[keyof MS] */ js.Any
    ], 
    TypeOf[
      /* import warning: importer.ImportType#apply Failed type conversion: MS[keyof MS] */ js.Any
    ]
  ]]
  
  inline def withMessage[I](message: js.Function2[/* input */ I, /* e */ DecodeError, String]): js.Function1[/* decoder */ TaskDecoder[I, js.Any], TaskDecoder[I, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withMessage")(message.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* decoder */ TaskDecoder[I, js.Any], TaskDecoder[I, js.Any]]]
  
  type DecodeError = typings.ioTs.decoderMod.DecodeError
  
  type InputOf[KTD] = typings.ioTs.kleisliMod.InputOf[typings.fpTs.taskEitherMod.URI, KTD]
  
  type TaskDecoder[I, A] = Kleisli[typings.fpTs.taskEitherMod.URI, I, DecodeError, A]
  
  type TypeOf[KTD] = typings.ioTs.kleisliMod.TypeOf[typings.fpTs.taskEitherMod.URI, KTD]
  
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind3[R, E, A] extends StObject
  }
}

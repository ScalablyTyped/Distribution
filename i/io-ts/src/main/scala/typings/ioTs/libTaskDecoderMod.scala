package typings.ioTs

import typings.fpTs.libAltMod.Alt2
import typings.fpTs.libCategoryMod.Category2
import typings.fpTs.libFunctionMod.Refinement
import typings.fpTs.libFunctorMod.Functor2
import typings.fpTs.libTaskEitherMod.TaskEither_
import typings.ioTs.ioTsStrings.TaskEither
import typings.ioTs.libDecoderMod.Decoder
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

object libTaskDecoderMod {
  
  @JSImport("io-ts/lib/TaskDecoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "Alt")
  @js.native
  val Alt_ : Alt2[typings.ioTs.libTaskDecoderMod.URI] = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "Category")
  @js.native
  val Category: Category2[typings.ioTs.libTaskDecoderMod.URI] = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "Functor")
  @js.native
  val Functor: Functor2[typings.ioTs.libTaskDecoderMod.URI] = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "Schemable")
  @js.native
  val Schemable: Schemable2C[typings.ioTs.libTaskDecoderMod.URI, Any] = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "URI")
  @js.native
  val URI: /* "io-ts/TaskDecoder" */ String = js.native
  type URI = /* "io-ts/TaskDecoder" */ String
  
  @JSImport("io-ts/lib/TaskDecoder", "UnknownArray")
  @js.native
  val UnknownArray: TaskDecoder[Any, js.Array[Any]] = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "UnknownRecord")
  @js.native
  val UnknownRecord: TaskDecoder[Any, Record[String, Any]] = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "WithRefine")
  @js.native
  val WithRefine: WithRefine2C[typings.ioTs.libTaskDecoderMod.URI, Any] = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "WithUnion")
  @js.native
  val WithUnion: WithUnion2C[typings.ioTs.libTaskDecoderMod.URI, Any] = js.native
  
  @JSImport("io-ts/lib/TaskDecoder", "WithUnknownContainers")
  @js.native
  val WithUnknownContainers: WithUnknownContainers2C[typings.ioTs.libTaskDecoderMod.URI, Any] = js.native
  
  inline def alt[I, A](that: js.Function0[TaskDecoder[I, A]]): js.Function1[/* me */ TaskDecoder[I, A], TaskDecoder[I, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* me */ TaskDecoder[I, A], TaskDecoder[I, A]]]
  
  inline def array[A](item: TaskDecoder[Any, A]): TaskDecoder[Any, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(item.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[Any, js.Array[A]]]
  
  @JSImport("io-ts/lib/TaskDecoder", "boolean")
  @js.native
  val boolean: TaskDecoder[Any, Boolean] = js.native
  
  inline def compose[A, B](to: TaskDecoder[A, B]): js.Function1[/* from */ TaskDecoder[Any, A], TaskDecoder[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(to.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* from */ TaskDecoder[Any, A], TaskDecoder[Any, B]]]
  
  inline def draw(e: DecodeError): String = ^.asInstanceOf[js.Dynamic].applyDynamic("draw")(e.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def error(actual: Any, message: String): DecodeError = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[DecodeError]
  
  inline def failure[A](actual: Any, message: String): TaskEither_[typings.ioTs.libDecoderMod.DecodeError, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("failure")(actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[TaskEither_[typings.ioTs.libDecoderMod.DecodeError, A]]
  
  inline def fromArray[I, A](item: TaskDecoder[I, A]): TaskDecoder[js.Array[I], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(item.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[js.Array[I], js.Array[A]]]
  
  inline def fromDecoder[I, A](decoder: Decoder[I, A]): TaskDecoder[I, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDecoder")(decoder.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[I, A]]
  
  inline def fromGuard[I, A /* <: I */](guard: Guard[I, A], expected: String): TaskDecoder[I, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGuard")(guard.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[TaskDecoder[I, A]]
  
  inline def fromPartial[P /* <: Record[String, TaskDecoder[Any, Any]] */](properties: P): TaskDecoder[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'TaskEither', P[K]>} */ js.Any
    ], 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'TaskEither', P[K_1]>} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPartial")(properties.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'TaskEither', P[K]>} */ js.Any
    ], 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'TaskEither', P[K_1]>} */ js.Any
    ]
  ]]
  
  inline def fromRecord[I, A](codomain: TaskDecoder[I, A]): TaskDecoder[Record[String, I], Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRecord")(codomain.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[Record[String, I], Record[String, A]]]
  
  inline def fromRefinement[I, A /* <: I */](refinement: Refinement[I, A], expected: String): TaskDecoder[I, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRefinement")(refinement.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[TaskDecoder[I, A]]
  
  inline def fromStruct[P /* <: Record[String, TaskDecoder[Any, Any]] */](properties: P): TaskDecoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'TaskEither', P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'TaskEither', P[K_1]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStruct")(properties.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'TaskEither', P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'TaskEither', P[K_1]>} */ js.Any
  ]]
  
  inline def fromSum[T /* <: String */](tag: T): js.Function1[
    /* members */ Record[String, TaskDecoder[Any, Any]], 
    TaskDecoder[
      typings.ioTs.libKleisliMod.InputOf[
        TaskEither, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/TaskDecoder.TaskDecoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/TaskDecoder.TaskDecoder<any, any>>] */ js.Any
      ], 
      typings.ioTs.libKleisliMod.TypeOf[
        TaskEither, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/TaskDecoder.TaskDecoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/TaskDecoder.TaskDecoder<any, any>>] */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* members */ Record[String, TaskDecoder[Any, Any]], 
    TaskDecoder[
      typings.ioTs.libKleisliMod.InputOf[
        TaskEither, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/TaskDecoder.TaskDecoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/TaskDecoder.TaskDecoder<any, any>>] */ js.Any
      ], 
      typings.ioTs.libKleisliMod.TypeOf[
        TaskEither, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/TaskDecoder.TaskDecoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/TaskDecoder.TaskDecoder<any, any>>] */ js.Any
      ]
    ]
  ]]
  
  inline def fromTuple[C /* <: js.Array[TaskDecoder[Any, Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type C is not an array type */ components: C
  ): TaskDecoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof C ]: io-ts.io-ts/lib/Kleisli.InputOf<'TaskEither', C[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof C ]: io-ts.io-ts/lib/Kleisli.TypeOf<'TaskEither', C[K_1]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTuple")(components.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof C ]: io-ts.io-ts/lib/Kleisli.InputOf<'TaskEither', C[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof C ]: io-ts.io-ts/lib/Kleisli.TypeOf<'TaskEither', C[K_1]>} */ js.Any
  ]]
  
  inline def fromType[P /* <: Record[String, TaskDecoder[Any, Any]] */](properties: P): TaskDecoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'TaskEither', P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'TaskEither', P[K_1]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromType")(properties.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Kleisli.InputOf<'TaskEither', P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof P ]: io-ts.io-ts/lib/Kleisli.TypeOf<'TaskEither', P[K_1]>} */ js.Any
  ]]
  
  inline def id[A](): TaskDecoder[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[TaskDecoder[A, A]]
  
  inline def intersect[IB, B](right: TaskDecoder[IB, B]): js.Function1[/* left */ TaskDecoder[Any, Any], TaskDecoder[Any & IB, Any & B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(right.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* left */ TaskDecoder[Any, Any], TaskDecoder[Any & IB, Any & B]]]
  
  inline def `lazy`[I, A](id: String, f: js.Function0[TaskDecoder[I, A]]): TaskDecoder[I, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(id.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[TaskDecoder[I, A]]
  
  inline def literal[A /* <: Array[L] */, L /* <: Literal */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
  ): TaskDecoder[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(values.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ TaskDecoder[Any, A], TaskDecoder[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskDecoder[Any, A], TaskDecoder[Any, B]]]
  
  inline def mapLeftWithInput[I](f: js.Function2[/* input */ I, /* e */ DecodeError, DecodeError]): js.Function1[/* decoder */ TaskDecoder[I, Any], TaskDecoder[I, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeftWithInput")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* decoder */ TaskDecoder[I, Any], TaskDecoder[I, Any]]]
  
  inline def nullable[I, A](or: TaskDecoder[I, A]): TaskDecoder[Null | I, Null | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(or.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[Null | I, Null | A]]
  
  @JSImport("io-ts/lib/TaskDecoder", "number")
  @js.native
  val number: TaskDecoder[Any, Double] = js.native
  
  inline def parse[A, B](parser: js.Function1[/* a */ A, TaskEither_[DecodeError, B]]): js.Function1[/* from */ TaskDecoder[Any, A], TaskDecoder[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(parser.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* from */ TaskDecoder[Any, A], TaskDecoder[Any, B]]]
  
  inline def partial[A](
    properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: io-ts.io-ts/lib/TaskDecoder.TaskDecoder<unknown, A[K]>} */ js.Any
  ): TaskDecoder[
    Any, 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(properties.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[
    Any, 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
    ]
  ]]
  
  inline def readonly[I, A](decoder: TaskDecoder[I, A]): TaskDecoder[I, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("readonly")(decoder.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[I, A]]
  
  inline def record[A](codomain: TaskDecoder[Any, A]): TaskDecoder[Any, Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("record")(codomain.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[Any, Record[String, A]]]
  
  inline def refine[A, B /* <: A */](refinement: Refinement[A, B], id: String): js.Function1[/* from */ TaskDecoder[Any, A], TaskDecoder[Any, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("refine")(refinement.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* from */ TaskDecoder[Any, A], TaskDecoder[Any, B]]]
  
  @JSImport("io-ts/lib/TaskDecoder", "string")
  @js.native
  val string: TaskDecoder[Any, String] = js.native
  
  inline def struct[A](
    properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: io-ts.io-ts/lib/TaskDecoder.TaskDecoder<unknown, A[K]>} */ js.Any
  ): TaskDecoder[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("struct")(properties.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
  ]]
  
  inline def success[A](a: A): TaskEither_[DecodeError, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(a.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[DecodeError, A]]
  
  inline def sum[T /* <: String */](tag: T): js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: io-ts.io-ts/lib/TaskDecoder.TaskDecoder<unknown, any[K] & std.Record<T, K>>} */ /* members */ js.Any, 
    TaskDecoder[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: io-ts.io-ts/lib/TaskDecoder.TaskDecoder<unknown, any[K] & std.Record<T, K>>} */ /* members */ js.Any, 
    TaskDecoder[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ]]
  
  inline def tuple[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: TaskDecoder<unknown, A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: io-ts.io-ts/lib/TaskDecoder.TaskDecoder<unknown, A[K]>} */ js.Any
  ): TaskDecoder[Any, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(components.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[Any, A]]
  
  inline def `type`[A](
    properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: io-ts.io-ts/lib/TaskDecoder.TaskDecoder<unknown, A[K]>} */ js.Any
  ): TaskDecoder[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(properties.asInstanceOf[js.Any]).asInstanceOf[TaskDecoder[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
  ]]
  
  inline def union[MS /* <: Array[TaskDecoder[Any, Any]] */](
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
  
  inline def withMessage[I](message: js.Function2[/* input */ I, /* e */ DecodeError, String]): js.Function1[/* decoder */ TaskDecoder[I, Any], TaskDecoder[I, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withMessage")(message.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* decoder */ TaskDecoder[I, Any], TaskDecoder[I, Any]]]
  
  type DecodeError = typings.ioTs.libDecoderMod.DecodeError
  
  type InputOf[KTD] = typings.ioTs.libKleisliMod.InputOf[typings.fpTs.libTaskEitherMod.URI, KTD]
  
  type TaskDecoder[I, A] = Kleisli[typings.fpTs.libTaskEitherMod.URI, I, DecodeError, A]
  
  type TypeOf[KTD] = typings.ioTs.libKleisliMod.TypeOf[typings.fpTs.libTaskEitherMod.URI, KTD]
  
  /* augmented module */
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}

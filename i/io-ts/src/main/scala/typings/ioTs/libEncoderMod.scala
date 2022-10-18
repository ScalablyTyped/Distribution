package typings.ioTs

import typings.fpTs.libCategoryMod.Category2
import typings.fpTs.libContravariantMod.Contravariant2
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEncoderMod {
  
  @JSImport("io-ts/lib/Encoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("io-ts/lib/Encoder", "Category")
  @js.native
  val Category: Category2[typings.ioTs.libEncoderMod.URI] = js.native
  
  @JSImport("io-ts/lib/Encoder", "Contravariant")
  @js.native
  val Contravariant: Contravariant2[typings.ioTs.libEncoderMod.URI] = js.native
  
  @JSImport("io-ts/lib/Encoder", "URI")
  @js.native
  val URI: /* "io-ts/Encoder" */ String = js.native
  type URI = /* "io-ts/Encoder" */ String
  
  inline def array[O, A](item: Encoder[O, A]): Encoder[js.Array[O], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(item.asInstanceOf[js.Any]).asInstanceOf[Encoder[js.Array[O], js.Array[A]]]
  
  inline def compose[E, A](ea: Encoder[E, A]): js.Function1[/* ab */ Encoder[A, Any], Encoder[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ea.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ab */ Encoder[A, Any], Encoder[E, Any]]]
  
  inline def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ Encoder[Any, A], Encoder[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("contramap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Encoder[Any, A], Encoder[Any, B]]]
  
  inline def id[A](): Encoder[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Encoder[A, A]]
  
  inline def intersect[P, B](right: Encoder[P, B]): js.Function1[/* left */ Encoder[Any, Any], Encoder[Any & P, Any & B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(right.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* left */ Encoder[Any, Any], Encoder[Any & P, Any & B]]]
  
  inline def `lazy`[O, A](f: js.Function0[Encoder[O, A]]): Encoder[O, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(f.asInstanceOf[js.Any]).asInstanceOf[Encoder[O, A]]
  
  inline def nullable[O, A](or: Encoder[O, A]): Encoder[Null | O, Null | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(or.asInstanceOf[js.Any]).asInstanceOf[Encoder[Null | O, Null | A]]
  
  inline def partial[P /* <: Record[String, Encoder[Any, Any]] */](properties: P): Encoder[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.OutputOf<P[K]>} */ js.Any
    ], 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.TypeOf<P[K]>} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(properties.asInstanceOf[js.Any]).asInstanceOf[Encoder[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.OutputOf<P[K]>} */ js.Any
    ], 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.TypeOf<P[K]>} */ js.Any
    ]
  ]]
  
  inline def readonly[O, A](decoder: Encoder[O, A]): Encoder[O, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("readonly")(decoder.asInstanceOf[js.Any]).asInstanceOf[Encoder[O, A]]
  
  inline def record[O, A](codomain: Encoder[O, A]): Encoder[Record[String, O], Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("record")(codomain.asInstanceOf[js.Any]).asInstanceOf[Encoder[Record[String, O], Record[String, A]]]
  
  inline def struct[P /* <: Record[String, Encoder[Any, Any]] */](properties: P): Encoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.OutputOf<P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.TypeOf<P[K]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("struct")(properties.asInstanceOf[js.Any]).asInstanceOf[Encoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.OutputOf<P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.TypeOf<P[K]>} */ js.Any
  ]]
  
  inline def sum[T /* <: String */](tag: T): js.Function1[
    /* members */ Record[String, Encoder[Any, Any]], 
    Encoder[
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Encoder.Encoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Encoder.Encoder<any, any>>] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Encoder.Encoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Encoder.Encoder<any, any>>] */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* members */ Record[String, Encoder[Any, Any]], 
    Encoder[
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Encoder.Encoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Encoder.Encoder<any, any>>] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Encoder.Encoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Encoder.Encoder<any, any>>] */ js.Any
      ]
    ]
  ]]
  
  inline def tuple[C /* <: js.Array[Encoder[Any, Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type C is not an array type */ components: C
  ): Encoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof C ]: io-ts.io-ts/lib/Encoder.OutputOf<C[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof C ]: io-ts.io-ts/lib/Encoder.TypeOf<C[K]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(components.asInstanceOf[js.Any]).asInstanceOf[Encoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof C ]: io-ts.io-ts/lib/Encoder.OutputOf<C[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof C ]: io-ts.io-ts/lib/Encoder.TypeOf<C[K]>} */ js.Any
  ]]
  
  inline def `type`[P /* <: Record[String, Encoder[Any, Any]] */](properties: P): Encoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.OutputOf<P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.TypeOf<P[K]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(properties.asInstanceOf[js.Any]).asInstanceOf[Encoder[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.OutputOf<P[K]>} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.TypeOf<P[K]>} */ js.Any
  ]]
  
  trait Encoder[O, A] extends StObject {
    
    def encode(a: A): O
  }
  object Encoder {
    
    inline def apply[O, A](encode: A => O): Encoder[O, A] = {
      val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Encoder[O, A]]
    }
    
    extension [Self <: Encoder[?, ?], O, A](x: Self & (Encoder[O, A])) {
      
      inline def setEncode(value: A => O): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    E extends io-ts.io-ts/lib/Encoder.Encoder<infer O, any> ? O : never
    }}}
    */
  @js.native
  trait OutputOf[E] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    E extends io-ts.io-ts/lib/Encoder.Encoder<any, infer A> ? A : never
    }}}
    */
  @js.native
  trait TypeOf[E] extends StObject
  
  /* augmented module */
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}

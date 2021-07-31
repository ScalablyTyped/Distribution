package typings.ioTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.categoryMod.Category2
import typings.fpTs.contravariantMod.Contravariant2
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encoderMod {
  
  @JSImport("io-ts/lib/Encoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("io-ts/lib/Encoder", "Category")
  @js.native
  val Category: Category2[typings.ioTs.encoderMod.URI] = js.native
  
  @JSImport("io-ts/lib/Encoder", "Contravariant")
  @js.native
  val Contravariant: Contravariant2[typings.ioTs.encoderMod.URI] = js.native
  
  @JSImport("io-ts/lib/Encoder", "URI")
  @js.native
  val URI: /* "io-ts/Encoder" */ String = js.native
  type URI = /* "io-ts/Encoder" */ String
  
  @scala.inline
  def array[O, A](item: Encoder[O, A]): Encoder[js.Array[O], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(item.asInstanceOf[js.Any]).asInstanceOf[Encoder[js.Array[O], js.Array[A]]]
  
  @scala.inline
  def compose[E, A](ea: Encoder[E, A]): js.Function1[/* ab */ Encoder[A, js.Any], Encoder[E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ea.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ab */ Encoder[A, js.Any], Encoder[E, js.Any]]]
  
  @scala.inline
  def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ Encoder[js.Any, A], Encoder[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("contramap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Encoder[js.Any, A], Encoder[js.Any, B]]]
  
  @scala.inline
  def id[A](): Encoder[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Encoder[A, A]]
  
  @scala.inline
  def intersect[P, B](right: Encoder[P, B]): js.Function1[/* left */ Encoder[js.Any, js.Any], Encoder[js.Any & P, js.Any & B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(right.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* left */ Encoder[js.Any, js.Any], Encoder[js.Any & P, js.Any & B]]]
  
  @scala.inline
  def `lazy`[O, A](f: js.Function0[Encoder[O, A]]): Encoder[O, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(f.asInstanceOf[js.Any]).asInstanceOf[Encoder[O, A]]
  
  @scala.inline
  def nullable[O, A](or: Encoder[O, A]): Encoder[Null | O, Null | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(or.asInstanceOf[js.Any]).asInstanceOf[Encoder[Null | O, Null | A]]
  
  @scala.inline
  def partial[P /* <: Record[String, Encoder[js.Any, js.Any]] */](properties: P): Encoder[
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[P]
    ], 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[P]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(properties.asInstanceOf[js.Any]).asInstanceOf[Encoder[
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[P]
    ], 
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[P]
    ]
  ]]
  
  @scala.inline
  def record[O, A](codomain: Encoder[O, A]): Encoder[Record[String, O], Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("record")(codomain.asInstanceOf[js.Any]).asInstanceOf[Encoder[Record[String, O], Record[String, A]]]
  
  @scala.inline
  def sum[T /* <: String */](tag: T): js.Function1[
    /* members */ Record[String, Encoder[js.Any, js.Any]], 
    Encoder[
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Encoder.Encoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Encoder.Encoder<any, any>>] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Encoder.Encoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Encoder.Encoder<any, any>>] */ js.Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* members */ Record[String, Encoder[js.Any, js.Any]], 
    Encoder[
      OutputOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Encoder.Encoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Encoder.Encoder<any, any>>] */ js.Any
      ], 
      TypeOf[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Record<string, io-ts.io-ts/lib/Encoder.Encoder<any, any>>[keyof std.Record<string, io-ts.io-ts/lib/Encoder.Encoder<any, any>>] */ js.Any
      ]
    ]
  ]]
  
  @scala.inline
  def tuple[C /* <: js.Array[Encoder[js.Any, js.Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type C is not an array type */ components: C
  ): Encoder[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof C ]: io-ts.io-ts/lib/Encoder.OutputOf<C[K]>}
    */ typings.ioTs.ioTsStrings.tuple & TopLevel[C], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof C ]: io-ts.io-ts/lib/Encoder.TypeOf<C[K]>}
    */ typings.ioTs.ioTsStrings.tuple & TopLevel[C]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(components.asInstanceOf[js.Any]).asInstanceOf[Encoder[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof C ]: io-ts.io-ts/lib/Encoder.OutputOf<C[K]>}
    */ typings.ioTs.ioTsStrings.tuple & TopLevel[C], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof C ]: io-ts.io-ts/lib/Encoder.TypeOf<C[K]>}
    */ typings.ioTs.ioTsStrings.tuple & TopLevel[C]
  ]]
  
  @scala.inline
  def `type`[P /* <: Record[String, Encoder[js.Any, js.Any]] */](properties: P): Encoder[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[P], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[P]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(properties.asInstanceOf[js.Any]).asInstanceOf[Encoder[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.OutputOf<P[K]>}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[P], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof P ]: io-ts.io-ts/lib/Encoder.TypeOf<P[K]>}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[P]
  ]]
  
  trait Encoder[O, A] extends StObject {
    
    def encode(a: A): O
  }
  object Encoder {
    
    @scala.inline
    def apply[O, A](encode: A => O): Encoder[O, A] = {
      val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Encoder[O, A]]
    }
    
    @scala.inline
    implicit class EncoderMutableBuilder[Self <: Encoder[?, ?], O, A] (val x: Self & (Encoder[O, A])) extends AnyVal {
      
      @scala.inline
      def setEncode(value: A => O): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  type OutputOf[E] = js.Any
  
  type TypeOf[E] = js.Any
  
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind3[R, E, A] extends StObject
  }
}

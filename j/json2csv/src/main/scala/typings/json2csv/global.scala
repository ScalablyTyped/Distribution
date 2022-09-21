package typings.json2csv

import typings.json2csv.mod.FlattenOptions
import typings.json2csv.mod.Json2CsvTransform
import typings.json2csv.mod.Options
import typings.json2csv.mod.UnwindOptions
import typings.node.streamMod.Readable
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object json2csv {
    
    @JSGlobal("json2csv")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("json2csv.AsyncParser")
    @js.native
    open class AsyncParser[T] ()
      extends typings.json2csv.mod.AsyncParser[T] {
      def this(opts: Options[T]) = this()
      def this(opts: Unit, transformOpts: TransformOptions) = this()
      def this(opts: Options[T], transformOpts: TransformOptions) = this()
    }
    
    @JSGlobal("json2csv.Parser")
    @js.native
    open class Parser[T] ()
      extends typings.json2csv.mod.Parser[T]
    
    @JSGlobal("json2csv.Transform")
    @js.native
    // implements JSON2CSVBase<T>
    open class Transform[T] ()
      extends typings.json2csv.mod.Transform[T] {
      def this(opts: Options[T]) = this()
      def this(opts: Unit, transformOpts: TransformOptions) = this()
      def this(opts: Options[T], transformOpts: TransformOptions) = this()
    }
    
    inline def parse[T](data: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def parse[T](data: T, opts: Options[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def parse[T](data: js.Array[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def parse[T](data: js.Array[T], opts: Options[T]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def parseAsync[T](data: T): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def parseAsync[T](data: T, opts: Unit, transformOpts: TransformOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], transformOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def parseAsync[T](data: T, opts: Options[T]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def parseAsync[T](data: T, opts: Options[T], transformOpts: TransformOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], transformOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def parseAsync[T](data: js.Array[T]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def parseAsync[T](data: js.Array[T], opts: Unit, transformOpts: TransformOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], transformOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def parseAsync[T](data: js.Array[T], opts: Options[T]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def parseAsync[T](data: js.Array[T], opts: Options[T], transformOpts: TransformOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], transformOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def parseAsync[T](data: Readable): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def parseAsync[T](data: Readable, opts: Unit, transformOpts: TransformOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], transformOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def parseAsync[T](data: Readable, opts: Options[T]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def parseAsync[T](data: Readable, opts: Options[T], transformOpts: TransformOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAsync")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], transformOpts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    object transforms {
      
      @JSGlobal("json2csv.transforms")
      @js.native
      val ^ : js.Any = js.native
      
      inline def flatten(): Json2CsvTransform[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[Json2CsvTransform[Any, Any]]
      inline def flatten(options: FlattenOptions): Json2CsvTransform[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(options.asInstanceOf[js.Any]).asInstanceOf[Json2CsvTransform[Any, Any]]
      @JSGlobal("json2csv.transforms.flatten")
      @js.native
      def flatten_Ftransforms: js.Function1[/* options */ js.UndefOr[FlattenOptions], Json2CsvTransform[Any, Any]] = js.native
      
      inline def flatten_Ftransforms_=(x: js.Function1[/* options */ js.UndefOr[FlattenOptions], Json2CsvTransform[Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flatten")(x.asInstanceOf[js.Any])
      
      inline def unwind(): Json2CsvTransform[Any, js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwind")().asInstanceOf[Json2CsvTransform[Any, js.Array[Any]]]
      inline def unwind(options: UnwindOptions): Json2CsvTransform[Any, js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwind")(options.asInstanceOf[js.Any]).asInstanceOf[Json2CsvTransform[Any, js.Array[Any]]]
      @JSGlobal("json2csv.transforms.unwind")
      @js.native
      def unwind_Ftransforms: js.Function1[/* options */ js.UndefOr[UnwindOptions], Json2CsvTransform[Any, js.Array[Any]]] = js.native
      
      inline def unwind_Ftransforms_=(x: js.Function1[/* options */ js.UndefOr[UnwindOptions], Json2CsvTransform[Any, js.Array[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unwind")(x.asInstanceOf[js.Any])
    }
  }
}

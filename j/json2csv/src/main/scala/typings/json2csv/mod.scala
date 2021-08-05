package typings.json2csv

import typings.json2csv.baseMod.Json2CsvTransform
import typings.json2csv.flattenMod.FlattenOptions
import typings.json2csv.json2csvasyncparserMod.default
import typings.json2csv.json2csvbaseMod.json2csv.Options
import typings.json2csv.unwindMod.UnwindOptions
import typings.node.streamMod.Readable
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json2csv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("json2csv", "AsyncParser")
  @js.native
  class AsyncParser[T] () extends default[T] {
    def this(opts: Options[T]) = this()
    def this(opts: Unit, transformOpts: TransformOptions) = this()
    def this(opts: Options[T], transformOpts: TransformOptions) = this()
  }
  
  @JSImport("json2csv", "Parser")
  @js.native
  class Parser[T] ()
    extends typings.json2csv.json2csvparserMod.default[T]
  
  @JSImport("json2csv", "Transform")
  @js.native
  // implements JSON2CSVBase<T>
  class Transform[T] ()
    extends typings.json2csv.json2csvtransformMod.default[T] {
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
    
    @JSImport("json2csv", "transforms")
    @js.native
    val ^ : js.Any = js.native
    
    inline def flatten(): Json2CsvTransform[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[Json2CsvTransform[js.Any, js.Any]]
    inline def flatten(options: FlattenOptions): Json2CsvTransform[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(options.asInstanceOf[js.Any]).asInstanceOf[Json2CsvTransform[js.Any, js.Any]]
    
    inline def unwind(): Json2CsvTransform[js.Any, js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwind")().asInstanceOf[Json2CsvTransform[js.Any, js.Array[js.Any]]]
    inline def unwind(options: UnwindOptions): Json2CsvTransform[js.Any, js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwind")(options.asInstanceOf[js.Any]).asInstanceOf[Json2CsvTransform[js.Any, js.Array[js.Any]]]
  }
}

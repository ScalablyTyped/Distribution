package typings.json2csv

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
  open class AsyncParser[T] ()
    extends typings.json2csv.json2csvasyncparserMod.^[T] {
    def this(opts: Options[T]) = this()
    def this(opts: Unit, transformOpts: TransformOptions) = this()
    def this(opts: Options[T], transformOpts: TransformOptions) = this()
  }
  
  @JSImport("json2csv", "Parser")
  @js.native
  open class Parser[T] ()
    extends typings.json2csv.json2csvparserMod.^[T]
  
  @JSImport("json2csv", "Transform")
  @js.native
  // implements JSON2CSVBase<T>
  open class Transform[T] ()
    extends typings.json2csv.json2csvtransformMod.^[T] {
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
    
    inline def flatten(): Json2CsvTransform[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[Json2CsvTransform[Any, Any]]
    inline def flatten(options: FlattenOptions): Json2CsvTransform[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(options.asInstanceOf[js.Any]).asInstanceOf[Json2CsvTransform[Any, Any]]
    @JSImport("json2csv", "transforms.flatten")
    @js.native
    def flatten_Ftransforms: js.Function1[/* options */ js.UndefOr[FlattenOptions], Json2CsvTransform[Any, Any]] = js.native
    
    inline def flatten_Ftransforms_=(x: js.Function1[/* options */ js.UndefOr[FlattenOptions], Json2CsvTransform[Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flatten")(x.asInstanceOf[js.Any])
    
    inline def unwind(): Json2CsvTransform[Any, js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwind")().asInstanceOf[Json2CsvTransform[Any, js.Array[Any]]]
    inline def unwind(options: UnwindOptions): Json2CsvTransform[Any, js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwind")(options.asInstanceOf[js.Any]).asInstanceOf[Json2CsvTransform[Any, js.Array[Any]]]
    @JSImport("json2csv", "transforms.unwind")
    @js.native
    def unwind_Ftransforms: js.Function1[/* options */ js.UndefOr[UnwindOptions], Json2CsvTransform[Any, js.Array[Any]]] = js.native
    
    inline def unwind_Ftransforms_=(x: js.Function1[/* options */ js.UndefOr[UnwindOptions], Json2CsvTransform[Any, js.Array[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unwind")(x.asInstanceOf[js.Any])
  }
  
  trait FieldInfo[T] extends StObject {
    
    var default: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var value: String | FieldValueCallback[T]
  }
  object FieldInfo {
    
    inline def apply[T](value: String | FieldValueCallback[T]): FieldInfo[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldInfo[T]]
    }
    
    extension [Self <: FieldInfo[?], T](x: Self & FieldInfo[T]) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String | FieldValueCallback[T]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFunction1(value: T => Any): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueFunction2(value: (T, /* field */ FieldValueCallbackInfo) => Any): Self = StObject.set(x, "value", js.Any.fromFunction2(value))
    }
  }
  
  type FieldValueCallback[T] = FieldValueCallbackWithoutField[T] | FieldValueCallbackWithField[T]
  
  trait FieldValueCallbackInfo extends StObject {
    
    var default: js.UndefOr[String] = js.undefined
    
    var label: String
  }
  object FieldValueCallbackInfo {
    
    inline def apply(label: String): FieldValueCallbackInfo = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldValueCallbackInfo]
    }
    
    extension [Self <: FieldValueCallbackInfo](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  type FieldValueCallbackWithField[T] = js.Function2[/* row */ T, /* field */ FieldValueCallbackInfo, Any]
  
  type FieldValueCallbackWithoutField[T] = js.Function1[/* row */ T, Any]
  
  trait FlattenOptions extends StObject {
    
    var arrays: js.UndefOr[Boolean] = js.undefined
    
    var objects: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object FlattenOptions {
    
    inline def apply(): FlattenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlattenOptions]
    }
    
    extension [Self <: FlattenOptions](x: Self) {
      
      inline def setArrays(value: Boolean): Self = StObject.set(x, "arrays", value.asInstanceOf[js.Any])
      
      inline def setArraysUndefined: Self = StObject.set(x, "arrays", js.undefined)
      
      inline def setObjects(value: Boolean): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  type Json2CsvTransform[T1, T2] = js.Function1[/* item */ T1, T2 | js.Array[T2]]
  
  trait NormalizedFieldInfo[T] extends StObject {
    
    var label: String
    
    var value: FieldValueCallback[T]
  }
  object NormalizedFieldInfo {
    
    inline def apply[T](label: String, value: FieldValueCallback[T]): NormalizedFieldInfo[T] = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedFieldInfo[T]]
    }
    
    extension [Self <: NormalizedFieldInfo[?], T](x: Self & NormalizedFieldInfo[T]) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: FieldValueCallback[T]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFunction1(value: T => Any): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueFunction2(value: (T, /* field */ FieldValueCallbackInfo) => Any): Self = StObject.set(x, "value", js.Any.fromFunction2(value))
    }
  }
  
  trait Options[T] extends StObject {
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    var eol: js.UndefOr[String] = js.undefined
    
    var escapedQuote: js.UndefOr[String] = js.undefined
    
    var excelStrings: js.UndefOr[Boolean] = js.undefined
    
    var fields: js.UndefOr[js.Array[String | FieldInfo[T]]] = js.undefined
    
    var header: js.UndefOr[Boolean] = js.undefined
    
    var includeEmptyRows: js.UndefOr[Boolean] = js.undefined
    
    var ndjson: js.UndefOr[Boolean] = js.undefined
    
    var quote: js.UndefOr[String] = js.undefined
    
    var transforms: js.UndefOr[js.Array[Json2CsvTransform[Any, Any]]] = js.undefined
    
    var withBOM: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T](x: Self & Options[T]) {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setEscapedQuote(value: String): Self = StObject.set(x, "escapedQuote", value.asInstanceOf[js.Any])
      
      inline def setEscapedQuoteUndefined: Self = StObject.set(x, "escapedQuote", js.undefined)
      
      inline def setExcelStrings(value: Boolean): Self = StObject.set(x, "excelStrings", value.asInstanceOf[js.Any])
      
      inline def setExcelStringsUndefined: Self = StObject.set(x, "excelStrings", js.undefined)
      
      inline def setFields(value: js.Array[String | FieldInfo[T]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: (String | FieldInfo[T])*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIncludeEmptyRows(value: Boolean): Self = StObject.set(x, "includeEmptyRows", value.asInstanceOf[js.Any])
      
      inline def setIncludeEmptyRowsUndefined: Self = StObject.set(x, "includeEmptyRows", js.undefined)
      
      inline def setNdjson(value: Boolean): Self = StObject.set(x, "ndjson", value.asInstanceOf[js.Any])
      
      inline def setNdjsonUndefined: Self = StObject.set(x, "ndjson", js.undefined)
      
      inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setTransforms(value: js.Array[Json2CsvTransform[Any, Any]]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      inline def setTransformsVarargs(value: (Json2CsvTransform[Any, Any])*): Self = StObject.set(x, "transforms", js.Array(value*))
      
      inline def setWithBOM(value: Boolean): Self = StObject.set(x, "withBOM", value.asInstanceOf[js.Any])
      
      inline def setWithBOMUndefined: Self = StObject.set(x, "withBOM", js.undefined)
    }
  }
  
  trait UnwindOptions extends StObject {
    
    var blankOut: js.UndefOr[Boolean] = js.undefined
    
    var paths: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnwindOptions {
    
    inline def apply(): UnwindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnwindOptions]
    }
    
    extension [Self <: UnwindOptions](x: Self) {
      
      inline def setBlankOut(value: Boolean): Self = StObject.set(x, "blankOut", value.asInstanceOf[js.Any])
      
      inline def setBlankOutUndefined: Self = StObject.set(x, "blankOut", js.undefined)
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    }
  }
}

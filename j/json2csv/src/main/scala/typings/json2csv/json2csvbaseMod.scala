package typings.json2csv

import typings.json2csv.baseMod.Json2CsvTransform
import typings.json2csv.json2csvbaseMod.json2csv.FieldInfo
import typings.json2csv.json2csvbaseMod.json2csv.NormalizedFieldInfo
import typings.json2csv.json2csvbaseMod.json2csv.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object json2csvbaseMod {
  
  @JSImport("json2csv/JSON2CSVBase", JSImport.Default)
  @js.native
  abstract class default[T] () extends JSON2CSVBase[T] {
    def this(opts: Options[T]) = this()
  }
  
  @js.native
  trait JSON2CSVBase[T] extends StObject {
    
    /**
      * Create the title row with all the provided fields as column headings
      *
      * @returns {string} titles as a string
      */
    /* protected */ def getHeader(): String = js.native
    
    /**
      * Check and normalize the fields configuration.
      *
      * @param {(string|json2csv.FieldInfo)[]} fields Fields configuration provided by the user
      * or inferred from the data
      * @returns {json2csv.NormalizedFieldInfo} preprocessed FieldsInfo array
      */
    def preprocessFieldsInfo[T](fields: js.Array[String | FieldInfo[T]]): js.Array[NormalizedFieldInfo[T]] = js.native
    
    /**
      * Check passing opts and set defaults.
      *
      * @param {json2csv.Options} opts Options object containing fields,
      * delimiter, default value, quote mark, header, etc.
      * @returns {json2csv.Options} preprocessed Options object
      */
    /* protected */ def preprocessOpts(): Options[T] = js.native
    /* protected */ def preprocessOpts(opts: Options[T]): Options[T] = js.native
    
    /**
      * Preprocess each object according to the give opts (unwind, flatten, etc.).
      *
      * @param {object} row JSON object to be converted in a CSV row
      */
    /* protected */ def preprocessRow(row: T): js.Object = js.native
    
    /**
      * Create the content of a specfic CSV row cell
      *
      * @param {object} row JSON object representing the  CSV row that the cell belongs to
      * @param {object} fieldInfo Details of the field to process to be a CSV cell
      * @returns {string} CSV string (cell)
      */
    /* protected */ def processCell(row: T, fieldInfo: NormalizedFieldInfo[T]): String = js.native
    
    /**
      * Create the content of a specific CSV row
      *
      * @param {object} row JSON object to be converted in a CSV row
      * @returns {string} CSV string (row)
      */
    /* protected */ def processRow(row: T): String = js.native
    
    /**
      * Create the content of a specfic CSV row cell
      *
      * @param {any} value Value to be included in a CSV cell
      * @returns {string} Value stringified and processed
      */
    /* protected */ def processValue(value: js.Any): String = js.native
  }
  
  object json2csv {
    
    @js.native
    trait FieldInfo[T] extends StObject {
      
      var default: js.UndefOr[String] = js.native
      
      var label: js.UndefOr[String] = js.native
      
      var value: String | FieldValueCallback[T] = js.native
    }
    object FieldInfo {
      
      @scala.inline
      def apply[T](value: String | FieldValueCallback[T]): FieldInfo[T] = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[FieldInfo[T]]
      }
      
      @scala.inline
      implicit class FieldInfoMutableBuilder[Self <: FieldInfo[_], T] (val x: Self with FieldInfo[T]) extends AnyVal {
        
        @scala.inline
        def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setValue(value: String | FieldValueCallback[T]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueFunction1(value: T => js.Any): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
        
        @scala.inline
        def setValueFunction2(value: (T, /* field */ FieldValueCallbackInfo) => js.Any): Self = StObject.set(x, "value", js.Any.fromFunction2(value))
      }
    }
    
    type FieldValueCallback[T] = FieldValueCallbackWithoutField[T] | FieldValueCallbackWithField[T]
    
    @js.native
    trait FieldValueCallbackInfo extends StObject {
      
      var default: js.UndefOr[String] = js.native
      
      var label: String = js.native
    }
    object FieldValueCallbackInfo {
      
      @scala.inline
      def apply(label: String): FieldValueCallbackInfo = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[FieldValueCallbackInfo]
      }
      
      @scala.inline
      implicit class FieldValueCallbackInfoMutableBuilder[Self <: FieldValueCallbackInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      }
    }
    
    type FieldValueCallbackWithField[T] = js.Function2[/* row */ T, /* field */ FieldValueCallbackInfo, js.Any]
    
    type FieldValueCallbackWithoutField[T] = js.Function1[/* row */ T, js.Any]
    
    @js.native
    trait NormalizedFieldInfo[T] extends StObject {
      
      var label: String = js.native
      
      var value: FieldValueCallback[T] = js.native
    }
    object NormalizedFieldInfo {
      
      @scala.inline
      def apply[T](label: String, value: FieldValueCallback[T]): NormalizedFieldInfo[T] = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[NormalizedFieldInfo[T]]
      }
      
      @scala.inline
      implicit class NormalizedFieldInfoMutableBuilder[Self <: NormalizedFieldInfo[_], T] (val x: Self with NormalizedFieldInfo[T]) extends AnyVal {
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: FieldValueCallback[T]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueFunction1(value: T => js.Any): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
        
        @scala.inline
        def setValueFunction2(value: (T, /* field */ FieldValueCallbackInfo) => js.Any): Self = StObject.set(x, "value", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait Options[T] extends StObject {
      
      var defaultValue: js.UndefOr[String] = js.native
      
      var delimiter: js.UndefOr[String] = js.native
      
      var eol: js.UndefOr[String] = js.native
      
      var escapedQuote: js.UndefOr[String] = js.native
      
      var excelStrings: js.UndefOr[Boolean] = js.native
      
      var fields: js.UndefOr[js.Array[String | FieldInfo[T]]] = js.native
      
      var header: js.UndefOr[Boolean] = js.native
      
      var includeEmptyRows: js.UndefOr[Boolean] = js.native
      
      var ndjson: js.UndefOr[Boolean] = js.native
      
      var quote: js.UndefOr[String] = js.native
      
      var transforms: js.UndefOr[js.Array[Json2CsvTransform[_, _]]] = js.native
      
      var withBOM: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply[T](): Options[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options[T]]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
        
        @scala.inline
        def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
        
        @scala.inline
        def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
        
        @scala.inline
        def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
        
        @scala.inline
        def setEscapedQuote(value: String): Self = StObject.set(x, "escapedQuote", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEscapedQuoteUndefined: Self = StObject.set(x, "escapedQuote", js.undefined)
        
        @scala.inline
        def setExcelStrings(value: Boolean): Self = StObject.set(x, "excelStrings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExcelStringsUndefined: Self = StObject.set(x, "excelStrings", js.undefined)
        
        @scala.inline
        def setFields(value: js.Array[String | FieldInfo[T]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setFieldsVarargs(value: (String | FieldInfo[T])*): Self = StObject.set(x, "fields", js.Array(value :_*))
        
        @scala.inline
        def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
        
        @scala.inline
        def setIncludeEmptyRows(value: Boolean): Self = StObject.set(x, "includeEmptyRows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIncludeEmptyRowsUndefined: Self = StObject.set(x, "includeEmptyRows", js.undefined)
        
        @scala.inline
        def setNdjson(value: Boolean): Self = StObject.set(x, "ndjson", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNdjsonUndefined: Self = StObject.set(x, "ndjson", js.undefined)
        
        @scala.inline
        def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
        
        @scala.inline
        def setTransforms(value: js.Array[Json2CsvTransform[_, _]]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
        
        @scala.inline
        def setTransformsVarargs(value: (Json2CsvTransform[js.Any, js.Any])*): Self = StObject.set(x, "transforms", js.Array(value :_*))
        
        @scala.inline
        def setWithBOM(value: Boolean): Self = StObject.set(x, "withBOM", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWithBOMUndefined: Self = StObject.set(x, "withBOM", js.undefined)
      }
    }
  }
}

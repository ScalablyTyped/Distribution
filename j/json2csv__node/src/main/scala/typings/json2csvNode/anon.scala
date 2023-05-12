package typings.json2csvNode

import typings.json2csvPlainjs.anon.RequiredOptions
import typings.json2csvPlainjs.srcBaseParserMod.Options
import typings.json2csvPlainjs.srcMod.Field
import typings.json2csvPlainjs.srcMod.Formatters
import typings.json2csvPlainjs.srcStreamParserMod.AsyncOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): RequiredOptions = js.native
    def apply(opts: Options): RequiredOptions = js.native
  }
  
  @js.native
  trait FnCallAsyncOpts extends StObject {
    
    def apply(): Any = js.native
    def apply(asyncOpts: AsyncOptions): Any = js.native
  }
  
  @js.native
  trait FnCallOptsAsyncOpts extends StObject {
    
    def apply(): Unit = js.native
    def apply(opts: Unit, asyncOpts: AsyncOptions): Unit = js.native
    def apply(opts: Options): Unit = js.native
    def apply(opts: Options, asyncOpts: AsyncOptions): Unit = js.native
  }
  
  @js.native
  trait FnCallRow extends StObject {
    
    def apply(): js.UndefOr[String] = js.native
    def apply(row: js.Array[Any]): js.UndefOr[String] = js.native
  }
  
  /* Inlined std.Required<@json2csv/plainjs.@json2csv/plainjs.StreamOptions> */
  trait RequiredStreamOptions extends StObject {
    
    var defaultValue: String
    
    var delimiter: String
    
    var eol: String
    
    var fields: js.Array[Field]
    
    var formatters: Formatters
    
    var header: Boolean
    
    var includeEmptyRows: Boolean
    
    var ndjson: Boolean
    
    var transforms: js.Array[js.Function1[/* dataRow */ Any, Any]]
    
    var withBOM: Boolean
  }
  object RequiredStreamOptions {
    
    inline def apply(
      defaultValue: String,
      delimiter: String,
      eol: String,
      fields: js.Array[Field],
      formatters: Formatters,
      header: Boolean,
      includeEmptyRows: Boolean,
      ndjson: Boolean,
      transforms: js.Array[js.Function1[/* dataRow */ Any, Any]],
      withBOM: Boolean
    ): RequiredStreamOptions = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], eol = eol.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], formatters = formatters.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], includeEmptyRows = includeEmptyRows.asInstanceOf[js.Any], ndjson = ndjson.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any], withBOM = withBOM.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredStreamOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredStreamOptions] (val x: Self) extends AnyVal {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setFormatters(value: Formatters): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setIncludeEmptyRows(value: Boolean): Self = StObject.set(x, "includeEmptyRows", value.asInstanceOf[js.Any])
      
      inline def setNdjson(value: Boolean): Self = StObject.set(x, "ndjson", value.asInstanceOf[js.Any])
      
      inline def setTransforms(value: js.Array[js.Function1[/* dataRow */ Any, Any]]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsVarargs(value: (js.Function1[/* dataRow */ Any, Any])*): Self = StObject.set(x, "transforms", js.Array(value*))
      
      inline def setWithBOM(value: Boolean): Self = StObject.set(x, "withBOM", value.asInstanceOf[js.Any])
    }
  }
}

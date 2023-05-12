package typings.json2csvPlainjs

import typings.json2csvPlainjs.srcMod.Field
import typings.json2csvPlainjs.srcMod.Formatters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait End extends StObject {
    
    def end(): Unit
    
    def write(data: Any): Unit
  }
  object End {
    
    inline def apply(end: () => Unit, write: Any => Unit): End = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setWrite(value: Any => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Required<@json2csv/plainjs.@json2csv/plainjs/src/BaseParser.Options> */
  trait RequiredOptions extends StObject {
    
    var defaultValue: String
    
    var delimiter: String
    
    var eol: String
    
    var fields: js.Array[Field]
    
    var formatters: Formatters
    
    var header: Boolean
    
    var includeEmptyRows: Boolean
    
    var transforms: js.Array[js.Function1[/* dataRow */ Any, Any]]
    
    var withBOM: Boolean
  }
  object RequiredOptions {
    
    inline def apply(
      defaultValue: String,
      delimiter: String,
      eol: String,
      fields: js.Array[Field],
      formatters: Formatters,
      header: Boolean,
      includeEmptyRows: Boolean,
      transforms: js.Array[js.Function1[/* dataRow */ Any, Any]],
      withBOM: Boolean
    ): RequiredOptions = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], eol = eol.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], formatters = formatters.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], includeEmptyRows = includeEmptyRows.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any], withBOM = withBOM.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiredOptions] (val x: Self) extends AnyVal {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setFormatters(value: Formatters): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setIncludeEmptyRows(value: Boolean): Self = StObject.set(x, "includeEmptyRows", value.asInstanceOf[js.Any])
      
      inline def setTransforms(value: js.Array[js.Function1[/* dataRow */ Any, Any]]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsVarargs(value: (js.Function1[/* dataRow */ Any, Any])*): Self = StObject.set(x, "transforms", js.Array(value*))
      
      inline def setWithBOM(value: Boolean): Self = StObject.set(x, "withBOM", value.asInstanceOf[js.Any])
    }
  }
}

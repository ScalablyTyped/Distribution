package typings.json2csvPlainjs

import typings.json2csvPlainjs.anon.RequiredOptions
import typings.json2csvPlainjs.srcMod.Field
import typings.json2csvPlainjs.srcMod.FieldObject
import typings.json2csvPlainjs.srcMod.Formatters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBaseParserMod {
  
  @JSImport("@json2csv/plainjs/src/BaseParser", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with JSON2CSVBase {
    def this(opts: Options) = this()
  }
  
  @js.native
  trait JSON2CSVBase extends StObject {
    
    def getHeader(): String = js.native
    
    var opts: RequiredOptions = js.native
    
    def preprocessFieldsInfo(fields: js.Array[Field], globalDefaultValue: String): js.Array[FieldObject] = js.native
    
    def preprocessOpts(): RequiredOptions = js.native
    def preprocessOpts(opts: Options): RequiredOptions = js.native
    
    def preprocessRow(row: js.Array[Any]): js.Array[Any] = js.native
    
    def processCell(row: js.Array[Any], fieldInfo: FieldObject): String = js.native
    
    def processRow(): js.UndefOr[String] = js.native
    def processRow(row: js.Array[Any]): js.UndefOr[String] = js.native
    
    def processValue(value: Any): String = js.native
  }
  
  trait Options extends StObject {
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    var eol: js.UndefOr[String] = js.undefined
    
    var fields: js.UndefOr[js.Array[Field]] = js.undefined
    
    var formatters: js.UndefOr[Formatters] = js.undefined
    
    var header: js.UndefOr[Boolean] = js.undefined
    
    var includeEmptyRows: js.UndefOr[Boolean] = js.undefined
    
    var transforms: js.UndefOr[js.Array[js.Function1[/* dataRow */ Any, Any]]] = js.undefined
    
    var withBOM: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setFormatters(value: Formatters): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
      
      inline def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIncludeEmptyRows(value: Boolean): Self = StObject.set(x, "includeEmptyRows", value.asInstanceOf[js.Any])
      
      inline def setIncludeEmptyRowsUndefined: Self = StObject.set(x, "includeEmptyRows", js.undefined)
      
      inline def setTransforms(value: js.Array[js.Function1[/* dataRow */ Any, Any]]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      inline def setTransformsVarargs(value: (js.Function1[/* dataRow */ Any, Any])*): Self = StObject.set(x, "transforms", js.Array(value*))
      
      inline def setWithBOM(value: Boolean): Self = StObject.set(x, "withBOM", value.asInstanceOf[js.Any])
      
      inline def setWithBOMUndefined: Self = StObject.set(x, "withBOM", js.undefined)
    }
  }
}

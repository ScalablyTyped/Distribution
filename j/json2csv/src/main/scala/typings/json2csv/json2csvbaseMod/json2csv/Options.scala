package typings.json2csv.json2csvbaseMod.json2csv

import typings.json2csv.baseMod.Json2CsvTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[T] extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEol: Self = this.set("eol", js.undefined)
    
    @scala.inline
    def setEscapedQuote(value: String): Self = this.set("escapedQuote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapedQuote: Self = this.set("escapedQuote", js.undefined)
    
    @scala.inline
    def setExcelStrings(value: Boolean): Self = this.set("excelStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcelStrings: Self = this.set("excelStrings", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: (String | FieldInfo[T])*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[String | FieldInfo[T]]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setHeader(value: Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setIncludeEmptyRows(value: Boolean): Self = this.set("includeEmptyRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeEmptyRows: Self = this.set("includeEmptyRows", js.undefined)
    
    @scala.inline
    def setNdjson(value: Boolean): Self = this.set("ndjson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNdjson: Self = this.set("ndjson", js.undefined)
    
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    
    @scala.inline
    def setTransformsVarargs(value: (Json2CsvTransform[js.Any, js.Any])*): Self = this.set("transforms", js.Array(value :_*))
    
    @scala.inline
    def setTransforms(value: js.Array[Json2CsvTransform[_, _]]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
    
    @scala.inline
    def setWithBOM(value: Boolean): Self = this.set("withBOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithBOM: Self = this.set("withBOM", js.undefined)
  }
}

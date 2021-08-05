package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StringDictionary
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AjaxFileJQuery {
  
  trait IAjaxFileJQueryExtension extends StObject {
    
    def ajaxWithFile(jqueryOption: IJQueryOption): JQueryDeferred[js.Any]
  }
  object IAjaxFileJQueryExtension {
    
    inline def apply(ajaxWithFile: IJQueryOption => JQueryDeferred[js.Any]): IAjaxFileJQueryExtension = {
      val __obj = js.Dynamic.literal(ajaxWithFile = js.Any.fromFunction1(ajaxWithFile))
      __obj.asInstanceOf[IAjaxFileJQueryExtension]
    }
    
    extension [Self <: IAjaxFileJQueryExtension](x: Self) {
      
      inline def setAjaxWithFile(value: IJQueryOption => JQueryDeferred[js.Any]): Self = StObject.set(x, "ajaxWithFile", js.Any.fromFunction1(value))
    }
  }
  
  trait IJQueryOption extends StObject {
    
    var complete: js.UndefOr[js.Function2[/* jqXHR */ IJQueryXHR, /* textStatus */ String, js.Any]] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var dataType: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[
        js.Function3[/* jqXHR */ IJQueryXHR, /* textStatus */ String, /* errorThrown */ String, js.Any]
      ] = js.undefined
    
    var files: js.UndefOr[js.Array[IFileData]] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var success: js.UndefOr[
        js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ IJQueryXHR, js.Any]
      ] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object IJQueryOption {
    
    inline def apply(): IJQueryOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJQueryOption]
    }
    
    extension [Self <: IJQueryOption](x: Self) {
      
      inline def setComplete(value: (/* jqXHR */ IJQueryXHR, /* textStatus */ String) => js.Any): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setError(value: (/* jqXHR */ IJQueryXHR, /* textStatus */ String, /* errorThrown */ String) => js.Any): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFiles(value: js.Array[IFileData]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: IFileData*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setSuccess(value: (/* data */ js.Any, /* textStatus */ String, /* jqXHR */ IJQueryXHR) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait IJQueryXHR extends StObject {
    
    def abort(): Unit = js.native
    def abort(statusText: String): Unit = js.native
    
    var beforeSend: js.UndefOr[js.Function2[/* jqXHR */ this.type, /* settings */ JQueryAjaxSettings, js.Any]] = js.native
    
    var complete: js.UndefOr[js.Function2[/* jqXHR */ this.type, /* textStatus */ String, js.Any]] = js.native
    
    var dataFilter: js.UndefOr[js.Function2[/* data */ js.Any, /* ty */ js.Any, js.Any]] = js.native
    
    var error: js.UndefOr[
        js.Function3[/* jqXHR */ this.type, /* textStatus */ String, /* errorThrown */ String, js.Any]
      ] = js.native
    
    def getAllResponseHeaders(): String = js.native
    
    def getResponseHeader(header: String): String = js.native
    
    var readyState: js.Any = js.native
    
    var responseText: String = js.native
    
    var responseXML: Document = js.native
    
    def setRequestHeader(header: String, value: String): Unit = js.native
    
    var status: Double = js.native
    
    var statusCode: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var statusText: String = js.native
    
    var success: js.UndefOr[
        js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ this.type, js.Any]
      ] = js.native
  }
}

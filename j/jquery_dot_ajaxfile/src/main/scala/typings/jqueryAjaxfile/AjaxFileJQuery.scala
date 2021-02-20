package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StringDictionary
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AjaxFileJQuery {
  
  @js.native
  trait IAjaxFileJQueryExtension extends StObject {
    
    def ajaxWithFile(jqueryOption: IJQueryOption): JQueryDeferred[_] = js.native
  }
  object IAjaxFileJQueryExtension {
    
    @scala.inline
    def apply(ajaxWithFile: IJQueryOption => JQueryDeferred[_]): IAjaxFileJQueryExtension = {
      val __obj = js.Dynamic.literal(ajaxWithFile = js.Any.fromFunction1(ajaxWithFile))
      __obj.asInstanceOf[IAjaxFileJQueryExtension]
    }
    
    @scala.inline
    implicit class IAjaxFileJQueryExtensionMutableBuilder[Self <: IAjaxFileJQueryExtension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAjaxWithFile(value: IJQueryOption => JQueryDeferred[_]): Self = StObject.set(x, "ajaxWithFile", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IJQueryOption extends StObject {
    
    var complete: js.UndefOr[js.Function2[/* jqXHR */ IJQueryXHR, /* textStatus */ String, _]] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var dataType: js.UndefOr[String] = js.native
    
    var error: js.UndefOr[
        js.Function3[/* jqXHR */ IJQueryXHR, /* textStatus */ String, /* errorThrown */ String, _]
      ] = js.native
    
    var files: js.UndefOr[js.Array[IFileData]] = js.native
    
    var global: js.UndefOr[Boolean] = js.native
    
    var success: js.UndefOr[
        js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ IJQueryXHR, _]
      ] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object IJQueryOption {
    
    @scala.inline
    def apply(): IJQueryOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJQueryOption]
    }
    
    @scala.inline
    implicit class IJQueryOptionMutableBuilder[Self <: IJQueryOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: (/* jqXHR */ IJQueryXHR, /* textStatus */ String) => _): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setError(value: (/* jqXHR */ IJQueryXHR, /* textStatus */ String, /* errorThrown */ String) => _): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Array[IFileData]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: IFileData*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setSuccess(value: (/* data */ js.Any, /* textStatus */ String, /* jqXHR */ IJQueryXHR) => _): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait IJQueryXHR extends StObject {
    
    def abort(): Unit = js.native
    def abort(statusText: String): Unit = js.native
    
    var beforeSend: js.UndefOr[js.Function2[/* jqXHR */ this.type, /* settings */ JQueryAjaxSettings, _]] = js.native
    
    var complete: js.UndefOr[js.Function2[/* jqXHR */ this.type, /* textStatus */ String, _]] = js.native
    
    var dataFilter: js.UndefOr[js.Function2[/* data */ js.Any, /* ty */ js.Any, _]] = js.native
    
    var error: js.UndefOr[
        js.Function3[/* jqXHR */ this.type, /* textStatus */ String, /* errorThrown */ String, _]
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
        js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ this.type, _]
      ] = js.native
  }
}

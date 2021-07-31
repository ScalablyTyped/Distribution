package typings.layuiSrc.layui

import typings.layuiSrc.anon.Field
import typings.layuiSrc.anon.Icon
import typings.layuiSrc.anon.None
import typings.layuiSrc.layuiSrcStrings.lg
import typings.layuiSrc.layuiSrcStrings.line
import typings.layuiSrc.layuiSrcStrings.nob
import typings.layuiSrc.layuiSrcStrings.row
import typings.layuiSrc.layuiSrcStrings.sm
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableOption extends StObject {
  
  var autoSort: js.UndefOr[Boolean] = js.undefined
  
  var cellMinWidth: js.UndefOr[Double] = js.undefined
  
  var cols: js.UndefOr[js.Array[js.Array[TableColumnOption]]] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var defaultToolbar: js.UndefOr[js.Array[String | Icon]] = js.undefined
  
  var done: js.UndefOr[
    js.Function3[
      /* res */ js.Object, 
      /* curr */ js.UndefOr[Double], 
      /* count */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  // 基础参数
  var elem: js.UndefOr[String | HTMLElement] = js.undefined
  
  var even: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var initSort: js.UndefOr[Field] = js.undefined
  
  // PageOptions时排除jump和elem
  var limit: js.UndefOr[Double] = js.undefined
  
  var limits: js.UndefOr[js.Array[Double]] = js.undefined
  
  var loading: js.UndefOr[Boolean] = js.undefined
  
  // 异步数据接口
  var method: js.UndefOr[String] = js.undefined
  
  var page: js.UndefOr[Boolean | PageOptions] = js.undefined
  
  var parseData: js.UndefOr[js.Function1[/* res */ js.Object, TableResponse]] = js.undefined
  
  var request: js.UndefOr[TableRequestRename] = js.undefined
  
  var response: js.UndefOr[TableResponseRename] = js.undefined
  
  var size: js.UndefOr[sm | lg] = js.undefined
  
  var skin: js.UndefOr[line | row | nob] = js.undefined
  
  var text: js.UndefOr[None] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var toolbar: js.UndefOr[String | HTMLElement | Boolean] = js.undefined
  
  var totalRow: js.UndefOr[Boolean] = js.undefined
  
  var url: js.UndefOr[String | Null] = js.undefined
  
  var where: js.UndefOr[js.Object | Null] = js.undefined
  
  // 'full-100'
  var width: js.UndefOr[Double | String] = js.undefined
}
object TableOption {
  
  @scala.inline
  def apply(): TableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOption]
  }
  
  @scala.inline
  implicit class TableOptionMutableBuilder[Self <: TableOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSort(value: Boolean): Self = StObject.set(x, "autoSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSortUndefined: Self = StObject.set(x, "autoSort", js.undefined)
    
    @scala.inline
    def setCellMinWidth(value: Double): Self = StObject.set(x, "cellMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellMinWidthUndefined: Self = StObject.set(x, "cellMinWidth", js.undefined)
    
    @scala.inline
    def setCols(value: js.Array[js.Array[TableColumnOption]]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    @scala.inline
    def setColsVarargs(value: js.Array[TableColumnOption]*): Self = StObject.set(x, "cols", js.Array(value :_*))
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDefaultToolbar(value: js.Array[String | Icon]): Self = StObject.set(x, "defaultToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultToolbarUndefined: Self = StObject.set(x, "defaultToolbar", js.undefined)
    
    @scala.inline
    def setDefaultToolbarVarargs(value: (String | Icon)*): Self = StObject.set(x, "defaultToolbar", js.Array(value :_*))
    
    @scala.inline
    def setDone(
      value: (/* res */ js.Object, /* curr */ js.UndefOr[Double], /* count */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "done", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setElem(value: String | HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    @scala.inline
    def setEven(value: Boolean): Self = StObject.set(x, "even", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvenUndefined: Self = StObject.set(x, "even", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInitSort(value: Field): Self = StObject.set(x, "initSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitSortUndefined: Self = StObject.set(x, "initSort", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setLimits(value: js.Array[Double]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    @scala.inline
    def setLimitsVarargs(value: Double*): Self = StObject.set(x, "limits", js.Array(value :_*))
    
    @scala.inline
    def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setPage(value: Boolean | PageOptions): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setParseData(value: /* res */ js.Object => TableResponse): Self = StObject.set(x, "parseData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseDataUndefined: Self = StObject.set(x, "parseData", js.undefined)
    
    @scala.inline
    def setRequest(value: TableRequestRename): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResponse(value: TableResponseRename): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setSize(value: sm | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSkin(value: line | row | nob): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    @scala.inline
    def setText(value: None): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setToolbar(value: String | HTMLElement | Boolean): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setTotalRow(value: Boolean): Self = StObject.set(x, "totalRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRowUndefined: Self = StObject.set(x, "totalRow", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlNull: Self = StObject.set(x, "url", null)
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWhere(value: js.Object): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereNull: Self = StObject.set(x, "where", null)
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

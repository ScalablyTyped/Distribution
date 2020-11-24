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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOption extends js.Object {
  
  var autoSort: js.UndefOr[Boolean] = js.native
  
  var cellMinWidth: js.UndefOr[Double] = js.native
  
  var cols: js.UndefOr[js.Array[js.Array[TableColumnOption]]] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[js.Array[js.Object]] = js.native
  
  var defaultToolbar: js.UndefOr[js.Array[String | Icon]] = js.native
  
  var done: js.UndefOr[
    js.Function3[
      /* res */ js.Object, 
      /* curr */ js.UndefOr[Double], 
      /* count */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  // 基础参数
  var elem: js.UndefOr[String | HTMLElement] = js.native
  
  var even: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var initSort: js.UndefOr[Field] = js.native
  
   // PageOptions时排除jump和elem
  var limit: js.UndefOr[Double] = js.native
  
  var limits: js.UndefOr[js.Array[Double]] = js.native
  
  var loading: js.UndefOr[Boolean] = js.native
  
  // 异步数据接口
  var method: js.UndefOr[String] = js.native
  
  var page: js.UndefOr[Boolean | PageOptions] = js.native
  
  var parseData: js.UndefOr[js.Function1[/* res */ js.Object, TableResponse]] = js.native
  
  var request: js.UndefOr[TableRequestRename] = js.native
  
  var response: js.UndefOr[TableResponseRename] = js.native
  
  var size: js.UndefOr[sm | lg] = js.native
  
  var skin: js.UndefOr[line | row | nob] = js.native
  
  var text: js.UndefOr[None] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var toolbar: js.UndefOr[String | HTMLElement | Boolean] = js.native
  
  var totalRow: js.UndefOr[Boolean] = js.native
  
  var url: js.UndefOr[String | Null] = js.native
  
  var where: js.UndefOr[js.Object | Null] = js.native
  
   // 'full-100'
  var width: js.UndefOr[Double | String] = js.native
}
object TableOption {
  
  @scala.inline
  def apply(): TableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOption]
  }
  
  @scala.inline
  implicit class TableOptionOps[Self <: TableOption] (val x: Self) extends AnyVal {
    
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
    def setAutoSort(value: Boolean): Self = this.set("autoSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSort: Self = this.set("autoSort", js.undefined)
    
    @scala.inline
    def setCellMinWidth(value: Double): Self = this.set("cellMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellMinWidth: Self = this.set("cellMinWidth", js.undefined)
    
    @scala.inline
    def setColsVarargs(value: js.Array[TableColumnOption]*): Self = this.set("cols", js.Array(value :_*))
    
    @scala.inline
    def setCols(value: js.Array[js.Array[TableColumnOption]]): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDefaultToolbarVarargs(value: (String | Icon)*): Self = this.set("defaultToolbar", js.Array(value :_*))
    
    @scala.inline
    def setDefaultToolbar(value: js.Array[String | Icon]): Self = this.set("defaultToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultToolbar: Self = this.set("defaultToolbar", js.undefined)
    
    @scala.inline
    def setDone(
      value: (/* res */ js.Object, /* curr */ js.UndefOr[Double], /* count */ js.UndefOr[Double]) => Unit
    ): Self = this.set("done", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setElem(value: String | HTMLElement): Self = this.set("elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElem: Self = this.set("elem", js.undefined)
    
    @scala.inline
    def setEven(value: Boolean): Self = this.set("even", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEven: Self = this.set("even", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInitSort(value: Field): Self = this.set("initSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitSort: Self = this.set("initSort", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setLimitsVarargs(value: Double*): Self = this.set("limits", js.Array(value :_*))
    
    @scala.inline
    def setLimits(value: js.Array[Double]): Self = this.set("limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimits: Self = this.set("limits", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPage(value: Boolean | PageOptions): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setParseData(value: /* res */ js.Object => TableResponse): Self = this.set("parseData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParseData: Self = this.set("parseData", js.undefined)
    
    @scala.inline
    def setRequest(value: TableRequestRename): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setResponse(value: TableResponseRename): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    
    @scala.inline
    def setSize(value: sm | lg): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSkin(value: line | row | nob): Self = this.set("skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkin: Self = this.set("skin", js.undefined)
    
    @scala.inline
    def setText(value: None): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setToolbar(value: String | HTMLElement | Boolean): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setTotalRow(value: Boolean): Self = this.set("totalRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalRow: Self = this.set("totalRow", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUrlNull: Self = this.set("url", null)
    
    @scala.inline
    def setWhere(value: js.Object): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
    
    @scala.inline
    def setWhereNull: Self = this.set("where", null)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}

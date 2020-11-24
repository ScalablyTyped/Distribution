package typings.json2md.mod

import typings.json2md.mod.DefaultConverters.CodeInput
import typings.json2md.mod.DefaultConverters.ImgInput
import typings.json2md.mod.DefaultConverters.TableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ TConverter in keyof json2md.json2md.DefaultConverters.Converters ]:? json2md.json2md.DefaultConverters.Converters[TConverter]} */
@js.native
trait DataObject extends js.Object {
  
  var blockquote: js.UndefOr[String | js.Array[String]] = js.native
  
  var code: js.UndefOr[CodeInput] = js.native
  
  var h1: js.UndefOr[String | js.Array[String]] = js.native
  
  var h2: js.UndefOr[String | js.Array[String]] = js.native
  
  var h3: js.UndefOr[String | js.Array[String]] = js.native
  
  var h4: js.UndefOr[String | js.Array[String]] = js.native
  
  var h5: js.UndefOr[String | js.Array[String]] = js.native
  
  var h6: js.UndefOr[String | js.Array[String]] = js.native
  
  var img: js.UndefOr[ImgInput | js.Array[ImgInput]] = js.native
  
  var ol: js.UndefOr[js.Array[String]] = js.native
  
  var p: js.UndefOr[String | js.Array[String]] = js.native
  
  var table: js.UndefOr[TableInput] = js.native
  
  var ul: js.UndefOr[js.Array[String]] = js.native
}
object DataObject {
  
  @scala.inline
  def apply(): DataObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataObject]
  }
  
  @scala.inline
  implicit class DataObjectOps[Self <: DataObject] (val x: Self) extends AnyVal {
    
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
    def setBlockquoteVarargs(value: String*): Self = this.set("blockquote", js.Array(value :_*))
    
    @scala.inline
    def setBlockquote(value: String | js.Array[String]): Self = this.set("blockquote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockquote: Self = this.set("blockquote", js.undefined)
    
    @scala.inline
    def setCode(value: CodeInput): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setH1Varargs(value: String*): Self = this.set("h1", js.Array(value :_*))
    
    @scala.inline
    def setH1(value: String | js.Array[String]): Self = this.set("h1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH1: Self = this.set("h1", js.undefined)
    
    @scala.inline
    def setH2Varargs(value: String*): Self = this.set("h2", js.Array(value :_*))
    
    @scala.inline
    def setH2(value: String | js.Array[String]): Self = this.set("h2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH2: Self = this.set("h2", js.undefined)
    
    @scala.inline
    def setH3Varargs(value: String*): Self = this.set("h3", js.Array(value :_*))
    
    @scala.inline
    def setH3(value: String | js.Array[String]): Self = this.set("h3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH3: Self = this.set("h3", js.undefined)
    
    @scala.inline
    def setH4Varargs(value: String*): Self = this.set("h4", js.Array(value :_*))
    
    @scala.inline
    def setH4(value: String | js.Array[String]): Self = this.set("h4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH4: Self = this.set("h4", js.undefined)
    
    @scala.inline
    def setH5Varargs(value: String*): Self = this.set("h5", js.Array(value :_*))
    
    @scala.inline
    def setH5(value: String | js.Array[String]): Self = this.set("h5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH5: Self = this.set("h5", js.undefined)
    
    @scala.inline
    def setH6Varargs(value: String*): Self = this.set("h6", js.Array(value :_*))
    
    @scala.inline
    def setH6(value: String | js.Array[String]): Self = this.set("h6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH6: Self = this.set("h6", js.undefined)
    
    @scala.inline
    def setImgVarargs(value: ImgInput*): Self = this.set("img", js.Array(value :_*))
    
    @scala.inline
    def setImg(value: ImgInput | js.Array[ImgInput]): Self = this.set("img", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImg: Self = this.set("img", js.undefined)
    
    @scala.inline
    def setOlVarargs(value: String*): Self = this.set("ol", js.Array(value :_*))
    
    @scala.inline
    def setOl(value: js.Array[String]): Self = this.set("ol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOl: Self = this.set("ol", js.undefined)
    
    @scala.inline
    def setPVarargs(value: String*): Self = this.set("p", js.Array(value :_*))
    
    @scala.inline
    def setP(value: String | js.Array[String]): Self = this.set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    
    @scala.inline
    def setTable(value: TableInput): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setUlVarargs(value: String*): Self = this.set("ul", js.Array(value :_*))
    
    @scala.inline
    def setUl(value: js.Array[String]): Self = this.set("ul", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUl: Self = this.set("ul", js.undefined)
  }
}

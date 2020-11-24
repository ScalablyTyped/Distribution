package typings.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<ionic.ionic/definitions.HookName, string | std.Array<string> | undefined> */
@js.native
trait RecordHookNamestringArray extends js.Object {
  
  @JSName("build:after")
  var buildColonafter: js.UndefOr[String | js.Array[String]] = js.native
  
  @JSName("build:before")
  var buildColonbefore: js.UndefOr[String | js.Array[String]] = js.native
  
  @JSName("serve:after")
  var serveColonafter: js.UndefOr[String | js.Array[String]] = js.native
  
  @JSName("serve:before")
  var serveColonbefore: js.UndefOr[String | js.Array[String]] = js.native
}
object RecordHookNamestringArray {
  
  @scala.inline
  def apply(): RecordHookNamestringArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordHookNamestringArray]
  }
  
  @scala.inline
  implicit class RecordHookNamestringArrayOps[Self <: RecordHookNamestringArray] (val x: Self) extends AnyVal {
    
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
    def setBuildColonafterVarargs(value: String*): Self = this.set("build:after", js.Array(value :_*))
    
    @scala.inline
    def setBuildColonafter(value: String | js.Array[String]): Self = this.set("build:after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildColonafter: Self = this.set("build:after", js.undefined)
    
    @scala.inline
    def setBuildColonbeforeVarargs(value: String*): Self = this.set("build:before", js.Array(value :_*))
    
    @scala.inline
    def setBuildColonbefore(value: String | js.Array[String]): Self = this.set("build:before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildColonbefore: Self = this.set("build:before", js.undefined)
    
    @scala.inline
    def setServeColonafterVarargs(value: String*): Self = this.set("serve:after", js.Array(value :_*))
    
    @scala.inline
    def setServeColonafter(value: String | js.Array[String]): Self = this.set("serve:after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServeColonafter: Self = this.set("serve:after", js.undefined)
    
    @scala.inline
    def setServeColonbeforeVarargs(value: String*): Self = this.set("serve:before", js.Array(value :_*))
    
    @scala.inline
    def setServeColonbefore(value: String | js.Array[String]): Self = this.set("serve:before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServeColonbefore: Self = this.set("serve:before", js.undefined)
  }
}

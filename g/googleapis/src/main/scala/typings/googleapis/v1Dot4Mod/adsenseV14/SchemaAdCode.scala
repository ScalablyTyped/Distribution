package typings.googleapis.v1Dot4Mod.adsenseV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAdCode extends js.Object {
  
  /**
    * The Auto ad code snippet. The ad code snippet.
    */
  var adCode: js.UndefOr[String] = js.native
  
  /**
    * The AMP Auto ad code snippet that goes in the body of an AMP page.
    */
  var ampBody: js.UndefOr[String] = js.native
  
  /**
    * The AMP Auto ad code snippet that goes in the head of an AMP page.
    */
  var ampHead: js.UndefOr[String] = js.native
  
  /**
    * Kind this is, in this case adsense#adCode.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaAdCode {
  
  @scala.inline
  def apply(): SchemaAdCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdCode]
  }
  
  @scala.inline
  implicit class SchemaAdCodeOps[Self <: SchemaAdCode] (val x: Self) extends AnyVal {
    
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
    def setAdCode(value: String): Self = this.set("adCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdCode: Self = this.set("adCode", js.undefined)
    
    @scala.inline
    def setAmpBody(value: String): Self = this.set("ampBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmpBody: Self = this.set("ampBody", js.undefined)
    
    @scala.inline
    def setAmpHead(value: String): Self = this.set("ampHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmpHead: Self = this.set("ampHead", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}

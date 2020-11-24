package typings.htmlparser2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserOptions extends js.Object {
  
  /***
    * If set to true, entities within the document will be decoded. Defaults to false.
    */
  var decodeEntities: js.UndefOr[Boolean] = js.native
  
  /***
    * If set to true, all attribute names will be lowercased. This has noticeable impact on speed, so it defaults to false.
    */
  var lowerCaseAttributeNames: js.UndefOr[Boolean] = js.native
  
  /***
    * If set to true, all tags will be lowercased. If xmlMode is disabled, this defaults to true.
    */
  var lowerCaseTags: js.UndefOr[Boolean] = js.native
  
  /***
    * If set to true, CDATA sections will be recognized as text even if the xmlMode option is not enabled.
    * NOTE: If xmlMode is set to true then CDATA sections will always be recognized as text.
    */
  var recognizeCDATA: js.UndefOr[Boolean] = js.native
  
  /***
    * If set to true, self-closing tags will trigger the onclosetag event even if xmlMode is not set to true.
    * NOTE: If xmlMode is set to true then self-closing tags will always be recognized.
    */
  var recognizeSelfClosing: js.UndefOr[Boolean] = js.native
  
  /***
    * Indicates whether special tags (<script> and <style>) should get special treatment
    * and if "empty" tags (eg. <br>) can have children.  If false, the content of special tags
    * will be text only. For feeds and other XML content (documents that don't consist of HTML),
    * set this to true. Default: false.
    */
  var xmlMode: js.UndefOr[Boolean] = js.native
}
object ParserOptions {
  
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
    
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
    def setDecodeEntities(value: Boolean): Self = this.set("decodeEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecodeEntities: Self = this.set("decodeEntities", js.undefined)
    
    @scala.inline
    def setLowerCaseAttributeNames(value: Boolean): Self = this.set("lowerCaseAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerCaseAttributeNames: Self = this.set("lowerCaseAttributeNames", js.undefined)
    
    @scala.inline
    def setLowerCaseTags(value: Boolean): Self = this.set("lowerCaseTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerCaseTags: Self = this.set("lowerCaseTags", js.undefined)
    
    @scala.inline
    def setRecognizeCDATA(value: Boolean): Self = this.set("recognizeCDATA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecognizeCDATA: Self = this.set("recognizeCDATA", js.undefined)
    
    @scala.inline
    def setRecognizeSelfClosing(value: Boolean): Self = this.set("recognizeSelfClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecognizeSelfClosing: Self = this.set("recognizeSelfClosing", js.undefined)
    
    @scala.inline
    def setXmlMode(value: Boolean): Self = this.set("xmlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlMode: Self = this.set("xmlMode", js.undefined)
  }
}

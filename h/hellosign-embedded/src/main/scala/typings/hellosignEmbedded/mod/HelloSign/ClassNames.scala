package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.hellosignEmbeddedStrings.`x-hellosign-embedded--in-modal`
import typings.hellosignEmbedded.hellosignEmbeddedStrings.`x-hellosign-embedded__iframe`
import typings.hellosignEmbedded.hellosignEmbeddedStrings.`x-hellosign-embedded__modal-close-button`
import typings.hellosignEmbedded.hellosignEmbeddedStrings.`x-hellosign-embedded__modal-close`
import typings.hellosignEmbedded.hellosignEmbeddedStrings.`x-hellosign-embedded__modal-content`
import typings.hellosignEmbedded.hellosignEmbeddedStrings.`x-hellosign-embedded__modal-screen`
import typings.hellosignEmbedded.hellosignEmbeddedStrings.`x-hellosign-embedded`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassNames extends js.Object {
  
  var BASE: `x-hellosign-embedded` = js.native
  
  var BASE_IN_MODAL: `x-hellosign-embedded--in-modal` = js.native
  
  var IFRAME: `x-hellosign-embedded__iframe` = js.native
  
  var MODAL_CLOSE: `x-hellosign-embedded__modal-close` = js.native
  
  var MODAL_CLOSE_BTN: `x-hellosign-embedded__modal-close-button` = js.native
  
  var MODAL_CONTENT: `x-hellosign-embedded__modal-content` = js.native
  
  var MODAL_SCREEN: `x-hellosign-embedded__modal-screen` = js.native
}
object ClassNames {
  
  @scala.inline
  def apply(
    BASE: `x-hellosign-embedded`,
    BASE_IN_MODAL: `x-hellosign-embedded--in-modal`,
    IFRAME: `x-hellosign-embedded__iframe`,
    MODAL_CLOSE: `x-hellosign-embedded__modal-close`,
    MODAL_CLOSE_BTN: `x-hellosign-embedded__modal-close-button`,
    MODAL_CONTENT: `x-hellosign-embedded__modal-content`,
    MODAL_SCREEN: `x-hellosign-embedded__modal-screen`
  ): ClassNames = {
    val __obj = js.Dynamic.literal(BASE = BASE.asInstanceOf[js.Any], BASE_IN_MODAL = BASE_IN_MODAL.asInstanceOf[js.Any], IFRAME = IFRAME.asInstanceOf[js.Any], MODAL_CLOSE = MODAL_CLOSE.asInstanceOf[js.Any], MODAL_CLOSE_BTN = MODAL_CLOSE_BTN.asInstanceOf[js.Any], MODAL_CONTENT = MODAL_CONTENT.asInstanceOf[js.Any], MODAL_SCREEN = MODAL_SCREEN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNames]
  }
  
  @scala.inline
  implicit class ClassNamesOps[Self <: ClassNames] (val x: Self) extends AnyVal {
    
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
    def setBASE(value: `x-hellosign-embedded`): Self = this.set("BASE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBASE_IN_MODAL(value: `x-hellosign-embedded--in-modal`): Self = this.set("BASE_IN_MODAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIFRAME(value: `x-hellosign-embedded__iframe`): Self = this.set("IFRAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMODAL_CLOSE(value: `x-hellosign-embedded__modal-close`): Self = this.set("MODAL_CLOSE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMODAL_CLOSE_BTN(value: `x-hellosign-embedded__modal-close-button`): Self = this.set("MODAL_CLOSE_BTN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMODAL_CONTENT(value: `x-hellosign-embedded__modal-content`): Self = this.set("MODAL_CONTENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMODAL_SCREEN(value: `x-hellosign-embedded__modal-screen`): Self = this.set("MODAL_SCREEN", value.asInstanceOf[js.Any])
  }
}

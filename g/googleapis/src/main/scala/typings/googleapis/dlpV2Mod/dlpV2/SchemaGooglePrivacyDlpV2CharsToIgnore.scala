package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Characters to skip when doing deidentification of a value. These will be
  * left alone and skipped.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CharsToIgnore extends js.Object {
  
  var charactersToSkip: js.UndefOr[String] = js.native
  
  var commonCharactersToIgnore: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2CharsToIgnore {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CharsToIgnore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CharsToIgnore]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CharsToIgnoreOps[Self <: SchemaGooglePrivacyDlpV2CharsToIgnore] (val x: Self) extends AnyVal {
    
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
    def setCharactersToSkip(value: String): Self = this.set("charactersToSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharactersToSkip: Self = this.set("charactersToSkip", js.undefined)
    
    @scala.inline
    def setCommonCharactersToIgnore(value: String): Self = this.set("commonCharactersToIgnore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonCharactersToIgnore: Self = this.set("commonCharactersToIgnore", js.undefined)
  }
}

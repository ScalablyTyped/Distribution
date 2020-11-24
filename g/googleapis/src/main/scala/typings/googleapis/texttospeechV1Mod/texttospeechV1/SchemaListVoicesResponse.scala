package typings.googleapis.texttospeechV1Mod.texttospeechV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The message returned to the client by the `ListVoices` method.
  */
@js.native
trait SchemaListVoicesResponse extends js.Object {
  
  /**
    * The list of voices.
    */
  var voices: js.UndefOr[js.Array[SchemaVoice]] = js.native
}
object SchemaListVoicesResponse {
  
  @scala.inline
  def apply(): SchemaListVoicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVoicesResponse]
  }
  
  @scala.inline
  implicit class SchemaListVoicesResponseOps[Self <: SchemaListVoicesResponse] (val x: Self) extends AnyVal {
    
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
    def setVoicesVarargs(value: SchemaVoice*): Self = this.set("voices", js.Array(value :_*))
    
    @scala.inline
    def setVoices(value: js.Array[SchemaVoice]): Self = this.set("voices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoices: Self = this.set("voices", js.undefined)
  }
}

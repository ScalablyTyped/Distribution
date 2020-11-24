package typings.googleapis.translateV2Mod.translateV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for language detection.
  */
@js.native
trait SchemaDetectLanguageRequest extends js.Object {
  
  /**
    * The input text upon which to perform language detection. Repeat this
    * parameter to perform language detection on multiple text inputs.
    */
  var q: js.UndefOr[js.Array[String]] = js.native
}
object SchemaDetectLanguageRequest {
  
  @scala.inline
  def apply(): SchemaDetectLanguageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetectLanguageRequest]
  }
  
  @scala.inline
  implicit class SchemaDetectLanguageRequestOps[Self <: SchemaDetectLanguageRequest] (val x: Self) extends AnyVal {
    
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
    def setQVarargs(value: String*): Self = this.set("q", js.Array(value :_*))
    
    @scala.inline
    def setQ(value: js.Array[String]): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
  }
}

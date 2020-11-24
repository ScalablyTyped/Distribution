package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The info of the software used by merchants to integrate with GPay.
  */
@js.native
trait SoftwareInfo extends js.Object {
  
  /**
    * The identifier of the software used by merchants to integrate with
    * GPay.
    *
    * Partner's domain name can be used as the identifier.
    *
    * This field is optional.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The version of the software.
    *
    * GPay metrics are provided per version.
    *
    * This field is optional.
    */
  var version: js.UndefOr[String] = js.native
}
object SoftwareInfo {
  
  @scala.inline
  def apply(): SoftwareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareInfo]
  }
  
  @scala.inline
  implicit class SoftwareInfoOps[Self <: SoftwareInfo] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}

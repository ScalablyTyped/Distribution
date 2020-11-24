package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information on how a buyer or seller can be reached.
  */
@js.native
trait SchemaContactInformation extends js.Object {
  
  /**
    * Email address for the contact.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The name of the contact.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaContactInformation {
  
  @scala.inline
  def apply(): SchemaContactInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactInformation]
  }
  
  @scala.inline
  implicit class SchemaContactInformationOps[Self <: SchemaContactInformation] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}

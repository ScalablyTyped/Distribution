package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information on how a buyer or seller can be reached.
  */
@js.native
trait SchemaContactInformation extends StObject {
  
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
  implicit class SchemaContactInformationMutableBuilder[Self <: SchemaContactInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Buyers are allowed to store certain types of private data in a
  * proposal/deal.
  */
trait SchemaPrivateData extends StObject {
  
  /**
    * A buyer or seller specified reference ID. This can be queried in the list
    * operations (max-length: 1024 unicode code units).
    */
  var referenceId: js.UndefOr[String] = js.undefined
}
object SchemaPrivateData {
  
  @scala.inline
  def apply(): SchemaPrivateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateData]
  }
  
  @scala.inline
  implicit class SchemaPrivateDataMutableBuilder[Self <: SchemaPrivateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReferenceId(value: String): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceIdUndefined: Self = StObject.set(x, "referenceId", js.undefined)
  }
}

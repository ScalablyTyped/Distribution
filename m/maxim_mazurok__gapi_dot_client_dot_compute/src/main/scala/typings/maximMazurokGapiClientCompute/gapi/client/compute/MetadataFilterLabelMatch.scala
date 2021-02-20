package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataFilterLabelMatch extends StObject {
  
  /**
    * Name of metadata label.
    * The name can have a maximum length of 1024 characters and must be at least 1 character long.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The value of the label must match the specified value.
    * value can have a maximum length of 1024 characters.
    */
  var value: js.UndefOr[String] = js.native
}
object MetadataFilterLabelMatch {
  
  @scala.inline
  def apply(): MetadataFilterLabelMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataFilterLabelMatch]
  }
  
  @scala.inline
  implicit class MetadataFilterLabelMatchMutableBuilder[Self <: MetadataFilterLabelMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

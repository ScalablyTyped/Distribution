package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCompositeTypeLabelEntry extends StObject {
  
  var key: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object SchemaCompositeTypeLabelEntry {
  
  @scala.inline
  def apply(): SchemaCompositeTypeLabelEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompositeTypeLabelEntry]
  }
  
  @scala.inline
  implicit class SchemaCompositeTypeLabelEntryMutableBuilder[Self <: SchemaCompositeTypeLabelEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaStepLabelsEntry extends StObject {
  
  var key: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object SchemaStepLabelsEntry {
  
  @scala.inline
  def apply(): SchemaStepLabelsEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStepLabelsEntry]
  }
  
  @scala.inline
  implicit class SchemaStepLabelsEntryMutableBuilder[Self <: SchemaStepLabelsEntry] (val x: Self) extends AnyVal {
    
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

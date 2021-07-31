package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeploymentUpdateLabelEntry extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object SchemaDeploymentUpdateLabelEntry {
  
  @scala.inline
  def apply(): SchemaDeploymentUpdateLabelEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeploymentUpdateLabelEntry]
  }
  
  @scala.inline
  implicit class SchemaDeploymentUpdateLabelEntryMutableBuilder[Self <: SchemaDeploymentUpdateLabelEntry] (val x: Self) extends AnyVal {
    
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

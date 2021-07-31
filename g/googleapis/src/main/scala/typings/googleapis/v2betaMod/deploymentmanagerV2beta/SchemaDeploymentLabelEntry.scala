package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeploymentLabelEntry extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object SchemaDeploymentLabelEntry {
  
  @scala.inline
  def apply(): SchemaDeploymentLabelEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeploymentLabelEntry]
  }
  
  @scala.inline
  implicit class SchemaDeploymentLabelEntryMutableBuilder[Self <: SchemaDeploymentLabelEntry] (val x: Self) extends AnyVal {
    
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

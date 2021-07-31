package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeTemplateNodeTypeFlexibility extends StObject {
  
  var cpus: js.UndefOr[String] = js.undefined
  
  var localSsd: js.UndefOr[String] = js.undefined
  
  var memory: js.UndefOr[String] = js.undefined
}
object SchemaNodeTemplateNodeTypeFlexibility {
  
  @scala.inline
  def apply(): SchemaNodeTemplateNodeTypeFlexibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTemplateNodeTypeFlexibility]
  }
  
  @scala.inline
  implicit class SchemaNodeTemplateNodeTypeFlexibilityMutableBuilder[Self <: SchemaNodeTemplateNodeTypeFlexibility] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpus(value: String): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpusUndefined: Self = StObject.set(x, "cpus", js.undefined)
    
    @scala.inline
    def setLocalSsd(value: String): Self = StObject.set(x, "localSsd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalSsdUndefined: Self = StObject.set(x, "localSsd", js.undefined)
    
    @scala.inline
    def setMemory(value: String): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
  }
}

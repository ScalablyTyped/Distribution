package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabServeDetails extends StObject {
  
  var address: String = js.native
  
  var port: Double = js.native
  
  var projectType: ProjectType = js.native
}
object LabServeDetails {
  
  @scala.inline
  def apply(address: String, port: Double, projectType: ProjectType): LabServeDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabServeDetails]
  }
  
  @scala.inline
  implicit class LabServeDetailsMutableBuilder[Self <: LabServeDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectType(value: ProjectType): Self = StObject.set(x, "projectType", value.asInstanceOf[js.Any])
  }
}

package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPackage extends StObject {
  
  /**
    * The desired_state the agent should maintain for this package. The default is to ensure the package is installed.
    */
  var desiredState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of package manager that can be used to install this package. If a system does not have the package manager, the package is not installed or removed no error message is returned. By default, or if you specify `ANY`, the agent attempts to install and remove this package using the default package manager. This is useful when creating a policy that applies to different types of systems. The default behavior is ANY.
    */
  var manager: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The name of the package. A package is uniquely identified for conflict validation by checking the package name and the manager(s) that the package targets.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaPackage {
  
  inline def apply(): SchemaPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackage]
  }
  
  extension [Self <: SchemaPackage](x: Self) {
    
    inline def setDesiredState(value: String): Self = StObject.set(x, "desiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateNull: Self = StObject.set(x, "desiredState", null)
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "desiredState", js.undefined)
    
    inline def setManager(value: String): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    inline def setManagerNull: Self = StObject.set(x, "manager", null)
    
    inline def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

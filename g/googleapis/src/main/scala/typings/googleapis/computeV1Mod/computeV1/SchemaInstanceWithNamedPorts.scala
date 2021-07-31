package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceWithNamedPorts extends StObject {
  
  /**
    * [Output Only] The URL of the instance.
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The named ports that belong to this instance group.
    */
  var namedPorts: js.UndefOr[js.Array[SchemaNamedPort]] = js.undefined
  
  /**
    * [Output Only] The status of the instance.
    */
  var status: js.UndefOr[String] = js.undefined
}
object SchemaInstanceWithNamedPorts {
  
  @scala.inline
  def apply(): SchemaInstanceWithNamedPorts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceWithNamedPorts]
  }
  
  @scala.inline
  implicit class SchemaInstanceWithNamedPortsMutableBuilder[Self <: SchemaInstanceWithNamedPorts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setNamedPorts(value: js.Array[SchemaNamedPort]): Self = StObject.set(x, "namedPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedPortsUndefined: Self = StObject.set(x, "namedPorts", js.undefined)
    
    @scala.inline
    def setNamedPortsVarargs(value: SchemaNamedPort*): Self = StObject.set(x, "namedPorts", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

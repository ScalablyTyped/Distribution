package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPod extends StObject {
  
  /**
    * Pod containers associated with this finding, if any.
    */
  var containers: js.UndefOr[js.Array[SchemaContainer]] = js.undefined
  
  /**
    * Pod labels. For Kubernetes containers, these are applied to the container.
    */
  var labels: js.UndefOr[js.Array[SchemaLabel]] = js.undefined
  
  /**
    * Kubernetes Pod name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kubernetes Pod namespace.
    */
  var ns: js.UndefOr[String | Null] = js.undefined
}
object SchemaPod {
  
  inline def apply(): SchemaPod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPod]
  }
  
  extension [Self <: SchemaPod](x: Self) {
    
    inline def setContainers(value: js.Array[SchemaContainer]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: SchemaContainer*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setLabels(value: js.Array[SchemaLabel]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: SchemaLabel*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setNsNull: Self = StObject.set(x, "ns", null)
    
    inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
  }
}

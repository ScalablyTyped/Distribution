package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a metric.
  */
trait SchemaMetric extends StObject {
  
  /**
    * The kind of resource this is, in this case dfareporting#metric.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The metric name, e.g. dfa:impressions
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaMetric {
  
  inline def apply(): SchemaMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetric]
  }
  
  extension [Self <: SchemaMetric](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

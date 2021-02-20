package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a metric.
  */
@js.native
trait SchemaMetric extends StObject {
  
  /**
    * The kind of resource this is, in this case dfareporting#metric.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The metric name, e.g. dfa:impressions
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaMetric {
  
  @scala.inline
  def apply(): SchemaMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetric]
  }
  
  @scala.inline
  implicit class SchemaMetricMutableBuilder[Self <: SchemaMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

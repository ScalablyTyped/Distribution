package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExfiltration extends StObject {
  
  /**
    * If there are multiple sources, then the data is considered "joined" between them. For instance, BigQuery can join multiple tables, and each table would be considered a source.
    */
  var sources: js.UndefOr[js.Array[SchemaExfilResource]] = js.undefined
  
  /**
    * If there are multiple targets, each target would get a complete copy of the "joined" source data.
    */
  var targets: js.UndefOr[js.Array[SchemaExfilResource]] = js.undefined
}
object SchemaExfiltration {
  
  inline def apply(): SchemaExfiltration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExfiltration]
  }
  
  extension [Self <: SchemaExfiltration](x: Self) {
    
    inline def setSources(value: js.Array[SchemaExfilResource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: SchemaExfilResource*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setTargets(value: js.Array[SchemaExfilResource]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: SchemaExfilResource*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}

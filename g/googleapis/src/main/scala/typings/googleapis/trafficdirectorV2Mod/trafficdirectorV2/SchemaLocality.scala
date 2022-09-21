package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocality extends StObject {
  
  /**
    * Region this :ref:`zone ` belongs to.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When used for locality of upstream hosts, this field further splits zone into smaller chunks of sub-zones so they can be load balanced independently.
    */
  var subZone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines the local service zone where Envoy is running. Though optional, it should be set if discovery service routing is used and the discovery service exposes :ref:`zone data `, either in this message or via :option:`--service-zone`. The meaning of zone is context dependent, e.g. `Availability Zone (AZ) `_ on AWS, `Zone `_ on GCP, etc.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocality {
  
  inline def apply(): SchemaLocality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocality]
  }
  
  extension [Self <: SchemaLocality](x: Self) {
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSubZone(value: String): Self = StObject.set(x, "subZone", value.asInstanceOf[js.Any])
    
    inline def setSubZoneNull: Self = StObject.set(x, "subZone", null)
    
    inline def setSubZoneUndefined: Self = StObject.set(x, "subZone", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}

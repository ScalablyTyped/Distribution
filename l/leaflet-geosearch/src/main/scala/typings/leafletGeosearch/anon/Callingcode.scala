package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callingcode extends StObject {
  
  var DMS: Lat
  
  var MGRS: String
  
  var Maidenhead: String
  
  var Mercator: X
  
  var OSM: Editurl
  
  var UN_M49: Regions
  
  var callingcode: Double
  
  var currency: Alternatesymbols
  
  var flag: String
  
  var geohash: String
  
  var qibla: Double
  
  var roadinfo: Driveon
  
  var sun: Rise
  
  var timezone: Name
  
  var what3words: Words
}
object Callingcode {
  
  inline def apply(
    DMS: Lat,
    MGRS: String,
    Maidenhead: String,
    Mercator: X,
    OSM: Editurl,
    UN_M49: Regions,
    callingcode: Double,
    currency: Alternatesymbols,
    flag: String,
    geohash: String,
    qibla: Double,
    roadinfo: Driveon,
    sun: Rise,
    timezone: Name,
    what3words: Words
  ): Callingcode = {
    val __obj = js.Dynamic.literal(DMS = DMS.asInstanceOf[js.Any], MGRS = MGRS.asInstanceOf[js.Any], Maidenhead = Maidenhead.asInstanceOf[js.Any], Mercator = Mercator.asInstanceOf[js.Any], OSM = OSM.asInstanceOf[js.Any], UN_M49 = UN_M49.asInstanceOf[js.Any], callingcode = callingcode.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], geohash = geohash.asInstanceOf[js.Any], qibla = qibla.asInstanceOf[js.Any], roadinfo = roadinfo.asInstanceOf[js.Any], sun = sun.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], what3words = what3words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callingcode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Callingcode] (val x: Self) extends AnyVal {
    
    inline def setCallingcode(value: Double): Self = StObject.set(x, "callingcode", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: Alternatesymbols): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDMS(value: Lat): Self = StObject.set(x, "DMS", value.asInstanceOf[js.Any])
    
    inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setGeohash(value: String): Self = StObject.set(x, "geohash", value.asInstanceOf[js.Any])
    
    inline def setMGRS(value: String): Self = StObject.set(x, "MGRS", value.asInstanceOf[js.Any])
    
    inline def setMaidenhead(value: String): Self = StObject.set(x, "Maidenhead", value.asInstanceOf[js.Any])
    
    inline def setMercator(value: X): Self = StObject.set(x, "Mercator", value.asInstanceOf[js.Any])
    
    inline def setOSM(value: Editurl): Self = StObject.set(x, "OSM", value.asInstanceOf[js.Any])
    
    inline def setQibla(value: Double): Self = StObject.set(x, "qibla", value.asInstanceOf[js.Any])
    
    inline def setRoadinfo(value: Driveon): Self = StObject.set(x, "roadinfo", value.asInstanceOf[js.Any])
    
    inline def setSun(value: Rise): Self = StObject.set(x, "sun", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: Name): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setUN_M49(value: Regions): Self = StObject.set(x, "UN_M49", value.asInstanceOf[js.Any])
    
    inline def setWhat3words(value: Words): Self = StObject.set(x, "what3words", value.asInstanceOf[js.Any])
  }
}

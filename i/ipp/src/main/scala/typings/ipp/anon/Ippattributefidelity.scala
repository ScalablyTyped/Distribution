package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ippattributefidelity extends StObject {
  
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.undefined
  
  var `attributes-natural-language`: js.UndefOr[String] = js.undefined
  
  var `ipp-attribute-fidelity`: js.UndefOr[Boolean] = js.undefined
  
  var `job-impressions`: js.UndefOr[Double] = js.undefined
  
  var `job-k-octets`: js.UndefOr[Double] = js.undefined
  
  var `job-media-sheets`: js.UndefOr[Double] = js.undefined
  
  var `job-name`: js.UndefOr[String] = js.undefined
  
  var `printer-uri`: js.UndefOr[String] = js.undefined
  
  var `requesting-user-name`: String
}
object Ippattributefidelity {
  
  inline def apply(`requesting-user-name`: String): Ippattributefidelity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ippattributefidelity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ippattributefidelity] (val x: Self) extends AnyVal {
    
    inline def `setAttributes-charset`(value: CharacterSet): Self = StObject.set(x, "attributes-charset", value.asInstanceOf[js.Any])
    
    inline def `setAttributes-charsetUndefined`: Self = StObject.set(x, "attributes-charset", js.undefined)
    
    inline def `setAttributes-natural-language`(value: String): Self = StObject.set(x, "attributes-natural-language", value.asInstanceOf[js.Any])
    
    inline def `setAttributes-natural-languageUndefined`: Self = StObject.set(x, "attributes-natural-language", js.undefined)
    
    inline def `setIpp-attribute-fidelity`(value: Boolean): Self = StObject.set(x, "ipp-attribute-fidelity", value.asInstanceOf[js.Any])
    
    inline def `setIpp-attribute-fidelityUndefined`: Self = StObject.set(x, "ipp-attribute-fidelity", js.undefined)
    
    inline def `setJob-impressions`(value: Double): Self = StObject.set(x, "job-impressions", value.asInstanceOf[js.Any])
    
    inline def `setJob-impressionsUndefined`: Self = StObject.set(x, "job-impressions", js.undefined)
    
    inline def `setJob-k-octets`(value: Double): Self = StObject.set(x, "job-k-octets", value.asInstanceOf[js.Any])
    
    inline def `setJob-k-octetsUndefined`: Self = StObject.set(x, "job-k-octets", js.undefined)
    
    inline def `setJob-media-sheets`(value: Double): Self = StObject.set(x, "job-media-sheets", value.asInstanceOf[js.Any])
    
    inline def `setJob-media-sheetsUndefined`: Self = StObject.set(x, "job-media-sheets", js.undefined)
    
    inline def `setJob-name`(value: String): Self = StObject.set(x, "job-name", value.asInstanceOf[js.Any])
    
    inline def `setJob-nameUndefined`: Self = StObject.set(x, "job-name", js.undefined)
    
    inline def `setPrinter-uri`(value: String): Self = StObject.set(x, "printer-uri", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-uriUndefined`: Self = StObject.set(x, "printer-uri", js.undefined)
    
    inline def `setRequesting-user-name`(value: String): Self = StObject.set(x, "requesting-user-name", value.asInstanceOf[js.Any])
  }
}

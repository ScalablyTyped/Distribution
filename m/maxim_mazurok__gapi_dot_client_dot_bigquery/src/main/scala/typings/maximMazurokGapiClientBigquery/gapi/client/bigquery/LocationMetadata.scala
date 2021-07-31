package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationMetadata extends StObject {
  
  /** The legacy BigQuery location ID, e.g. “EU” for the “europe” location. This is for any API consumers that need the legacy “US” and “EU” locations. */
  var legacyLocationId: js.UndefOr[String] = js.undefined
}
object LocationMetadata {
  
  @scala.inline
  def apply(): LocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationMetadata]
  }
  
  @scala.inline
  implicit class LocationMetadataMutableBuilder[Self <: LocationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLegacyLocationId(value: String): Self = StObject.set(x, "legacyLocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacyLocationIdUndefined: Self = StObject.set(x, "legacyLocationId", js.undefined)
  }
}

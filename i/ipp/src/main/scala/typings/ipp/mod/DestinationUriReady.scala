package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationUriReady extends StObject {
  
  var `destination-attributes`: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var `destination-attributes-supported`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `destination-info`: js.UndefOr[String] = js.undefined
  
  var `destination-is-directory`: js.UndefOr[Boolean] = js.undefined
  
  var `destination-mandatory-access-attributes`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `destination-name`: js.UndefOr[String] = js.undefined
  
  var `destination-oauth-scope`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `destination-oauth-token`: js.UndefOr[js.Array[String]] = js.undefined
  
  var `destination-oauth-uri`: js.UndefOr[String] = js.undefined
  
  var `destination-uri`: js.UndefOr[String] = js.undefined
}
object DestinationUriReady {
  
  @scala.inline
  def apply(): DestinationUriReady = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationUriReady]
  }
  
  @scala.inline
  implicit class DestinationUriReadyMutableBuilder[Self <: DestinationUriReady] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setDestination-attributes`(value: js.Array[js.Object]): Self = StObject.set(x, "destination-attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDestination-attributes-supported`(value: js.Array[String]): Self = StObject.set(x, "destination-attributes-supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDestination-attributes-supportedUndefined`: Self = StObject.set(x, "destination-attributes-supported", js.undefined)
    
    @scala.inline
    def `setDestination-attributes-supportedVarargs`(value: String*): Self = StObject.set(x, "destination-attributes-supported", js.Array(value :_*))
    
    @scala.inline
    def `setDestination-attributesUndefined`: Self = StObject.set(x, "destination-attributes", js.undefined)
    
    @scala.inline
    def `setDestination-attributesVarargs`(value: js.Object*): Self = StObject.set(x, "destination-attributes", js.Array(value :_*))
    
    @scala.inline
    def `setDestination-info`(value: String): Self = StObject.set(x, "destination-info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDestination-infoUndefined`: Self = StObject.set(x, "destination-info", js.undefined)
    
    @scala.inline
    def `setDestination-is-directory`(value: Boolean): Self = StObject.set(x, "destination-is-directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDestination-is-directoryUndefined`: Self = StObject.set(x, "destination-is-directory", js.undefined)
    
    @scala.inline
    def `setDestination-mandatory-access-attributes`(value: js.Array[String]): Self = StObject.set(x, "destination-mandatory-access-attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDestination-mandatory-access-attributesUndefined`: Self = StObject.set(x, "destination-mandatory-access-attributes", js.undefined)
    
    @scala.inline
    def `setDestination-mandatory-access-attributesVarargs`(value: String*): Self = StObject.set(x, "destination-mandatory-access-attributes", js.Array(value :_*))
    
    @scala.inline
    def `setDestination-name`(value: String): Self = StObject.set(x, "destination-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDestination-nameUndefined`: Self = StObject.set(x, "destination-name", js.undefined)
    
    @scala.inline
    def `setDestination-oauth-scope`(value: js.Array[String]): Self = StObject.set(x, "destination-oauth-scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDestination-oauth-scopeUndefined`: Self = StObject.set(x, "destination-oauth-scope", js.undefined)
    
    @scala.inline
    def `setDestination-oauth-scopeVarargs`(value: String*): Self = StObject.set(x, "destination-oauth-scope", js.Array(value :_*))
    
    @scala.inline
    def `setDestination-oauth-token`(value: js.Array[String]): Self = StObject.set(x, "destination-oauth-token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDestination-oauth-tokenUndefined`: Self = StObject.set(x, "destination-oauth-token", js.undefined)
    
    @scala.inline
    def `setDestination-oauth-tokenVarargs`(value: String*): Self = StObject.set(x, "destination-oauth-token", js.Array(value :_*))
    
    @scala.inline
    def `setDestination-oauth-uri`(value: String): Self = StObject.set(x, "destination-oauth-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDestination-oauth-uriUndefined`: Self = StObject.set(x, "destination-oauth-uri", js.undefined)
    
    @scala.inline
    def `setDestination-uri`(value: String): Self = StObject.set(x, "destination-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDestination-uriUndefined`: Self = StObject.set(x, "destination-uri", js.undefined)
  }
}

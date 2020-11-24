package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationUriReady extends js.Object {
  
  var `destination-attributes`: js.UndefOr[js.Array[js.Object]] = js.native
  
  var `destination-attributes-supported`: js.UndefOr[js.Array[String]] = js.native
  
  var `destination-info`: js.UndefOr[String] = js.native
  
  var `destination-is-directory`: js.UndefOr[Boolean] = js.native
  
  var `destination-mandatory-access-attributes`: js.UndefOr[js.Array[String]] = js.native
  
  var `destination-name`: js.UndefOr[String] = js.native
  
  var `destination-oauth-scope`: js.UndefOr[js.Array[String]] = js.native
  
  var `destination-oauth-token`: js.UndefOr[js.Array[String]] = js.native
  
  var `destination-oauth-uri`: js.UndefOr[String] = js.native
  
  var `destination-uri`: js.UndefOr[String] = js.native
}
object DestinationUriReady {
  
  @scala.inline
  def apply(): DestinationUriReady = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationUriReady]
  }
  
  @scala.inline
  implicit class DestinationUriReadyOps[Self <: DestinationUriReady] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `setDestination-attributesVarargs`(value: js.Object*): Self = this.set("destination-attributes", js.Array(value :_*))
    
    @scala.inline
    def `setDestination-attributes`(value: js.Array[js.Object]): Self = this.set("destination-attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDestination-attributes`: Self = this.set("destination-attributes", js.undefined)
    
    @scala.inline
    def `setDestination-attributes-supportedVarargs`(value: String*): Self = this.set("destination-attributes-supported", js.Array(value :_*))
    
    @scala.inline
    def `setDestination-attributes-supported`(value: js.Array[String]): Self = this.set("destination-attributes-supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDestination-attributes-supported`: Self = this.set("destination-attributes-supported", js.undefined)
    
    @scala.inline
    def `setDestination-info`(value: String): Self = this.set("destination-info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDestination-info`: Self = this.set("destination-info", js.undefined)
    
    @scala.inline
    def `setDestination-is-directory`(value: Boolean): Self = this.set("destination-is-directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDestination-is-directory`: Self = this.set("destination-is-directory", js.undefined)
    
    @scala.inline
    def `setDestination-mandatory-access-attributesVarargs`(value: String*): Self = this.set("destination-mandatory-access-attributes", js.Array(value :_*))
    
    @scala.inline
    def `setDestination-mandatory-access-attributes`(value: js.Array[String]): Self = this.set("destination-mandatory-access-attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDestination-mandatory-access-attributes`: Self = this.set("destination-mandatory-access-attributes", js.undefined)
    
    @scala.inline
    def `setDestination-name`(value: String): Self = this.set("destination-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDestination-name`: Self = this.set("destination-name", js.undefined)
    
    @scala.inline
    def `setDestination-oauth-scopeVarargs`(value: String*): Self = this.set("destination-oauth-scope", js.Array(value :_*))
    
    @scala.inline
    def `setDestination-oauth-scope`(value: js.Array[String]): Self = this.set("destination-oauth-scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDestination-oauth-scope`: Self = this.set("destination-oauth-scope", js.undefined)
    
    @scala.inline
    def `setDestination-oauth-tokenVarargs`(value: String*): Self = this.set("destination-oauth-token", js.Array(value :_*))
    
    @scala.inline
    def `setDestination-oauth-token`(value: js.Array[String]): Self = this.set("destination-oauth-token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDestination-oauth-token`: Self = this.set("destination-oauth-token", js.undefined)
    
    @scala.inline
    def `setDestination-oauth-uri`(value: String): Self = this.set("destination-oauth-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDestination-oauth-uri`: Self = this.set("destination-oauth-uri", js.undefined)
    
    @scala.inline
    def `setDestination-uri`(value: String): Self = this.set("destination-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDestination-uri`: Self = this.set("destination-uri", js.undefined)
  }
}

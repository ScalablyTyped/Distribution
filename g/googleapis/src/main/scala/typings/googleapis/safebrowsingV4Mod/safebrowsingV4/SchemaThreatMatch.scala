package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A match when checking a threat entry in the Safe Browsing threat lists.
  */
@js.native
trait SchemaThreatMatch extends js.Object {
  
  /**
    * The cache lifetime for the returned match. Clients must not cache this
    * response for more than this duration to avoid false positives.
    */
  var cacheDuration: js.UndefOr[String] = js.native
  
  /**
    * The platform type matching this threat.
    */
  var platformType: js.UndefOr[String] = js.native
  
  /**
    * The threat matching this threat.
    */
  var threat: js.UndefOr[SchemaThreatEntry] = js.native
  
  /**
    * Optional metadata associated with this threat.
    */
  var threatEntryMetadata: js.UndefOr[SchemaThreatEntryMetadata] = js.native
  
  /**
    * The threat entry type matching this threat.
    */
  var threatEntryType: js.UndefOr[String] = js.native
  
  /**
    * The threat type matching this threat.
    */
  var threatType: js.UndefOr[String] = js.native
}
object SchemaThreatMatch {
  
  @scala.inline
  def apply(): SchemaThreatMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatMatch]
  }
  
  @scala.inline
  implicit class SchemaThreatMatchOps[Self <: SchemaThreatMatch] (val x: Self) extends AnyVal {
    
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
    def setCacheDuration(value: String): Self = this.set("cacheDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheDuration: Self = this.set("cacheDuration", js.undefined)
    
    @scala.inline
    def setPlatformType(value: String): Self = this.set("platformType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformType: Self = this.set("platformType", js.undefined)
    
    @scala.inline
    def setThreat(value: SchemaThreatEntry): Self = this.set("threat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreat: Self = this.set("threat", js.undefined)
    
    @scala.inline
    def setThreatEntryMetadata(value: SchemaThreatEntryMetadata): Self = this.set("threatEntryMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatEntryMetadata: Self = this.set("threatEntryMetadata", js.undefined)
    
    @scala.inline
    def setThreatEntryType(value: String): Self = this.set("threatEntryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatEntryType: Self = this.set("threatEntryType", js.undefined)
    
    @scala.inline
    def setThreatType(value: String): Self = this.set("threatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatType: Self = this.set("threatType", js.undefined)
  }
}

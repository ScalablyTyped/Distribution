package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The constraints for this update.
  */
@js.native
trait SchemaConstraints extends js.Object {
  
  /**
    * A client&#39;s physical location, expressed as a ISO 31166-1 alpha-2
    * region code.
    */
  var deviceLocation: js.UndefOr[String] = js.native
  
  /**
    * Requests the lists for a specific language. Expects ISO 639 alpha-2
    * format.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Sets the maximum number of entries that the client is willing to have in
    * the local database. This should be a power of 2 between 2**10 and 2**20.
    * If zero, no database size limit is set.
    */
  var maxDatabaseEntries: js.UndefOr[Double] = js.native
  
  /**
    * The maximum size in number of entries. The update will not contain more
    * entries than this value.  This should be a power of 2 between 2**10 and
    * 2**20.  If zero, no update size limit is set.
    */
  var maxUpdateEntries: js.UndefOr[Double] = js.native
  
  /**
    * Requests the list for a specific geographic location. If not set the
    * server may pick that value based on the user&#39;s IP address. Expects
    * ISO 3166-1 alpha-2 format.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * The compression types supported by the client.
    */
  var supportedCompressions: js.UndefOr[js.Array[String]] = js.native
}
object SchemaConstraints {
  
  @scala.inline
  def apply(): SchemaConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConstraints]
  }
  
  @scala.inline
  implicit class SchemaConstraintsOps[Self <: SchemaConstraints] (val x: Self) extends AnyVal {
    
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
    def setDeviceLocation(value: String): Self = this.set("deviceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceLocation: Self = this.set("deviceLocation", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setMaxDatabaseEntries(value: Double): Self = this.set("maxDatabaseEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDatabaseEntries: Self = this.set("maxDatabaseEntries", js.undefined)
    
    @scala.inline
    def setMaxUpdateEntries(value: Double): Self = this.set("maxUpdateEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxUpdateEntries: Self = this.set("maxUpdateEntries", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSupportedCompressionsVarargs(value: String*): Self = this.set("supportedCompressions", js.Array(value :_*))
    
    @scala.inline
    def setSupportedCompressions(value: js.Array[String]): Self = this.set("supportedCompressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedCompressions: Self = this.set("supportedCompressions", js.undefined)
  }
}

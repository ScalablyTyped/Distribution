package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The information regarding one or more threats that a client submits when
  * checking for matches in threat lists.
  */
@js.native
trait SchemaThreatInfo extends js.Object {
  
  /**
    * The platform types to be checked.
    */
  var platformTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The threat entries to be checked.
    */
  var threatEntries: js.UndefOr[js.Array[SchemaThreatEntry]] = js.native
  
  /**
    * The entry types to be checked.
    */
  var threatEntryTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The threat types to be checked.
    */
  var threatTypes: js.UndefOr[js.Array[String]] = js.native
}
object SchemaThreatInfo {
  
  @scala.inline
  def apply(): SchemaThreatInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatInfo]
  }
  
  @scala.inline
  implicit class SchemaThreatInfoOps[Self <: SchemaThreatInfo] (val x: Self) extends AnyVal {
    
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
    def setPlatformTypesVarargs(value: String*): Self = this.set("platformTypes", js.Array(value :_*))
    
    @scala.inline
    def setPlatformTypes(value: js.Array[String]): Self = this.set("platformTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformTypes: Self = this.set("platformTypes", js.undefined)
    
    @scala.inline
    def setThreatEntriesVarargs(value: SchemaThreatEntry*): Self = this.set("threatEntries", js.Array(value :_*))
    
    @scala.inline
    def setThreatEntries(value: js.Array[SchemaThreatEntry]): Self = this.set("threatEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatEntries: Self = this.set("threatEntries", js.undefined)
    
    @scala.inline
    def setThreatEntryTypesVarargs(value: String*): Self = this.set("threatEntryTypes", js.Array(value :_*))
    
    @scala.inline
    def setThreatEntryTypes(value: js.Array[String]): Self = this.set("threatEntryTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatEntryTypes: Self = this.set("threatEntryTypes", js.undefined)
    
    @scala.inline
    def setThreatTypesVarargs(value: String*): Self = this.set("threatTypes", js.Array(value :_*))
    
    @scala.inline
    def setThreatTypes(value: js.Array[String]): Self = this.set("threatTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreatTypes: Self = this.set("threatTypes", js.undefined)
  }
}

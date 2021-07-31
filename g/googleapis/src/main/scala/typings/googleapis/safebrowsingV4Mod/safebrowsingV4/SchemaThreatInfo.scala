package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The information regarding one or more threats that a client submits when
  * checking for matches in threat lists.
  */
trait SchemaThreatInfo extends StObject {
  
  /**
    * The platform types to be checked.
    */
  var platformTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The threat entries to be checked.
    */
  var threatEntries: js.UndefOr[js.Array[SchemaThreatEntry]] = js.undefined
  
  /**
    * The entry types to be checked.
    */
  var threatEntryTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The threat types to be checked.
    */
  var threatTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaThreatInfo {
  
  @scala.inline
  def apply(): SchemaThreatInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatInfo]
  }
  
  @scala.inline
  implicit class SchemaThreatInfoMutableBuilder[Self <: SchemaThreatInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatformTypes(value: js.Array[String]): Self = StObject.set(x, "platformTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformTypesUndefined: Self = StObject.set(x, "platformTypes", js.undefined)
    
    @scala.inline
    def setPlatformTypesVarargs(value: String*): Self = StObject.set(x, "platformTypes", js.Array(value :_*))
    
    @scala.inline
    def setThreatEntries(value: js.Array[SchemaThreatEntry]): Self = StObject.set(x, "threatEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatEntriesUndefined: Self = StObject.set(x, "threatEntries", js.undefined)
    
    @scala.inline
    def setThreatEntriesVarargs(value: SchemaThreatEntry*): Self = StObject.set(x, "threatEntries", js.Array(value :_*))
    
    @scala.inline
    def setThreatEntryTypes(value: js.Array[String]): Self = StObject.set(x, "threatEntryTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatEntryTypesUndefined: Self = StObject.set(x, "threatEntryTypes", js.undefined)
    
    @scala.inline
    def setThreatEntryTypesVarargs(value: String*): Self = StObject.set(x, "threatEntryTypes", js.Array(value :_*))
    
    @scala.inline
    def setThreatTypes(value: js.Array[String]): Self = StObject.set(x, "threatTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatTypesUndefined: Self = StObject.set(x, "threatTypes", js.undefined)
    
    @scala.inline
    def setThreatTypesVarargs(value: String*): Self = StObject.set(x, "threatTypes", js.Array(value :_*))
  }
}

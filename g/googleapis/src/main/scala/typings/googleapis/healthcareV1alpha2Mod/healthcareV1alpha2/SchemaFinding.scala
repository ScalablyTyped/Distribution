package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFinding extends StObject {
  
  /**
    * Zero-based ending index of the found text, exclusively.
    */
  var end: js.UndefOr[String] = js.undefined
  
  /**
    * The type of information stored in this text range (e.g. HumanName,
    * BirthDate, Address, etc.)
    */
  var infoType: js.UndefOr[String] = js.undefined
  
  /**
    * Zero-based starting index of the found text, inclusively.
    */
  var start: js.UndefOr[String] = js.undefined
}
object SchemaFinding {
  
  @scala.inline
  def apply(): SchemaFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFinding]
  }
  
  @scala.inline
  implicit class SchemaFindingMutableBuilder[Self <: SchemaFinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setInfoType(value: String): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}

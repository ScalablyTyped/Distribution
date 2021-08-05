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
  
  inline def apply(): SchemaFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFinding]
  }
  
  extension [Self <: SchemaFinding](x: Self) {
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setInfoType(value: String): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    inline def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}

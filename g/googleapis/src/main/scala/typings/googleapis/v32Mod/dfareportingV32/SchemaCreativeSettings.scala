package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative Settings
  */
trait SchemaCreativeSettings extends StObject {
  
  /**
    * Header text for iFrames for this site. Must be less than or equal to 2000
    * characters long.
    */
  var iFrameFooter: js.UndefOr[String] = js.undefined
  
  /**
    * Header text for iFrames for this site. Must be less than or equal to 2000
    * characters long.
    */
  var iFrameHeader: js.UndefOr[String] = js.undefined
}
object SchemaCreativeSettings {
  
  inline def apply(): SchemaCreativeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeSettings]
  }
  
  extension [Self <: SchemaCreativeSettings](x: Self) {
    
    inline def setIFrameFooter(value: String): Self = StObject.set(x, "iFrameFooter", value.asInstanceOf[js.Any])
    
    inline def setIFrameFooterUndefined: Self = StObject.set(x, "iFrameFooter", js.undefined)
    
    inline def setIFrameHeader(value: String): Self = StObject.set(x, "iFrameHeader", value.asInstanceOf[js.Any])
    
    inline def setIFrameHeaderUndefined: Self = StObject.set(x, "iFrameHeader", js.undefined)
  }
}

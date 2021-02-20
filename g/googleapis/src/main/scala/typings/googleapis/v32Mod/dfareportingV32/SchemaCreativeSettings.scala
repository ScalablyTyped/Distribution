package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative Settings
  */
@js.native
trait SchemaCreativeSettings extends StObject {
  
  /**
    * Header text for iFrames for this site. Must be less than or equal to 2000
    * characters long.
    */
  var iFrameFooter: js.UndefOr[String] = js.native
  
  /**
    * Header text for iFrames for this site. Must be less than or equal to 2000
    * characters long.
    */
  var iFrameHeader: js.UndefOr[String] = js.native
}
object SchemaCreativeSettings {
  
  @scala.inline
  def apply(): SchemaCreativeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeSettings]
  }
  
  @scala.inline
  implicit class SchemaCreativeSettingsMutableBuilder[Self <: SchemaCreativeSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIFrameFooter(value: String): Self = StObject.set(x, "iFrameFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIFrameFooterUndefined: Self = StObject.set(x, "iFrameFooter", js.undefined)
    
    @scala.inline
    def setIFrameHeader(value: String): Self = StObject.set(x, "iFrameHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIFrameHeaderUndefined: Self = StObject.set(x, "iFrameHeader", js.undefined)
  }
}

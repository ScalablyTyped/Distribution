package typings.maximMazurokGapiClientAdsense.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupOption extends StObject {
  
  /** The backup option to be used in instances where no ad is available. */
  var backupOption: js.UndefOr[Color] = js.undefined
  
  /** Size of this ad unit. */
  var size: js.UndefOr[String] = js.undefined
  
  /** Type of this ad unit. */
  var `type`: js.UndefOr[String] = js.undefined
}
object BackupOption {
  
  @scala.inline
  def apply(): BackupOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupOption]
  }
  
  @scala.inline
  implicit class BackupOptionMutableBuilder[Self <: BackupOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupOption(value: Color): Self = StObject.set(x, "backupOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupOptionUndefined: Self = StObject.set(x, "backupOption", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

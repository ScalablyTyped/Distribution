package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IMAP settings for an account.
  */
@js.native
trait SchemaImapSettings extends StObject {
  
  /**
    * If this value is true, Gmail will immediately expunge a message when it
    * is marked as deleted in IMAP. Otherwise, Gmail will wait for an update
    * from the client before expunging messages marked as deleted.
    */
  var autoExpunge: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether IMAP is enabled for the account.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The action that will be executed on a message when it is marked as
    * deleted and expunged from the last visible IMAP folder.
    */
  var expungeBehavior: js.UndefOr[String] = js.native
  
  /**
    * An optional limit on the number of messages that an IMAP folder may
    * contain. Legal values are 0, 1000, 2000, 5000 or 10000. A value of zero
    * is interpreted to mean that there is no limit.
    */
  var maxFolderSize: js.UndefOr[Double] = js.native
}
object SchemaImapSettings {
  
  @scala.inline
  def apply(): SchemaImapSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImapSettings]
  }
  
  @scala.inline
  implicit class SchemaImapSettingsMutableBuilder[Self <: SchemaImapSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoExpunge(value: Boolean): Self = StObject.set(x, "autoExpunge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoExpungeUndefined: Self = StObject.set(x, "autoExpunge", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setExpungeBehavior(value: String): Self = StObject.set(x, "expungeBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpungeBehaviorUndefined: Self = StObject.set(x, "expungeBehavior", js.undefined)
    
    @scala.inline
    def setMaxFolderSize(value: Double): Self = StObject.set(x, "maxFolderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFolderSizeUndefined: Self = StObject.set(x, "maxFolderSize", js.undefined)
  }
}

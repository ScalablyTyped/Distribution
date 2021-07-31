package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Folder.
  */
trait SchemaFolder extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * The fingerprint of the GTM Folder as computed at storage time. This value
    * is recomputed whenever the folder is modified.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * The Folder ID uniquely identifies the GTM Folder.
    */
  var folderId: js.UndefOr[String] = js.undefined
  
  /**
    * Folder display name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaFolder {
  
  @scala.inline
  def apply(): SchemaFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFolder]
  }
  
  @scala.inline
  implicit class SchemaFolderMutableBuilder[Self <: SchemaFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

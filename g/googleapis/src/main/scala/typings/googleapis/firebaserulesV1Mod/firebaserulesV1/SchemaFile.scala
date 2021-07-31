package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `File` containing source content.
  */
trait SchemaFile extends StObject {
  
  /**
    * Textual Content.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * Fingerprint (e.g. github sha) associated with the `File`.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * File name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaFile {
  
  @scala.inline
  def apply(): SchemaFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFile]
  }
  
  @scala.inline
  implicit class SchemaFileMutableBuilder[Self <: SchemaFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

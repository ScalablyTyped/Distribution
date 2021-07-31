package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an upload session reference. This reference is created via
  * upload method. Updating of item content may refer to this uploaded content
  * via contentDataRef.
  */
trait SchemaUploadItemRef extends StObject {
  
  /**
    * Name of the content reference. The maximum length is 2048 characters.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaUploadItemRef {
  
  @scala.inline
  def apply(): SchemaUploadItemRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadItemRef]
  }
  
  @scala.inline
  implicit class SchemaUploadItemRefMutableBuilder[Self <: SchemaUploadItemRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for About (notes) of a user in Directory API.
  */
@js.native
trait SchemaUserAbout extends StObject {
  
  /**
    * About entry can have a type which indicates the content type. It can
    * either be plain or html. By default, notes contents are assumed to
    * contain plain text.
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * Actual value of notes.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaUserAbout {
  
  @scala.inline
  def apply(): SchemaUserAbout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserAbout]
  }
  
  @scala.inline
  implicit class SchemaUserAboutMutableBuilder[Self <: SchemaUserAbout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

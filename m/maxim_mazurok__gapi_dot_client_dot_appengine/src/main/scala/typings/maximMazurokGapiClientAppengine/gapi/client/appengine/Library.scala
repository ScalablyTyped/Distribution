package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Library extends StObject {
  
  /** Name of the library. Example: "django". */
  var name: js.UndefOr[String] = js.undefined
  
  /** Version of the library to select, or "latest". */
  var version: js.UndefOr[String] = js.undefined
}
object Library {
  
  @scala.inline
  def apply(): Library = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Library]
  }
  
  @scala.inline
  implicit class LibraryMutableBuilder[Self <: Library] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

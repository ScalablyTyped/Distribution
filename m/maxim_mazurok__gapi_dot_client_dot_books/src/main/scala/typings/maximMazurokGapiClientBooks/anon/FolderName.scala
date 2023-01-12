package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FolderName extends StObject {
  
  var folderName: js.UndefOr[String] = js.undefined
  
  var isEnabled: js.UndefOr[Boolean] = js.undefined
}
object FolderName {
  
  inline def apply(): FolderName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FolderName] (val x: Self) extends AnyVal {
    
    inline def setFolderName(value: String): Self = StObject.set(x, "folderName", value.asInstanceOf[js.Any])
    
    inline def setFolderNameUndefined: Self = StObject.set(x, "folderName", js.undefined)
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
  }
}

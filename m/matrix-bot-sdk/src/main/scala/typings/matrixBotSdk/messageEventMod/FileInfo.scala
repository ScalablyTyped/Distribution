package typings.matrixBotSdk.messageEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileInfo extends StObject {
  
  /**
    * The type of file.
    */
  var mimetype: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the file in bytes.
    */
  var size: js.UndefOr[Double] = js.undefined
}
object FileInfo {
  
  inline def apply(): FileInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileInfo]
  }
  
  extension [Self <: FileInfo](x: Self) {
    
    inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
    
    inline def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}

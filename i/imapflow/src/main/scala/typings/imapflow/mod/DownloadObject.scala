package typings.imapflow.mod

import typings.imapflow.anon.Charset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadObject extends StObject {
  
  var content: Readable
  
  var meta: Charset
}
object DownloadObject {
  
  inline def apply(content: Readable, meta: Charset): DownloadObject = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadObject]
  }
  
  extension [Self <: DownloadObject](x: Self) {
    
    inline def setContent(value: Readable): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Charset): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}

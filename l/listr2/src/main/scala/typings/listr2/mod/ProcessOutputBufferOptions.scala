package typings.listr2.mod

import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessOutputBufferOptions extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var stream: js.UndefOr[WriteStream] = js.undefined
}
object ProcessOutputBufferOptions {
  
  inline def apply(): ProcessOutputBufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessOutputBufferOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessOutputBufferOptions] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setStream(value: WriteStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}

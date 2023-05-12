package typings.listr2.mod

import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessOutputBufferEntry extends StObject {
  
  var entry: String
  
  var stream: js.UndefOr[WriteStream] = js.undefined
  
  var time: Double
}
object ProcessOutputBufferEntry {
  
  inline def apply(entry: String, time: Double): ProcessOutputBufferEntry = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessOutputBufferEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessOutputBufferEntry] (val x: Self) extends AnyVal {
    
    inline def setEntry(value: String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setStream(value: WriteStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}

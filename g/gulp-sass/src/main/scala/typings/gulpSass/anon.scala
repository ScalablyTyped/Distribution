package typings.gulpSass

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Duration extends StObject {
    
    var duration: Double
    
    var end: Date
    
    var entry: String
    
    var includedFiles: js.Array[String]
    
    var start: Date
  }
  object Duration {
    
    inline def apply(duration: Double, end: Date, entry: String, includedFiles: js.Array[String], start: Date): Duration = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], includedFiles = includedFiles.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Duration]
    }
    
    extension [Self <: Duration](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEntry(value: String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setIncludedFiles(value: js.Array[String]): Self = StObject.set(x, "includedFiles", value.asInstanceOf[js.Any])
      
      inline def setIncludedFilesVarargs(value: String*): Self = StObject.set(x, "includedFiles", js.Array(value :_*))
      
      inline def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}

package typings.jestTestResult

import typings.jestTestResult.typesMod.Milliseconds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Added extends StObject {
    
    var added: Double
    
    var fileDeleted: Boolean
    
    var matched: Double
    
    var unchecked: Double
    
    var uncheckedKeys: js.Array[String]
    
    var unmatched: Double
    
    var updated: Double
  }
  object Added {
    
    inline def apply(
      added: Double,
      fileDeleted: Boolean,
      matched: Double,
      unchecked: Double,
      uncheckedKeys: js.Array[String],
      unmatched: Double,
      updated: Double
    ): Added = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], fileDeleted = fileDeleted.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], unchecked = unchecked.asInstanceOf[js.Any], uncheckedKeys = uncheckedKeys.asInstanceOf[js.Any], unmatched = unmatched.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Added]
    }
    
    extension [Self <: Added](x: Self) {
      
      inline def setAdded(value: Double): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setFileDeleted(value: Boolean): Self = StObject.set(x, "fileDeleted", value.asInstanceOf[js.Any])
      
      inline def setMatched(value: Double): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
      
      inline def setUnchecked(value: Double): Self = StObject.set(x, "unchecked", value.asInstanceOf[js.Any])
      
      inline def setUncheckedKeys(value: js.Array[String]): Self = StObject.set(x, "uncheckedKeys", value.asInstanceOf[js.Any])
      
      inline def setUncheckedKeysVarargs(value: String*): Self = StObject.set(x, "uncheckedKeys", js.Array(value :_*))
      
      inline def setUnmatched(value: Double): Self = StObject.set(x, "unmatched", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: Milliseconds
    
    var start: Milliseconds
  }
  object End {
    
    inline def apply(end: Milliseconds, start: Milliseconds): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Milliseconds): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Milliseconds): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}

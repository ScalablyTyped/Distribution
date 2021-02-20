package typings.jestTestResult

import typings.jestTestResult.typesMod.Milliseconds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Added extends StObject {
    
    var added: Double = js.native
    
    var fileDeleted: Boolean = js.native
    
    var matched: Double = js.native
    
    var unchecked: Double = js.native
    
    var uncheckedKeys: js.Array[String] = js.native
    
    var unmatched: Double = js.native
    
    var updated: Double = js.native
  }
  object Added {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class AddedMutableBuilder[Self <: Added] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdded(value: Double): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileDeleted(value: Boolean): Self = StObject.set(x, "fileDeleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatched(value: Double): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnchecked(value: Double): Self = StObject.set(x, "unchecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncheckedKeys(value: js.Array[String]): Self = StObject.set(x, "uncheckedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncheckedKeysVarargs(value: String*): Self = StObject.set(x, "uncheckedKeys", js.Array(value :_*))
      
      @scala.inline
      def setUnmatched(value: Double): Self = StObject.set(x, "unmatched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait End extends StObject {
    
    var end: Milliseconds = js.native
    
    var start: Milliseconds = js.native
  }
  object End {
    
    @scala.inline
    def apply(end: Milliseconds, start: Milliseconds): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Milliseconds): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Milliseconds): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}

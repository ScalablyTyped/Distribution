package typings.jestTestResult

import typings.jestTestResult.mod.RuntimeTransformResult
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Added] (val x: Self) extends AnyVal {
      
      inline def setAdded(value: Double): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setFileDeleted(value: Boolean): Self = StObject.set(x, "fileDeleted", value.asInstanceOf[js.Any])
      
      inline def setMatched(value: Double): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
      
      inline def setUnchecked(value: Double): Self = StObject.set(x, "unchecked", value.asInstanceOf[js.Any])
      
      inline def setUncheckedKeys(value: js.Array[String]): Self = StObject.set(x, "uncheckedKeys", value.asInstanceOf[js.Any])
      
      inline def setUncheckedKeysVarargs(value: String*): Self = StObject.set(x, "uncheckedKeys", js.Array(value*))
      
      inline def setUnmatched(value: Double): Self = StObject.set(x, "unmatched", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  trait CodeTransformResult extends StObject {
    
    var codeTransformResult: js.UndefOr[RuntimeTransformResult] = js.undefined
    
    var result: /* import warning: importer.ImportType#apply Failed type conversion: collect-v8-coverage.collect-v8-coverage.V8Coverage[number] */ js.Any
  }
  object CodeTransformResult {
    
    inline def apply(
      result: /* import warning: importer.ImportType#apply Failed type conversion: collect-v8-coverage.collect-v8-coverage.V8Coverage[number] */ js.Any
    ): CodeTransformResult = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeTransformResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeTransformResult] (val x: Self) extends AnyVal {
      
      inline def setCodeTransformResult(value: RuntimeTransformResult): Self = StObject.set(x, "codeTransformResult", value.asInstanceOf[js.Any])
      
      inline def setCodeTransformResultUndefined: Self = StObject.set(x, "codeTransformResult", js.undefined)
      
      inline def setResult(
        value: /* import warning: importer.ImportType#apply Failed type conversion: collect-v8-coverage.collect-v8-coverage.V8Coverage[number] */ js.Any
      ): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: Double
    
    var runtime: Double
    
    var slow: Boolean
    
    var start: Double
  }
  object End {
    
    inline def apply(end: Double, runtime: Double, slow: Boolean, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], slow = slow.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setSlow(value: Boolean): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}

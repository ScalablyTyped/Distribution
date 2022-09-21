package typings.gulpLesshint

import typings.gulpLesshint.gulpLesshintStrings.data
import typings.gulpLesshint.mod.gulpLesshint.LessHintFile
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column extends StObject {
    
    var column: Double
    
    var file: String
    
    var fullPath: String
    
    var line: Double
    
    var linter: String
    
    var message: String
    
    var severity: String
  }
  object Column {
    
    inline def apply(
      column: Double,
      file: String,
      fullPath: String,
      line: Double,
      linter: String,
      message: String,
      severity: String
    ): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], linter = linter.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    extension [Self <: Column](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLinter(value: String): Self = StObject.set(x, "linter", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    }
  }
  
  trait On extends StObject {
    
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* file */ LessHintFile, Unit]): Transform
  }
  object On {
    
    inline def apply(on: (data, js.Function1[/* file */ LessHintFile, Unit]) => Transform): On = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[On]
    }
    
    extension [Self <: On](x: Self) {
      
      inline def setOn(value: (data, js.Function1[/* file */ LessHintFile, Unit]) => Transform): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
  
  trait ResultCount extends StObject {
    
    var resultCount: Double
    
    var results: Column
    
    var success: Boolean
  }
  object ResultCount {
    
    inline def apply(resultCount: Double, results: Column, success: Boolean): ResultCount = {
      val __obj = js.Dynamic.literal(resultCount = resultCount.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultCount]
    }
    
    extension [Self <: ResultCount](x: Self) {
      
      inline def setResultCount(value: Double): Self = StObject.set(x, "resultCount", value.asInstanceOf[js.Any])
      
      inline def setResults(value: Column): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}

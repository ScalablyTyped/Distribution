package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single stack frame in a stack trace.
  */
trait SchemaStackFrame extends StObject {
  
  /**
    * The column number where the function call appears, if available. This is
    * important in JavaScript because of its anonymous functions.
    */
  var columnNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the source file where the function call appears (up to 256
    * bytes).
    */
  var fileName: js.UndefOr[SchemaTruncatableString] = js.undefined
  
  /**
    * The fully-qualified name that uniquely identifies the function or method
    * that is active in this frame (up to 1024 bytes).
    */
  var functionName: js.UndefOr[SchemaTruncatableString] = js.undefined
  
  /**
    * The line number in `file_name` where the function call appears.
    */
  var lineNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The binary module from where the code was loaded.
    */
  var loadModule: js.UndefOr[SchemaModule] = js.undefined
  
  /**
    * An un-mangled function name, if `function_name` is
    * [mangled](http://www.avabodh.com/cxxin/namemangling.html). The name can
    * be fully-qualified (up to 1024 bytes).
    */
  var originalFunctionName: js.UndefOr[SchemaTruncatableString] = js.undefined
  
  /**
    * The version of the deployed source code (up to 128 bytes).
    */
  var sourceVersion: js.UndefOr[SchemaTruncatableString] = js.undefined
}
object SchemaStackFrame {
  
  inline def apply(): SchemaStackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStackFrame]
  }
  
  extension [Self <: SchemaStackFrame](x: Self) {
    
    inline def setColumnNumber(value: String): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
    
    inline def setFileName(value: SchemaTruncatableString): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFunctionName(value: SchemaTruncatableString): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    inline def setLineNumber(value: String): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    inline def setLoadModule(value: SchemaModule): Self = StObject.set(x, "loadModule", value.asInstanceOf[js.Any])
    
    inline def setLoadModuleUndefined: Self = StObject.set(x, "loadModule", js.undefined)
    
    inline def setOriginalFunctionName(value: SchemaTruncatableString): Self = StObject.set(x, "originalFunctionName", value.asInstanceOf[js.Any])
    
    inline def setOriginalFunctionNameUndefined: Self = StObject.set(x, "originalFunctionName", js.undefined)
    
    inline def setSourceVersion(value: SchemaTruncatableString): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
    
    inline def setSourceVersionUndefined: Self = StObject.set(x, "sourceVersion", js.undefined)
  }
}

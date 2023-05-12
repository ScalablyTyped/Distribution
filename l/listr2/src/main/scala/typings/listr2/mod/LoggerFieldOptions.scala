package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggerFieldOptions[MultipleOnly /* <: Boolean */] extends StObject {
  
  /**
    * Prefix fields for the log entry.
    */
  var prefix: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: MultipleOnly extends false ? listr2.listr2.LoggerField<std.Array<any>> | std.Array<listr2.listr2.LoggerField<std.Array<any>>> : std.Array<listr2.listr2.LoggerField<std.Array<any>>> */ js.Any
  ] = js.undefined
  
  /**
    * Suffix fields for the log entry.
    */
  var suffix: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: MultipleOnly extends false ? listr2.listr2.LoggerField<std.Array<any>> | std.Array<listr2.listr2.LoggerField<std.Array<any>>> : std.Array<listr2.listr2.LoggerField<std.Array<any>>> */ js.Any
  ] = js.undefined
}
object LoggerFieldOptions {
  
  inline def apply[MultipleOnly /* <: Boolean */](): LoggerFieldOptions[MultipleOnly] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerFieldOptions[MultipleOnly]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoggerFieldOptions[?], MultipleOnly /* <: Boolean */] (val x: Self & LoggerFieldOptions[MultipleOnly]) extends AnyVal {
    
    inline def setPrefix(
      value: /* import warning: importer.ImportType#apply Failed type conversion: MultipleOnly extends false ? listr2.listr2.LoggerField<std.Array<any>> | std.Array<listr2.listr2.LoggerField<std.Array<any>>> : std.Array<listr2.listr2.LoggerField<std.Array<any>>> */ js.Any
    ): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSuffix(
      value: /* import warning: importer.ImportType#apply Failed type conversion: MultipleOnly extends false ? listr2.listr2.LoggerField<std.Array<any>> | std.Array<listr2.listr2.LoggerField<std.Array<any>>> : std.Array<listr2.listr2.LoggerField<std.Array<any>>> */ js.Any
    ): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}

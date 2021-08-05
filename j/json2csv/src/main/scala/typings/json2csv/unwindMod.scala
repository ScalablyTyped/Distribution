package typings.json2csv

import typings.json2csv.baseMod.Json2CsvTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unwindMod {
  
  @JSImport("json2csv/transforms/unwind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unwind(): Json2CsvTransform[js.Any, js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwind")().asInstanceOf[Json2CsvTransform[js.Any, js.Array[js.Any]]]
  inline def unwind(options: UnwindOptions): Json2CsvTransform[js.Any, js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwind")(options.asInstanceOf[js.Any]).asInstanceOf[Json2CsvTransform[js.Any, js.Array[js.Any]]]
  
  trait UnwindOptions extends StObject {
    
    var blankOut: js.UndefOr[Boolean] = js.undefined
    
    var paths: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnwindOptions {
    
    inline def apply(): UnwindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnwindOptions]
    }
    
    extension [Self <: UnwindOptions](x: Self) {
      
      inline def setBlankOut(value: Boolean): Self = StObject.set(x, "blankOut", value.asInstanceOf[js.Any])
      
      inline def setBlankOutUndefined: Self = StObject.set(x, "blankOut", js.undefined)
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
    }
  }
}

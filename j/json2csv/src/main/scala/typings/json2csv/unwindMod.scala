package typings.json2csv

import typings.json2csv.baseMod.Json2CsvTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unwindMod {
  
  @JSImport("json2csv/transforms/unwind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def unwind(): Json2CsvTransform[js.Any, js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwind")().asInstanceOf[Json2CsvTransform[js.Any, js.Array[js.Any]]]
  @scala.inline
  def unwind(options: UnwindOptions): Json2CsvTransform[js.Any, js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwind")(options.asInstanceOf[js.Any]).asInstanceOf[Json2CsvTransform[js.Any, js.Array[js.Any]]]
  
  trait UnwindOptions extends StObject {
    
    var blankOut: js.UndefOr[Boolean] = js.undefined
    
    var paths: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnwindOptions {
    
    @scala.inline
    def apply(): UnwindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnwindOptions]
    }
    
    @scala.inline
    implicit class UnwindOptionsMutableBuilder[Self <: UnwindOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlankOut(value: Boolean): Self = StObject.set(x, "blankOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlankOutUndefined: Self = StObject.set(x, "blankOut", js.undefined)
      
      @scala.inline
      def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
    }
  }
}

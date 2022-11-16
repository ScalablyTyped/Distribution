package typings.jsonDiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def diff(obj1: Any, obj2: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def diff(obj1: Any, obj2: Any, options: DiffOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def diffString(obj1: Any, obj2: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diffString")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def diffString(obj1: Any, obj2: Any, options: DiffStringOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("diffString")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait DiffOptions extends StObject {
    
    var full: js.UndefOr[Boolean] = js.undefined
    
    var keepUnchangedValues: js.UndefOr[Boolean] = js.undefined
    
    var keysOnly: js.UndefOr[Boolean] = js.undefined
    
    var maxElisions: js.UndefOr[Double] = js.undefined
    
    var outputKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var outputNewOnly: js.UndefOr[Boolean] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var sort: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object DiffOptions {
    
    inline def apply(): DiffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiffOptions]
    }
    
    extension [Self <: DiffOptions](x: Self) {
      
      inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setKeepUnchangedValues(value: Boolean): Self = StObject.set(x, "keepUnchangedValues", value.asInstanceOf[js.Any])
      
      inline def setKeepUnchangedValuesUndefined: Self = StObject.set(x, "keepUnchangedValues", js.undefined)
      
      inline def setKeysOnly(value: Boolean): Self = StObject.set(x, "keysOnly", value.asInstanceOf[js.Any])
      
      inline def setKeysOnlyUndefined: Self = StObject.set(x, "keysOnly", js.undefined)
      
      inline def setMaxElisions(value: Double): Self = StObject.set(x, "maxElisions", value.asInstanceOf[js.Any])
      
      inline def setMaxElisionsUndefined: Self = StObject.set(x, "maxElisions", js.undefined)
      
      inline def setOutputKeys(value: js.Array[String]): Self = StObject.set(x, "outputKeys", value.asInstanceOf[js.Any])
      
      inline def setOutputKeysUndefined: Self = StObject.set(x, "outputKeys", js.undefined)
      
      inline def setOutputKeysVarargs(value: String*): Self = StObject.set(x, "outputKeys", js.Array(value*))
      
      inline def setOutputNewOnly(value: Boolean): Self = StObject.set(x, "outputNewOnly", value.asInstanceOf[js.Any])
      
      inline def setOutputNewOnlyUndefined: Self = StObject.set(x, "outputNewOnly", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait DiffStringOptions
    extends StObject
       with DiffOptions {
    
    var color: js.UndefOr[Boolean] = js.undefined
  }
  object DiffStringOptions {
    
    inline def apply(): DiffStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiffStringOptions]
    }
    
    extension [Self <: DiffStringOptions](x: Self) {
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
}

package typings.lerc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait InputOffset extends StObject {
    
    var inputOffset: js.UndefOr[Double] = js.undefined
  }
  object InputOffset {
    
    inline def apply(): InputOffset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputOffset]
    }
    
    extension [Self <: InputOffset](x: Self) {
      
      inline def setInputOffset(value: Double): Self = StObject.set(x, "inputOffset", value.asInstanceOf[js.Any])
      
      inline def setInputOffsetUndefined: Self = StObject.set(x, "inputOffset", js.undefined)
    }
  }
  
  trait LocateFile extends StObject {
    
    var locateFile: js.UndefOr[
        js.Function2[/* wasmFileName */ js.UndefOr[String], /* scriptDir */ js.UndefOr[String], String]
      ] = js.undefined
  }
  object LocateFile {
    
    inline def apply(): LocateFile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocateFile]
    }
    
    extension [Self <: LocateFile](x: Self) {
      
      inline def setLocateFile(value: (/* wasmFileName */ js.UndefOr[String], /* scriptDir */ js.UndefOr[String]) => String): Self = StObject.set(x, "locateFile", js.Any.fromFunction2(value))
      
      inline def setLocateFileUndefined: Self = StObject.set(x, "locateFile", js.undefined)
    }
  }
  
  trait MaxValues extends StObject {
    
    var maxValues: js.typedarray.Float64Array
    
    var minValues: js.typedarray.Float64Array
  }
  object MaxValues {
    
    inline def apply(maxValues: js.typedarray.Float64Array, minValues: js.typedarray.Float64Array): MaxValues = {
      val __obj = js.Dynamic.literal(maxValues = maxValues.asInstanceOf[js.Any], minValues = minValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxValues]
    }
    
    extension [Self <: MaxValues](x: Self) {
      
      inline def setMaxValues(value: js.typedarray.Float64Array): Self = StObject.set(x, "maxValues", value.asInstanceOf[js.Any])
      
      inline def setMinValues(value: js.typedarray.Float64Array): Self = StObject.set(x, "minValues", value.asInstanceOf[js.Any])
    }
  }
}

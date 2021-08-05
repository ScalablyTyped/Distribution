package typings.json2csv

import typings.json2csv.baseMod.Json2CsvTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flattenMod {
  
  @JSImport("json2csv/transforms/flatten", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flatten(): Json2CsvTransform[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[Json2CsvTransform[js.Any, js.Any]]
  inline def flatten(options: FlattenOptions): Json2CsvTransform[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(options.asInstanceOf[js.Any]).asInstanceOf[Json2CsvTransform[js.Any, js.Any]]
  
  trait FlattenOptions extends StObject {
    
    var arrays: js.UndefOr[Boolean] = js.undefined
    
    var objects: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object FlattenOptions {
    
    inline def apply(): FlattenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlattenOptions]
    }
    
    extension [Self <: FlattenOptions](x: Self) {
      
      inline def setArrays(value: Boolean): Self = StObject.set(x, "arrays", value.asInstanceOf[js.Any])
      
      inline def setArraysUndefined: Self = StObject.set(x, "arrays", js.undefined)
      
      inline def setObjects(value: Boolean): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
}

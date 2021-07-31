package typings.json2csv

import typings.json2csv.baseMod.Json2CsvTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flattenMod {
  
  @JSImport("json2csv/transforms/flatten", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def flatten(): Json2CsvTransform[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[Json2CsvTransform[js.Any, js.Any]]
  @scala.inline
  def flatten(options: FlattenOptions): Json2CsvTransform[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(options.asInstanceOf[js.Any]).asInstanceOf[Json2CsvTransform[js.Any, js.Any]]
  
  trait FlattenOptions extends StObject {
    
    var arrays: js.UndefOr[Boolean] = js.undefined
    
    var objects: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object FlattenOptions {
    
    @scala.inline
    def apply(): FlattenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlattenOptions]
    }
    
    @scala.inline
    implicit class FlattenOptionsMutableBuilder[Self <: FlattenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrays(value: Boolean): Self = StObject.set(x, "arrays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArraysUndefined: Self = StObject.set(x, "arrays", js.undefined)
      
      @scala.inline
      def setObjects(value: Boolean): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
}

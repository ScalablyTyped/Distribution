package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineExportSVGOptions extends StObject {
  
  var raw: js.UndefOr[Boolean] = js.undefined
}
object SparklineExportSVGOptions {
  
  inline def apply(): SparklineExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineExportSVGOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SparklineExportSVGOptions] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}

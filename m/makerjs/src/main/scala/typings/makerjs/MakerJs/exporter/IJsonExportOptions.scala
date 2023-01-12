package typings.makerjs.MakerJs.exporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for JSON export.
  */
trait IJsonExportOptions
  extends StObject
     with IExportOptions {
  
  /**
    * Optional number of characters to indent after a newline.
    */
  var indentation: js.UndefOr[Double] = js.undefined
}
object IJsonExportOptions {
  
  inline def apply(): IJsonExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJsonExportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IJsonExportOptions] (val x: Self) extends AnyVal {
    
    inline def setIndentation(value: Double): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
    
    inline def setIndentationUndefined: Self = StObject.set(x, "indentation", js.undefined)
  }
}

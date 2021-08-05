package typings.jqueryAjaxfile.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bail extends StObject {
  
  var bail: js.UndefOr[Boolean] = js.undefined
  
  var grep: js.UndefOr[RegExp] = js.undefined
  
  var reporter: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var ui: js.UndefOr[String] = js.undefined
}
object Bail {
  
  inline def apply(): Bail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bail]
  }
  
  extension [Self <: Bail](x: Self) {
    
    inline def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
    
    inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
    
    inline def setGrep(value: RegExp): Self = StObject.set(x, "grep", value.asInstanceOf[js.Any])
    
    inline def setGrepUndefined: Self = StObject.set(x, "grep", js.undefined)
    
    inline def setReporter(value: String): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUi(value: String): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}

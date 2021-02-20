package typings.jqueryAjaxfile.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bail extends StObject {
  
  var bail: js.UndefOr[Boolean] = js.native
  
  var grep: js.UndefOr[RegExp] = js.native
  
  var reporter: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var ui: js.UndefOr[String] = js.native
}
object Bail {
  
  @scala.inline
  def apply(): Bail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bail]
  }
  
  @scala.inline
  implicit class BailMutableBuilder[Self <: Bail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
    
    @scala.inline
    def setGrep(value: RegExp): Self = StObject.set(x, "grep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrepUndefined: Self = StObject.set(x, "grep", js.undefined)
    
    @scala.inline
    def setReporter(value: String): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUi(value: String): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
  }
}

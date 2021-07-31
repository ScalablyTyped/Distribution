package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XSpec extends StObject {
  
  var id: Double
  
  def runs(): Unit
}
object XSpec {
  
  @scala.inline
  def apply(id: Double, runs: () => Unit): XSpec = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], runs = js.Any.fromFunction0(runs))
    __obj.asInstanceOf[XSpec]
  }
  
  @scala.inline
  implicit class XSpecMutableBuilder[Self <: XSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuns(value: () => Unit): Self = StObject.set(x, "runs", js.Any.fromFunction0(value))
  }
}

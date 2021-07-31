package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideSize extends StObject {
  
  var side: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object SideSize {
  
  @scala.inline
  def apply(): SideSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SideSize]
  }
  
  @scala.inline
  implicit class SideSizeMutableBuilder[Self <: SideSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}

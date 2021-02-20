package typings.log4js.mod

import typings.log4js.log4jsStrings.dummy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DummyLayout extends Layout {
  
  var `type`: dummy = js.native
}
object DummyLayout {
  
  @scala.inline
  def apply(`type`: dummy): DummyLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DummyLayout]
  }
  
  @scala.inline
  implicit class DummyLayoutMutableBuilder[Self <: DummyLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: dummy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

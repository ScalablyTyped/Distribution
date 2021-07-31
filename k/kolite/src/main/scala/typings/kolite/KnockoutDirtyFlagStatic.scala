package typings.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutDirtyFlagStatic extends StObject {
  
  def DirtyFlag(): DirtyFlagResult
  @JSName("DirtyFlag")
  var DirtyFlag_Original: DirtyFlag
}
object KnockoutDirtyFlagStatic {
  
  @scala.inline
  def apply(DirtyFlag: DirtyFlag): KnockoutDirtyFlagStatic = {
    val __obj = js.Dynamic.literal(DirtyFlag = DirtyFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutDirtyFlagStatic]
  }
  
  @scala.inline
  implicit class KnockoutDirtyFlagStaticMutableBuilder[Self <: KnockoutDirtyFlagStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirtyFlag(value: DirtyFlag): Self = StObject.set(x, "DirtyFlag", value.asInstanceOf[js.Any])
  }
}

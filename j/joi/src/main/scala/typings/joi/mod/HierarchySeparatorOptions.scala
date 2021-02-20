package typings.joi.mod

import typings.joi.joiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchySeparatorOptions extends StObject {
  
  /**
    * overrides the default `.` hierarchy separator. Set to false to treat the key as a literal value.
    *
    * @default '.'
    */
  var separator: js.UndefOr[String | `false`] = js.native
}
object HierarchySeparatorOptions {
  
  @scala.inline
  def apply(): HierarchySeparatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchySeparatorOptions]
  }
  
  @scala.inline
  implicit class HierarchySeparatorOptionsMutableBuilder[Self <: HierarchySeparatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeparator(value: String | `false`): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}

package typings.grommet

import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsNameValuePairMod {
  
  @JSImport("grommet/components/NameValuePair", "NameValuePair")
  @js.native
  val NameValuePair: FC[NameValuePairProps] = js.native
  
  trait NameValuePairProps extends StObject {
    
    var children: js.UndefOr[String | Double | Element] = js.undefined
    
    var name: js.UndefOr[String | Element] = js.undefined
  }
  object NameValuePairProps {
    
    inline def apply(): NameValuePairProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NameValuePairProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NameValuePairProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: String | Double | Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setName(value: String | Element): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type NameValuePairType = NameValuePairProps
}

package typings.grommet.anon

import typings.grommet.boxMod.BoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyContainer extends StObject {
  
  var body: js.UndefOr[BoxProps] = js.native
  
  var container: js.UndefOr[BoxProps] = js.native
  
  var footer: js.UndefOr[BoxProps] = js.native
  
  var header: js.UndefOr[BoxProps] = js.native
}
object BodyContainer {
  
  @scala.inline
  def apply(): BodyContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyContainer]
  }
  
  @scala.inline
  implicit class BodyContainerMutableBuilder[Self <: BodyContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BoxProps): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setContainer(value: BoxProps): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setFooter(value: BoxProps): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setHeader(value: BoxProps): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}

package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKernelspecMetadata extends PartialJSONObject {
  
  var display_name: String = js.native
  
  var name: String = js.native
}
object IKernelspecMetadata {
  
  @scala.inline
  def apply(display_name: String, name: String): IKernelspecMetadata = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelspecMetadata]
  }
  
  @scala.inline
  implicit class IKernelspecMetadataMutableBuilder[Self <: IKernelspecMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

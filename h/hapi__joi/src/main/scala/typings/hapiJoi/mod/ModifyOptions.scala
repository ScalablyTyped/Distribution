package typings.hapiJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyOptions extends StObject {
  
  var each: js.UndefOr[Boolean] = js.native
  
  var once: js.UndefOr[Boolean] = js.native
  
  var ref: js.UndefOr[Boolean] = js.native
  
  var schema: js.UndefOr[Boolean] = js.native
}
object ModifyOptions {
  
  @scala.inline
  def apply(): ModifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyOptions]
  }
  
  @scala.inline
  implicit class ModifyOptionsMutableBuilder[Self <: ModifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEach(value: Boolean): Self = StObject.set(x, "each", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    @scala.inline
    def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    @scala.inline
    def setRef(value: Boolean): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setSchema(value: Boolean): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}

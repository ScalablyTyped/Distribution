package typings.gulpJsonValidator

import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-json-validator", JSImport.Namespace)
  @js.native
  def apply(): ReadWriteStream = js.native
  @JSImport("gulp-json-validator", JSImport.Namespace)
  @js.native
  def apply(option: GulpJsonValidatorOptions): ReadWriteStream = js.native
  
  @js.native
  trait GulpJsonValidatorOptions extends StObject {
    
    var allowDuplicatedKeys: js.UndefOr[Boolean] = js.native
  }
  object GulpJsonValidatorOptions {
    
    @scala.inline
    def apply(): GulpJsonValidatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GulpJsonValidatorOptions]
    }
    
    @scala.inline
    implicit class GulpJsonValidatorOptionsMutableBuilder[Self <: GulpJsonValidatorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDuplicatedKeys(value: Boolean): Self = StObject.set(x, "allowDuplicatedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDuplicatedKeysUndefined: Self = StObject.set(x, "allowDuplicatedKeys", js.undefined)
    }
  }
}

package typings.grammarkdown.grammarkdownMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostBaseOptions extends StObject {
  
  var ignoreCase: js.UndefOr[Boolean] = js.native
  
  var knownGrammars: js.UndefOr[Record[String, String]] = js.native
  
  var useBuiltinGrammars: js.UndefOr[Boolean] = js.native
}
object HostBaseOptions {
  
  @scala.inline
  def apply(): HostBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostBaseOptions]
  }
  
  @scala.inline
  implicit class HostBaseOptionsMutableBuilder[Self <: HostBaseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    @scala.inline
    def setKnownGrammars(value: Record[String, String]): Self = StObject.set(x, "knownGrammars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnownGrammarsUndefined: Self = StObject.set(x, "knownGrammars", js.undefined)
    
    @scala.inline
    def setUseBuiltinGrammars(value: Boolean): Self = StObject.set(x, "useBuiltinGrammars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBuiltinGrammarsUndefined: Self = StObject.set(x, "useBuiltinGrammars", js.undefined)
  }
}

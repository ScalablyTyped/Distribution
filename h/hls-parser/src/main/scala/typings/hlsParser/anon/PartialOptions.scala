package typings.hlsParser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<hls-parser.hls-parser.Options> */
trait PartialOptions extends StObject {
  
  var strictMode: js.UndefOr[Boolean] = js.undefined
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
  }
}

package typings.materializeCss.anon

import typings.materializeCss.M.TapTarget
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.TapTargetOptions> */
trait PartialTapTargetOptions extends StObject {
  
  var onClose: js.UndefOr[js.ThisFunction1[/* this */ TapTarget, /* origin */ Element, Unit]] = js.undefined
  
  var onOpen: js.UndefOr[js.ThisFunction1[/* this */ TapTarget, /* origin */ Element, Unit]] = js.undefined
}
object PartialTapTargetOptions {
  
  @scala.inline
  def apply(): PartialTapTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTapTargetOptions]
  }
  
  @scala.inline
  implicit class PartialTapTargetOptionsMutableBuilder[Self <: PartialTapTargetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnClose(value: js.ThisFunction1[/* this */ TapTarget, /* origin */ Element, Unit]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnOpen(value: js.ThisFunction1[/* this */ TapTarget, /* origin */ Element, Unit]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
  }
}

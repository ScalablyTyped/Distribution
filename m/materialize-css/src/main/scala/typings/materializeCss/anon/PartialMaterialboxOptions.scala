package typings.materializeCss.anon

import typings.materializeCss.M.Materialbox
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.MaterialboxOptions> */
@js.native
trait PartialMaterialboxOptions extends StObject {
  
  var inDuration: js.UndefOr[Double] = js.native
  
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]] = js.native
  
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]] = js.native
  
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]] = js.native
  
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]] = js.native
  
  var outDuration: js.UndefOr[Double] = js.native
}
object PartialMaterialboxOptions {
  
  @scala.inline
  def apply(): PartialMaterialboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMaterialboxOptions]
  }
  
  @scala.inline
  implicit class PartialMaterialboxOptionsMutableBuilder[Self <: PartialMaterialboxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInDurationUndefined: Self = StObject.set(x, "inDuration", js.undefined)
    
    @scala.inline
    def setOnCloseEnd(value: js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]): Self = StObject.set(x, "onCloseEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseEndUndefined: Self = StObject.set(x, "onCloseEnd", js.undefined)
    
    @scala.inline
    def setOnCloseStart(value: js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]): Self = StObject.set(x, "onCloseStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseStartUndefined: Self = StObject.set(x, "onCloseStart", js.undefined)
    
    @scala.inline
    def setOnOpenEnd(value: js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]): Self = StObject.set(x, "onOpenEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOpenEndUndefined: Self = StObject.set(x, "onOpenEnd", js.undefined)
    
    @scala.inline
    def setOnOpenStart(value: js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]): Self = StObject.set(x, "onOpenStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOpenStartUndefined: Self = StObject.set(x, "onOpenStart", js.undefined)
    
    @scala.inline
    def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutDurationUndefined: Self = StObject.set(x, "outDuration", js.undefined)
  }
}

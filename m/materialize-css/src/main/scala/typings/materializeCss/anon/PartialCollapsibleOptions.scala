package typings.materializeCss.anon

import typings.materializeCss.M.Collapsible
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.CollapsibleOptions> */
trait PartialCollapsibleOptions extends StObject {
  
  var accordion: js.UndefOr[Boolean] = js.undefined
  
  var inDuration: js.UndefOr[Double] = js.undefined
  
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ Collapsible, /* el */ Element, Unit]] = js.undefined
  
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ Collapsible, /* el */ Element, Unit]] = js.undefined
  
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ Collapsible, /* el */ Element, Unit]] = js.undefined
  
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ Collapsible, /* el */ Element, Unit]] = js.undefined
  
  var outDuration: js.UndefOr[Double] = js.undefined
}
object PartialCollapsibleOptions {
  
  inline def apply(): PartialCollapsibleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCollapsibleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCollapsibleOptions] (val x: Self) extends AnyVal {
    
    inline def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
    
    inline def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setInDurationUndefined: Self = StObject.set(x, "inDuration", js.undefined)
    
    inline def setOnCloseEnd(value: js.ThisFunction1[/* this */ Collapsible, /* el */ Element, Unit]): Self = StObject.set(x, "onCloseEnd", value.asInstanceOf[js.Any])
    
    inline def setOnCloseEndUndefined: Self = StObject.set(x, "onCloseEnd", js.undefined)
    
    inline def setOnCloseStart(value: js.ThisFunction1[/* this */ Collapsible, /* el */ Element, Unit]): Self = StObject.set(x, "onCloseStart", value.asInstanceOf[js.Any])
    
    inline def setOnCloseStartUndefined: Self = StObject.set(x, "onCloseStart", js.undefined)
    
    inline def setOnOpenEnd(value: js.ThisFunction1[/* this */ Collapsible, /* el */ Element, Unit]): Self = StObject.set(x, "onOpenEnd", value.asInstanceOf[js.Any])
    
    inline def setOnOpenEndUndefined: Self = StObject.set(x, "onOpenEnd", js.undefined)
    
    inline def setOnOpenStart(value: js.ThisFunction1[/* this */ Collapsible, /* el */ Element, Unit]): Self = StObject.set(x, "onOpenStart", value.asInstanceOf[js.Any])
    
    inline def setOnOpenStartUndefined: Self = StObject.set(x, "onOpenStart", js.undefined)
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    inline def setOutDurationUndefined: Self = StObject.set(x, "outDuration", js.undefined)
  }
}

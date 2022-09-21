package typings.materializecssMaterialize.anon

import typings.materializecssMaterialize.M.Dropdown
import typings.materializecssMaterialize.materializecssMaterializeStrings.left
import typings.materializecssMaterialize.materializecssMaterializeStrings.right
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@materializecss/materialize.M.DropdownOptions> */
trait PartialDropdownOptions extends StObject {
  
  var alignment: js.UndefOr[left | right] = js.undefined
  
  var autoTrigger: js.UndefOr[Boolean] = js.undefined
  
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  
  var constrainWidth: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[Element] = js.undefined
  
  var coverTrigger: js.UndefOr[Boolean] = js.undefined
  
  var hover: js.UndefOr[Boolean] = js.undefined
  
  var inDuration: js.UndefOr[Double] = js.undefined
  
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]] = js.undefined
  
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]] = js.undefined
  
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]] = js.undefined
  
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]] = js.undefined
  
  var outDuration: js.UndefOr[Double] = js.undefined
}
object PartialDropdownOptions {
  
  inline def apply(): PartialDropdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDropdownOptions]
  }
  
  extension [Self <: PartialDropdownOptions](x: Self) {
    
    inline def setAlignment(value: left | right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAutoTrigger(value: Boolean): Self = StObject.set(x, "autoTrigger", value.asInstanceOf[js.Any])
    
    inline def setAutoTriggerUndefined: Self = StObject.set(x, "autoTrigger", js.undefined)
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    inline def setConstrainWidth(value: Boolean): Self = StObject.set(x, "constrainWidth", value.asInstanceOf[js.Any])
    
    inline def setConstrainWidthUndefined: Self = StObject.set(x, "constrainWidth", js.undefined)
    
    inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCoverTrigger(value: Boolean): Self = StObject.set(x, "coverTrigger", value.asInstanceOf[js.Any])
    
    inline def setCoverTriggerUndefined: Self = StObject.set(x, "coverTrigger", js.undefined)
    
    inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setInDurationUndefined: Self = StObject.set(x, "inDuration", js.undefined)
    
    inline def setOnCloseEnd(value: js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]): Self = StObject.set(x, "onCloseEnd", value.asInstanceOf[js.Any])
    
    inline def setOnCloseEndUndefined: Self = StObject.set(x, "onCloseEnd", js.undefined)
    
    inline def setOnCloseStart(value: js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]): Self = StObject.set(x, "onCloseStart", value.asInstanceOf[js.Any])
    
    inline def setOnCloseStartUndefined: Self = StObject.set(x, "onCloseStart", js.undefined)
    
    inline def setOnOpenEnd(value: js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]): Self = StObject.set(x, "onOpenEnd", value.asInstanceOf[js.Any])
    
    inline def setOnOpenEndUndefined: Self = StObject.set(x, "onOpenEnd", js.undefined)
    
    inline def setOnOpenStart(value: js.ThisFunction1[/* this */ Dropdown, /* el */ Element, Unit]): Self = StObject.set(x, "onOpenStart", value.asInstanceOf[js.Any])
    
    inline def setOnOpenStartUndefined: Self = StObject.set(x, "onOpenStart", js.undefined)
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    inline def setOutDurationUndefined: Self = StObject.set(x, "outDuration", js.undefined)
  }
}

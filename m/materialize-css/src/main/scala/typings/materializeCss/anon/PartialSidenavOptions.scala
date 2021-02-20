package typings.materializeCss.anon

import typings.materializeCss.M.Sidenav
import typings.materializeCss.materializeCssStrings.left
import typings.materializeCss.materializeCssStrings.right
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.SidenavOptions> */
@js.native
trait PartialSidenavOptions extends StObject {
  
  var draggable: js.UndefOr[Boolean] = js.native
  
  var edge: js.UndefOr[left | right] = js.native
  
  var inDuration: js.UndefOr[Double] = js.native
  
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]] = js.native
  
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]] = js.native
  
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]] = js.native
  
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]] = js.native
  
  var outDuration: js.UndefOr[Double] = js.native
}
object PartialSidenavOptions {
  
  @scala.inline
  def apply(): PartialSidenavOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSidenavOptions]
  }
  
  @scala.inline
  implicit class PartialSidenavOptionsMutableBuilder[Self <: PartialSidenavOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setEdge(value: left | right): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    @scala.inline
    def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInDurationUndefined: Self = StObject.set(x, "inDuration", js.undefined)
    
    @scala.inline
    def setOnCloseEnd(value: js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]): Self = StObject.set(x, "onCloseEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseEndUndefined: Self = StObject.set(x, "onCloseEnd", js.undefined)
    
    @scala.inline
    def setOnCloseStart(value: js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]): Self = StObject.set(x, "onCloseStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCloseStartUndefined: Self = StObject.set(x, "onCloseStart", js.undefined)
    
    @scala.inline
    def setOnOpenEnd(value: js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]): Self = StObject.set(x, "onOpenEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOpenEndUndefined: Self = StObject.set(x, "onOpenEnd", js.undefined)
    
    @scala.inline
    def setOnOpenStart(value: js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]): Self = StObject.set(x, "onOpenStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOpenStartUndefined: Self = StObject.set(x, "onOpenStart", js.undefined)
    
    @scala.inline
    def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutDurationUndefined: Self = StObject.set(x, "outDuration", js.undefined)
  }
}

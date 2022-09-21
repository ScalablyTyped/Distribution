package typings.materializecssMaterialize.anon

import typings.materializecssMaterialize.M.Materialbox
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@materializecss/materialize.M.MaterialboxOptions> */
trait PartialMaterialboxOptions extends StObject {
  
  var inDuration: js.UndefOr[Double] = js.undefined
  
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]] = js.undefined
  
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]] = js.undefined
  
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]] = js.undefined
  
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]] = js.undefined
  
  var outDuration: js.UndefOr[Double] = js.undefined
}
object PartialMaterialboxOptions {
  
  inline def apply(): PartialMaterialboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMaterialboxOptions]
  }
  
  extension [Self <: PartialMaterialboxOptions](x: Self) {
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setInDurationUndefined: Self = StObject.set(x, "inDuration", js.undefined)
    
    inline def setOnCloseEnd(value: js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]): Self = StObject.set(x, "onCloseEnd", value.asInstanceOf[js.Any])
    
    inline def setOnCloseEndUndefined: Self = StObject.set(x, "onCloseEnd", js.undefined)
    
    inline def setOnCloseStart(value: js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]): Self = StObject.set(x, "onCloseStart", value.asInstanceOf[js.Any])
    
    inline def setOnCloseStartUndefined: Self = StObject.set(x, "onCloseStart", js.undefined)
    
    inline def setOnOpenEnd(value: js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]): Self = StObject.set(x, "onOpenEnd", value.asInstanceOf[js.Any])
    
    inline def setOnOpenEndUndefined: Self = StObject.set(x, "onOpenEnd", js.undefined)
    
    inline def setOnOpenStart(value: js.ThisFunction1[/* this */ Materialbox, /* el */ Element, Unit]): Self = StObject.set(x, "onOpenStart", value.asInstanceOf[js.Any])
    
    inline def setOnOpenStartUndefined: Self = StObject.set(x, "onOpenStart", js.undefined)
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    inline def setOutDurationUndefined: Self = StObject.set(x, "outDuration", js.undefined)
  }
}

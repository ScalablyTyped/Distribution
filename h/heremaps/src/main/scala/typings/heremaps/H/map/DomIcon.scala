package typings.heremaps.H.map

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A visual representation of the H.map.DomMarker.
  */
trait DomIcon extends StObject
object DomIcon {
  
  /**
    * Options used to initialize a DomIcon
    * @property onAttach {function(Element, H.map.DomIcon, H.map.DomMarker)=} - A callback which is invoked before a clone of the icon's element is appended and displayed on the map.
    * This callback can be used to setup the clone.
    * @property onDetach {function(Element, H.map.DomIcon, H.map.DomMarker)=} - A callback which is invoked after a clone of the icon's element is removed from the map.
    * This callback can be used to clean up the clone.
    */
  trait Options extends StObject {
    
    var onAttach: js.UndefOr[js.Function3[/* el */ Element, /* icon */ DomIcon, /* marker */ DomMarker, Unit]] = js.undefined
    
    var onDetach: js.UndefOr[js.Function3[/* el */ Element, /* icon */ DomIcon, /* marker */ DomMarker, Unit]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnAttach(value: (/* el */ Element, /* icon */ DomIcon, /* marker */ DomMarker) => Unit): Self = StObject.set(x, "onAttach", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnAttachUndefined: Self = StObject.set(x, "onAttach", js.undefined)
      
      @scala.inline
      def setOnDetach(value: (/* el */ Element, /* icon */ DomIcon, /* marker */ DomMarker) => Unit): Self = StObject.set(x, "onDetach", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnDetachUndefined: Self = StObject.set(x, "onDetach", js.undefined)
    }
  }
}

package typings.materialTopAppBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCTopAppBarAdapter extends StObject {
    
    /**
      * Adds a class to the root Element.
      */
    def addClass(className: String): Unit
    
    /**
      * Gets the height of the top app bar.
      */
    def getTopAppBarHeight(): Double
    
    def getTotalActionItems(): Double
    
    def getViewportScrollY(): Double
    
    /**
      * Returns true if the root Element contains the given class.
      */
    def hasClass(className: String): Boolean
    
    /**
      * Emits an event when the navigation icon is clicked.
      */
    def notifyNavigationIconClicked(): Unit
    
    /**
      * Removes a class from the root Element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Sets the specified inline style property on the root Element to the given value.
      */
    def setStyle(property: String, value: String): Unit
  }
  object MDCTopAppBarAdapter {
    
    inline def apply(
      addClass: String => Unit,
      getTopAppBarHeight: () => Double,
      getTotalActionItems: () => Double,
      getViewportScrollY: () => Double,
      hasClass: String => Boolean,
      notifyNavigationIconClicked: () => Unit,
      removeClass: String => Unit,
      setStyle: (String, String) => Unit
    ): MDCTopAppBarAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getTopAppBarHeight = js.Any.fromFunction0(getTopAppBarHeight), getTotalActionItems = js.Any.fromFunction0(getTotalActionItems), getViewportScrollY = js.Any.fromFunction0(getViewportScrollY), hasClass = js.Any.fromFunction1(hasClass), notifyNavigationIconClicked = js.Any.fromFunction0(notifyNavigationIconClicked), removeClass = js.Any.fromFunction1(removeClass), setStyle = js.Any.fromFunction2(setStyle))
      __obj.asInstanceOf[MDCTopAppBarAdapter]
    }
    
    extension [Self <: MDCTopAppBarAdapter](x: Self) {
      
      inline def setAddClass(value: String => Unit): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setGetTopAppBarHeight(value: () => Double): Self = StObject.set(x, "getTopAppBarHeight", js.Any.fromFunction0(value))
      
      inline def setGetTotalActionItems(value: () => Double): Self = StObject.set(x, "getTotalActionItems", js.Any.fromFunction0(value))
      
      inline def setGetViewportScrollY(value: () => Double): Self = StObject.set(x, "getViewportScrollY", js.Any.fromFunction0(value))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setNotifyNavigationIconClicked(value: () => Unit): Self = StObject.set(x, "notifyNavigationIconClicked", js.Any.fromFunction0(value))
      
      inline def setRemoveClass(value: String => Unit): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setSetStyle(value: (String, String) => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
    }
  }
}

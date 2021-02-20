package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveUI {
  
  type BacklightUI = BaseUI
  
  @js.native
  trait BaseUI extends StObject {
    
    def appendTo(wrapper: HTMLElement): Unit = js.native
    
    def build(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getOffset(): js.Object = js.native
    
    def getPosition(): js.Object = js.native
    
    def getSize(): js.Object = js.native
    
    var hot: Core = js.native
    
    def isAppended(): Boolean = js.native
    
    def isBuilt(): Boolean = js.native
    
    def setOffset(top: Double, left: Double): Unit = js.native
    
    def setPosition(top: Double, left: Double): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
    
    var state: Double = js.native
  }
  object BaseUI {
    
    @scala.inline
    def apply(
      appendTo: HTMLElement => Unit,
      build: () => Unit,
      destroy: () => Unit,
      getOffset: () => js.Object,
      getPosition: () => js.Object,
      getSize: () => js.Object,
      hot: Core,
      isAppended: () => Boolean,
      isBuilt: () => Boolean,
      setOffset: (Double, Double) => Unit,
      setPosition: (Double, Double) => Unit,
      setSize: (Double, Double) => Unit,
      state: Double
    ): BaseUI = {
      val __obj = js.Dynamic.literal(appendTo = js.Any.fromFunction1(appendTo), build = js.Any.fromFunction0(build), destroy = js.Any.fromFunction0(destroy), getOffset = js.Any.fromFunction0(getOffset), getPosition = js.Any.fromFunction0(getPosition), getSize = js.Any.fromFunction0(getSize), hot = hot.asInstanceOf[js.Any], isAppended = js.Any.fromFunction0(isAppended), isBuilt = js.Any.fromFunction0(isBuilt), setOffset = js.Any.fromFunction2(setOffset), setPosition = js.Any.fromFunction2(setPosition), setSize = js.Any.fromFunction2(setSize), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseUI]
    }
    
    @scala.inline
    implicit class BaseUIMutableBuilder[Self <: BaseUI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTo(value: HTMLElement => Unit): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBuild(value: () => Unit): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOffset(value: () => js.Object): Self = StObject.set(x, "getOffset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPosition(value: () => js.Object): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSize(value: () => js.Object): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHot(value: Core): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAppended(value: () => Boolean): Self = StObject.set(x, "isAppended", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsBuilt(value: () => Boolean): Self = StObject.set(x, "isBuilt", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetOffset(value: (Double, Double) => Unit): Self = StObject.set(x, "setOffset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetPosition(value: (Double, Double) => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetSize(value: (Double, Double) => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type GuidelineUI = BaseUI
}

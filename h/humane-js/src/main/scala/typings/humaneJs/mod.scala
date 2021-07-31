package typings.humaneJs

import org.scalablytyped.runtime.Shortcut
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("humane-js", JSImport.Namespace)
  @js.native
  val ^ : Humane = js.native
  
  @js.native
  trait Humane extends StObject {
    
    var addnCls: String = js.native
    
    var baseCls: String = js.native
    
    var clickToClose: Boolean = js.native
    
    var container: Element = js.native
    
    def create(): Humane = js.native
    def create(options: HumaneOptions): Humane = js.native
    
    var error: js.UndefOr[SpawnLogFunction] = js.native
    
    var info: js.UndefOr[SpawnLogFunction] = js.native
    
    def log(message: logMessage): Humane = js.native
    def log(message: logMessage, callback: Unit, options: HumaneMessageOptions): Humane = js.native
    def log(message: logMessage, callback: completionCallback): Humane = js.native
    def log(message: logMessage, callback: completionCallback, options: HumaneMessageOptions): Humane = js.native
    def log(message: logMessage, options: HumaneMessageOptions): Humane = js.native
    
    var queue: js.Array[String] = js.native
    
    def remove(): Unit = js.native
    def remove(cb: completionCallback): Unit = js.native
    
    def spawn(options: HumaneMessageOptions): SpawnLogFunction = js.native
    
    var timeout: Double = js.native
    
    var waitForMove: Boolean = js.native
  }
  
  trait HumaneMessageOptions extends StObject {
    
    var addnCls: js.UndefOr[String] = js.undefined
    
    var clickToClose: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var waitForMove: js.UndefOr[Boolean] = js.undefined
  }
  object HumaneMessageOptions {
    
    @scala.inline
    def apply(): HumaneMessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HumaneMessageOptions]
    }
    
    @scala.inline
    implicit class HumaneMessageOptionsMutableBuilder[Self <: HumaneMessageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddnCls(value: String): Self = StObject.set(x, "addnCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddnClsUndefined: Self = StObject.set(x, "addnCls", js.undefined)
      
      @scala.inline
      def setClickToClose(value: Boolean): Self = StObject.set(x, "clickToClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickToCloseUndefined: Self = StObject.set(x, "clickToClose", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWaitForMove(value: Boolean): Self = StObject.set(x, "waitForMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForMoveUndefined: Self = StObject.set(x, "waitForMove", js.undefined)
    }
  }
  
  trait HumaneOptions
    extends StObject
       with HumaneMessageOptions {
    
    var baseCls: js.UndefOr[String] = js.undefined
    
    var container: js.UndefOr[Element] = js.undefined
  }
  object HumaneOptions {
    
    @scala.inline
    def apply(): HumaneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HumaneOptions]
    }
    
    @scala.inline
    implicit class HumaneOptionsMutableBuilder[Self <: HumaneOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseCls(value: String): Self = StObject.set(x, "baseCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseClsUndefined: Self = StObject.set(x, "baseCls", js.undefined)
      
      @scala.inline
      def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    }
  }
  
  @js.native
  trait SpawnLogFunction extends StObject {
    
    def apply(message: logMessage): Humane = js.native
    def apply(message: logMessage, callback: Unit, options: HumaneMessageOptions): Humane = js.native
    def apply(message: logMessage, callback: completionCallback): Humane = js.native
    def apply(message: logMessage, callback: completionCallback, options: HumaneMessageOptions): Humane = js.native
    def apply(message: logMessage, options: HumaneMessageOptions): Humane = js.native
  }
  
  type _To = Humane
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Humane = ^
  
  type completionCallback = js.Function0[Unit]
  
  type logMessage = String | js.Array[String]
}

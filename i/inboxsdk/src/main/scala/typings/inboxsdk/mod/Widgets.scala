package typings.inboxsdk.mod

import typings.inboxsdk.inboxsdkStrings.PRIMARY_ACTION
import typings.inboxsdk.inboxsdkStrings.SECONDARY_ACTION
import typings.inboxsdk.inboxsdkStrings.closing
import typings.inboxsdk.inboxsdkStrings.destroy
import typings.inboxsdk.inboxsdkStrings.minimize
import typings.inboxsdk.inboxsdkStrings.preautoclose
import typings.inboxsdk.inboxsdkStrings.restore
import typings.inboxsdk.inboxsdkStrings.slideAnimationDone
import typings.inboxsdk.mod.Common.PreAutoCloseEvent
import typings.inboxsdk.mod.Compose.ComposeView
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Widgets {
  
  @js.native
  trait DrawerOptions extends StObject {
    
    var chrome: js.UndefOr[Boolean] = js.native
    
    var closeWithCompose: js.UndefOr[Boolean] = js.native
    
    var composeView: js.UndefOr[ComposeView] = js.native
    
    var el: HTMLElement = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object DrawerOptions {
    
    @scala.inline
    def apply(el: HTMLElement): DrawerOptions = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerOptions]
    }
    
    @scala.inline
    implicit class DrawerOptionsMutableBuilder[Self <: DrawerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChrome(value: Boolean): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
      
      @scala.inline
      def setCloseWithCompose(value: Boolean): Self = StObject.set(x, "closeWithCompose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseWithComposeUndefined: Self = StObject.set(x, "closeWithCompose", js.undefined)
      
      @scala.inline
      def setComposeView(value: ComposeView): Self = StObject.set(x, "composeView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComposeViewUndefined: Self = StObject.set(x, "composeView", js.undefined)
      
      @scala.inline
      def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait DrawerView extends StObject {
    
    def associateComposeView(composeView: ComposeView, closeWithCompose: Boolean): Unit = js.native
    
    def close(): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def disassociateComposeView(): Unit = js.native
    
    @JSName("on")
    def on_closing(name: closing, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_preautoclose(name: preautoclose, cb: js.Function1[/* event */ PreAutoCloseEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_slideAnimationDone(name: slideAnimationDone, cb: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  trait ModalButtonDescriptor extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    def onClick(): Unit = js.native
    
    var orderHint: js.UndefOr[Double] = js.native
    
    var text: String = js.native
    
    var title: String = js.native
    
    var `type`: js.UndefOr[PRIMARY_ACTION | SECONDARY_ACTION] = js.native
  }
  object ModalButtonDescriptor {
    
    @scala.inline
    def apply(onClick: () => Unit, text: String, title: String): ModalButtonDescriptor = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalButtonDescriptor]
    }
    
    @scala.inline
    implicit class ModalButtonDescriptorMutableBuilder[Self <: ModalButtonDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: PRIMARY_ACTION | SECONDARY_ACTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ModalOptions extends StObject {
    
    var buttons: js.UndefOr[js.Array[ModalButtonDescriptor]] = js.native
    
    var chrome: js.UndefOr[Boolean] = js.native
    
    var constrainTitleWidth: js.UndefOr[Boolean] = js.native
    
    var el: HTMLElement = js.native
    
    var showCloseButton: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object ModalOptions {
    
    @scala.inline
    def apply(el: HTMLElement): ModalOptions = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalOptions]
    }
    
    @scala.inline
    implicit class ModalOptionsMutableBuilder[Self <: ModalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtons(value: js.Array[ModalButtonDescriptor]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: ModalButtonDescriptor*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setChrome(value: Boolean): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
      
      @scala.inline
      def setConstrainTitleWidth(value: Boolean): Self = StObject.set(x, "constrainTitleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstrainTitleWidthUndefined: Self = StObject.set(x, "constrainTitleWidth", js.undefined)
      
      @scala.inline
      def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait ModalView extends StObject {
    
    def close(): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
  }
  object ModalView {
    
    @scala.inline
    def apply(close: () => Unit, destroyed: Boolean, on: (destroy, js.Function0[Unit]) => Unit): ModalView = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroyed = destroyed.asInstanceOf[js.Any], on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[ModalView]
    }
    
    @scala.inline
    implicit class ModalViewMutableBuilder[Self <: ModalView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait MoleButtonDescriptor extends StObject {
    
    var iconClass: js.UndefOr[String] = js.native
    
    var iconUrl: String = js.native
    
    def onClick(): Unit = js.native
    
    var title: String = js.native
  }
  object MoleButtonDescriptor {
    
    @scala.inline
    def apply(iconUrl: String, onClick: () => Unit, title: String): MoleButtonDescriptor = {
      val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoleButtonDescriptor]
    }
    
    @scala.inline
    implicit class MoleButtonDescriptorMutableBuilder[Self <: MoleButtonDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MoleOptions extends StObject {
    
    var chrome: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var el: HTMLElement = js.native
    
    var minimizedTitleEl: js.UndefOr[HTMLElement] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var titleButtons: js.UndefOr[js.Array[MoleButtonDescriptor]] = js.native
    
    var titleEl: js.UndefOr[HTMLElement] = js.native
  }
  object MoleOptions {
    
    @scala.inline
    def apply(el: HTMLElement): MoleOptions = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoleOptions]
    }
    
    @scala.inline
    implicit class MoleOptionsMutableBuilder[Self <: MoleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChrome(value: Boolean): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimizedTitleEl(value: HTMLElement): Self = StObject.set(x, "minimizedTitleEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimizedTitleElUndefined: Self = StObject.set(x, "minimizedTitleEl", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleButtons(value: js.Array[MoleButtonDescriptor]): Self = StObject.set(x, "titleButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleButtonsUndefined: Self = StObject.set(x, "titleButtons", js.undefined)
      
      @scala.inline
      def setTitleButtonsVarargs(value: MoleButtonDescriptor*): Self = StObject.set(x, "titleButtons", js.Array(value :_*))
      
      @scala.inline
      def setTitleEl(value: HTMLElement): Self = StObject.set(x, "titleEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleElUndefined: Self = StObject.set(x, "titleEl", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait MoleView extends StObject {
    
    def close(): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def getMinimized(): Boolean = js.native
    
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_minimize(name: minimize, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_restore(name: restore, cb: js.Function0[Unit]): Unit = js.native
    
    def setMinimized(minimized: Boolean): Unit = js.native
    
    def setTitle(text: String): Unit = js.native
  }
  
  @js.native
  trait WidgetsInstance extends StObject {
    
    def showDrawerView(options: DrawerOptions): DrawerView = js.native
    
    def showModalView(options: ModalOptions): ModalView = js.native
    
    def showMoleView(options: MoleOptions): MoleView = js.native
  }
  object WidgetsInstance {
    
    @scala.inline
    def apply(
      showDrawerView: DrawerOptions => DrawerView,
      showModalView: ModalOptions => ModalView,
      showMoleView: MoleOptions => MoleView
    ): WidgetsInstance = {
      val __obj = js.Dynamic.literal(showDrawerView = js.Any.fromFunction1(showDrawerView), showModalView = js.Any.fromFunction1(showModalView), showMoleView = js.Any.fromFunction1(showMoleView))
      __obj.asInstanceOf[WidgetsInstance]
    }
    
    @scala.inline
    implicit class WidgetsInstanceMutableBuilder[Self <: WidgetsInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowDrawerView(value: DrawerOptions => DrawerView): Self = StObject.set(x, "showDrawerView", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowModalView(value: ModalOptions => ModalView): Self = StObject.set(x, "showModalView", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowMoleView(value: MoleOptions => MoleView): Self = StObject.set(x, "showMoleView", js.Any.fromFunction1(value))
    }
  }
}

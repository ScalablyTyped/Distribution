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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Widgets {
  
  trait DrawerOptions extends StObject {
    
    var chrome: js.UndefOr[Boolean] = js.undefined
    
    var closeWithCompose: js.UndefOr[Boolean] = js.undefined
    
    var composeView: js.UndefOr[ComposeView] = js.undefined
    
    var el: HTMLElement
    
    var title: js.UndefOr[String] = js.undefined
  }
  object DrawerOptions {
    
    inline def apply(el: HTMLElement): DrawerOptions = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawerOptions] (val x: Self) extends AnyVal {
      
      inline def setChrome(value: Boolean): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      inline def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
      
      inline def setCloseWithCompose(value: Boolean): Self = StObject.set(x, "closeWithCompose", value.asInstanceOf[js.Any])
      
      inline def setCloseWithComposeUndefined: Self = StObject.set(x, "closeWithCompose", js.undefined)
      
      inline def setComposeView(value: ComposeView): Self = StObject.set(x, "composeView", value.asInstanceOf[js.Any])
      
      inline def setComposeViewUndefined: Self = StObject.set(x, "composeView", js.undefined)
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait DrawerView extends StObject {
    
    def associateComposeView(composeView: ComposeView, closeWithCompose: Boolean): Unit = js.native
    
    def close(): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def disassociateComposeView(): Unit = js.native
    
    def on(name: destroy | slideAnimationDone | closing, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_preautoclose(name: preautoclose, cb: js.Function1[/* event */ PreAutoCloseEvent, Unit]): Unit = js.native
  }
  
  trait ModalButtonDescriptor extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    def onClick(): Unit
    
    var orderHint: js.UndefOr[Double] = js.undefined
    
    var text: String
    
    var title: String
    
    var `type`: js.UndefOr[PRIMARY_ACTION | SECONDARY_ACTION] = js.undefined
  }
  object ModalButtonDescriptor {
    
    inline def apply(onClick: () => Unit, text: String, title: String): ModalButtonDescriptor = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalButtonDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalButtonDescriptor] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOrderHint(value: Double): Self = StObject.set(x, "orderHint", value.asInstanceOf[js.Any])
      
      inline def setOrderHintUndefined: Self = StObject.set(x, "orderHint", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: PRIMARY_ACTION | SECONDARY_ACTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ModalOptions extends StObject {
    
    var buttons: js.UndefOr[js.Array[ModalButtonDescriptor]] = js.undefined
    
    var chrome: js.UndefOr[Boolean] = js.undefined
    
    var constrainTitleWidth: js.UndefOr[Boolean] = js.undefined
    
    var el: HTMLElement
    
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object ModalOptions {
    
    inline def apply(el: HTMLElement): ModalOptions = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalOptions] (val x: Self) extends AnyVal {
      
      inline def setButtons(value: js.Array[ModalButtonDescriptor]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: ModalButtonDescriptor*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setChrome(value: Boolean): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      inline def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
      
      inline def setConstrainTitleWidth(value: Boolean): Self = StObject.set(x, "constrainTitleWidth", value.asInstanceOf[js.Any])
      
      inline def setConstrainTitleWidthUndefined: Self = StObject.set(x, "constrainTitleWidth", js.undefined)
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ModalView extends StObject {
    
    def close(): Unit
    
    var destroyed: Boolean
    
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
  }
  object ModalView {
    
    inline def apply(close: () => Unit, destroyed: Boolean, on: (destroy, js.Function0[Unit]) => Unit): ModalView = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroyed = destroyed.asInstanceOf[js.Any], on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[ModalView]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalView] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      inline def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
  
  trait MoleButtonDescriptor extends StObject {
    
    var iconClass: js.UndefOr[String] = js.undefined
    
    var iconUrl: String
    
    def onClick(): Unit
    
    var title: String
  }
  object MoleButtonDescriptor {
    
    inline def apply(iconUrl: String, onClick: () => Unit, title: String): MoleButtonDescriptor = {
      val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoleButtonDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MoleButtonDescriptor] (val x: Self) extends AnyVal {
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait MoleOptions extends StObject {
    
    var chrome: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var el: HTMLElement
    
    var minimizedTitleEl: js.UndefOr[HTMLElement] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleButtons: js.UndefOr[js.Array[MoleButtonDescriptor]] = js.undefined
    
    var titleEl: js.UndefOr[HTMLElement] = js.undefined
  }
  object MoleOptions {
    
    inline def apply(el: HTMLElement): MoleOptions = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MoleOptions] (val x: Self) extends AnyVal {
      
      inline def setChrome(value: Boolean): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      inline def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setMinimizedTitleEl(value: HTMLElement): Self = StObject.set(x, "minimizedTitleEl", value.asInstanceOf[js.Any])
      
      inline def setMinimizedTitleElUndefined: Self = StObject.set(x, "minimizedTitleEl", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleButtons(value: js.Array[MoleButtonDescriptor]): Self = StObject.set(x, "titleButtons", value.asInstanceOf[js.Any])
      
      inline def setTitleButtonsUndefined: Self = StObject.set(x, "titleButtons", js.undefined)
      
      inline def setTitleButtonsVarargs(value: MoleButtonDescriptor*): Self = StObject.set(x, "titleButtons", js.Array(value*))
      
      inline def setTitleEl(value: HTMLElement): Self = StObject.set(x, "titleEl", value.asInstanceOf[js.Any])
      
      inline def setTitleElUndefined: Self = StObject.set(x, "titleEl", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait MoleView extends StObject {
    
    def close(): Unit
    
    var destroyed: Boolean
    
    def getMinimized(): Boolean
    
    def on(name: destroy | minimize | restore, cb: js.Function0[Unit]): Unit
    
    def setMinimized(minimized: Boolean): Unit
    
    def setTitle(text: String): Unit
  }
  object MoleView {
    
    inline def apply(
      close: () => Unit,
      destroyed: Boolean,
      getMinimized: () => Boolean,
      on: (destroy | minimize | restore, js.Function0[Unit]) => Unit,
      setMinimized: Boolean => Unit,
      setTitle: String => Unit
    ): MoleView = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroyed = destroyed.asInstanceOf[js.Any], getMinimized = js.Any.fromFunction0(getMinimized), on = js.Any.fromFunction2(on), setMinimized = js.Any.fromFunction1(setMinimized), setTitle = js.Any.fromFunction1(setTitle))
      __obj.asInstanceOf[MoleView]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MoleView] (val x: Self) extends AnyVal {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      inline def setGetMinimized(value: () => Boolean): Self = StObject.set(x, "getMinimized", js.Any.fromFunction0(value))
      
      inline def setOn(value: (destroy | minimize | restore, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setSetMinimized(value: Boolean => Unit): Self = StObject.set(x, "setMinimized", js.Any.fromFunction1(value))
      
      inline def setSetTitle(value: String => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    }
  }
  
  trait WidgetsInstance extends StObject {
    
    def showDrawerView(options: DrawerOptions): DrawerView
    
    def showModalView(options: ModalOptions): ModalView
    
    def showMoleView(options: MoleOptions): MoleView
  }
  object WidgetsInstance {
    
    inline def apply(
      showDrawerView: DrawerOptions => DrawerView,
      showModalView: ModalOptions => ModalView,
      showMoleView: MoleOptions => MoleView
    ): WidgetsInstance = {
      val __obj = js.Dynamic.literal(showDrawerView = js.Any.fromFunction1(showDrawerView), showModalView = js.Any.fromFunction1(showModalView), showMoleView = js.Any.fromFunction1(showMoleView))
      __obj.asInstanceOf[WidgetsInstance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WidgetsInstance] (val x: Self) extends AnyVal {
      
      inline def setShowDrawerView(value: DrawerOptions => DrawerView): Self = StObject.set(x, "showDrawerView", js.Any.fromFunction1(value))
      
      inline def setShowModalView(value: ModalOptions => ModalView): Self = StObject.set(x, "showModalView", js.Any.fromFunction1(value))
      
      inline def setShowMoleView(value: MoleOptions => MoleView): Self = StObject.set(x, "showMoleView", js.Any.fromFunction1(value))
    }
  }
}

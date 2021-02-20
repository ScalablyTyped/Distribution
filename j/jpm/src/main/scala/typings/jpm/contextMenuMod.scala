package typings.jpm

import typings.jpm.anon.AccessKey
import typings.jpm.anon.ContentScript
import typings.jpm.anon.DocumentType
import typings.std.Array
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMenuMod {
  
  @JSImport("sdk/context-menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Item extends ItemMenuSeparator {
    
    var contentScript: js.UndefOr[String | js.Array[String]] = js.native
    
    var contentScriptFile: js.UndefOr[String | js.Array[String]] = js.native
    
    var context: ItemContext = js.native
    
    var data: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    var image: String | URL = js.native
    
    var label: String = js.native
    
    var parentMenu: js.UndefOr[Menu] = js.native
  }
  object Item {
    
    @JSImport("sdk/context-menu", "Item")
    @js.native
    def apply(options: AccessKey): Item = js.native
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentScript(value: String | js.Array[String]): Self = StObject.set(x, "contentScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentScriptFile(value: String | js.Array[String]): Self = StObject.set(x, "contentScriptFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentScriptFileUndefined: Self = StObject.set(x, "contentScriptFile", js.undefined)
      
      @scala.inline
      def setContentScriptFileVarargs(value: String*): Self = StObject.set(x, "contentScriptFile", js.Array(value :_*))
      
      @scala.inline
      def setContentScriptUndefined: Self = StObject.set(x, "contentScript", js.undefined)
      
      @scala.inline
      def setContentScriptVarargs(value: String*): Self = StObject.set(x, "contentScript", js.Array(value :_*))
      
      @scala.inline
      def setContext(value: ItemContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setImage(value: String | URL): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentMenu(value: Menu): Self = StObject.set(x, "parentMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentMenuUndefined: Self = StObject.set(x, "parentMenu", js.undefined)
    }
  }
  
  @js.native
  trait Menu extends ItemMenuSeparator {
    
    def addItem(item: ItemMenuSeparator): Unit = js.native
    
    var contentScript: String | js.Array[String] = js.native
    
    var contentScriptFile: String | js.Array[String] = js.native
    
    var context: ItemContext = js.native
    
    def destroy(): Unit = js.native
    
    var image: String | URL = js.native
    
    var items: js.Array[ItemMenuSeparator] = js.native
    
    var label: String = js.native
    
    var parentMenu: js.UndefOr[Menu] = js.native
    
    def removeItem(item: ItemMenuSeparator): Unit = js.native
  }
  object Menu {
    
    @JSImport("sdk/context-menu", "Menu")
    @js.native
    def apply(options: ContentScript): Menu = js.native
    
    @scala.inline
    implicit class MenuMutableBuilder[Self <: Menu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddItem(value: ItemMenuSeparator => Unit): Self = StObject.set(x, "addItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContentScript(value: String | js.Array[String]): Self = StObject.set(x, "contentScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentScriptFile(value: String | js.Array[String]): Self = StObject.set(x, "contentScriptFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentScriptFileVarargs(value: String*): Self = StObject.set(x, "contentScriptFile", js.Array(value :_*))
      
      @scala.inline
      def setContentScriptVarargs(value: String*): Self = StObject.set(x, "contentScript", js.Array(value :_*))
      
      @scala.inline
      def setContext(value: ItemContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setImage(value: String | URL): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[ItemMenuSeparator]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: ItemMenuSeparator*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentMenu(value: Menu): Self = StObject.set(x, "parentMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentMenuUndefined: Self = StObject.set(x, "parentMenu", js.undefined)
      
      @scala.inline
      def setRemoveItem(value: ItemMenuSeparator => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PageContext extends Context {
    
    def apply(): js.Object = js.native
  }
  @JSImport("sdk/context-menu", "PageContext")
  @js.native
  def PageContext: PageContext = js.native
  @scala.inline
  def PageContext_=(x: PageContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PageContext")(x.asInstanceOf[js.Any])
  
  @js.native
  trait PredicateContext extends Context {
    
    def apply(predicateFunction: js.Function1[/* context */ DocumentType, Boolean]): js.Object = js.native
  }
  @JSImport("sdk/context-menu", "PredicateContext")
  @js.native
  def PredicateContext: PredicateContext = js.native
  @scala.inline
  def PredicateContext_=(x: PredicateContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PredicateContext")(x.asInstanceOf[js.Any])
  
  @js.native
  trait SelectionContext extends Context {
    
    def apply(): js.Object = js.native
  }
  @JSImport("sdk/context-menu", "SelectionContext")
  @js.native
  def SelectionContext: SelectionContext = js.native
  @scala.inline
  def SelectionContext_=(x: SelectionContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectionContext")(x.asInstanceOf[js.Any])
  
  @js.native
  trait SelectorContext extends Context {
    
    def apply(selector: String): js.Object = js.native
  }
  @JSImport("sdk/context-menu", "SelectorContext")
  @js.native
  def SelectorContext: SelectorContext = js.native
  @scala.inline
  def SelectorContext_=(x: SelectorContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectorContext")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Separator extends ItemMenuSeparator {
    
    def destroy(): Unit = js.native
    
    var parentMenu: Menu = js.native
  }
  object Separator {
    
    @JSImport("sdk/context-menu", "Separator")
    @js.native
    def apply(): Separator = js.native
    
    @scala.inline
    implicit class SeparatorMutableBuilder[Self <: Separator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParentMenu(value: Menu): Self = StObject.set(x, "parentMenu", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait URLContext extends Context {
    
    def apply(matchPattern: String): js.Object = js.native
  }
  @JSImport("sdk/context-menu", "URLContext")
  @js.native
  def URLContext: URLContext = js.native
  @scala.inline
  def URLContext_=(x: URLContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URLContext")(x.asInstanceOf[js.Any])
  
  /**
    * The context determines when the menu item will be visible
    */
  @js.native
  trait Context extends StObject
  
  @js.native
  trait ItemContext extends Array[Context] {
    
    // a list of Context that also has add, remove methods
    def add(context: Context): Unit = js.native
    
    def remove(context: Context): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jpm.contextMenuMod.Item
    - typings.jpm.contextMenuMod.Menu
    - typings.jpm.contextMenuMod.Separator
  */
  trait ItemMenuSeparator extends StObject
  object ItemMenuSeparator {
    
    @scala.inline
    def Item(context: ItemContext, data: js.Any, destroy: () => Unit, image: String | URL, label: String): typings.jpm.contextMenuMod.Item = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), image = image.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jpm.contextMenuMod.Item]
    }
    
    @scala.inline
    def Menu(
      addItem: ItemMenuSeparator => Unit,
      contentScript: String | js.Array[String],
      contentScriptFile: String | js.Array[String],
      context: ItemContext,
      destroy: () => Unit,
      image: String | URL,
      items: js.Array[ItemMenuSeparator],
      label: String,
      removeItem: ItemMenuSeparator => Unit
    ): typings.jpm.contextMenuMod.Menu = {
      val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction1(addItem), contentScript = contentScript.asInstanceOf[js.Any], contentScriptFile = contentScriptFile.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), image = image.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem))
      __obj.asInstanceOf[typings.jpm.contextMenuMod.Menu]
    }
    
    @scala.inline
    def Separator(destroy: () => Unit, parentMenu: Menu): typings.jpm.contextMenuMod.Separator = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), parentMenu = parentMenu.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jpm.contextMenuMod.Separator]
    }
  }
}

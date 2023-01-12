package typings.jss

import org.scalablytyped.runtime.Instantiable0
import typings.jss.mod.Classes
import typings.jss.mod.ContainerRule
import typings.jss.mod.CreateGenerateIdOptions
import typings.jss.mod.CreateGenerateId_
import typings.jss.mod.GenerateId
import typings.jss.mod.InsertionPoint
import typings.jss.mod.Jss
import typings.jss.mod.Plugin
import typings.jss.mod.Renderer
import typings.jss.mod.Rule
import typings.jss.mod.StyleSheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[Renderer]
  
  trait Next[T] extends StObject {
    
    def next(value: T): Unit
  }
  object Next {
    
    inline def apply[T](next: T => Unit): Next[T] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Next[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Next[?], T] (val x: Self & Next[T]) extends AnyVal {
      
      inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Partial<jss.jss.JssOptions> */
  trait PartialJssOptions extends StObject {
    
    var Renderer: js.UndefOr[Instantiable | Null] = js.undefined
    
    var createGenerateId: js.UndefOr[CreateGenerateId_] = js.undefined
    
    var id: js.UndefOr[CreateGenerateIdOptions] = js.undefined
    
    var insertionPoint: js.UndefOr[InsertionPoint] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  }
  object PartialJssOptions {
    
    inline def apply(): PartialJssOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialJssOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialJssOptions] (val x: Self) extends AnyVal {
      
      inline def setCreateGenerateId(value: /* options */ js.UndefOr[CreateGenerateIdOptions] => GenerateId): Self = StObject.set(x, "createGenerateId", js.Any.fromFunction1(value))
      
      inline def setCreateGenerateIdUndefined: Self = StObject.set(x, "createGenerateId", js.undefined)
      
      inline def setId(value: CreateGenerateIdOptions): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInsertionPoint(value: InsertionPoint): Self = StObject.set(x, "insertionPoint", value.asInstanceOf[js.Any])
      
      inline def setInsertionPointUndefined: Self = StObject.set(x, "insertionPoint", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setRenderer(value: Instantiable): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererNull: Self = StObject.set(x, "Renderer", null)
      
      inline def setRendererUndefined: Self = StObject.set(x, "Renderer", js.undefined)
    }
  }
  
  /* Inlined std.Partial<jss.jss.RuleOptions> */
  trait PartialRuleOptions extends StObject {
    
    var Renderer: js.UndefOr[typings.jss.mod.Renderer] = js.undefined
    
    var classes: js.UndefOr[Classes[String]] = js.undefined
    
    var generateId: js.UndefOr[GenerateId] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var jss: js.UndefOr[Jss] = js.undefined
    
    var parent: js.UndefOr[ContainerRule | (StyleSheet[String | Double | js.Symbol])] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
    
    var sheet: js.UndefOr[StyleSheet[String | Double | js.Symbol]] = js.undefined
  }
  object PartialRuleOptions {
    
    inline def apply(): PartialRuleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRuleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRuleOptions] (val x: Self) extends AnyVal {
      
      inline def setClasses(value: Classes[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateId", js.Any.fromFunction2(value))
      
      inline def setGenerateIdUndefined: Self = StObject.set(x, "generateId", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      inline def setJssUndefined: Self = StObject.set(x, "jss", js.undefined)
      
      inline def setParent(value: ContainerRule | (StyleSheet[String | Double | js.Symbol])): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setRenderer(value: Renderer): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "Renderer", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSheet(value: StyleSheet[String | Double | js.Symbol]): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      inline def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
    }
  }
  
  trait Unsubscribe extends StObject {
    
    def unsubscribe(): Unit
  }
  object Unsubscribe {
    
    inline def apply(unsubscribe: () => Unit): Unsubscribe = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Unsubscribe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unsubscribe] (val x: Self) extends AnyVal {
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
}

package typings.marko

import typings.marko.asyncMod.Async
import typings.marko.componentMod.Component
import typings.marko.markoBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncVDOMBuilderMod {
  
  @js.native
  trait AsyncVDOMBuilder extends Async {
    
    def apply(): this.type = js.native
    def apply(globalData: js.Any): this.type = js.native
    def apply(globalData: js.Any, parentNode: js.Any): this.type = js.native
    def apply(globalData: js.Any, parentNode: js.Any, parentOut: js.Any): this.type = js.native
    def apply(globalData: js.Any, parentNode: Unit, parentOut: js.Any): this.type = js.native
    def apply(globalData: Unit, parentNode: js.Any): this.type = js.native
    def apply(globalData: Unit, parentNode: js.Any, parentOut: js.Any): this.type = js.native
    def apply(globalData: Unit, parentNode: Unit, parentOut: js.Any): this.type = js.native
    
    def bc(component: Component): js.Any = js.native
    
    def be(tagName: String, attrs: js.Any, key: String, component: Component, childCount: Double): this.type = js.native
    def be(
      tagName: String,
      attrs: js.Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Double
    ): this.type = js.native
    def be(
      tagName: String,
      attrs: js.Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Double,
      props: js.Any
    ): this.type = js.native
    def be(
      tagName: String,
      attrs: js.Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Unit,
      props: js.Any
    ): this.type = js.native
    
    def bed(tagName: String, attrs: js.Any, key: String, component: Component, childCount: Double): this.type = js.native
    def bed(
      tagName: String,
      attrs: js.Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Double
    ): this.type = js.native
    def bed(
      tagName: String,
      attrs: js.Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Double,
      props: js.Any
    ): this.type = js.native
    def bed(
      tagName: String,
      attrs: js.Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Unit,
      props: js.Any
    ): this.type = js.native
    
    def beginElement(tagName: String, attrs: js.Any, key: String, component: Component, childCount: Double): this.type = js.native
    def beginElement(
      tagName: String,
      attrs: js.Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Double
    ): this.type = js.native
    def beginElement(
      tagName: String,
      attrs: js.Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Double,
      props: js.Any
    ): this.type = js.native
    def beginElement(
      tagName: String,
      attrs: js.Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Unit,
      props: js.Any
    ): this.type = js.native
    
    def comment(comment: js.Any): this.type = js.native
    
    var data: js.Any = js.native
    
    def ed(tagName: String, attrs: js.Any, key: String, component: Component, childCount: Double): js.Any = js.native
    def ed(
      tagName: String,
      attrs: js.Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Double
    ): js.Any = js.native
    def ed(
      tagName: String,
      attrs: js.Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Double,
      props: js.Any
    ): js.Any = js.native
    def ed(
      tagName: String,
      attrs: js.Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Unit,
      props: js.Any
    ): js.Any = js.native
    
    def ee(): Unit = js.native
    
    def element(tagName: String, attrs: js.Any, key: String, component: Component, childCount: Double): js.Any = js.native
    def element(
      tagName: String,
      attrs: js.Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Double
    ): js.Any = js.native
    def element(
      tagName: String,
      attrs: js.Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Double,
      props: js.Any
    ): js.Any = js.native
    def element(
      tagName: String,
      attrs: js.Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Unit,
      props: js.Any
    ): js.Any = js.native
    
    def end(): this.type = js.native
    
    var global: js.Any = js.native
    
    def h(): this.type = js.native
    def h(html: String): this.type = js.native
    
    def html(): this.type = js.native
    def html(html: String): this.type = js.native
    
    var isVDOM: `true` = js.native
    
    def n(node: js.Any, component: Component): this.type = js.native
    
    def node(node: js.Any): this.type = js.native
    
    def t(text: js.Any): this.type | String | Unit = js.native
    
    def text(text: js.Any): this.type | String | Unit = js.native
  }
}

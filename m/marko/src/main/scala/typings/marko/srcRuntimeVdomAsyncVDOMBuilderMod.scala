package typings.marko

import typings.marko.markoBooleans.`true`
import typings.marko.srcComponentsComponentMod.Component
import typings.marko.srcRuntimeAsyncMod.Async
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRuntimeVdomAsyncVDOMBuilderMod {
  
  @js.native
  trait AsyncVDOMBuilder extends Async {
    
    def apply(): this.type = js.native
    def apply(globalData: Any): this.type = js.native
    def apply(globalData: Any, parentNode: Any): this.type = js.native
    def apply(globalData: Any, parentNode: Any, parentOut: Any): this.type = js.native
    def apply(globalData: Any, parentNode: Unit, parentOut: Any): this.type = js.native
    def apply(globalData: Unit, parentNode: Any): this.type = js.native
    def apply(globalData: Unit, parentNode: Any, parentOut: Any): this.type = js.native
    def apply(globalData: Unit, parentNode: Unit, parentOut: Any): this.type = js.native
    
    def bc(component: Component): Any = js.native
    
    def be(tagName: String, attrs: Any, key: String, component: Component, childCount: Double): this.type = js.native
    def be(tagName: String, attrs: Any, key: String, component: Component, childCount: Double, flags: Double): this.type = js.native
    def be(
      tagName: String,
      attrs: Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Double,
      props: Any
    ): this.type = js.native
    def be(
      tagName: String,
      attrs: Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Unit,
      props: Any
    ): this.type = js.native
    
    def bed(tagName: String, attrs: Any, key: String, component: Component, childCount: Double): this.type = js.native
    def bed(tagName: String, attrs: Any, key: String, component: Component, childCount: Double, flags: Double): this.type = js.native
    def bed(
      tagName: String,
      attrs: Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Double,
      props: Any
    ): this.type = js.native
    def bed(
      tagName: String,
      attrs: Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Unit,
      props: Any
    ): this.type = js.native
    
    def beginElement(tagName: String, attrs: Any, key: String, component: Component, childCount: Double): this.type = js.native
    def beginElement(tagName: String, attrs: Any, key: String, component: Component, childCount: Double, flags: Double): this.type = js.native
    def beginElement(
      tagName: String,
      attrs: Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Double,
      props: Any
    ): this.type = js.native
    def beginElement(
      tagName: String,
      attrs: Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Unit,
      props: Any
    ): this.type = js.native
    
    def comment(comment: Any): this.type = js.native
    
    var data: Any = js.native
    
    def ed(tagName: String, attrs: Any, key: String, component: Component, childCount: Double): Any = js.native
    def ed(tagName: String, attrs: Any, key: String, component: Component, childCount: Double, flags: Double): Any = js.native
    def ed(
      tagName: String,
      attrs: Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Double,
      props: Any
    ): Any = js.native
    def ed(
      tagName: String,
      attrs: Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Unit,
      props: Any
    ): Any = js.native
    
    def ee(): Unit = js.native
    
    def element(tagName: String, attrs: Any, key: String, component: Component, childCount: Double): Any = js.native
    def element(tagName: String, attrs: Any, key: String, component: Component, childCount: Double, flags: Double): Any = js.native
    def element(
      tagName: String,
      attrs: Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Double,
      props: Any
    ): Any = js.native
    def element(
      tagName: String,
      attrs: Any,
      key: String,
      component: Component,
      childCount: Double,
      flags: Unit,
      props: Any
    ): Any = js.native
    
    def end(): this.type = js.native
    
    var global: Any = js.native
    
    def h(): this.type = js.native
    def h(html: String): this.type = js.native
    
    def html(): this.type = js.native
    def html(html: String): this.type = js.native
    
    var isVDOM: `true` = js.native
    
    def n(node: Any, component: Component): this.type = js.native
    
    def node(node: Any): this.type = js.native
    
    def t(text: Any): this.type | String | Unit = js.native
    
    def text(text: Any): this.type | String | Unit = js.native
  }
}

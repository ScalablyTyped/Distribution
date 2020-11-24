package typings.jss.mod

import typings.jss.jssBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plugin extends js.Object {
  
  var onChangeValue: js.UndefOr[
    js.Function3[/* value */ String, /* prop */ String, /* rule */ Rule, String | Null | `false`]
  ] = js.native
  
  var onCreateRule: js.UndefOr[
    js.Function3[/* name */ String, /* decl */ JssStyle, /* options */ RuleOptions, Rule]
  ] = js.native
  
  var onProcessRule: js.UndefOr[
    js.Function2[
      /* rule */ Rule, 
      /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
      Unit
    ]
  ] = js.native
  
  var onProcessSheet: js.UndefOr[
    js.Function1[/* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], Unit]
  ] = js.native
  
  var onProcessStyle: js.UndefOr[
    js.Function3[
      /* style */ JssStyle, 
      /* rule */ Rule, 
      /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
      JssStyle
    ]
  ] = js.native
  
  var onUpdate: js.UndefOr[
    js.Function3[
      /* data */ js.Object, 
      /* rule */ Rule, 
      /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]], 
      Unit
    ]
  ] = js.native
}
object Plugin {
  
  @scala.inline
  def apply(): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plugin]
  }
  
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnChangeValue(value: (/* value */ String, /* prop */ String, /* rule */ Rule) => String | Null | `false`): Self = this.set("onChangeValue", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnChangeValue: Self = this.set("onChangeValue", js.undefined)
    
    @scala.inline
    def setOnCreateRule(value: (/* name */ String, /* decl */ JssStyle, /* options */ RuleOptions) => Rule): Self = this.set("onCreateRule", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnCreateRule: Self = this.set("onCreateRule", js.undefined)
    
    @scala.inline
    def setOnProcessRule(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => Unit): Self = this.set("onProcessRule", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnProcessRule: Self = this.set("onProcessRule", js.undefined)
    
    @scala.inline
    def setOnProcessSheet(value: /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]] => Unit): Self = this.set("onProcessSheet", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnProcessSheet: Self = this.set("onProcessSheet", js.undefined)
    
    @scala.inline
    def setOnProcessStyle(
      value: (/* style */ JssStyle, /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => JssStyle
    ): Self = this.set("onProcessStyle", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnProcessStyle: Self = this.set("onProcessStyle", js.undefined)
    
    @scala.inline
    def setOnUpdate(
      value: (/* data */ js.Object, /* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String | Double | js.Symbol]]) => Unit
    ): Self = this.set("onUpdate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
  }
}

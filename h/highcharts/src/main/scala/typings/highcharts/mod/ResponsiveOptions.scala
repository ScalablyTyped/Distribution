package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsiveOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A set of rules for responsive
    * settings. The rules are executed from the top down.
    */
  var rules: js.UndefOr[js.Array[ResponsiveRulesOptions]] = js.undefined
}
object ResponsiveOptions {
  
  @scala.inline
  def apply(): ResponsiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveOptions]
  }
  
  @scala.inline
  implicit class ResponsiveOptionsMutableBuilder[Self <: ResponsiveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: js.Array[ResponsiveRulesOptions]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: ResponsiveRulesOptions*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}

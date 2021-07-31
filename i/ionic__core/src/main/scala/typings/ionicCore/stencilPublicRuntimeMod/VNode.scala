package typings.ionicCore.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VNode extends StObject {
  
  @JSName("$attrs$")
  var DollarattrsDollar: js.UndefOr[js.Any] = js.undefined
  
  @JSName("$children$")
  var DollarchildrenDollar: js.Array[VNode]
  
  @JSName("$elm$")
  var DollarelmDollar: js.Any
  
  @JSName("$flags$")
  var DollarflagsDollar: Double
  
  @JSName("$key$")
  var DollarkeyDollar: js.UndefOr[String | Double] = js.undefined
  
  @JSName("$name$")
  var DollarnameDollar: js.UndefOr[String] = js.undefined
  
  @JSName("$tag$")
  var DollartagDollar: String | Double | js.Function
  
  @JSName("$text$")
  var DollartextDollar: String
}
object VNode {
  
  @scala.inline
  def apply(
    DollarchildrenDollar: js.Array[VNode],
    DollarelmDollar: js.Any,
    DollarflagsDollar: Double,
    DollartagDollar: String | Double | js.Function,
    DollartextDollar: String
  ): VNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$children$")(DollarchildrenDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$elm$")(DollarelmDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$flags$")(DollarflagsDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$tag$")(DollartagDollar.asInstanceOf[js.Any])
    __obj.updateDynamic("$text$")(DollartextDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
  
  @scala.inline
  implicit class VNodeMutableBuilder[Self <: VNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDollarattrsDollar(value: js.Any): Self = StObject.set(x, "$attrs$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDollarattrsDollarUndefined: Self = StObject.set(x, "$attrs$", js.undefined)
    
    @scala.inline
    def setDollarchildrenDollar(value: js.Array[VNode]): Self = StObject.set(x, "$children$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDollarchildrenDollarVarargs(value: VNode*): Self = StObject.set(x, "$children$", js.Array(value :_*))
    
    @scala.inline
    def setDollarelmDollar(value: js.Any): Self = StObject.set(x, "$elm$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDollarflagsDollar(value: Double): Self = StObject.set(x, "$flags$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDollarkeyDollar(value: String | Double): Self = StObject.set(x, "$key$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDollarkeyDollarUndefined: Self = StObject.set(x, "$key$", js.undefined)
    
    @scala.inline
    def setDollarnameDollar(value: String): Self = StObject.set(x, "$name$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDollarnameDollarUndefined: Self = StObject.set(x, "$name$", js.undefined)
    
    @scala.inline
    def setDollartagDollar(value: String | Double | js.Function): Self = StObject.set(x, "$tag$", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDollartextDollar(value: String): Self = StObject.set(x, "$text$", value.asInstanceOf[js.Any])
  }
}

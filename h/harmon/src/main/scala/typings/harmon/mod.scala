package typings.harmon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("harmon", JSImport.Namespace)
  @js.native
  def apply(): js.Any = js.native
  @JSImport("harmon", JSImport.Namespace)
  @js.native
  def apply(
    reqSelectors: js.UndefOr[scala.Nothing],
    resSelectors: js.UndefOr[scala.Nothing],
    htmlOnly: Boolean
  ): js.Any = js.native
  @JSImport("harmon", JSImport.Namespace)
  @js.native
  def apply(reqSelectors: js.UndefOr[scala.Nothing], resSelectors: js.Array[Select]): js.Any = js.native
  @JSImport("harmon", JSImport.Namespace)
  @js.native
  def apply(reqSelectors: js.UndefOr[scala.Nothing], resSelectors: js.Array[Select], htmlOnly: Boolean): js.Any = js.native
  @JSImport("harmon", JSImport.Namespace)
  @js.native
  def apply(reqSelectors: js.Array[Select]): js.Any = js.native
  @JSImport("harmon", JSImport.Namespace)
  @js.native
  def apply(reqSelectors: js.Array[Select], resSelectors: js.UndefOr[scala.Nothing], htmlOnly: Boolean): js.Any = js.native
  @JSImport("harmon", JSImport.Namespace)
  @js.native
  def apply(reqSelectors: js.Array[Select], resSelectors: js.Array[Select]): js.Any = js.native
  @JSImport("harmon", JSImport.Namespace)
  @js.native
  def apply(reqSelectors: js.Array[Select], resSelectors: js.Array[Select], htmlOnly: Boolean): js.Any = js.native
  
  @js.native
  trait Select extends StObject {
    
    def func(node: js.Any): js.Any = js.native
    
    var query: String = js.native
  }
  object Select {
    
    @scala.inline
    def apply(func: js.Any => js.Any, query: String): Select = {
      val __obj = js.Dynamic.literal(func = js.Any.fromFunction1(func), query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Select]
    }
    
    @scala.inline
    implicit class SelectMutableBuilder[Self <: Select] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunc(value: js.Any => js.Any): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}

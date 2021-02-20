package typings.jsonic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonic", JSImport.Namespace)
  @js.native
  def apply(text: String): js.Any = js.native
  
  @JSImport("jsonic", "stringify")
  @js.native
  def stringify(`val`: js.Any): String = js.native
  @JSImport("jsonic", "stringify")
  @js.native
  def stringify(`val`: js.Any, opts: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var depth: js.UndefOr[Double] = js.native
    
    var exclude: js.UndefOr[js.Array[String]] = js.native
    
    var maxchars: js.UndefOr[Double] = js.native
    
    var maxitems: js.UndefOr[Double] = js.native
    
    var omit: js.UndefOr[js.Array[String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setMaxchars(value: Double): Self = StObject.set(x, "maxchars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxcharsUndefined: Self = StObject.set(x, "maxchars", js.undefined)
      
      @scala.inline
      def setMaxitems(value: Double): Self = StObject.set(x, "maxitems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxitemsUndefined: Self = StObject.set(x, "maxitems", js.undefined)
      
      @scala.inline
      def setOmit(value: js.Array[String]): Self = StObject.set(x, "omit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOmitUndefined: Self = StObject.set(x, "omit", js.undefined)
      
      @scala.inline
      def setOmitVarargs(value: String*): Self = StObject.set(x, "omit", js.Array(value :_*))
    }
  }
}

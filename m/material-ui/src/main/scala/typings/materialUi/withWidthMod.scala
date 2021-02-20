package typings.materialUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withWidthMod {
  
  @JSImport("material-ui/utils/withWidth", JSImport.Default)
  @js.native
  def default[C /* <: js.Function */](): js.Function1[/* component */ C, C] = js.native
  @JSImport("material-ui/utils/withWidth", JSImport.Default)
  @js.native
  def default[C /* <: js.Function */](options: Options): js.Function1[/* component */ C, C] = js.native
  
  @JSImport("material-ui/utils/withWidth", "LARGE")
  @js.native
  val LARGE: Double = js.native
  
  @JSImport("material-ui/utils/withWidth", "MEDIUM")
  @js.native
  val MEDIUM: Double = js.native
  
  @JSImport("material-ui/utils/withWidth", "SMALL")
  @js.native
  val SMALL: Double = js.native
  
  @js.native
  trait Options extends StObject {
    
    var largeWidth: js.UndefOr[Double] = js.native
    
    var mediumWidth: js.UndefOr[Double] = js.native
    
    var resizeInterval: js.UndefOr[Double] = js.native
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
      def setLargeWidth(value: Double): Self = StObject.set(x, "largeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeWidthUndefined: Self = StObject.set(x, "largeWidth", js.undefined)
      
      @scala.inline
      def setMediumWidth(value: Double): Self = StObject.set(x, "mediumWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediumWidthUndefined: Self = StObject.set(x, "mediumWidth", js.undefined)
      
      @scala.inline
      def setResizeInterval(value: Double): Self = StObject.set(x, "resizeInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeIntervalUndefined: Self = StObject.set(x, "resizeInterval", js.undefined)
    }
  }
}

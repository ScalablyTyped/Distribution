package typings.inkGradient

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.TopLevel
import typings.inkGradient.anon.Children
import typings.inkGradient.inkGradientStrings.atlas
import typings.inkGradient.inkGradientStrings.cristal
import typings.inkGradient.inkGradientStrings.fruit
import typings.inkGradient.inkGradientStrings.instagram
import typings.inkGradient.inkGradientStrings.mind
import typings.inkGradient.inkGradientStrings.morning
import typings.inkGradient.inkGradientStrings.passion
import typings.inkGradient.inkGradientStrings.pastel
import typings.inkGradient.inkGradientStrings.rainbow
import typings.inkGradient.inkGradientStrings.retro
import typings.inkGradient.inkGradientStrings.summer
import typings.inkGradient.inkGradientStrings.teen
import typings.inkGradient.inkGradientStrings.vice
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ink-gradient", JSImport.Namespace)
  @js.native
  val ^ : FC[GradientProps] = js.native
  
  type GradientProps = (XOR[PropsName, PropsColor]) with Children
  
  // note, object[] in this case refers to objects interpretable by tinycolor2
  @js.native
  trait PropsColor extends StObject {
    
    var colors: js.Array[js.Object | String] = js.native
  }
  object PropsColor {
    
    @scala.inline
    def apply(colors: js.Array[js.Object | String]): PropsColor = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsColor]
    }
    
    @scala.inline
    implicit class PropsColorMutableBuilder[Self <: PropsColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: js.Array[js.Object | String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsVarargs(value: (js.Object | String)*): Self = StObject.set(x, "colors", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PropsName extends StObject {
    
    var name: cristal | teen | mind | morning | vice | passion | fruit | instagram | atlas | retro | summer | pastel | rainbow = js.native
  }
  object PropsName {
    
    @scala.inline
    def apply(
      name: cristal | teen | mind | morning | vice | passion | fruit | instagram | atlas | retro | summer | pastel | rainbow
    ): PropsName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsName]
    }
    
    @scala.inline
    implicit class PropsNameMutableBuilder[Self <: PropsName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: cristal | teen | mind | morning | vice | passion | fruit | instagram | atlas | retro | summer | pastel | rainbow
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  // This needs to be updated when TypeScript enhances their support for mutual
  // exclusivity in properties. This edit I made will now throw errors when
  // a user gives both of the mutually exclusive props.
  type Without[T, U] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Exclude<keyof T, keyof U> ]:? never}
    */ typings.inkGradient.inkGradientStrings.Without with TopLevel[js.Any]
  
  type XOR[T, U] = T | U | ((Without[T, U]) with U) | ((Without[U, T]) with T)
  
  type _To = FC[GradientProps]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FC[GradientProps] = ^
}

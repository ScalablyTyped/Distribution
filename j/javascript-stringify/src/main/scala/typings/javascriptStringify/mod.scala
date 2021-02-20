package typings.javascriptStringify

import typings.javascriptStringify.typesMod.ToString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(
    value: js.Any,
    replacer: js.UndefOr[scala.Nothing],
    indent: js.UndefOr[scala.Nothing],
    options: Options
  ): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], indent: String): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], indent: String, options: Options): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], indent: Double): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], indent: Double, options: Options): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], indent: Null, options: Options): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: Null, indent: js.UndefOr[scala.Nothing], options: Options): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: Null, indent: String): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: Null, indent: String, options: Options): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: Null, indent: Double): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: Null, indent: Double, options: Options): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: Null, indent: Null, options: Options): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: ToString): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: ToString, indent: js.UndefOr[scala.Nothing], options: Options): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: ToString, indent: String): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: ToString, indent: String, options: Options): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: ToString, indent: Double): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: ToString, indent: Double, options: Options): js.UndefOr[String] = js.native
  @JSImport("javascript-stringify", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: ToString, indent: Null, options: Options): js.UndefOr[String] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var maxDepth: js.UndefOr[Double] = js.native
    
    var maxValues: js.UndefOr[Double] = js.native
    
    var references: js.UndefOr[Boolean] = js.native
    
    var skipUndefinedProperties: js.UndefOr[Boolean] = js.native
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
      def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      @scala.inline
      def setMaxValues(value: Double): Self = StObject.set(x, "maxValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValuesUndefined: Self = StObject.set(x, "maxValues", js.undefined)
      
      @scala.inline
      def setReferences(value: Boolean): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      @scala.inline
      def setSkipUndefinedProperties(value: Boolean): Self = StObject.set(x, "skipUndefinedProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUndefinedPropertiesUndefined: Self = StObject.set(x, "skipUndefinedProperties", js.undefined)
    }
  }
}

package typings.inflection

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("inflection", JSImport.Namespace)
  @js.native
  val ^ : Inflection = js.native
  
  @js.native
  trait Inflection extends StObject {
    
    def camelize(str: String): String = js.native
    def camelize(str: String, low_first_letter: Boolean): String = js.native
    
    def capitalize(str: String): String = js.native
    
    def classify(str: String): String = js.native
    
    def dasherize(str: String): String = js.native
    
    def demodulize(str: String): String = js.native
    
    def foreign_key(str: String): String = js.native
    def foreign_key(str: String, drop_id_ubar: Boolean): String = js.native
    
    def humanize(str: String): String = js.native
    def humanize(str: String, low_first_letter: Boolean): String = js.native
    
    def indexOf[T, T2](arr: js.Array[T], item: T2): Double = js.native
    def indexOf[T, T2](arr: js.Array[T], item: T2, from_index: Double): Double = js.native
    def indexOf[T, T2](
      arr: js.Array[T],
      item: T2,
      from_index: Double,
      compare_func: js.Function2[/* arr_item */ T, /* item */ T2, Boolean]
    ): Double = js.native
    def indexOf[T, T2](
      arr: js.Array[T],
      item: T2,
      from_index: Unit,
      compare_func: js.Function2[/* arr_item */ T, /* item */ T2, Boolean]
    ): Double = js.native
    
    def inflect(str: String, count: Double): String = js.native
    def inflect(str: String, count: Double, singular: String): String = js.native
    def inflect(str: String, count: Double, singular: String, plural: String): String = js.native
    def inflect(str: String, count: Double, singular: Unit, plural: String): String = js.native
    
    def ordinalize(str: String): String = js.native
    
    def pluralize(str: String): String = js.native
    def pluralize(str: String, plural: String): String = js.native
    
    def singularize(str: String): String = js.native
    def singularize(str: String, singular: String): String = js.native
    
    def tableize(str: String): String = js.native
    
    def titleize(str: String): String = js.native
    
    def transform(str: String, arr: js.Array[String]): String = js.native
    
    def underscore(str: String): String = js.native
    def underscore(str: String, all_upper_case: Boolean): String = js.native
    
    var version: String = js.native
  }
  
  type _To = Inflection
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Inflection = ^
}

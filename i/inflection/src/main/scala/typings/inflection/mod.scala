package typings.inflection

import typings.inflection.inflectionStrings.camelize
import typings.inflection.inflectionStrings.capitalize
import typings.inflection.inflectionStrings.classify
import typings.inflection.inflectionStrings.dasherize
import typings.inflection.inflectionStrings.demodulize
import typings.inflection.inflectionStrings.foreignKey
import typings.inflection.inflectionStrings.humanize
import typings.inflection.inflectionStrings.ordinalize
import typings.inflection.inflectionStrings.pluralize
import typings.inflection.inflectionStrings.singularize
import typings.inflection.inflectionStrings.tableize
import typings.inflection.inflectionStrings.titleize
import typings.inflection.inflectionStrings.underscore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inflection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def camelize(str: String, lowFirstLetter: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("camelize")(str.asInstanceOf[js.Any], lowFirstLetter.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def classify(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classify")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dasherize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dasherize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def demodulize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("demodulize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def foreignKey(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("foreignKey")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def foreignKey(str: String, dropIdUbar: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foreignKey")(str.asInstanceOf[js.Any], dropIdUbar.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def humanize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("humanize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def humanize(str: String, lowFirstLetter: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("humanize")(str.asInstanceOf[js.Any], lowFirstLetter.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def inflect(str: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inflect")(str.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def inflect(str: String, count: Double, singular: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inflect")(str.asInstanceOf[js.Any], count.asInstanceOf[js.Any], singular.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def inflect(str: String, count: Double, singular: String, plural: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inflect")(str.asInstanceOf[js.Any], count.asInstanceOf[js.Any], singular.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def inflect(str: String, count: Double, singular: Unit, plural: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inflect")(str.asInstanceOf[js.Any], count.asInstanceOf[js.Any], singular.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ordinalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ordinalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def pluralize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pluralize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def pluralize(str: String, plural: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pluralize")(str.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def singularize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("singularize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def singularize(str: String, singular: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("singularize")(str.asInstanceOf[js.Any], singular.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tableize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tableize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def titleize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("titleize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transform(
    str: String,
    arr: js.Array[
      /* keyof inflection.anon.Camelize */ pluralize | singularize | camelize | underscore | humanize | capitalize | dasherize | titleize | demodulize | tableize | classify | foreignKey | ordinalize
    ]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(str.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def underscore(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("underscore")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def underscore(str: String, allUpperCase: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("underscore")(str.asInstanceOf[js.Any], allUpperCase.asInstanceOf[js.Any])).asInstanceOf[String]
}

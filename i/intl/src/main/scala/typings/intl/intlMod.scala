package typings.intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Intl.CollatorOptions
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import typings.std.Intl.PluralRulesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl", JSImport.Namespace)
@js.native
object intlMod extends js.Object {
  @js.native
  class CollatorCls ()
    extends typings.std.Intl.CollatorCls {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: CollatorOptions) = this()
    def this(locales: js.Array[String], options: CollatorOptions) = this()
  }
  
  @js.native
  class DateTimeFormatCls ()
    extends typings.std.Intl.DateTimeFormatCls {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: DateTimeFormatOptions) = this()
    def this(locales: js.Array[String], options: DateTimeFormatOptions) = this()
  }
  
  @js.native
  class NumberFormatCls ()
    extends typings.std.Intl.NumberFormatCls {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: NumberFormatOptions) = this()
    def this(locales: js.Array[String], options: NumberFormatOptions) = this()
  }
  
  @js.native
  class PluralRulesCls ()
    extends typings.std.Intl.PluralRulesCls {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: PluralRulesOptions) = this()
    def this(locales: js.Array[String], options: PluralRulesOptions) = this()
  }
  
  @js.native
  object Collator
    extends Instantiable0[typings.std.Intl.Collator]
       with Instantiable2[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          /* options */ CollatorOptions, 
          typings.std.Intl.Collator
        ]
       with Instantiable1[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          typings.std.Intl.Collator
        ] {
    def apply(): typings.std.Intl.Collator = js.native
    def apply(locales: String): typings.std.Intl.Collator = js.native
    def apply(locales: String, options: CollatorOptions): typings.std.Intl.Collator = js.native
    def apply(locales: js.Array[String]): typings.std.Intl.Collator = js.native
    def apply(locales: js.Array[String], options: CollatorOptions): typings.std.Intl.Collator = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: CollatorOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: CollatorOptions): js.Array[String] = js.native
  }
  
  @js.native
  object DateTimeFormat
    extends Instantiable0[typings.std.Intl.DateTimeFormat]
       with Instantiable2[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          /* options */ DateTimeFormatOptions, 
          typings.std.Intl.DateTimeFormat
        ]
       with Instantiable1[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          typings.std.Intl.DateTimeFormat
        ] {
    def apply(): typings.std.Intl.DateTimeFormat = js.native
    def apply(locales: String): typings.std.Intl.DateTimeFormat = js.native
    def apply(locales: String, options: DateTimeFormatOptions): typings.std.Intl.DateTimeFormat = js.native
    def apply(locales: js.Array[String]): typings.std.Intl.DateTimeFormat = js.native
    def apply(locales: js.Array[String], options: DateTimeFormatOptions): typings.std.Intl.DateTimeFormat = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: DateTimeFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  object NumberFormat
    extends Instantiable0[typings.std.Intl.NumberFormat]
       with Instantiable2[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          /* options */ NumberFormatOptions, 
          typings.std.Intl.NumberFormat
        ]
       with Instantiable1[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          typings.std.Intl.NumberFormat
        ] {
    def apply(): typings.std.Intl.NumberFormat = js.native
    def apply(locales: String): typings.std.Intl.NumberFormat = js.native
    def apply(locales: String, options: NumberFormatOptions): typings.std.Intl.NumberFormat = js.native
    def apply(locales: js.Array[String]): typings.std.Intl.NumberFormat = js.native
    def apply(locales: js.Array[String], options: NumberFormatOptions): typings.std.Intl.NumberFormat = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: NumberFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: NumberFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  object PluralRules
    extends Instantiable0[typings.std.Intl.PluralRules]
       with Instantiable2[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          /* options */ PluralRulesOptions, 
          typings.std.Intl.PluralRules
        ]
       with Instantiable1[
          (/* locales */ js.Array[String]) | (/* locales */ String), 
          typings.std.Intl.PluralRules
        ] {
    def apply(): typings.std.Intl.PluralRules = js.native
    def apply(locales: String): typings.std.Intl.PluralRules = js.native
    def apply(locales: String, options: PluralRulesOptions): typings.std.Intl.PluralRules = js.native
    def apply(locales: js.Array[String]): typings.std.Intl.PluralRules = js.native
    def apply(locales: js.Array[String], options: PluralRulesOptions): typings.std.Intl.PluralRules = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: PluralRulesOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: PluralRulesOptions): js.Array[String] = js.native
  }
  
}


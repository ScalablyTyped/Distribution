package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a number affix resource.
  */
@js.native
trait SchemaGamesNumberAffixConfiguration extends js.Object {
  /**
    * When the language requires special treatment of &quot;small&quot; numbers
    * (as with 2, 3, and 4 in Czech; or numbers ending 2, 3, or 4 but not 12,
    * 13, or 14 in Polish).
    */
  var few: js.UndefOr[SchemaLocalizedStringBundle] = js.native
  /**
    * When the language requires special treatment of &quot;large&quot; numbers
    * (as with numbers ending 11-99 in Maltese).
    */
  var many: js.UndefOr[SchemaLocalizedStringBundle] = js.native
  /**
    * When the language requires special treatment of numbers like one (as with
    * the number 1 in English and most other languages; in Russian, any number
    * ending in 1 but not ending in 11 is in this class).
    */
  var one: js.UndefOr[SchemaLocalizedStringBundle] = js.native
  /**
    * When the language does not require special treatment of the given
    * quantity (as with all numbers in Chinese, or 42 in English).
    */
  var other: js.UndefOr[SchemaLocalizedStringBundle] = js.native
  /**
    * When the language requires special treatment of numbers like two (as with
    * 2 in Welsh, or 102 in Slovenian).
    */
  var two: js.UndefOr[SchemaLocalizedStringBundle] = js.native
  /**
    * When the language requires special treatment of the number 0 (as in
    * Arabic).
    */
  var zero: js.UndefOr[SchemaLocalizedStringBundle] = js.native
}

object SchemaGamesNumberAffixConfiguration {
  @scala.inline
  def apply(
    few: SchemaLocalizedStringBundle = null,
    many: SchemaLocalizedStringBundle = null,
    one: SchemaLocalizedStringBundle = null,
    other: SchemaLocalizedStringBundle = null,
    two: SchemaLocalizedStringBundle = null,
    zero: SchemaLocalizedStringBundle = null
  ): SchemaGamesNumberAffixConfiguration = {
    val __obj = js.Dynamic.literal()
    if (few != null) __obj.updateDynamic("few")(few.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGamesNumberAffixConfiguration]
  }
}


package typings.makePlural.pluralCategoriesMod

import typings.makePlural.makePluralStrings.few
import typings.makePlural.makePluralStrings.many
import typings.makePlural.makePluralStrings.one
import typings.makePlural.makePluralStrings.other
import typings.makePlural.makePluralStrings.two
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ga {
  
  @JSImport("make-plural/pluralCategories", "ga")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/pluralCategories", "ga.cardinal")
  @js.native
  def cardinal: js.Tuple5[one, two, few, many, other] = js.native
  inline def cardinal_=(x: js.Tuple5[one, two, few, many, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/pluralCategories", "ga.ordinal")
  @js.native
  def ordinal: js.Tuple2[one, other] = js.native
  inline def ordinal_=(x: js.Tuple2[one, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}

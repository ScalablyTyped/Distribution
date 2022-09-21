package typings.makePlural.pluralCategoriesMod

import typings.makePlural.makePluralStrings.few
import typings.makePlural.makePluralStrings.one
import typings.makePlural.makePluralStrings.other
import typings.makePlural.makePluralStrings.two
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gd {
  
  @JSImport("make-plural/pluralCategories", "gd")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/pluralCategories", "gd.cardinal")
  @js.native
  def cardinal: js.Tuple4[one, two, few, other] = js.native
  inline def cardinal_=(x: js.Tuple4[one, two, few, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/pluralCategories", "gd.ordinal")
  @js.native
  def ordinal: js.Tuple4[one, two, few, other] = js.native
  inline def ordinal_=(x: js.Tuple4[one, two, few, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}

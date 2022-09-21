package typings.makePlural.pluralCategoriesMod

import typings.makePlural.makePluralStrings.few
import typings.makePlural.makePluralStrings.many
import typings.makePlural.makePluralStrings.one
import typings.makePlural.makePluralStrings.other
import typings.makePlural.makePluralStrings.two
import typings.makePlural.makePluralStrings.zero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kw {
  
  @JSImport("make-plural/pluralCategories", "kw")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/pluralCategories", "kw.cardinal")
  @js.native
  def cardinal: js.Tuple6[zero, one, two, few, many, other] = js.native
  inline def cardinal_=(x: js.Tuple6[zero, one, two, few, many, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/pluralCategories", "kw.ordinal")
  @js.native
  def ordinal: js.Tuple3[one, many, other] = js.native
  inline def ordinal_=(x: js.Tuple3[one, many, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}

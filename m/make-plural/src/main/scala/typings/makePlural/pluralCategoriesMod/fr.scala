package typings.makePlural.pluralCategoriesMod

import typings.makePlural.makePluralStrings.many
import typings.makePlural.makePluralStrings.one
import typings.makePlural.makePluralStrings.other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fr {
  
  @JSImport("make-plural/pluralCategories", "fr")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/pluralCategories", "fr.cardinal")
  @js.native
  def cardinal: js.Tuple3[one, many, other] = js.native
  inline def cardinal_=(x: js.Tuple3[one, many, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/pluralCategories", "fr.ordinal")
  @js.native
  def ordinal: js.Tuple2[one, other] = js.native
  inline def ordinal_=(x: js.Tuple2[one, other]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
